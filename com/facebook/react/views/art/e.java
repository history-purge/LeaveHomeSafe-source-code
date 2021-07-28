package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.e1.a;

public class e extends b {
  private ReadableMap M;
  
  private int N = 0;
  
  private void a(Paint paramPaint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield N : I
    //   4: istore_3
    //   5: iconst_2
    //   6: istore #5
    //   8: iload_3
    //   9: ifeq -> 41
    //   12: iload_3
    //   13: iconst_1
    //   14: if_icmpeq -> 33
    //   17: iload_3
    //   18: iconst_2
    //   19: if_icmpeq -> 25
    //   22: goto -> 52
    //   25: getstatic android/graphics/Paint$Align.CENTER : Landroid/graphics/Paint$Align;
    //   28: astore #6
    //   30: goto -> 46
    //   33: getstatic android/graphics/Paint$Align.RIGHT : Landroid/graphics/Paint$Align;
    //   36: astore #6
    //   38: goto -> 46
    //   41: getstatic android/graphics/Paint$Align.LEFT : Landroid/graphics/Paint$Align;
    //   44: astore #6
    //   46: aload_1
    //   47: aload #6
    //   49: invokevirtual setTextAlign : (Landroid/graphics/Paint$Align;)V
    //   52: aload_0
    //   53: getfield M : Lcom/facebook/react/bridge/ReadableMap;
    //   56: astore #6
    //   58: aload #6
    //   60: ifnull -> 257
    //   63: aload #6
    //   65: ldc 'font'
    //   67: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   72: ifeq -> 257
    //   75: aload_0
    //   76: getfield M : Lcom/facebook/react/bridge/ReadableMap;
    //   79: ldc 'font'
    //   81: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   86: astore #6
    //   88: aload #6
    //   90: ifnull -> 257
    //   93: ldc 12.0
    //   95: fstore_2
    //   96: aload #6
    //   98: ldc 'fontSize'
    //   100: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   105: ifeq -> 119
    //   108: aload #6
    //   110: ldc 'fontSize'
    //   112: invokeinterface getDouble : (Ljava/lang/String;)D
    //   117: d2f
    //   118: fstore_2
    //   119: aload_1
    //   120: fload_2
    //   121: aload_0
    //   122: getfield C : F
    //   125: fmul
    //   126: invokevirtual setTextSize : (F)V
    //   129: aload #6
    //   131: ldc 'fontWeight'
    //   133: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   138: ifeq -> 163
    //   141: ldc 'bold'
    //   143: aload #6
    //   145: ldc 'fontWeight'
    //   147: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   155: ifeq -> 163
    //   158: iconst_1
    //   159: istore_3
    //   160: goto -> 165
    //   163: iconst_0
    //   164: istore_3
    //   165: aload #6
    //   167: ldc 'fontStyle'
    //   169: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   174: ifeq -> 200
    //   177: ldc 'italic'
    //   179: aload #6
    //   181: ldc 'fontStyle'
    //   183: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   188: invokevirtual equals : (Ljava/lang/Object;)Z
    //   191: ifeq -> 200
    //   194: iconst_1
    //   195: istore #4
    //   197: goto -> 203
    //   200: iconst_0
    //   201: istore #4
    //   203: iload_3
    //   204: ifeq -> 217
    //   207: iload #4
    //   209: ifeq -> 217
    //   212: iconst_3
    //   213: istore_3
    //   214: goto -> 239
    //   217: iload_3
    //   218: ifeq -> 226
    //   221: iconst_1
    //   222: istore_3
    //   223: goto -> 239
    //   226: iload #4
    //   228: ifeq -> 237
    //   231: iload #5
    //   233: istore_3
    //   234: goto -> 239
    //   237: iconst_0
    //   238: istore_3
    //   239: aload_1
    //   240: aload #6
    //   242: ldc 'fontFamily'
    //   244: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   249: iload_3
    //   250: invokestatic create : (Ljava/lang/String;I)Landroid/graphics/Typeface;
    //   253: invokevirtual setTypeface : (Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    //   256: pop
    //   257: return
  }
  
  public void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    ReadableMap readableMap = this.M;
    if (readableMap == null)
      return; 
    paramFloat *= this.A;
    if (paramFloat <= 0.01F)
      return; 
    if (!readableMap.hasKey("lines"))
      return; 
    ReadableArray readableArray = this.M.getArray("lines");
    if (readableArray != null) {
      if (readableArray.size() == 0)
        return; 
      b(paramCanvas);
      String[] arrayOfString = new String[readableArray.size()];
      int i;
      for (i = 0; i < arrayOfString.length; i++)
        arrayOfString[i] = readableArray.getString(i); 
      String str = TextUtils.join("\n", (Object[])arrayOfString);
      if (b(paramPaint, paramFloat)) {
        a(paramPaint);
        Path path = this.F;
        if (path == null) {
          paramCanvas.drawText(str, 0.0F, -paramPaint.ascent(), paramPaint);
        } else {
          paramCanvas.drawTextOnPath(str, path, 0.0F, 0.0F, paramPaint);
        } 
      } 
      if (a(paramPaint, paramFloat)) {
        a(paramPaint);
        Path path = this.F;
        if (path == null) {
          paramCanvas.drawText(str, 0.0F, -paramPaint.ascent(), paramPaint);
        } else {
          paramCanvas.drawTextOnPath(str, path, 0.0F, 0.0F, paramPaint);
        } 
      } 
      a(paramCanvas);
      e();
    } 
  }
  
  @a(defaultInt = 0, name = "alignment")
  public void setAlignment(int paramInt) {
    this.N = paramInt;
  }
  
  @a(name = "frame")
  public void setFrame(ReadableMap paramReadableMap) {
    this.M = paramReadableMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */