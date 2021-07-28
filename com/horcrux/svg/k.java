package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

class k {
  private final ArrayList<Path> a = new ArrayList<Path>();
  
  private final int[][] b = new int[256][];
  
  private final Paint c;
  
  k(Paint paramPaint) {
    this.c = paramPaint;
    this.a.add(new Path());
  }
  
  private int a(char paramChar) {
    int[] arrayOfInt = this.b[paramChar >> 8];
    return (arrayOfInt == null) ? 0 : arrayOfInt[paramChar & 0xFF];
  }
  
  Path a(char paramChar, String paramString) {
    Path path1;
    int i = a(paramChar);
    if (i != 0) {
      path1 = this.a.get(i);
    } else {
      Path path = new Path();
      this.c.getTextPath((String)path1, 0, 1, 0.0F, 0.0F, path);
      int[][] arrayOfInt = this.b;
      i = paramChar >> 8;
      int[] arrayOfInt2 = arrayOfInt[i];
      int[] arrayOfInt1 = arrayOfInt2;
      if (arrayOfInt2 == null) {
        arrayOfInt1 = new int[256];
        arrayOfInt[i] = arrayOfInt1;
      } 
      arrayOfInt1[paramChar & 0xFF] = this.a.size();
      this.a.add(path);
      path1 = path;
    } 
    Path path2 = new Path();
    path2.addPath(path1);
    return path2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */