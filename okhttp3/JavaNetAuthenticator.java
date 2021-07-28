package okhttp3;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import okhttp3.internal.annotations.EverythingIsNonNull;

@EverythingIsNonNull
public final class JavaNetAuthenticator implements Authenticator {
  private InetAddress getConnectToInetAddress(Proxy paramProxy, HttpUrl paramHttpUrl) {
    return (paramProxy != null && paramProxy.type() != Proxy.Type.DIRECT) ? ((InetSocketAddress)paramProxy.address()).getAddress() : InetAddress.getByName(paramHttpUrl.host());
  }
  
  public Request authenticate(Route paramRoute, Response paramResponse) {
    List<Challenge> list = paramResponse.challenges();
    Request request = paramResponse.request();
    HttpUrl httpUrl = request.url();
    int i = paramResponse.code();
    int j = 0;
    if (i == 407) {
      i = 1;
    } else {
      i = 0;
    } 
    Proxy proxy = paramRoute.proxy();
    int k = list.size();
    while (j < k) {
      Challenge challenge = list.get(j);
      if ("Basic".equalsIgnoreCase(challenge.scheme())) {
        String str1;
        InetAddress inetAddress;
        int m;
        String str2;
        String str3;
        String str4;
        URL uRL;
        Authenticator.RequestorType requestorType;
        if (i != 0) {
          InetSocketAddress inetSocketAddress = (InetSocketAddress)proxy.address();
          str1 = inetSocketAddress.getHostName();
          inetAddress = getConnectToInetAddress(proxy, httpUrl);
          m = inetSocketAddress.getPort();
          str2 = httpUrl.scheme();
          str3 = challenge.realm();
          str4 = challenge.scheme();
          uRL = httpUrl.url();
          requestorType = Authenticator.RequestorType.PROXY;
        } else {
          str1 = httpUrl.host();
          inetAddress = getConnectToInetAddress(proxy, httpUrl);
          m = httpUrl.port();
          str2 = httpUrl.scheme();
          str3 = challenge.realm();
          str4 = challenge.scheme();
          uRL = httpUrl.url();
          requestorType = Authenticator.RequestorType.SERVER;
        } 
        PasswordAuthentication passwordAuthentication = Authenticator.requestPasswordAuthentication(str1, inetAddress, m, str2, str3, str4, uRL, requestorType);
        if (passwordAuthentication != null) {
          String str5;
          String str6 = Credentials.basic(passwordAuthentication.getUserName(), new String(passwordAuthentication.getPassword()), challenge.charset());
          Request.Builder builder = request.newBuilder();
          if (i != 0) {
            str5 = "Proxy-Authorization";
          } else {
            str5 = "Authorization";
          } 
          return builder.header(str5, str6).build();
        } 
      } 
      j++;
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/JavaNetAuthenticator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */