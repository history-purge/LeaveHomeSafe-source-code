package com.rnziparchive;

import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import i.a.a.e.f;
import i.a.a.e.m;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class RNZipArchiveModule extends ReactContextBaseJavaModule {
  private static final String EVENT_KEY_FILENAME = "filePath";
  
  private static final String EVENT_KEY_PROGRESS = "progress";
  
  private static final String PROGRESS_EVENT_NAME = "zipArchiveProgressEvent";
  
  private static final String TAG = "RNZipArchiveModule";
  
  public RNZipArchiveModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private String getStackTrace(Exception paramException) {
    StringWriter stringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(stringWriter));
    return stringWriter.toString();
  }
  
  private long getUncompressedSize(String paramString1, String paramString2) {
    try {
      ZipFile zipFile;
      if (Build.VERSION.SDK_INT >= 24) {
        zipFile = new ZipFile(paramString1, Charset.forName(paramString2));
      } else {
        zipFile = new ZipFile((String)zipFile);
      } 
      Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
      long l = 0L;
      while (enumeration.hasMoreElements()) {
        long l1 = ((ZipEntry)enumeration.nextElement()).getSize();
        if (l1 != -1L)
          l += l1; 
      } 
      zipFile.close();
      return l;
    } catch (IOException iOException) {
      return -1L;
    } 
  }
  
  private void processZip(ArrayList<Object> paramArrayList, String paramString, m paramm, Promise paramPromise) {
    (new Thread(new d(this, paramString, paramArrayList, paramm, paramPromise))).start();
  }
  
  private void zip(ArrayList<Object> paramArrayList, String paramString, Promise paramPromise) {
    try {
      m m = new m();
      m.c(8);
      m.b(5);
      processZip(paramArrayList, paramString, m, paramPromise);
      return;
    } catch (Exception exception) {
      paramPromise.reject(null, exception.getMessage());
      return;
    } 
  }
  
  private void zipWithPassword(ArrayList<Object> paramArrayList, String paramString1, String paramString2, String paramString3, Promise paramPromise) {
    try {
      m m = new m();
      m.c(8);
      m.b(5);
      String[] arrayOfString = paramString3.split("-");
      if (paramString2 != null && !paramString2.isEmpty()) {
        m.a(true);
        if (arrayOfString[0].equals("AES")) {
          m.d(99);
          if (arrayOfString[1].equals("128")) {
            m.a(1);
          } else if (arrayOfString[1].equals("256")) {
            m.a(3);
          } else {
            m.a(0);
          } 
        } else {
          String str;
          if (paramString3.equals("STANDARD")) {
            m.d(0);
            str = TAG;
            paramString3 = "Standard Encryption";
          } else {
            m.d(0);
            str = TAG;
            paramString3 = "Encryption type not supported default to Standard Encryption";
          } 
          Log.d(str, paramString3);
        } 
        m.b(paramString2);
      } else {
        paramPromise.reject(null, "Password is empty");
      } 
      processZip(paramArrayList, paramString1, m, paramPromise);
      return;
    } catch (Exception exception) {
      paramPromise.reject(null, exception.getMessage());
      return;
    } 
  }
  
  public String getName() {
    return "RNZipArchive";
  }
  
  @ReactMethod
  public void isPasswordProtected(String paramString, Promise paramPromise) {
    try {
      paramPromise.resolve(Boolean.valueOf((new i.a.a.a.c(paramString)).b()));
      return;
    } catch (i.a.a.c.a a) {
      paramPromise.reject(null, String.format("Unable to check for encryption due to: %s", new Object[] { getStackTrace((Exception)a) }));
      return;
    } 
  }
  
  @ReactMethod
  public void unzip(String paramString1, String paramString2, String paramString3, Promise paramPromise) {
    (new Thread(new b(this, paramString1, paramPromise, paramString3, paramString2))).start();
  }
  
  @ReactMethod
  public void unzipAssets(String paramString1, String paramString2, Promise paramPromise) {
    (new Thread(new c(this, paramString1, paramPromise, paramString2))).start();
  }
  
  @ReactMethod
  public void unzipWithPassword(String paramString1, String paramString2, String paramString3, Promise paramPromise) {
    (new Thread(new a(this, paramString1, paramString3, paramPromise, paramString2))).start();
  }
  
  protected void updateProgress(long paramLong1, long paramLong2, String paramString) {
    double d1 = paramLong1;
    double d2 = paramLong2;
    Double.isNaN(d1);
    Double.isNaN(d2);
    d1 = Math.min(d1 / d2, 1.0D);
    Log.d(TAG, String.format("updateProgress: %.0f%%", new Object[] { Double.valueOf(100.0D * d1) }));
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("filePath", paramString);
    writableMap.putDouble("progress", d1);
    ((DeviceEventManagerModule.RCTDeviceEventEmitter)getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("zipArchiveProgressEvent", writableMap);
  }
  
  @ReactMethod
  public void zipFiles(ReadableArray paramReadableArray, String paramString, Promise paramPromise) {
    zip(paramReadableArray.toArrayList(), paramString, paramPromise);
  }
  
  @ReactMethod
  public void zipFilesWithPassword(ReadableArray paramReadableArray, String paramString1, String paramString2, String paramString3, Promise paramPromise) {
    zipWithPassword(paramReadableArray.toArrayList(), paramString1, paramString2, paramString3, paramPromise);
  }
  
  @ReactMethod
  public void zipFolder(String paramString1, String paramString2, Promise paramPromise) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(paramString1);
    zip((ArrayList)arrayList, paramString2, paramPromise);
  }
  
  @ReactMethod
  public void zipFolderWithPassword(String paramString1, String paramString2, String paramString3, String paramString4, Promise paramPromise) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(paramString1);
    zipWithPassword((ArrayList)arrayList, paramString2, paramString3, paramString4, paramPromise);
  }
  
  class a implements Runnable {
    a(RNZipArchiveModule this$0, String param1String1, String param1String2, Promise param1Promise, String param1String3) {}
    
    public void run() {
      try {
        i.a.a.a.c c = new i.a.a.a.c(this.c);
        if (c.b()) {
          c.a(this.d);
        } else {
          this.e.reject(null, String.format("Zip file: %s is not password protected", new Object[] { this.c }));
        } 
        List<f> list = c.a();
        ArrayList<String> arrayList = new ArrayList();
        int j = list.size();
        this.g.updateProgress(0L, 1L, this.c);
        int i = 0;
        while (i < j) {
          f f = list.get(i);
          String str = (new File(this.f, f.k())).getCanonicalPath();
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append((new File(this.f)).getCanonicalPath());
          stringBuilder.append(File.separator);
          if (str.startsWith(stringBuilder.toString())) {
            c.a(f, this.f);
            if (!f.v())
              arrayList.add(f.k()); 
            RNZipArchiveModule rNZipArchiveModule = this.g;
            rNZipArchiveModule.updateProgress(++i, j, this.c);
            continue;
          } 
          throw new SecurityException(String.format("Found Zip Path Traversal Vulnerability with %s", new Object[] { str }));
        } 
        this.e.resolve(Arguments.fromList(arrayList));
        return;
      } catch (Exception exception) {
        this.g.updateProgress(0L, 1L, this.c);
        this.e.reject(null, String.format("Failed to unzip file, due to: %s", new Object[] { RNZipArchiveModule.access$000(this.g, exception) }));
        return;
      } 
    }
  }
  
  class b implements Runnable {
    b(RNZipArchiveModule this$0, String param1String1, Promise param1Promise, String param1String2, String param1String3) {}
    
    public void run() {
      try {
        FileInputStream fileInputStream = new FileInputStream(this.c);
        try {
          new File(this.c);
          try {
            ZipFile zipFile;
            long l = this.g.getUncompressedSize(this.c, this.e);
            File file = new File(this.f);
            if (!file.exists())
              file.mkdirs(); 
            this.g.updateProgress(0L, 1L, this.c);
            if (Build.VERSION.SDK_INT >= 24) {
              zipFile = new ZipFile(this.c, Charset.forName(this.e));
            } else {
              zipFile = new ZipFile(this.c);
            } 
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            String str = RNZipArchiveModule.TAG;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Zip has ");
            stringBuilder1.append(zipFile.size());
            stringBuilder1.append(" entries");
            Log.d(str, stringBuilder1.toString());
            while (true) {
              File file1;
              if (enumeration.hasMoreElements()) {
                ZipEntry zipEntry = enumeration.nextElement();
                if (zipEntry.isDirectory())
                  continue; 
                a a = new a(this, new long[] { 0L }, new int[] { 0 }, l);
                file1 = new File(this.f, zipEntry.getName());
                String str1 = file1.getCanonicalPath();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append((new File(this.f)).getCanonicalPath());
                stringBuilder2.append(File.separator);
                if (str1.startsWith(stringBuilder2.toString())) {
                  if (!file1.exists())
                    (new File(file1.getParent())).mkdirs(); 
                  try {
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    try {
                      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
                      try {
                        b.a(inputStream, bufferedOutputStream, a);
                        bufferedOutputStream.close();
                        inputStream.close();
                        continue;
                      } catch (IOException iOException) {}
                      if (inputStream != null)
                        try {
                          inputStream.close();
                        } catch (Exception null) {} 
                      if (bufferedOutputStream != null)
                        try {
                          bufferedOutputStream.close();
                        } catch (Exception null) {} 
                      continue;
                    } catch (IOException iOException) {}
                  } catch (IOException null) {
                    exception = null;
                  } 
                  file1 = null;
                } else {
                  throw new SecurityException(String.format("Found Zip Path Traversal Vulnerability with %s", new Object[] { str1 }));
                } 
              } else {
                zipFile.close();
                this.g.updateProgress(1L, 1L, this.c);
                this.d.resolve(this.f);
                return;
              } 
              if (exception != null)
                try {
                  exception.close();
                } catch (Exception exception1) {} 
              if (file1 != null)
                try {
                  file1.close();
                } catch (Exception exception1) {} 
            } 
          } catch (Exception null) {
            this.g.updateProgress(0L, 1L, this.c);
            Promise promise1 = this.d;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Failed to extract file ");
            stringBuilder1.append(exception.getLocalizedMessage());
            promise1.reject(null, stringBuilder1.toString());
            return;
          } 
        } catch (FileNotFoundException|NullPointerException fileNotFoundException) {}
      } catch (FileNotFoundException|NullPointerException exception) {
        exception = null;
      } 
      if (exception != null)
        try {
          exception.close();
        } catch (IOException iOException) {} 
      Promise promise = this.d;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't open file ");
      stringBuilder.append(this.c);
      stringBuilder.append(". ");
      promise.reject(null, stringBuilder.toString());
    }
    
    class a implements b.a {
      a(RNZipArchiveModule.b this$0, long[] param2ArrayOflong, int[] param2ArrayOfint, long param2Long) {}
      
      public void a(long param2Long) {
        long[] arrayOfLong = this.a;
        arrayOfLong[0] = arrayOfLong[0] + param2Long;
        int[] arrayOfInt = this.b;
        int i = arrayOfInt[0];
        double d1 = arrayOfLong[0];
        Double.isNaN(d1);
        param2Long = this.c;
        double d2 = param2Long;
        Double.isNaN(d2);
        int j = (int)(d1 * 100.0D / d2);
        if (j > i) {
          arrayOfInt[0] = j;
          RNZipArchiveModule.b b1 = this.d;
          b1.g.updateProgress(arrayOfLong[0], param2Long, b1.c);
        } 
      }
    }
  }
  
  class a implements b.a {
    a(RNZipArchiveModule this$0, long[] param1ArrayOflong, int[] param1ArrayOfint, long param1Long) {}
    
    public void a(long param1Long) {
      long[] arrayOfLong = this.a;
      arrayOfLong[0] = arrayOfLong[0] + param1Long;
      int[] arrayOfInt = this.b;
      int i = arrayOfInt[0];
      double d1 = arrayOfLong[0];
      Double.isNaN(d1);
      param1Long = this.c;
      double d2 = param1Long;
      Double.isNaN(d2);
      int j = (int)(d1 * 100.0D / d2);
      if (j > i) {
        arrayOfInt[0] = j;
        RNZipArchiveModule.b b1 = this.d;
        b1.g.updateProgress(arrayOfLong[0], param1Long, b1.c);
      } 
    }
  }
  
  class c implements Runnable {
    c(RNZipArchiveModule this$0, String param1String1, Promise param1Promise, String param1String2) {}
    
    public void run() {
      try {
        InputStream inputStream = this.f.getReactApplicationContext().getAssets().open(this.c);
        long l = this.f.getReactApplicationContext().getAssets().openFd(this.c).getLength();
        try {
          File file = new File(this.e);
          if (!file.exists())
            file.mkdirs(); 
          ZipInputStream zipInputStream = new ZipInputStream(inputStream);
          BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream);
          int[] arrayOfInt = new int[1];
          arrayOfInt[0] = 0;
          this.f.updateProgress(0L, 1L, this.c);
          while (true) {
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            if (zipEntry != null) {
              BufferedOutputStream bufferedOutputStream;
              if (zipEntry.isDirectory())
                continue; 
              File file1 = new File(this.e, zipEntry.getName());
              String str = file1.getCanonicalPath();
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append((new File(this.e)).getCanonicalPath());
              stringBuilder.append(File.separator);
              if (str.startsWith(stringBuilder.toString())) {
                if (!file1.exists())
                  (new File(file1.getParent())).mkdirs(); 
                a a = new a(this, new long[] { 0L }, arrayOfInt, l, zipEntry);
                FileOutputStream fileOutputStream = new FileOutputStream(file1);
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                b.a(bufferedInputStream, bufferedOutputStream, a);
                bufferedOutputStream.close();
                fileOutputStream.close();
                continue;
              } 
              throw new SecurityException(String.format("Found Zip Path Traversal Vulnerability with %s", new Object[] { bufferedOutputStream }));
            } 
            this.f.updateProgress(1L, 1L, this.c);
            bufferedInputStream.close();
            zipInputStream.close();
            this.d.resolve(this.e);
            return;
          } 
        } catch (Exception exception) {
          try {
            exception.printStackTrace();
            this.f.updateProgress(0L, 1L, this.c);
            throw new Exception(String.format("Couldn't extract %s", new Object[] { this.c }));
          } catch (Exception exception1) {
            this.d.reject(null, exception1.getMessage());
            return;
          } 
        } 
      } catch (IOException iOException) {
        this.d.reject(null, String.format("Asset file `%s` could not be opened", new Object[] { this.c }));
        return;
      } 
    }
    
    class a implements b.a {
      a(RNZipArchiveModule.c this$0, long[] param2ArrayOflong, int[] param2ArrayOfint, long param2Long, ZipEntry param2ZipEntry) {}
      
      public void a(long param2Long) {
        long[] arrayOfLong = this.a;
        arrayOfLong[0] = arrayOfLong[0] + param2Long;
        int[] arrayOfInt = this.b;
        int i = arrayOfInt[0];
        double d1 = arrayOfLong[0];
        Double.isNaN(d1);
        param2Long = this.c;
        double d2 = param2Long;
        Double.isNaN(d2);
        int j = (int)(d1 * 100.0D / d2);
        if (j > i) {
          arrayOfInt[0] = j;
          this.e.f.updateProgress(arrayOfLong[0], param2Long, this.d.getName());
        } 
      }
    }
  }
  
  class a implements b.a {
    a(RNZipArchiveModule this$0, long[] param1ArrayOflong, int[] param1ArrayOfint, long param1Long, ZipEntry param1ZipEntry) {}
    
    public void a(long param1Long) {
      long[] arrayOfLong = this.a;
      arrayOfLong[0] = arrayOfLong[0] + param1Long;
      int[] arrayOfInt = this.b;
      int i = arrayOfInt[0];
      double d1 = arrayOfLong[0];
      Double.isNaN(d1);
      param1Long = this.c;
      double d2 = param1Long;
      Double.isNaN(d2);
      int j = (int)(d1 * 100.0D / d2);
      if (j > i) {
        arrayOfInt[0] = j;
        this.e.f.updateProgress(arrayOfLong[0], param1Long, this.d.getName());
      } 
    }
  }
  
  class d implements Runnable {
    d(RNZipArchiveModule this$0, String param1String, ArrayList param1ArrayList, m param1m, Promise param1Promise) {}
    
    public void run() {
      try {
        i.a.a.a.c c = new i.a.a.a.c(this.c);
        this.g.updateProgress(0L, 100L, this.c);
        int j = 0;
        int k = 0;
        for (int i = 0;; i = n) {
          if (j < this.d.size()) {
            File file = new File(this.d.get(j).toString());
            if (file.exists()) {
              List<File> list;
              if (file.isDirectory()) {
                list = Arrays.asList(file.listFiles());
                k += list.size();
                for (int i1 = 0; i1 < list.size(); i1++) {
                  if (((File)list.get(i1)).isDirectory()) {
                    c.a(((File)list.get(i1)).getAbsolutePath(), this.e);
                  } else {
                    c.a(list.get(i1), this.e);
                  } 
                  this.g.updateProgress(++i, k, this.c);
                } 
              } else {
                int i1 = k + 1;
                c.a((File)list, this.e);
                k = i + 1;
                this.g.updateProgress(k, i1, this.c);
                i = i1;
                i1 = k;
                this.g.updateProgress(1L, 1L, this.c);
                this.f.resolve(this.c);
                j++;
                k = i;
                i = i1;
              } 
            } else {
              this.f.reject(null, "File or folder does not exist");
              int i1 = i;
              i = k;
              this.g.updateProgress(1L, 1L, this.c);
              this.f.resolve(this.c);
              j++;
              k = i;
              i = i1;
            } 
          } else {
            return;
          } 
          int n = i;
          i = k;
          this.g.updateProgress(1L, 1L, this.c);
          this.f.resolve(this.c);
          j++;
          k = i;
        } 
      } catch (Exception exception) {
        this.f.reject(null, exception.getMessage());
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnziparchive/RNZipArchiveModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */