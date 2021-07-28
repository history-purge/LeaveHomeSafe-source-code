package com.facebook.react.common.j;

import okhttp3.Call;
import okhttp3.OkHttpClient;

public class a {
  public static void a(OkHttpClient paramOkHttpClient, Object paramObject) {
    for (Call call : paramOkHttpClient.dispatcher().queuedCalls()) {
      if (paramObject.equals(call.request().tag())) {
        call.cancel();
        return;
      } 
    } 
    for (Call call : paramOkHttpClient.dispatcher().runningCalls()) {
      if (paramObject.equals(call.request().tag())) {
        call.cancel();
        break;
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/common/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */