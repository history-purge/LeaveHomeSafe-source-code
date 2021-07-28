package e.f.a.c.i;

import java.util.Arrays;

final class d extends n {
  private final String a;
  
  private final byte[] b;
  
  private final e.f.a.c.d c;
  
  private d(String paramString, byte[] paramArrayOfbyte, e.f.a.c.d paramd) {
    this.a = paramString;
    this.b = paramArrayOfbyte;
    this.c = paramd;
  }
  
  public String a() {
    return this.a;
  }
  
  public byte[] b() {
    return this.b;
  }
  
  public e.f.a.c.d c() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof n) {
      n n1 = (n)paramObject;
      if (this.a.equals(n1.a())) {
        byte[] arrayOfByte = this.b;
        if (n1 instanceof d) {
          paramObject = ((d)n1).b;
        } else {
          paramObject = n1.b();
        } 
        if (Arrays.equals(arrayOfByte, (byte[])paramObject) && this.c.equals(n1.c()))
          return true; 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
  }
  
  static final class b extends n.a {
    private String a;
    
    private byte[] b;
    
    private e.f.a.c.d c;
    
    public n.a a(e.f.a.c.d param1d) {
      if (param1d != null) {
        this.c = param1d;
        return this;
      } 
      throw new NullPointerException("Null priority");
    }
    
    public n.a a(String param1String) {
      if (param1String != null) {
        this.a = param1String;
        return this;
      } 
      throw new NullPointerException("Null backendName");
    }
    
    public n.a a(byte[] param1ArrayOfbyte) {
      this.b = param1ArrayOfbyte;
      return this;
    }
    
    public n a() {
      String str2 = this.a;
      String str1 = "";
      if (str2 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" backendName");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" priority");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new d(this.a, this.b, this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */