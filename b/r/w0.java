package b.r;

import android.view.View;

public abstract class w0 extends a0 {
  private static final String[] a = new String[] { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
  
  private static int a(d0 paramd0, int paramInt) {
    if (paramd0 == null)
      return -1; 
    int[] arrayOfInt = (int[])paramd0.a.get("android:visibilityPropagation:center");
    return (arrayOfInt == null) ? -1 : arrayOfInt[paramInt];
  }
  
  public void a(d0 paramd0) {
    View view = paramd0.b;
    Integer integer2 = (Integer)paramd0.a.get("android:visibility:visibility");
    Integer integer1 = integer2;
    if (integer2 == null)
      integer1 = Integer.valueOf(view.getVisibility()); 
    paramd0.a.put("android:visibilityPropagation:visibility", integer1);
    int[] arrayOfInt = new int[2];
    view.getLocationOnScreen(arrayOfInt);
    arrayOfInt[0] = arrayOfInt[0] + Math.round(view.getTranslationX());
    arrayOfInt[0] = arrayOfInt[0] + view.getWidth() / 2;
    arrayOfInt[1] = arrayOfInt[1] + Math.round(view.getTranslationY());
    arrayOfInt[1] = arrayOfInt[1] + view.getHeight() / 2;
    paramd0.a.put("android:visibilityPropagation:center", arrayOfInt);
  }
  
  public String[] a() {
    return a;
  }
  
  public int b(d0 paramd0) {
    if (paramd0 == null)
      return 8; 
    Integer integer = (Integer)paramd0.a.get("android:visibilityPropagation:visibility");
    return (integer == null) ? 8 : integer.intValue();
  }
  
  public int c(d0 paramd0) {
    return a(paramd0, 0);
  }
  
  public int d(d0 paramd0) {
    return a(paramd0, 1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */