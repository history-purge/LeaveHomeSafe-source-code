package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.scroll.h;
import com.facebook.react.views.scroll.i;
import com.reactnativecommunity.webview.c.a;
import com.reactnativecommunity.webview.c.b;
import com.reactnativecommunity.webview.c.c;
import com.reactnativecommunity.webview.c.d;
import com.reactnativecommunity.webview.c.e;
import com.reactnativecommunity.webview.c.f;
import com.reactnativecommunity.webview.c.g;
import e.e.o.d0.a.a;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@a(name = "RNCWebView")
public class RNCWebViewManager extends SimpleViewManager<WebView> {
  protected static final String BLANK_URL = "about:blank";
  
  public static final int COMMAND_CLEAR_CACHE = 1001;
  
  public static final int COMMAND_CLEAR_FORM_DATA = 1000;
  
  public static final int COMMAND_CLEAR_HISTORY = 1002;
  
  public static final int COMMAND_FOCUS = 8;
  
  public static final int COMMAND_GO_BACK = 1;
  
  public static final int COMMAND_GO_FORWARD = 2;
  
  public static final int COMMAND_INJECT_JAVASCRIPT = 6;
  
  public static final int COMMAND_LOAD_URL = 7;
  
  public static final int COMMAND_POST_MESSAGE = 5;
  
  public static final int COMMAND_RELOAD = 3;
  
  public static final int COMMAND_STOP_LOADING = 4;
  
  protected static final String HTML_ENCODING = "UTF-8";
  
  protected static final String HTML_MIME_TYPE = "text/html";
  
  protected static final String HTTP_METHOD_POST = "POST";
  
  protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
  
  protected static final String REACT_CLASS = "RNCWebView";
  
  protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
  
  private static final String TAG = "RNCWebViewManager";
  
  protected boolean mAllowsFullscreenVideo = false;
  
  protected String mUserAgent = null;
  
  protected String mUserAgentWithApplicationName = null;
  
  protected e mWebChromeClient = null;
  
  protected b mWebViewConfig = new a(this);
  
  public RNCWebViewManager() {}
  
  public RNCWebViewManager(b paramb) {}
  
  public static RNCWebViewModule getModule(ReactContext paramReactContext) {
    return (RNCWebViewModule)paramReactContext.getNativeModule(RNCWebViewModule.class);
  }
  
  protected void addEventEmitters(k0 paramk0, WebView paramWebView) {
    paramWebView.setWebViewClient(new g());
  }
  
  protected f createRNCWebViewInstance(k0 paramk0) {
    return new f(paramk0);
  }
  
  @TargetApi(21)
  protected WebView createViewInstance(k0 paramk0) {
    f f = createRNCWebViewInstance(paramk0);
    setupWebChromeClient((ReactContext)paramk0, f);
    paramk0.addLifecycleEventListener(f);
    this.mWebViewConfig.a(f);
    WebSettings webSettings = f.getSettings();
    webSettings.setBuiltInZoomControls(true);
    webSettings.setDisplayZoomControls(false);
    webSettings.setDomStorageEnabled(true);
    webSettings.setSupportMultipleWindows(true);
    webSettings.setAllowFileAccess(false);
    webSettings.setAllowContentAccess(false);
    if (Build.VERSION.SDK_INT >= 16) {
      webSettings.setAllowFileAccessFromFileURLs(false);
      setAllowUniversalAccessFromFileURLs(f, false);
    } 
    setMixedContentMode(f, "never");
    f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    f.setDownloadListener(new b(this, f, paramk0));
    return f;
  }
  
  public Map<String, Integer> getCommandsMap() {
    com.facebook.react.common.f.b b1 = com.facebook.react.common.f.a();
    b1.a("goBack", Integer.valueOf(1));
    b1.a("goForward", Integer.valueOf(2));
    b1.a("reload", Integer.valueOf(3));
    b1.a("stopLoading", Integer.valueOf(4));
    b1.a("postMessage", Integer.valueOf(5));
    b1.a("injectJavaScript", Integer.valueOf(6));
    b1.a("loadUrl", Integer.valueOf(7));
    b1.a("requestFocus", Integer.valueOf(8));
    b1.a("clearFormData", Integer.valueOf(1000));
    b1.a("clearCache", Integer.valueOf(1001));
    b1.a("clearHistory", Integer.valueOf(1002));
    return b1.a();
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    Map<String, Map> map2 = super.getExportedCustomDirectEventTypeConstants();
    Map<String, Map> map1 = map2;
    if (map2 == null)
      map1 = com.facebook.react.common.f.b(); 
    map1.put("topLoadingProgress", com.facebook.react.common.f.a("registrationName", "onLoadingProgress"));
    map1.put("topShouldStartLoadWithRequest", com.facebook.react.common.f.a("registrationName", "onShouldStartLoadWithRequest"));
    map1.put(i.a(i.e), com.facebook.react.common.f.a("registrationName", "onScroll"));
    map1.put("topHttpError", com.facebook.react.common.f.a("registrationName", "onHttpError"));
    map1.put("topRenderProcessGone", com.facebook.react.common.f.a("registrationName", "onRenderProcessGone"));
    return map1;
  }
  
  public String getName() {
    return "RNCWebView";
  }
  
  public void onDropViewInstance(WebView paramWebView) {
    super.onDropViewInstance((View)paramWebView);
    k0 k0 = (k0)paramWebView.getContext();
    paramWebView = paramWebView;
    k0.removeLifecycleEventListener((LifecycleEventListener)paramWebView);
    paramWebView.c();
    this.mWebChromeClient = null;
  }
  
  public void receiveCommand(WebView paramWebView, int paramInt, ReadableArray paramReadableArray) {
    boolean bool1;
    boolean bool2 = false;
    switch (paramInt) {
      default:
        switch (paramInt) {
          default:
            return;
          case 1002:
            paramWebView.clearHistory();
            return;
          case 1001:
            bool1 = bool2;
            if (paramReadableArray != null) {
              bool1 = bool2;
              if (paramReadableArray.getBoolean(0))
                bool1 = true; 
            } 
            paramWebView.clearCache(bool1);
            return;
          case 1000:
            break;
        } 
        paramWebView.clearFormData();
        return;
      case 8:
        paramWebView.requestFocus();
        return;
      case 7:
        if (paramReadableArray != null) {
          ((f)paramWebView).l.a(false);
          paramWebView.loadUrl(paramReadableArray.getString(0));
          return;
        } 
        throw new RuntimeException("Arguments for loading an url are null!");
      case 6:
        ((f)paramWebView).a(paramReadableArray.getString(0));
        return;
      case 5:
        try {
          paramWebView = paramWebView;
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("data", paramReadableArray.getString(0));
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("(function () {var event;var data = ");
          stringBuilder.append(jSONObject.toString());
          stringBuilder.append(";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
          paramWebView.a(stringBuilder.toString());
          return;
        } catch (JSONException jSONException) {
          throw new RuntimeException(jSONException);
        } 
      case 4:
        jSONException.stopLoading();
        return;
      case 3:
        jSONException.reload();
        return;
      case 2:
        jSONException.goForward();
        return;
      case 1:
        break;
    } 
    jSONException.goBack();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "allowFileAccess")
  public void setAllowFileAccess(WebView paramWebView, Boolean paramBoolean) {
    boolean bool;
    WebSettings webSettings = paramWebView.getSettings();
    if (paramBoolean != null && paramBoolean.booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    webSettings.setAllowFileAccess(bool);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "allowFileAccessFromFileURLs")
  public void setAllowFileAccessFromFileURLs(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setAllowFileAccessFromFileURLs(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "allowUniversalAccessFromFileURLs")
  public void setAllowUniversalAccessFromFileURLs(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setAllowUniversalAccessFromFileURLs(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "allowsFullscreenVideo")
  public void setAllowsFullscreenVideo(WebView paramWebView, Boolean paramBoolean) {
    boolean bool;
    if (paramBoolean != null && paramBoolean.booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.mAllowsFullscreenVideo = bool;
    setupWebChromeClient((ReactContext)paramWebView.getContext(), paramWebView);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "applicationNameForUserAgent")
  public void setApplicationNameForUserAgent(WebView paramWebView, String paramString) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 61
    //   4: getstatic android/os/Build$VERSION.SDK_INT : I
    //   7: bipush #17
    //   9: if_icmplt -> 68
    //   12: aload_1
    //   13: invokevirtual getContext : ()Landroid/content/Context;
    //   16: invokestatic getDefaultUserAgent : (Landroid/content/Context;)Ljava/lang/String;
    //   19: astore_3
    //   20: new java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #4
    //   29: aload #4
    //   31: aload_3
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #4
    //   38: ldc_w ' '
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload #4
    //   47: aload_2
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload #4
    //   54: invokevirtual toString : ()Ljava/lang/String;
    //   57: astore_2
    //   58: goto -> 63
    //   61: aconst_null
    //   62: astore_2
    //   63: aload_0
    //   64: aload_2
    //   65: putfield mUserAgentWithApplicationName : Ljava/lang/String;
    //   68: aload_0
    //   69: aload_1
    //   70: invokevirtual setUserAgentString : (Landroid/webkit/WebView;)V
    //   73: return
  }
  
  @com.facebook.react.uimanager.e1.a(name = "cacheEnabled")
  public void setCacheEnabled(WebView paramWebView, boolean paramBoolean) {
    WebSettings webSettings;
    if (paramBoolean) {
      Context context = paramWebView.getContext();
      if (context != null) {
        paramWebView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
        paramWebView.getSettings().setCacheMode(-1);
        webSettings = paramWebView.getSettings();
        paramBoolean = true;
      } else {
        return;
      } 
    } else {
      webSettings.getSettings().setCacheMode(2);
      webSettings = webSettings.getSettings();
      paramBoolean = false;
    } 
    webSettings.setAppCacheEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "cacheMode")
  public void setCacheMode(WebView paramWebView, String paramString) {
    Integer integer;
    byte b1;
    switch (paramString.hashCode()) {
      default:
        b1 = -1;
        break;
      case 1548620642:
        if (paramString.equals("LOAD_CACHE_ONLY")) {
          b1 = 0;
          break;
        } 
      case -873877826:
        if (paramString.equals("LOAD_CACHE_ELSE_NETWORK")) {
          b1 = 1;
          break;
        } 
      case -1215135800:
        if (paramString.equals("LOAD_DEFAULT")) {
          b1 = 3;
          break;
        } 
      case -2059164003:
        if (paramString.equals("LOAD_NO_CACHE")) {
          b1 = 2;
          break;
        } 
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 != 2) {
          integer = Integer.valueOf(-1);
        } else {
          integer = Integer.valueOf(2);
        } 
      } else {
        integer = Integer.valueOf(1);
      } 
    } else {
      integer = Integer.valueOf(3);
    } 
    paramWebView.getSettings().setCacheMode(integer.intValue());
  }
  
  @com.facebook.react.uimanager.e1.a(name = "domStorageEnabled")
  public void setDomStorageEnabled(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setDomStorageEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "geolocationEnabled")
  public void setGeolocationEnabled(WebView paramWebView, Boolean paramBoolean) {
    boolean bool;
    WebSettings webSettings = paramWebView.getSettings();
    if (paramBoolean != null && paramBoolean.booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    webSettings.setGeolocationEnabled(bool);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "androidHardwareAccelerationDisabled")
  public void setHardwareAccelerationDisabled(WebView paramWebView, boolean paramBoolean) {
    if (paramBoolean)
      paramWebView.setLayerType(1, null); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "incognito")
  public void setIncognito(WebView paramWebView, boolean paramBoolean) {
    if (!paramBoolean)
      return; 
    if (Build.VERSION.SDK_INT >= 21) {
      CookieManager.getInstance().removeAllCookies(null);
    } else {
      CookieManager.getInstance().removeAllCookie();
    } 
    paramWebView.getSettings().setCacheMode(2);
    paramWebView.getSettings().setAppCacheEnabled(false);
    paramWebView.clearHistory();
    paramWebView.clearCache(true);
    paramWebView.clearFormData();
    paramWebView.getSettings().setSavePassword(false);
    paramWebView.getSettings().setSaveFormData(false);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "injectedJavaScript")
  public void setInjectedJavaScript(WebView paramWebView, String paramString) {
    ((f)paramWebView).setInjectedJavaScript(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "injectedJavaScriptBeforeContentLoaded")
  public void setInjectedJavaScriptBeforeContentLoaded(WebView paramWebView, String paramString) {
    ((f)paramWebView).setInjectedJavaScriptBeforeContentLoaded(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
  public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(WebView paramWebView, boolean paramBoolean) {
    ((f)paramWebView).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "injectedJavaScriptForMainFrameOnly")
  public void setInjectedJavaScriptForMainFrameOnly(WebView paramWebView, boolean paramBoolean) {
    ((f)paramWebView).setInjectedJavaScriptForMainFrameOnly(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "javaScriptCanOpenWindowsAutomatically")
  public void setJavaScriptCanOpenWindowsAutomatically(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "javaScriptEnabled")
  public void setJavaScriptEnabled(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "androidLayerType")
  public void setLayerType(WebView paramWebView, String paramString) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual hashCode : ()I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: iload_3
    //   9: ldc_w 116909544
    //   12: if_icmpeq -> 40
    //   15: iload_3
    //   16: ldc_w 1319330215
    //   19: if_icmpeq -> 25
    //   22: goto -> 55
    //   25: aload_2
    //   26: ldc_w 'software'
    //   29: invokevirtual equals : (Ljava/lang/Object;)Z
    //   32: ifeq -> 55
    //   35: iconst_1
    //   36: istore_3
    //   37: goto -> 57
    //   40: aload_2
    //   41: ldc_w 'hardware'
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 55
    //   50: iconst_0
    //   51: istore_3
    //   52: goto -> 57
    //   55: iconst_m1
    //   56: istore_3
    //   57: iload_3
    //   58: ifeq -> 77
    //   61: iload_3
    //   62: iconst_1
    //   63: if_icmpeq -> 72
    //   66: iload #4
    //   68: istore_3
    //   69: goto -> 79
    //   72: iconst_1
    //   73: istore_3
    //   74: goto -> 79
    //   77: iconst_2
    //   78: istore_3
    //   79: aload_1
    //   80: iload_3
    //   81: aconst_null
    //   82: invokevirtual setLayerType : (ILandroid/graphics/Paint;)V
    //   85: return
  }
  
  @com.facebook.react.uimanager.e1.a(name = "mediaPlaybackRequiresUserAction")
  @TargetApi(17)
  public void setMediaPlaybackRequiresUserAction(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "messagingEnabled")
  public void setMessagingEnabled(WebView paramWebView, boolean paramBoolean) {
    ((f)paramWebView).setMessagingEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "messagingModuleName")
  public void setMessagingModuleName(WebView paramWebView, String paramString) {
    ((f)paramWebView).setMessagingModuleName(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "mixedContentMode")
  public void setMixedContentMode(WebView paramWebView, String paramString) {
    if (Build.VERSION.SDK_INT >= 21) {
      WebSettings webSettings;
      byte b1;
      if (paramString == null || "never".equals(paramString)) {
        webSettings = paramWebView.getSettings();
        b1 = 1;
      } else if ("always".equals(paramString)) {
        webSettings = webSettings.getSettings();
        b1 = 0;
      } else if ("compatibility".equals(paramString)) {
        webSettings = webSettings.getSettings();
        b1 = 2;
      } else {
        return;
      } 
      webSettings.setMixedContentMode(b1);
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "onContentSizeChange")
  public void setOnContentSizeChange(WebView paramWebView, boolean paramBoolean) {
    ((f)paramWebView).setSendContentSizeChangeEvents(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "onScroll")
  public void setOnScroll(WebView paramWebView, boolean paramBoolean) {
    ((f)paramWebView).setHasScrollEvent(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "overScrollMode")
  public void setOverScrollMode(WebView paramWebView, String paramString) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual hashCode : ()I
    //   4: istore_3
    //   5: iload_3
    //   6: ldc_w -1414557169
    //   9: if_icmpeq -> 58
    //   12: iload_3
    //   13: ldc_w 104712844
    //   16: if_icmpeq -> 44
    //   19: iload_3
    //   20: ldc_w 951530617
    //   23: if_icmpeq -> 29
    //   26: goto -> 73
    //   29: aload_2
    //   30: ldc_w 'content'
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: ifeq -> 73
    //   39: iconst_1
    //   40: istore_3
    //   41: goto -> 75
    //   44: aload_2
    //   45: ldc 'never'
    //   47: invokevirtual equals : (Ljava/lang/Object;)Z
    //   50: ifeq -> 73
    //   53: iconst_0
    //   54: istore_3
    //   55: goto -> 75
    //   58: aload_2
    //   59: ldc_w 'always'
    //   62: invokevirtual equals : (Ljava/lang/Object;)Z
    //   65: ifeq -> 73
    //   68: iconst_2
    //   69: istore_3
    //   70: goto -> 75
    //   73: iconst_m1
    //   74: istore_3
    //   75: iload_3
    //   76: ifeq -> 100
    //   79: iload_3
    //   80: iconst_1
    //   81: if_icmpeq -> 92
    //   84: iconst_0
    //   85: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   88: astore_2
    //   89: goto -> 105
    //   92: iconst_1
    //   93: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   96: astore_2
    //   97: goto -> 105
    //   100: iconst_2
    //   101: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   104: astore_2
    //   105: aload_1
    //   106: aload_2
    //   107: invokevirtual intValue : ()I
    //   110: invokevirtual setOverScrollMode : (I)V
    //   113: return
  }
  
  @com.facebook.react.uimanager.e1.a(name = "saveFormDataDisabled")
  public void setSaveFormDataDisabled(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setSaveFormData(paramBoolean ^ true);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "scalesPageToFit")
  public void setScalesPageToFit(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setLoadWithOverviewMode(paramBoolean);
    paramWebView.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "showsHorizontalScrollIndicator")
  public void setShowsHorizontalScrollIndicator(WebView paramWebView, boolean paramBoolean) {
    paramWebView.setHorizontalScrollBarEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "showsVerticalScrollIndicator")
  public void setShowsVerticalScrollIndicator(WebView paramWebView, boolean paramBoolean) {
    paramWebView.setVerticalScrollBarEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "source")
  public void setSource(WebView paramWebView, ReadableMap paramReadableMap) {
    if (paramReadableMap != null) {
      String str;
      if (paramReadableMap.hasKey("html")) {
        String str1 = paramReadableMap.getString("html");
        if (paramReadableMap.hasKey("baseUrl")) {
          str = paramReadableMap.getString("baseUrl");
        } else {
          str = "";
        } 
        paramWebView.loadDataWithBaseURL(str, str1, "text/html", "UTF-8", null);
        return;
      } 
      if (str.hasKey("uri")) {
        byte[] arrayOfByte;
        String str2 = str.getString("uri");
        String str1 = paramWebView.getUrl();
        if (str1 != null && str1.equals(str2))
          return; 
        if (str.hasKey("method") && str.getString("method").equalsIgnoreCase("POST")) {
          byte[] arrayOfByte1;
          str1 = null;
          if (str.hasKey("body")) {
            str = str.getString("body");
            try {
              arrayOfByte1 = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unsupportedEncodingException) {
              arrayOfByte1 = str.getBytes();
            } 
          } 
          arrayOfByte = arrayOfByte1;
          if (arrayOfByte1 == null)
            arrayOfByte = new byte[0]; 
          paramWebView.postUrl(str2, arrayOfByte);
          return;
        } 
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        if (arrayOfByte.hasKey("headers")) {
          ReadableMap readableMap = arrayOfByte.getMap("headers");
          ReadableMapKeySetIterator readableMapKeySetIterator = readableMap.keySetIterator();
          while (readableMapKeySetIterator.hasNextKey()) {
            String str3 = readableMapKeySetIterator.nextKey();
            if ("user-agent".equals(str3.toLowerCase(Locale.ENGLISH))) {
              if (paramWebView.getSettings() != null)
                paramWebView.getSettings().setUserAgentString(readableMap.getString(str3)); 
              continue;
            } 
            hashMap.put(str3, readableMap.getString(str3));
          } 
        } 
        paramWebView.loadUrl(str2, hashMap);
        return;
      } 
    } 
    paramWebView.loadUrl("about:blank");
  }
  
  @com.facebook.react.uimanager.e1.a(name = "setSupportMultipleWindows")
  public void setSupportMultipleWindows(WebView paramWebView, boolean paramBoolean) {
    paramWebView.getSettings().setSupportMultipleWindows(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textZoom")
  public void setTextZoom(WebView paramWebView, int paramInt) {
    paramWebView.getSettings().setTextZoom(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "thirdPartyCookiesEnabled")
  public void setThirdPartyCookiesEnabled(WebView paramWebView, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 21)
      CookieManager.getInstance().setAcceptThirdPartyCookies(paramWebView, paramBoolean); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "urlPrefixesForDefaultIntent")
  public void setUrlPrefixesForDefaultIntent(WebView paramWebView, ReadableArray paramReadableArray) {
    g g = ((f)paramWebView).getRNCWebViewClient();
    if (g != null && paramReadableArray != null)
      g.a(paramReadableArray); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "userAgent")
  public void setUserAgent(WebView paramWebView, String paramString) {
    if (paramString == null)
      paramString = null; 
    this.mUserAgent = paramString;
    setUserAgentString(paramWebView);
  }
  
  protected void setUserAgentString(WebView paramWebView) {
    String str;
    WebSettings webSettings;
    if (this.mUserAgent != null) {
      webSettings = paramWebView.getSettings();
      str = this.mUserAgent;
    } else if (this.mUserAgentWithApplicationName != null) {
      webSettings = str.getSettings();
      str = this.mUserAgentWithApplicationName;
    } else {
      if (Build.VERSION.SDK_INT >= 17)
        str.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(str.getContext())); 
      return;
    } 
    webSettings.setUserAgentString(str);
  }
  
  protected void setupWebChromeClient(ReactContext paramReactContext, WebView paramWebView) {
    if (this.mAllowsFullscreenVideo) {
      this.mWebChromeClient = new c(this, paramReactContext, paramWebView, paramReactContext.getCurrentActivity().getRequestedOrientation());
    } else {
      e e1 = this.mWebChromeClient;
      if (e1 != null)
        e1.onHideCustomView(); 
      this.mWebChromeClient = new d(this, paramReactContext, paramWebView);
    } 
    paramWebView.setWebChromeClient(this.mWebChromeClient);
  }
  
  class a implements b {
    a(RNCWebViewManager this$0) {}
    
    public void a(WebView param1WebView) {}
  }
  
  class b implements DownloadListener {
    b(RNCWebViewManager this$0, RNCWebViewManager.f param1f, k0 param1k0) {}
    
    public void onDownloadStart(String param1String1, String param1String2, String param1String3, String param1String4, long param1Long) {
      this.a.setIgnoreErrFailedForThisURL(param1String1);
      RNCWebViewModule rNCWebViewModule = RNCWebViewManager.getModule((ReactContext)this.b);
      DownloadManager.Request request = new DownloadManager.Request(Uri.parse(param1String1));
      param1String3 = URLUtil.guessFileName(param1String1, param1String3, param1String4);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Downloading ");
      stringBuilder.append(param1String3);
      String str = stringBuilder.toString();
      try {
        URL uRL = new URL(param1String1);
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(uRL.getProtocol());
        stringBuilder1.append("://");
        stringBuilder1.append(uRL.getHost());
        String str1 = stringBuilder1.toString();
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str1));
      } catch (MalformedURLException malformedURLException) {
        PrintStream printStream = System.out;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Error getting cookie for DownloadManager: ");
        stringBuilder1.append(malformedURLException.toString());
        printStream.println(stringBuilder1.toString());
        malformedURLException.printStackTrace();
      } 
      request.addRequestHeader("User-Agent", param1String2);
      request.setTitle(param1String3);
      request.setDescription(str);
      request.allowScanningByMediaScanner();
      request.setNotificationVisibility(1);
      request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, param1String3);
      rNCWebViewModule.setDownloadRequest(request);
      if (rNCWebViewModule.grantFileDownloaderPermissions())
        rNCWebViewModule.downloadFile(); 
    }
  }
  
  class c extends e {
    c(RNCWebViewManager this$0, ReactContext param1ReactContext, WebView param1WebView, int param1Int) {
      super(param1ReactContext, param1WebView);
    }
    
    public Bitmap getDefaultVideoPoster() {
      return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }
    
    public void onHideCustomView() {
      View view;
      if (this.e == null)
        return; 
      ViewGroup viewGroup = a();
      if (viewGroup.getRootView() != this.d.getRootView()) {
        view = this.d.getRootView();
      } else {
        view = this.d;
      } 
      view.setVisibility(0);
      if (Build.VERSION.SDK_INT >= 19)
        this.c.getCurrentActivity().getWindow().clearFlags(512); 
      viewGroup.removeView(this.e);
      this.f.onCustomViewHidden();
      this.e = null;
      this.f = null;
      this.c.getCurrentActivity().setRequestedOrientation(this.i);
      this.c.removeLifecycleEventListener(this);
    }
    
    public void onShowCustomView(View param1View, WebChromeClient.CustomViewCallback param1CustomViewCallback) {
      View view;
      if (this.e != null) {
        param1CustomViewCallback.onCustomViewHidden();
        return;
      } 
      this.e = param1View;
      this.f = param1CustomViewCallback;
      this.c.getCurrentActivity().setRequestedOrientation(-1);
      if (Build.VERSION.SDK_INT >= 19) {
        this.e.setSystemUiVisibility(7942);
        this.c.getCurrentActivity().getWindow().setFlags(512, 512);
      } 
      this.e.setBackgroundColor(-16777216);
      ViewGroup viewGroup = a();
      viewGroup.addView(this.e, (ViewGroup.LayoutParams)RNCWebViewManager.e.h);
      if (viewGroup.getRootView() != this.d.getRootView()) {
        view = this.d.getRootView();
      } else {
        view = this.d;
      } 
      view.setVisibility(8);
      this.c.addLifecycleEventListener(this);
    }
  }
  
  class d extends e {
    d(RNCWebViewManager this$0, ReactContext param1ReactContext, WebView param1WebView) {
      super(param1ReactContext, param1WebView);
    }
    
    public Bitmap getDefaultVideoPoster() {
      return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }
  }
  
  protected static class e extends WebChromeClient implements LifecycleEventListener {
    protected static final FrameLayout.LayoutParams h = new FrameLayout.LayoutParams(-1, -1, 17);
    
    protected ReactContext c;
    
    protected View d;
    
    protected View e;
    
    protected WebChromeClient.CustomViewCallback f;
    
    protected RNCWebViewManager.f.b g = null;
    
    public e(ReactContext param1ReactContext, WebView param1WebView) {
      this.c = param1ReactContext;
      this.d = (View)param1WebView;
    }
    
    protected ViewGroup a() {
      return (ViewGroup)this.c.getCurrentActivity().findViewById(16908290);
    }
    
    public void a(RNCWebViewManager.f.b param1b) {
      this.g = param1b;
    }
    
    public boolean onConsoleMessage(ConsoleMessage param1ConsoleMessage) {
      return true;
    }
    
    public boolean onCreateWindow(WebView param1WebView, boolean param1Boolean1, boolean param1Boolean2, Message param1Message) {
      param1WebView = new WebView(param1WebView.getContext());
      ((WebView.WebViewTransport)param1Message.obj).setWebView(param1WebView);
      param1Message.sendToTarget();
      return true;
    }
    
    public void onGeolocationPermissionsShowPrompt(String param1String, GeolocationPermissions.Callback param1Callback) {
      param1Callback.invoke(param1String, true, false);
    }
    
    public void onHostDestroy() {}
    
    public void onHostPause() {}
    
    public void onHostResume() {
      if (Build.VERSION.SDK_INT >= 19) {
        View view = this.e;
        if (view != null && view.getSystemUiVisibility() != 7942)
          this.e.setSystemUiVisibility(7942); 
      } 
    }
    
    @TargetApi(21)
    public void onPermissionRequest(PermissionRequest param1PermissionRequest) {
      int j;
      String[] arrayOfString = param1PermissionRequest.getResources();
      ArrayList<String> arrayList1 = new ArrayList();
      ArrayList<String> arrayList2 = new ArrayList();
      byte b1 = 0;
      int i = 0;
      while (true) {
        j = b1;
        if (i < arrayOfString.length) {
          if (arrayOfString[i].equals("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList1.add("android.permission.RECORD_AUDIO");
          } else if (arrayOfString[i].equals("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList1.add("android.permission.CAMERA");
          } else if (arrayOfString[i].equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
            arrayList1.add("android.webkit.resource.PROTECTED_MEDIA_ID");
          } 
          i++;
          continue;
        } 
        break;
      } 
      while (j < arrayList1.size()) {
        if (b.g.e.a.a((Context)this.c, arrayList1.get(j)) == 0)
          if (((String)arrayList1.get(j)).equals("android.permission.RECORD_AUDIO")) {
            arrayList2.add("android.webkit.resource.AUDIO_CAPTURE");
          } else if (((String)arrayList1.get(j)).equals("android.permission.CAMERA")) {
            arrayList2.add("android.webkit.resource.VIDEO_CAPTURE");
          } else if (((String)arrayList1.get(j)).equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
            arrayList2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
          }  
        j++;
      } 
      if (arrayList2.isEmpty()) {
        param1PermissionRequest.deny();
        return;
      } 
      param1PermissionRequest.grant(arrayList2.<String>toArray(new String[arrayList2.size()]));
    }
    
    public void onProgressChanged(WebView param1WebView, int param1Int) {
      super.onProgressChanged(param1WebView, param1Int);
      String str = param1WebView.getUrl();
      if (this.g.a())
        return; 
      WritableMap writableMap = Arguments.createMap();
      writableMap.putDouble("target", param1WebView.getId());
      writableMap.putString("title", param1WebView.getTitle());
      writableMap.putString("url", str);
      writableMap.putBoolean("canGoBack", param1WebView.canGoBack());
      writableMap.putBoolean("canGoForward", param1WebView.canGoForward());
      writableMap.putDouble("progress", (param1Int / 100.0F));
      ((RNCWebViewManager.f)param1WebView).a(param1WebView, (com.facebook.react.uimanager.events.c)new d(param1WebView.getId(), writableMap));
    }
    
    @TargetApi(21)
    public boolean onShowFileChooser(WebView param1WebView, ValueCallback<Uri[]> param1ValueCallback, WebChromeClient.FileChooserParams param1FileChooserParams) {
      String[] arrayOfString = param1FileChooserParams.getAcceptTypes();
      int i = param1FileChooserParams.getMode();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      return RNCWebViewManager.getModule(this.c).startPhotoPickerIntent(param1ValueCallback, arrayOfString, bool);
    }
  }
  
  protected static class f extends WebView implements LifecycleEventListener {
    protected String c;
    
    protected String d;
    
    protected boolean e = false;
    
    protected String f;
    
    protected RNCWebViewManager.g g;
    
    protected CatalystInstance h;
    
    protected boolean i = false;
    
    private com.facebook.react.views.scroll.b j;
    
    protected boolean k = false;
    
    protected b l;
    
    WebChromeClient m;
    
    public f(k0 param1k0) {
      super((Context)param1k0);
      d();
      this.l = new b();
    }
    
    protected c a(f param1f) {
      return new c(this, param1f);
    }
    
    public void a() {
      if (getSettings().getJavaScriptEnabled()) {
        String str = this.c;
        if (str != null && !TextUtils.isEmpty(str)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("(function() {\n");
          stringBuilder.append(this.c);
          stringBuilder.append(";\n})();");
          a(stringBuilder.toString());
        } 
      } 
    }
    
    protected void a(WebView param1WebView, com.facebook.react.uimanager.events.c param1c) {
      ((UIManagerModule)((ReactContext)param1WebView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(param1c);
    }
    
    protected void a(String param1String) {
      if (Build.VERSION.SDK_INT >= 19) {
        evaluateJavascript(param1String, null);
        return;
      } 
      try {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:");
        stringBuilder.append(URLEncoder.encode(param1String, "UTF-8"));
        loadUrl(stringBuilder.toString());
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new RuntimeException(unsupportedEncodingException);
      } 
    }
    
    protected void a(String param1String, WritableMap param1WritableMap) {
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      writableNativeMap.putMap("nativeEvent", (ReadableMap)param1WritableMap);
      WritableNativeArray writableNativeArray = new WritableNativeArray();
      writableNativeArray.pushMap((ReadableMap)writableNativeMap);
      this.h.callFunction(this.f, param1String, (NativeArray)writableNativeArray);
    }
    
    public void b() {
      if (getSettings().getJavaScriptEnabled()) {
        String str = this.d;
        if (str != null && !TextUtils.isEmpty(str)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("(function() {\n");
          stringBuilder.append(this.d);
          stringBuilder.append(";\n})();");
          a(stringBuilder.toString());
        } 
      } 
    }
    
    public void b(String param1String) {
      ReactContext reactContext = (ReactContext)getContext();
      if (this.g != null) {
        post(new a(this, this, param1String, this));
        return;
      } 
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("data", param1String);
      if (this.h != null) {
        a("onMessage", writableMap);
        return;
      } 
      a(this, (com.facebook.react.uimanager.events.c)new f(getId(), writableMap));
    }
    
    protected void c() {
      setWebViewClient(null);
      destroy();
    }
    
    protected void d() {
      ReactContext reactContext = (ReactContext)getContext();
      if (reactContext != null)
        this.h = reactContext.getCatalystInstance(); 
    }
    
    public void destroy() {
      WebChromeClient webChromeClient = this.m;
      if (webChromeClient != null)
        webChromeClient.onHideCustomView(); 
      super.destroy();
    }
    
    public RNCWebViewManager.g getRNCWebViewClient() {
      return this.g;
    }
    
    public void onHostDestroy() {
      c();
    }
    
    public void onHostPause() {}
    
    public void onHostResume() {}
    
    protected void onScrollChanged(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      super.onScrollChanged(param1Int1, param1Int2, param1Int3, param1Int4);
      if (!this.k)
        return; 
      if (this.j == null)
        this.j = new com.facebook.react.views.scroll.b(); 
      if (this.j.a(param1Int1, param1Int2))
        a(this, (com.facebook.react.uimanager.events.c)h.b(getId(), i.e, param1Int1, param1Int2, this.j.a(), this.j.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight())); 
    }
    
    protected void onSizeChanged(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      super.onSizeChanged(param1Int1, param1Int2, param1Int3, param1Int4);
      if (this.i)
        a(this, (com.facebook.react.uimanager.events.c)new com.facebook.react.uimanager.events.b(getId(), param1Int1, param1Int2)); 
    }
    
    public void setHasScrollEvent(boolean param1Boolean) {
      this.k = param1Boolean;
    }
    
    public void setIgnoreErrFailedForThisURL(String param1String) {
      this.g.a(param1String);
    }
    
    public void setInjectedJavaScript(String param1String) {
      this.c = param1String;
    }
    
    public void setInjectedJavaScriptBeforeContentLoaded(String param1String) {
      this.d = param1String;
    }
    
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean param1Boolean) {}
    
    public void setInjectedJavaScriptForMainFrameOnly(boolean param1Boolean) {}
    
    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean param1Boolean) {
      if (this.e == param1Boolean)
        return; 
      this.e = param1Boolean;
      if (param1Boolean) {
        addJavascriptInterface(a(this), "ReactNativeWebView");
        return;
      } 
      removeJavascriptInterface("ReactNativeWebView");
    }
    
    public void setMessagingModuleName(String param1String) {
      this.f = param1String;
    }
    
    public void setSendContentSizeChangeEvents(boolean param1Boolean) {
      this.i = param1Boolean;
    }
    
    public void setWebChromeClient(WebChromeClient param1WebChromeClient) {
      this.m = param1WebChromeClient;
      super.setWebChromeClient(param1WebChromeClient);
      if (param1WebChromeClient instanceof RNCWebViewManager.e)
        ((RNCWebViewManager.e)param1WebChromeClient).a(this.l); 
    }
    
    public void setWebViewClient(WebViewClient param1WebViewClient) {
      super.setWebViewClient(param1WebViewClient);
      if (param1WebViewClient instanceof RNCWebViewManager.g) {
        this.g = (RNCWebViewManager.g)param1WebViewClient;
        this.g.a(this.l);
      } 
    }
    
    class a implements Runnable {
      a(RNCWebViewManager.f this$0, WebView param2WebView, String param2String, RNCWebViewManager.f param2f1) {}
      
      public void run() {
        RNCWebViewManager.g g = this.f.g;
        if (g == null)
          return; 
        WebView webView1 = this.c;
        WritableMap writableMap = g.a(webView1, webView1.getUrl());
        writableMap.putString("data", this.d);
        webView1 = this.f;
        if (((RNCWebViewManager.f)webView1).h != null) {
          this.e.a("onMessage", writableMap);
          return;
        } 
        WebView webView2 = this.c;
        webView1.a(webView2, (com.facebook.react.uimanager.events.c)new f(webView2.getId(), writableMap));
      }
    }
    
    protected static class b {
      private boolean a = false;
      
      public void a(boolean param2Boolean) {
        this.a = param2Boolean;
      }
      
      public boolean a() {
        return this.a;
      }
    }
    
    protected class c {
      RNCWebViewManager.f a;
      
      c(RNCWebViewManager.f this$0, RNCWebViewManager.f param2f1) {
        this.a = param2f1;
      }
      
      @JavascriptInterface
      public void postMessage(String param2String) {
        this.a.b(param2String);
      }
    }
  }
  
  class a implements Runnable {
    a(RNCWebViewManager this$0, WebView param1WebView, String param1String, RNCWebViewManager.f param1f1) {}
    
    public void run() {
      RNCWebViewManager.g g = this.f.g;
      if (g == null)
        return; 
      WebView webView1 = this.c;
      WritableMap writableMap = g.a(webView1, webView1.getUrl());
      writableMap.putString("data", this.d);
      webView1 = this.f;
      if (((RNCWebViewManager.f)webView1).h != null) {
        this.e.a("onMessage", writableMap);
        return;
      } 
      WebView webView2 = this.c;
      webView1.a(webView2, (com.facebook.react.uimanager.events.c)new f(webView2.getId(), writableMap));
    }
  }
  
  protected static class b {
    private boolean a = false;
    
    public void a(boolean param1Boolean) {
      this.a = param1Boolean;
    }
    
    public boolean a() {
      return this.a;
    }
  }
  
  protected class c {
    RNCWebViewManager.f a;
    
    c(RNCWebViewManager this$0, RNCWebViewManager.f param1f1) {
      this.a = param1f1;
    }
    
    @JavascriptInterface
    public void postMessage(String param1String) {
      this.a.b(param1String);
    }
  }
  
  protected static class g extends WebViewClient {
    protected boolean a = false;
    
    protected RNCWebViewManager.f.b b = null;
    
    protected String c = null;
    
    protected WritableMap a(WebView param1WebView, String param1String) {
      boolean bool;
      WritableMap writableMap = Arguments.createMap();
      writableMap.putDouble("target", param1WebView.getId());
      writableMap.putString("url", param1String);
      if (!this.a && param1WebView.getProgress() != 100) {
        bool = true;
      } else {
        bool = false;
      } 
      writableMap.putBoolean("loading", bool);
      writableMap.putString("title", param1WebView.getTitle());
      writableMap.putBoolean("canGoBack", param1WebView.canGoBack());
      writableMap.putBoolean("canGoForward", param1WebView.canGoForward());
      return writableMap;
    }
    
    public void a(ReadableArray param1ReadableArray) {}
    
    public void a(RNCWebViewManager.f.b param1b) {
      this.b = param1b;
    }
    
    public void a(String param1String) {
      this.c = param1String;
    }
    
    protected void b(WebView param1WebView, String param1String) {
      ((RNCWebViewManager.f)param1WebView).a(param1WebView, (com.facebook.react.uimanager.events.c)new c(param1WebView.getId(), a(param1WebView, param1String)));
    }
    
    public void onPageFinished(WebView param1WebView, String param1String) {
      super.onPageFinished(param1WebView, param1String);
      if (!this.a) {
        ((RNCWebViewManager.f)param1WebView).a();
        b(param1WebView, param1String);
      } 
    }
    
    public void onPageStarted(WebView param1WebView, String param1String, Bitmap param1Bitmap) {
      super.onPageStarted(param1WebView, param1String, param1Bitmap);
      this.a = false;
      RNCWebViewManager.f f = (RNCWebViewManager.f)param1WebView;
      f.b();
      f.a(param1WebView, (com.facebook.react.uimanager.events.c)new e(param1WebView.getId(), a(param1WebView, param1String)));
    }
    
    public void onReceivedError(WebView param1WebView, int param1Int, String param1String1, String param1String2) {
      String str = this.c;
      if (str != null && param1String2.equals(str) && param1Int == -1 && param1String1.equals("net::ERR_FAILED")) {
        a((String)null);
        return;
      } 
      super.onReceivedError(param1WebView, param1Int, param1String1, param1String2);
      this.a = true;
      b(param1WebView, param1String2);
      WritableMap writableMap = a(param1WebView, param1String2);
      writableMap.putDouble("code", param1Int);
      writableMap.putString("description", param1String1);
      ((RNCWebViewManager.f)param1WebView).a(param1WebView, (com.facebook.react.uimanager.events.c)new b(param1WebView.getId(), writableMap));
    }
    
    public void onReceivedHttpError(WebView param1WebView, WebResourceRequest param1WebResourceRequest, WebResourceResponse param1WebResourceResponse) {
      super.onReceivedHttpError(param1WebView, param1WebResourceRequest, param1WebResourceResponse);
      if (param1WebResourceRequest.isForMainFrame()) {
        WritableMap writableMap = a(param1WebView, param1WebResourceRequest.getUrl().toString());
        writableMap.putInt("statusCode", param1WebResourceResponse.getStatusCode());
        writableMap.putString("description", param1WebResourceResponse.getReasonPhrase());
        ((RNCWebViewManager.f)param1WebView).a(param1WebView, (com.facebook.react.uimanager.events.c)new a(param1WebView.getId(), writableMap));
      } 
    }
    
    public void onReceivedSslError(WebView param1WebView, SslErrorHandler param1SslErrorHandler, SslError param1SslError) {
      StringBuilder stringBuilder1;
      String str1;
      String str3 = param1WebView.getUrl();
      String str2 = param1SslError.getUrl();
      param1SslErrorHandler.cancel();
      if (!str3.equalsIgnoreCase(str2)) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Resource blocked from loading due to SSL error. Blocked URL: ");
        stringBuilder1.append(str2);
        Log.w("RNCWebViewManager", stringBuilder1.toString());
        return;
      } 
      int i = param1SslError.getPrimaryError();
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i != 4) {
                if (i != 5) {
                  str1 = "Unknown SSL Error";
                } else {
                  str1 = "A generic error occurred";
                } 
              } else {
                str1 = "The date of the certificate is invalid";
              } 
            } else {
              str1 = "The certificate authority is not trusted";
            } 
          } else {
            str1 = "Hostname mismatch";
          } 
        } else {
          str1 = "The certificate has expired";
        } 
      } else {
        str1 = "The certificate is not yet valid";
      } 
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("SSL error: ");
      stringBuilder2.append(str1);
      onReceivedError((WebView)stringBuilder1, i, stringBuilder2.toString(), str2);
    }
    
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView param1WebView, RenderProcessGoneDetail param1RenderProcessGoneDetail) {
      if (Build.VERSION.SDK_INT < 26)
        return false; 
      super.onRenderProcessGone(param1WebView, param1RenderProcessGoneDetail);
      if (param1RenderProcessGoneDetail.didCrash()) {
        Log.e("RNCWebViewManager", "The WebView rendering process crashed.");
      } else {
        Log.w("RNCWebViewManager", "The WebView rendering process was killed by the system.");
      } 
      if (param1WebView == null)
        return true; 
      WritableMap writableMap = a(param1WebView, param1WebView.getUrl());
      writableMap.putBoolean("didCrash", param1RenderProcessGoneDetail.didCrash());
      ((RNCWebViewManager.f)param1WebView).a(param1WebView, (com.facebook.react.uimanager.events.c)new g(param1WebView.getId(), writableMap));
      return true;
    }
    
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView param1WebView, WebResourceRequest param1WebResourceRequest) {
      return shouldOverrideUrlLoading(param1WebView, param1WebResourceRequest.getUrl().toString());
    }
    
    public boolean shouldOverrideUrlLoading(WebView param1WebView, String param1String) {
      // Byte code:
      //   0: aload_1
      //   1: checkcast com/reactnativecommunity/webview/RNCWebViewManager$f
      //   4: astore #7
      //   6: aload_1
      //   7: invokevirtual getContext : ()Landroid/content/Context;
      //   10: checkcast com/facebook/react/bridge/ReactContext
      //   13: invokevirtual getJavaScriptContextHolder : ()Lcom/facebook/react/bridge/JavaScriptContextHolder;
      //   16: invokevirtual get : ()J
      //   19: lstore #4
      //   21: iconst_1
      //   22: istore #6
      //   24: lload #4
      //   26: lconst_0
      //   27: lcmp
      //   28: ifne -> 36
      //   31: iconst_1
      //   32: istore_3
      //   33: goto -> 38
      //   36: iconst_0
      //   37: istore_3
      //   38: iload_3
      //   39: ifne -> 233
      //   42: aload #7
      //   44: getfield h : Lcom/facebook/react/bridge/CatalystInstance;
      //   47: ifnull -> 233
      //   50: getstatic com/reactnativecommunity/webview/RNCWebViewModule.shouldOverrideUrlLoadingLock : Lcom/reactnativecommunity/webview/RNCWebViewModule$d;
      //   53: invokevirtual a : ()Landroidx/core/util/c;
      //   56: astore #8
      //   58: aload #8
      //   60: getfield a : Ljava/lang/Object;
      //   63: checkcast java/lang/Integer
      //   66: invokevirtual intValue : ()I
      //   69: istore_3
      //   70: aload #8
      //   72: getfield b : Ljava/lang/Object;
      //   75: checkcast java/util/concurrent/atomic/AtomicReference
      //   78: astore #8
      //   80: aload_0
      //   81: aload_1
      //   82: aload_2
      //   83: invokevirtual a : (Landroid/webkit/WebView;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;
      //   86: astore_1
      //   87: aload_1
      //   88: ldc_w 'lockIdentifier'
      //   91: iload_3
      //   92: invokeinterface putInt : (Ljava/lang/String;I)V
      //   97: aload #7
      //   99: ldc_w 'onShouldStartLoadWithRequest'
      //   102: aload_1
      //   103: invokevirtual a : (Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
      //   106: aload #8
      //   108: monitorenter
      //   109: invokestatic elapsedRealtime : ()J
      //   112: lstore #4
      //   114: aload #8
      //   116: invokevirtual get : ()Ljava/lang/Object;
      //   119: getstatic com/reactnativecommunity/webview/RNCWebViewModule$d$a.c : Lcom/reactnativecommunity/webview/RNCWebViewModule$d$a;
      //   122: if_acmpne -> 172
      //   125: invokestatic elapsedRealtime : ()J
      //   128: lload #4
      //   130: lsub
      //   131: ldc2_w 250
      //   134: lcmp
      //   135: ifle -> 161
      //   138: ldc 'RNCWebViewManager'
      //   140: ldc_w 'Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.'
      //   143: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)V
      //   146: getstatic com/reactnativecommunity/webview/RNCWebViewModule.shouldOverrideUrlLoadingLock : Lcom/reactnativecommunity/webview/RNCWebViewModule$d;
      //   149: iload_3
      //   150: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   153: invokevirtual b : (Ljava/lang/Integer;)V
      //   156: aload #8
      //   158: monitorexit
      //   159: iconst_0
      //   160: ireturn
      //   161: aload #8
      //   163: ldc2_w 250
      //   166: invokevirtual wait : (J)V
      //   169: goto -> 114
      //   172: aload #8
      //   174: monitorexit
      //   175: aload #8
      //   177: invokevirtual get : ()Ljava/lang/Object;
      //   180: getstatic com/reactnativecommunity/webview/RNCWebViewModule$d$a.d : Lcom/reactnativecommunity/webview/RNCWebViewModule$d$a;
      //   183: if_acmpne -> 189
      //   186: goto -> 192
      //   189: iconst_0
      //   190: istore #6
      //   192: getstatic com/reactnativecommunity/webview/RNCWebViewModule.shouldOverrideUrlLoadingLock : Lcom/reactnativecommunity/webview/RNCWebViewModule$d;
      //   195: iload_3
      //   196: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   199: invokevirtual b : (Ljava/lang/Integer;)V
      //   202: iload #6
      //   204: ireturn
      //   205: astore_1
      //   206: aload #8
      //   208: monitorexit
      //   209: aload_1
      //   210: athrow
      //   211: astore_1
      //   212: ldc 'RNCWebViewManager'
      //   214: ldc_w 'shouldOverrideUrlLoading was interrupted while waiting for result.'
      //   217: aload_1
      //   218: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   221: getstatic com/reactnativecommunity/webview/RNCWebViewModule.shouldOverrideUrlLoadingLock : Lcom/reactnativecommunity/webview/RNCWebViewModule$d;
      //   224: iload_3
      //   225: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   228: invokevirtual b : (Ljava/lang/Integer;)V
      //   231: iconst_0
      //   232: ireturn
      //   233: ldc 'RNCWebViewManager'
      //   235: ldc_w 'Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.'
      //   238: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)V
      //   241: aload_0
      //   242: getfield b : Lcom/reactnativecommunity/webview/RNCWebViewManager$f$b;
      //   245: iconst_1
      //   246: invokevirtual a : (Z)V
      //   249: aload #7
      //   251: aload_1
      //   252: new com/reactnativecommunity/webview/c/h
      //   255: dup
      //   256: aload_1
      //   257: invokevirtual getId : ()I
      //   260: aload_0
      //   261: aload_1
      //   262: aload_2
      //   263: invokevirtual a : (Landroid/webkit/WebView;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;
      //   266: invokespecial <init> : (ILcom/facebook/react/bridge/WritableMap;)V
      //   269: invokevirtual a : (Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/c;)V
      //   272: iconst_1
      //   273: ireturn
      // Exception table:
      //   from	to	target	type
      //   106	109	211	java/lang/InterruptedException
      //   109	114	205	finally
      //   114	159	205	finally
      //   161	169	205	finally
      //   172	175	205	finally
      //   206	209	205	finally
      //   209	211	211	java/lang/InterruptedException
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/webview/RNCWebViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */