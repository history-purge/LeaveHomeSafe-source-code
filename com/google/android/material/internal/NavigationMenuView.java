package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements o {
  public NavigationMenuView(Context paramContext) {
    this(paramContext, null);
  }
  
  public NavigationMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutManager((RecyclerView.o)new LinearLayoutManager(paramContext, 1, false));
  }
  
  public void a(g paramg) {}
  
  public int getWindowAnimations() {
    return 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/NavigationMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */