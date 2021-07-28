package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import e.f.a.e.i.g.r;
import e.f.a.e.i.g.s;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

class e0 implements Closeable {
  private final URL c;
  
  private l<Bitmap> d;
  
  private volatile InputStream e;
  
  private e0(URL paramURL) {
    this.c = paramURL;
  }
  
  public static e0 b(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    try {
      return new e0(new URL(paramString));
    } catch (MalformedURLException malformedURLException) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Not downloading image, bad URL: ".concat(paramString);
      } else {
        paramString = new String("Not downloading image, bad URL: ");
      } 
      Log.w("FirebaseMessaging", paramString);
      return null;
    } 
  }
  
  private byte[] c() {
    URLConnection uRLConnection = this.c.openConnection();
    if (uRLConnection.getContentLength() <= 1048576) {
      String str;
      InputStream inputStream = uRLConnection.getInputStream();
      try {
        this.e = inputStream;
        byte[] arrayOfByte = r.a(r.a(inputStream, 1048577L));
        if (inputStream != null)
          inputStream.close(); 
        if (Log.isLoggable("FirebaseMessaging", 2)) {
          str = String.valueOf(this.c);
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
          stringBuilder.append("Downloaded ");
          stringBuilder.append(arrayOfByte.length);
          stringBuilder.append(" bytes from ");
          stringBuilder.append(str);
          Log.v("FirebaseMessaging", stringBuilder.toString());
        } 
        if (arrayOfByte.length <= 1048576)
          return arrayOfByte; 
        throw new IOException("Image exceeds max size of 1048576");
      } finally {
        if (str != null)
          try {
            str.close();
          } finally {
            str = null;
          }  
      } 
    } 
    throw new IOException("Content-Length exceeds max size of 1048576");
  }
  
  public Bitmap a() {
    String str2 = String.valueOf(this.c);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 22);
    stringBuilder.append("Starting download of: ");
    stringBuilder.append(str2);
    Log.i("FirebaseMessaging", stringBuilder.toString());
    byte[] arrayOfByte = c();
    Bitmap bitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
    if (bitmap != null) {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        String str = String.valueOf(this.c);
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 31);
        stringBuilder1.append("Successfully downloaded image: ");
        stringBuilder1.append(str);
        Log.d("FirebaseMessaging", stringBuilder1.toString());
      } 
      return bitmap;
    } 
    String str1 = String.valueOf(this.c);
    stringBuilder = new StringBuilder(String.valueOf(str1).length() + 24);
    stringBuilder.append("Failed to decode image: ");
    stringBuilder.append(str1);
    throw new IOException(stringBuilder.toString());
  }
  
  public void a(Executor paramExecutor) {
    this.d = o.a(paramExecutor, new d0(this));
  }
  
  public l<Bitmap> b() {
    l<Bitmap> l1 = this.d;
    q.a(l1);
    return l1;
  }
  
  public void close() {
    try {
      s.a(this.e);
      return;
    } catch (NullPointerException nullPointerException) {
      Log.e("FirebaseMessaging", "Failed to close the image download stream.", nullPointerException);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */