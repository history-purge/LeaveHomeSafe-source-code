package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import b.g.h.a.a;
import b.g.m.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements a {
  private static final int[] A = new int[] { 1, 4, 5, 3, 2, 0 };
  
  private final Context a;
  
  private final Resources b;
  
  private boolean c;
  
  private boolean d;
  
  private a e;
  
  private ArrayList<j> f;
  
  private ArrayList<j> g;
  
  private boolean h;
  
  private ArrayList<j> i;
  
  private ArrayList<j> j;
  
  private boolean k;
  
  private int l = 0;
  
  private ContextMenu.ContextMenuInfo m;
  
  CharSequence n;
  
  Drawable o;
  
  View p;
  
  private boolean q = false;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = false;
  
  private ArrayList<j> v = new ArrayList<j>();
  
  private CopyOnWriteArrayList<WeakReference<n>> w = new CopyOnWriteArrayList<WeakReference<n>>();
  
  private j x;
  
  private boolean y = false;
  
  private boolean z;
  
  public g(Context paramContext) {
    this.a = paramContext;
    this.b = paramContext.getResources();
    this.f = new ArrayList<j>();
    this.g = new ArrayList<j>();
    this.h = true;
    this.i = new ArrayList<j>();
    this.j = new ArrayList<j>();
    this.k = true;
    e(true);
  }
  
  private static int a(ArrayList<j> paramArrayList, int paramInt) {
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      if (((j)paramArrayList.get(i)).c() <= paramInt)
        return i + 1; 
    } 
    return 0;
  }
  
  private j a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    return new j(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
  }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView) {
    Resources resources = l();
    if (paramView != null) {
      this.p = paramView;
      this.n = null;
      this.o = null;
    } else {
      if (paramInt1 > 0) {
        this.n = resources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.n = paramCharSequence;
      } 
      if (paramInt2 > 0) {
        this.o = b.g.e.a.c(e(), paramInt2);
      } else if (paramDrawable != null) {
        this.o = paramDrawable;
      } 
      this.p = null;
    } 
    b(false);
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    if (paramInt >= 0) {
      if (paramInt >= this.f.size())
        return; 
      this.f.remove(paramInt);
      if (paramBoolean)
        b(true); 
    } 
  }
  
  private boolean a(s params, n paramn) {
    boolean bool2 = this.w.isEmpty();
    boolean bool1 = false;
    if (bool2)
      return false; 
    if (paramn != null)
      bool1 = paramn.a(params); 
    for (WeakReference<n> weakReference : this.w) {
      n n1 = weakReference.get();
      if (n1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      if (!bool1)
        bool1 = n1.a(params); 
    } 
    return bool1;
  }
  
  private void d(boolean paramBoolean) {
    if (this.w.isEmpty())
      return; 
    s();
    for (WeakReference<n> weakReference : this.w) {
      n n = weakReference.get();
      if (n == null) {
        this.w.remove(weakReference);
        continue;
      } 
      n.a(paramBoolean);
    } 
    r();
  }
  
  private void e(boolean paramBoolean) {
    boolean bool = true;
    if (paramBoolean && (this.b.getConfiguration()).keyboard != 1 && w.d(ViewConfiguration.get(this.a), this.a)) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    this.d = paramBoolean;
  }
  
  private static int f(int paramInt) {
    int i = (0xFFFF0000 & paramInt) >> 16;
    if (i >= 0) {
      int[] arrayOfInt = A;
      if (i < arrayOfInt.length)
        return paramInt & 0xFFFF | arrayOfInt[i] << 16; 
    } 
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  public int a(int paramInt) {
    return a(paramInt, 0);
  }
  
  public int a(int paramInt1, int paramInt2) {
    int k = size();
    int i = paramInt2;
    if (paramInt2 < 0)
      i = 0; 
    while (i < k) {
      if (((j)this.f.get(i)).getGroupId() == paramInt1)
        return i; 
      i++;
    } 
    return -1;
  }
  
  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    int i = f(paramInt3);
    j j1 = a(paramInt1, paramInt2, paramInt3, i, paramCharSequence, this.l);
    ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
    if (contextMenuInfo != null)
      j1.a(contextMenuInfo); 
    ArrayList<j> arrayList = this.f;
    arrayList.add(a(arrayList, i), j1);
    b(true);
    return (MenuItem)j1;
  }
  
  protected g a(Drawable paramDrawable) {
    a(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected g a(View paramView) {
    a(0, null, 0, null, paramView);
    return this;
  }
  
  protected g a(CharSequence paramCharSequence) {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  j a(int paramInt, KeyEvent paramKeyEvent) {
    ArrayList<j> arrayList = this.v;
    arrayList.clear();
    a(arrayList, paramInt, paramKeyEvent);
    if (arrayList.isEmpty())
      return null; 
    int k = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(keyData);
    int m = arrayList.size();
    if (m == 1)
      return arrayList.get(0); 
    boolean bool = p();
    for (int i = 0; i < m; i++) {
      char c;
      j j1 = arrayList.get(i);
      if (bool) {
        c = j1.getAlphabeticShortcut();
      } else {
        c = j1.getNumericShortcut();
      } 
      if ((c == keyData.meta[0] && (k & 0x2) == 0) || (c == keyData.meta[2] && (k & 0x2) != 0) || (bool && c == '\b' && paramInt == 67))
        return j1; 
    } 
    return null;
  }
  
  public void a() {
    a a1 = this.e;
    if (a1 != null)
      a1.a(this); 
  }
  
  public void a(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    SparseArray sparseArray = paramBundle.getSparseParcelableArray(d());
    int k = size();
    int i;
    for (i = 0; i < k; i++) {
      MenuItem menuItem = getItem(i);
      View view = menuItem.getActionView();
      if (view != null && view.getId() != -1)
        view.restoreHierarchyState(sparseArray); 
      if (menuItem.hasSubMenu())
        ((s)menuItem.getSubMenu()).a(paramBundle); 
    } 
    i = paramBundle.getInt("android:menu:expandedactionview");
    if (i > 0) {
      MenuItem menuItem = findItem(i);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
  }
  
  void a(MenuItem paramMenuItem) {
    int k = paramMenuItem.getGroupId();
    int m = this.f.size();
    s();
    for (int i = 0; i < m; i++) {
      j j1 = this.f.get(i);
      if (j1.getGroupId() == k && j1.i() && j1.isCheckable()) {
        boolean bool;
        if (j1 == paramMenuItem) {
          bool = true;
        } else {
          bool = false;
        } 
        j1.b(bool);
      } 
    } 
    r();
  }
  
  public void a(a parama) {
    this.e = parama;
  }
  
  public void a(n paramn) {
    a(paramn, this.a);
  }
  
  public void a(n paramn, Context paramContext) {
    this.w.add(new WeakReference<n>(paramn));
    paramn.a(paramContext, this);
    this.k = true;
  }
  
  void a(List<j> paramList, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = p();
    int k = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    if (!paramKeyEvent.getKeyData(keyData) && paramInt != 67)
      return; 
    int m = this.f.size();
    int i;
    for (i = 0; i < m; i++) {
      char c;
      int n;
      j j1 = this.f.get(i);
      if (j1.hasSubMenu())
        ((g)j1.getSubMenu()).a(paramList, paramInt, paramKeyEvent); 
      if (bool) {
        c = j1.getAlphabeticShortcut();
      } else {
        c = j1.getNumericShortcut();
      } 
      if (bool) {
        n = j1.getAlphabeticModifiers();
      } else {
        n = j1.getNumericModifiers();
      } 
      if ((k & 0x1100F) == (n & 0x1100F)) {
        n = 1;
      } else {
        n = 0;
      } 
      if (n != 0 && c != '\000') {
        char[] arrayOfChar = keyData.meta;
        if ((c == arrayOfChar[0] || c == arrayOfChar[2] || (bool && c == '\b' && paramInt == 67)) && j1.isEnabled())
          paramList.add(j1); 
      } 
    } 
  }
  
  public final void a(boolean paramBoolean) {
    if (this.u)
      return; 
    this.u = true;
    for (WeakReference<n> weakReference : this.w) {
      n n = weakReference.get();
      if (n == null) {
        this.w.remove(weakReference);
        continue;
      } 
      n.a(this, paramBoolean);
    } 
    this.u = false;
  }
  
  public boolean a(MenuItem paramMenuItem, int paramInt) {
    return a(paramMenuItem, (n)null, paramInt);
  }
  
  public boolean a(MenuItem paramMenuItem, n paramn, int paramInt) {
    j j1 = (j)paramMenuItem;
    if (j1 != null) {
      boolean bool;
      boolean bool1;
      if (!j1.isEnabled())
        return false; 
      boolean bool2 = j1.g();
      b.g.m.b b = j1.a();
      if (b != null && b.a()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (j1.f()) {
        bool2 |= j1.expandActionView();
        bool1 = bool2;
        if (bool2) {
          bool1 = bool2;
          a(true);
          return bool1;
        } 
      } else {
        if (j1.hasSubMenu() || bool) {
          if ((paramInt & 0x4) == 0)
            a(false); 
          if (!j1.hasSubMenu())
            j1.a(new s(e(), this, j1)); 
          s s = (s)j1.getSubMenu();
          if (bool)
            b.a(s); 
          bool2 |= a(s, paramn);
          boolean bool3 = bool2;
          if (!bool2) {
            bool3 = bool2;
            a(true);
            return bool3;
          } 
          return bool3;
        } 
        bool1 = bool2;
        if ((paramInt & 0x1) == 0) {
          bool1 = bool2;
          a(true);
          return bool1;
        } 
      } 
      return bool1;
    } 
    return false;
  }
  
  boolean a(g paramg, MenuItem paramMenuItem) {
    a a1 = this.e;
    return (a1 != null && a1.a(paramg, paramMenuItem));
  }
  
  public boolean a(j paramj) {
    boolean bool3 = this.w.isEmpty();
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bool3) {
      if (this.x != paramj)
        return false; 
      s();
      Iterator<WeakReference<n>> iterator = this.w.iterator();
      bool1 = bool2;
      while (true) {
        bool2 = bool1;
        if (iterator.hasNext()) {
          WeakReference<n> weakReference = iterator.next();
          n n = weakReference.get();
          if (n == null) {
            this.w.remove(weakReference);
            continue;
          } 
          bool2 = n.a(this, paramj);
          bool1 = bool2;
          if (bool2)
            break; 
          continue;
        } 
        break;
      } 
      r();
      bool1 = bool2;
      if (bool2) {
        this.x = null;
        bool1 = bool2;
      } 
    } 
    return bool1;
  }
  
  public MenuItem add(int paramInt) {
    return a(0, 0, 0, this.b.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a(paramInt1, paramInt2, paramInt3, this.b.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence) {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    byte b1;
    PackageManager packageManager = this.a.getPackageManager();
    byte b2 = 0;
    List<ResolveInfo> list = packageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    if (list != null) {
      b1 = list.size();
    } else {
      b1 = 0;
    } 
    int i = b2;
    if ((paramInt4 & 0x1) == 0) {
      removeGroup(paramInt1);
      i = b2;
    } 
    while (i < b1) {
      ResolveInfo resolveInfo = list.get(i);
      paramInt4 = resolveInfo.specificIndex;
      if (paramInt4 < 0) {
        intent = paramIntent;
      } else {
        intent = paramArrayOfIntent[paramInt4];
      } 
      Intent intent = new Intent(intent);
      intent.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
      MenuItem menuItem = add(paramInt1, paramInt2, paramInt3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent);
      if (paramArrayOfMenuItem != null) {
        paramInt4 = resolveInfo.specificIndex;
        if (paramInt4 >= 0)
          paramArrayOfMenuItem[paramInt4] = menuItem; 
      } 
      i++;
    } 
    return b1;
  }
  
  public SubMenu addSubMenu(int paramInt) {
    return addSubMenu(0, 0, 0, this.b.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.b.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    j j1 = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    s s = new s(this.a, this, j1);
    j1.a(s);
    return s;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence) {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public int b(int paramInt) {
    int k = size();
    for (int i = 0; i < k; i++) {
      if (((j)this.f.get(i)).getItemId() == paramInt)
        return i; 
    } 
    return -1;
  }
  
  public void b() {
    ArrayList<j> arrayList = n();
    if (!this.k)
      return; 
    Iterator<WeakReference<n>> iterator = this.w.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= n.a()) {
      WeakReference<n> weakReference = iterator.next();
      n n = weakReference.get();
      if (n == null) {
        this.w.remove(weakReference);
        continue;
      } 
    } 
    if (bool) {
      this.i.clear();
      this.j.clear();
      int i = arrayList.size();
      bool = false;
      while (bool < i) {
        ArrayList<j> arrayList1;
        j j1 = arrayList.get(bool);
        if (j1.h()) {
          arrayList1 = this.i;
        } else {
          arrayList1 = this.j;
        } 
        arrayList1.add(j1);
        int k = bool + 1;
      } 
    } else {
      this.i.clear();
      this.j.clear();
      this.j.addAll(n());
    } 
    this.k = false;
  }
  
  public void b(Bundle paramBundle) {
    int k = size();
    SparseArray sparseArray = null;
    int i = 0;
    while (i < k) {
      MenuItem menuItem = getItem(i);
      View view = menuItem.getActionView();
      SparseArray sparseArray1 = sparseArray;
      if (view != null) {
        sparseArray1 = sparseArray;
        if (view.getId() != -1) {
          SparseArray sparseArray2 = sparseArray;
          if (sparseArray == null)
            sparseArray2 = new SparseArray(); 
          view.saveHierarchyState(sparseArray2);
          sparseArray1 = sparseArray2;
          if (menuItem.isActionViewExpanded()) {
            paramBundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
            sparseArray1 = sparseArray2;
          } 
        } 
      } 
      if (menuItem.hasSubMenu())
        ((s)menuItem.getSubMenu()).b(paramBundle); 
      i++;
      sparseArray = sparseArray1;
    } 
    if (sparseArray != null)
      paramBundle.putSparseParcelableArray(d(), sparseArray); 
  }
  
  public void b(n paramn) {
    for (WeakReference<n> weakReference : this.w) {
      n n1 = weakReference.get();
      if (n1 == null || n1 == paramn)
        this.w.remove(weakReference); 
    } 
  }
  
  public void b(boolean paramBoolean) {
    if (!this.q) {
      if (paramBoolean) {
        this.h = true;
        this.k = true;
      } 
      d(paramBoolean);
      return;
    } 
    this.r = true;
    if (paramBoolean)
      this.s = true; 
  }
  
  public boolean b(j paramj) {
    boolean bool2 = this.w.isEmpty();
    boolean bool1 = false;
    if (bool2)
      return false; 
    s();
    Iterator<WeakReference<n>> iterator = this.w.iterator();
    while (true) {
      bool2 = bool1;
      if (iterator.hasNext()) {
        WeakReference<n> weakReference = iterator.next();
        n n = weakReference.get();
        if (n == null) {
          this.w.remove(weakReference);
          continue;
        } 
        bool2 = n.b(this, paramj);
        bool1 = bool2;
        if (bool2)
          break; 
        continue;
      } 
      break;
    } 
    r();
    if (bool2)
      this.x = paramj; 
    return bool2;
  }
  
  public g c(int paramInt) {
    this.l = paramInt;
    return this;
  }
  
  public ArrayList<j> c() {
    b();
    return this.i;
  }
  
  void c(j paramj) {
    this.k = true;
    b(true);
  }
  
  public void c(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public void clear() {
    j j1 = this.x;
    if (j1 != null)
      a(j1); 
    this.f.clear();
    b(true);
  }
  
  public void clearHeader() {
    this.o = null;
    this.n = null;
    this.p = null;
    b(false);
  }
  
  public void close() {
    a(true);
  }
  
  protected g d(int paramInt) {
    a(0, null, paramInt, null, null);
    return this;
  }
  
  protected String d() {
    return "android:menu:actionviewstates";
  }
  
  void d(j paramj) {
    this.h = true;
    b(true);
  }
  
  public Context e() {
    return this.a;
  }
  
  protected g e(int paramInt) {
    a(paramInt, null, 0, null, null);
    return this;
  }
  
  public j f() {
    return this.x;
  }
  
  public MenuItem findItem(int paramInt) {
    int k = size();
    for (int i = 0; i < k; i++) {
      j j1 = this.f.get(i);
      if (j1.getItemId() == paramInt)
        return (MenuItem)j1; 
      if (j1.hasSubMenu()) {
        MenuItem menuItem = j1.getSubMenu().findItem(paramInt);
        if (menuItem != null)
          return menuItem; 
      } 
    } 
    return null;
  }
  
  public Drawable g() {
    return this.o;
  }
  
  public MenuItem getItem(int paramInt) {
    return (MenuItem)this.f.get(paramInt);
  }
  
  public CharSequence h() {
    return this.n;
  }
  
  public boolean hasVisibleItems() {
    if (this.z)
      return true; 
    int k = size();
    for (int i = 0; i < k; i++) {
      if (((j)this.f.get(i)).isVisible())
        return true; 
    } 
    return false;
  }
  
  public View i() {
    return this.p;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
    return (a(paramInt, paramKeyEvent) != null);
  }
  
  public ArrayList<j> j() {
    b();
    return this.j;
  }
  
  boolean k() {
    return this.t;
  }
  
  Resources l() {
    return this.b;
  }
  
  public g m() {
    return this;
  }
  
  public ArrayList<j> n() {
    if (!this.h)
      return this.g; 
    this.g.clear();
    int k = this.f.size();
    for (int i = 0; i < k; i++) {
      j j1 = this.f.get(i);
      if (j1.isVisible())
        this.g.add(j1); 
    } 
    this.h = false;
    this.k = true;
    return this.g;
  }
  
  public boolean o() {
    return this.y;
  }
  
  boolean p() {
    return this.c;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2) {
    return a(findItem(paramInt1), paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    boolean bool;
    j j1 = a(paramInt1, paramKeyEvent);
    if (j1 != null) {
      bool = a((MenuItem)j1, paramInt2);
    } else {
      bool = false;
    } 
    if ((paramInt2 & 0x2) != 0)
      a(true); 
    return bool;
  }
  
  public boolean q() {
    return this.d;
  }
  
  public void r() {
    this.q = false;
    if (this.r) {
      this.r = false;
      b(this.s);
    } 
  }
  
  public void removeGroup(int paramInt) {
    int i = a(paramInt);
    if (i >= 0) {
      int m = this.f.size();
      for (int k = 0; k < m - i && ((j)this.f.get(i)).getGroupId() == paramInt; k++)
        a(i, false); 
      b(true);
    } 
  }
  
  public void removeItem(int paramInt) {
    a(b(paramInt), true);
  }
  
  public void s() {
    if (!this.q) {
      this.q = true;
      this.r = false;
      this.s = false;
    } 
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int k = this.f.size();
    int i;
    for (i = 0; i < k; i++) {
      j j1 = this.f.get(i);
      if (j1.getGroupId() == paramInt) {
        j1.c(paramBoolean2);
        j1.setCheckable(paramBoolean1);
      } 
    } 
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean) {
    int k = this.f.size();
    for (int i = 0; i < k; i++) {
      j j1 = this.f.get(i);
      if (j1.getGroupId() == paramInt)
        j1.setEnabled(paramBoolean); 
    } 
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean) {
    int k = this.f.size();
    int i = 0;
    boolean bool;
    for (bool = false; i < k; bool = bool1) {
      j j1 = this.f.get(i);
      boolean bool1 = bool;
      if (j1.getGroupId() == paramInt) {
        bool1 = bool;
        if (j1.e(paramBoolean))
          bool1 = true; 
      } 
      i++;
    } 
    if (bool)
      b(true); 
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.c = paramBoolean;
    b(false);
  }
  
  public int size() {
    return this.f.size();
  }
  
  public static interface a {
    void a(g param1g);
    
    boolean a(g param1g, MenuItem param1MenuItem);
  }
  
  public static interface b {
    boolean a(j param1j);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */