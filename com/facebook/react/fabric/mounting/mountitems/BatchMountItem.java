package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.fabric.e.b;
import com.facebook.systrace.a;
import e.e.n.a.a;

@a
public class BatchMountItem implements g {
  private final g[] a;
  
  private final int b;
  
  private final int c;
  
  public BatchMountItem(g[] paramArrayOfg, int paramInt1, int paramInt2) {
    if (paramArrayOfg != null) {
      if (paramInt1 >= 0 && paramInt1 <= paramArrayOfg.length) {
        this.a = paramArrayOfg;
        this.b = paramInt1;
        this.c = paramInt2;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid size received by parameter size: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" items.size = ");
      stringBuilder.append(paramArrayOfg.length);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException();
  }
  
  public void a(b paramb) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FabricUIManager::mountViews - ");
    stringBuilder.append(this.b);
    stringBuilder.append(" items");
    a.a(0L, stringBuilder.toString());
    int i = this.c;
    if (i > 0)
      ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i); 
    for (i = 0; i < this.b; i++)
      this.a[i].a(paramb); 
    i = this.c;
    if (i > 0)
      ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i); 
    a.a(0L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < this.b; i = j) {
      if (stringBuilder.length() > 0)
        stringBuilder.append("\n"); 
      stringBuilder.append("BatchMountItem (");
      int j = i + 1;
      stringBuilder.append(j);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      stringBuilder.append("): ");
      stringBuilder.append(this.a[i]);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/BatchMountItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */