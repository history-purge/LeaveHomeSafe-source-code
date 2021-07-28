package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import e.f.a.f.x.d;
import java.lang.ref.WeakReference;

public class f {
  private final TextPaint a = new TextPaint(1);
  
  private final e.f.a.f.x.f b = new a(this);
  
  private float c;
  
  private boolean d = true;
  
  private WeakReference<b> e = new WeakReference<b>(null);
  
  private d f;
  
  public f(b paramb) {
    a(paramb);
  }
  
  private float a(CharSequence paramCharSequence) {
    return (paramCharSequence == null) ? 0.0F : this.a.measureText(paramCharSequence, 0, paramCharSequence.length());
  }
  
  public float a(String paramString) {
    if (!this.d)
      return this.c; 
    this.c = a(paramString);
    this.d = false;
    return this.c;
  }
  
  public d a() {
    return this.f;
  }
  
  public void a(Context paramContext) {
    this.f.b(paramContext, this.a, this.b);
  }
  
  public void a(b paramb) {
    this.e = new WeakReference<b>(paramb);
  }
  
  public void a(d paramd, Context paramContext) {
    if (this.f != paramd) {
      this.f = paramd;
      if (paramd != null) {
        paramd.c(paramContext, this.a, this.b);
        b b1 = this.e.get();
        if (b1 != null)
          this.a.drawableState = b1.getState(); 
        paramd.b(paramContext, this.a, this.b);
        this.d = true;
      } 
      b b = this.e.get();
      if (b != null) {
        b.a();
        b.onStateChange(b.getState());
      } 
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public TextPaint b() {
    return this.a;
  }
  
  class a extends e.f.a.f.x.f {
    a(f this$0) {}
    
    public void a(int param1Int) {
      f.a(this.a, true);
      f.b b = f.a(this.a).get();
      if (b != null)
        b.a(); 
    }
    
    public void a(Typeface param1Typeface, boolean param1Boolean) {
      if (param1Boolean)
        return; 
      f.a(this.a, true);
      f.b b = f.a(this.a).get();
      if (b != null)
        b.a(); 
    }
  }
  
  public static interface b {
    void a();
    
    int[] getState();
    
    boolean onStateChange(int[] param1ArrayOfint);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */