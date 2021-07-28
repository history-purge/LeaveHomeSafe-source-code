package okhttp3;

public interface Authenticator {
  public static final Authenticator NONE = new Authenticator() {
      public Request authenticate(Route param1Route, Response param1Response) {
        return null;
      }
    };
  
  Request authenticate(Route paramRoute, Response paramResponse);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Authenticator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */