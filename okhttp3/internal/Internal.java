package okhttp3.internal;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;

public abstract class Internal {
  public static Internal instance;
  
  public static void initializeInstanceForTests() {
    new OkHttpClient();
  }
  
  public abstract void addLenient(Headers.Builder paramBuilder, String paramString);
  
  public abstract void addLenient(Headers.Builder paramBuilder, String paramString1, String paramString2);
  
  public abstract void apply(ConnectionSpec paramConnectionSpec, SSLSocket paramSSLSocket, boolean paramBoolean);
  
  public abstract int code(Response.Builder paramBuilder);
  
  public abstract boolean connectionBecameIdle(ConnectionPool paramConnectionPool, RealConnection paramRealConnection);
  
  public abstract Socket deduplicate(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation);
  
  public abstract boolean equalsNonHost(Address paramAddress1, Address paramAddress2);
  
  public abstract RealConnection get(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation, Route paramRoute);
  
  public abstract boolean isInvalidHttpUrlHost(IllegalArgumentException paramIllegalArgumentException);
  
  public abstract Call newWebSocketCall(OkHttpClient paramOkHttpClient, Request paramRequest);
  
  public abstract void put(ConnectionPool paramConnectionPool, RealConnection paramRealConnection);
  
  public abstract RouteDatabase routeDatabase(ConnectionPool paramConnectionPool);
  
  public abstract void setCache(OkHttpClient.Builder paramBuilder, InternalCache paramInternalCache);
  
  public abstract StreamAllocation streamAllocation(Call paramCall);
  
  public abstract IOException timeoutExit(Call paramCall, IOException paramIOException);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/Internal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */