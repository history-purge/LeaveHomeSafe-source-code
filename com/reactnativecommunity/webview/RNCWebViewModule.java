package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import e.e.o.d0.a.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

@a(name = "RNCWebView")
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
  private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
  
  public static final String MODULE_NAME = "RNCWebView";
  
  private static final int PICKER = 1;
  
  private static final int PICKER_LEGACY = 3;
  
  protected static final d shouldOverrideUrlLoadingLock = new d();
  
  private DownloadManager.Request downloadRequest;
  
  private ValueCallback<Uri[]> filePathCallback;
  
  private ValueCallback<Uri> filePathCallbackLegacy;
  
  private File outputImage;
  
  private File outputVideo;
  
  private f webviewFileDownloaderPermissionListener = new a(this);
  
  public RNCWebViewModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    paramReactApplicationContext.addActivityEventListener(this);
  }
  
  private Boolean acceptsImages(String paramString) {
    String str = paramString;
    if (paramString.matches("\\.\\w+"))
      str = getMimeTypeFromExtension(paramString.replace(".", "")); 
    if (str.isEmpty() || str.toLowerCase().contains(c.a(c.d))) {
      boolean bool1 = true;
      return Boolean.valueOf(bool1);
    } 
    boolean bool = false;
    return Boolean.valueOf(bool);
  }
  
  private Boolean acceptsImages(String[] paramArrayOfString) {
    paramArrayOfString = getAcceptedMimeType(paramArrayOfString);
    if (arrayContainsString(paramArrayOfString, c.a(c.c)).booleanValue() || arrayContainsString(paramArrayOfString, c.a(c.d)).booleanValue()) {
      boolean bool1 = true;
      return Boolean.valueOf(bool1);
    } 
    boolean bool = false;
    return Boolean.valueOf(bool);
  }
  
  private Boolean acceptsVideo(String paramString) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i < 23)
      return Boolean.valueOf(false); 
    String str = paramString;
    if (paramString.matches("\\.\\w+"))
      str = getMimeTypeFromExtension(paramString.replace(".", "")); 
    if (str.isEmpty() || str.toLowerCase().contains(c.a(c.e)))
      bool = true; 
    return Boolean.valueOf(bool);
  }
  
  private Boolean acceptsVideo(String[] paramArrayOfString) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i < 23)
      return Boolean.valueOf(false); 
    paramArrayOfString = getAcceptedMimeType(paramArrayOfString);
    if (arrayContainsString(paramArrayOfString, c.a(c.c)).booleanValue() || arrayContainsString(paramArrayOfString, c.a(c.e)).booleanValue())
      bool = true; 
    return Boolean.valueOf(bool);
  }
  
  private Boolean arrayContainsString(String[] paramArrayOfString, String paramString) {
    int j = paramArrayOfString.length;
    for (int i = 0; i < j; i++) {
      if (paramArrayOfString[i].contains(paramString))
        return Boolean.valueOf(true); 
    } 
    return Boolean.valueOf(false);
  }
  
  private String[] getAcceptedMimeType(String[] paramArrayOfString) {
    boolean bool = noAcceptTypesSet(paramArrayOfString).booleanValue();
    int i = 0;
    if (bool)
      return new String[] { c.a(c.c) }; 
    String[] arrayOfString = new String[paramArrayOfString.length];
    while (i < paramArrayOfString.length) {
      String str = paramArrayOfString[i];
      if (str.matches("\\.\\w+")) {
        String str1 = getMimeTypeFromExtension(str.replace(".", ""));
        if (str1 != null) {
          arrayOfString[i] = str1;
        } else {
          arrayOfString[i] = str;
        } 
      } else {
        arrayOfString[i] = str;
      } 
      i++;
    } 
    return arrayOfString;
  }
  
  private File getCapturedFile(c paramc) {
    String str1;
    String str3;
    int i = b.a[paramc.ordinal()];
    String str2 = "";
    if (i != 1) {
      if (i != 2) {
        str3 = "";
        str1 = str3;
      } else {
        str2 = Environment.DIRECTORY_MOVIES;
        str3 = "video-";
        str1 = ".mp4";
      } 
    } else {
      str2 = Environment.DIRECTORY_PICTURES;
      str3 = "image-";
      str1 = ".jpg";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str3);
    stringBuilder.append(String.valueOf(System.currentTimeMillis()));
    stringBuilder.append(str1);
    String str4 = stringBuilder.toString();
    return (Build.VERSION.SDK_INT < 23) ? new File(Environment.getExternalStoragePublicDirectory(str2), str4) : File.createTempFile(str3, str1, getReactApplicationContext().getExternalFilesDir(null));
  }
  
  private Intent getFileChooserIntent(String paramString) {
    String str;
    if (paramString.isEmpty()) {
      str = c.a(c.c);
    } else {
      str = paramString;
    } 
    if (paramString.matches("\\.\\w+"))
      str = getMimeTypeFromExtension(paramString.replace(".", "")); 
    Intent intent = new Intent("android.intent.action.GET_CONTENT");
    intent.addCategory("android.intent.category.OPENABLE");
    intent.setType(str);
    return intent;
  }
  
  private Intent getFileChooserIntent(String[] paramArrayOfString, boolean paramBoolean) {
    Intent intent = new Intent("android.intent.action.GET_CONTENT");
    intent.addCategory("android.intent.category.OPENABLE");
    intent.setType(c.a(c.c));
    intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(paramArrayOfString));
    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", paramBoolean);
    return intent;
  }
  
  private String getMimeTypeFromExtension(String paramString) {
    return (paramString != null) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString) : null;
  }
  
  private Uri getOutputUri(File paramFile) {
    if (Build.VERSION.SDK_INT < 23)
      return Uri.fromFile(paramFile); 
    String str = getReactApplicationContext().getPackageName();
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(".fileprovider");
    return b.g.e.b.a((Context)reactApplicationContext, stringBuilder.toString(), paramFile);
  }
  
  private e getPermissionAwareActivity() {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      if (activity instanceof e)
        return (e)activity; 
      throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    } 
    throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
  }
  
  private Intent getPhotoIntent() {
    Intent intent;
    try {
      this.outputImage = getCapturedFile(c.d);
      Uri uri = getOutputUri(this.outputImage);
      intent = new Intent("android.media.action.IMAGE_CAPTURE");
      try {
        intent.putExtra("output", (Parcelable)uri);
        return intent;
      } catch (IOException iOException) {
      
      } catch (IllegalArgumentException null) {}
    } catch (IOException iOException) {
      intent = null;
    } catch (IllegalArgumentException illegalArgumentException) {}
    Log.e("CREATE FILE", "Error occurred while creating the File", illegalArgumentException);
    illegalArgumentException.printStackTrace();
    return intent;
  }
  
  private Uri[] getSelectedFiles(Intent paramIntent, int paramInt) {
    if (paramIntent == null)
      return null; 
    if (paramIntent.getClipData() != null) {
      int i = paramIntent.getClipData().getItemCount();
      Uri[] arrayOfUri = new Uri[i];
      for (paramInt = 0; paramInt < i; paramInt++)
        arrayOfUri[paramInt] = paramIntent.getClipData().getItemAt(paramInt).getUri(); 
      return arrayOfUri;
    } 
    return (paramIntent.getData() != null && paramInt == -1 && Build.VERSION.SDK_INT >= 21) ? WebChromeClient.FileChooserParams.parseResult(paramInt, paramIntent) : null;
  }
  
  private Intent getVideoIntent() {
    Intent intent;
    try {
      this.outputVideo = getCapturedFile(c.e);
      Uri uri = getOutputUri(this.outputVideo);
      intent = new Intent("android.media.action.VIDEO_CAPTURE");
      try {
        intent.putExtra("output", (Parcelable)uri);
        return intent;
      } catch (IOException iOException) {
      
      } catch (IllegalArgumentException null) {}
    } catch (IOException iOException) {
      intent = null;
    } catch (IllegalArgumentException illegalArgumentException) {}
    Log.e("CREATE FILE", "Error occurred while creating the File", illegalArgumentException);
    illegalArgumentException.printStackTrace();
    return intent;
  }
  
  private Boolean noAcceptTypesSet(String[] paramArrayOfString) {
    int i = paramArrayOfString.length;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (i != 0)
      if (paramArrayOfString.length == 1 && paramArrayOfString[0] != null && paramArrayOfString[0].length() == 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }  
    return Boolean.valueOf(bool1);
  }
  
  public void downloadFile() {
    ((DownloadManager)getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
    Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
  }
  
  public String getName() {
    return "RNCWebView";
  }
  
  public boolean grantFileDownloaderPermissions() {
    boolean bool;
    if (Build.VERSION.SDK_INT > 28)
      return true; 
    if (b.g.e.a.a((Context)getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && Build.VERSION.SDK_INT >= 23) {
      e e = getPermissionAwareActivity();
      f f1 = this.webviewFileDownloaderPermissionListener;
      e.a(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 1, f1);
    } 
    return bool;
  }
  
  @ReactMethod
  public void isFileUploadSupported(Promise paramPromise) {
    Boolean bool1 = Boolean.valueOf(false);
    int i = Build.VERSION.SDK_INT;
    Boolean bool2 = Boolean.valueOf(true);
    if (i >= 21)
      bool1 = bool2; 
    Boolean bool3 = bool1;
    if (i >= 16) {
      bool3 = bool1;
      if (i <= 18)
        bool3 = bool2; 
    } 
    paramPromise.resolve(bool3);
  }
  
  protected boolean needsCameraPermission() {
    PackageManager packageManager = getCurrentActivity().getPackageManager();
    try {
      if (Arrays.<String>asList((packageManager.getPackageInfo(getReactApplicationContext().getPackageName(), 4096)).requestedPermissions).contains("android.permission.CAMERA")) {
        int i = b.g.e.a.a((Context)getCurrentActivity(), "android.permission.CAMERA");
        if (i != 0)
          return true; 
      } 
      return false;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return true;
    } 
  }
  
  public void onActivityResult(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield filePathCallback : Landroid/webkit/ValueCallback;
    //   4: ifnonnull -> 15
    //   7: aload_0
    //   8: getfield filePathCallbackLegacy : Landroid/webkit/ValueCallback;
    //   11: ifnonnull -> 15
    //   14: return
    //   15: aload_0
    //   16: getfield outputImage : Ljava/io/File;
    //   19: astore_1
    //   20: aload_1
    //   21: ifnull -> 39
    //   24: aload_1
    //   25: invokevirtual length : ()J
    //   28: lconst_0
    //   29: lcmp
    //   30: ifle -> 39
    //   33: iconst_1
    //   34: istore #5
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #5
    //   42: aload_0
    //   43: getfield outputVideo : Ljava/io/File;
    //   46: astore_1
    //   47: aload_1
    //   48: ifnull -> 66
    //   51: aload_1
    //   52: invokevirtual length : ()J
    //   55: lconst_0
    //   56: lcmp
    //   57: ifle -> 66
    //   60: iconst_1
    //   61: istore #6
    //   63: goto -> 69
    //   66: iconst_0
    //   67: istore #6
    //   69: iload_2
    //   70: iconst_1
    //   71: if_icmpeq -> 165
    //   74: iload_2
    //   75: iconst_3
    //   76: if_icmpeq -> 82
    //   79: goto -> 258
    //   82: iload_3
    //   83: iconst_m1
    //   84: if_icmpeq -> 102
    //   87: aload_0
    //   88: getfield filePathCallbackLegacy : Landroid/webkit/ValueCallback;
    //   91: astore_1
    //   92: aload_1
    //   93: aconst_null
    //   94: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   99: goto -> 258
    //   102: aload_0
    //   103: getfield filePathCallbackLegacy : Landroid/webkit/ValueCallback;
    //   106: astore_1
    //   107: iload #5
    //   109: ifeq -> 129
    //   112: aload_1
    //   113: aload_0
    //   114: aload_0
    //   115: getfield outputImage : Ljava/io/File;
    //   118: invokespecial getOutputUri : (Ljava/io/File;)Landroid/net/Uri;
    //   121: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   126: goto -> 258
    //   129: iload #6
    //   131: ifeq -> 151
    //   134: aload_1
    //   135: aload_0
    //   136: aload_0
    //   137: getfield outputVideo : Ljava/io/File;
    //   140: invokespecial getOutputUri : (Ljava/io/File;)Landroid/net/Uri;
    //   143: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   148: goto -> 258
    //   151: aload_1
    //   152: aload #4
    //   154: invokevirtual getData : ()Landroid/net/Uri;
    //   157: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   162: goto -> 258
    //   165: iload_3
    //   166: iconst_m1
    //   167: if_icmpeq -> 182
    //   170: aload_0
    //   171: getfield filePathCallback : Landroid/webkit/ValueCallback;
    //   174: astore_1
    //   175: aload_1
    //   176: ifnull -> 258
    //   179: goto -> 92
    //   182: aload_0
    //   183: getfield filePathCallback : Landroid/webkit/ValueCallback;
    //   186: astore_1
    //   187: iload #5
    //   189: ifeq -> 216
    //   192: aload_1
    //   193: iconst_1
    //   194: anewarray android/net/Uri
    //   197: dup
    //   198: iconst_0
    //   199: aload_0
    //   200: aload_0
    //   201: getfield outputImage : Ljava/io/File;
    //   204: invokespecial getOutputUri : (Ljava/io/File;)Landroid/net/Uri;
    //   207: aastore
    //   208: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   213: goto -> 258
    //   216: iload #6
    //   218: ifeq -> 245
    //   221: aload_1
    //   222: iconst_1
    //   223: anewarray android/net/Uri
    //   226: dup
    //   227: iconst_0
    //   228: aload_0
    //   229: aload_0
    //   230: getfield outputVideo : Ljava/io/File;
    //   233: invokespecial getOutputUri : (Ljava/io/File;)Landroid/net/Uri;
    //   236: aastore
    //   237: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   242: goto -> 258
    //   245: aload_1
    //   246: aload_0
    //   247: aload #4
    //   249: iload_3
    //   250: invokespecial getSelectedFiles : (Landroid/content/Intent;I)[Landroid/net/Uri;
    //   253: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   258: aload_0
    //   259: getfield outputImage : Ljava/io/File;
    //   262: astore_1
    //   263: aload_1
    //   264: ifnull -> 277
    //   267: iload #5
    //   269: ifne -> 277
    //   272: aload_1
    //   273: invokevirtual delete : ()Z
    //   276: pop
    //   277: aload_0
    //   278: getfield outputVideo : Ljava/io/File;
    //   281: astore_1
    //   282: aload_1
    //   283: ifnull -> 296
    //   286: iload #6
    //   288: ifne -> 296
    //   291: aload_1
    //   292: invokevirtual delete : ()Z
    //   295: pop
    //   296: aload_0
    //   297: aconst_null
    //   298: putfield filePathCallback : Landroid/webkit/ValueCallback;
    //   301: aload_0
    //   302: aconst_null
    //   303: putfield filePathCallbackLegacy : Landroid/webkit/ValueCallback;
    //   306: aload_0
    //   307: aconst_null
    //   308: putfield outputImage : Ljava/io/File;
    //   311: aload_0
    //   312: aconst_null
    //   313: putfield outputVideo : Ljava/io/File;
    //   316: return
  }
  
  public void onNewIntent(Intent paramIntent) {}
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public void onShouldStartLoadWithRequestCallback(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: getstatic com/reactnativecommunity/webview/RNCWebViewModule.shouldOverrideUrlLoadingLock : Lcom/reactnativecommunity/webview/RNCWebViewModule$d;
    //   3: iload_2
    //   4: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7: invokevirtual a : (Ljava/lang/Integer;)Ljava/util/concurrent/atomic/AtomicReference;
    //   10: astore #4
    //   12: aload #4
    //   14: ifnull -> 56
    //   17: aload #4
    //   19: monitorenter
    //   20: iload_1
    //   21: ifeq -> 31
    //   24: getstatic com/reactnativecommunity/webview/RNCWebViewModule$d$a.e : Lcom/reactnativecommunity/webview/RNCWebViewModule$d$a;
    //   27: astore_3
    //   28: goto -> 35
    //   31: getstatic com/reactnativecommunity/webview/RNCWebViewModule$d$a.d : Lcom/reactnativecommunity/webview/RNCWebViewModule$d$a;
    //   34: astore_3
    //   35: aload #4
    //   37: aload_3
    //   38: invokevirtual set : (Ljava/lang/Object;)V
    //   41: aload #4
    //   43: invokevirtual notify : ()V
    //   46: aload #4
    //   48: monitorexit
    //   49: return
    //   50: astore_3
    //   51: aload #4
    //   53: monitorexit
    //   54: aload_3
    //   55: athrow
    //   56: return
    // Exception table:
    //   from	to	target	type
    //   24	28	50	finally
    //   31	35	50	finally
    //   35	49	50	finally
    //   51	54	50	finally
  }
  
  public void setDownloadRequest(DownloadManager.Request paramRequest) {
    this.downloadRequest = paramRequest;
  }
  
  public void startPhotoPickerIntent(ValueCallback<Uri> paramValueCallback, String paramString) {
    this.filePathCallbackLegacy = paramValueCallback;
    Intent intent = Intent.createChooser(getFileChooserIntent(paramString), "");
    ArrayList<Intent> arrayList = new ArrayList();
    if (acceptsImages(paramString).booleanValue()) {
      Intent intent1 = getPhotoIntent();
      if (intent1 != null)
        arrayList.add(intent1); 
    } 
    if (acceptsVideo(paramString).booleanValue()) {
      Intent intent1 = getVideoIntent();
      if (intent1 != null)
        arrayList.add(intent1); 
    } 
    intent.putExtra("android.intent.extra.INITIAL_INTENTS", arrayList.<Parcelable>toArray(new Parcelable[0]));
    if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
      getCurrentActivity().startActivityForResult(intent, 3);
      return;
    } 
    Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
  }
  
  public boolean startPhotoPickerIntent(ValueCallback<Uri[]> paramValueCallback, String[] paramArrayOfString, boolean paramBoolean) {
    this.filePathCallback = paramValueCallback;
    ArrayList<Intent> arrayList = new ArrayList();
    if (!needsCameraPermission()) {
      if (acceptsImages(paramArrayOfString).booleanValue()) {
        Intent intent = getPhotoIntent();
        if (intent != null)
          arrayList.add(intent); 
      } 
      if (acceptsVideo(paramArrayOfString).booleanValue()) {
        Intent intent = getVideoIntent();
        if (intent != null)
          arrayList.add(intent); 
      } 
    } 
    Intent intent1 = getFileChooserIntent(paramArrayOfString, paramBoolean);
    Intent intent2 = new Intent("android.intent.action.CHOOSER");
    intent2.putExtra("android.intent.extra.INTENT", (Parcelable)intent1);
    intent2.putExtra("android.intent.extra.INITIAL_INTENTS", arrayList.<Parcelable>toArray(new Parcelable[0]));
    if (intent2.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
      getCurrentActivity().startActivityForResult(intent2, 1);
      return true;
    } 
    Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
    return true;
  }
  
  class a implements f {
    a(RNCWebViewModule this$0) {}
    
    public boolean onRequestPermissionsResult(int param1Int, String[] param1ArrayOfString, int[] param1ArrayOfint) {
      if (param1Int != 1)
        return false; 
      if (param1ArrayOfint.length > 0 && param1ArrayOfint[0] == 0) {
        if (this.c.downloadRequest != null) {
          this.c.downloadFile();
          return true;
        } 
      } else {
        Toast.makeText(this.c.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
      } 
      return true;
    }
  }
  
  private enum c {
    c("*/*"),
    d("image"),
    e("video");
    
    private final String value;
    
    c(String param1String1) {
      this.value = param1String1;
    }
  }
  
  protected static class d {
    private int a = 1;
    
    private final HashMap<Integer, AtomicReference<a>> b = new HashMap<Integer, AtomicReference<a>>();
    
    public androidx.core.util.c<Integer, AtomicReference<a>> a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : I
      //   6: istore_1
      //   7: aload_0
      //   8: iload_1
      //   9: iconst_1
      //   10: iadd
      //   11: putfield a : I
      //   14: new java/util/concurrent/atomic/AtomicReference
      //   17: dup
      //   18: getstatic com/reactnativecommunity/webview/RNCWebViewModule$d$a.c : Lcom/reactnativecommunity/webview/RNCWebViewModule$d$a;
      //   21: invokespecial <init> : (Ljava/lang/Object;)V
      //   24: astore_2
      //   25: aload_0
      //   26: getfield b : Ljava/util/HashMap;
      //   29: iload_1
      //   30: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   33: aload_2
      //   34: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   37: pop
      //   38: new androidx/core/util/c
      //   41: dup
      //   42: iload_1
      //   43: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   46: aload_2
      //   47: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
      //   50: astore_2
      //   51: aload_0
      //   52: monitorexit
      //   53: aload_2
      //   54: areturn
      //   55: astore_2
      //   56: aload_0
      //   57: monitorexit
      //   58: aload_2
      //   59: athrow
      // Exception table:
      //   from	to	target	type
      //   2	51	55	finally
    }
    
    public AtomicReference<a> a(Integer param1Integer) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Ljava/util/HashMap;
      //   6: aload_1
      //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   10: checkcast java/util/concurrent/atomic/AtomicReference
      //   13: astore_1
      //   14: aload_0
      //   15: monitorexit
      //   16: aload_1
      //   17: areturn
      //   18: astore_1
      //   19: aload_0
      //   20: monitorexit
      //   21: aload_1
      //   22: athrow
      // Exception table:
      //   from	to	target	type
      //   2	14	18	finally
    }
    
    public void b(Integer param1Integer) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Ljava/util/HashMap;
      //   6: aload_1
      //   7: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   10: pop
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: astore_1
      //   15: aload_0
      //   16: monitorexit
      //   17: aload_1
      //   18: athrow
      // Exception table:
      //   from	to	target	type
      //   2	11	14	finally
    }
    
    protected enum a {
      c, d, e;
    }
  }
  
  protected enum a {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/webview/RNCWebViewModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */