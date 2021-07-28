package com.lwansbrough.RCTCamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import e.d.a.c;
import e.d.a.d;
import e.d.c.e;
import e.d.c.f;
import e.d.c.i;
import e.d.c.o.d;
import e.d.c.o.k;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class a {
  private final byte[] a;
  
  private Bitmap b;
  
  private e c;
  
  private boolean d = false;
  
  public a(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
    this.b = a(paramArrayOfbyte);
  }
  
  private static Bitmap a(byte[] paramArrayOfbyte) {
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      Bitmap bitmap = BitmapFactory.decodeStream(byteArrayInputStream);
      byteArrayInputStream.close();
      return bitmap;
    } catch (IOException iOException) {
      throw new IllegalStateException("Will not happen", iOException);
    } 
  }
  
  private String a(String paramString) {
    return !paramString.contains("/") ? "" : Double.toString(1.0D / Double.parseDouble(paramString.split("/")[1]));
  }
  
  private void a(b.k.a.a parama) {
    parama.a("Orientation", String.valueOf(1));
  }
  
  private void a(ReadableMap paramReadableMap, b.k.a.a parama) {
    if (!paramReadableMap.hasKey("metadata"))
      return; 
    paramReadableMap = paramReadableMap.getMap("metadata");
    if (!paramReadableMap.hasKey("location"))
      return; 
    paramReadableMap = paramReadableMap.getMap("location");
    if (!paramReadableMap.hasKey("coords"))
      return; 
    try {
      paramReadableMap = paramReadableMap.getMap("coords");
      a.a(paramReadableMap.getDouble("latitude"), paramReadableMap.getDouble("longitude"), parama);
      return;
    } catch (IOException iOException) {
      Log.e("RNCamera", "Couldn't write location data", iOException);
      return;
    } 
  }
  
  private static byte[] a(Bitmap paramBitmap, int paramInt) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, paramInt, byteArrayOutputStream);
    try {
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    } finally {
      try {
        iOException.close();
      } catch (IOException iOException1) {
        Log.e("RNCamera", "problem compressing jpeg", iOException1);
      } 
    } 
  }
  
  private void b(int paramInt) {
    Matrix matrix = new Matrix();
    switch (paramInt) {
      case 8:
        matrix.postRotate(270.0F);
        break;
      case 7:
        matrix.postRotate(270.0F);
      case 6:
        matrix.postRotate(90.0F);
        break;
      case 5:
        matrix.postRotate(90.0F);
      case 4:
        matrix.postRotate(180.0F);
      case 3:
        matrix.postRotate(180.0F);
        break;
      case 2:
        matrix.postScale(-1.0F, 1.0F);
        break;
      case 1:
        return;
    } 
    Bitmap bitmap = Bitmap.createBitmap(this.b, 0, 0, c(), b(), matrix, false);
    if (bitmap != null) {
      this.b = bitmap;
      this.d = true;
      return;
    } 
    throw new b("failed to rotate");
  }
  
  private e e() {
    if (this.c == null)
      this.c = c.a(new BufferedInputStream(new ByteArrayInputStream(this.a)), this.a.length); 
    return this.c;
  }
  
  public String a(int paramInt) {
    return Base64.encodeToString(a(this.b, paramInt), 2);
  }
  
  public void a() {
    try {
      d d = (d)e().b(d.class);
      if (d == null)
        return; 
      if (d.a(274)) {
        int i = d.i(274);
        if (i != 1) {
          b(i);
          d.a(274, 1);
        } 
      } 
      return;
    } catch (d d) {
    
    } catch (IOException iOException) {
    
    } catch (f f) {}
    throw new b("failed to fix orientation", f);
  }
  
  public void a(double paramDouble) {
    int i;
    int j;
    int k = c();
    int m = b();
    double d1 = m;
    Double.isNaN(d1);
    d1 *= paramDouble;
    double d2 = k;
    if (d1 > d2) {
      Double.isNaN(d2);
      j = (int)(d2 / paramDouble);
      i = k;
    } else {
      i = (int)d1;
      j = m;
    } 
    this.b = Bitmap.createBitmap(this.b, (k - i) / 2, (m - j) / 2, i, j);
  }
  
  public void a(File paramFile, ReadableMap paramReadableMap, int paramInt) {
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    fileOutputStream.write(a(this.b, paramInt));
    fileOutputStream.close();
    try {
      b.k.a.a a1 = new b.k.a.a(paramFile.getAbsolutePath());
      for (e.d.c.b b : e().a()) {
        for (i i : b.c()) {
          Object object1 = b.m(i.c());
          a1.a(i.b(), object1.toString());
        } 
      } 
      k k = (k)e().b(k.class);
      for (i i : k.c()) {
        paramInt = i.c();
        String str = i.b().replaceAll(" ", "");
        object = k.m(paramInt);
        if (str.equals("ExposureTime")) {
          object = a(object.toString());
        } else {
          object = object.toString();
        } 
        a1.a(str, (String)object);
      } 
      a(paramReadableMap, a1);
      if (this.d)
        a(a1); 
      a1.d();
      return;
    } catch (d null) {
    
    } catch (IOException object) {}
    Log.e("RNCamera", "failed to save exif data", (Throwable)object);
  }
  
  public int b() {
    return this.b.getHeight();
  }
  
  public int c() {
    return this.b.getWidth();
  }
  
  public void d() {
    Matrix matrix = new Matrix();
    matrix.preScale(-1.0F, 1.0F);
    Bitmap bitmap = Bitmap.createBitmap(this.b, 0, 0, c(), b(), matrix, false);
    if (bitmap != null) {
      this.b = bitmap;
      return;
    } 
    throw new b("failed to mirror");
  }
  
  private static class a {
    private static String a(double param1Double) {
      return (param1Double < 0.0D) ? "S" : "N";
    }
    
    public static void a(double param1Double1, double param1Double2, b.k.a.a param1a) {
      param1a.a("GPSLatitude", c(param1Double1));
      param1a.a("GPSLatitudeRef", a(param1Double1));
      param1a.a("GPSLongitude", c(param1Double2));
      param1a.a("GPSLongitudeRef", b(param1Double2));
    }
    
    private static String b(double param1Double) {
      return (param1Double < 0.0D) ? "W" : "E";
    }
    
    private static String c(double param1Double) {
      param1Double = Math.abs(param1Double);
      int i = (int)param1Double;
      double d = i;
      Double.isNaN(d);
      param1Double = param1Double * 60.0D - d * 60.0D;
      int j = (int)param1Double;
      d = j;
      Double.isNaN(d);
      int k = (int)((param1Double * 60.0D - d * 60.0D) * 1000.0D);
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append(i);
      stringBuffer.append("/1,");
      stringBuffer.append(j);
      stringBuffer.append("/1,");
      stringBuffer.append(k);
      stringBuffer.append("/1000,");
      return stringBuffer.toString();
    }
  }
  
  public static class b extends Exception {
    public b(String param1String) {
      super(param1String);
    }
    
    public b(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */