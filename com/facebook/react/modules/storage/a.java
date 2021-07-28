package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

public class a {
  static String a(int paramInt) {
    String[] arrayOfString = new String[paramInt];
    Arrays.fill((Object[])arrayOfString, "?");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("key IN (");
    stringBuilder.append(TextUtils.join(", ", (Object[])arrayOfString));
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public static String a(SQLiteDatabase paramSQLiteDatabase, String paramString) {
    Cursor cursor = paramSQLiteDatabase.query("catalystLocalStorage", new String[] { "value" }, "key=?", new String[] { paramString }, null, null, null);
    try {
      boolean bool = cursor.moveToFirst();
      if (!bool)
        return null; 
      paramString = cursor.getString(0);
      return paramString;
    } finally {
      cursor.close();
    } 
  }
  
  private static void a(JSONObject paramJSONObject1, JSONObject paramJSONObject2) {
    Iterator<String> iterator = paramJSONObject2.keys();
    while (iterator.hasNext()) {
      String str = iterator.next();
      JSONObject jSONObject1 = paramJSONObject2.optJSONObject(str);
      JSONObject jSONObject2 = paramJSONObject1.optJSONObject(str);
      if (jSONObject1 != null && jSONObject2 != null) {
        a(jSONObject2, jSONObject1);
        paramJSONObject1.put(str, jSONObject2);
        continue;
      } 
      paramJSONObject1.put(str, paramJSONObject2.get(str));
    } 
  }
  
  static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2) {
    String str = a(paramSQLiteDatabase, paramString1);
    if (str != null) {
      JSONObject jSONObject = new JSONObject(str);
      a(jSONObject, new JSONObject(paramString2));
      paramString2 = jSONObject.toString();
    } 
    return b(paramSQLiteDatabase, paramString1, paramString2);
  }
  
  static String[] a(ReadableArray paramReadableArray, int paramInt1, int paramInt2) {
    String[] arrayOfString = new String[paramInt2];
    for (int i = 0; i < paramInt2; i++)
      arrayOfString[i] = paramReadableArray.getString(paramInt1 + i); 
    return arrayOfString;
  }
  
  static boolean b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2) {
    ContentValues contentValues = new ContentValues();
    contentValues.put("key", paramString1);
    contentValues.put("value", paramString2);
    return (-1L != paramSQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/storage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */