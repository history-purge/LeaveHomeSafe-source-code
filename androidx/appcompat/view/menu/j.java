package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b.a.h;
import b.g.h.a.b;
import b.g.m.b;

public final class j implements b {
  private View A;
  
  private b B;
  
  private MenuItem.OnActionExpandListener C;
  
  private boolean D = false;
  
  private ContextMenu.ContextMenuInfo E;
  
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private CharSequence e;
  
  private CharSequence f;
  
  private Intent g;
  
  private char h;
  
  private int i = 4096;
  
  private char j;
  
  private int k = 4096;
  
  private Drawable l;
  
  private int m = 0;
  
  g n;
  
  private s o;
  
  private Runnable p;
  
  private MenuItem.OnMenuItemClickListener q;
  
  private CharSequence r;
  
  private CharSequence s;
  
  private ColorStateList t = null;
  
  private PorterDuff.Mode u = null;
  
  private boolean v = false;
  
  private boolean w = false;
  
  private boolean x = false;
  
  private int y = 16;
  
  private int z = 0;
  
  j(g paramg, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    this.n = paramg;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.z = paramInt5;
  }
  
  private Drawable a(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull -> 74
    //   6: aload_1
    //   7: astore_2
    //   8: aload_0
    //   9: getfield x : Z
    //   12: ifeq -> 74
    //   15: aload_0
    //   16: getfield v : Z
    //   19: ifne -> 31
    //   22: aload_1
    //   23: astore_2
    //   24: aload_0
    //   25: getfield w : Z
    //   28: ifeq -> 74
    //   31: aload_1
    //   32: invokestatic i : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   35: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   38: astore_2
    //   39: aload_0
    //   40: getfield v : Z
    //   43: ifeq -> 54
    //   46: aload_2
    //   47: aload_0
    //   48: getfield t : Landroid/content/res/ColorStateList;
    //   51: invokestatic a : (Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    //   54: aload_0
    //   55: getfield w : Z
    //   58: ifeq -> 69
    //   61: aload_2
    //   62: aload_0
    //   63: getfield u : Landroid/graphics/PorterDuff$Mode;
    //   66: invokestatic a : (Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield x : Z
    //   74: aload_2
    //   75: areturn
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString) {
    if ((paramInt1 & paramInt2) == paramInt2)
      paramStringBuilder.append(paramString); 
  }
  
  public b a(b paramb) {
    b b1 = this.B;
    if (b1 != null)
      b1.f(); 
    this.A = null;
    this.B = paramb;
    this.n.b(true);
    paramb = this.B;
    if (paramb != null)
      paramb.a(new a(this)); 
    return this;
  }
  
  public b a() {
    return this.B;
  }
  
  CharSequence a(o.a parama) {
    return (parama != null && parama.a()) ? getTitleCondensed() : getTitle();
  }
  
  void a(ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    this.E = paramContextMenuInfo;
  }
  
  public void a(s params) {
    this.o = params;
    params.setHeaderTitle(getTitle());
  }
  
  public void a(boolean paramBoolean) {
    this.D = paramBoolean;
    this.n.b(false);
  }
  
  public void b() {
    this.n.c(this);
  }
  
  void b(boolean paramBoolean) {
    boolean bool;
    int i = this.y;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.y = bool | i & 0xFFFFFFFD;
    if (i != this.y)
      this.n.b(false); 
  }
  
  public int c() {
    return this.d;
  }
  
  public void c(boolean paramBoolean) {
    boolean bool;
    int i = this.y;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.y = bool | i & 0xFFFFFFFB;
  }
  
  public boolean collapseActionView() {
    if ((this.z & 0x8) == 0)
      return false; 
    if (this.A == null)
      return true; 
    MenuItem.OnActionExpandListener onActionExpandListener = this.C;
    return (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) ? this.n.a(this) : false;
  }
  
  char d() {
    return this.n.p() ? this.j : this.h;
  }
  
  public void d(boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = this.y | 0x20;
    } else {
      i = this.y & 0xFFFFFFDF;
    } 
    this.y = i;
  }
  
  String e() {
    int i;
    char c = d();
    if (c == '\000')
      return ""; 
    Resources resources = this.n.e().getResources();
    StringBuilder stringBuilder = new StringBuilder();
    if (ViewConfiguration.get(this.n.e()).hasPermanentMenuKey())
      stringBuilder.append(resources.getString(h.abc_prepend_shortcut_label)); 
    if (this.n.p()) {
      i = this.k;
    } else {
      i = this.i;
    } 
    a(stringBuilder, i, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
    a(stringBuilder, i, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
    a(stringBuilder, i, 2, resources.getString(h.abc_menu_alt_shortcut_label));
    a(stringBuilder, i, 1, resources.getString(h.abc_menu_shift_shortcut_label));
    a(stringBuilder, i, 4, resources.getString(h.abc_menu_sym_shortcut_label));
    a(stringBuilder, i, 8, resources.getString(h.abc_menu_function_shortcut_label));
    if (c != '\b') {
      if (c != '\n') {
        if (c != ' ') {
          stringBuilder.append(c);
        } else {
          i = h.abc_menu_space_shortcut_label;
          stringBuilder.append(resources.getString(i));
        } 
      } else {
        i = h.abc_menu_enter_shortcut_label;
        stringBuilder.append(resources.getString(i));
      } 
    } else {
      i = h.abc_menu_delete_shortcut_label;
      stringBuilder.append(resources.getString(i));
    } 
    return stringBuilder.toString();
  }
  
  boolean e(boolean paramBoolean) {
    byte b1;
    int i = this.y;
    boolean bool = false;
    if (paramBoolean) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    this.y = b1 | i & 0xFFFFFFF7;
    paramBoolean = bool;
    if (i != this.y)
      paramBoolean = true; 
    return paramBoolean;
  }
  
  public boolean expandActionView() {
    if (!f())
      return false; 
    MenuItem.OnActionExpandListener onActionExpandListener = this.C;
    return (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand((MenuItem)this)) ? this.n.b(this) : false;
  }
  
  public boolean f() {
    int i = this.z;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((i & 0x8) != 0) {
      if (this.A == null) {
        b b1 = this.B;
        if (b1 != null)
          this.A = b1.a((MenuItem)this); 
      } 
      bool1 = bool2;
      if (this.A != null)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public boolean g() {
    MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
    if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick((MenuItem)this))
      return true; 
    g g1 = this.n;
    if (g1.a(g1, (MenuItem)this))
      return true; 
    Runnable runnable = this.p;
    if (runnable != null) {
      runnable.run();
      return true;
    } 
    if (this.g != null)
      try {
        this.n.e().startActivity(this.g);
        return true;
      } catch (ActivityNotFoundException activityNotFoundException) {
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)activityNotFoundException);
      }  
    b b1 = this.B;
    return (b1 != null && b1.d());
  }
  
  public ActionProvider getActionProvider() {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public View getActionView() {
    View view = this.A;
    if (view != null)
      return view; 
    b b1 = this.B;
    if (b1 != null) {
      this.A = b1.a((MenuItem)this);
      return this.A;
    } 
    return null;
  }
  
  public int getAlphabeticModifiers() {
    return this.k;
  }
  
  public char getAlphabeticShortcut() {
    return this.j;
  }
  
  public CharSequence getContentDescription() {
    return this.r;
  }
  
  public int getGroupId() {
    return this.b;
  }
  
  public Drawable getIcon() {
    Drawable drawable = this.l;
    if (drawable != null)
      return a(drawable); 
    if (this.m != 0) {
      drawable = b.a.k.a.a.c(this.n.e(), this.m);
      this.m = 0;
      this.l = drawable;
      return a(drawable);
    } 
    return null;
  }
  
  public ColorStateList getIconTintList() {
    return this.t;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.u;
  }
  
  public Intent getIntent() {
    return this.g;
  }
  
  @CapturedViewProperty
  public int getItemId() {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return this.E;
  }
  
  public int getNumericModifiers() {
    return this.i;
  }
  
  public char getNumericShortcut() {
    return this.h;
  }
  
  public int getOrder() {
    return this.c;
  }
  
  public SubMenu getSubMenu() {
    return this.o;
  }
  
  @CapturedViewProperty
  public CharSequence getTitle() {
    return this.e;
  }
  
  public CharSequence getTitleCondensed() {
    CharSequence charSequence1 = this.f;
    if (charSequence1 == null)
      charSequence1 = this.e; 
    CharSequence charSequence2 = charSequence1;
    if (Build.VERSION.SDK_INT < 18) {
      charSequence2 = charSequence1;
      if (charSequence1 != null) {
        charSequence2 = charSequence1;
        if (!(charSequence1 instanceof String))
          charSequence2 = charSequence1.toString(); 
      } 
    } 
    return charSequence2;
  }
  
  public CharSequence getTooltipText() {
    return this.s;
  }
  
  public boolean h() {
    return ((this.y & 0x20) == 32);
  }
  
  public boolean hasSubMenu() {
    return (this.o != null);
  }
  
  public boolean i() {
    return ((this.y & 0x4) != 0);
  }
  
  public boolean isActionViewExpanded() {
    return this.D;
  }
  
  public boolean isCheckable() {
    return ((this.y & 0x1) == 1);
  }
  
  public boolean isChecked() {
    return ((this.y & 0x2) == 2);
  }
  
  public boolean isEnabled() {
    return ((this.y & 0x10) != 0);
  }
  
  public boolean isVisible() {
    b b1 = this.B;
    return (b1 != null && b1.e()) ? (((this.y & 0x8) == 0 && this.B.b())) : (((this.y & 0x8) == 0));
  }
  
  public boolean j() {
    return ((this.z & 0x1) == 1);
  }
  
  public boolean k() {
    return ((this.z & 0x2) == 2);
  }
  
  public boolean l() {
    return this.n.k();
  }
  
  boolean m() {
    return (this.n.q() && d() != '\000');
  }
  
  public boolean n() {
    return ((this.z & 0x4) == 4);
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public b setActionView(int paramInt) {
    Context context = this.n.e();
    setActionView(LayoutInflater.from(context).inflate(paramInt, (ViewGroup)new LinearLayout(context), false));
    return this;
  }
  
  public b setActionView(View paramView) {
    this.A = paramView;
    this.B = null;
    if (paramView != null && paramView.getId() == -1) {
      int i = this.a;
      if (i > 0)
        paramView.setId(i); 
    } 
    this.n.c(this);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    if (this.j == paramChar)
      return (MenuItem)this; 
    this.j = Character.toLowerCase(paramChar);
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    if (this.j == paramChar && this.k == paramInt)
      return (MenuItem)this; 
    this.j = Character.toLowerCase(paramChar);
    this.k = KeyEvent.normalizeMetaState(paramInt);
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    int i = this.y;
    this.y = paramBoolean | i & 0xFFFFFFFE;
    if (i != this.y)
      this.n.b(false); 
    return (MenuItem)this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    if ((this.y & 0x4) != 0) {
      this.n.a((MenuItem)this);
      return (MenuItem)this;
    } 
    b(paramBoolean);
    return (MenuItem)this;
  }
  
  public b setContentDescription(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = this.y | 0x10;
    } else {
      i = this.y & 0xFFFFFFEF;
    } 
    this.y = i;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.l = null;
    this.m = paramInt;
    this.x = true;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.m = 0;
    this.l = paramDrawable;
    this.x = true;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.t = paramColorStateList;
    this.v = true;
    this.x = true;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.u = paramMode;
    this.w = true;
    this.x = true;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.g = paramIntent;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    if (this.h == paramChar)
      return (MenuItem)this; 
    this.h = paramChar;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    if (this.h == paramChar && this.i == paramInt)
      return (MenuItem)this; 
    this.h = paramChar;
    this.i = KeyEvent.normalizeMetaState(paramInt);
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    this.C = paramOnActionExpandListener;
    return (MenuItem)this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.q = paramOnMenuItemClickListener;
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.h = paramChar1;
    this.j = Character.toLowerCase(paramChar2);
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.h = paramChar1;
    this.i = KeyEvent.normalizeMetaState(paramInt1);
    this.j = Character.toLowerCase(paramChar2);
    this.k = KeyEvent.normalizeMetaState(paramInt2);
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public void setShowAsAction(int paramInt) {
    int i = paramInt & 0x3;
    if (i == 0 || i == 1 || i == 2) {
      this.z = paramInt;
      this.n.c(this);
      return;
    } 
    throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
  }
  
  public b setShowAsActionFlags(int paramInt) {
    setShowAsAction(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt) {
    setTitle(this.n.e().getString(paramInt));
    return (MenuItem)this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    this.n.b(false);
    s s1 = this.o;
    if (s1 != null)
      s1.setHeaderTitle(paramCharSequence); 
    return (MenuItem)this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    this.n.b(false);
    return (MenuItem)this;
  }
  
  public b setTooltipText(CharSequence paramCharSequence) {
    this.s = paramCharSequence;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    if (e(paramBoolean))
      this.n.d(this); 
    return (MenuItem)this;
  }
  
  public String toString() {
    CharSequence charSequence = this.e;
    return (charSequence != null) ? charSequence.toString() : null;
  }
  
  class a implements b.b {
    a(j this$0) {}
    
    public void onActionProviderVisibilityChanged(boolean param1Boolean) {
      j j1 = this.a;
      j1.n.d(j1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */