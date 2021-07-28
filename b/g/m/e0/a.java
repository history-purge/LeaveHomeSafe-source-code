package b.g.m.e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {
  private final int c;
  
  private final c d;
  
  private final int e;
  
  public a(int paramInt1, c paramc, int paramInt2) {
    this.c = paramInt1;
    this.d = paramc;
    this.e = paramInt2;
  }
  
  public void onClick(View paramView) {
    Bundle bundle = new Bundle();
    bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.c);
    this.d.a(this.e, bundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/e0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */