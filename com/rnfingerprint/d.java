package com.rnfingerprint;

import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;

public class d extends DialogFragment implements e.a {
  private FingerprintManager.CryptoObject c;
  
  private c d;
  
  private e e;
  
  private boolean f;
  
  private ImageView g;
  
  private TextView h;
  
  private TextView i;
  
  private String j;
  
  private int k = 0;
  
  private int l = 0;
  
  private String m = "";
  
  private String n = "";
  
  private String o = "";
  
  private String p = "";
  
  private String q = "";
  
  public void a() {
    this.f = false;
    this.d.a();
    dismiss();
  }
  
  public void a(FingerprintManager.CryptoObject paramCryptoObject) {
    this.c = paramCryptoObject;
  }
  
  public void a(ReadableMap paramReadableMap) {
    if (paramReadableMap == null)
      return; 
    if (paramReadableMap.hasKey("title"))
      this.m = paramReadableMap.getString("title"); 
    if (paramReadableMap.hasKey("cancelText"))
      this.n = paramReadableMap.getString("cancelText"); 
    if (paramReadableMap.hasKey("sensorDescription"))
      this.o = paramReadableMap.getString("sensorDescription"); 
    if (paramReadableMap.hasKey("sensorErrorDescription"))
      this.p = paramReadableMap.getString("sensorErrorDescription"); 
    if (paramReadableMap.hasKey("imageColor"))
      this.k = paramReadableMap.getInt("imageColor"); 
    if (paramReadableMap.hasKey("imageErrorColor"))
      this.l = paramReadableMap.getInt("imageErrorColor"); 
  }
  
  public void a(c paramc) {
    this.d = paramc;
  }
  
  public void a(String paramString) {
    this.j = paramString;
  }
  
  public void a(String paramString, int paramInt) {
    this.i.setText(paramString);
    this.g.setColorFilter(this.l);
    this.h.setText(this.p);
  }
  
  public void b() {
    this.f = false;
    this.e.a();
    this.d.b();
    dismiss();
  }
  
  public void onAttach(Context paramContext) {
    super.onAttach(paramContext);
    this.e = new e(paramContext, this);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setStyle(0, 16974393);
    setCancelable(false);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(g.fingerprint_dialog, paramViewGroup, false);
    ((TextView)view.findViewById(f.fingerprint_description)).setText(this.j);
    this.g = (ImageView)view.findViewById(f.fingerprint_icon);
    int i = this.k;
    if (i != 0)
      this.g.setColorFilter(i); 
    this.h = (TextView)view.findViewById(f.fingerprint_sensor_description);
    this.h.setText(this.o);
    this.i = (TextView)view.findViewById(f.fingerprint_error);
    this.i.setText(this.q);
    Button button = (Button)view.findViewById(f.cancel_button);
    button.setText(this.n);
    button.setOnClickListener(new a(this));
    getDialog().setTitle(this.m);
    getDialog().setOnKeyListener(new b(this));
    return view;
  }
  
  public void onPause() {
    super.onPause();
    if (this.f) {
      this.e.a();
      this.f = false;
    } 
  }
  
  public void onResume() {
    super.onResume();
    if (this.f)
      return; 
    this.f = true;
    this.e.a(this.c);
  }
  
  class a implements View.OnClickListener {
    a(d this$0) {}
    
    public void onClick(View param1View) {
      this.c.b();
    }
  }
  
  class b implements DialogInterface.OnKeyListener {
    b(d this$0) {}
    
    public boolean onKey(DialogInterface param1DialogInterface, int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int != 4 || d.a(this.c) == null)
        return false; 
      this.c.b();
      return true;
    }
  }
  
  public static interface c {
    void a();
    
    void b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfingerprint/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */