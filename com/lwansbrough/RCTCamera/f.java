package com.lwansbrough.RCTCamera;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;

public class f {
  int a = 0;
  
  private SensorEventListener b = new b(null);
  
  private SensorManager c;
  
  private g d = null;
  
  public f(ReactApplicationContext paramReactApplicationContext) {
    this.c = (SensorManager)paramReactApplicationContext.getSystemService("sensor");
  }
  
  public int a() {
    return this.a;
  }
  
  public void a(g paramg) {
    this.d = paramg;
  }
  
  public void b() {
    this.c.unregisterListener(this.b);
  }
  
  public void c() {
    SensorManager sensorManager = this.c;
    sensorManager.registerListener(this.b, sensorManager.getDefaultSensor(1), 3);
  }
  
  public void d() {
    this.d = null;
  }
  
  private class b implements SensorEventListener {
    private b(f this$0) {}
    
    public void onAccuracyChanged(Sensor param1Sensor, int param1Int) {}
    
    public void onSensorChanged(SensorEvent param1SensorEvent) {
      f f1;
      float[] arrayOfFloat = param1SensorEvent.values;
      byte b1 = 0;
      float f2 = arrayOfFloat[0];
      float f3 = arrayOfFloat[1];
      if (f2 < 5.0F && f2 > -5.0F && f3 > 5.0F) {
        f1 = this.a;
      } else if (f2 < -5.0F && f3 < 5.0F && f3 > -5.0F) {
        f1 = this.a;
        b1 = 3;
      } else if (f2 < 5.0F && f2 > -5.0F && f3 < -5.0F) {
        f1 = this.a;
        b1 = 2;
      } else {
        if (f2 > 5.0F && f3 < 5.0F && f3 > -5.0F)
          this.a.a = 1; 
        if (f.a(this.a) != null)
          f.a(this.a).a(); 
      } 
      f1.a = b1;
      if (f.a(this.a) != null)
        f.a(this.a).a(); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */