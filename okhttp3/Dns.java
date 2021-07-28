package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface Dns {
  public static final Dns SYSTEM = new Dns() {
      public List<InetAddress> lookup(String param1String) {
        if (param1String != null)
          try {
            return Arrays.asList(InetAddress.getAllByName(param1String));
          } catch (NullPointerException nullPointerException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Broken system behaviour for dns lookup of ");
            stringBuilder.append(param1String);
            UnknownHostException unknownHostException = new UnknownHostException(stringBuilder.toString());
            unknownHostException.initCause(nullPointerException);
            throw unknownHostException;
          }  
        throw new UnknownHostException("hostname == null");
      }
    };
  
  List<InetAddress> lookup(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Dns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */