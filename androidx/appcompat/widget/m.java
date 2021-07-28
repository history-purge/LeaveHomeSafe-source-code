package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.widget.l;
import b.a.a;
import b.g.m.u;

public class m extends ImageButton implements u, l {
  private final e c;
  
  private final n d;
  
  public m(Context paramContext) {
    this(paramContext, null);
  }
  
  public m(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.imageButtonStyle);
  }
  
  public m(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new e((View)this);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new n((ImageView)this);
    this.d.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.c;
    if (e1 != null)
      e1.a(); 
    n n1 = this.d;
    if (n1 != null)
      n1.a(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.c;
    return (e1 != null) ? e1.b() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.c;
    return (e1 != null) ? e1.c() : null;
  }
  
  public ColorStateList getSupportImageTintList() {
    n n1 = this.d;
    return (n1 != null) ? n1.b() : null;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    n n1 = this.d;
    return (n1 != null) ? n1.c() : null;
  }
  
  public boolean hasOverlappingRendering() {
    return (this.d.d() && super.hasOverlappingRendering());
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramInt); 
  }
  
  public void setImageBitmap(Bitmap paramBitmap) {
    super.setImageBitmap(paramBitmap);
    n n1 = this.d;
    if (n1 != null)
      n1.a(); 
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    super.setImageDrawable(paramDrawable);
    n n1 = this.d;
    if (n1 != null)
      n1.a(); 
  }
  
  public void setImageResource(int paramInt) {
    this.d.a(paramInt);
  }
  
  public void setImageURI(Uri paramUri) {
    super.setImageURI(paramUri);
    n n1 = this.d;
    if (n1 != null)
      n1.a(); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.c;
    if (e1 != null)
      e1.b(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramMode); 
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    n n1 = this.d;
    if (n1 != null)
      n1.a(paramColorStateList); 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    n n1 = this.d;
    if (n1 != null)
      n1.a(paramMode); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */