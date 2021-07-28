package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

public class i {
  private static final String[] c = new String[] { "", "_bold", "_italic", "_bold_italic" };
  
  private static final String[] d = new String[] { ".ttf", ".otf" };
  
  private static i e;
  
  private final Map<String, b> a = new HashMap<String, b>();
  
  private final Map<String, Typeface> b = new HashMap<String, Typeface>();
  
  public static i a() {
    if (e == null)
      e = new i(); 
    return e;
  }
  
  private static Typeface b(String paramString, int paramInt, AssetManager paramAssetManager) {
    String str = c[paramInt];
    String[] arrayOfString = d;
    int k = arrayOfString.length;
    int j = 0;
    while (true) {
      if (j < k) {
        String str1 = arrayOfString[j];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fonts/");
        stringBuilder.append(paramString);
        stringBuilder.append(str);
        stringBuilder.append(str1);
        str1 = stringBuilder.toString();
        try {
          return Typeface.createFromAsset(paramAssetManager, str1);
        } catch (RuntimeException runtimeException) {
          j++;
          continue;
        } 
      } 
      return Typeface.create(paramString, paramInt);
    } 
  }
  
  public Typeface a(String paramString, int paramInt1, int paramInt2, AssetManager paramAssetManager) {
    Typeface typeface1;
    if (this.b.containsKey(paramString)) {
      typeface1 = this.b.get(paramString);
      if (Build.VERSION.SDK_INT >= 28 && paramInt2 >= 100 && paramInt2 <= 1000) {
        boolean bool;
        if ((paramInt1 & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        return Typeface.create(typeface1, paramInt2, bool);
      } 
      return Typeface.create(typeface1, paramInt1);
    } 
    b b2 = this.a.get(typeface1);
    b b1 = b2;
    if (b2 == null) {
      b1 = new b(null);
      this.a.put(typeface1, b1);
    } 
    Typeface typeface3 = b1.a(paramInt1);
    Typeface typeface2 = typeface3;
    if (typeface3 == null) {
      typeface1 = b((String)typeface1, paramInt1, paramAssetManager);
      typeface2 = typeface1;
      if (typeface1 != null) {
        b1.a(paramInt1, typeface1);
        typeface2 = typeface1;
      } 
    } 
    return typeface2;
  }
  
  public Typeface a(String paramString, int paramInt, AssetManager paramAssetManager) {
    return a(paramString, paramInt, 0, paramAssetManager);
  }
  
  private static class b {
    private SparseArray<Typeface> a = new SparseArray(4);
    
    private b() {}
    
    public Typeface a(int param1Int) {
      return (Typeface)this.a.get(param1Int);
    }
    
    public void a(int param1Int, Typeface param1Typeface) {
      this.a.put(param1Int, param1Typeface);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */