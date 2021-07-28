package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class s {
  private static final Class[] e;
  
  final Map<String, Object> a = new HashMap<String, Object>();
  
  final Map<String, SavedStateRegistry.b> b = new HashMap<String, SavedStateRegistry.b>();
  
  private final Map<String, Object<?>> c = new HashMap<String, Object<?>>();
  
  private final SavedStateRegistry.b d = new a(this);
  
  static {
    Class<int> clazz1;
    Class<int> clazz2;
    Class<boolean> clazz = boolean.class;
    Class<double> clazz3 = double.class;
    Class<int> clazz4 = int.class;
    Class<long> clazz5 = long.class;
    Class<byte> clazz6 = byte.class;
    Class<char> clazz7 = char.class;
    Class<float> clazz8 = float.class;
    Class<short> clazz9 = short.class;
    if (Build.VERSION.SDK_INT >= 21) {
      Class<Size> clazz10 = Size.class;
    } else {
      clazz1 = int.class;
    } 
    if (Build.VERSION.SDK_INT >= 21) {
      Class<SizeF> clazz10 = SizeF.class;
    } else {
      clazz2 = int.class;
    } 
    e = new Class[] { 
        clazz, boolean[].class, clazz3, double[].class, clazz4, int[].class, clazz5, long[].class, String.class, String[].class, 
        Binder.class, Bundle.class, clazz6, byte[].class, clazz7, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, clazz8, 
        float[].class, Parcelable.class, Parcelable[].class, Serializable.class, clazz9, short[].class, SparseArray.class, clazz1, clazz2 };
  }
  
  public s() {}
  
  public s(Map<String, Object> paramMap) {}
  
  static s a(Bundle paramBundle1, Bundle paramBundle2) {
    if (paramBundle1 == null && paramBundle2 == null)
      return new s(); 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    if (paramBundle2 != null)
      for (String str : paramBundle2.keySet())
        hashMap.put(str, paramBundle2.get(str));  
    if (paramBundle1 == null)
      return new s((Map)hashMap); 
    ArrayList<String> arrayList1 = paramBundle1.getParcelableArrayList("keys");
    ArrayList arrayList = paramBundle1.getParcelableArrayList("values");
    if (arrayList1 != null && arrayList != null && arrayList1.size() == arrayList.size()) {
      for (int i = 0; i < arrayList1.size(); i++)
        hashMap.put(arrayList1.get(i), arrayList.get(i)); 
      return new s((Map)hashMap);
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Invalid bundle passed as restored state");
    throw illegalStateException;
  }
  
  private static void a(Object paramObject) {
    if (paramObject == null)
      return; 
    Class[] arrayOfClass = e;
    int j = arrayOfClass.length;
    for (int i = 0; i < j; i++) {
      if (arrayOfClass[i].isInstance(paramObject))
        return; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can't put value with type ");
    stringBuilder.append(paramObject.getClass());
    stringBuilder.append(" into saved state");
    paramObject = new IllegalArgumentException(stringBuilder.toString());
    throw paramObject;
  }
  
  SavedStateRegistry.b a() {
    return this.d;
  }
  
  public <T> void a(String paramString, T paramT) {
    a(paramT);
    o<T> o = (o)this.c.get(paramString);
    if (o != null) {
      o.b(paramT);
      return;
    } 
    this.a.put(paramString, paramT);
  }
  
  class a implements SavedStateRegistry.b {
    a(s this$0) {}
    
    public Bundle a() {
      for (Map.Entry<?, ?> entry : (new HashMap<Object, Object>(this.a.b)).entrySet()) {
        Bundle bundle1 = ((SavedStateRegistry.b)entry.getValue()).a();
        this.a.a((String)entry.getKey(), bundle1);
      } 
      Set<String> set = this.a.a.keySet();
      ArrayList<String> arrayList = new ArrayList(set.size());
      ArrayList arrayList1 = new ArrayList(arrayList.size());
      for (String str : set) {
        arrayList.add(str);
        arrayList1.add(this.a.a.get(str));
      } 
      Bundle bundle = new Bundle();
      bundle.putParcelableArrayList("keys", arrayList);
      bundle.putParcelableArrayList("values", arrayList1);
      return bundle;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */