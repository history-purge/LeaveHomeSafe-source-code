package e.d.b;

import java.io.IOException;

public final class a extends IOException {
  private static final long serialVersionUID = 2911102837808946396L;
  
  public a(int paramInt1, int paramInt2, long paramLong) {
    super(a(paramInt1, paramInt2, paramLong));
  }
  
  public a(String paramString) {
    super(paramString);
  }
  
  private static String a(int paramInt1, int paramInt2, long paramLong) {
    return (paramInt1 < 0) ? String.format("Attempt to read from buffer using a negative index (%d)", new Object[] { Integer.valueOf(paramInt1) }) : ((paramInt2 < 0) ? String.format("Number of requested bytes cannot be negative (%d)", new Object[] { Integer.valueOf(paramInt2) }) : ((paramInt1 + paramInt2 - 1L > 2147483647L) ? String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) : String.format("Attempt to read from beyond end of underlying data source (requested index: %d, requested count: %d, max index: %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong - 1L) })));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */