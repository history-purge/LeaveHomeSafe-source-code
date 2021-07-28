package org.reactnative.facedetector.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.f.a.e.n.e.b;
import java.io.File;
import java.io.IOException;
import k.b.b.b;
import org.reactnative.facedetector.b;

public class a extends AsyncTask<Void, Void, SparseArray<b>> {
  private String a;
  
  private String b;
  
  private Promise c;
  
  private int d = 0;
  
  private int e = 0;
  
  private Context f;
  
  private ReadableMap g;
  
  private int h = 0;
  
  private b i;
  
  public a(Context paramContext, ReadableMap paramReadableMap, Promise paramPromise) {
    this.a = paramReadableMap.getString("uri");
    this.c = paramPromise;
    this.g = paramReadableMap;
    this.f = paramContext;
  }
  
  private static b a(ReadableMap paramReadableMap, Context paramContext) {
    b b1 = new b(paramContext);
    b1.a(false);
    if (paramReadableMap.hasKey("mode"))
      b1.c(paramReadableMap.getInt("mode")); 
    if (paramReadableMap.hasKey("runClassifications"))
      b1.a(paramReadableMap.getInt("runClassifications")); 
    if (paramReadableMap.hasKey("detectLandmarks"))
      b1.b(paramReadableMap.getInt("detectLandmarks")); 
    return b1;
  }
  
  protected SparseArray<b> a(Void... paramVarArgs) {
    if (isCancelled())
      return null; 
    this.i = a(this.g, this.f);
    Bitmap bitmap = BitmapFactory.decodeFile(this.b);
    this.d = bitmap.getWidth();
    this.e = bitmap.getHeight();
    try {
      this.h = (new b.k.a.a(this.b)).a("Orientation", 0);
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Reading orientation from file `");
      stringBuilder.append(this.b);
      stringBuilder.append("` failed.");
      Log.e("E_FACE_DETECTION_FAILED", stringBuilder.toString(), iOException);
    } 
    k.b.b.a a1 = b.a(bitmap);
    return this.i.a(a1);
  }
  
  protected void a(SparseArray<b> paramSparseArray) {
    super.onPostExecute(paramSparseArray);
    WritableMap writableMap2 = Arguments.createMap();
    WritableArray writableArray = Arguments.createArray();
    for (int i = 0; i < paramSparseArray.size(); i++) {
      WritableMap writableMap = org.reactnative.facedetector.a.a((b)paramSparseArray.valueAt(i));
      writableMap.putDouble("yawAngle", (-writableMap.getDouble("yawAngle") + 360.0D) % 360.0D);
      writableMap.putDouble("rollAngle", (-writableMap.getDouble("rollAngle") + 360.0D) % 360.0D);
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    writableMap2.putArray("faces", (ReadableArray)writableArray);
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putInt("width", this.d);
    writableMap1.putInt("height", this.e);
    writableMap1.putInt("orientation", this.h);
    writableMap1.putString("uri", this.a);
    writableMap2.putMap("image", (ReadableMap)writableMap1);
    this.i.b();
    this.c.resolve(writableMap2);
  }
  
  protected void onPreExecute() {
    Promise promise;
    StringBuilder stringBuilder;
    String str = this.a;
    if (str == null) {
      promise = this.c;
      String str1 = "You have to provide an URI of an image.";
    } else {
      this.b = Uri.parse((String)promise).getPath();
      String str1 = this.b;
      if (str1 == null) {
        promise = this.c;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Invalid URI provided: `");
        stringBuilder1.append(this.a);
        stringBuilder1.append("`.");
        String str2 = stringBuilder1.toString();
      } else {
        boolean bool;
        if (promise.startsWith(this.f.getCacheDir().getPath()) || this.b.startsWith(this.f.getFilesDir().getPath())) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool) {
          promise = this.c;
          String str2 = "The image has to be in the local app's directories.";
        } else {
          if (!(new File(this.b)).exists()) {
            promise = this.c;
            stringBuilder = new StringBuilder();
            stringBuilder.append("The file does not exist. Given path: `");
            stringBuilder.append(this.b);
            stringBuilder.append("`.");
            promise.reject("E_FACE_DETECTION_FAILED", stringBuilder.toString());
            cancel(true);
          } 
          return;
        } 
      } 
    } 
    promise.reject("E_FACE_DETECTION_FAILED", (String)stringBuilder);
    cancel(true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/facedetector/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */