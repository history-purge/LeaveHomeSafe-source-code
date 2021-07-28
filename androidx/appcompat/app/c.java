package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class c extends h implements DialogInterface {
  final AlertController e = new AlertController(getContext(), this, getWindow());
  
  protected c(Context paramContext, int paramInt) {
    super(paramContext, a(paramContext, paramInt));
  }
  
  static int a(Context paramContext, int paramInt) {
    if ((paramInt >>> 24 & 0xFF) >= 1)
      return paramInt; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(b.a.a.alertDialogTheme, typedValue, true);
    return typedValue.resourceId;
  }
  
  public ListView b() {
    return this.e.a();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.e.b();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    return this.e.a(paramInt, paramKeyEvent) ? true : super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    return this.e.b(paramInt, paramKeyEvent) ? true : super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    this.e.b(paramCharSequence);
  }
  
  public static class a {
    private final AlertController.f a;
    
    private final int b;
    
    public a(Context param1Context) {
      this(param1Context, c.a(param1Context, 0));
    }
    
    public a(Context param1Context, int param1Int) {
      this.a = new AlertController.f((Context)new ContextThemeWrapper(param1Context, c.a(param1Context, param1Int)));
      this.b = param1Int;
    }
    
    public a a(DialogInterface.OnKeyListener param1OnKeyListener) {
      this.a.u = param1OnKeyListener;
      return this;
    }
    
    public a a(Drawable param1Drawable) {
      this.a.d = param1Drawable;
      return this;
    }
    
    public a a(View param1View) {
      this.a.g = param1View;
      return this;
    }
    
    public a a(ListAdapter param1ListAdapter, int param1Int, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.w = param1ListAdapter;
      f1.x = param1OnClickListener;
      f1.I = param1Int;
      f1.H = true;
      return this;
    }
    
    public a a(ListAdapter param1ListAdapter, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.w = param1ListAdapter;
      f1.x = param1OnClickListener;
      return this;
    }
    
    public a a(CharSequence param1CharSequence) {
      this.a.f = param1CharSequence;
      return this;
    }
    
    public a a(CharSequence param1CharSequence, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.l = param1CharSequence;
      f1.n = param1OnClickListener;
      return this;
    }
    
    public c a() {
      c c = new c(this.a.a, this.b);
      this.a.a(c.e);
      c.setCancelable(this.a.r);
      if (this.a.r)
        c.setCanceledOnTouchOutside(true); 
      c.setOnCancelListener(this.a.s);
      c.setOnDismissListener(this.a.t);
      DialogInterface.OnKeyListener onKeyListener = this.a.u;
      if (onKeyListener != null)
        c.setOnKeyListener(onKeyListener); 
      return c;
    }
    
    public Context b() {
      return this.a.a;
    }
    
    public a b(View param1View) {
      AlertController.f f1 = this.a;
      f1.z = param1View;
      f1.y = 0;
      f1.E = false;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */