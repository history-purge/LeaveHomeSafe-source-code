package b.p.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import b.g.m.v;

class a extends ImageView {
  private Animation.AnimationListener c;
  
  int d;
  
  a(Context paramContext, int paramInt) {
    super(paramContext);
    ShapeDrawable shapeDrawable;
    float f = (getContext().getResources().getDisplayMetrics()).density;
    int i = (int)(1.75F * f);
    int j = (int)(0.0F * f);
    this.d = (int)(3.5F * f);
    if (a()) {
      shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
      v.a((View)this, f * 4.0F);
    } else {
      shapeDrawable = new ShapeDrawable((Shape)new a(this, this.d));
      setLayerType(1, shapeDrawable.getPaint());
      shapeDrawable.getPaint().setShadowLayer(this.d, j, i, 503316480);
      i = this.d;
      setPadding(i, i, i, i);
    } 
    shapeDrawable.getPaint().setColor(paramInt);
    v.a((View)this, (Drawable)shapeDrawable);
  }
  
  private boolean a() {
    return (Build.VERSION.SDK_INT >= 21);
  }
  
  public void a(Animation.AnimationListener paramAnimationListener) {
    this.c = paramAnimationListener;
  }
  
  public void onAnimationEnd() {
    super.onAnimationEnd();
    Animation.AnimationListener animationListener = this.c;
    if (animationListener != null)
      animationListener.onAnimationEnd(getAnimation()); 
  }
  
  public void onAnimationStart() {
    super.onAnimationStart();
    Animation.AnimationListener animationListener = this.c;
    if (animationListener != null)
      animationListener.onAnimationStart(getAnimation()); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (!a())
      setMeasuredDimension(getMeasuredWidth() + this.d * 2, getMeasuredHeight() + this.d * 2); 
  }
  
  public void setBackgroundColor(int paramInt) {
    if (getBackground() instanceof ShapeDrawable)
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt); 
  }
  
  private class a extends OvalShape {
    private RadialGradient c;
    
    private Paint d = new Paint();
    
    a(a this$0, int param1Int) {
      this$0.d = param1Int;
      a((int)rect().width());
    }
    
    private void a(int param1Int) {
      float f1 = (param1Int / 2);
      float f2 = this.e.d;
      Shader.TileMode tileMode = Shader.TileMode.CLAMP;
      this.c = new RadialGradient(f1, f1, f2, new int[] { 1023410176, 0 }, null, tileMode);
      this.d.setShader((Shader)this.c);
    }
    
    public void draw(Canvas param1Canvas, Paint param1Paint) {
      int j = this.e.getWidth();
      int i = this.e.getHeight();
      j /= 2;
      float f1 = j;
      float f2 = (i / 2);
      param1Canvas.drawCircle(f1, f2, f1, this.d);
      param1Canvas.drawCircle(f1, f2, (j - this.e.d), param1Paint);
    }
    
    protected void onResize(float param1Float1, float param1Float2) {
      super.onResize(param1Float1, param1Float2);
      a((int)param1Float1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/p/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */