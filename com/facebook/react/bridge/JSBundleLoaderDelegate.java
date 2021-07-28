package com.facebook.react.bridge;

import android.content.res.AssetManager;

public interface JSBundleLoaderDelegate {
  void loadScriptFromAssets(AssetManager paramAssetManager, String paramString, boolean paramBoolean);
  
  void loadScriptFromFile(String paramString1, String paramString2, boolean paramBoolean);
  
  void setSourceURLs(String paramString1, String paramString2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSBundleLoaderDelegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */