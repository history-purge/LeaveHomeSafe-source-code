package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b.a.o.b;
import b.g.m.e;

public class h extends Dialog implements e {
  private f c;
  
  private final e.a d = new a(this);
  
  public h(Context paramContext, int paramInt) {
    super(paramContext, a(paramContext, paramInt));
    f f1 = a();
    f1.d(a(paramContext, paramInt));
    f1.a((Bundle)null);
  }
  
  private static int a(Context paramContext, int paramInt) {
    int i = paramInt;
    if (paramInt == 0) {
      TypedValue typedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(b.a.a.dialogTheme, typedValue, true);
      i = typedValue.resourceId;
    } 
    return i;
  }
  
  public f a() {
    if (this.c == null)
      this.c = f.a(this, this); 
    return this.c;
  }
  
  public b a(b.a parama) {
    return null;
  }
  
  public void a(b paramb) {}
  
  public boolean a(int paramInt) {
    return a().b(paramInt);
  }
  
  boolean a(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    a().a(paramView, paramLayoutParams);
  }
  
  public void b(b paramb) {}
  
  public void dismiss() {
    super.dismiss();
    a().f();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return e.a(this.d, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt) {
    return a().a(paramInt);
  }
  
  public void invalidateOptionsMenu() {
    a().e();
  }
  
  protected void onCreate(Bundle paramBundle) {
    a().d();
    super.onCreate(paramBundle);
    a().a(paramBundle);
  }
  
  protected void onStop() {
    super.onStop();
    a().i();
  }
  
  public void setContentView(int paramInt) {
    a().c(paramInt);
  }
  
  public void setContentView(View paramView) {
    a().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    a().b(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt) {
    super.setTitle(paramInt);
    a().a(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    a().a(paramCharSequence);
  }
  
  class a implements e.a {
    a(h this$0) {}
    
    public boolean a(KeyEvent param1KeyEvent) {
      return this.c.a(param1KeyEvent);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */