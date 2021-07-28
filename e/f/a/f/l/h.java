package e.f.a.f.l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import b.d.g;
import java.util.ArrayList;
import java.util.List;

public class h {
  private final g<String, i> a = new g();
  
  private final g<String, PropertyValuesHolder[]> b = new g();
  
  public static h a(Context paramContext, int paramInt) {
    try {
      Animator animator = AnimatorInflater.loadAnimator(paramContext, paramInt);
      if (animator instanceof AnimatorSet)
        return a(((AnimatorSet)animator).getChildAnimations()); 
      if (animator != null) {
        ArrayList<Animator> arrayList = new ArrayList();
        arrayList.add(animator);
        return a(arrayList);
      } 
      return null;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Can't load animation resource ID #0x");
      stringBuilder.append(Integer.toHexString(paramInt));
      Log.w("MotionSpec", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  public static h a(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      paramInt = paramTypedArray.getResourceId(paramInt, 0);
      if (paramInt != 0)
        return a(paramContext, paramInt); 
    } 
    return null;
  }
  
  private static h a(List<Animator> paramList) {
    h h1 = new h();
    int j = paramList.size();
    for (int i = 0; i < j; i++)
      a(h1, paramList.get(i)); 
    return h1;
  }
  
  private static void a(h paramh, Animator paramAnimator) {
    ObjectAnimator objectAnimator;
    if (paramAnimator instanceof ObjectAnimator) {
      objectAnimator = (ObjectAnimator)paramAnimator;
      paramh.a(objectAnimator.getPropertyName(), objectAnimator.getValues());
      paramh.a(objectAnimator.getPropertyName(), i.a((ValueAnimator)objectAnimator));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animator must be an ObjectAnimator: ");
    stringBuilder.append(objectAnimator);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public long a() {
    int j = this.a.size();
    long l = 0L;
    for (int i = 0; i < j; i++) {
      i i1 = (i)this.a.d(i);
      l = Math.max(l, i1.a() + i1.b());
    } 
    return l;
  }
  
  public i a(String paramString) {
    if (b(paramString))
      return (i)this.a.get(paramString); 
    throw new IllegalArgumentException();
  }
  
  public void a(String paramString, i parami) {
    this.a.put(paramString, parami);
  }
  
  public void a(String paramString, PropertyValuesHolder[] paramArrayOfPropertyValuesHolder) {
    this.b.put(paramString, paramArrayOfPropertyValuesHolder);
  }
  
  public boolean b(String paramString) {
    return (this.a.get(paramString) != null);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof h))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((h)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('\n');
    stringBuilder.append(h.class.getName());
    stringBuilder.append('{');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" timings: ");
    stringBuilder.append(this.a);
    stringBuilder.append("}\n");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/l/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */