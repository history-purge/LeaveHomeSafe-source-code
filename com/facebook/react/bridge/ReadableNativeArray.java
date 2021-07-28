package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@a
public class ReadableNativeArray extends NativeArray implements ReadableArray {
  private static int jniPassCounter = 0;
  
  private Object[] mLocalArray;
  
  private ReadableType[] mLocalTypeArray;
  
  protected ReadableNativeArray(HybridData paramHybridData) {
    super(paramHybridData);
  }
  
  public static int getJNIPassCounter() {
    return jniPassCounter;
  }
  
  private Object[] getLocalArray() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLocalArray : [Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 11
    //   9: aload_1
    //   10: areturn
    //   11: aload_0
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield mLocalArray : [Ljava/lang/Object;
    //   17: ifnonnull -> 46
    //   20: getstatic com/facebook/react/bridge/ReadableNativeArray.jniPassCounter : I
    //   23: iconst_1
    //   24: iadd
    //   25: putstatic com/facebook/react/bridge/ReadableNativeArray.jniPassCounter : I
    //   28: aload_0
    //   29: invokespecial importArray : ()[Ljava/lang/Object;
    //   32: astore_1
    //   33: aload_1
    //   34: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   37: pop
    //   38: aload_0
    //   39: aload_1
    //   40: checkcast [Ljava/lang/Object;
    //   43: putfield mLocalArray : [Ljava/lang/Object;
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_0
    //   49: getfield mLocalArray : [Ljava/lang/Object;
    //   52: areturn
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   13	46	53	finally
    //   46	48	53	finally
    //   54	56	53	finally
  }
  
  private ReadableType[] getLocalTypeArray() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLocalTypeArray : [Lcom/facebook/react/bridge/ReadableType;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 11
    //   9: aload_1
    //   10: areturn
    //   11: aload_0
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield mLocalTypeArray : [Lcom/facebook/react/bridge/ReadableType;
    //   17: ifnonnull -> 58
    //   20: getstatic com/facebook/react/bridge/ReadableNativeArray.jniPassCounter : I
    //   23: iconst_1
    //   24: iadd
    //   25: putstatic com/facebook/react/bridge/ReadableNativeArray.jniPassCounter : I
    //   28: aload_0
    //   29: invokespecial importTypeArray : ()[Ljava/lang/Object;
    //   32: astore_1
    //   33: aload_1
    //   34: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   37: pop
    //   38: aload_1
    //   39: checkcast [Ljava/lang/Object;
    //   42: astore_1
    //   43: aload_0
    //   44: aload_1
    //   45: aload_1
    //   46: arraylength
    //   47: ldc [Lcom/facebook/react/bridge/ReadableType;
    //   49: invokestatic copyOf : ([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
    //   52: checkcast [Lcom/facebook/react/bridge/ReadableType;
    //   55: putfield mLocalTypeArray : [Lcom/facebook/react/bridge/ReadableType;
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_0
    //   61: getfield mLocalTypeArray : [Lcom/facebook/react/bridge/ReadableType;
    //   64: areturn
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   13	58	65	finally
    //   58	60	65	finally
    //   66	68	65	finally
  }
  
  private native Object[] importArray();
  
  private native Object[] importTypeArray();
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ReadableNativeArray))
      return false; 
    paramObject = paramObject;
    return Arrays.deepEquals(getLocalArray(), paramObject.getLocalArray());
  }
  
  public ReadableNativeArray getArray(int paramInt) {
    return (ReadableNativeArray)getLocalArray()[paramInt];
  }
  
  public boolean getBoolean(int paramInt) {
    return ((Boolean)getLocalArray()[paramInt]).booleanValue();
  }
  
  public double getDouble(int paramInt) {
    return ((Double)getLocalArray()[paramInt]).doubleValue();
  }
  
  public Dynamic getDynamic(int paramInt) {
    return DynamicFromArray.create(this, paramInt);
  }
  
  public int getInt(int paramInt) {
    return ((Double)getLocalArray()[paramInt]).intValue();
  }
  
  public ReadableNativeMap getMap(int paramInt) {
    return (ReadableNativeMap)getLocalArray()[paramInt];
  }
  
  public String getString(int paramInt) {
    return (String)getLocalArray()[paramInt];
  }
  
  public ReadableType getType(int paramInt) {
    return getLocalTypeArray()[paramInt];
  }
  
  public int hashCode() {
    return getLocalArray().hashCode();
  }
  
  public boolean isNull(int paramInt) {
    return (getLocalArray()[paramInt] == null);
  }
  
  public int size() {
    return (getLocalArray()).length;
  }
  
  public ArrayList<Object> toArrayList() {
    ArrayList<Boolean> arrayList = new ArrayList();
    for (int i = 0; i < size(); i++) {
      StringBuilder stringBuilder;
      ArrayList<Object> arrayList1;
      HashMap<String, Object> hashMap;
      String str;
      Double double_;
      Boolean bool;
      switch (getType(i)) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Could not convert object at index: ");
          stringBuilder.append(i);
          stringBuilder.append(".");
          throw new IllegalArgumentException(stringBuilder.toString());
        case null:
          arrayList1 = getArray(i).toArrayList();
          break;
        case Map:
          hashMap = getMap(i).toHashMap();
          break;
        case String:
          str = getString(i);
          break;
        case Number:
          double_ = Double.valueOf(getDouble(i));
          break;
        case Boolean:
          bool = Boolean.valueOf(getBoolean(i));
          break;
        case Null:
          bool = null;
          break;
      } 
      arrayList.add(bool);
    } 
    return (ArrayList)arrayList;
  }
  
  static {
    ReactBridge.staticInit();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReadableNativeArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */