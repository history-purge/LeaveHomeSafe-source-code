package com.google.android.datatransport.cct.f;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

public abstract class n {
  static n a(long paramLong) {
    return new h(paramLong);
  }
  
  public static n a(Reader paramReader) {
    JsonReader jsonReader = new JsonReader(paramReader);
    try {
      jsonReader.beginObject();
      while (jsonReader.hasNext()) {
        if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
          if (jsonReader.peek() == JsonToken.STRING)
            return a(Long.parseLong(jsonReader.nextString())); 
          return a(jsonReader.nextLong());
        } 
        jsonReader.skipValue();
      } 
      throw new IOException("Response is missing nextRequestWaitMillis field.");
    } finally {
      jsonReader.close();
    } 
  }
  
  public abstract long a();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */