package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import e.e.o.d0.a.a;

@a(name = "FileReaderModule")
public class FileReaderModule extends NativeFileReaderModuleSpec {
  private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";
  
  public static final String NAME = "FileReaderModule";
  
  public FileReaderModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private BlobModule getBlobModule(String paramString) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    return (reactApplicationContext != null) ? (BlobModule)reactApplicationContext.getNativeModule(BlobModule.class) : null;
  }
  
  public String getName() {
    return "FileReaderModule";
  }
  
  public void readAsDataURL(ReadableMap paramReadableMap, Promise paramPromise) {
    BlobModule blobModule = getBlobModule("readAsDataURL");
    if (blobModule == null) {
      paramPromise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
      return;
    } 
    byte[] arrayOfByte = blobModule.resolve(paramReadableMap.getString("blobId"), paramReadableMap.getInt("offset"), paramReadableMap.getInt("size"));
    if (arrayOfByte == null) {
      paramPromise.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
      return;
    } 
    try {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("data:");
      if (paramReadableMap.hasKey("type") && !paramReadableMap.getString("type").isEmpty()) {
        str = paramReadableMap.getString("type");
      } else {
        str = "application/octet-stream";
      } 
      stringBuilder.append(str);
      stringBuilder.append(";base64,");
      stringBuilder.append(Base64.encodeToString(arrayOfByte, 2));
      paramPromise.resolve(stringBuilder.toString());
      return;
    } catch (Exception exception) {
      paramPromise.reject(exception);
      return;
    } 
  }
  
  public void readAsText(ReadableMap paramReadableMap, String paramString, Promise paramPromise) {
    BlobModule blobModule = getBlobModule("readAsText");
    if (blobModule == null) {
      paramPromise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
      return;
    } 
    byte[] arrayOfByte = blobModule.resolve(paramReadableMap.getString("blobId"), paramReadableMap.getInt("offset"), paramReadableMap.getInt("size"));
    if (arrayOfByte == null) {
      paramPromise.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
      return;
    } 
    try {
      paramPromise.resolve(new String(arrayOfByte, paramString));
      return;
    } catch (Exception exception) {
      paramPromise.reject(exception);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/blob/FileReaderModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */