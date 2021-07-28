package e.d.c.w;

import e.d.c.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class b extends b {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  protected final List<a> e = new ArrayList<a>(4);
  
  static {
    f.put(Integer.valueOf(1), "Number of Tables");
  }
  
  public b() {
    a(new a(this));
  }
  
  public String a() {
    return "Huffman";
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
  
  protected List<a> f() {
    return this.e;
  }
  
  public static class a {
    private final byte[] a;
    
    public a(a param1a, int param1Int, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      if (param1ArrayOfbyte1 != null) {
        if (param1ArrayOfbyte2 != null) {
          this.a = param1ArrayOfbyte2;
          param1Int = this.a.length;
          return;
        } 
        throw new IllegalArgumentException("valueBytes cannot be null.");
      } 
      throw new IllegalArgumentException("lengthBytes cannot be null.");
    }
    
    public enum a {
      c, d, e;
      
      public static a f(int param2Int) {
        return (param2Int != 0) ? ((param2Int != 1) ? e : d) : c;
      }
    }
  }
  
  public enum a {
    c, d, e;
    
    public static a f(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? e : d) : c;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */