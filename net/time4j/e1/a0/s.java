package net.time4j.e1.a0;

import java.text.ParsePosition;
import net.time4j.d1.q;

public class s {
  private ParsePosition a;
  
  private String b;
  
  private q<?> c;
  
  private boolean d;
  
  public s() {
    this(0);
  }
  
  public s(int paramInt) {
    if (paramInt >= 0) {
      this.a = new ParsePosition(paramInt);
      this.b = "";
      this.c = null;
      this.d = false;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Undefined: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void a() {
    this.a.setErrorIndex(-1);
    this.b = "";
  }
  
  public void a(int paramInt) {
    if (paramInt >= 0) {
      this.a.setIndex(paramInt);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Undefined position: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt, String paramString) {
    // Byte code:
    //   0: iload_1
    //   1: iflt -> 57
    //   4: aload_2
    //   5: ifnull -> 17
    //   8: aload_2
    //   9: astore_3
    //   10: aload_2
    //   11: invokevirtual isEmpty : ()Z
    //   14: ifeq -> 43
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore_2
    //   25: aload_2
    //   26: ldc 'Error occurred at position: '
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_2
    //   33: iload_1
    //   34: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_2
    //   39: invokevirtual toString : ()Ljava/lang/String;
    //   42: astore_3
    //   43: aload_0
    //   44: aload_3
    //   45: putfield b : Ljava/lang/String;
    //   48: aload_0
    //   49: getfield a : Ljava/text/ParsePosition;
    //   52: iload_1
    //   53: invokevirtual setErrorIndex : (I)V
    //   56: return
    //   57: new java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: astore_2
    //   65: aload_2
    //   66: ldc 'Undefined error index: '
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_2
    //   73: iload_1
    //   74: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: new java/lang/IllegalArgumentException
    //   81: dup
    //   82: aload_2
    //   83: invokevirtual toString : ()Ljava/lang/String;
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: athrow
  }
  
  void a(q<?> paramq) {
    this.c = paramq;
  }
  
  void b() {
    this.d = false;
  }
  
  public int c() {
    return this.a.getErrorIndex();
  }
  
  public String d() {
    return this.b;
  }
  
  ParsePosition e() {
    return this.a;
  }
  
  public int f() {
    return this.a.getIndex();
  }
  
  public q<?> g() {
    if (this.c == null)
      this.c = new v(0, false); 
    return this.c;
  }
  
  q<?> h() {
    return this.c;
  }
  
  public boolean i() {
    return (this.a.getErrorIndex() != -1);
  }
  
  boolean j() {
    return this.d;
  }
  
  public void k() {
    if (!i()) {
      this.b = "Warning state active.";
      this.a.setErrorIndex(f());
    } 
    this.d = true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("[position=");
    stringBuilder.append(f());
    stringBuilder.append(", error-index=");
    stringBuilder.append(c());
    stringBuilder.append(", error-message=\"");
    stringBuilder.append(this.b);
    stringBuilder.append('"');
    if (this.d)
      stringBuilder.append(", warning-active"); 
    if (this.c != null) {
      stringBuilder.append(", raw-values=");
      stringBuilder.append(this.c);
    } 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */