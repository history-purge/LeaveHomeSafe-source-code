package e.e.f;

import e.e.f.i.a;

class a implements a {
  private final a a;
  
  private final f b;
  
  public a(a parama, f paramf) {
    this.a = parama;
    this.b = paramf;
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt, String paramString) {
    if (paramArrayOfbyte.length == paramInt)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(" should be ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" bytes long but is ");
    stringBuilder.append(paramArrayOfbyte.length);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public byte[] a() {
    byte[] arrayOfByte = this.a.a();
    a(arrayOfByte, this.b.ivLength, "IV");
    return arrayOfByte;
  }
  
  public byte[] b() {
    byte[] arrayOfByte = this.a.b();
    a(arrayOfByte, this.b.keyLength, "Key");
    return arrayOfByte;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */