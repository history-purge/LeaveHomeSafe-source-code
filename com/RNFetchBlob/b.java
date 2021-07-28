package com.RNFetchBlob;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class b {
  public Boolean a;
  
  public String b;
  
  public String c;
  
  public ReadableMap d;
  
  public Boolean e;
  
  public Boolean f;
  
  public String g;
  
  public Boolean h;
  
  public Boolean i;
  
  public long j;
  
  public Boolean k;
  
  public Boolean l;
  
  public ReadableArray m;
  
  b(ReadableMap paramReadableMap) {
    boolean bool1 = false;
    Boolean bool3 = Boolean.valueOf(false);
    this.f = bool3;
    Boolean bool2 = Boolean.valueOf(true);
    this.i = bool2;
    this.j = 60000L;
    this.k = bool3;
    this.l = bool2;
    String str2 = null;
    this.m = null;
    if (paramReadableMap == null)
      return; 
    if (paramReadableMap.hasKey("fileCache")) {
      bool = paramReadableMap.getBoolean("fileCache");
    } else {
      bool = false;
    } 
    this.a = Boolean.valueOf(bool);
    if (paramReadableMap.hasKey("path")) {
      str1 = paramReadableMap.getString("path");
    } else {
      bool2 = null;
    } 
    this.b = (String)bool2;
    if (paramReadableMap.hasKey("appendExt")) {
      str1 = paramReadableMap.getString("appendExt");
    } else {
      str1 = "";
    } 
    this.c = str1;
    if (paramReadableMap.hasKey("trusty")) {
      bool = paramReadableMap.getBoolean("trusty");
    } else {
      bool = false;
    } 
    this.e = Boolean.valueOf(bool);
    if (paramReadableMap.hasKey("wifiOnly")) {
      bool = paramReadableMap.getBoolean("wifiOnly");
    } else {
      bool = false;
    } 
    this.f = Boolean.valueOf(bool);
    if (paramReadableMap.hasKey("addAndroidDownloads"))
      this.d = paramReadableMap.getMap("addAndroidDownloads"); 
    if (paramReadableMap.hasKey("binaryContentTypes"))
      this.m = paramReadableMap.getArray("binaryContentTypes"); 
    String str1 = this.b;
    if (str1 != null && str1.toLowerCase().contains("?append=true"))
      this.i = bool3; 
    if (paramReadableMap.hasKey("overwrite"))
      this.i = Boolean.valueOf(paramReadableMap.getBoolean("overwrite")); 
    if (paramReadableMap.hasKey("followRedirect"))
      this.l = Boolean.valueOf(paramReadableMap.getBoolean("followRedirect")); 
    str1 = str2;
    if (paramReadableMap.hasKey("key"))
      str1 = paramReadableMap.getString("key"); 
    this.g = str1;
    if (paramReadableMap.hasKey("contentType"))
      paramReadableMap.getString("contentType"); 
    if (paramReadableMap.hasKey("increment")) {
      bool = paramReadableMap.getBoolean("increment");
    } else {
      bool = false;
    } 
    this.k = Boolean.valueOf(bool);
    boolean bool = bool1;
    if (paramReadableMap.hasKey("auto"))
      bool = paramReadableMap.getBoolean("auto"); 
    this.h = Boolean.valueOf(bool);
    if (paramReadableMap.hasKey("timeout"))
      this.j = paramReadableMap.getInt("timeout"); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */