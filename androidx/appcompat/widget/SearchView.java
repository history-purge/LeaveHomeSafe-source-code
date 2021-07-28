package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import b.a.o.c;
import b.g.m.v;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements c {
  static final n s0;
  
  private p A;
  
  private Rect B = new Rect();
  
  private Rect C = new Rect();
  
  private int[] D = new int[2];
  
  private int[] E = new int[2];
  
  private final ImageView F;
  
  private final Drawable G;
  
  private final int H;
  
  private final int I;
  
  private final Intent J;
  
  private final Intent K;
  
  private final CharSequence L;
  
  private l M;
  
  private k N;
  
  View.OnFocusChangeListener O;
  
  private m P;
  
  private View.OnClickListener Q;
  
  private boolean R;
  
  private boolean S;
  
  b.h.a.a T;
  
  private boolean U;
  
  private CharSequence V;
  
  private boolean W;
  
  private boolean a0;
  
  private int b0;
  
  private boolean c0;
  
  private CharSequence d0;
  
  private CharSequence e0;
  
  private boolean f0;
  
  private int g0;
  
  SearchableInfo h0;
  
  private Bundle i0;
  
  private final Runnable j0 = new b(this);
  
  private Runnable k0 = new c(this);
  
  private final WeakHashMap<String, Drawable.ConstantState> l0 = new WeakHashMap<String, Drawable.ConstantState>();
  
  private final View.OnClickListener m0 = new f(this);
  
  View.OnKeyListener n0 = new g(this);
  
  private final TextView.OnEditorActionListener o0 = new h(this);
  
  private final AdapterView.OnItemClickListener p0 = new i(this);
  
  private final AdapterView.OnItemSelectedListener q0 = new j(this);
  
  final SearchAutoComplete r;
  
  private TextWatcher r0 = new a(this);
  
  private final View s;
  
  private final View t;
  
  private final View u;
  
  final ImageView v;
  
  final ImageView w;
  
  final ImageView x;
  
  final ImageView y;
  
  private final View z;
  
  static {
    n n1;
    if (Build.VERSION.SDK_INT < 29) {
      n1 = new n();
    } else {
      n1 = null;
    } 
    s0 = n1;
  }
  
  public SearchView(Context paramContext) {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.searchViewStyle);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x0 x0 = x0.a(paramContext, paramAttributeSet, b.a.j.SearchView, paramInt, 0);
    LayoutInflater.from(paramContext).inflate(x0.g(b.a.j.SearchView_layout, b.a.g.abc_search_view), this, true);
    this.r = (SearchAutoComplete)findViewById(b.a.f.search_src_text);
    this.r.setSearchView(this);
    this.s = findViewById(b.a.f.search_edit_frame);
    this.t = findViewById(b.a.f.search_plate);
    this.u = findViewById(b.a.f.submit_area);
    this.v = (ImageView)findViewById(b.a.f.search_button);
    this.w = (ImageView)findViewById(b.a.f.search_go_btn);
    this.x = (ImageView)findViewById(b.a.f.search_close_btn);
    this.y = (ImageView)findViewById(b.a.f.search_voice_btn);
    this.F = (ImageView)findViewById(b.a.f.search_mag_icon);
    v.a(this.t, x0.b(b.a.j.SearchView_queryBackground));
    v.a(this.u, x0.b(b.a.j.SearchView_submitBackground));
    this.v.setImageDrawable(x0.b(b.a.j.SearchView_searchIcon));
    this.w.setImageDrawable(x0.b(b.a.j.SearchView_goIcon));
    this.x.setImageDrawable(x0.b(b.a.j.SearchView_closeIcon));
    this.y.setImageDrawable(x0.b(b.a.j.SearchView_voiceIcon));
    this.F.setImageDrawable(x0.b(b.a.j.SearchView_searchIcon));
    this.G = x0.b(b.a.j.SearchView_searchHintIcon);
    z0.a((View)this.v, getResources().getString(b.a.h.abc_searchview_description_search));
    this.H = x0.g(b.a.j.SearchView_suggestionRowLayout, b.a.g.abc_search_dropdown_item_icons_2line);
    this.I = x0.g(b.a.j.SearchView_commitIcon, 0);
    this.v.setOnClickListener(this.m0);
    this.x.setOnClickListener(this.m0);
    this.w.setOnClickListener(this.m0);
    this.y.setOnClickListener(this.m0);
    this.r.setOnClickListener(this.m0);
    this.r.addTextChangedListener(this.r0);
    this.r.setOnEditorActionListener(this.o0);
    this.r.setOnItemClickListener(this.p0);
    this.r.setOnItemSelectedListener(this.q0);
    this.r.setOnKeyListener(this.n0);
    this.r.setOnFocusChangeListener(new d(this));
    setIconifiedByDefault(x0.a(b.a.j.SearchView_iconifiedByDefault, true));
    paramInt = x0.c(b.a.j.SearchView_android_maxWidth, -1);
    if (paramInt != -1)
      setMaxWidth(paramInt); 
    this.L = x0.e(b.a.j.SearchView_defaultQueryHint);
    this.V = x0.e(b.a.j.SearchView_queryHint);
    paramInt = x0.d(b.a.j.SearchView_android_imeOptions, -1);
    if (paramInt != -1)
      setImeOptions(paramInt); 
    paramInt = x0.d(b.a.j.SearchView_android_inputType, -1);
    if (paramInt != -1)
      setInputType(paramInt); 
    setFocusable(x0.a(b.a.j.SearchView_android_focusable, true));
    x0.b();
    this.J = new Intent("android.speech.action.WEB_SEARCH");
    this.J.addFlags(268435456);
    this.J.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.K = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.K.addFlags(268435456);
    this.z = findViewById(this.r.getDropDownAnchor());
    View view = this.z;
    if (view != null)
      view.addOnLayoutChangeListener(new e(this)); 
    b(this.R);
    r();
  }
  
  private Intent a(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str1;
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    Intent intent1 = new Intent("android.intent.action.SEARCH");
    intent1.setComponent(componentName);
    PendingIntent pendingIntent = PendingIntent.getActivity(getContext(), 0, intent1, 1073741824);
    Bundle bundle2 = new Bundle();
    Bundle bundle1 = this.i0;
    if (bundle1 != null)
      bundle2.putParcelable("app_data", (Parcelable)bundle1); 
    Intent intent2 = new Intent(paramIntent);
    int i = 1;
    Resources resources = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      str1 = resources.getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      str1 = "free_form";
    } 
    int j = paramSearchableInfo.getVoicePromptTextId();
    String str2 = null;
    if (j != 0) {
      String str = resources.getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      bundle1 = null;
    } 
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      String str = resources.getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      resources = null;
    } 
    if (paramSearchableInfo.getVoiceMaxResults() != 0)
      i = paramSearchableInfo.getVoiceMaxResults(); 
    intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", str1);
    intent2.putExtra("android.speech.extra.PROMPT", (String)bundle1);
    intent2.putExtra("android.speech.extra.LANGUAGE", (String)resources);
    intent2.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (componentName == null) {
      str1 = str2;
    } else {
      str1 = componentName.flattenToShortString();
    } 
    intent2.putExtra("calling_package", str1);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)pendingIntent);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle2);
    return intent2;
  }
  
  private Intent a(Cursor paramCursor, int paramInt, String paramString) {
    StringBuilder stringBuilder;
    try {
      String str = q0.a(paramCursor, "suggest_intent_action");
      str1 = str;
      if (str == null)
        str1 = this.h0.getSuggestIntentAction(); 
    } catch (RuntimeException runtimeException) {
      try {
        paramInt = paramCursor.getPosition();
      } catch (RuntimeException runtimeException1) {
        paramInt = -1;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Search suggestions cursor at row ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" returned exception.");
      Log.w("SearchView", stringBuilder.toString(), runtimeException);
      return null;
    } 
    String str2 = str1;
    if (str1 == null)
      str2 = "android.intent.action.SEARCH"; 
    String str3 = q0.a((Cursor)stringBuilder, "suggest_intent_data");
    String str1 = str3;
    if (str3 == null)
      str1 = this.h0.getSuggestIntentData(); 
    str3 = str1;
    if (str1 != null) {
      String str = q0.a((Cursor)stringBuilder, "suggest_intent_data_id");
      str3 = str1;
      if (str != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append("/");
        stringBuilder1.append(Uri.encode(str));
        str3 = stringBuilder1.toString();
      } 
    } 
    if (str3 == null) {
      str1 = null;
      str3 = q0.a((Cursor)stringBuilder, "suggest_intent_query");
      return a(str2, (Uri)str1, q0.a((Cursor)stringBuilder, "suggest_intent_extra_data"), str3, paramInt, (String)runtimeException);
    } 
    Uri uri = Uri.parse(str3);
    str3 = q0.a((Cursor)stringBuilder, "suggest_intent_query");
    return a(str2, uri, q0.a((Cursor)stringBuilder, "suggest_intent_extra_data"), str3, paramInt, (String)runtimeException);
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4) {
    Intent intent = new Intent(paramString1);
    intent.addFlags(268435456);
    if (paramUri != null)
      intent.setData(paramUri); 
    intent.putExtra("user_query", this.e0);
    if (paramString3 != null)
      intent.putExtra("query", paramString3); 
    if (paramString2 != null)
      intent.putExtra("intent_extra_data_key", paramString2); 
    Bundle bundle = this.i0;
    if (bundle != null)
      intent.putExtra("app_data", bundle); 
    if (paramInt != 0) {
      intent.putExtra("action_key", paramInt);
      intent.putExtra("action_msg", paramString4);
    } 
    intent.setComponent(this.h0.getSearchActivity());
    return intent;
  }
  
  private void a(Intent paramIntent) {
    if (paramIntent == null)
      return; 
    try {
      getContext().startActivity(paramIntent);
      return;
    } catch (RuntimeException runtimeException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed launch activity: ");
      stringBuilder.append(paramIntent);
      Log.e("SearchView", stringBuilder.toString(), runtimeException);
      return;
    } 
  }
  
  private void a(View paramView, Rect paramRect) {
    paramView.getLocationInWindow(this.D);
    getLocationInWindow(this.E);
    int[] arrayOfInt1 = this.D;
    int i = arrayOfInt1[1];
    int[] arrayOfInt2 = this.E;
    i -= arrayOfInt2[1];
    int j = arrayOfInt1[0] - arrayOfInt2[0];
    paramRect.set(j, i, paramView.getWidth() + j, paramView.getHeight() + i);
  }
  
  private void a(boolean paramBoolean) {
    byte b;
    if (this.U && o() && hasFocus() && (paramBoolean || !this.c0)) {
      b = 0;
    } else {
      b = 8;
    } 
    this.w.setVisibility(b);
  }
  
  static boolean a(Context paramContext) {
    return ((paramContext.getResources().getConfiguration()).orientation == 2);
  }
  
  private Intent b(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str;
    Intent intent = new Intent(paramIntent);
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    if (componentName == null) {
      componentName = null;
    } else {
      str = componentName.flattenToShortString();
    } 
    intent.putExtra("calling_package", str);
    return intent;
  }
  
  private void b(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield S : Z
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_1
    //   8: ifeq -> 16
    //   11: iconst_0
    //   12: istore_2
    //   13: goto -> 19
    //   16: bipush #8
    //   18: istore_2
    //   19: aload_0
    //   20: getfield r : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   23: invokevirtual getText : ()Landroid/text/Editable;
    //   26: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   29: iconst_1
    //   30: ixor
    //   31: istore #4
    //   33: aload_0
    //   34: getfield v : Landroid/widget/ImageView;
    //   37: iload_2
    //   38: invokevirtual setVisibility : (I)V
    //   41: aload_0
    //   42: iload #4
    //   44: invokespecial a : (Z)V
    //   47: aload_0
    //   48: getfield s : Landroid/view/View;
    //   51: astore #5
    //   53: iload_1
    //   54: ifeq -> 63
    //   57: bipush #8
    //   59: istore_2
    //   60: goto -> 65
    //   63: iconst_0
    //   64: istore_2
    //   65: aload #5
    //   67: iload_2
    //   68: invokevirtual setVisibility : (I)V
    //   71: aload_0
    //   72: getfield F : Landroid/widget/ImageView;
    //   75: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   78: ifnull -> 90
    //   81: iload_3
    //   82: istore_2
    //   83: aload_0
    //   84: getfield R : Z
    //   87: ifeq -> 93
    //   90: bipush #8
    //   92: istore_2
    //   93: aload_0
    //   94: getfield F : Landroid/widget/ImageView;
    //   97: iload_2
    //   98: invokevirtual setVisibility : (I)V
    //   101: aload_0
    //   102: invokespecial q : ()V
    //   105: aload_0
    //   106: iload #4
    //   108: iconst_1
    //   109: ixor
    //   110: invokespecial c : (Z)V
    //   113: aload_0
    //   114: invokespecial t : ()V
    //   117: return
  }
  
  private boolean b(int paramInt1, int paramInt2, String paramString) {
    Cursor cursor = this.T.a();
    if (cursor != null && cursor.moveToPosition(paramInt1)) {
      a(a(cursor, paramInt2, paramString));
      return true;
    } 
    return false;
  }
  
  private CharSequence c(CharSequence paramCharSequence) {
    if (this.R) {
      if (this.G == null)
        return paramCharSequence; 
      double d = this.r.getTextSize();
      Double.isNaN(d);
      int i = (int)(d * 1.25D);
      this.G.setBounds(0, 0, i, i);
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
      spannableStringBuilder.setSpan(new ImageSpan(this.G), 1, 2, 33);
      spannableStringBuilder.append(paramCharSequence);
      return (CharSequence)spannableStringBuilder;
    } 
    return paramCharSequence;
  }
  
  private void c(boolean paramBoolean) {
    byte b;
    if (this.c0 && !f() && paramBoolean) {
      b = 0;
      this.w.setVisibility(8);
    } else {
      b = 8;
    } 
    this.y.setVisibility(b);
  }
  
  private void e(int paramInt) {
    Editable editable = this.r.getText();
    Cursor cursor = this.T.a();
    if (cursor == null)
      return; 
    if (cursor.moveToPosition(paramInt)) {
      CharSequence charSequence = this.T.b(cursor);
      if (charSequence != null) {
        setQuery(charSequence);
        return;
      } 
    } 
    setQuery((CharSequence)editable);
  }
  
  private int getPreferredHeight() {
    return getContext().getResources().getDimensionPixelSize(b.a.d.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth() {
    return getContext().getResources().getDimensionPixelSize(b.a.d.abc_search_view_preferred_width);
  }
  
  private void m() {
    this.r.dismissDropDown();
  }
  
  private boolean n() {
    SearchableInfo searchableInfo = this.h0;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (searchableInfo != null) {
      bool1 = bool2;
      if (searchableInfo.getVoiceSearchEnabled()) {
        Intent intent;
        searchableInfo = null;
        if (this.h0.getVoiceSearchLaunchWebSearch()) {
          intent = this.J;
        } else if (this.h0.getVoiceSearchLaunchRecognizer()) {
          intent = this.K;
        } 
        bool1 = bool2;
        if (intent != null) {
          bool1 = bool2;
          if (getContext().getPackageManager().resolveActivity(intent, 65536) != null)
            bool1 = true; 
        } 
      } 
    } 
    return bool1;
  }
  
  private boolean o() {
    return ((this.U || this.c0) && !f());
  }
  
  private void p() {
    post(this.j0);
  }
  
  private void q() {
    boolean bool = TextUtils.isEmpty((CharSequence)this.r.getText());
    byte b3 = 1;
    int i = bool ^ true;
    byte b2 = 0;
    byte b1 = b3;
    if (i == 0)
      if (this.R && !this.f0) {
        b1 = b3;
      } else {
        b1 = 0;
      }  
    ImageView imageView = this.x;
    if (b1) {
      b1 = b2;
    } else {
      b1 = 8;
    } 
    imageView.setVisibility(b1);
    Drawable drawable = this.x.getDrawable();
    if (drawable != null) {
      int[] arrayOfInt;
      if (i != 0) {
        arrayOfInt = ViewGroup.ENABLED_STATE_SET;
      } else {
        arrayOfInt = ViewGroup.EMPTY_STATE_SET;
      } 
      drawable.setState(arrayOfInt);
    } 
  }
  
  private void r() {
    CharSequence charSequence2 = getQueryHint();
    SearchAutoComplete searchAutoComplete = this.r;
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = ""; 
    searchAutoComplete.setHint(c(charSequence1));
  }
  
  private void s() {
    this.r.setThreshold(this.h0.getSuggestThreshold());
    this.r.setImeOptions(this.h0.getImeOptions());
    int j = this.h0.getInputType();
    boolean bool = true;
    int i = j;
    if ((j & 0xF) == 1) {
      j &= 0xFFFEFFFF;
      i = j;
      if (this.h0.getSuggestAuthority() != null)
        i = j | 0x10000 | 0x80000; 
    } 
    this.r.setInputType(i);
    b.h.a.a a1 = this.T;
    if (a1 != null)
      a1.a(null); 
    if (this.h0.getSuggestAuthority() != null) {
      this.T = (b.h.a.a)new q0(getContext(), this, this.h0, this.l0);
      this.r.setAdapter((ListAdapter)this.T);
      q0 q0 = (q0)this.T;
      i = bool;
      if (this.W)
        i = 2; 
      q0.a(i);
    } 
  }
  
  private void setQuery(CharSequence paramCharSequence) {
    int i;
    this.r.setText(paramCharSequence);
    SearchAutoComplete searchAutoComplete = this.r;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    } 
    searchAutoComplete.setSelection(i);
  }
  
  private void t() {
    byte b;
    if (o() && (this.w.getVisibility() == 0 || this.y.getVisibility() == 0)) {
      b = 0;
    } else {
      b = 8;
    } 
    this.u.setVisibility(b);
  }
  
  void a(int paramInt, String paramString1, String paramString2) {
    Intent intent = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(intent);
  }
  
  void a(CharSequence paramCharSequence) {
    setQuery(paramCharSequence);
  }
  
  public void a(CharSequence paramCharSequence, boolean paramBoolean) {
    this.r.setText(paramCharSequence);
    if (paramCharSequence != null) {
      SearchAutoComplete searchAutoComplete = this.r;
      searchAutoComplete.setSelection(searchAutoComplete.length());
      this.e0 = paramCharSequence;
    } 
    if (paramBoolean && !TextUtils.isEmpty(paramCharSequence))
      i(); 
  }
  
  boolean a(int paramInt1, int paramInt2, String paramString) {
    m m1 = this.P;
    if (m1 == null || !m1.b(paramInt1)) {
      b(paramInt1, 0, null);
      this.r.setImeVisibility(false);
      m();
      return true;
    } 
    return false;
  }
  
  boolean a(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (this.h0 == null)
      return false; 
    if (this.T == null)
      return false; 
    if (paramKeyEvent.getAction() == 0 && paramKeyEvent.hasNoModifiers()) {
      if (paramInt == 66 || paramInt == 84 || paramInt == 61)
        return a(this.r.getListSelection(), 0, (String)null); 
      if (paramInt == 21 || paramInt == 22) {
        if (paramInt == 21) {
          paramInt = 0;
        } else {
          paramInt = this.r.length();
        } 
        this.r.setSelection(paramInt);
        this.r.setListSelection(0);
        this.r.clearListSelection();
        this.r.a();
        return true;
      } 
      if (paramInt == 19 && this.r.getListSelection() == 0)
        return false; 
    } 
    return false;
  }
  
  public void b() {
    if (this.f0)
      return; 
    this.f0 = true;
    this.g0 = this.r.getImeOptions();
    this.r.setImeOptions(this.g0 | 0x2000000);
    this.r.setText("");
    setIconified(false);
  }
  
  void b(CharSequence paramCharSequence) {
    Editable editable = this.r.getText();
    this.e0 = (CharSequence)editable;
    int i = TextUtils.isEmpty((CharSequence)editable) ^ true;
    a(i);
    c(i ^ 0x1);
    q();
    t();
    if (this.M != null && !TextUtils.equals(paramCharSequence, this.d0))
      this.M.a(paramCharSequence.toString()); 
    this.d0 = paramCharSequence.toString();
  }
  
  public void c() {
    a("", false);
    clearFocus();
    b(true);
    this.r.setImeOptions(this.g0);
    this.f0 = false;
  }
  
  public void clearFocus() {
    this.a0 = true;
    super.clearFocus();
    this.r.clearFocus();
    this.r.setImeVisibility(false);
    this.a0 = false;
  }
  
  void d() {
    if (this.z.getWidth() > 1) {
      byte b;
      Resources resources = getContext().getResources();
      int j = this.t.getPaddingLeft();
      Rect rect = new Rect();
      boolean bool = d1.a((View)this);
      if (this.R) {
        b = resources.getDimensionPixelSize(b.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(b.a.d.abc_dropdownitem_text_padding_left);
      } else {
        b = 0;
      } 
      this.r.getDropDownBackground().getPadding(rect);
      int i = rect.left;
      if (bool) {
        i = -i;
      } else {
        i = j - i + b;
      } 
      this.r.setDropDownHorizontalOffset(i);
      i = this.z.getWidth();
      int i1 = rect.left;
      int i2 = rect.right;
      this.r.setDropDownWidth(i + i1 + i2 + b - j);
    } 
  }
  
  boolean d(int paramInt) {
    m m1 = this.P;
    if (m1 == null || !m1.a(paramInt)) {
      e(paramInt);
      return true;
    } 
    return false;
  }
  
  void e() {
    if (Build.VERSION.SDK_INT >= 29) {
      this.r.refreshAutoCompleteResults();
      return;
    } 
    s0.b(this.r);
    s0.a(this.r);
  }
  
  public boolean f() {
    return this.S;
  }
  
  void g() {
    if (TextUtils.isEmpty((CharSequence)this.r.getText())) {
      if (this.R) {
        k k1 = this.N;
        if (k1 == null || !k1.a()) {
          clearFocus();
          b(true);
          return;
        } 
      } 
    } else {
      this.r.setText("");
      this.r.requestFocus();
      this.r.setImeVisibility(true);
    } 
  }
  
  public int getImeOptions() {
    return this.r.getImeOptions();
  }
  
  public int getInputType() {
    return this.r.getInputType();
  }
  
  public int getMaxWidth() {
    return this.b0;
  }
  
  public CharSequence getQuery() {
    return (CharSequence)this.r.getText();
  }
  
  public CharSequence getQueryHint() {
    CharSequence charSequence = this.V;
    if (charSequence != null)
      return charSequence; 
    SearchableInfo searchableInfo = this.h0;
    return (searchableInfo != null && searchableInfo.getHintId() != 0) ? getContext().getText(this.h0.getHintId()) : this.L;
  }
  
  int getSuggestionCommitIconResId() {
    return this.I;
  }
  
  int getSuggestionRowLayout() {
    return this.H;
  }
  
  public b.h.a.a getSuggestionsAdapter() {
    return this.T;
  }
  
  void h() {
    b(false);
    this.r.requestFocus();
    this.r.setImeVisibility(true);
    View.OnClickListener onClickListener = this.Q;
    if (onClickListener != null)
      onClickListener.onClick((View)this); 
  }
  
  void i() {
    Editable editable = this.r.getText();
    if (editable != null && TextUtils.getTrimmedLength((CharSequence)editable) > 0) {
      l l1 = this.M;
      if (l1 == null || !l1.b(editable.toString())) {
        if (this.h0 != null)
          a(0, (String)null, editable.toString()); 
        this.r.setImeVisibility(false);
        m();
      } 
    } 
  }
  
  void j() {
    b(f());
    p();
    if (this.r.hasFocus())
      e(); 
  }
  
  void k() {
    SearchableInfo searchableInfo = this.h0;
    if (searchableInfo == null)
      return; 
    try {
      Intent intent;
      if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
        intent = b(this.J, searchableInfo);
      } else if (intent.getVoiceSearchLaunchRecognizer()) {
        intent = a(this.K, (SearchableInfo)intent);
      } else {
        return;
      } 
      getContext().startActivity(intent);
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      Log.w("SearchView", "Could not find voice search activity");
    } 
  }
  
  void l() {
    int[] arrayOfInt;
    if (this.r.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    } 
    Drawable drawable = this.t.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    drawable = this.u.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    invalidate();
  }
  
  protected void onDetachedFromWindow() {
    removeCallbacks(this.j0);
    post(this.k0);
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      a((View)this.r, this.B);
      Rect rect1 = this.C;
      Rect rect2 = this.B;
      rect1.set(rect2.left, 0, rect2.right, paramInt4 - paramInt2);
      p p1 = this.A;
      if (p1 == null) {
        this.A = new p(this.C, this.B, (View)this.r);
        setTouchDelegate(this.A);
        return;
      } 
      p1.a(this.C, this.B);
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()Z
    //   4: ifeq -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: iload_2
    //   10: invokespecial onMeasure : (II)V
    //   13: return
    //   14: iload_1
    //   15: invokestatic getMode : (I)I
    //   18: istore #4
    //   20: iload_1
    //   21: invokestatic getSize : (I)I
    //   24: istore_3
    //   25: iload #4
    //   27: ldc_w -2147483648
    //   30: if_icmpeq -> 90
    //   33: iload #4
    //   35: ifeq -> 70
    //   38: iload #4
    //   40: ldc_w 1073741824
    //   43: if_icmpeq -> 51
    //   46: iload_3
    //   47: istore_1
    //   48: goto -> 113
    //   51: aload_0
    //   52: getfield b0 : I
    //   55: istore #4
    //   57: iload_3
    //   58: istore_1
    //   59: iload #4
    //   61: ifle -> 113
    //   64: iload #4
    //   66: istore_1
    //   67: goto -> 99
    //   70: aload_0
    //   71: getfield b0 : I
    //   74: istore_1
    //   75: iload_1
    //   76: ifle -> 82
    //   79: goto -> 113
    //   82: aload_0
    //   83: invokespecial getPreferredWidth : ()I
    //   86: istore_1
    //   87: goto -> 113
    //   90: aload_0
    //   91: getfield b0 : I
    //   94: istore_1
    //   95: iload_1
    //   96: ifle -> 102
    //   99: goto -> 107
    //   102: aload_0
    //   103: invokespecial getPreferredWidth : ()I
    //   106: istore_1
    //   107: iload_1
    //   108: iload_3
    //   109: invokestatic min : (II)I
    //   112: istore_1
    //   113: iload_2
    //   114: invokestatic getMode : (I)I
    //   117: istore_3
    //   118: iload_2
    //   119: invokestatic getSize : (I)I
    //   122: istore_2
    //   123: iload_3
    //   124: ldc_w -2147483648
    //   127: if_icmpeq -> 145
    //   130: iload_3
    //   131: ifeq -> 137
    //   134: goto -> 154
    //   137: aload_0
    //   138: invokespecial getPreferredHeight : ()I
    //   141: istore_2
    //   142: goto -> 154
    //   145: aload_0
    //   146: invokespecial getPreferredHeight : ()I
    //   149: iload_2
    //   150: invokestatic min : (II)I
    //   153: istore_2
    //   154: aload_0
    //   155: iload_1
    //   156: ldc_w 1073741824
    //   159: invokestatic makeMeasureSpec : (II)I
    //   162: iload_2
    //   163: ldc_w 1073741824
    //   166: invokestatic makeMeasureSpec : (II)I
    //   169: invokespecial onMeasure : (II)V
    //   172: return
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof o)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    o o = (o)paramParcelable;
    super.onRestoreInstanceState(o.e());
    b(o.e);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    o o = new o(super.onSaveInstanceState());
    o.e = f();
    return (Parcelable)o;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    p();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    if (this.a0)
      return false; 
    if (!isFocusable())
      return false; 
    if (!f()) {
      boolean bool = this.r.requestFocus(paramInt, paramRect);
      if (bool)
        b(false); 
      return bool;
    } 
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle) {
    this.i0 = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean) {
    if (paramBoolean) {
      g();
      return;
    } 
    h();
  }
  
  public void setIconifiedByDefault(boolean paramBoolean) {
    if (this.R == paramBoolean)
      return; 
    this.R = paramBoolean;
    b(paramBoolean);
    r();
  }
  
  public void setImeOptions(int paramInt) {
    this.r.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt) {
    this.r.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt) {
    this.b0 = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(k paramk) {
    this.N = paramk;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) {
    this.O = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(l paraml) {
    this.M = paraml;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener) {
    this.Q = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(m paramm) {
    this.P = paramm;
  }
  
  public void setQueryHint(CharSequence paramCharSequence) {
    this.V = paramCharSequence;
    r();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean) {
    this.W = paramBoolean;
    b.h.a.a a1 = this.T;
    if (a1 instanceof q0) {
      boolean bool;
      q0 q0 = (q0)a1;
      if (paramBoolean) {
        bool = true;
      } else {
        bool = true;
      } 
      q0.a(bool);
    } 
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo) {
    this.h0 = paramSearchableInfo;
    if (this.h0 != null) {
      s();
      r();
    } 
    this.c0 = n();
    if (this.c0)
      this.r.setPrivateImeOptions("nm"); 
    b(f());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean) {
    this.U = paramBoolean;
    b(f());
  }
  
  public void setSuggestionsAdapter(b.h.a.a parama) {
    this.T = parama;
    this.r.setAdapter((ListAdapter)this.T);
  }
  
  public static class SearchAutoComplete extends d {
    private int f = getThreshold();
    
    private SearchView g;
    
    private boolean h;
    
    final Runnable i = new a(this);
    
    public SearchAutoComplete(Context param1Context) {
      this(param1Context, null);
    }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet) {
      this(param1Context, param1AttributeSet, b.a.a.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
    }
    
    private int getSearchViewTextMinWidthDp() {
      Configuration configuration = getResources().getConfiguration();
      int i = configuration.screenWidthDp;
      int j = configuration.screenHeightDp;
      return (i >= 960 && j >= 720 && configuration.orientation == 2) ? 256 : ((i >= 600 || (i >= 640 && j >= 480)) ? 192 : 160);
    }
    
    void a() {
      if (Build.VERSION.SDK_INT >= 29) {
        setInputMethodMode(1);
        if (enoughToFilter()) {
          showDropDown();
          return;
        } 
      } else {
        SearchView.s0.c(this);
      } 
    }
    
    boolean b() {
      return (TextUtils.getTrimmedLength((CharSequence)getText()) == 0);
    }
    
    void c() {
      if (this.h) {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
        this.h = false;
      } 
    }
    
    public boolean enoughToFilter() {
      return (this.f <= 0 || super.enoughToFilter());
    }
    
    public InputConnection onCreateInputConnection(EditorInfo param1EditorInfo) {
      InputConnection inputConnection = super.onCreateInputConnection(param1EditorInfo);
      if (this.h) {
        removeCallbacks(this.i);
        post(this.i);
      } 
      return inputConnection;
    }
    
    protected void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displayMetrics));
    }
    
    protected void onFocusChanged(boolean param1Boolean, int param1Int, Rect param1Rect) {
      super.onFocusChanged(param1Boolean, param1Int, param1Rect);
      this.g.j();
    }
    
    public boolean onKeyPreIme(int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4) {
        if (param1KeyEvent.getAction() == 0 && param1KeyEvent.getRepeatCount() == 0) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.startTracking(param1KeyEvent, this); 
          return true;
        } 
        if (param1KeyEvent.getAction() == 1) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.handleUpEvent(param1KeyEvent); 
          if (param1KeyEvent.isTracking() && !param1KeyEvent.isCanceled()) {
            this.g.clearFocus();
            setImeVisibility(false);
            return true;
          } 
        } 
      } 
      return super.onKeyPreIme(param1Int, param1KeyEvent);
    }
    
    public void onWindowFocusChanged(boolean param1Boolean) {
      super.onWindowFocusChanged(param1Boolean);
      if (param1Boolean && this.g.hasFocus() && getVisibility() == 0) {
        this.h = true;
        if (SearchView.a(getContext()))
          a(); 
      } 
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence param1CharSequence) {}
    
    void setImeVisibility(boolean param1Boolean) {
      InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!param1Boolean) {
        this.h = false;
        removeCallbacks(this.i);
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      } 
      if (inputMethodManager.isActive((View)this)) {
        this.h = false;
        removeCallbacks(this.i);
        inputMethodManager.showSoftInput((View)this, 0);
        return;
      } 
      this.h = true;
    }
    
    void setSearchView(SearchView param1SearchView) {
      this.g = param1SearchView;
    }
    
    public void setThreshold(int param1Int) {
      super.setThreshold(param1Int);
      this.f = param1Int;
    }
    
    class a implements Runnable {
      a(SearchView.SearchAutoComplete this$0) {}
      
      public void run() {
        this.c.c();
      }
    }
  }
  
  class a implements Runnable {
    a(SearchView this$0) {}
    
    public void run() {
      this.c.c();
    }
  }
  
  class a implements TextWatcher {
    a(SearchView this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      this.c.b(param1CharSequence);
    }
  }
  
  class b implements Runnable {
    b(SearchView this$0) {}
    
    public void run() {
      this.c.l();
    }
  }
  
  class c implements Runnable {
    c(SearchView this$0) {}
    
    public void run() {
      b.h.a.a a = this.c.T;
      if (a instanceof q0)
        a.a(null); 
    }
  }
  
  class d implements View.OnFocusChangeListener {
    d(SearchView this$0) {}
    
    public void onFocusChange(View param1View, boolean param1Boolean) {
      SearchView searchView = this.c;
      View.OnFocusChangeListener onFocusChangeListener = searchView.O;
      if (onFocusChangeListener != null)
        onFocusChangeListener.onFocusChange((View)searchView, param1Boolean); 
    }
  }
  
  class e implements View.OnLayoutChangeListener {
    e(SearchView this$0) {}
    
    public void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      this.c.d();
    }
  }
  
  class f implements View.OnClickListener {
    f(SearchView this$0) {}
    
    public void onClick(View param1View) {
      SearchView searchView = this.c;
      if (param1View == searchView.v) {
        searchView.h();
        return;
      } 
      if (param1View == searchView.x) {
        searchView.g();
        return;
      } 
      if (param1View == searchView.w) {
        searchView.i();
        return;
      } 
      if (param1View == searchView.y) {
        searchView.k();
        return;
      } 
      if (param1View == searchView.r)
        searchView.e(); 
    }
  }
  
  class g implements View.OnKeyListener {
    g(SearchView this$0) {}
    
    public boolean onKey(View param1View, int param1Int, KeyEvent param1KeyEvent) {
      SearchView searchView = this.c;
      if (searchView.h0 == null)
        return false; 
      if (searchView.r.isPopupShowing() && this.c.r.getListSelection() != -1)
        return this.c.a(param1View, param1Int, param1KeyEvent); 
      if (!this.c.r.b() && param1KeyEvent.hasNoModifiers() && param1KeyEvent.getAction() == 1 && param1Int == 66) {
        param1View.cancelLongPress();
        SearchView searchView1 = this.c;
        searchView1.a(0, (String)null, searchView1.r.getText().toString());
        return true;
      } 
      return false;
    }
  }
  
  class h implements TextView.OnEditorActionListener {
    h(SearchView this$0) {}
    
    public boolean onEditorAction(TextView param1TextView, int param1Int, KeyEvent param1KeyEvent) {
      this.a.i();
      return true;
    }
  }
  
  class i implements AdapterView.OnItemClickListener {
    i(SearchView this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.c.a(param1Int, 0, (String)null);
    }
  }
  
  class j implements AdapterView.OnItemSelectedListener {
    j(SearchView this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.c.d(param1Int);
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
  }
  
  public static interface k {
    boolean a();
  }
  
  public static interface l {
    boolean a(String param1String);
    
    boolean b(String param1String);
  }
  
  public static interface m {
    boolean a(int param1Int);
    
    boolean b(int param1Int);
  }
  
  private static class n {
    private Method a = null;
    
    private Method b = null;
    
    private Method c = null;
    
    @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
    n() {
      a();
      try {
        this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
        try {
          this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
          this.c.setAccessible(true);
          return;
        } catch (NoSuchMethodException noSuchMethodException) {}
      } catch (NoSuchMethodException noSuchMethodException) {
        try {
          this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
          this.c.setAccessible(true);
          return;
        } catch (NoSuchMethodException noSuchMethodException1) {}
      } 
    }
    
    private static void a() {
      if (Build.VERSION.SDK_INT < 29)
        return; 
      throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    
    void a(AutoCompleteTextView param1AutoCompleteTextView) {
      a();
      Method method = this.b;
      if (method != null)
        try {
          method.invoke(param1AutoCompleteTextView, new Object[0]);
          return;
        } catch (Exception exception) {
          return;
        }  
    }
    
    void b(AutoCompleteTextView param1AutoCompleteTextView) {
      a();
      Method method = this.a;
      if (method != null)
        try {
          method.invoke(param1AutoCompleteTextView, new Object[0]);
          return;
        } catch (Exception exception) {
          return;
        }  
    }
    
    void c(AutoCompleteTextView param1AutoCompleteTextView) {
      a();
      Method method = this.c;
      if (method != null)
        try {
          method.invoke(param1AutoCompleteTextView, new Object[] { Boolean.valueOf(true) });
          return;
        } catch (Exception exception) {
          return;
        }  
    }
  }
  
  static class o extends b.i.a.a {
    public static final Parcelable.Creator<o> CREATOR = (Parcelable.Creator<o>)new a();
    
    boolean e;
    
    public o(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.e = ((Boolean)param1Parcel.readValue(null)).booleanValue();
    }
    
    o(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SearchView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" isIconified=");
      stringBuilder.append(this.e);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeValue(Boolean.valueOf(this.e));
    }
    
    class a implements Parcelable.ClassLoaderCreator<o> {
      public SearchView.o createFromParcel(Parcel param2Parcel) {
        return new SearchView.o(param2Parcel, null);
      }
      
      public SearchView.o createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new SearchView.o(param2Parcel, param2ClassLoader);
      }
      
      public SearchView.o[] newArray(int param2Int) {
        return new SearchView.o[param2Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<o> {
    public SearchView.o createFromParcel(Parcel param1Parcel) {
      return new SearchView.o(param1Parcel, null);
    }
    
    public SearchView.o createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new SearchView.o(param1Parcel, param1ClassLoader);
    }
    
    public SearchView.o[] newArray(int param1Int) {
      return new SearchView.o[param1Int];
    }
  }
  
  private static class p extends TouchDelegate {
    private final View a;
    
    private final Rect b;
    
    private final Rect c;
    
    private final Rect d;
    
    private final int e;
    
    private boolean f;
    
    public p(Rect param1Rect1, Rect param1Rect2, View param1View) {
      super(param1Rect1, param1View);
      this.e = ViewConfiguration.get(param1View.getContext()).getScaledTouchSlop();
      this.b = new Rect();
      this.d = new Rect();
      this.c = new Rect();
      a(param1Rect1, param1Rect2);
      this.a = param1View;
    }
    
    public void a(Rect param1Rect1, Rect param1Rect2) {
      this.b.set(param1Rect1);
      this.d.set(param1Rect1);
      param1Rect1 = this.d;
      int i = this.e;
      param1Rect1.inset(-i, -i);
      this.c.set(param1Rect2);
    }
    
    public boolean onTouchEvent(MotionEvent param1MotionEvent) {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual getX : ()F
      //   4: f2i
      //   5: istore #5
      //   7: aload_1
      //   8: invokevirtual getY : ()F
      //   11: f2i
      //   12: istore #6
      //   14: aload_1
      //   15: invokevirtual getAction : ()I
      //   18: istore_3
      //   19: iconst_1
      //   20: istore #4
      //   22: iconst_0
      //   23: istore #8
      //   25: iload_3
      //   26: ifeq -> 112
      //   29: iload_3
      //   30: iconst_1
      //   31: if_icmpeq -> 64
      //   34: iload_3
      //   35: iconst_2
      //   36: if_icmpeq -> 64
      //   39: iload_3
      //   40: iconst_3
      //   41: if_icmpeq -> 47
      //   44: goto -> 140
      //   47: aload_0
      //   48: getfield f : Z
      //   51: istore #7
      //   53: aload_0
      //   54: iconst_0
      //   55: putfield f : Z
      //   58: iload #4
      //   60: istore_3
      //   61: goto -> 146
      //   64: aload_0
      //   65: getfield f : Z
      //   68: istore #9
      //   70: iload #9
      //   72: istore #7
      //   74: iload #4
      //   76: istore_3
      //   77: iload #9
      //   79: ifeq -> 146
      //   82: iload #9
      //   84: istore #7
      //   86: iload #4
      //   88: istore_3
      //   89: aload_0
      //   90: getfield d : Landroid/graphics/Rect;
      //   93: iload #5
      //   95: iload #6
      //   97: invokevirtual contains : (II)Z
      //   100: ifne -> 146
      //   103: iconst_0
      //   104: istore_3
      //   105: iload #9
      //   107: istore #7
      //   109: goto -> 146
      //   112: aload_0
      //   113: getfield b : Landroid/graphics/Rect;
      //   116: iload #5
      //   118: iload #6
      //   120: invokevirtual contains : (II)Z
      //   123: ifeq -> 140
      //   126: aload_0
      //   127: iconst_1
      //   128: putfield f : Z
      //   131: iconst_1
      //   132: istore #7
      //   134: iload #4
      //   136: istore_3
      //   137: goto -> 146
      //   140: iconst_0
      //   141: istore #7
      //   143: iload #4
      //   145: istore_3
      //   146: iload #7
      //   148: ifeq -> 235
      //   151: iload_3
      //   152: ifeq -> 193
      //   155: aload_0
      //   156: getfield c : Landroid/graphics/Rect;
      //   159: iload #5
      //   161: iload #6
      //   163: invokevirtual contains : (II)Z
      //   166: ifne -> 193
      //   169: aload_0
      //   170: getfield a : Landroid/view/View;
      //   173: invokevirtual getWidth : ()I
      //   176: iconst_2
      //   177: idiv
      //   178: i2f
      //   179: fstore_2
      //   180: aload_0
      //   181: getfield a : Landroid/view/View;
      //   184: invokevirtual getHeight : ()I
      //   187: iconst_2
      //   188: idiv
      //   189: istore_3
      //   190: goto -> 218
      //   193: aload_0
      //   194: getfield c : Landroid/graphics/Rect;
      //   197: astore #10
      //   199: iload #5
      //   201: aload #10
      //   203: getfield left : I
      //   206: isub
      //   207: i2f
      //   208: fstore_2
      //   209: iload #6
      //   211: aload #10
      //   213: getfield top : I
      //   216: isub
      //   217: istore_3
      //   218: aload_1
      //   219: fload_2
      //   220: iload_3
      //   221: i2f
      //   222: invokevirtual setLocation : (FF)V
      //   225: aload_0
      //   226: getfield a : Landroid/view/View;
      //   229: aload_1
      //   230: invokevirtual dispatchTouchEvent : (Landroid/view/MotionEvent;)Z
      //   233: istore #8
      //   235: iload #8
      //   237: ireturn
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */