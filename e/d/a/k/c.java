package e.d.a.k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class c {
  private final HashMap<Byte, List<byte[]>> a = new HashMap<Byte, List<byte[]>>(10);
  
  private List<byte[]> b(byte paramByte) {
    if (this.a.containsKey(Byte.valueOf(paramByte)))
      return this.a.get(Byte.valueOf(paramByte)); 
    ArrayList<byte[]> arrayList = new ArrayList();
    this.a.put(Byte.valueOf(paramByte), (List<byte[]>)arrayList);
    return (List<byte[]>)arrayList;
  }
  
  private List<byte[]> c(byte paramByte) {
    return this.a.get(Byte.valueOf(paramByte));
  }
  
  public Iterable<byte[]> a(byte paramByte) {
    List<byte[]> list2 = c(paramByte);
    List<byte[]> list1 = list2;
    if (list2 == null)
      list1 = (List)new ArrayList<byte>(); 
    return (Iterable<byte[]>)list1;
  }
  
  public Iterable<byte[]> a(f paramf) {
    return a(paramf.byteValue);
  }
  
  public void a(byte paramByte, byte[] paramArrayOfbyte) {
    b(paramByte).add(paramArrayOfbyte);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */