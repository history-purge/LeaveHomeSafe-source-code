package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b.l.c;
import java.util.ArrayList;

public final class h extends FrameLayout {
  private ArrayList<View> c;
  
  private ArrayList<View> d;
  
  private boolean e = true;
  
  h(Context paramContext, AttributeSet paramAttributeSet, n paramn) {
    super(paramContext, paramAttributeSet);
    String str2 = paramAttributeSet.getClassAttribute();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c.FragmentContainerView);
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(c.FragmentContainerView_android_name); 
    str2 = typedArray.getString(c.FragmentContainerView_android_tag);
    typedArray.recycle();
    int i = getId();
    Fragment fragment = paramn.a(i);
    if (str1 != null && fragment == null) {
      String str;
      StringBuilder stringBuilder;
      if (i <= 0) {
        if (str2 != null) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(" with tag ");
          stringBuilder1.append(str2);
          str = stringBuilder1.toString();
        } else {
          str = "";
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentContainerView must have an android:id to add Fragment ");
        stringBuilder.append(str1);
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      Fragment fragment1 = paramn.s().a(str.getClassLoader(), str1);
      fragment1.a((Context)str, (AttributeSet)stringBuilder, (Bundle)null);
      x x = paramn.b();
      x.a(true);
      x.a((ViewGroup)this, fragment1, str2);
      x.d();
    } 
    paramn.a(this);
  }
  
  private void a(View paramView) {
    ArrayList<View> arrayList = this.d;
    if (arrayList != null && arrayList.contains(paramView)) {
      if (this.c == null)
        this.c = new ArrayList<View>(); 
      this.c.add(paramView);
    } 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (n.a(paramView) != null) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not associated with a Fragment.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean) {
    if (n.a(paramView) != null)
      return super.addViewInLayout(paramView, paramInt, paramLayoutParams, paramBoolean); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not associated with a Fragment.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    if (this.e && this.c != null)
      for (int i = 0; i < this.c.size(); i++)
        super.drawChild(paramCanvas, this.c.get(i), getDrawingTime());  
    super.dispatchDraw(paramCanvas);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    if (this.e) {
      ArrayList<View> arrayList = this.c;
      if (arrayList != null && arrayList.size() > 0 && this.c.contains(paramView))
        return false; 
    } 
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void endViewTransition(View paramView) {
    ArrayList<View> arrayList = this.d;
    if (arrayList != null) {
      arrayList.remove(paramView);
      arrayList = this.c;
      if (arrayList != null && arrayList.remove(paramView))
        this.e = true; 
    } 
    super.endViewTransition(paramView);
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    for (int i = 0; i < getChildCount(); i++)
      getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(paramWindowInsets)); 
    return paramWindowInsets;
  }
  
  public void removeAllViewsInLayout() {
    for (int i = getChildCount() - 1; i >= 0; i--)
      a(getChildAt(i)); 
    super.removeAllViewsInLayout();
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean) {
    if (paramBoolean)
      a(paramView); 
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public void removeView(View paramView) {
    a(paramView);
    super.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt) {
    a(getChildAt(paramInt));
    super.removeViewAt(paramInt);
  }
  
  public void removeViewInLayout(View paramView) {
    a(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public void removeViews(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
      a(getChildAt(i)); 
    super.removeViews(paramInt1, paramInt2);
  }
  
  public void removeViewsInLayout(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
      a(getChildAt(i)); 
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  void setDrawDisappearingViewsLast(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition) {
    if (Build.VERSION.SDK_INT < 18) {
      super.setLayoutTransition(paramLayoutTransition);
      return;
    } 
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void startViewTransition(View paramView) {
    if (paramView.getParent() == this) {
      if (this.d == null)
        this.d = new ArrayList<View>(); 
      this.d.add(paramView);
    } 
    super.startViewTransition(paramView);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */