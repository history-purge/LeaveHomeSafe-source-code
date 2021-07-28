package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import j.d;
import j.f;
import j.l;
import j.t;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

class m {
  public static i a(RequestBody paramRequestBody, h paramh) {
    return new i(paramRequestBody, paramh);
  }
  
  private static InputStream a(Context paramContext, Uri paramUri) {
    File file = File.createTempFile("RequestBodyUtil", "temp", paramContext.getApplicationContext().getCacheDir());
    file.deleteOnExit();
    InputStream inputStream = (new URL(paramUri.toString())).openStream();
    try {
      ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
    } finally {
      inputStream.close();
    } 
  }
  
  public static InputStream a(Context paramContext, String paramString) {
    try {
      Uri uri = Uri.parse(paramString);
      return uri.getScheme().startsWith("http") ? a(paramContext, uri) : paramContext.getContentResolver().openInputStream(uri);
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not retrieve file for contentUri ");
      stringBuilder.append(paramString);
      e.e.e.e.a.b("ReactNative", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  public static RequestBody a(String paramString) {
    return (paramString.equals("POST") || paramString.equals("PUT") || paramString.equals("PATCH")) ? RequestBody.create(null, f.f) : null;
  }
  
  public static RequestBody a(MediaType paramMediaType, InputStream paramInputStream) {
    return new a(paramMediaType, paramInputStream);
  }
  
  public static RequestBody a(MediaType paramMediaType, String paramString) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
      gZIPOutputStream.write(paramString.getBytes());
      gZIPOutputStream.close();
      return RequestBody.create(paramMediaType, byteArrayOutputStream.toByteArray());
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static boolean b(String paramString) {
    return "gzip".equalsIgnoreCase(paramString);
  }
  
  static final class a extends RequestBody {
    a(MediaType param1MediaType, InputStream param1InputStream) {}
    
    public long contentLength() {
      try {
        int i = this.b.available();
        return i;
      } catch (IOException iOException) {
        return 0L;
      } 
    }
    
    public MediaType contentType() {
      return this.a;
    }
    
    public void writeTo(d param1d) {
      t t = null;
      try {
        t t1 = l.a(this.b);
        t = t1;
        param1d.a(t1);
        return;
      } finally {
        Util.closeQuietly((Closeable)t);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */