package b.g.e;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class b extends ContentProvider {
  private static final String[] d = new String[] { "_display_name", "_size" };
  
  private static final File e = new File("/");
  
  private static HashMap<String, a> f = new HashMap<String, a>();
  
  private a c;
  
  private static int a(String paramString) {
    if ("r".equals(paramString))
      return 268435456; 
    if ("w".equals(paramString) || "wt".equals(paramString))
      return 738197504; 
    if ("wa".equals(paramString))
      return 704643072; 
    if ("rw".equals(paramString))
      return 939524096; 
    if ("rwt".equals(paramString))
      return 1006632960; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid mode: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static Uri a(Context paramContext, String paramString, File paramFile) {
    return a(paramContext, paramString).a(paramFile);
  }
  
  private static a a(Context paramContext, String paramString) {
    synchronized (f) {
      a a2 = f.get(paramString);
      a a1 = a2;
      if (a2 == null)
        try {
          a1 = b(paramContext, paramString);
          f.put(paramString, a1);
        } catch (IOException iOException) {
          throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", iOException);
        } catch (XmlPullParserException xmlPullParserException) {
          throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", xmlPullParserException);
        }  
      return a1;
    } 
  }
  
  private static File a(File paramFile, String... paramVarArgs) {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j) {
      String str = paramVarArgs[i];
      File file = paramFile;
      if (str != null)
        file = new File(paramFile, str); 
      i++;
      paramFile = file;
    } 
    return paramFile;
  }
  
  private static Object[] a(Object[] paramArrayOfObject, int paramInt) {
    Object[] arrayOfObject = new Object[paramInt];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    return arrayOfObject;
  }
  
  private static String[] a(String[] paramArrayOfString, int paramInt) {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramInt);
    return arrayOfString;
  }
  
  private static a b(Context paramContext, String paramString) {
    File file;
    b b1 = new b(paramString);
    ProviderInfo providerInfo = paramContext.getPackageManager().resolveContentProvider(paramString, 128);
    if (providerInfo != null) {
      XmlResourceParser xmlResourceParser = providerInfo.loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
      if (xmlResourceParser != null)
        while (true) {
          int i = xmlResourceParser.next();
          if (i != 1) {
            if (i == 2) {
              String str3 = xmlResourceParser.getName();
              providerInfo = null;
              String str1 = xmlResourceParser.getAttributeValue(null, "name");
              String str2 = xmlResourceParser.getAttributeValue(null, "path");
              if ("root-path".equals(str3)) {
                file = e;
              } else if ("files-path".equals(str3)) {
                file = paramContext.getFilesDir();
              } else if ("cache-path".equals(str3)) {
                file = paramContext.getCacheDir();
              } else if ("external-path".equals(str3)) {
                file = Environment.getExternalStorageDirectory();
              } else {
                File[] arrayOfFile;
                if ("external-files-path".equals(str3)) {
                  arrayOfFile = a.b(paramContext, (String)null);
                  ProviderInfo providerInfo1 = providerInfo;
                  if (arrayOfFile.length > 0)
                    file = arrayOfFile[0]; 
                } else if ("external-cache-path".equals(arrayOfFile)) {
                  arrayOfFile = a.b(paramContext);
                  ProviderInfo providerInfo1 = providerInfo;
                  if (arrayOfFile.length > 0)
                    file = arrayOfFile[0]; 
                } else {
                  ProviderInfo providerInfo1 = providerInfo;
                  if (Build.VERSION.SDK_INT >= 21) {
                    providerInfo1 = providerInfo;
                    if ("external-media-path".equals(arrayOfFile)) {
                      arrayOfFile = paramContext.getExternalMediaDirs();
                      providerInfo1 = providerInfo;
                      if (arrayOfFile.length > 0)
                        file = arrayOfFile[0]; 
                    } 
                  } 
                } 
              } 
              if (file != null)
                b1.a(str1, a(file, new String[] { str2 })); 
            } 
            continue;
          } 
          return b1;
        }  
      throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Couldn't find meta-data for provider with authority ");
    stringBuilder.append((String)file);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo) {
    super.attachInfo(paramContext, paramProviderInfo);
    if (!paramProviderInfo.exported) {
      if (paramProviderInfo.grantUriPermissions) {
        this.c = a(paramContext, paramProviderInfo.authority);
        return;
      } 
      throw new SecurityException("Provider must grant uri permissions");
    } 
    throw new SecurityException("Provider must not be exported");
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public String getType(Uri paramUri) {
    File file = this.c.a(paramUri);
    int i = file.getName().lastIndexOf('.');
    if (i >= 0) {
      String str = file.getName().substring(i + 1);
      str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
      if (str != null)
        return str; 
    } 
    return "application/octet-stream";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues) {
    throw new UnsupportedOperationException("No external inserts");
  }
  
  public boolean onCreate() {
    return true;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString) {
    return ParcelFileDescriptor.open(this.c.a(paramUri), a(paramString));
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    Object object;
    int i;
    File file = this.c.a(paramUri);
    String[] arrayOfString = paramArrayOfString1;
    if (paramArrayOfString1 == null)
      arrayOfString = d; 
    paramArrayOfString2 = new String[arrayOfString.length];
    Object[] arrayOfObject = new Object[arrayOfString.length];
    int k = arrayOfString.length;
    int j = 0;
    boolean bool = false;
    while (j < k) {
      paramString2 = arrayOfString[j];
      if ("_display_name".equals(paramString2)) {
        paramArrayOfString2[object] = "_display_name";
        int n = object + 1;
        arrayOfObject[object] = file.getName();
        i = n;
      } else {
        int n = i;
        if ("_size".equals(paramString2)) {
          paramArrayOfString2[i] = "_size";
          n = i + 1;
          arrayOfObject[i] = Long.valueOf(file.length());
          i = n;
        } else {
          continue;
        } 
      } 
      int m = i;
      continue;
      j++;
      object = SYNTHETIC_LOCAL_VARIABLE_8;
    } 
    arrayOfString = a(paramArrayOfString2, i);
    arrayOfObject = a(arrayOfObject, i);
    MatrixCursor matrixCursor = new MatrixCursor(arrayOfString, 1);
    matrixCursor.addRow(arrayOfObject);
    return (Cursor)matrixCursor;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    throw new UnsupportedOperationException("No external updates");
  }
  
  static interface a {
    Uri a(File param1File);
    
    File a(Uri param1Uri);
  }
  
  static class b implements a {
    private final String a;
    
    private final HashMap<String, File> b = new HashMap<String, File>();
    
    b(String param1String) {
      this.a = param1String;
    }
    
    public Uri a(File param1File) {
      StringBuilder stringBuilder;
      try {
        Map.Entry<String, File> entry;
        StringBuilder stringBuilder1;
        String str = param1File.getCanonicalPath();
        param1File = null;
        for (Map.Entry<String, File> entry1 : this.b.entrySet()) {
          String str1 = ((File)entry1.getValue()).getPath();
          if (str.startsWith(str1) && (param1File == null || str1.length() > ((File)param1File.getValue()).getPath().length()))
            entry = entry1; 
        } 
        if (entry != null) {
          String str2 = ((File)entry.getValue()).getPath();
          boolean bool = str2.endsWith("/");
          int i = str2.length();
          if (!bool)
            i++; 
          str2 = str.substring(i);
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(Uri.encode(entry.getKey()));
          stringBuilder1.append('/');
          stringBuilder1.append(Uri.encode(str2, "/"));
          String str1 = stringBuilder1.toString();
          return (new Uri.Builder()).scheme("content").authority(this.a).encodedPath(str1).build();
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to find configured root that contains ");
        stringBuilder.append((String)stringBuilder1);
        throw new IllegalArgumentException(stringBuilder.toString());
      } catch (IOException iOException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to resolve canonical path for ");
        stringBuilder1.append(stringBuilder);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder1.toString());
        throw illegalArgumentException;
      } 
    }
    
    public File a(Uri param1Uri) {
      File file1;
      String str2 = param1Uri.getEncodedPath();
      int i = str2.indexOf('/', 1);
      String str1 = Uri.decode(str2.substring(1, i));
      str2 = Uri.decode(str2.substring(i + 1));
      File file2 = this.b.get(str1);
      if (file2 != null) {
        file1 = new File(file2, str2);
        try {
          File file = file1.getCanonicalFile();
          if (file.getPath().startsWith(file2.getPath()))
            return file; 
          throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException iOException) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Failed to resolve canonical path for ");
          stringBuilder1.append(file1);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to find configured root for ");
      stringBuilder.append(file1);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    void a(String param1String, File param1File) {
      if (!TextUtils.isEmpty(param1String))
        try {
          File file = param1File.getCanonicalFile();
          this.b.put(param1String, file);
          return;
        } catch (IOException iOException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to resolve canonical path for ");
          stringBuilder.append(param1File);
          throw new IllegalArgumentException(stringBuilder.toString(), iOException);
        }  
      throw new IllegalArgumentException("Name must not be empty");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */