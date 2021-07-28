package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

class d extends InputConnectionWrapper {
  private c a;
  
  private com.facebook.react.uimanager.events.d b;
  
  private boolean c;
  
  private String d = null;
  
  public d(InputConnection paramInputConnection, ReactContext paramReactContext, c paramc) {
    super(paramInputConnection, false);
    this.b = ((UIManagerModule)paramReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
    this.a = paramc;
  }
  
  private void a(String paramString) {
    String str = paramString;
    if (paramString.equals("\n"))
      str = "Enter"; 
    this.b.a(new j(this.a.getId(), str));
  }
  
  private void b(String paramString) {
    if (this.c) {
      this.d = paramString;
      return;
    } 
    a(paramString);
  }
  
  public boolean beginBatchEdit() {
    this.c = true;
    return super.beginBatchEdit();
  }
  
  public boolean commitText(CharSequence paramCharSequence, int paramInt) {
    String str = paramCharSequence.toString();
    if (str.length() <= 2) {
      String str1 = str;
      if (str.equals(""))
        str1 = "Backspace"; 
      b(str1);
    } 
    return super.commitText(paramCharSequence, paramInt);
  }
  
  public boolean deleteSurroundingText(int paramInt1, int paramInt2) {
    a("Backspace");
    return super.deleteSurroundingText(paramInt1, paramInt2);
  }
  
  public boolean endBatchEdit() {
    this.c = false;
    String str = this.d;
    if (str != null) {
      a(str);
      this.d = null;
    } 
    return super.endBatchEdit();
  }
  
  public boolean sendKeyEvent(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 0) {
      String str;
      if (paramKeyEvent.getKeyCode() == 67) {
        str = "Backspace";
      } else if (paramKeyEvent.getKeyCode() == 66) {
        str = "Enter";
      } else {
        return super.sendKeyEvent(paramKeyEvent);
      } 
      a(str);
    } 
    return super.sendKeyEvent(paramKeyEvent);
  }
  
  public boolean setComposingText(CharSequence paramCharSequence, int paramInt) {
    int k = this.a.getSelectionStart();
    int i = this.a.getSelectionEnd();
    boolean bool1 = super.setComposingText(paramCharSequence, paramInt);
    int j = this.a.getSelectionStart();
    boolean bool = false;
    if (k == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (j == k) {
      i = 1;
    } else {
      i = 0;
    } 
    if (j < k || j <= 0)
      bool = true; 
    if (bool || (paramInt == 0 && i != 0)) {
      paramCharSequence = "Backspace";
      b((String)paramCharSequence);
      return bool1;
    } 
    paramCharSequence = String.valueOf(this.a.getText().charAt(j - 1));
    b((String)paramCharSequence);
    return bool1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */