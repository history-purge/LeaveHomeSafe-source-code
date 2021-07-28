package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

public class e {
  public static WritableArray a(CharSequence paramCharSequence, Layout paramLayout, TextPaint paramTextPaint, Context paramContext) {
    DisplayMetrics displayMetrics = paramContext.getResources().getDisplayMetrics();
    WritableArray writableArray = Arguments.createArray();
    paramTextPaint = new TextPaint((Paint)paramTextPaint);
    paramTextPaint.setTextSize(paramTextPaint.getTextSize() * 100.0F);
    Rect rect = new Rect();
    int i = 0;
    paramTextPaint.getTextBounds("T", 0, 1, rect);
    double d1 = (rect.height() / 100.0F / displayMetrics.density);
    rect = new Rect();
    paramTextPaint.getTextBounds("x", 0, 1, rect);
    double d2 = (rect.height() / 100.0F / displayMetrics.density);
    while (i < paramLayout.getLineCount()) {
      Rect rect1 = new Rect();
      paramLayout.getLineBounds(i, rect1);
      WritableMap writableMap = Arguments.createMap();
      writableMap.putDouble("x", (paramLayout.getLineLeft(i) / displayMetrics.density));
      writableMap.putDouble("y", (rect1.top / displayMetrics.density));
      writableMap.putDouble("width", (paramLayout.getLineWidth(i) / displayMetrics.density));
      writableMap.putDouble("height", (rect1.height() / displayMetrics.density));
      writableMap.putDouble("descender", (paramLayout.getLineDescent(i) / displayMetrics.density));
      writableMap.putDouble("ascender", (-paramLayout.getLineAscent(i) / displayMetrics.density));
      writableMap.putDouble("baseline", (paramLayout.getLineBaseline(i) / displayMetrics.density));
      writableMap.putDouble("capHeight", d1);
      writableMap.putDouble("xHeight", d2);
      writableMap.putString("text", paramCharSequence.subSequence(paramLayout.getLineStart(i), paramLayout.getLineEnd(i)).toString());
      writableArray.pushMap((ReadableMap)writableMap);
      i++;
    } 
    return writableArray;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */