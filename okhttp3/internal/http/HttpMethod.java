package okhttp3.internal.http;

public final class HttpMethod {
  public static boolean invalidatesCache(String paramString) {
    return (paramString.equals("POST") || paramString.equals("PATCH") || paramString.equals("PUT") || paramString.equals("DELETE") || paramString.equals("MOVE"));
  }
  
  public static boolean permitsRequestBody(String paramString) {
    return (!paramString.equals("GET") && !paramString.equals("HEAD"));
  }
  
  public static boolean redirectsToGet(String paramString) {
    return paramString.equals("PROPFIND") ^ true;
  }
  
  public static boolean redirectsWithBody(String paramString) {
    return paramString.equals("PROPFIND");
  }
  
  public static boolean requiresRequestBody(String paramString) {
    return (paramString.equals("POST") || paramString.equals("PUT") || paramString.equals("PATCH") || paramString.equals("PROPPATCH") || paramString.equals("REPORT"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/HttpMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */