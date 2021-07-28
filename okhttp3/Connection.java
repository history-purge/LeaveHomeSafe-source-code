package okhttp3;

import java.net.Socket;

public interface Connection {
  Handshake handshake();
  
  Protocol protocol();
  
  Route route();
  
  Socket socket();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Connection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */