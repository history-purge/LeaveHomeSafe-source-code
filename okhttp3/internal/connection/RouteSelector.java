package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

public final class RouteSelector {
  private final Address address;
  
  private final Call call;
  
  private final EventListener eventListener;
  
  private List<InetSocketAddress> inetSocketAddresses = Collections.emptyList();
  
  private int nextProxyIndex;
  
  private final List<Route> postponedRoutes = new ArrayList<Route>();
  
  private List<Proxy> proxies = Collections.emptyList();
  
  private final RouteDatabase routeDatabase;
  
  public RouteSelector(Address paramAddress, RouteDatabase paramRouteDatabase, Call paramCall, EventListener paramEventListener) {
    this.address = paramAddress;
    this.routeDatabase = paramRouteDatabase;
    this.call = paramCall;
    this.eventListener = paramEventListener;
    resetNextProxy(paramAddress.url(), paramAddress.proxy());
  }
  
  static String getHostString(InetSocketAddress paramInetSocketAddress) {
    InetAddress inetAddress = paramInetSocketAddress.getAddress();
    return (inetAddress == null) ? paramInetSocketAddress.getHostName() : inetAddress.getHostAddress();
  }
  
  private boolean hasNextProxy() {
    return (this.nextProxyIndex < this.proxies.size());
  }
  
  private Proxy nextProxy() {
    if (hasNextProxy()) {
      List<Proxy> list = this.proxies;
      int i = this.nextProxyIndex;
      this.nextProxyIndex = i + 1;
      Proxy proxy = list.get(i);
      resetNextInetSocketAddress(proxy);
      return proxy;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No route to ");
    stringBuilder.append(this.address.url().host());
    stringBuilder.append("; exhausted proxy configurations: ");
    stringBuilder.append(this.proxies);
    throw new SocketException(stringBuilder.toString());
  }
  
  private void resetNextInetSocketAddress(Proxy paramProxy) {
    int i;
    String str;
    InetAddress inetAddress;
    this.inetSocketAddresses = new ArrayList<InetSocketAddress>();
    if (paramProxy.type() == Proxy.Type.DIRECT || paramProxy.type() == Proxy.Type.SOCKS) {
      str = this.address.url().host();
      i = this.address.url().port();
    } else {
      SocketAddress socketAddress = paramProxy.address();
      if (socketAddress instanceof InetSocketAddress) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
        str = getHostString(inetSocketAddress);
        i = inetSocketAddress.getPort();
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Proxy.address() is not an InetSocketAddress: ");
        stringBuilder.append(str.getClass());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    } 
    if (i >= 1 && i <= 65535) {
      if (stringBuilder.type() == Proxy.Type.SOCKS) {
        this.inetSocketAddresses.add(InetSocketAddress.createUnresolved(str, i));
        return;
      } 
      this.eventListener.dnsStart(this.call, str);
      List<InetAddress> list = this.address.dns().lookup(str);
      if (!list.isEmpty()) {
        this.eventListener.dnsEnd(this.call, str, list);
        int j = 0;
        int k = list.size();
        while (j < k) {
          inetAddress = list.get(j);
          this.inetSocketAddresses.add(new InetSocketAddress(inetAddress, i));
          j++;
        } 
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.address.dns());
      stringBuilder1.append(" returned no addresses for ");
      stringBuilder1.append((String)inetAddress);
      throw new UnknownHostException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No route to ");
    stringBuilder.append((String)inetAddress);
    stringBuilder.append(":");
    stringBuilder.append(i);
    stringBuilder.append("; port is out of range");
    SocketException socketException = new SocketException(stringBuilder.toString());
    throw socketException;
  }
  
  private void resetNextProxy(HttpUrl paramHttpUrl, Proxy paramProxy) {
    List<Proxy> list;
    if (paramProxy != null) {
      list = Collections.singletonList(paramProxy);
    } else {
      list = this.address.proxySelector().select(list.uri());
      if (list != null && !list.isEmpty()) {
        list = Util.immutableList(list);
      } else {
        list = Util.immutableList((Object[])new Proxy[] { Proxy.NO_PROXY });
      } 
    } 
    this.proxies = list;
    this.nextProxyIndex = 0;
  }
  
  public void connectFailed(Route paramRoute, IOException paramIOException) {
    if (paramRoute.proxy().type() != Proxy.Type.DIRECT && this.address.proxySelector() != null)
      this.address.proxySelector().connectFailed(this.address.url().uri(), paramRoute.proxy().address(), paramIOException); 
    this.routeDatabase.failed(paramRoute);
  }
  
  public boolean hasNext() {
    return (hasNextProxy() || !this.postponedRoutes.isEmpty());
  }
  
  public Selection next() {
    if (hasNext()) {
      ArrayList<Route> arrayList = new ArrayList();
      while (hasNextProxy()) {
        Proxy proxy = nextProxy();
        int i = 0;
        int j = this.inetSocketAddresses.size();
        while (i < j) {
          Route route = new Route(this.address, proxy, this.inetSocketAddresses.get(i));
          if (this.routeDatabase.shouldPostpone(route)) {
            this.postponedRoutes.add(route);
          } else {
            arrayList.add(route);
          } 
          i++;
        } 
        if (!arrayList.isEmpty())
          break; 
      } 
      if (arrayList.isEmpty()) {
        arrayList.addAll(this.postponedRoutes);
        this.postponedRoutes.clear();
      } 
      return new Selection(arrayList);
    } 
    NoSuchElementException noSuchElementException = new NoSuchElementException();
    throw noSuchElementException;
  }
  
  public static final class Selection {
    private int nextRouteIndex = 0;
    
    private final List<Route> routes;
    
    Selection(List<Route> param1List) {
      this.routes = param1List;
    }
    
    public List<Route> getAll() {
      return new ArrayList<Route>(this.routes);
    }
    
    public boolean hasNext() {
      return (this.nextRouteIndex < this.routes.size());
    }
    
    public Route next() {
      if (hasNext()) {
        List<Route> list = this.routes;
        int i = this.nextRouteIndex;
        this.nextRouteIndex = i + 1;
        return list.get(i);
      } 
      throw new NoSuchElementException();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/connection/RouteSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */