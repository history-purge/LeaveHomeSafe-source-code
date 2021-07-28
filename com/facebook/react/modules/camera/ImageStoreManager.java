package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import e.e.o.d0.a.a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@a(name = "ImageStoreManager")
public class ImageStoreManager extends NativeImageStoreSpec {
  private static final int BUFFER_SIZE = 8192;
  
  public static final String NAME = "ImageStoreManager";
  
  public ImageStoreManager(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private static void closeQuietly(Closeable paramCloseable) {
    try {
      paramCloseable.close();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public void addImageFromBase64(String paramString, Callback paramCallback1, Callback paramCallback2) {}
  
  String convertInputStreamToBase64OutputStream(InputStream paramInputStream) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
    byte[] arrayOfByte = new byte[8192];
    try {
      while (true) {
        int i = paramInputStream.read(arrayOfByte);
        if (i > -1) {
          base64OutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        return byteArrayOutputStream.toString();
      } 
    } finally {
      closeQuietly((Closeable)base64OutputStream);
    } 
  }
  
  public void getBase64ForTag(String paramString, Callback paramCallback1, Callback paramCallback2) {
    (new b((ReactContext)getReactApplicationContext(), paramString, paramCallback1, paramCallback2, null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  public String getName() {
    return "ImageStoreManager";
  }
  
  public void hasImageForTag(String paramString, Callback paramCallback) {}
  
  public void removeImageForTag(String paramString) {}
  
  private class b extends GuardedAsyncTask<Void, Void> {
    private final String a;
    
    private final Callback b;
    
    private final Callback c;
    
    private b(ImageStoreManager this$0, ReactContext param1ReactContext, String param1String, Callback param1Callback1, Callback param1Callback2) {
      super(param1ReactContext);
      this.a = param1String;
      this.b = param1Callback1;
      this.c = param1Callback2;
    }
    
    protected void a(Void... param1VarArgs) {
      try {
        InputStream inputStream = this.d.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.a));
        try {
          this.b.invoke(new Object[] { this.d.convertInputStreamToBase64OutputStream(inputStream) });
        } catch (IOException iOException) {
        
        } finally {
          Exception exception;
        } 
        ImageStoreManager.closeQuietly(inputStream);
        return;
      } catch (FileNotFoundException fileNotFoundException) {
        this.c.invoke(new Object[] { fileNotFoundException.getMessage() });
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/camera/ImageStoreManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */