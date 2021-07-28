package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.uimanager.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

class l implements e {
  private final SparseArray<b> a = new SparseArray();
  
  private final SparseArray<d> b = new SparseArray();
  
  private final SparseArray<b> c = new SparseArray();
  
  private final Map<String, List<EventAnimationDriver>> d = new HashMap<String, List<EventAnimationDriver>>();
  
  private final UIManagerModule.e e;
  
  private final UIManagerModule f;
  
  private int g = 0;
  
  private final List<b> h = new LinkedList<b>();
  
  public l(UIManagerModule paramUIManagerModule) {
    this.f = paramUIManagerModule;
    paramUIManagerModule.getEventDispatcher().a(this);
    this.e = paramUIManagerModule.getDirectEventNamesResolver();
  }
  
  private void a(b paramb) {
    for (int i = 0; i < this.b.size(); i = j + 1) {
      d d = (d)this.b.valueAt(i);
      int j = i;
      if (paramb.equals(d.b)) {
        if (d.c != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("finished", false);
          d.c.invoke(new Object[] { writableMap });
        } 
        this.b.removeAt(i);
        j = i - 1;
      } 
    } 
  }
  
  private void a(List<b> paramList) {
    int k;
    int i = ++this.g;
    if (i == 0)
      this.g = i + 1; 
    ArrayDeque<b> arrayDeque = new ArrayDeque();
    Iterator<b> iterator2 = paramList.iterator();
    int j = 0;
    while (true) {
      i = j;
      if (iterator2.hasNext()) {
        b b = iterator2.next();
        i = b.c;
        k = this.g;
        if (i != k) {
          b.c = k;
          j++;
          arrayDeque.add(b);
        } 
        continue;
      } 
      break;
    } 
    while (!arrayDeque.isEmpty()) {
      b b = arrayDeque.poll();
      if (b.a != null) {
        j = 0;
        while (j < b.a.size()) {
          b b1 = b.a.get(j);
          b1.b++;
          int m = b1.c;
          int n = this.g;
          k = i;
          if (m != n) {
            b1.c = n;
            k = i + 1;
            arrayDeque.add(b1);
          } 
          j++;
          i = k;
        } 
      } 
    } 
    j = ++this.g;
    if (j == 0)
      this.g = j + 1; 
    Iterator<b> iterator1 = paramList.iterator();
    j = 0;
    while (true) {
      k = j;
      if (iterator1.hasNext()) {
        b b = iterator1.next();
        if (b.b == 0) {
          k = b.c;
          int m = this.g;
          if (k != m) {
            b.c = m;
            j++;
            arrayDeque.add(b);
          } 
        } 
        continue;
      } 
      break;
    } 
    while (!arrayDeque.isEmpty()) {
      b b = arrayDeque.poll();
      b.a();
      if (b instanceof m)
        try {
          ((m)b).c();
        } catch (g g) {
          e.e.e.e.a.b("ReactNative", "Native animation workaround, frame lost as result of race condition", (Throwable)g);
        }  
      if (b instanceof s)
        ((s)b).f(); 
      if (b.a != null) {
        j = k;
        k = 0;
        while (k < b.a.size()) {
          b b1 = b.a.get(k);
          b1.b--;
          int n = b1.c;
          int i1 = this.g;
          int m = j;
          if (n != i1) {
            m = j;
            if (b1.b == 0) {
              b1.c = i1;
              m = j + 1;
              arrayDeque.add(b1);
            } 
          } 
          k++;
          j = m;
        } 
        k = j;
      } 
    } 
    if (i == k)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Looks like animated nodes graph has cycles, there are ");
    stringBuilder.append(i);
    stringBuilder.append(" but toposort visited only ");
    stringBuilder.append(k);
    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
    throw illegalStateException;
  }
  
  private void b(c paramc) {
    if (!this.d.isEmpty()) {
      String str = this.e.a(paramc.d());
      Map<String, List<EventAnimationDriver>> map = this.d;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramc.g());
      stringBuilder.append(str);
      List list = map.get(stringBuilder.toString());
      if (list != null) {
        for (EventAnimationDriver eventAnimationDriver : list) {
          a(eventAnimationDriver.mValueNode);
          paramc.a(eventAnimationDriver);
          this.h.add(eventAnimationDriver.mValueNode);
        } 
        a(this.h);
        this.h.clear();
      } 
    } 
  }
  
  public void a(int paramInt) {
    this.a.remove(paramInt);
    this.c.remove(paramInt);
  }
  
  public void a(int paramInt, double paramDouble) {
    b b = (b)this.a.get(paramInt);
    if (b != null && b instanceof s) {
      ((s)b).g = paramDouble;
      this.c.put(paramInt, b);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" does not exists or is not a 'value' node");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt1, int paramInt2) {
    b b = (b)this.a.get(paramInt1);
    if (b != null) {
      if (b instanceof m) {
        ((m)b).a(paramInt2);
        this.c.put(paramInt1, b);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node connected to view should beof type ");
      stringBuilder1.append(m.class.getName());
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt1, int paramInt2, ReadableMap paramReadableMap, Callback paramCallback) {
    b b = (b)this.a.get(paramInt2);
    if (b != null) {
      if (b instanceof s) {
        h h;
        StringBuilder stringBuilder2;
        d d = (d)this.b.get(paramInt1);
        if (d != null) {
          d.a(paramReadableMap);
          return;
        } 
        String str = paramReadableMap.getString("type");
        if ("frames".equals(str)) {
          h = new h(paramReadableMap);
        } else {
          n n;
          if ("spring".equals(str)) {
            n = new n((ReadableMap)h);
          } else if ("decay".equals(str)) {
            e e1 = new e((ReadableMap)n);
          } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unsupported animation type: ");
            stringBuilder2.append(str);
            throw new JSApplicationIllegalArgumentException(stringBuilder2.toString());
          } 
        } 
        ((d)stringBuilder2).d = paramInt1;
        ((d)stringBuilder2).c = paramCallback;
        ((d)stringBuilder2).b = (s)b;
        this.b.put(paramInt1, stringBuilder2);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node should be of type ");
      stringBuilder1.append(s.class.getName());
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt, c paramc) {
    b b = (b)this.a.get(paramInt);
    if (b != null && b instanceof s) {
      ((s)b).a(paramc);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" does not exists or is not a 'value' node");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt, ReadableMap paramReadableMap) {
    if (this.a.get(paramInt) == null) {
      o o;
      StringBuilder stringBuilder1;
      String str = paramReadableMap.getString("type");
      if ("style".equals(str)) {
        o = new o(paramReadableMap, this);
      } else {
        s s;
        if ("value".equals(str)) {
          s = new s((ReadableMap)o);
        } else {
          m m;
          if ("props".equals(str)) {
            m = new m((ReadableMap)s, this, (UIManager)this.f);
          } else {
            i i;
            if ("interpolation".equals(str)) {
              i = new i((ReadableMap)m);
            } else {
              a a;
              if ("addition".equals(str)) {
                a = new a((ReadableMap)i, this);
              } else {
                p p;
                if ("subtraction".equals(str)) {
                  p = new p((ReadableMap)a, this);
                } else {
                  g g;
                  if ("division".equals(str)) {
                    g = new g((ReadableMap)p, this);
                  } else {
                    k k;
                    if ("multiplication".equals(str)) {
                      k = new k((ReadableMap)g, this);
                    } else {
                      j j;
                      if ("modulus".equals(str)) {
                        j = new j((ReadableMap)k, this);
                      } else {
                        f f;
                        if ("diffclamp".equals(str)) {
                          f = new f((ReadableMap)j, this);
                        } else {
                          r r;
                          if ("transform".equals(str)) {
                            r = new r((ReadableMap)f, this);
                          } else if ("tracking".equals(str)) {
                            q q = new q((ReadableMap)r, this);
                          } else {
                            stringBuilder1 = new StringBuilder();
                            stringBuilder1.append("Unsupported node type: ");
                            stringBuilder1.append(str);
                            throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      ((b)stringBuilder1).d = paramInt;
      this.a.put(paramInt, stringBuilder1);
      this.c.put(paramInt, stringBuilder1);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" already exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt1, String paramString, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramInt1);
    stringBuilder.append(paramString);
    String str = stringBuilder.toString();
    if (this.d.containsKey(str)) {
      Map<String, List<EventAnimationDriver>> map;
      List list = this.d.get(str);
      if (list.size() == 1) {
        map = this.d;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramInt1);
        stringBuilder1.append(paramString);
        map.remove(stringBuilder1.toString());
        return;
      } 
      ListIterator<String> listIterator = map.listIterator();
      while (listIterator.hasNext()) {
        if (((EventAnimationDriver)listIterator.next()).mValueNode.d == paramInt2) {
          listIterator.remove();
          break;
        } 
      } 
    } 
  }
  
  public void a(int paramInt, String paramString, ReadableMap paramReadableMap) {
    int i = paramReadableMap.getInt("animatedValueTag");
    b b = (b)this.a.get(i);
    if (b != null) {
      if (b instanceof s) {
        ReadableArray readableArray = paramReadableMap.getArray("nativeEventPath");
        ArrayList<String> arrayList1 = new ArrayList(readableArray.size());
        for (i = 0; i < readableArray.size(); i++)
          arrayList1.add(readableArray.getString(i)); 
        EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList1, (s)b);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(paramInt);
        stringBuilder2.append(paramString);
        paramString = stringBuilder2.toString();
        if (this.d.containsKey(paramString)) {
          ((List<EventAnimationDriver>)this.d.get(paramString)).add(eventAnimationDriver);
          return;
        } 
        ArrayList<EventAnimationDriver> arrayList = new ArrayList(1);
        arrayList.add(eventAnimationDriver);
        this.d.put(paramString, arrayList);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node connected to event should beof type ");
      stringBuilder1.append(s.class.getName());
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(i);
    stringBuilder.append(" does not exists");
    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
    throw jSApplicationIllegalArgumentException;
  }
  
  public void a(long paramLong) {
    UiThreadUtil.assertOnUiThread();
    int i;
    for (i = 0; i < this.c.size(); i++) {
      b b = (b)this.c.valueAt(i);
      this.h.add(b);
    } 
    this.c.clear();
    i = 0;
    boolean bool = false;
    while (i < this.b.size()) {
      d d = (d)this.b.valueAt(i);
      d.a(paramLong);
      s s = d.b;
      this.h.add(s);
      if (d.a)
        bool = true; 
      i++;
    } 
    a(this.h);
    this.h.clear();
    if (bool)
      for (i = this.b.size() - 1; i >= 0; i--) {
        d d = (d)this.b.valueAt(i);
        if (d.a) {
          if (d.c != null) {
            WritableMap writableMap = Arguments.createMap();
            writableMap.putBoolean("finished", true);
            d.c.invoke(new Object[] { writableMap });
          } 
          this.b.removeAt(i);
        } 
      }  
  }
  
  public void a(c paramc) {
    if (UiThreadUtil.isOnUiThread()) {
      b(paramc);
      return;
    } 
    UiThreadUtil.runOnUiThread(new a(this, paramc));
  }
  
  public boolean a() {
    return (this.b.size() > 0 || this.c.size() > 0);
  }
  
  public void b(int paramInt) {
    b b = (b)this.a.get(paramInt);
    if (b != null && b instanceof s) {
      ((s)b).b();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" does not exists or is not a 'value' node");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void b(int paramInt, double paramDouble) {
    b b = (b)this.a.get(paramInt);
    if (b != null && b instanceof s) {
      a(b);
      ((s)b).f = paramDouble;
      this.c.put(paramInt, b);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" does not exists or is not a 'value' node");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void b(int paramInt1, int paramInt2) {
    b b = (b)this.a.get(paramInt1);
    if (b != null) {
      b b1 = (b)this.a.get(paramInt2);
      if (b1 != null) {
        b.a(b1);
        this.c.put(paramInt2, b1);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node with tag ");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append(" does not exists");
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void c(int paramInt) {
    b b = (b)this.a.get(paramInt);
    if (b != null && b instanceof s) {
      ((s)b).c();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" does not exists or is not a 'value' node");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void c(int paramInt1, int paramInt2) {
    b b = (b)this.a.get(paramInt1);
    if (b != null) {
      if (b instanceof m) {
        ((m)b).b(paramInt2);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node connected to view should beof type ");
      stringBuilder1.append(m.class.getName());
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  b d(int paramInt) {
    return (b)this.a.get(paramInt);
  }
  
  public void d(int paramInt1, int paramInt2) {
    b b = (b)this.a.get(paramInt1);
    if (b != null) {
      b b1 = (b)this.a.get(paramInt2);
      if (b1 != null) {
        b.d(b1);
        this.c.put(paramInt2, b1);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node with tag ");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append(" does not exists");
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void e(int paramInt) {
    b b = (b)this.a.get(paramInt);
    if (b == null)
      return; 
    if (b instanceof m) {
      ((m)b).b();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node connected to view should beof type ");
    stringBuilder.append(m.class.getName());
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void f(int paramInt) {
    for (int i = 0; i < this.b.size(); i++) {
      d d = (d)this.b.valueAt(i);
      if (d.d == paramInt) {
        if (d.c != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("finished", false);
          d.c.invoke(new Object[] { writableMap });
        } 
        this.b.removeAt(i);
        return;
      } 
    } 
  }
  
  public void g(int paramInt) {
    b b = (b)this.a.get(paramInt);
    if (b != null && b instanceof s) {
      ((s)b).a(null);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" does not exists or is not a 'value' node");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  class a implements Runnable {
    a(l this$0, c param1c) {}
    
    public void run() {
      l.a(this.d, this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */