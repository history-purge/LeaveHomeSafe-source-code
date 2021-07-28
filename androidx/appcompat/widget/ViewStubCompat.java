package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.a.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
  private int c = 0;
  
  private int d;
  
  private WeakReference<View> e;
  
  private LayoutInflater f;
  
  private a g;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ViewStubCompat, paramInt, 0);
    this.d = typedArray.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
    this.c = typedArray.getResourceId(j.ViewStubCompat_android_layout, 0);
    setId(typedArray.getResourceId(j.ViewStubCompat_android_id, -1));
    typedArray.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public View a() {
    ViewParent viewParent = getParent();
    if (viewParent instanceof ViewGroup) {
      if (this.c != 0) {
        ViewGroup viewGroup = (ViewGroup)viewParent;
        LayoutInflater layoutInflater = this.f;
        if (layoutInflater == null)
          layoutInflater = LayoutInflater.from(getContext()); 
        View view = layoutInflater.inflate(this.c, viewGroup, false);
        int i = this.d;
        if (i != -1)
          view.setId(i); 
        i = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
          viewGroup.addView(view, i, layoutParams);
        } else {
          viewGroup.addView(view, i);
        } 
        this.e = new WeakReference<View>(view);
        a a1 = this.g;
        if (a1 != null)
          a1.a(this, view); 
        return view;
      } 
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    } 
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {}
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId() {
    return this.d;
  }
  
  public LayoutInflater getLayoutInflater() {
    return this.f;
  }
  
  public int getLayoutResource() {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt) {
    this.d = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater) {
    this.f = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt) {
    this.c = paramInt;
  }
  
  public void setOnInflateListener(a parama) {
    this.g = parama;
  }
  
  public void setVisibility(int paramInt) {
    WeakReference<View> weakReference = this.e;
    if (weakReference != null) {
      View view = weakReference.get();
      if (view != null) {
        view.setVisibility(paramInt);
        return;
      } 
      throw new IllegalStateException("setVisibility called on un-referenced view");
    } 
    super.setVisibility(paramInt);
    if (paramInt == 0 || paramInt == 4)
      a(); 
  }
  
  public static interface a {
    void a(ViewStubCompat param1ViewStubCompat, View param1View);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/ViewStubCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */