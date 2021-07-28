package b.g.m.e0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c {
  private static int d;
  
  private final AccessibilityNodeInfo a;
  
  public int b = -1;
  
  private int c = -1;
  
  private c(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    this.a = paramAccessibilityNodeInfo;
  }
  
  public static c A() {
    return a(AccessibilityNodeInfo.obtain());
  }
  
  private int a(ClickableSpan paramClickableSpan, SparseArray<WeakReference<ClickableSpan>> paramSparseArray) {
    if (paramSparseArray != null)
      for (int j = 0; j < paramSparseArray.size(); j++) {
        if (paramClickableSpan.equals(((WeakReference<ClickableSpan>)paramSparseArray.valueAt(j)).get()))
          return paramSparseArray.keyAt(j); 
      }  
    int i = d;
    d = i + 1;
    return i;
  }
  
  public static c a(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return new c(paramAccessibilityNodeInfo);
  }
  
  public static c a(c paramc) {
    return a(AccessibilityNodeInfo.obtain(paramc.a));
  }
  
  private List<Integer> a(String paramString) {
    if (Build.VERSION.SDK_INT < 19)
      return new ArrayList<Integer>(); 
    ArrayList<Integer> arrayList2 = this.a.getExtras().getIntegerArrayList(paramString);
    ArrayList<Integer> arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      this.a.getExtras().putIntegerArrayList(paramString, arrayList1);
    } 
    return arrayList1;
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    Bundle bundle = f();
    if (bundle != null) {
      boolean bool;
      int i = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      if (paramBoolean) {
        bool = paramInt;
      } else {
        bool = false;
      } 
      bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", bool | i & (paramInt ^ 0xFFFFFFFF));
    } 
  }
  
  private void a(ClickableSpan paramClickableSpan, Spanned paramSpanned, int paramInt) {
    a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(paramSpanned.getSpanStart(paramClickableSpan)));
    a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(paramSpanned.getSpanEnd(paramClickableSpan)));
    a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(paramSpanned.getSpanFlags(paramClickableSpan)));
    a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(paramInt));
  }
  
  private static String b(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                switch (paramInt) {
                  default:
                    return "ACTION_UNKNOWN";
                  case 16908361:
                    return "ACTION_PAGE_RIGHT";
                  case 16908360:
                    return "ACTION_PAGE_LEFT";
                  case 16908359:
                    return "ACTION_PAGE_DOWN";
                  case 16908358:
                    return "ACTION_PAGE_UP";
                  case 16908357:
                    return "ACTION_HIDE_TOOLTIP";
                  case 16908356:
                    break;
                } 
                return "ACTION_SHOW_TOOLTIP";
              case 16908349:
                return "ACTION_SET_PROGRESS";
              case 16908348:
                return "ACTION_CONTEXT_CLICK";
              case 16908347:
                return "ACTION_SCROLL_RIGHT";
              case 16908346:
                return "ACTION_SCROLL_DOWN";
              case 16908345:
                return "ACTION_SCROLL_LEFT";
              case 16908344:
                return "ACTION_SCROLL_UP";
              case 16908343:
                return "ACTION_SCROLL_TO_POSITION";
              case 16908342:
                break;
            } 
            return "ACTION_SHOW_ON_SCREEN";
          case 16908354:
            return "ACTION_MOVE_WINDOW";
          case 2097152:
            return "ACTION_SET_TEXT";
          case 524288:
            return "ACTION_COLLAPSE";
          case 262144:
            return "ACTION_EXPAND";
          case 131072:
            return "ACTION_SET_SELECTION";
          case 65536:
            return "ACTION_CUT";
          case 32768:
            return "ACTION_PASTE";
          case 16384:
            return "ACTION_COPY";
          case 8192:
            return "ACTION_SCROLL_BACKWARD";
          case 4096:
            return "ACTION_SCROLL_FORWARD";
          case 2048:
            return "ACTION_PREVIOUS_HTML_ELEMENT";
          case 1024:
            return "ACTION_NEXT_HTML_ELEMENT";
          case 512:
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
          case 256:
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
          case 128:
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
          case 64:
            return "ACTION_ACCESSIBILITY_FOCUS";
          case 32:
            return "ACTION_LONG_CLICK";
          case 16:
            return "ACTION_CLICK";
          case 8:
            return "ACTION_CLEAR_SELECTION";
          case 4:
            break;
        } 
        return "ACTION_SELECT";
      } 
      return "ACTION_CLEAR_FOCUS";
    } 
    return "ACTION_FOCUS";
  }
  
  private boolean c(int paramInt) {
    Bundle bundle = f();
    boolean bool = false;
    if (bundle == null)
      return false; 
    if ((bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & paramInt) == paramInt)
      bool = true; 
    return bool;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> d(View paramView) {
    SparseArray<WeakReference<ClickableSpan>> sparseArray2 = e(paramView);
    SparseArray<WeakReference<ClickableSpan>> sparseArray1 = sparseArray2;
    if (sparseArray2 == null) {
      sparseArray1 = new SparseArray();
      paramView.setTag(b.g.c.tag_accessibility_clickable_spans, sparseArray1);
    } 
    return sparseArray1;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> e(View paramView) {
    return (SparseArray<WeakReference<ClickableSpan>>)paramView.getTag(b.g.c.tag_accessibility_clickable_spans);
  }
  
  public static c f(View paramView) {
    return a(AccessibilityNodeInfo.obtain(paramView));
  }
  
  private void g(View paramView) {
    SparseArray<WeakReference<ClickableSpan>> sparseArray = e(paramView);
    if (sparseArray != null) {
      int j;
      ArrayList<Integer> arrayList = new ArrayList();
      byte b = 0;
      int i = 0;
      while (true) {
        j = b;
        if (i < sparseArray.size()) {
          if (((WeakReference)sparseArray.valueAt(i)).get() == null)
            arrayList.add(Integer.valueOf(i)); 
          i++;
          continue;
        } 
        break;
      } 
      while (j < arrayList.size()) {
        sparseArray.remove(((Integer)arrayList.get(j)).intValue());
        j++;
      } 
    } 
  }
  
  public static ClickableSpan[] i(CharSequence paramCharSequence) {
    return (paramCharSequence instanceof Spanned) ? (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class) : null;
  }
  
  private void y() {
    if (Build.VERSION.SDK_INT >= 19) {
      this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    } 
  }
  
  private boolean z() {
    return a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
  }
  
  public List<a> a() {
    List list;
    if (Build.VERSION.SDK_INT >= 21) {
      list = this.a.getActionList();
    } else {
      list = null;
    } 
    if (list != null) {
      ArrayList<a> arrayList = new ArrayList();
      int j = list.size();
      for (int i = 0; i < j; i++)
        arrayList.add(new a(list.get(i))); 
      return arrayList;
    } 
    return Collections.emptyList();
  }
  
  public void a(int paramInt) {
    this.a.addAction(paramInt);
  }
  
  @Deprecated
  public void a(Rect paramRect) {
    this.a.getBoundsInParent(paramRect);
  }
  
  public void a(View paramView) {
    this.a.addChild(paramView);
  }
  
  public void a(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 16)
      this.a.addChild(paramView, paramInt); 
  }
  
  public void a(a parama) {
    if (Build.VERSION.SDK_INT >= 21)
      this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)parama.a); 
  }
  
  public void a(d paramd) {
    if (Build.VERSION.SDK_INT >= 19)
      this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo)paramd.a); 
  }
  
  public void a(CharSequence paramCharSequence) {
    this.a.setClassName(paramCharSequence);
  }
  
  public void a(CharSequence paramCharSequence, View paramView) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19 && i < 26) {
      y();
      g(paramView);
      ClickableSpan[] arrayOfClickableSpan = i(paramCharSequence);
      if (arrayOfClickableSpan != null && arrayOfClickableSpan.length > 0) {
        f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.g.c.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> sparseArray = d(paramView);
        for (i = 0; arrayOfClickableSpan != null && i < arrayOfClickableSpan.length; i++) {
          int j = a(arrayOfClickableSpan[i], sparseArray);
          sparseArray.put(j, new WeakReference<ClickableSpan>(arrayOfClickableSpan[i]));
          a(arrayOfClickableSpan[i], (Spanned)paramCharSequence, j);
        } 
      } 
    } 
  }
  
  public void a(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 19) {
      AccessibilityNodeInfo accessibilityNodeInfo = this.a;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = ((b)paramObject).a;
      } 
      accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject);
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 16)
      this.a.setAccessibilityFocused(paramBoolean); 
  }
  
  public boolean a(int paramInt, Bundle paramBundle) {
    return (Build.VERSION.SDK_INT >= 16) ? this.a.performAction(paramInt, paramBundle) : false;
  }
  
  public int b() {
    return this.a.getActions();
  }
  
  public void b(Rect paramRect) {
    this.a.getBoundsInScreen(paramRect);
  }
  
  public void b(View paramView) {
    this.b = -1;
    this.a.setParent(paramView);
  }
  
  public void b(View paramView, int paramInt) {
    this.b = paramInt;
    if (Build.VERSION.SDK_INT >= 16)
      this.a.setParent(paramView, paramInt); 
  }
  
  public void b(CharSequence paramCharSequence) {
    this.a.setContentDescription(paramCharSequence);
  }
  
  public void b(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 19) {
      AccessibilityNodeInfo accessibilityNodeInfo = this.a;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = ((c)paramObject).a;
      } 
      accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject);
    } 
  }
  
  public void b(boolean paramBoolean) {
    this.a.setCheckable(paramBoolean);
  }
  
  public boolean b(a parama) {
    return (Build.VERSION.SDK_INT >= 21) ? this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction)parama.a) : false;
  }
  
  public int c() {
    return this.a.getChildCount();
  }
  
  @Deprecated
  public void c(Rect paramRect) {
    this.a.setBoundsInParent(paramRect);
  }
  
  public void c(View paramView) {
    this.c = -1;
    this.a.setSource(paramView);
  }
  
  public void c(View paramView, int paramInt) {
    this.c = paramInt;
    if (Build.VERSION.SDK_INT >= 16)
      this.a.setSource(paramView, paramInt); 
  }
  
  public void c(CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 21)
      this.a.setError(paramCharSequence); 
  }
  
  public void c(boolean paramBoolean) {
    this.a.setChecked(paramBoolean);
  }
  
  public CharSequence d() {
    return this.a.getClassName();
  }
  
  public void d(Rect paramRect) {
    this.a.setBoundsInScreen(paramRect);
  }
  
  public void d(CharSequence paramCharSequence) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      this.a.setHintText(paramCharSequence);
      return;
    } 
    if (i >= 19)
      this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramCharSequence); 
  }
  
  public void d(boolean paramBoolean) {
    this.a.setClickable(paramBoolean);
  }
  
  public CharSequence e() {
    return this.a.getContentDescription();
  }
  
  public void e(CharSequence paramCharSequence) {
    this.a.setPackageName(paramCharSequence);
  }
  
  public void e(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 19)
      this.a.setContentInvalid(paramBoolean); 
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof c))
      return false; 
    paramObject = paramObject;
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (accessibilityNodeInfo == null) {
      if (((c)paramObject).a != null)
        return false; 
    } else if (!accessibilityNodeInfo.equals(((c)paramObject).a)) {
      return false;
    } 
    return (this.c != ((c)paramObject).c) ? false : (!(this.b != ((c)paramObject).b));
  }
  
  public Bundle f() {
    return (Build.VERSION.SDK_INT >= 19) ? this.a.getExtras() : new Bundle();
  }
  
  public void f(CharSequence paramCharSequence) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      this.a.setPaneTitle(paramCharSequence);
      return;
    } 
    if (i >= 19)
      this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paramCharSequence); 
  }
  
  public void f(boolean paramBoolean) {
    this.a.setEnabled(paramBoolean);
  }
  
  public CharSequence g() {
    return this.a.getPackageName();
  }
  
  public void g(CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 19)
      this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", paramCharSequence); 
  }
  
  public void g(boolean paramBoolean) {
    this.a.setFocusable(paramBoolean);
  }
  
  public CharSequence h() {
    if (z()) {
      List<Integer> list1 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List<Integer> list2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List<Integer> list3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List<Integer> list4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      CharSequence charSequence = this.a.getText();
      int j = this.a.getText().length();
      int i = 0;
      SpannableString spannableString = new SpannableString(TextUtils.substring(charSequence, 0, j));
      while (i < list1.size()) {
        spannableString.setSpan(new a(((Integer)list4.get(i)).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list1.get(i)).intValue(), ((Integer)list2.get(i)).intValue(), ((Integer)list3.get(i)).intValue());
        i++;
      } 
      return (CharSequence)spannableString;
    } 
    return this.a.getText();
  }
  
  public void h(CharSequence paramCharSequence) {
    this.a.setText(paramCharSequence);
  }
  
  public void h(boolean paramBoolean) {
    this.a.setFocused(paramBoolean);
  }
  
  public int hashCode() {
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    return (accessibilityNodeInfo == null) ? 0 : accessibilityNodeInfo.hashCode();
  }
  
  public String i() {
    return (Build.VERSION.SDK_INT >= 18) ? this.a.getViewIdResourceName() : null;
  }
  
  public void i(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.a.setHeading(paramBoolean);
      return;
    } 
    a(2, paramBoolean);
  }
  
  public void j(boolean paramBoolean) {
    this.a.setLongClickable(paramBoolean);
  }
  
  public boolean j() {
    return (Build.VERSION.SDK_INT >= 16) ? this.a.isAccessibilityFocused() : false;
  }
  
  public void k(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.a.setScreenReaderFocusable(paramBoolean);
      return;
    } 
    a(1, paramBoolean);
  }
  
  public boolean k() {
    return this.a.isCheckable();
  }
  
  public void l(boolean paramBoolean) {
    this.a.setScrollable(paramBoolean);
  }
  
  public boolean l() {
    return this.a.isChecked();
  }
  
  public void m(boolean paramBoolean) {
    this.a.setSelected(paramBoolean);
  }
  
  public boolean m() {
    return this.a.isClickable();
  }
  
  public void n(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 26) {
      this.a.setShowingHintText(paramBoolean);
      return;
    } 
    a(4, paramBoolean);
  }
  
  public boolean n() {
    return this.a.isEnabled();
  }
  
  public void o(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 16)
      this.a.setVisibleToUser(paramBoolean); 
  }
  
  public boolean o() {
    return this.a.isFocusable();
  }
  
  public boolean p() {
    return this.a.isFocused();
  }
  
  public boolean q() {
    return this.a.isLongClickable();
  }
  
  public boolean r() {
    return this.a.isPassword();
  }
  
  public boolean s() {
    return this.a.isScrollable();
  }
  
  public boolean t() {
    return this.a.isSelected();
  }
  
  public String toString() {
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(super.toString());
    Rect rect = new Rect();
    a(rect);
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("; boundsInParent: ");
    stringBuilder2.append(rect);
    stringBuilder3.append(stringBuilder2.toString());
    b(rect);
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append("; boundsInScreen: ");
    stringBuilder2.append(rect);
    stringBuilder3.append(stringBuilder2.toString());
    stringBuilder3.append("; packageName: ");
    stringBuilder3.append(g());
    stringBuilder3.append("; className: ");
    stringBuilder3.append(d());
    stringBuilder3.append("; text: ");
    stringBuilder3.append(h());
    stringBuilder3.append("; contentDescription: ");
    stringBuilder3.append(e());
    stringBuilder3.append("; viewId: ");
    stringBuilder3.append(i());
    stringBuilder3.append("; checkable: ");
    stringBuilder3.append(k());
    stringBuilder3.append("; checked: ");
    stringBuilder3.append(l());
    stringBuilder3.append("; focusable: ");
    stringBuilder3.append(o());
    stringBuilder3.append("; focused: ");
    stringBuilder3.append(p());
    stringBuilder3.append("; selected: ");
    stringBuilder3.append(t());
    stringBuilder3.append("; clickable: ");
    stringBuilder3.append(m());
    stringBuilder3.append("; longClickable: ");
    stringBuilder3.append(q());
    stringBuilder3.append("; enabled: ");
    stringBuilder3.append(n());
    stringBuilder3.append("; password: ");
    stringBuilder3.append(r());
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("; scrollable: ");
    stringBuilder1.append(s());
    stringBuilder3.append(stringBuilder1.toString());
    stringBuilder3.append("; [");
    if (Build.VERSION.SDK_INT >= 21) {
      List<a> list = a();
      for (int i = 0; i < list.size(); i++) {
        a a = list.get(i);
        String str2 = b(a.a());
        String str1 = str2;
        if (str2.equals("ACTION_UNKNOWN")) {
          str1 = str2;
          if (a.b() != null)
            str1 = a.b().toString(); 
        } 
        stringBuilder3.append(str1);
        if (i != list.size() - 1)
          stringBuilder3.append(", "); 
      } 
    } else {
      int i = b();
      while (i != 0) {
        int k = 1 << Integer.numberOfTrailingZeros(i);
        int j = i & (k ^ 0xFFFFFFFF);
        stringBuilder3.append(b(k));
        i = j;
        if (j != 0) {
          stringBuilder3.append(", ");
          i = j;
        } 
      } 
    } 
    stringBuilder3.append("]");
    return stringBuilder3.toString();
  }
  
  public boolean u() {
    return (Build.VERSION.SDK_INT >= 26) ? this.a.isShowingHintText() : c(4);
  }
  
  public boolean v() {
    return (Build.VERSION.SDK_INT >= 16) ? this.a.isVisibleToUser() : false;
  }
  
  public void w() {
    this.a.recycle();
  }
  
  public AccessibilityNodeInfo x() {
    return this.a;
  }
  
  public static class a {
    public static final a e = new a(1, null);
    
    public static final a f = new a(2, null);
    
    public static final a g = new a(16, null);
    
    public static final a h = new a(32, null);
    
    public static final a i = new a(4096, null);
    
    public static final a j = new a(8192, null);
    
    public static final a k = new a(262144, null);
    
    public static final a l = new a(524288, null);
    
    public static final a m = new a(1048576, null);
    
    public static final a n;
    
    public static final a o;
    
    public static final a p;
    
    final Object a;
    
    private final int b;
    
    private final Class<? extends f.a> c;
    
    protected final f d;
    
    static {
      new a(2097152, null, (Class)f.h.class);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908342, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908343, null, null, (Class)f.e.class);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
      } else {
        accessibilityAction1 = null;
      } 
      n = new a(accessibilityAction1, 16908344, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908345, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
      } else {
        accessibilityAction1 = null;
      } 
      o = new a(accessibilityAction1, 16908346, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908347, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908358, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908359, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908360, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908361, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908348, null, null, null);
      if (Build.VERSION.SDK_INT >= 24) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
      } else {
        accessibilityAction1 = null;
      } 
      p = new a(accessibilityAction1, 16908349, null, null, (Class)f.f.class);
      if (Build.VERSION.SDK_INT >= 26) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908354, null, null, (Class)f.d.class);
      if (Build.VERSION.SDK_INT >= 28) {
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
      } else {
        accessibilityAction1 = null;
      } 
      new a(accessibilityAction1, 16908356, null, null, null);
      AccessibilityNodeInfo.AccessibilityAction accessibilityAction1 = accessibilityAction2;
      if (Build.VERSION.SDK_INT >= 28)
        accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP; 
      new a(accessibilityAction1, 16908357, null, null, null);
    }
    
    public a(int param1Int, CharSequence param1CharSequence) {
      this(null, param1Int, param1CharSequence, null, null);
    }
    
    private a(int param1Int, CharSequence param1CharSequence, Class<? extends f.a> param1Class) {
      this(null, param1Int, param1CharSequence, null, param1Class);
    }
    
    a(Object param1Object) {
      this(param1Object, 0, null, null, null);
    }
    
    a(Object param1Object, int param1Int, CharSequence param1CharSequence, f param1f, Class<? extends f.a> param1Class) {
      this.b = param1Int;
      this.d = param1f;
      Object object = param1Object;
      if (Build.VERSION.SDK_INT >= 21) {
        object = param1Object;
        if (param1Object == null)
          object = new AccessibilityNodeInfo.AccessibilityAction(param1Int, param1CharSequence); 
      } 
      this.a = object;
      this.c = param1Class;
    }
    
    public int a() {
      return (Build.VERSION.SDK_INT >= 21) ? ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId() : 0;
    }
    
    public a a(CharSequence param1CharSequence, f param1f) {
      return new a(null, this.b, param1CharSequence, param1f, this.c);
    }
    
    public boolean a(View param1View, Bundle param1Bundle) {
      if (this.d != null) {
        f.a a1 = null;
        Object object = null;
        Class<? extends f.a> clazz = this.c;
        if (clazz != null) {
          Exception exception1;
          String str;
          try {
            a1 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            try {
              a1.a(param1Bundle);
            } catch (Exception exception2) {
              f.a a2 = a1;
              exception = exception2;
            } 
          } catch (Exception exception) {
            exception1 = exception2;
          } 
          Class<? extends f.a> clazz1 = this.c;
          if (clazz1 == null) {
            str = "null";
          } else {
            str = str.getName();
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to execute command with argument class ViewCommandArgument: ");
          stringBuilder.append(str);
          Log.e("A11yActionCompat", stringBuilder.toString(), exception);
          exception = exception1;
        } 
        return this.d.a(param1View, (f.a)exception);
      } 
      return false;
    }
    
    public CharSequence b() {
      return (Build.VERSION.SDK_INT >= 21) ? ((AccessibilityNodeInfo.AccessibilityAction)this.a).getLabel() : null;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == null)
        return false; 
      if (!(param1Object instanceof a))
        return false; 
      a a1 = (a)param1Object;
      param1Object = this.a;
      Object object = a1.a;
      if (param1Object == null) {
        if (object != null)
          return false; 
      } else if (!param1Object.equals(object)) {
        return false;
      } 
      return true;
    }
    
    public int hashCode() {
      Object object = this.a;
      return (object != null) ? object.hashCode() : 0;
    }
    
    static {
      AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = null;
    }
    
    static {
      new a(4, null);
      new a(8, null);
    }
    
    static {
      new a(64, null);
      new a(128, null);
      new a(256, null, (Class)f.b.class);
      new a(512, null, (Class)f.b.class);
      new a(1024, null, (Class)f.c.class);
      new a(2048, null, (Class)f.c.class);
    }
    
    static {
      new a(16384, null);
      new a(32768, null);
      new a(65536, null);
      new a(131072, null, (Class)f.g.class);
    }
  }
  
  public static class b {
    final Object a;
    
    b(Object param1Object) {
      this.a = param1Object;
    }
    
    public static b a(int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3) {
      int i = Build.VERSION.SDK_INT;
      return (i >= 21) ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(param1Int1, param1Int2, param1Boolean, param1Int3)) : ((i >= 19) ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(param1Int1, param1Int2, param1Boolean)) : new b(null));
    }
  }
  
  public static class c {
    final Object a;
    
    c(Object param1Object) {
      this.a = param1Object;
    }
    
    public static c a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean) {
      return (Build.VERSION.SDK_INT >= 19) ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(param1Int1, param1Int2, param1Int3, param1Int4, param1Boolean)) : new c(null);
    }
    
    public static c a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean1, boolean param1Boolean2) {
      int i = Build.VERSION.SDK_INT;
      return (i >= 21) ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(param1Int1, param1Int2, param1Int3, param1Int4, param1Boolean1, param1Boolean2)) : ((i >= 19) ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(param1Int1, param1Int2, param1Int3, param1Int4, param1Boolean1)) : new c(null));
    }
  }
  
  public static class d {
    final Object a;
    
    d(Object param1Object) {
      this.a = param1Object;
    }
    
    public static d a(int param1Int, float param1Float1, float param1Float2, float param1Float3) {
      return (Build.VERSION.SDK_INT >= 19) ? new d(AccessibilityNodeInfo.RangeInfo.obtain(param1Int, param1Float1, param1Float2, param1Float3)) : new d(null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/e0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */