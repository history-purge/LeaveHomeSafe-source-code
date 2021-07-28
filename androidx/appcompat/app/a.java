package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.j;

public abstract class a {
  public b.a.o.b a(b.a.o.b.a parama) {
    return null;
  }
  
  public void a(Configuration paramConfiguration) {}
  
  public abstract void a(Drawable paramDrawable);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  public boolean a(KeyEvent paramKeyEvent) {
    return false;
  }
  
  public abstract void b(CharSequence paramCharSequence);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void e(boolean paramBoolean);
  
  public boolean e() {
    return false;
  }
  
  public abstract boolean f();
  
  public abstract int g();
  
  public abstract Context h();
  
  public boolean i() {
    return false;
  }
  
  void j() {}
  
  public boolean k() {
    return false;
  }
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.ActionBarLayout);
      this.a = typedArray.getInt(j.ActionBarLayout_android_layout_gravity, 0);
      typedArray.recycle();
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public a(a param1a) {
      super(param1a);
      this.a = param1a.a;
    }
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
  
  @Deprecated
  public static abstract class c {
    public abstract CharSequence a();
    
    public abstract View b();
    
    public abstract Drawable c();
    
    public abstract CharSequence d();
    
    public abstract void e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */