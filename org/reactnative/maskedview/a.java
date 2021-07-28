package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.view.View;
import com.facebook.react.views.view.f;

public class a extends f {
  private Bitmap u = null;
  
  private Paint v;
  
  private PorterDuffXfermode w;
  
  public a(Context paramContext) {
    super(paramContext);
    setLayerType(1, null);
    this.v = new Paint(1);
    this.w = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
  }
  
  public static Bitmap b(View paramView) {
    paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
    if (paramView.getMeasuredWidth() <= 0 || paramView.getMeasuredHeight() <= 0)
      return null; 
    Bitmap bitmap = Bitmap.createBitmap(paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(bitmap));
    return bitmap;
  }
  
  private void e() {
    Bitmap bitmap = this.u;
    if (bitmap != null)
      bitmap.recycle(); 
    View view = getChildAt(0);
    view.setVisibility(0);
    this.u = b(view);
    view.setVisibility(4);
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    super.dispatchDraw(paramCanvas);
    e();
    if (this.u != null) {
      this.v.setXfermode((Xfermode)this.w);
      paramCanvas.drawBitmap(this.u, 0.0F, 0.0F, this.v);
      this.v.setXfermode(null);
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
      e(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/maskedview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */