package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.g;
import java.util.Map;

abstract class a {
  private static final Map<d, BaseInterpolator> e = f.a(d.c, new LinearInterpolator(), d.d, new AccelerateInterpolator(), d.e, new DecelerateInterpolator(), d.f, new AccelerateDecelerateInterpolator());
  
  private Interpolator a;
  
  private int b;
  
  protected b c;
  
  protected int d;
  
  private static Interpolator a(d paramd, ReadableMap paramReadableMap) {
    Interpolator interpolator;
    if (paramd.equals(d.g)) {
      interpolator = new n(n.a(paramReadableMap));
    } else {
      interpolator = (Interpolator)e.get(paramd);
    } 
    if (interpolator != null)
      return interpolator; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Missing interpolator for type : ");
    stringBuilder.append(paramd);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final Animation a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a())
      return null; 
    Animation animation = b(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    if (animation != null) {
      animation.setDuration((this.d * 1));
      animation.setStartOffset((this.b * 1));
      animation.setInterpolator(this.a);
    } 
    return animation;
  }
  
  public void a(ReadableMap paramReadableMap, int paramInt) {
    b b1;
    if (paramReadableMap.hasKey("property")) {
      b1 = b.a(paramReadableMap.getString("property"));
    } else {
      b1 = null;
    } 
    this.c = b1;
    if (paramReadableMap.hasKey("duration"))
      paramInt = paramReadableMap.getInt("duration"); 
    this.d = paramInt;
    if (paramReadableMap.hasKey("delay")) {
      paramInt = paramReadableMap.getInt("delay");
    } else {
      paramInt = 0;
    } 
    this.b = paramInt;
    if (paramReadableMap.hasKey("type")) {
      this.a = a(d.a(paramReadableMap.getString("type")), paramReadableMap);
      if (a())
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid layout animation : ");
      stringBuilder.append(paramReadableMap);
      throw new g(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("Missing interpolation type.");
  }
  
  abstract boolean a();
  
  abstract Animation b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public void b() {
    this.c = null;
    this.d = 0;
    this.b = 0;
    this.a = null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */