package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.e.b.k.e;
import b.e.b.k.h;
import java.util.Arrays;
import java.util.HashMap;

public abstract class c extends View {
  protected int[] c = new int[32];
  
  protected int d;
  
  protected Context e;
  
  protected h f;
  
  protected boolean g = false;
  
  protected String h;
  
  private HashMap<Integer, String> i = new HashMap<Integer, String>();
  
  public c(Context paramContext) {
    super(paramContext);
    this.e = paramContext;
    a((AttributeSet)null);
  }
  
  private int a(ConstraintLayout paramConstraintLayout, String paramString) {
    if (paramString != null) {
      if (paramConstraintLayout == null)
        return 0; 
      Resources resources = this.e.getResources();
      if (resources == null)
        return 0; 
      int j = paramConstraintLayout.getChildCount();
      int i = 0;
      while (true) {
        if (i < j) {
          View view = paramConstraintLayout.getChildAt(i);
          if (view.getId() != -1) {
            String str = null;
            try {
              String str1 = resources.getResourceEntryName(view.getId());
              str = str1;
            } catch (android.content.res.Resources.NotFoundException notFoundException) {}
            if (paramString.equals(str))
              return view.getId(); 
          } 
          i++;
          continue;
        } 
        return 0;
      } 
    } 
    return 0;
  }
  
  private void a(int paramInt) {
    if (paramInt == getId())
      return; 
    int i = this.d;
    int[] arrayOfInt = this.c;
    if (i + 1 > arrayOfInt.length)
      this.c = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2); 
    arrayOfInt = this.c;
    i = this.d;
    arrayOfInt[i] = paramInt;
    this.d = i + 1;
  }
  
  private void a(String paramString) {
    if (paramString != null) {
      if (paramString.length() == 0)
        return; 
      if (this.e == null)
        return; 
      paramString = paramString.trim();
      if (getParent() instanceof ConstraintLayout)
        ConstraintLayout constraintLayout = (ConstraintLayout)getParent(); 
      int i = b(paramString);
      if (i != 0) {
        this.i.put(Integer.valueOf(i), paramString);
        a(i);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not find id of \"");
      stringBuilder.append(paramString);
      stringBuilder.append("\"");
      Log.w("ConstraintHelper", stringBuilder.toString());
    } 
  }
  
  private int b(String paramString) {
    ConstraintLayout constraintLayout;
    if (getParent() instanceof ConstraintLayout) {
      constraintLayout = (ConstraintLayout)getParent();
    } else {
      constraintLayout = null;
    } 
    boolean bool = isInEditMode();
    int i = 0;
    int j = i;
    if (bool) {
      j = i;
      if (constraintLayout != null) {
        Object object = constraintLayout.a(0, paramString);
        j = i;
        if (object instanceof Integer)
          j = ((Integer)object).intValue(); 
      } 
    } 
    i = j;
    if (j == 0) {
      i = j;
      if (constraintLayout != null)
        i = a(constraintLayout, paramString); 
    } 
    j = i;
    if (i == 0)
      try {
        j = j.class.getField(paramString).getInt(null);
      } catch (Exception exception) {
        j = i;
      }  
    i = j;
    if (j == 0)
      i = this.e.getResources().getIdentifier(paramString, "id", this.e.getPackageName()); 
    return i;
  }
  
  protected void a() {
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ConstraintLayout)
      a((ConstraintLayout)viewParent); 
  }
  
  protected void a(AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.ConstraintLayout_Layout);
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        if (k == k.ConstraintLayout_Layout_constraint_referenced_ids) {
          this.h = typedArray.getString(k);
          setIds(this.h);
        } 
      } 
    } 
  }
  
  protected void a(ConstraintLayout paramConstraintLayout) {
    float f;
    int j = getVisibility();
    if (Build.VERSION.SDK_INT >= 21) {
      f = getElevation();
    } else {
      f = 0.0F;
    } 
    for (int i = 0; i < this.d; i++) {
      View view = paramConstraintLayout.a(this.c[i]);
      if (view != null) {
        view.setVisibility(j);
        if (f > 0.0F && Build.VERSION.SDK_INT >= 21)
          view.setTranslationZ(view.getTranslationZ() + f); 
      } 
    } 
  }
  
  public void a(e parame, boolean paramBoolean) {}
  
  public void b() {
    if (this.f == null)
      return; 
    ViewGroup.LayoutParams layoutParams = getLayoutParams();
    if (layoutParams instanceof ConstraintLayout.b)
      ((ConstraintLayout.b)layoutParams).m0 = (e)this.f; 
  }
  
  public void b(ConstraintLayout paramConstraintLayout) {}
  
  public void c(ConstraintLayout paramConstraintLayout) {}
  
  public void d(ConstraintLayout paramConstraintLayout) {}
  
  public void e(ConstraintLayout paramConstraintLayout) {
    if (isInEditMode())
      setIds(this.h); 
    h h1 = this.f;
    if (h1 == null)
      return; 
    h1.a();
    for (int i = 0; i < this.d; i++) {
      int j = this.c[i];
      View view2 = paramConstraintLayout.a(j);
      View view1 = view2;
      if (view2 == null) {
        String str = this.i.get(Integer.valueOf(j));
        j = a(paramConstraintLayout, str);
        view1 = view2;
        if (j != 0) {
          this.c[i] = j;
          this.i.put(Integer.valueOf(j), str);
          view1 = paramConstraintLayout.a(j);
        } 
      } 
      if (view1 != null)
        this.f.a(paramConstraintLayout.a(view1)); 
    } 
    this.f.a(paramConstraintLayout.e);
  }
  
  public int[] getReferencedIds() {
    return Arrays.copyOf(this.c, this.d);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    String str = this.h;
    if (str != null)
      setIds(str); 
  }
  
  public void onDraw(Canvas paramCanvas) {}
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.g) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    setMeasuredDimension(0, 0);
  }
  
  protected void setIds(String paramString) {
    this.h = paramString;
    if (paramString == null)
      return; 
    int i = 0;
    this.d = 0;
    while (true) {
      int j = paramString.indexOf(',', i);
      if (j == -1) {
        a(paramString.substring(i));
        return;
      } 
      a(paramString.substring(i, j));
      i = j + 1;
    } 
  }
  
  public void setReferencedIds(int[] paramArrayOfint) {
    this.h = null;
    int i = 0;
    this.d = 0;
    while (i < paramArrayOfint.length) {
      a(paramArrayOfint[i]);
      i++;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */