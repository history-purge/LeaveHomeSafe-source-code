package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;
import b.g.m.e0.c;
import b.g.m.v;

public class CheckableImageButton extends m implements Checkable {
  private static final int[] h = new int[] { 16842912 };
  
  private boolean e;
  
  private boolean f = true;
  
  private boolean g = true;
  
  public CheckableImageButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.imageButtonStyle);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    v.a((View)this, new a(this));
  }
  
  public boolean a() {
    return this.f;
  }
  
  public boolean isChecked() {
    return this.e;
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    return this.e ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(paramInt + h.length), h) : super.onCreateDrawableState(paramInt);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof b)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    b b = (b)paramParcelable;
    super.onRestoreInstanceState(b.e());
    setChecked(b.e);
  }
  
  protected Parcelable onSaveInstanceState() {
    b b = new b(super.onSaveInstanceState());
    b.e = this.e;
    return (Parcelable)b;
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (this.f != paramBoolean) {
      this.f = paramBoolean;
      sendAccessibilityEvent(0);
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.f && this.e != paramBoolean) {
      this.e = paramBoolean;
      refreshDrawableState();
      sendAccessibilityEvent(2048);
    } 
  }
  
  public void setPressable(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public void setPressed(boolean paramBoolean) {
    if (this.g)
      super.setPressed(paramBoolean); 
  }
  
  public void toggle() {
    setChecked(this.e ^ true);
  }
  
  class a extends b.g.m.a {
    a(CheckableImageButton this$0) {}
    
    public void a(View param1View, c param1c) {
      super.a(param1View, param1c);
      param1c.b(this.d.a());
      param1c.c(this.d.isChecked());
    }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.b(param1View, param1AccessibilityEvent);
      param1AccessibilityEvent.setChecked(this.d.isChecked());
    }
  }
  
  static class b extends b.i.a.a {
    public static final Parcelable.Creator<b> CREATOR = (Parcelable.Creator<b>)new a();
    
    boolean e;
    
    public b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      a(param1Parcel);
    }
    
    public b(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    private void a(Parcel param1Parcel) {
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.e = bool;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<b> {
      public CheckableImageButton.b createFromParcel(Parcel param2Parcel) {
        return new CheckableImageButton.b(param2Parcel, null);
      }
      
      public CheckableImageButton.b createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new CheckableImageButton.b(param2Parcel, param2ClassLoader);
      }
      
      public CheckableImageButton.b[] newArray(int param2Int) {
        return new CheckableImageButton.b[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<b> {
    public CheckableImageButton.b createFromParcel(Parcel param1Parcel) {
      return new CheckableImageButton.b(param1Parcel, null);
    }
    
    public CheckableImageButton.b createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new CheckableImageButton.b(param1Parcel, param1ClassLoader);
    }
    
    public CheckableImageButton.b[] newArray(int param1Int) {
      return new CheckableImageButton.b[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/CheckableImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */