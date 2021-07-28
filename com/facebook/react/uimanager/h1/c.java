package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.g;

abstract class c extends a {
  boolean a() {
    return (this.d > 0 && this.c != null);
  }
  
  Animation b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    b b = this.c;
    if (b != null) {
      StringBuilder stringBuilder;
      float f1;
      paramInt1 = a.a[b.ordinal()];
      float f2 = 0.0F;
      if (paramInt1 != 1) {
        if (paramInt1 != 2) {
          if (paramInt1 != 3) {
            if (paramInt1 == 4) {
              if (c()) {
                f1 = 1.0F;
              } else {
                f1 = 0.0F;
              } 
              if (c()) {
                f2 = 0.0F;
              } else {
                f2 = 1.0F;
              } 
              return (Animation)new ScaleAnimation(1.0F, 1.0F, f1, f2, 1, 0.0F, 1, 0.5F);
            } 
            stringBuilder = new StringBuilder();
            stringBuilder.append("Missing animation for property : ");
            stringBuilder.append(this.c);
            throw new g(stringBuilder.toString());
          } 
          if (c()) {
            f1 = 1.0F;
          } else {
            f1 = 0.0F;
          } 
          if (c()) {
            f2 = 0.0F;
          } else {
            f2 = 1.0F;
          } 
          return (Animation)new ScaleAnimation(f1, f2, 1.0F, 1.0F, 1, 0.5F, 1, 0.0F);
        } 
        if (c()) {
          f1 = 1.0F;
        } else {
          f1 = 0.0F;
        } 
        if (c()) {
          f2 = 0.0F;
        } else {
          f2 = 1.0F;
        } 
        return (Animation)new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
      } 
      if (c()) {
        f1 = stringBuilder.getAlpha();
      } else {
        f1 = 0.0F;
      } 
      if (!c())
        f2 = stringBuilder.getAlpha(); 
      return new l((View)stringBuilder, f1, f2);
    } 
    throw new g("Missing animated property from animation config");
  }
  
  abstract boolean c();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */