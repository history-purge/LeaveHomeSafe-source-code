package net.time4j.d1;

public class e0 extends r {
  private static final long serialVersionUID = -5638437652574160520L;
  
  e0(String paramString) {
    super(paramString);
  }
  
  e0(x<?> paramx, Object paramObject) {
    super(a(paramx, paramObject));
  }
  
  e0(x<?> paramx, p<?> paramp) {
    super(a(paramx, paramp));
  }
  
  private static String a(Object paramObject) {
    return (paramObject instanceof Enum) ? ((Enum)Enum.class.cast(paramObject)).name() : paramObject.toString();
  }
  
  private static String a(x<?> paramx, Object paramObject) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find any rule for chronological unit \"");
    stringBuilder.append(a(paramObject));
    stringBuilder.append("\" in: ");
    stringBuilder.append(paramx.e().getName());
    return stringBuilder.toString();
  }
  
  private static String a(x<?> paramx, p<?> paramp) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find any rule for chronological element \"");
    stringBuilder.append(paramp.name());
    stringBuilder.append("\" in: ");
    stringBuilder.append(paramx.e().getName());
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */