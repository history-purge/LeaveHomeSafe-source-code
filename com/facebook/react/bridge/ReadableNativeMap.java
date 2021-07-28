package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.m.a.a;
import e.e.n.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@a
public class ReadableNativeMap extends NativeMap implements ReadableMap {
  private static int mJniCallCounter;
  
  private String[] mKeys;
  
  private HashMap<String, Object> mLocalMap;
  
  private HashMap<String, ReadableType> mLocalTypeMap;
  
  static {
    ReactBridge.staticInit();
  }
  
  protected ReadableNativeMap(HybridData paramHybridData) {
    super(paramHybridData);
  }
  
  private void checkInstance(String paramString, Object paramObject, Class paramClass) {
    if (paramObject != null) {
      if (paramClass.isInstance(paramObject))
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Value for ");
      stringBuilder.append(paramString);
      stringBuilder.append(" cannot be cast from ");
      stringBuilder.append(paramObject.getClass().getSimpleName());
      stringBuilder.append(" to ");
      stringBuilder.append(paramClass.getSimpleName());
      throw new UnexpectedNativeTypeException(stringBuilder.toString());
    } 
  }
  
  public static int getJNIPassCounter() {
    return mJniCallCounter;
  }
  
  private HashMap<String, Object> getLocalMap() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLocalMap : Ljava/util/HashMap;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 11
    //   9: aload_3
    //   10: areturn
    //   11: aload_0
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield mKeys : [Ljava/lang/String;
    //   17: ifnonnull -> 46
    //   20: aload_0
    //   21: invokespecial importKeys : ()[Ljava/lang/String;
    //   24: astore_3
    //   25: aload_3
    //   26: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: aload_0
    //   31: aload_3
    //   32: checkcast [Ljava/lang/String;
    //   35: putfield mKeys : [Ljava/lang/String;
    //   38: getstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   41: iconst_1
    //   42: iadd
    //   43: putstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   46: aload_0
    //   47: getfield mLocalMap : Ljava/util/HashMap;
    //   50: ifnonnull -> 125
    //   53: aload_0
    //   54: invokespecial importValues : ()[Ljava/lang/Object;
    //   57: astore_3
    //   58: aload_3
    //   59: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: aload_3
    //   64: checkcast [Ljava/lang/Object;
    //   67: astore_3
    //   68: getstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   71: iconst_1
    //   72: iadd
    //   73: putstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   76: aload_0
    //   77: getfield mKeys : [Ljava/lang/String;
    //   80: arraylength
    //   81: istore_2
    //   82: aload_0
    //   83: new java/util/HashMap
    //   86: dup
    //   87: iload_2
    //   88: invokespecial <init> : (I)V
    //   91: putfield mLocalMap : Ljava/util/HashMap;
    //   94: iconst_0
    //   95: istore_1
    //   96: iload_1
    //   97: iload_2
    //   98: if_icmpge -> 125
    //   101: aload_0
    //   102: getfield mLocalMap : Ljava/util/HashMap;
    //   105: aload_0
    //   106: getfield mKeys : [Ljava/lang/String;
    //   109: iload_1
    //   110: aaload
    //   111: aload_3
    //   112: iload_1
    //   113: aaload
    //   114: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: iload_1
    //   119: iconst_1
    //   120: iadd
    //   121: istore_1
    //   122: goto -> 96
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_0
    //   128: getfield mLocalMap : Ljava/util/HashMap;
    //   131: areturn
    //   132: astore_3
    //   133: aload_0
    //   134: monitorexit
    //   135: goto -> 140
    //   138: aload_3
    //   139: athrow
    //   140: goto -> 138
    // Exception table:
    //   from	to	target	type
    //   13	46	132	finally
    //   46	94	132	finally
    //   101	118	132	finally
    //   125	127	132	finally
    //   133	135	132	finally
  }
  
  private HashMap<String, ReadableType> getLocalTypeMap() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLocalTypeMap : Ljava/util/HashMap;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 11
    //   9: aload_3
    //   10: areturn
    //   11: aload_0
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield mKeys : [Ljava/lang/String;
    //   17: ifnonnull -> 46
    //   20: aload_0
    //   21: invokespecial importKeys : ()[Ljava/lang/String;
    //   24: astore_3
    //   25: aload_3
    //   26: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: aload_0
    //   31: aload_3
    //   32: checkcast [Ljava/lang/String;
    //   35: putfield mKeys : [Ljava/lang/String;
    //   38: getstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   41: iconst_1
    //   42: iadd
    //   43: putstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   46: aload_0
    //   47: getfield mLocalTypeMap : Ljava/util/HashMap;
    //   50: ifnonnull -> 128
    //   53: aload_0
    //   54: invokespecial importTypes : ()[Ljava/lang/Object;
    //   57: astore_3
    //   58: aload_3
    //   59: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: aload_3
    //   64: checkcast [Ljava/lang/Object;
    //   67: astore_3
    //   68: getstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   71: iconst_1
    //   72: iadd
    //   73: putstatic com/facebook/react/bridge/ReadableNativeMap.mJniCallCounter : I
    //   76: aload_0
    //   77: getfield mKeys : [Ljava/lang/String;
    //   80: arraylength
    //   81: istore_2
    //   82: aload_0
    //   83: new java/util/HashMap
    //   86: dup
    //   87: iload_2
    //   88: invokespecial <init> : (I)V
    //   91: putfield mLocalTypeMap : Ljava/util/HashMap;
    //   94: iconst_0
    //   95: istore_1
    //   96: iload_1
    //   97: iload_2
    //   98: if_icmpge -> 128
    //   101: aload_0
    //   102: getfield mLocalTypeMap : Ljava/util/HashMap;
    //   105: aload_0
    //   106: getfield mKeys : [Ljava/lang/String;
    //   109: iload_1
    //   110: aaload
    //   111: aload_3
    //   112: iload_1
    //   113: aaload
    //   114: checkcast com/facebook/react/bridge/ReadableType
    //   117: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: iload_1
    //   122: iconst_1
    //   123: iadd
    //   124: istore_1
    //   125: goto -> 96
    //   128: aload_0
    //   129: monitorexit
    //   130: aload_0
    //   131: getfield mLocalTypeMap : Ljava/util/HashMap;
    //   134: areturn
    //   135: astore_3
    //   136: aload_0
    //   137: monitorexit
    //   138: goto -> 143
    //   141: aload_3
    //   142: athrow
    //   143: goto -> 141
    // Exception table:
    //   from	to	target	type
    //   13	46	135	finally
    //   46	94	135	finally
    //   101	121	135	finally
    //   128	130	135	finally
    //   136	138	135	finally
  }
  
  private Object getNullableValue(String paramString) {
    if (hasKey(paramString))
      return getLocalMap().get(paramString); 
    throw new NoSuchKeyException(paramString);
  }
  
  private <T> T getNullableValue(String paramString, Class<T> paramClass) {
    Object object = getNullableValue(paramString);
    checkInstance(paramString, object, paramClass);
    return (T)object;
  }
  
  private Object getValue(String paramString) {
    if (hasKey(paramString) && !isNull(paramString)) {
      paramString = (String)getLocalMap().get(paramString);
      a.a(paramString);
      return paramString;
    } 
    throw new NoSuchKeyException(paramString);
  }
  
  private <T> T getValue(String paramString, Class<T> paramClass) {
    Object object = getValue(paramString);
    checkInstance(paramString, object, paramClass);
    return (T)object;
  }
  
  private native String[] importKeys();
  
  private native Object[] importTypes();
  
  private native Object[] importValues();
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ReadableNativeMap))
      return false; 
    paramObject = paramObject;
    return getLocalMap().equals(paramObject.getLocalMap());
  }
  
  public ReadableArray getArray(String paramString) {
    return getNullableValue(paramString, ReadableArray.class);
  }
  
  public boolean getBoolean(String paramString) {
    return ((Boolean)getValue(paramString, Boolean.class)).booleanValue();
  }
  
  public double getDouble(String paramString) {
    return ((Double)getValue(paramString, Double.class)).doubleValue();
  }
  
  public Dynamic getDynamic(String paramString) {
    return DynamicFromMap.create(this, paramString);
  }
  
  public Iterator<Map.Entry<String, Object>> getEntryIterator() {
    return getLocalMap().entrySet().iterator();
  }
  
  public int getInt(String paramString) {
    return ((Double)getValue(paramString, Double.class)).intValue();
  }
  
  public ReadableNativeMap getMap(String paramString) {
    return getNullableValue(paramString, ReadableNativeMap.class);
  }
  
  public String getString(String paramString) {
    return getNullableValue(paramString, String.class);
  }
  
  public ReadableType getType(String paramString) {
    if (getLocalTypeMap().containsKey(paramString)) {
      paramString = (String)getLocalTypeMap().get(paramString);
      a.a(paramString);
      return (ReadableType)paramString;
    } 
    throw new NoSuchKeyException(paramString);
  }
  
  public boolean hasKey(String paramString) {
    return getLocalMap().containsKey(paramString);
  }
  
  public int hashCode() {
    return getLocalMap().hashCode();
  }
  
  public boolean isNull(String paramString) {
    if (getLocalMap().containsKey(paramString))
      return (getLocalMap().get(paramString) == null); 
    throw new NoSuchKeyException(paramString);
  }
  
  public ReadableMapKeySetIterator keySetIterator() {
    return new ReadableNativeMapKeySetIterator(this);
  }
  
  public HashMap<String, Object> toHashMap() {
    HashMap<String, Object> hashMap = new HashMap<String, Object>(getLocalMap());
    for (String str : hashMap.keySet()) {
      StringBuilder stringBuilder;
      ReadableArray readableArray;
      ArrayList<Object> arrayList;
      ReadableNativeMap readableNativeMap;
      HashMap<String, Object> hashMap1;
      switch (getType(str)) {
        case Null:
        case Boolean:
        case Number:
        case String:
          continue;
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Could not convert object with key: ");
          stringBuilder.append(str);
          stringBuilder.append(".");
          throw new IllegalArgumentException(stringBuilder.toString());
        case null:
          readableArray = getArray(str);
          a.a(readableArray);
          arrayList = readableArray.toArrayList();
          break;
        case Map:
          readableNativeMap = getMap(str);
          a.a(readableNativeMap);
          hashMap1 = readableNativeMap.toHashMap();
          break;
      } 
      hashMap.put(str, hashMap1);
    } 
    return hashMap;
  }
  
  private static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
    private final Iterator<String> mIterator;
    
    public ReadableNativeMapKeySetIterator(ReadableNativeMap param1ReadableNativeMap) {
      this.mIterator = param1ReadableNativeMap.getLocalMap().keySet().iterator();
    }
    
    public boolean hasNextKey() {
      return this.mIterator.hasNext();
    }
    
    public String nextKey() {
      return this.mIterator.next();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReadableNativeMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */