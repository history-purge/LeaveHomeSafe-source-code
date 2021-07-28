package b.r;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.g.m.v;
import java.util.ArrayList;

class l0 implements n0 {
  protected a a;
  
  l0(Context paramContext, ViewGroup paramViewGroup, View paramView) {
    this.a = new a(paramContext, paramViewGroup, paramView, this);
  }
  
  static l0 c(View paramView) {
    ViewGroup viewGroup = d(paramView);
    if (viewGroup != null) {
      int j = viewGroup.getChildCount();
      for (int i = 0; i < j; i++) {
        View view = viewGroup.getChildAt(i);
        if (view instanceof a)
          return ((a)view).f; 
      } 
      return new g0(viewGroup.getContext(), viewGroup, paramView);
    } 
    return null;
  }
  
  static ViewGroup d(View paramView) {
    while (paramView != null) {
      if (paramView.getId() == 16908290 && paramView instanceof ViewGroup)
        return (ViewGroup)paramView; 
      if (paramView.getParent() instanceof ViewGroup)
        ViewGroup viewGroup = (ViewGroup)paramView.getParent(); 
    } 
    return null;
  }
  
  public void a(Drawable paramDrawable) {
    this.a.a(paramDrawable);
  }
  
  public void b(Drawable paramDrawable) {
    this.a.b(paramDrawable);
  }
  
  static class a extends ViewGroup {
    ViewGroup c;
    
    View d;
    
    ArrayList<Drawable> e = null;
    
    l0 f;
    
    private boolean g;
    
    static {
      try {
        ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[] { int.class, int.class, Rect.class });
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        return;
      } 
    }
    
    a(Context param1Context, ViewGroup param1ViewGroup, View param1View, l0 param1l0) {
      super(param1Context);
      this.c = param1ViewGroup;
      this.d = param1View;
      setRight(param1ViewGroup.getWidth());
      setBottom(param1ViewGroup.getHeight());
      param1ViewGroup.addView((View)this);
      this.f = param1l0;
    }
    
    private void a() {
      if (!this.g)
        return; 
      throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }
    
    private void a(int[] param1ArrayOfint) {
      int[] arrayOfInt1 = new int[2];
      int[] arrayOfInt2 = new int[2];
      this.c.getLocationOnScreen(arrayOfInt1);
      this.d.getLocationOnScreen(arrayOfInt2);
      param1ArrayOfint[0] = arrayOfInt2[0] - arrayOfInt1[0];
      param1ArrayOfint[1] = arrayOfInt2[1] - arrayOfInt1[1];
    }
    
    private void b() {
      if (getChildCount() == 0) {
        ArrayList<Drawable> arrayList = this.e;
        if (arrayList == null || arrayList.size() == 0) {
          this.g = true;
          this.c.removeView((View)this);
        } 
      } 
    }
    
    public void a(Drawable param1Drawable) {
      a();
      if (this.e == null)
        this.e = new ArrayList<Drawable>(); 
      if (!this.e.contains(param1Drawable)) {
        this.e.add(param1Drawable);
        invalidate(param1Drawable.getBounds());
        param1Drawable.setCallback((Drawable.Callback)this);
      } 
    }
    
    public void a(View param1View) {
      a();
      if (param1View.getParent() instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)param1View.getParent();
        if (viewGroup != this.c && viewGroup.getParent() != null && v.G((View)viewGroup)) {
          int[] arrayOfInt1 = new int[2];
          int[] arrayOfInt2 = new int[2];
          viewGroup.getLocationOnScreen(arrayOfInt1);
          this.c.getLocationOnScreen(arrayOfInt2);
          v.d(param1View, arrayOfInt1[0] - arrayOfInt2[0]);
          v.e(param1View, arrayOfInt1[1] - arrayOfInt2[1]);
        } 
        viewGroup.removeView(param1View);
        if (param1View.getParent() != null)
          viewGroup.removeView(param1View); 
      } 
      addView(param1View);
    }
    
    public void b(Drawable param1Drawable) {
      ArrayList<Drawable> arrayList = this.e;
      if (arrayList != null) {
        arrayList.remove(param1Drawable);
        invalidate(param1Drawable.getBounds());
        param1Drawable.setCallback(null);
        b();
      } 
    }
    
    public void b(View param1View) {
      removeView(param1View);
      b();
    }
    
    protected void dispatchDraw(Canvas param1Canvas) {
      int i;
      int[] arrayOfInt1 = new int[2];
      int[] arrayOfInt2 = new int[2];
      this.c.getLocationOnScreen(arrayOfInt1);
      this.d.getLocationOnScreen(arrayOfInt2);
      int j = 0;
      param1Canvas.translate((arrayOfInt2[0] - arrayOfInt1[0]), (arrayOfInt2[1] - arrayOfInt1[1]));
      param1Canvas.clipRect(new Rect(0, 0, this.d.getWidth(), this.d.getHeight()));
      super.dispatchDraw(param1Canvas);
      ArrayList<Drawable> arrayList = this.e;
      if (arrayList == null) {
        i = 0;
      } else {
        i = arrayList.size();
      } 
      while (j < i) {
        ((Drawable)this.e.get(j)).draw(param1Canvas);
        j++;
      } 
    }
    
    public boolean dispatchTouchEvent(MotionEvent param1MotionEvent) {
      return false;
    }
    
    public ViewParent invalidateChildInParent(int[] param1ArrayOfint, Rect param1Rect) {
      if (this.c != null) {
        param1Rect.offset(param1ArrayOfint[0], param1ArrayOfint[1]);
        if (this.c instanceof ViewGroup) {
          param1ArrayOfint[0] = 0;
          param1ArrayOfint[1] = 0;
          int[] arrayOfInt = new int[2];
          a(arrayOfInt);
          param1Rect.offset(arrayOfInt[0], arrayOfInt[1]);
          return super.invalidateChildInParent(param1ArrayOfint, param1Rect);
        } 
        invalidate(param1Rect);
      } 
      return null;
    }
    
    public void invalidateDrawable(Drawable param1Drawable) {
      invalidate(param1Drawable.getBounds());
    }
    
    protected void onLayout(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    protected boolean verifyDrawable(Drawable param1Drawable) {
      if (!super.verifyDrawable(param1Drawable)) {
        ArrayList<Drawable> arrayList = this.e;
        if (arrayList == null || !arrayList.contains(param1Drawable))
          return false; 
      } 
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */