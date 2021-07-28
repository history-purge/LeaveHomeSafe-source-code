package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class f extends BaseAdapter {
  g c;
  
  private int d = -1;
  
  private boolean e;
  
  private final boolean f;
  
  private final LayoutInflater g;
  
  private final int h;
  
  public f(g paramg, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt) {
    this.f = paramBoolean;
    this.g = paramLayoutInflater;
    this.c = paramg;
    this.h = paramInt;
    a();
  }
  
  void a() {
    j j = this.c.f();
    if (j != null) {
      ArrayList<j> arrayList = this.c.j();
      int k = arrayList.size();
      for (int i = 0; i < k; i++) {
        if ((j)arrayList.get(i) == j) {
          this.d = i;
          return;
        } 
      } 
    } 
    this.d = -1;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public g b() {
    return this.c;
  }
  
  public int getCount() {
    ArrayList<j> arrayList;
    if (this.f) {
      arrayList = this.c.j();
    } else {
      arrayList = this.c.n();
    } 
    int i = this.d;
    int j = arrayList.size();
    return (i < 0) ? j : (j - 1);
  }
  
  public j getItem(int paramInt) {
    ArrayList<j> arrayList;
    if (this.f) {
      arrayList = this.c.j();
    } else {
      arrayList = this.c.n();
    } 
    int j = this.d;
    int i = paramInt;
    if (j >= 0) {
      i = paramInt;
      if (paramInt >= j)
        i = paramInt + 1; 
    } 
    return arrayList.get(i);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = paramView;
    if (paramView == null)
      view = this.g.inflate(this.h, paramViewGroup, false); 
    int j = getItem(paramInt).getGroupId();
    int i = paramInt - 1;
    if (i >= 0) {
      i = getItem(i).getGroupId();
    } else {
      i = j;
    } 
    ListMenuItemView listMenuItemView = (ListMenuItemView)view;
    if (this.c.o() && j != i) {
      bool = true;
    } else {
      bool = false;
    } 
    listMenuItemView.setGroupDividerEnabled(bool);
    o.a a = (o.a)view;
    if (this.e)
      listMenuItemView.setForceShowIcon(true); 
    a.a(getItem(paramInt), 0);
    return view;
  }
  
  public void notifyDataSetChanged() {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */