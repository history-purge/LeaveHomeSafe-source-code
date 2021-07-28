package b.r;

import android.animation.TypeEvaluator;

class g implements TypeEvaluator<float[]> {
  private float[] a;
  
  g(float[] paramArrayOffloat) {
    this.a = paramArrayOffloat;
  }
  
  public float[] a(float paramFloat, float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    float[] arrayOfFloat2 = this.a;
    float[] arrayOfFloat1 = arrayOfFloat2;
    if (arrayOfFloat2 == null)
      arrayOfFloat1 = new float[paramArrayOffloat1.length]; 
    int i;
    for (i = 0; i < arrayOfFloat1.length; i++) {
      float f = paramArrayOffloat1[i];
      arrayOfFloat1[i] = f + (paramArrayOffloat2[i] - f) * paramFloat;
    } 
    return arrayOfFloat1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */