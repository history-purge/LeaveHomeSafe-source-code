package e.e.f;

public enum f {
  c((byte)1, 16, 12, 16),
  d((byte)2, 32, 12, 16);
  
  public final byte cipherId;
  
  public final int ivLength;
  
  public final int keyLength;
  
  public final int tagLength;
  
  f(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
    this.cipherId = paramByte;
    this.keyLength = paramInt1;
    this.ivLength = paramInt2;
    this.tagLength = paramInt3;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */