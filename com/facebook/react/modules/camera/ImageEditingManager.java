package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeImageEditorSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import e.e.o.d0.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@a(name = "ImageEditingManager")
public class ImageEditingManager extends NativeImageEditorSpec {
  private static final int COMPRESS_QUALITY = 90;
  
  @SuppressLint({"InlinedApi"})
  private static final String[] EXIF_ATTRIBUTES;
  
  private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList(new String[] { "file://", "content://" });
  
  public static final String NAME = "ImageEditingManager";
  
  private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";
  
  static {
    EXIF_ATTRIBUTES = new String[] { 
        "FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", 
        "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", 
        "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance" };
  }
  
  public ImageEditingManager(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    (new b((ReactContext)getReactApplicationContext(), null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private static void copyExif(Context paramContext, Uri paramUri, File paramFile) {
    StringBuilder stringBuilder;
    File file = getFileFromUri(paramContext, paramUri);
    if (file == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't get real path for uri: ");
      stringBuilder.append(paramUri);
      e.e.e.e.a.e("ReactNative", stringBuilder.toString());
      return;
    } 
    ExifInterface exifInterface1 = new ExifInterface(stringBuilder.getAbsolutePath());
    ExifInterface exifInterface2 = new ExifInterface(paramFile.getAbsolutePath());
    for (String str1 : EXIF_ATTRIBUTES) {
      String str2 = exifInterface1.getAttribute(str1);
      if (str2 != null)
        exifInterface2.setAttribute(str1, str2); 
    } 
    exifInterface2.saveAttributes();
  }
  
  private static File createTempFile(File paramFile, String paramString) {
    if (paramFile != null)
      return File.createTempFile("ReactNative_cropped_image_", getFileExtensionForType(paramString), paramFile); 
    throw new IOException("No cache directory available");
  }
  
  private static Bitmap.CompressFormat getCompressFormatForType(String paramString) {
    return "image/png".equals(paramString) ? Bitmap.CompressFormat.PNG : ("image/webp".equals(paramString) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
  }
  
  private static int getDecodeSampleSize(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = 1;
    boolean bool = true;
    if (paramInt2 > paramInt3 || paramInt1 > paramInt4) {
      paramInt2 /= 2;
      int j = paramInt1 / 2;
      paramInt1 = bool;
      while (true) {
        i = paramInt1;
        if (j / paramInt1 >= paramInt3) {
          i = paramInt1;
          if (paramInt2 / paramInt1 >= paramInt4) {
            paramInt1 *= 2;
            continue;
          } 
        } 
        break;
      } 
    } 
    return i;
  }
  
  private static String getFileExtensionForType(String paramString) {
    return "image/png".equals(paramString) ? ".png" : ("image/webp".equals(paramString) ? ".webp" : ".jpg");
  }
  
  private static File getFileFromUri(Context paramContext, Uri paramUri) {
    if (paramUri.getScheme().equals("file"))
      return new File(paramUri.getPath()); 
    if (paramUri.getScheme().equals("content")) {
      Cursor cursor = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
      if (cursor != null)
        try {
          if (cursor.moveToFirst()) {
            String str = cursor.getString(0);
            if (!TextUtils.isEmpty(str))
              return new File(str); 
          } 
        } finally {
          cursor.close();
        }  
    } 
    return null;
  }
  
  private static boolean isLocalUri(String paramString) {
    Iterator<String> iterator = LOCAL_URI_PREFIXES.iterator();
    while (iterator.hasNext()) {
      if (paramString.startsWith(iterator.next()))
        return true; 
    } 
    return false;
  }
  
  private static File writeBitmapToExternalCache(Context paramContext, Bitmap paramBitmap, String paramString) {
    File file = createTempFile(paramContext.getExternalCacheDir(), paramString);
    writeCompressedBitmapToFile(paramBitmap, paramString, file);
    return file;
  }
  
  private static File writeBitmapToInternalCache(Context paramContext, Bitmap paramBitmap, String paramString) {
    File file = createTempFile(paramContext.getCacheDir(), paramString);
    writeCompressedBitmapToFile(paramBitmap, paramString, file);
    return file;
  }
  
  private static void writeCompressedBitmapToFile(Bitmap paramBitmap, String paramString, File paramFile) {
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    paramBitmap.compress(getCompressFormatForType(paramString), 90, fileOutputStream);
  }
  
  public void cropImage(String paramString, ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    ReadableMap readableMap1;
    boolean bool = paramReadableMap.hasKey("offset");
    ReadableMap readableMap2 = null;
    if (bool) {
      readableMap1 = paramReadableMap.getMap("offset");
    } else {
      readableMap1 = null;
    } 
    if (paramReadableMap.hasKey("size"))
      readableMap2 = paramReadableMap.getMap("size"); 
    if (paramReadableMap.hasKey("allowExternalStorage")) {
      bool = paramReadableMap.getBoolean("allowExternalStorage");
    } else {
      bool = true;
    } 
    if (readableMap1 != null && readableMap2 != null && readableMap1.hasKey("x") && readableMap1.hasKey("y") && readableMap2.hasKey("width") && readableMap2.hasKey("height")) {
      if (paramString != null && !paramString.isEmpty()) {
        c c = new c((ReactContext)getReactApplicationContext(), paramString, (int)readableMap1.getDouble("x"), (int)readableMap1.getDouble("y"), (int)readableMap2.getDouble("width"), (int)readableMap2.getDouble("height"), bool, paramCallback1, paramCallback2, null);
        if (paramReadableMap.hasKey("displaySize")) {
          paramReadableMap = paramReadableMap.getMap("displaySize");
          c.a((int)paramReadableMap.getDouble("width"), (int)paramReadableMap.getDouble("height"));
        } 
        c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        return;
      } 
      throw new JSApplicationIllegalArgumentException("Please specify a URI");
    } 
    throw new JSApplicationIllegalArgumentException("Please specify offset and size");
  }
  
  public String getName() {
    return "ImageEditingManager";
  }
  
  public void onCatalystInstanceDestroy() {
    (new b((ReactContext)getReactApplicationContext(), null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private static class b extends GuardedAsyncTask<Void, Void> {
    private final Context a;
    
    private b(ReactContext param1ReactContext) {
      super(param1ReactContext);
      this.a = (Context)param1ReactContext;
    }
    
    private void a(File param1File) {
      File[] arrayOfFile = param1File.listFiles(new a(this));
      if (arrayOfFile != null) {
        int j = arrayOfFile.length;
        for (int i = 0; i < j; i++)
          arrayOfFile[i].delete(); 
      } 
    }
    
    protected void a(Void... param1VarArgs) {
      a(this.a.getCacheDir());
      File file = this.a.getExternalCacheDir();
      if (file != null)
        a(file); 
    }
    
    class a implements FilenameFilter {
      a(ImageEditingManager.b this$0) {}
      
      public boolean accept(File param2File, String param2String) {
        return param2String.startsWith("ReactNative_cropped_image_");
      }
    }
  }
  
  class a implements FilenameFilter {
    a(ImageEditingManager this$0) {}
    
    public boolean accept(File param1File, String param1String) {
      return param1String.startsWith("ReactNative_cropped_image_");
    }
  }
  
  private static class c extends GuardedAsyncTask<Void, Void> {
    final Context a;
    
    final String b;
    
    final int c;
    
    final int d;
    
    final int e;
    
    final int f;
    
    final boolean g;
    
    int h = 0;
    
    int i = 0;
    
    final Callback j;
    
    final Callback k;
    
    private c(ReactContext param1ReactContext, String param1String, int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean, Callback param1Callback1, Callback param1Callback2) {
      super(param1ReactContext);
      if (param1Int1 >= 0 && param1Int2 >= 0 && param1Int3 > 0 && param1Int4 > 0) {
        this.a = (Context)param1ReactContext;
        this.b = param1String;
        this.c = param1Int1;
        this.d = param1Int2;
        this.e = param1Int3;
        this.f = param1Int4;
        this.g = param1Boolean;
        this.j = param1Callback1;
        this.k = param1Callback2;
        return;
      } 
      throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", new Object[] { Integer.valueOf(param1Int1), Integer.valueOf(param1Int2), Integer.valueOf(param1Int3), Integer.valueOf(param1Int4) }));
    }
    
    private Bitmap a(int param1Int1, int param1Int2, BitmapFactory.Options param1Options) {
      e.e.m.a.a.a(param1Options);
      BitmapFactory.Options options = new BitmapFactory.Options();
      options.inJustDecodeBounds = true;
      InputStream inputStream = a();
      try {
        float f5;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (inputStream != null)
          inputStream.close(); 
        int i = this.e;
        float f1 = i;
        int j = this.f;
        float f2 = f1 / j;
        float f3 = param1Int1;
        float f4 = param1Int2;
        f1 = f3 / f4;
        if (f2 > f1) {
          f2 = j * f1;
          f3 = j;
          f5 = this.c + (i - f2) / 2.0F;
          f1 = this.d;
          f4 /= j;
        } else {
          f2 = i;
          f1 = i / f1;
          f5 = this.c;
          float f6 = this.d;
          float f7 = (j - f1) / 2.0F;
          f4 = f3 / i;
          f6 = f7 + f6;
          f3 = f1;
          f1 = f6;
        } 
        param1Options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.e, this.f, param1Int1, param1Int2);
        options.inJustDecodeBounds = false;
        inputStream = a();
      } finally {
        if (inputStream != null)
          inputStream.close(); 
      } 
    }
    
    private Bitmap a(BitmapFactory.Options param1Options) {
      InputStream inputStream = a();
      BitmapRegionDecoder bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, false);
      try {
        return bitmapRegionDecoder.decodeRegion(new Rect(this.c, this.d, this.c + this.e, this.d + this.f), param1Options);
      } finally {
        if (inputStream != null)
          inputStream.close(); 
        bitmapRegionDecoder.recycle();
      } 
    }
    
    private InputStream a() {
      InputStream inputStream;
      if (ImageEditingManager.isLocalUri(this.b)) {
        inputStream = this.a.getContentResolver().openInputStream(Uri.parse(this.b));
      } else {
        inputStream = (new URL(this.b)).openConnection().getInputStream();
      } 
      if (inputStream != null)
        return inputStream; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot open bitmap: ");
      stringBuilder.append(this.b);
      throw new IOException(stringBuilder.toString());
    }
    
    public void a(int param1Int1, int param1Int2) {
      if (param1Int1 > 0 && param1Int2 > 0) {
        this.h = param1Int1;
        this.i = param1Int2;
        return;
      } 
      throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", new Object[] { Integer.valueOf(param1Int1), Integer.valueOf(param1Int2) }));
    }
    
    protected void a(Void... param1VarArgs) {
      try {
        Bitmap bitmap;
        boolean bool;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.h > 0 && this.i > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          bitmap = a(this.h, this.i, options);
        } else {
          bitmap = a(options);
        } 
        String str = options.outMimeType;
        if (str != null) {
          boolean bool1 = str.isEmpty();
          if (!bool1) {
            File file;
            try {
              File file1 = ImageEditingManager.writeBitmapToInternalCache(this.a, bitmap, str);
              file = file1;
            } catch (Exception exception) {
              if (this.g) {
                file = ImageEditingManager.writeBitmapToExternalCache(this.a, (Bitmap)file, str);
              } else {
                throw new SecurityException("We couldn't create file in internal cache and external cache is disabled. Did you forget to pass allowExternalStorage=true?");
              } 
            } 
            if (str.equals("image/jpeg"))
              ImageEditingManager.copyExif(this.a, Uri.parse(this.b), file); 
            this.j.invoke(new Object[] { Uri.fromFile(file).toString() });
            return;
          } 
        } 
        throw new IOException("Could not determine MIME type");
      } catch (Exception exception) {
        this.k.invoke(new Object[] { exception.getMessage() });
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/camera/ImageEditingManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */