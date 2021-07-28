package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;
import e.f.a.f.a;
import e.f.a.f.l.h;
import e.f.a.f.l.j;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
  private Map<View, Integer> i;
  
  public FabTransformationSheetBehavior() {}
  
  public FabTransformationSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(View paramView, boolean paramBoolean) {
    ViewParent viewParent = paramView.getParent();
    if (!(viewParent instanceof CoordinatorLayout))
      return; 
    CoordinatorLayout coordinatorLayout = (CoordinatorLayout)viewParent;
    int j = coordinatorLayout.getChildCount();
    if (Build.VERSION.SDK_INT >= 16 && paramBoolean)
      this.i = new HashMap<View, Integer>(j); 
    for (int i = 0; i < j; i++) {
      int k;
      View view = coordinatorLayout.getChildAt(i);
      if (view.getLayoutParams() instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)view.getLayoutParams()).d() instanceof FabTransformationScrimBehavior) {
        k = 1;
      } else {
        k = 0;
      } 
      if (view == paramView || k)
        continue; 
      if (!paramBoolean) {
        Map<View, Integer> map = this.i;
        if (map != null && map.containsKey(view)) {
          k = ((Integer)this.i.get(view)).intValue();
        } else {
          continue;
        } 
      } else {
        if (Build.VERSION.SDK_INT >= 16)
          this.i.put(view, Integer.valueOf(view.getImportantForAccessibility())); 
        k = 4;
      } 
      v.h(view, k);
      continue;
    } 
    if (!paramBoolean)
      this.i = null; 
  }
  
  protected FabTransformationBehavior.e a(Context paramContext, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = a.mtrl_fab_transformation_sheet_expand_spec;
    } else {
      i = a.mtrl_fab_transformation_sheet_collapse_spec;
    } 
    FabTransformationBehavior.e e = new FabTransformationBehavior.e();
    e.a = h.a(paramContext, i);
    e.b = new j(17, 0.0F, 0.0F);
    return e;
  }
  
  protected boolean a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    a(paramView2, paramBoolean1);
    return super.a(paramView1, paramView2, paramBoolean1, paramBoolean2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/transformation/FabTransformationSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */