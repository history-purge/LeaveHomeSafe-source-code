package e.f.a.f.y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.b;
import e.f.a.f.a0.g;
import e.f.a.f.a0.k;
import e.f.a.f.a0.n;

public class a extends Drawable implements n, b {
  private b c;
  
  public a(k paramk) {
    this(new b(new g(paramk)));
  }
  
  private a(b paramb) {
    this.c = paramb;
  }
  
  public void draw(Canvas paramCanvas) {
    b b1 = this.c;
    if (b1.b)
      b1.a.draw(paramCanvas); 
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.c;
  }
  
  public int getOpacity() {
    return this.c.a.getOpacity();
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public a mutate() {
    this.c = new b(this.c);
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.c.a.setBounds(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool1 = super.onStateChange(paramArrayOfint);
    if (this.c.a.setState(paramArrayOfint))
      bool1 = true; 
    boolean bool2 = b.a(paramArrayOfint);
    b b1 = this.c;
    if (b1.b != bool2) {
      b1.b = bool2;
      bool1 = true;
    } 
    return bool1;
  }
  
  public void setAlpha(int paramInt) {
    this.c.a.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.c.a.setColorFilter(paramColorFilter);
  }
  
  public void setShapeAppearanceModel(k paramk) {
    this.c.a.setShapeAppearanceModel(paramk);
  }
  
  public void setTint(int paramInt) {
    this.c.a.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.c.a.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.c.a.setTintMode(paramMode);
  }
  
  static final class b extends Drawable.ConstantState {
    g a;
    
    boolean b;
    
    public b(g param1g) {
      this.a = param1g;
      this.b = false;
    }
    
    public b(b param1b) {
      this.a = (g)param1b.a.getConstantState().newDrawable();
      this.b = param1b.b;
    }
    
    public int getChangingConfigurations() {
      return 0;
    }
    
    public a newDrawable() {
      return new a(new b(this), null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/y/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */