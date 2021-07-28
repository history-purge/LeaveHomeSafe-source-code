package b.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

class d implements f {
  final RectF a = new RectF();
  
  private h j(e parame) {
    return (h)parame.d();
  }
  
  public float a(e parame) {
    return j(parame).c();
  }
  
  public void a() {
    h.r = new a(this);
  }
  
  public void a(e parame, float paramFloat) {
    j(parame).a(paramFloat);
    i(parame);
  }
  
  public void a(e parame, ColorStateList paramColorStateList) {
    j(parame).a(paramColorStateList);
  }
  
  public ColorStateList b(e parame) {
    return j(parame).a();
  }
  
  public void b(e parame, float paramFloat) {
    j(parame).c(paramFloat);
  }
  
  public float c(e parame) {
    return j(parame).f();
  }
  
  public void c(e parame, float paramFloat) {
    j(parame).b(paramFloat);
    i(parame);
  }
  
  public float d(e parame) {
    return j(parame).b();
  }
  
  public float e(e parame) {
    return j(parame).d();
  }
  
  public float f(e parame) {
    return j(parame).e();
  }
  
  public void g(e parame) {}
  
  public void h(e parame) {
    j(parame).a(parame.b());
    i(parame);
  }
  
  public void i(e parame) {
    Rect rect = new Rect();
    j(parame).a(rect);
    parame.a((int)Math.ceil(f(parame)), (int)Math.ceil(e(parame)));
    parame.a(rect.left, rect.top, rect.right, rect.bottom);
  }
  
  class a implements h.a {
    a(d this$0) {}
    
    public void a(Canvas param1Canvas, RectF param1RectF, float param1Float, Paint param1Paint) {
      float f1 = 2.0F * param1Float;
      float f2 = param1RectF.width() - f1 - 1.0F;
      float f3 = param1RectF.height();
      if (param1Float >= 1.0F) {
        float f4 = param1Float + 0.5F;
        RectF rectF = this.a.a;
        float f5 = -f4;
        rectF.set(f5, f5, f4, f4);
        int i = param1Canvas.save();
        param1Canvas.translate(param1RectF.left + f4, param1RectF.top + f4);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.translate(f2, 0.0F);
        param1Canvas.rotate(90.0F);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.translate(f3 - f1 - 1.0F, 0.0F);
        param1Canvas.rotate(90.0F);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.translate(f2, 0.0F);
        param1Canvas.rotate(90.0F);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.restoreToCount(i);
        f1 = param1RectF.left;
        f2 = param1RectF.top;
        param1Canvas.drawRect(f1 + f4 - 1.0F, f2, param1RectF.right - f4 + 1.0F, f2 + f4, param1Paint);
        f1 = param1RectF.left;
        f2 = param1RectF.bottom;
        param1Canvas.drawRect(f1 + f4 - 1.0F, f2 - f4, param1RectF.right - f4 + 1.0F, f2, param1Paint);
      } 
      param1Canvas.drawRect(param1RectF.left, param1RectF.top + param1Float, param1RectF.right, param1RectF.bottom - param1Float, param1Paint);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */