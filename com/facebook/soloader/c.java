package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class c extends l {
  protected final File a;
  
  protected final int b;
  
  public c(File paramFile, int paramInt) {
    this.a = paramFile;
    this.b = paramInt;
  }
  
  private void a(File paramFile, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    String[] arrayOfString = a(paramFile);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Loading lib dependencies: ");
    stringBuilder.append(Arrays.toString((Object[])arrayOfString));
    Log.d("SoLoader", stringBuilder.toString());
    int i;
    for (i = 0; i < arrayOfString.length; i++) {
      String str = arrayOfString[i];
      if (!str.startsWith("/"))
        SoLoader.b(str, (paramInt | 0x1) & 0xFFFFFFFD, paramThreadPolicy); 
    } 
  }
  
  private static String[] a(File paramFile) {
    if (SoLoader.a)
      Api18TraceUtils.a("SoLoader.getElfDependencies[", paramFile.getName(), "]"); 
    try {
      return i.a(paramFile);
    } finally {
      if (SoLoader.a)
        Api18TraceUtils.a(); 
    } 
  }
  
  public int a(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    return a(paramString, paramInt, this.a, paramThreadPolicy);
  }
  
  protected int a(String paramString, int paramInt, File paramFile, StrictMode.ThreadPolicy paramThreadPolicy) {
    StringBuilder stringBuilder1;
    File file = new File(paramFile, paramString);
    if (!file.exists()) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString);
      stringBuilder1.append(" not found on ");
      stringBuilder1.append(paramFile.getCanonicalPath());
      Log.d("SoLoader", stringBuilder1.toString());
      return 0;
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append(" found on ");
    stringBuilder2.append(paramFile.getCanonicalPath());
    Log.d("SoLoader", stringBuilder2.toString());
    if ((paramInt & 0x1) != 0 && (this.b & 0x2) != 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(" loaded implicitly");
      Log.d("SoLoader", stringBuilder.toString());
      return 2;
    } 
    if ((this.b & 0x1) != 0) {
      a(file, paramInt, (StrictMode.ThreadPolicy)stringBuilder1);
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not resolving dependencies for ");
      stringBuilder.append(paramString);
      Log.d("SoLoader", stringBuilder.toString());
    } 
    try {
      SoLoader.b.a(file.getAbsolutePath(), paramInt);
      return 1;
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
      if (unsatisfiedLinkError.getMessage().contains("bad ELF magic")) {
        Log.d("SoLoader", "Corrupted lib file detected");
        return 3;
      } 
      throw unsatisfiedLinkError;
    } 
  }
  
  public File a(String paramString) {
    File file = new File(this.a, paramString);
    return file.exists() ? file : null;
  }
  
  public String toString() {
    String str;
    try {
      str = String.valueOf(this.a.getCanonicalPath());
    } catch (IOException iOException) {
      str = this.a.getName();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    stringBuilder.append("[root = ");
    stringBuilder.append(str);
    stringBuilder.append(" flags = ");
    stringBuilder.append(this.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */