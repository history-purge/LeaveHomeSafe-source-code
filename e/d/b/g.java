package e.d.b;

import java.io.PrintStream;
import java.io.PrintWriter;

public class g extends Exception {
  private static final long serialVersionUID = -9207883813472069925L;
  
  private final Throwable _innerException;
  
  public g(String paramString) {
    this(paramString, null);
  }
  
  public g(String paramString, Throwable paramThrowable) {
    super(paramString);
    this._innerException = paramThrowable;
  }
  
  public g(Throwable paramThrowable) {
    this(null, paramThrowable);
  }
  
  public void printStackTrace() {
    super.printStackTrace();
    if (this._innerException != null) {
      System.err.println("--- inner exception ---");
      this._innerException.printStackTrace();
    } 
  }
  
  public void printStackTrace(PrintStream paramPrintStream) {
    super.printStackTrace(paramPrintStream);
    if (this._innerException != null) {
      paramPrintStream.println("--- inner exception ---");
      this._innerException.printStackTrace(paramPrintStream);
    } 
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter) {
    super.printStackTrace(paramPrintWriter);
    if (this._innerException != null) {
      paramPrintWriter.println("--- inner exception ---");
      this._innerException.printStackTrace(paramPrintWriter);
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    if (this._innerException != null) {
      stringBuilder.append("\n");
      stringBuilder.append("--- inner exception ---");
      stringBuilder.append("\n");
      stringBuilder.append(this._innerException.toString());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */