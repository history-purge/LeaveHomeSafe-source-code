package e.d.c.w;

import java.io.Serializable;

public class f implements Serializable {
  private static final long serialVersionUID = 61121257899091914L;
  
  private final int _componentId;
  
  private final int _quantizationTableNumber;
  
  private final int _samplingFactorByte;
  
  public f(int paramInt1, int paramInt2, int paramInt3) {
    this._componentId = paramInt1;
    this._samplingFactorByte = paramInt2;
    this._quantizationTableNumber = paramInt3;
  }
  
  public String a() {
    int i = this._componentId;
    return (i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 4) ? ((i != 5) ? String.format("Unknown (%s)", new Object[] { Integer.valueOf(i) }) : "Q") : "I") : "Cr") : "Cb") : "Y";
  }
  
  public int b() {
    return this._samplingFactorByte >> 4 & 0xF;
  }
  
  public int c() {
    return this._samplingFactorByte & 0xF;
  }
  
  public String toString() {
    return String.format("Quantization table %d, Sampling factors %d horiz/%d vert", new Object[] { Integer.valueOf(this._quantizationTableNumber), Integer.valueOf(b()), Integer.valueOf(c()) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */