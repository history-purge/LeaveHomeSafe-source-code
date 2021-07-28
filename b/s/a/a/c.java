package b.s.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import b.g.e.d.g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends h implements b {
  private b d;
  
  private Context e;
  
  private ArgbEvaluator f = null;
  
  final Drawable.Callback g = new a(this);
  
  c() {
    this(null, null, null);
  }
  
  private c(Context paramContext) {
    this(paramContext, null, null);
  }
  
  private c(Context paramContext, b paramb, Resources paramResources) {
    this.e = paramContext;
    if (paramb != null) {
      this.d = paramb;
      return;
    } 
    this.d = new b(paramContext, paramb, this.g, paramResources);
  }
  
  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    c c1 = new c(paramContext);
    c1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return c1;
  }
  
  private void a(Animator paramAnimator) {
    if (paramAnimator instanceof AnimatorSet) {
      ArrayList<Animator> arrayList = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (arrayList != null)
        for (int i = 0; i < arrayList.size(); i++)
          a(arrayList.get(i));  
    } 
    if (paramAnimator instanceof ObjectAnimator) {
      ObjectAnimator objectAnimator = (ObjectAnimator)paramAnimator;
      String str = objectAnimator.getPropertyName();
      if ("fillColor".equals(str) || "strokeColor".equals(str)) {
        if (this.f == null)
          this.f = new ArgbEvaluator(); 
        objectAnimator.setEvaluator((TypeEvaluator)this.f);
      } 
    } 
  }
  
  private void a(String paramString, Animator paramAnimator) {
    paramAnimator.setTarget(this.d.b.a(paramString));
    if (Build.VERSION.SDK_INT < 21)
      a(paramAnimator); 
    b b1 = this.d;
    if (b1.d == null) {
      b1.d = new ArrayList<Animator>();
      this.d.e = new b.d.a();
    } 
    this.d.d.add(paramAnimator);
    this.d.e.put(paramAnimator, paramString);
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    Drawable drawable = this.c;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, paramTheme); 
  }
  
  public boolean canApplyTheme() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.a(drawable) : false;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    this.d.b.draw(paramCanvas);
    if (this.d.c.isStarted())
      invalidateSelf(); 
  }
  
  public int getAlpha() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.c(drawable) : this.d.b.getAlpha();
  }
  
  public int getChangingConfigurations() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getChangingConfigurations() : (super.getChangingConfigurations() | this.d.a);
  }
  
  public ColorFilter getColorFilter() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.d(drawable) : this.d.b.getColorFilter();
  }
  
  public Drawable.ConstantState getConstantState() {
    Drawable drawable = this.c;
    return (drawable != null && Build.VERSION.SDK_INT >= 24) ? new c(drawable.getConstantState()) : null;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getIntrinsicHeight() : this.d.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getIntrinsicWidth() : this.d.b.getIntrinsicWidth();
  }
  
  public int getOpacity() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getOpacity() : this.d.b.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    while (i != 1 && (paramXmlPullParser.getDepth() >= j + 1 || i != 3)) {
      if (i == 2) {
        TypedArray typedArray;
        String str = paramXmlPullParser.getName();
        if ("animated-vector".equals(str)) {
          TypedArray typedArray1 = g.a(paramResources, paramTheme, paramAttributeSet, a.e);
          i = typedArray1.getResourceId(0, 0);
          typedArray = typedArray1;
          if (i != 0) {
            i i1 = i.a(paramResources, i, paramTheme);
            i1.a(false);
            i1.setCallback(this.g);
            i i2 = this.d.b;
            if (i2 != null)
              i2.setCallback(null); 
            this.d.b = i1;
            typedArray = typedArray1;
          } 
        } else if ("target".equals(typedArray)) {
          TypedArray typedArray1 = paramResources.obtainAttributes(paramAttributeSet, a.f);
          String str1 = typedArray1.getString(0);
          i = typedArray1.getResourceId(1, 0);
          typedArray = typedArray1;
          if (i != 0) {
            Context context = this.e;
            if (context != null) {
              a(str1, e.a(context, i));
              typedArray = typedArray1;
            } else {
              typedArray1.recycle();
              throw new IllegalStateException("Context can't be null when inflating animators");
            } 
          } 
        } else {
          continue;
        } 
        typedArray.recycle();
      } 
      continue;
      i = paramXmlPullParser.next();
    } 
    this.d.a();
  }
  
  public boolean isAutoMirrored() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.f(drawable) : this.d.b.isAutoMirrored();
  }
  
  public boolean isRunning() {
    Drawable drawable = this.c;
    return (drawable != null) ? ((AnimatedVectorDrawable)drawable).isRunning() : this.d.c.isRunning();
  }
  
  public boolean isStateful() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.isStateful() : this.d.b.isStateful();
  }
  
  public Drawable mutate() {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.mutate(); 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.setBounds(paramRect);
      return;
    } 
    this.d.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.setLevel(paramInt) : this.d.b.setLevel(paramInt);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : this.d.b.setState(paramArrayOfint);
  }
  
  public void setAlpha(int paramInt) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    this.d.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramBoolean);
      return;
    } 
    this.d.b.setAutoMirrored(paramBoolean);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.d.b.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.b(drawable, paramInt);
      return;
    } 
    this.d.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramColorStateList);
      return;
    } 
    this.d.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramMode);
      return;
    } 
    this.d.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.c;
    if (drawable != null)
      return drawable.setVisible(paramBoolean1, paramBoolean2); 
    this.d.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start() {
    Drawable drawable = this.c;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).start();
      return;
    } 
    if (this.d.c.isStarted())
      return; 
    this.d.c.start();
    invalidateSelf();
  }
  
  public void stop() {
    Drawable drawable = this.c;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).stop();
      return;
    } 
    this.d.c.end();
  }
  
  class a implements Drawable.Callback {
    a(c this$0) {}
    
    public void invalidateDrawable(Drawable param1Drawable) {
      this.c.invalidateSelf();
    }
    
    public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) {
      this.c.scheduleSelf(param1Runnable, param1Long);
    }
    
    public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) {
      this.c.unscheduleSelf(param1Runnable);
    }
  }
  
  private static class b extends Drawable.ConstantState {
    int a;
    
    i b;
    
    AnimatorSet c;
    
    ArrayList<Animator> d;
    
    b.d.a<Animator, String> e;
    
    public b(Context param1Context, b param1b, Drawable.Callback param1Callback, Resources param1Resources) {
      if (param1b != null) {
        this.a = param1b.a;
        i i1 = param1b.b;
        int j = 0;
        if (i1 != null) {
          Drawable.ConstantState constantState = i1.getConstantState();
          if (param1Resources != null) {
            drawable = constantState.newDrawable(param1Resources);
          } else {
            drawable = drawable.newDrawable();
          } 
          this.b = (i)drawable;
          Drawable drawable = this.b;
          drawable.mutate();
          this.b = (i)drawable;
          this.b.setCallback(param1Callback);
          this.b.setBounds(param1b.b.getBounds());
          this.b.a(false);
        } 
        ArrayList<Animator> arrayList = param1b.d;
        if (arrayList != null) {
          int k = arrayList.size();
          this.d = new ArrayList<Animator>(k);
          this.e = new b.d.a(k);
          while (j < k) {
            Animator animator2 = param1b.d.get(j);
            Animator animator1 = animator2.clone();
            String str = (String)param1b.e.get(animator2);
            animator1.setTarget(this.b.a(str));
            this.d.add(animator1);
            this.e.put(animator1, str);
            j++;
          } 
          a();
        } 
      } 
    }
    
    public void a() {
      if (this.c == null)
        this.c = new AnimatorSet(); 
      this.c.playTogether(this.d);
    }
    
    public int getChangingConfigurations() {
      return this.a;
    }
    
    public Drawable newDrawable() {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  private static class c extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    
    public c(Drawable.ConstantState param1ConstantState) {
      this.a = param1ConstantState;
    }
    
    public boolean canApplyTheme() {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable() {
      c c1 = new c();
      c1.c = this.a.newDrawable();
      c1.c.setCallback(c1.g);
      return c1;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      c c1 = new c();
      c1.c = this.a.newDrawable(param1Resources);
      c1.c.setCallback(c1.g);
      return c1;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      c c1 = new c();
      c1.c = this.a.newDrawable(param1Resources, param1Theme);
      c1.c.setCallback(c1.g);
      return c1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/s/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */