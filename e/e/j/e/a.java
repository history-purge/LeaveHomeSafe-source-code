package e.e.j.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import e.e.e.d.i;

public class a extends Drawable implements Drawable.Callback, t, s {
  private t c;
  
  private final e d = new e();
  
  private final Drawable[] e;
  
  private final d[] f;
  
  private final Rect g = new Rect();
  
  private boolean h;
  
  private boolean i;
  
  private boolean j;
  
  public a(Drawable[] paramArrayOfDrawable) {
    int i = 0;
    this.h = false;
    this.i = false;
    this.j = false;
    i.a(paramArrayOfDrawable);
    this.e = paramArrayOfDrawable;
    while (true) {
      paramArrayOfDrawable = this.e;
      if (i < paramArrayOfDrawable.length) {
        f.a(paramArrayOfDrawable[i], this, this);
        i++;
        continue;
      } 
      this.f = new d[paramArrayOfDrawable.length];
      return;
    } 
  }
  
  private d c(int paramInt) {
    return new a(this, paramInt);
  }
  
  public int a() {
    return this.e.length;
  }
  
  public Drawable a(int paramInt) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt >= 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt < this.e.length) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    return this.e[paramInt];
  }
  
  public Drawable a(int paramInt, Drawable paramDrawable) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt >= 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt < this.e.length) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    Drawable drawable = this.e[paramInt];
    if (paramDrawable != drawable) {
      if (paramDrawable != null && this.j)
        paramDrawable.mutate(); 
      f.a(this.e[paramInt], null, null);
      f.a(paramDrawable, null, null);
      f.a(paramDrawable, this.d);
      f.a(paramDrawable, this);
      f.a(paramDrawable, this, this);
      this.i = false;
      this.e[paramInt] = paramDrawable;
      invalidateSelf();
    } 
    return drawable;
  }
  
  public void a(Matrix paramMatrix) {
    t t1 = this.c;
    if (t1 != null) {
      t1.a(paramMatrix);
      return;
    } 
    paramMatrix.reset();
  }
  
  public void a(RectF paramRectF) {
    t t1 = this.c;
    if (t1 != null) {
      t1.a(paramRectF);
      return;
    } 
    paramRectF.set(getBounds());
  }
  
  public void a(t paramt) {
    this.c = paramt;
  }
  
  public d b(int paramInt) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt >= 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt < this.f.length) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    d[] arrayOfD = this.f;
    if (arrayOfD[paramInt] == null)
      arrayOfD[paramInt] = c(paramInt); 
    return this.f[paramInt];
  }
  
  public void draw(Canvas paramCanvas) {
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.draw(paramCanvas); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  public int getIntrinsicHeight() {
    byte b = -1;
    int j = 0;
    int i = -1;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (j < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[j];
        int k = i;
        if (drawable != null)
          k = Math.max(i, drawable.getIntrinsicHeight()); 
        j++;
        i = k;
        continue;
      } 
      j = b;
      if (i > 0)
        j = i; 
      return j;
    } 
  }
  
  public int getIntrinsicWidth() {
    byte b = -1;
    int j = 0;
    int i = -1;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (j < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[j];
        int k = i;
        if (drawable != null)
          k = Math.max(i, drawable.getIntrinsicWidth()); 
        j++;
        i = k;
        continue;
      } 
      j = b;
      if (i > 0)
        j = i; 
      return j;
    } 
  }
  
  public int getOpacity() {
    if (this.e.length == 0)
      return -2; 
    int j = -1;
    int i = 1;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        int k = j;
        if (drawable != null)
          k = Drawable.resolveOpacity(j, drawable.getOpacity()); 
        i++;
        j = k;
        continue;
      } 
      return j;
    } 
  }
  
  public boolean getPadding(Rect paramRect) {
    int i = 0;
    paramRect.left = 0;
    paramRect.top = 0;
    paramRect.right = 0;
    paramRect.bottom = 0;
    Rect rect = this.g;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null) {
          drawable.getPadding(rect);
          paramRect.left = Math.max(paramRect.left, rect.left);
          paramRect.top = Math.max(paramRect.top, rect.top);
          paramRect.right = Math.max(paramRect.right, rect.right);
          paramRect.bottom = Math.max(paramRect.bottom, rect.bottom);
        } 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isStateful() {
    if (!this.i) {
      this.h = false;
      int i = 0;
      while (true) {
        Drawable[] arrayOfDrawable = this.e;
        int j = arrayOfDrawable.length;
        boolean bool = true;
        if (i < j) {
          Drawable drawable = arrayOfDrawable[i];
          boolean bool1 = this.h;
          if (drawable == null || !drawable.isStateful())
            bool = false; 
          this.h = bool1 | bool;
          i++;
          continue;
        } 
        this.i = true;
        break;
      } 
    } 
    return this.h;
  }
  
  public Drawable mutate() {
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.mutate(); 
        i++;
        continue;
      } 
      this.j = true;
      return this;
    } 
  }
  
  protected void onBoundsChange(Rect paramRect) {
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setBounds(paramRect); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  protected boolean onLevelChange(int paramInt) {
    int i = 0;
    boolean bool = false;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        boolean bool1 = bool;
        if (drawable != null) {
          bool1 = bool;
          if (drawable.setLevel(paramInt))
            bool1 = true; 
        } 
        i++;
        bool = bool1;
        continue;
      } 
      return bool;
    } 
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    int i = 0;
    boolean bool = false;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        boolean bool1 = bool;
        if (drawable != null) {
          bool1 = bool;
          if (drawable.setState(paramArrayOfint))
            bool1 = true; 
        } 
        i++;
        bool = bool1;
        continue;
      } 
      return bool;
    } 
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.d.a(paramInt);
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setAlpha(paramInt); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.d.a(paramColorFilter);
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setColorFilter(paramColorFilter); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  public void setDither(boolean paramBoolean) {
    this.d.a(paramBoolean);
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setDither(paramBoolean); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.d.b(paramBoolean);
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setFilterBitmap(paramBoolean); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  @TargetApi(21)
  public void setHotspot(float paramFloat1, float paramFloat2) {
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setHotspot(paramFloat1, paramFloat2); 
        i++;
        continue;
      } 
      break;
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    int i = 0;
    while (true) {
      Drawable[] arrayOfDrawable = this.e;
      if (i < arrayOfDrawable.length) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null)
          drawable.setVisible(paramBoolean1, paramBoolean2); 
        i++;
        continue;
      } 
      return bool;
    } 
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
  
  class a implements d {
    a(a this$0, int param1Int) {}
    
    public Drawable a() {
      return this.d.a(this.c);
    }
    
    public Drawable a(Drawable param1Drawable) {
      return this.d.a(this.c, param1Drawable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */