package com.facebook.react.views.progressbar;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.i;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.HashSet;
import java.util.Set;

public class b extends i implements m {
  private String B = "Normal";
  
  private final SparseIntArray C = new SparseIntArray();
  
  private final SparseIntArray D = new SparseIntArray();
  
  private final Set<Integer> E = new HashSet<Integer>();
  
  public b() {
    R();
  }
  
  private void R() {
    a(this);
  }
  
  public String Q() {
    return this.B;
  }
  
  public long a(p paramp, float paramFloat1, n paramn1, float paramFloat2, n paramn2) {
    int j = ReactProgressBarViewManager.getStyleFromString(Q());
    if (!this.E.contains(Integer.valueOf(j))) {
      ProgressBar progressBar = ReactProgressBarViewManager.createProgressBar((Context)h(), j);
      int k = View.MeasureSpec.makeMeasureSpec(-2, 0);
      progressBar.measure(k, k);
      this.C.put(j, progressBar.getMeasuredHeight());
      this.D.put(j, progressBar.getMeasuredWidth());
      this.E.add(Integer.valueOf(j));
    } 
    return o.a(this.D.get(j), this.C.get(j));
  }
  
  @a(name = "styleAttr")
  public void setStyle(String paramString) {
    String str = paramString;
    if (paramString == null)
      str = "Normal"; 
    this.B = str;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/progressbar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */