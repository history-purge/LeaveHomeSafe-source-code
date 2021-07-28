package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.common.b;

public abstract class JSBundleLoader {
  public static JSBundleLoader createAssetLoader(final Context context, final String assetUrl, final boolean loadSynchronously) {
    return new JSBundleLoader() {
        public String loadScript(JSBundleLoaderDelegate param1JSBundleLoaderDelegate) {
          param1JSBundleLoaderDelegate.loadScriptFromAssets(context.getAssets(), assetUrl, loadSynchronously);
          return assetUrl;
        }
      };
  }
  
  public static JSBundleLoader createCachedBundleFromNetworkLoader(final String sourceURL, final String cachedFileLocation) {
    return new JSBundleLoader() {
        public String loadScript(JSBundleLoaderDelegate param1JSBundleLoaderDelegate) {
          try {
            param1JSBundleLoaderDelegate.loadScriptFromFile(cachedFileLocation, sourceURL, false);
            return sourceURL;
          } catch (Exception exception) {
            throw b.a(sourceURL, exception.getMessage(), exception);
          } 
        }
      };
  }
  
  public static JSBundleLoader createFileLoader(String paramString) {
    return createFileLoader(paramString, paramString, false);
  }
  
  public static JSBundleLoader createFileLoader(final String fileName, final String assetUrl, final boolean loadSynchronously) {
    return new JSBundleLoader() {
        public String loadScript(JSBundleLoaderDelegate param1JSBundleLoaderDelegate) {
          param1JSBundleLoaderDelegate.loadScriptFromFile(fileName, assetUrl, loadSynchronously);
          return fileName;
        }
      };
  }
  
  public static JSBundleLoader createRemoteDebuggerBundleLoader(final String proxySourceURL, final String realSourceURL) {
    return new JSBundleLoader() {
        public String loadScript(JSBundleLoaderDelegate param1JSBundleLoaderDelegate) {
          param1JSBundleLoaderDelegate.setSourceURLs(realSourceURL, proxySourceURL);
          return realSourceURL;
        }
      };
  }
  
  public abstract String loadScript(JSBundleLoaderDelegate paramJSBundleLoaderDelegate);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSBundleLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */