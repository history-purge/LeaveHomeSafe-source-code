package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.e.b;

public class i implements g {
  private int[] a;
  
  public i(int[] paramArrayOfint) {
    this.a = paramArrayOfint;
  }
  
  public void a(b paramb) {
    int k;
    byte b1 = 0;
    int j = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      k = b1;
      if (j < arrayOfInt.length) {
        if ((arrayOfInt[j + 3] & 0x1) != 0)
          paramb.a(arrayOfInt[j + 1], arrayOfInt[j + 2]); 
        j += 4;
        continue;
      } 
      break;
    } 
    while (true) {
      int[] arrayOfInt = this.a;
      if (k < arrayOfInt.length) {
        if ((arrayOfInt[k + 3] & 0x2) != 0)
          paramb.a(arrayOfInt[k + 0]); 
        k += 4;
        continue;
      } 
      break;
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int j = 0; j < this.a.length; j += 4) {
      if (stringBuilder.length() > 0)
        stringBuilder.append("\n"); 
      stringBuilder.append("RemoveDeleteMultiMountItem (");
      stringBuilder.append(j / 4 + 1);
      stringBuilder.append("/");
      stringBuilder.append(this.a.length / 4);
      stringBuilder.append("): [");
      stringBuilder.append(this.a[j + 0]);
      stringBuilder.append("] parent [");
      stringBuilder.append(this.a[j + 1]);
      stringBuilder.append("] idx ");
      stringBuilder.append(this.a[j + 2]);
      stringBuilder.append(" ");
      stringBuilder.append(this.a[j + 3]);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */