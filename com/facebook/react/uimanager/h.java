package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.g;
import com.facebook.react.uimanager.events.h;
import com.facebook.react.uimanager.events.i;
import e.e.e.e.a;
import e.e.m.a.a;

public class h {
  private int a = -1;
  
  private final float[] b = new float[2];
  
  private boolean c = false;
  
  private long d = Long.MIN_VALUE;
  
  private final ViewGroup e;
  
  private final h f = new h();
  
  public h(ViewGroup paramViewGroup) {
    this.e = paramViewGroup;
  }
  
  private int a(MotionEvent paramMotionEvent) {
    return l0.a(paramMotionEvent.getX(), paramMotionEvent.getY(), this.e, this.b, (int[])null);
  }
  
  private void c(MotionEvent paramMotionEvent, d paramd) {
    if (this.a == -1) {
      a.e("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
      return;
    } 
    a.a(this.c ^ true, "Expected to not have already sent a cancel for this gesture");
    a.a(paramd);
    paramd = paramd;
    int i = this.a;
    i i1 = i.f;
    long l = this.d;
    float[] arrayOfFloat = this.b;
    paramd.a((c)g.b(i, i1, paramMotionEvent, l, arrayOfFloat[0], arrayOfFloat[1], this.f));
  }
  
  public void a(MotionEvent paramMotionEvent, d paramd) {
    g g;
    int i = paramMotionEvent.getAction() & 0xFF;
    if (i == 0) {
      if (this.a != -1)
        a.b("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture"); 
      this.c = false;
      this.d = paramMotionEvent.getEventTime();
      this.a = a(paramMotionEvent);
      i = this.a;
      i i1 = i.c;
      long l = this.d;
      float[] arrayOfFloat = this.b;
      g = g.b(i, i1, paramMotionEvent, l, arrayOfFloat[0], arrayOfFloat[1], this.f);
    } else {
      if (this.c)
        return; 
      int j = this.a;
      if (j == -1) {
        a.b("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
        return;
      } 
      if (i == 1) {
        a((MotionEvent)g);
        i = this.a;
        i i1 = i.d;
        long l = this.d;
        float[] arrayOfFloat = this.b;
        paramd.a((c)g.b(i, i1, (MotionEvent)g, l, arrayOfFloat[0], arrayOfFloat[1], this.f));
      } else {
        if (i == 2) {
          a((MotionEvent)g);
          i = this.a;
          i i1 = i.e;
          long l = this.d;
          float[] arrayOfFloat = this.b;
          g = g.b(i, i1, (MotionEvent)g, l, arrayOfFloat[0], arrayOfFloat[1], this.f);
        } else {
          StringBuilder stringBuilder;
          float f1;
          float f2;
          long l;
          i i1;
          if (i == 5) {
            i1 = i.c;
            l = this.d;
            float[] arrayOfFloat = this.b;
            f1 = arrayOfFloat[0];
            f2 = arrayOfFloat[1];
          } else if (i == 6) {
            i1 = i.d;
            l = this.d;
            float[] arrayOfFloat = this.b;
            f1 = arrayOfFloat[0];
            f2 = arrayOfFloat[1];
          } else {
            if (i == 3) {
              if (this.f.c(g.getDownTime())) {
                c((MotionEvent)g, paramd);
              } else {
                a.b("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
              } 
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Warning : touch event was ignored. Action=");
              stringBuilder.append(i);
              stringBuilder.append(" Target=");
              stringBuilder.append(this.a);
              a.e("ReactNative", stringBuilder.toString());
              return;
            } 
            this.a = -1;
            this.d = Long.MIN_VALUE;
          } 
          g = g.b(j, i1, (MotionEvent)stringBuilder, l, f1, f2, this.f);
        } 
        paramd.a((c)g);
      } 
      this.a = -1;
      this.d = Long.MIN_VALUE;
    } 
    paramd.a((c)g);
  }
  
  public void b(MotionEvent paramMotionEvent, d paramd) {
    if (this.c)
      return; 
    c(paramMotionEvent, paramd);
    this.c = true;
    this.a = -1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */