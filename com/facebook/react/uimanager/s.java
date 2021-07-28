package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b.g.m.a;
import b.g.m.v;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import e.e.o.h;
import e.e.o.j;
import java.util.HashMap;

public class s extends a {
  private static int f = 1056964608;
  
  public static final HashMap<String, Integer> g = new HashMap<String, Integer>();
  
  private Handler d = new a(this);
  
  private final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    g.put("activate", Integer.valueOf(b.g.m.e0.c.a.g.a()));
    g.put("longpress", Integer.valueOf(b.g.m.e0.c.a.h.a()));
    g.put("increment", Integer.valueOf(b.g.m.e0.c.a.i.a()));
    g.put("decrement", Integer.valueOf(b.g.m.e0.c.a.j.a()));
  }
  
  private static void a(b.g.m.e0.c paramc, ReadableMap paramReadableMap, Context paramContext) {
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      Dynamic dynamic = paramReadableMap.getDynamic(str);
      if (str.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
        paramc.m(dynamic.asBoolean());
        continue;
      } 
      if (str.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
        paramc.f(dynamic.asBoolean() ^ true);
        continue;
      } 
      if (str.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
        boolean bool = dynamic.asBoolean();
        paramc.b(true);
        paramc.c(bool);
        if (paramc.d().equals(c.a(c.y))) {
          int i;
          if (bool) {
            i = j.state_on_description;
          } else {
            i = j.state_off_description;
          } 
          paramc.h(paramContext.getString(i));
        } 
      } 
    } 
  }
  
  public static void a(b.g.m.e0.c paramc, c paramc1, Context paramContext) {
    c c1 = paramc1;
    if (paramc1 == null)
      c1 = c.c; 
    paramc.a(c.a(c1));
    if (c1.equals(c.e)) {
      paramc.g(paramContext.getString(j.link_description));
      if (paramc.e() != null) {
        SpannableString spannableString = new SpannableString(paramc.e());
        spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
        paramc.b((CharSequence)spannableString);
      } 
      if (paramc.h() != null) {
        SpannableString spannableString = new SpannableString(paramc.h());
        spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
        paramc.h((CharSequence)spannableString);
        return;
      } 
    } else {
      int i;
      if (c1.equals(c.f)) {
        i = j.search_description;
      } else if (c1.equals(c.g)) {
        i = j.image_description;
      } else {
        if (c1.equals(c.h)) {
          i = j.imagebutton_description;
        } else if (c1.equals(c.d)) {
          i = j.button_description;
        } else {
          if (c1.equals(c.l)) {
            i = j.summary_description;
          } else {
            if (c1.equals(c.m)) {
              paramc.b(b.g.m.e0.c.c.a(0, 1, 0, 1, true));
              return;
            } 
            if (c1.equals(c.n)) {
              i = j.alert_description;
            } else if (c1.equals(c.p)) {
              i = j.combobox_description;
            } else if (c1.equals(c.q)) {
              i = j.menu_description;
            } else if (c1.equals(c.r)) {
              i = j.menubar_description;
            } else if (c1.equals(c.s)) {
              i = j.menuitem_description;
            } else if (c1.equals(c.t)) {
              i = j.progressbar_description;
            } else if (c1.equals(c.v)) {
              i = j.radiogroup_description;
            } else if (c1.equals(c.w)) {
              i = j.scrollbar_description;
            } else if (c1.equals(c.x)) {
              i = j.spinbutton_description;
            } else if (c1.equals(c.z)) {
              i = j.rn_tab_description;
            } else if (c1.equals(c.A)) {
              i = j.tablist_description;
            } else if (c1.equals(c.B)) {
              i = j.timer_description;
            } else if (c1.equals(c.C)) {
              i = j.toolbar_description;
            } else {
              return;
            } 
          } 
          paramc.g(paramContext.getString(i));
        } 
        paramc.g(paramContext.getString(i));
        paramc.d(true);
        return;
      } 
      paramc.g(paramContext.getString(i));
    } 
  }
  
  private void c(View paramView) {
    if (this.d.hasMessages(1, paramView))
      this.d.removeMessages(1, paramView); 
    Message message = this.d.obtainMessage(1, paramView);
    this.d.sendMessageDelayed(message, 200L);
  }
  
  public static void d(View paramView) {
    if (!v.B(paramView) && (paramView.getTag(h.accessibility_role) != null || paramView.getTag(h.accessibility_state) != null || paramView.getTag(h.accessibility_actions) != null))
      v.a(paramView, new s()); 
  }
  
  public void a(View paramView, b.g.m.e0.c paramc) {
    super.a(paramView, paramc);
    c c1 = (c)paramView.getTag(h.accessibility_role);
    if (c1 != null)
      a(paramc, c1, paramView.getContext()); 
    ReadableMap readableMap1 = (ReadableMap)paramView.getTag(h.accessibility_state);
    if (readableMap1 != null)
      a(paramc, readableMap1, paramView.getContext()); 
    ReadableArray readableArray = (ReadableArray)paramView.getTag(h.accessibility_actions);
    if (readableArray != null) {
      int i = 0;
      while (i < readableArray.size()) {
        ReadableMap readableMap = readableArray.getMap(i);
        if (readableMap.hasKey("name")) {
          int j = f;
          if (readableMap.hasKey("label")) {
            String str = readableMap.getString("label");
          } else {
            readableMap1 = null;
          } 
          if (g.containsKey(readableMap.getString("name"))) {
            j = ((Integer)g.get(readableMap.getString("name"))).intValue();
          } else {
            f++;
          } 
          this.e.put(Integer.valueOf(j), readableMap.getString("name"));
          paramc.a(new b.g.m.e0.c.a(j, (CharSequence)readableMap1));
          i++;
          continue;
        } 
        throw new IllegalArgumentException("Unknown accessibility action.");
      } 
    } 
    ReadableMap readableMap2 = (ReadableMap)paramView.getTag(h.accessibility_value);
    if (readableMap2 != null && readableMap2.hasKey("min") && readableMap2.hasKey("now") && readableMap2.hasKey("max")) {
      Dynamic dynamic1 = readableMap2.getDynamic("min");
      Dynamic dynamic2 = readableMap2.getDynamic("now");
      Dynamic dynamic3 = readableMap2.getDynamic("max");
      if (dynamic1 != null && dynamic1.getType() == ReadableType.Number && dynamic2 != null && dynamic2.getType() == ReadableType.Number && dynamic3 != null && dynamic3.getType() == ReadableType.Number) {
        int i = dynamic1.asInt();
        int j = dynamic2.asInt();
        int k = dynamic3.asInt();
        if (k > i && j >= i && k >= j)
          paramc.a(b.g.m.e0.c.d.a(0, i, k, j)); 
      } 
    } 
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle) {
    if (this.e.containsKey(Integer.valueOf(paramInt))) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("actionName", this.e.get(Integer.valueOf(paramInt)));
      ReactContext reactContext = (ReactContext)paramView.getContext();
      if (reactContext.hasActiveCatalystInstance()) {
        ((RCTEventEmitter)reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(paramView.getId(), "topAccessibilityAction", writableMap);
      } else {
        ReactSoftException.logSoftException("ReactAccessibilityDelegate", (Throwable)new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
      } 
      c c = (c)paramView.getTag(h.accessibility_role);
      ReadableMap readableMap = (ReadableMap)paramView.getTag(h.accessibility_value);
      if (c == c.k && (paramInt == b.g.m.e0.c.a.i.a() || paramInt == b.g.m.e0.c.a.j.a())) {
        if (readableMap != null && !readableMap.hasKey("text"))
          c(paramView); 
        return super.a(paramView, paramInt, paramBundle);
      } 
      return true;
    } 
    return super.a(paramView, paramInt, paramBundle);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.b(paramView, paramAccessibilityEvent);
    ReadableMap readableMap = (ReadableMap)paramView.getTag(h.accessibility_value);
    if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
      Dynamic dynamic1 = readableMap.getDynamic("min");
      Dynamic dynamic2 = readableMap.getDynamic("now");
      Dynamic dynamic3 = readableMap.getDynamic("max");
      if (dynamic1 != null && dynamic1.getType() == ReadableType.Number && dynamic2 != null && dynamic2.getType() == ReadableType.Number && dynamic3 != null && dynamic3.getType() == ReadableType.Number) {
        int i = dynamic1.asInt();
        int j = dynamic2.asInt();
        int k = dynamic3.asInt();
        if (k > i && j >= i && k >= j) {
          paramAccessibilityEvent.setItemCount(k - i);
          paramAccessibilityEvent.setCurrentItemIndex(j);
        } 
      } 
    } 
  }
  
  class a extends Handler {
    a(s this$0) {}
    
    public void handleMessage(Message param1Message) {
      ((View)param1Message.obj).sendAccessibilityEvent(4);
    }
  }
  
  public enum c {
    A, B, C, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    
    static {
    
    }
    
    public static c a(String param1String) {
      for (c c1 : values()) {
        if (c1.name().equalsIgnoreCase(param1String))
          return c1; 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid accessibility role value: ");
      stringBuilder.append(param1String);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
    
    public static String a(c param1c) {
      StringBuilder stringBuilder;
      switch (s.b.a[param1c.ordinal()]) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid accessibility role value: ");
          stringBuilder.append(param1c);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
          return "android.view.View";
        case 11:
          return "android.widget.Switch";
        case 10:
          return "android.widget.SpinButton";
        case 9:
          return "android.widget.RadioButton";
        case 8:
          return "android.widget.CheckBox";
        case 7:
          return "android.widget.SeekBar";
        case 6:
          return "android.widget.TextView";
        case 5:
          return "android.inputmethodservice.Keyboard$Key";
        case 4:
          return "android.widget.ImageButon";
        case 3:
          return "android.widget.ImageView";
        case 2:
          return "android.widget.EditText";
        case 1:
          break;
      } 
      return "android.widget.Button";
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */