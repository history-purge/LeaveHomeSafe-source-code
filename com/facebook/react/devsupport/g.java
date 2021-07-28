package com.facebook.react.devsupport;

import android.util.Pair;
import android.view.View;
import java.util.LinkedList;

public class g {
  public static Pair<View, Integer> a(View paramView) {
    LinkedList<Pair> linkedList = new LinkedList();
    Pair<View, Integer> pair = new Pair(paramView, Integer.valueOf(1));
    linkedList.add(pair);
    label16: while (!linkedList.isEmpty()) {
      Pair<View, Integer> pair2 = linkedList.poll();
      Pair<View, Integer> pair1 = pair;
      if (((Integer)pair2.second).intValue() > ((Integer)pair.second).intValue())
        pair1 = pair2; 
      Object object = pair2.first;
      pair = pair1;
      if (object instanceof android.view.ViewGroup) {
        object = object;
        int j = ((Integer)pair2.second).intValue();
        int i = 0;
        while (true) {
          pair = pair1;
          if (i < object.getChildCount()) {
            linkedList.add(new Pair(object.getChildAt(i), Integer.valueOf(j + 1)));
            i++;
            continue;
          } 
          continue label16;
        } 
      } 
    } 
    return pair;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */