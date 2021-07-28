package com.facebook.react.bridge;

import e.e.n.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@a
public class ReactMarker {
  private static final List<FabricMarkerListener> sFabricMarkerListeners;
  
  private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList<MarkerListener>();
  
  static {
    sFabricMarkerListeners = new CopyOnWriteArrayList<FabricMarkerListener>();
  }
  
  @a
  public static void addFabricListener(FabricMarkerListener paramFabricMarkerListener) {
    if (!sFabricMarkerListeners.contains(paramFabricMarkerListener))
      sFabricMarkerListeners.add(paramFabricMarkerListener); 
  }
  
  @a
  public static void addListener(MarkerListener paramMarkerListener) {
    if (!sListeners.contains(paramMarkerListener))
      sListeners.add(paramMarkerListener); 
  }
  
  @a
  public static void clearFabricMarkerListeners() {
    sFabricMarkerListeners.clear();
  }
  
  @a
  public static void clearMarkerListeners() {
    sListeners.clear();
  }
  
  @a
  public static void logFabricMarker(ReactMarkerConstants paramReactMarkerConstants, String paramString, int paramInt) {
    logFabricMarker(paramReactMarkerConstants, paramString, paramInt, -1L);
  }
  
  @a
  public static void logFabricMarker(ReactMarkerConstants paramReactMarkerConstants, String paramString, int paramInt, long paramLong) {
    Iterator<FabricMarkerListener> iterator = sFabricMarkerListeners.iterator();
    while (iterator.hasNext())
      ((FabricMarkerListener)iterator.next()).logFabricMarker(paramReactMarkerConstants, paramString, paramInt, paramLong); 
  }
  
  @a
  public static void logMarker(ReactMarkerConstants paramReactMarkerConstants) {
    logMarker(paramReactMarkerConstants, (String)null, 0);
  }
  
  @a
  public static void logMarker(ReactMarkerConstants paramReactMarkerConstants, int paramInt) {
    logMarker(paramReactMarkerConstants, (String)null, paramInt);
  }
  
  @a
  public static void logMarker(ReactMarkerConstants paramReactMarkerConstants, String paramString) {
    logMarker(paramReactMarkerConstants, paramString, 0);
  }
  
  @a
  public static void logMarker(ReactMarkerConstants paramReactMarkerConstants, String paramString, int paramInt) {
    logFabricMarker(paramReactMarkerConstants, paramString, paramInt);
    Iterator<MarkerListener> iterator = sListeners.iterator();
    while (iterator.hasNext())
      ((MarkerListener)iterator.next()).logMarker(paramReactMarkerConstants, paramString, paramInt); 
  }
  
  @a
  public static void logMarker(String paramString) {
    logMarker(paramString, (String)null);
  }
  
  @a
  public static void logMarker(String paramString, int paramInt) {
    logMarker(paramString, (String)null, paramInt);
  }
  
  @a
  public static void logMarker(String paramString1, String paramString2) {
    logMarker(paramString1, paramString2, 0);
  }
  
  @a
  public static void logMarker(String paramString1, String paramString2, int paramInt) {
    logMarker(ReactMarkerConstants.valueOf(paramString1), paramString2, paramInt);
  }
  
  @a
  public static void removeFabricListener(FabricMarkerListener paramFabricMarkerListener) {
    sFabricMarkerListeners.remove(paramFabricMarkerListener);
  }
  
  @a
  public static void removeListener(MarkerListener paramMarkerListener) {
    sListeners.remove(paramMarkerListener);
  }
  
  public static interface FabricMarkerListener {
    void logFabricMarker(ReactMarkerConstants param1ReactMarkerConstants, String param1String, int param1Int, long param1Long);
  }
  
  public static interface MarkerListener {
    void logMarker(ReactMarkerConstants param1ReactMarkerConstants, String param1String, int param1Int);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReactMarker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */