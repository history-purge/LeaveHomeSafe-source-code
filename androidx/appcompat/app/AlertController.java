package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.core.widget.NestedScrollView;
import b.a.j;
import b.g.m.v;
import java.lang.ref.WeakReference;

class AlertController {
  NestedScrollView A;
  
  private int B = 0;
  
  private Drawable C;
  
  private ImageView D;
  
  private TextView E;
  
  private TextView F;
  
  private View G;
  
  ListAdapter H;
  
  int I = -1;
  
  private int J;
  
  private int K;
  
  int L;
  
  int M;
  
  int N;
  
  int O;
  
  private boolean P;
  
  private int Q = 0;
  
  Handler R;
  
  private final View.OnClickListener S = new a(this);
  
  private final Context a;
  
  final h b;
  
  private final Window c;
  
  private final int d;
  
  private CharSequence e;
  
  private CharSequence f;
  
  ListView g;
  
  private View h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private boolean n = false;
  
  Button o;
  
  private CharSequence p;
  
  Message q;
  
  private Drawable r;
  
  Button s;
  
  private CharSequence t;
  
  Message u;
  
  private Drawable v;
  
  Button w;
  
  private CharSequence x;
  
  Message y;
  
  private Drawable z;
  
  public AlertController(Context paramContext, h paramh, Window paramWindow) {
    this.a = paramContext;
    this.b = paramh;
    this.c = paramWindow;
    this.R = new g((DialogInterface)paramh);
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, j.AlertDialog, b.a.a.alertDialogStyle, 0);
    this.J = typedArray.getResourceId(j.AlertDialog_android_layout, 0);
    this.K = typedArray.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
    this.L = typedArray.getResourceId(j.AlertDialog_listLayout, 0);
    this.M = typedArray.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
    this.N = typedArray.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
    this.O = typedArray.getResourceId(j.AlertDialog_listItemLayout, 0);
    this.P = typedArray.getBoolean(j.AlertDialog_showTitle, true);
    this.d = typedArray.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
    typedArray.recycle();
    paramh.a(1);
  }
  
  private ViewGroup a(View paramView1, View paramView2) {
    if (paramView1 == null) {
      paramView1 = paramView2;
      if (paramView2 instanceof ViewStub)
        paramView1 = ((ViewStub)paramView2).inflate(); 
      return (ViewGroup)paramView1;
    } 
    if (paramView2 != null) {
      ViewParent viewParent = paramView2.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(paramView2); 
    } 
    paramView2 = paramView1;
    if (paramView1 instanceof ViewStub)
      paramView2 = ((ViewStub)paramView1).inflate(); 
    return (ViewGroup)paramView2;
  }
  
  static void a(View paramView1, View paramView2, View paramView3) {
    boolean bool = false;
    if (paramView2 != null) {
      byte b;
      if (paramView1.canScrollVertically(-1)) {
        b = 0;
      } else {
        b = 4;
      } 
      paramView2.setVisibility(b);
    } 
    if (paramView3 != null) {
      byte b;
      if (paramView1.canScrollVertically(1)) {
        b = bool;
      } else {
        b = 4;
      } 
      paramView3.setVisibility(b);
    } 
  }
  
  private void a(ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: ldc 16908313
    //   4: invokevirtual findViewById : (I)Landroid/view/View;
    //   7: checkcast android/widget/Button
    //   10: putfield o : Landroid/widget/Button;
    //   13: aload_0
    //   14: getfield o : Landroid/widget/Button;
    //   17: aload_0
    //   18: getfield S : Landroid/view/View$OnClickListener;
    //   21: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   24: aload_0
    //   25: getfield p : Ljava/lang/CharSequence;
    //   28: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   31: istore #5
    //   33: iconst_1
    //   34: istore_3
    //   35: iload #5
    //   37: ifeq -> 61
    //   40: aload_0
    //   41: getfield r : Landroid/graphics/drawable/Drawable;
    //   44: ifnonnull -> 61
    //   47: aload_0
    //   48: getfield o : Landroid/widget/Button;
    //   51: bipush #8
    //   53: invokevirtual setVisibility : (I)V
    //   56: iconst_0
    //   57: istore_2
    //   58: goto -> 121
    //   61: aload_0
    //   62: getfield o : Landroid/widget/Button;
    //   65: aload_0
    //   66: getfield p : Ljava/lang/CharSequence;
    //   69: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   72: aload_0
    //   73: getfield r : Landroid/graphics/drawable/Drawable;
    //   76: astore #6
    //   78: aload #6
    //   80: ifnull -> 111
    //   83: aload_0
    //   84: getfield d : I
    //   87: istore_2
    //   88: aload #6
    //   90: iconst_0
    //   91: iconst_0
    //   92: iload_2
    //   93: iload_2
    //   94: invokevirtual setBounds : (IIII)V
    //   97: aload_0
    //   98: getfield o : Landroid/widget/Button;
    //   101: aload_0
    //   102: getfield r : Landroid/graphics/drawable/Drawable;
    //   105: aconst_null
    //   106: aconst_null
    //   107: aconst_null
    //   108: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   111: aload_0
    //   112: getfield o : Landroid/widget/Button;
    //   115: iconst_0
    //   116: invokevirtual setVisibility : (I)V
    //   119: iconst_1
    //   120: istore_2
    //   121: aload_0
    //   122: aload_1
    //   123: ldc_w 16908314
    //   126: invokevirtual findViewById : (I)Landroid/view/View;
    //   129: checkcast android/widget/Button
    //   132: putfield s : Landroid/widget/Button;
    //   135: aload_0
    //   136: getfield s : Landroid/widget/Button;
    //   139: aload_0
    //   140: getfield S : Landroid/view/View$OnClickListener;
    //   143: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   146: aload_0
    //   147: getfield t : Ljava/lang/CharSequence;
    //   150: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   153: ifeq -> 175
    //   156: aload_0
    //   157: getfield v : Landroid/graphics/drawable/Drawable;
    //   160: ifnonnull -> 175
    //   163: aload_0
    //   164: getfield s : Landroid/widget/Button;
    //   167: bipush #8
    //   169: invokevirtual setVisibility : (I)V
    //   172: goto -> 240
    //   175: aload_0
    //   176: getfield s : Landroid/widget/Button;
    //   179: aload_0
    //   180: getfield t : Ljava/lang/CharSequence;
    //   183: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   186: aload_0
    //   187: getfield v : Landroid/graphics/drawable/Drawable;
    //   190: astore #6
    //   192: aload #6
    //   194: ifnull -> 228
    //   197: aload_0
    //   198: getfield d : I
    //   201: istore #4
    //   203: aload #6
    //   205: iconst_0
    //   206: iconst_0
    //   207: iload #4
    //   209: iload #4
    //   211: invokevirtual setBounds : (IIII)V
    //   214: aload_0
    //   215: getfield s : Landroid/widget/Button;
    //   218: aload_0
    //   219: getfield v : Landroid/graphics/drawable/Drawable;
    //   222: aconst_null
    //   223: aconst_null
    //   224: aconst_null
    //   225: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   228: aload_0
    //   229: getfield s : Landroid/widget/Button;
    //   232: iconst_0
    //   233: invokevirtual setVisibility : (I)V
    //   236: iload_2
    //   237: iconst_2
    //   238: ior
    //   239: istore_2
    //   240: aload_0
    //   241: aload_1
    //   242: ldc_w 16908315
    //   245: invokevirtual findViewById : (I)Landroid/view/View;
    //   248: checkcast android/widget/Button
    //   251: putfield w : Landroid/widget/Button;
    //   254: aload_0
    //   255: getfield w : Landroid/widget/Button;
    //   258: aload_0
    //   259: getfield S : Landroid/view/View$OnClickListener;
    //   262: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   265: aload_0
    //   266: getfield x : Ljava/lang/CharSequence;
    //   269: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   272: ifeq -> 294
    //   275: aload_0
    //   276: getfield z : Landroid/graphics/drawable/Drawable;
    //   279: ifnonnull -> 294
    //   282: aload_0
    //   283: getfield w : Landroid/widget/Button;
    //   286: bipush #8
    //   288: invokevirtual setVisibility : (I)V
    //   291: goto -> 359
    //   294: aload_0
    //   295: getfield w : Landroid/widget/Button;
    //   298: aload_0
    //   299: getfield x : Ljava/lang/CharSequence;
    //   302: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   305: aload_0
    //   306: getfield z : Landroid/graphics/drawable/Drawable;
    //   309: astore #6
    //   311: aload #6
    //   313: ifnull -> 347
    //   316: aload_0
    //   317: getfield d : I
    //   320: istore #4
    //   322: aload #6
    //   324: iconst_0
    //   325: iconst_0
    //   326: iload #4
    //   328: iload #4
    //   330: invokevirtual setBounds : (IIII)V
    //   333: aload_0
    //   334: getfield w : Landroid/widget/Button;
    //   337: aload_0
    //   338: getfield z : Landroid/graphics/drawable/Drawable;
    //   341: aconst_null
    //   342: aconst_null
    //   343: aconst_null
    //   344: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   347: aload_0
    //   348: getfield w : Landroid/widget/Button;
    //   351: iconst_0
    //   352: invokevirtual setVisibility : (I)V
    //   355: iload_2
    //   356: iconst_4
    //   357: ior
    //   358: istore_2
    //   359: aload_0
    //   360: getfield a : Landroid/content/Context;
    //   363: invokestatic a : (Landroid/content/Context;)Z
    //   366: ifeq -> 417
    //   369: iload_2
    //   370: iconst_1
    //   371: if_icmpne -> 389
    //   374: aload_0
    //   375: getfield o : Landroid/widget/Button;
    //   378: astore #6
    //   380: aload_0
    //   381: aload #6
    //   383: invokespecial a : (Landroid/widget/Button;)V
    //   386: goto -> 417
    //   389: iload_2
    //   390: iconst_2
    //   391: if_icmpne -> 403
    //   394: aload_0
    //   395: getfield s : Landroid/widget/Button;
    //   398: astore #6
    //   400: goto -> 380
    //   403: iload_2
    //   404: iconst_4
    //   405: if_icmpne -> 417
    //   408: aload_0
    //   409: getfield w : Landroid/widget/Button;
    //   412: astore #6
    //   414: goto -> 380
    //   417: iload_2
    //   418: ifeq -> 426
    //   421: iload_3
    //   422: istore_2
    //   423: goto -> 428
    //   426: iconst_0
    //   427: istore_2
    //   428: iload_2
    //   429: ifne -> 438
    //   432: aload_1
    //   433: bipush #8
    //   435: invokevirtual setVisibility : (I)V
    //   438: return
  }
  
  private void a(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2) {
    View view2 = this.c.findViewById(b.a.f.scrollIndicatorUp);
    View view1 = this.c.findViewById(b.a.f.scrollIndicatorDown);
    if (Build.VERSION.SDK_INT >= 23) {
      v.a(paramView, paramInt1, paramInt2);
      if (view2 != null)
        paramViewGroup.removeView(view2); 
      if (view1 != null) {
        paramViewGroup.removeView(view1);
        return;
      } 
    } else {
      View view = null;
      paramView = view2;
      if (view2 != null) {
        paramView = view2;
        if ((paramInt1 & 0x1) == 0) {
          paramViewGroup.removeView(view2);
          paramView = null;
        } 
      } 
      if (view1 != null && (paramInt1 & 0x2) == 0) {
        paramViewGroup.removeView(view1);
        view1 = view;
      } 
      if (paramView != null || view1 != null) {
        if (this.f != null) {
          this.A.setOnScrollChangeListener(new b(this, paramView, view1));
          this.A.post(new c(this, paramView, view1));
          return;
        } 
        ListView listView = this.g;
        if (listView != null) {
          listView.setOnScrollListener(new d(this, paramView, view1));
          this.g.post(new e(this, paramView, view1));
          return;
        } 
        if (paramView != null)
          paramViewGroup.removeView(paramView); 
        if (view1 != null)
          paramViewGroup.removeView(view1); 
      } 
    } 
  }
  
  private void a(Button paramButton) {
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    layoutParams.gravity = 1;
    layoutParams.weight = 0.5F;
    paramButton.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  private static boolean a(Context paramContext) {
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(b.a.a.alertDialogCenterButtons, typedValue, true);
    return (typedValue.data != 0);
  }
  
  private void b(ViewGroup paramViewGroup) {
    this.A = (NestedScrollView)this.c.findViewById(b.a.f.scrollView);
    this.A.setFocusable(false);
    this.A.setNestedScrollingEnabled(false);
    this.F = (TextView)paramViewGroup.findViewById(16908299);
    TextView textView = this.F;
    if (textView == null)
      return; 
    CharSequence charSequence = this.f;
    if (charSequence != null) {
      textView.setText(charSequence);
      return;
    } 
    textView.setVisibility(8);
    this.A.removeView((View)this.F);
    if (this.g != null) {
      paramViewGroup = (ViewGroup)this.A.getParent();
      int i = paramViewGroup.indexOfChild((View)this.A);
      paramViewGroup.removeViewAt(i);
      paramViewGroup.addView((View)this.g, i, new ViewGroup.LayoutParams(-1, -1));
      return;
    } 
    paramViewGroup.setVisibility(8);
  }
  
  private int c() {
    int i = this.K;
    return (i == 0) ? this.J : ((this.Q == 1) ? i : this.J);
  }
  
  private void c(ViewGroup paramViewGroup) {
    View view = this.h;
    boolean bool = false;
    if (view == null)
      if (this.i != 0) {
        view = LayoutInflater.from(this.a).inflate(this.i, paramViewGroup, false);
      } else {
        view = null;
      }  
    if (view != null)
      bool = true; 
    if (!bool || !c(view))
      this.c.setFlags(131072, 131072); 
    if (bool) {
      FrameLayout frameLayout = (FrameLayout)this.c.findViewById(b.a.f.custom);
      frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
      if (this.n)
        frameLayout.setPadding(this.j, this.k, this.l, this.m); 
      if (this.g != null) {
        ((i0.a)paramViewGroup.getLayoutParams()).a = 0.0F;
        return;
      } 
    } else {
      paramViewGroup.setVisibility(8);
    } 
  }
  
  static boolean c(View paramView) {
    if (paramView.onCheckIsTextEditor())
      return true; 
    if (!(paramView instanceof ViewGroup))
      return false; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    while (i > 0) {
      int j = i - 1;
      i = j;
      if (c(viewGroup.getChildAt(j)))
        return true; 
    } 
    return false;
  }
  
  private void d() {
    int i;
    int j;
    boolean bool;
    View view4 = this.c.findViewById(b.a.f.parentPanel);
    View view3 = view4.findViewById(b.a.f.topPanel);
    View view2 = view4.findViewById(b.a.f.contentPanel);
    View view1 = view4.findViewById(b.a.f.buttonPanel);
    ViewGroup viewGroup4 = (ViewGroup)view4.findViewById(b.a.f.customPanel);
    c(viewGroup4);
    View view7 = viewGroup4.findViewById(b.a.f.topPanel);
    View view6 = viewGroup4.findViewById(b.a.f.contentPanel);
    View view5 = viewGroup4.findViewById(b.a.f.buttonPanel);
    ViewGroup viewGroup3 = a(view7, view3);
    ViewGroup viewGroup2 = a(view6, view2);
    ViewGroup viewGroup1 = a(view5, view1);
    b(viewGroup2);
    a(viewGroup1);
    d(viewGroup3);
    byte b = 0;
    if (viewGroup4 != null && viewGroup4.getVisibility() != 8) {
      i = 1;
    } else {
      i = 0;
    } 
    if (viewGroup3 != null && viewGroup3.getVisibility() != 8) {
      j = 1;
    } else {
      j = 0;
    } 
    if (viewGroup1 != null && viewGroup1.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && viewGroup2 != null) {
      View view = viewGroup2.findViewById(b.a.f.textSpacerNoButtons);
      if (view != null)
        view.setVisibility(0); 
    } 
    if (j) {
      View view;
      NestedScrollView nestedScrollView = this.A;
      if (nestedScrollView != null)
        nestedScrollView.setClipToPadding(true); 
      nestedScrollView = null;
      if (this.f != null || this.g != null)
        view = viewGroup3.findViewById(b.a.f.titleDividerNoCustom); 
      if (view != null)
        view.setVisibility(0); 
    } else if (viewGroup2 != null) {
      View view = viewGroup2.findViewById(b.a.f.textSpacerNoTitle);
      if (view != null)
        view.setVisibility(0); 
    } 
    ListView listView = this.g;
    if (listView instanceof RecycleListView)
      ((RecycleListView)listView).a(j, bool); 
    if (!i) {
      NestedScrollView nestedScrollView;
      listView = this.g;
      if (listView == null)
        nestedScrollView = this.A; 
      if (nestedScrollView != null) {
        i = b;
        if (bool)
          i = 2; 
        a(viewGroup2, (View)nestedScrollView, j | i, 3);
      } 
    } 
    listView = this.g;
    if (listView != null) {
      ListAdapter listAdapter = this.H;
      if (listAdapter != null) {
        listView.setAdapter(listAdapter);
        i = this.I;
        if (i > -1) {
          listView.setItemChecked(i, true);
          listView.setSelection(i);
        } 
      } 
    } 
  }
  
  private void d(ViewGroup paramViewGroup) {
    Drawable drawable;
    if (this.G != null) {
      ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(this.G, 0, layoutParams);
      this.c.findViewById(b.a.f.title_template).setVisibility(8);
      return;
    } 
    this.D = (ImageView)this.c.findViewById(16908294);
    if ((TextUtils.isEmpty(this.e) ^ true) != 0 && this.P) {
      this.E = (TextView)this.c.findViewById(b.a.f.alertTitle);
      this.E.setText(this.e);
      int i = this.B;
      if (i != 0) {
        this.D.setImageResource(i);
        return;
      } 
      drawable = this.C;
      if (drawable != null) {
        this.D.setImageDrawable(drawable);
        return;
      } 
      this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
      this.D.setVisibility(8);
      return;
    } 
    this.c.findViewById(b.a.f.title_template).setVisibility(8);
    this.D.setVisibility(8);
    drawable.setVisibility(8);
  }
  
  public int a(int paramInt) {
    TypedValue typedValue = new TypedValue();
    this.a.getTheme().resolveAttribute(paramInt, typedValue, true);
    return typedValue.resourceId;
  }
  
  public ListView a() {
    return this.g;
  }
  
  public void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable) {
    Message message = paramMessage;
    if (paramMessage == null) {
      message = paramMessage;
      if (paramOnClickListener != null)
        message = this.R.obtainMessage(paramInt, paramOnClickListener); 
    } 
    if (paramInt != -3) {
      if (paramInt != -2) {
        if (paramInt == -1) {
          this.p = paramCharSequence;
          this.q = message;
          this.r = paramDrawable;
          return;
        } 
        throw new IllegalArgumentException("Button does not exist");
      } 
      this.t = paramCharSequence;
      this.u = message;
      this.v = paramDrawable;
      return;
    } 
    this.x = paramCharSequence;
    this.y = message;
    this.z = paramDrawable;
  }
  
  public void a(Drawable paramDrawable) {
    this.C = paramDrawable;
    this.B = 0;
    ImageView imageView = this.D;
    if (imageView != null) {
      if (paramDrawable != null) {
        imageView.setVisibility(0);
        this.D.setImageDrawable(paramDrawable);
        return;
      } 
      imageView.setVisibility(8);
    } 
  }
  
  public void a(View paramView) {
    this.G = paramView;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.h = paramView;
    this.i = 0;
    this.n = true;
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramInt4;
  }
  
  public void a(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    TextView textView = this.F;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) {
    NestedScrollView nestedScrollView = this.A;
    return (nestedScrollView != null && nestedScrollView.a(paramKeyEvent));
  }
  
  public void b() {
    int i = c();
    this.b.setContentView(i);
    d();
  }
  
  public void b(int paramInt) {
    this.C = null;
    this.B = paramInt;
    ImageView imageView = this.D;
    if (imageView != null) {
      if (paramInt != 0) {
        imageView.setVisibility(0);
        this.D.setImageResource(this.B);
        return;
      } 
      imageView.setVisibility(8);
    } 
  }
  
  public void b(View paramView) {
    this.h = paramView;
    this.i = 0;
    this.n = false;
  }
  
  public void b(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    TextView textView = this.E;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public boolean b(int paramInt, KeyEvent paramKeyEvent) {
    NestedScrollView nestedScrollView = this.A;
    return (nestedScrollView != null && nestedScrollView.a(paramKeyEvent));
  }
  
  public void c(int paramInt) {
    this.h = null;
    this.i = paramInt;
    this.n = false;
  }
  
  public static class RecycleListView extends ListView {
    private final int c;
    
    private final int d;
    
    public RecycleListView(Context param1Context) {
      this(param1Context, null);
    }
    
    public RecycleListView(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.RecycleListView);
      this.d = typedArray.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
      this.c = typedArray.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
    }
    
    public void a(boolean param1Boolean1, boolean param1Boolean2) {
      if (!param1Boolean2 || !param1Boolean1) {
        int i;
        int j;
        int k = getPaddingLeft();
        if (param1Boolean1) {
          i = getPaddingTop();
        } else {
          i = this.c;
        } 
        int m = getPaddingRight();
        if (param1Boolean2) {
          j = getPaddingBottom();
        } else {
          j = this.d;
        } 
        setPadding(k, i, m, j);
      } 
    }
  }
  
  class a implements View.OnClickListener {
    a(AlertController this$0) {}
    
    public void onClick(View param1View) {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Landroidx/appcompat/app/AlertController;
      //   4: astore_2
      //   5: aload_1
      //   6: aload_2
      //   7: getfield o : Landroid/widget/Button;
      //   10: if_acmpne -> 32
      //   13: aload_2
      //   14: getfield q : Landroid/os/Message;
      //   17: astore_2
      //   18: aload_2
      //   19: ifnull -> 32
      //   22: aload_2
      //   23: astore_1
      //   24: aload_1
      //   25: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   28: astore_1
      //   29: goto -> 91
      //   32: aload_0
      //   33: getfield c : Landroidx/appcompat/app/AlertController;
      //   36: astore_2
      //   37: aload_1
      //   38: aload_2
      //   39: getfield s : Landroid/widget/Button;
      //   42: if_acmpne -> 59
      //   45: aload_2
      //   46: getfield u : Landroid/os/Message;
      //   49: astore_2
      //   50: aload_2
      //   51: ifnull -> 59
      //   54: aload_2
      //   55: astore_1
      //   56: goto -> 24
      //   59: aload_0
      //   60: getfield c : Landroidx/appcompat/app/AlertController;
      //   63: astore_2
      //   64: aload_1
      //   65: aload_2
      //   66: getfield w : Landroid/widget/Button;
      //   69: if_acmpne -> 89
      //   72: aload_2
      //   73: getfield y : Landroid/os/Message;
      //   76: astore_1
      //   77: aload_1
      //   78: ifnull -> 89
      //   81: aload_1
      //   82: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   85: astore_1
      //   86: goto -> 91
      //   89: aconst_null
      //   90: astore_1
      //   91: aload_1
      //   92: ifnull -> 99
      //   95: aload_1
      //   96: invokevirtual sendToTarget : ()V
      //   99: aload_0
      //   100: getfield c : Landroidx/appcompat/app/AlertController;
      //   103: astore_1
      //   104: aload_1
      //   105: getfield R : Landroid/os/Handler;
      //   108: iconst_1
      //   109: aload_1
      //   110: getfield b : Landroidx/appcompat/app/h;
      //   113: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
      //   116: invokevirtual sendToTarget : ()V
      //   119: return
    }
  }
  
  class b implements NestedScrollView.b {
    b(AlertController this$0, View param1View1, View param1View2) {}
    
    public void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      AlertController.a((View)param1NestedScrollView, this.a, this.b);
    }
  }
  
  class c implements Runnable {
    c(AlertController this$0, View param1View1, View param1View2) {}
    
    public void run() {
      AlertController.a((View)this.e.A, this.c, this.d);
    }
  }
  
  class d implements AbsListView.OnScrollListener {
    d(AlertController this$0, View param1View1, View param1View2) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {
      AlertController.a((View)param1AbsListView, this.a, this.b);
    }
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {}
  }
  
  class e implements Runnable {
    e(AlertController this$0, View param1View1, View param1View2) {}
    
    public void run() {
      AlertController.a((View)this.e.g, this.c, this.d);
    }
  }
  
  public static class f {
    public int A;
    
    public int B;
    
    public int C;
    
    public int D;
    
    public boolean E = false;
    
    public boolean[] F;
    
    public boolean G;
    
    public boolean H;
    
    public int I = -1;
    
    public DialogInterface.OnMultiChoiceClickListener J;
    
    public Cursor K;
    
    public String L;
    
    public String M;
    
    public AdapterView.OnItemSelectedListener N;
    
    public e O;
    
    public final Context a;
    
    public final LayoutInflater b;
    
    public int c = 0;
    
    public Drawable d;
    
    public int e = 0;
    
    public CharSequence f;
    
    public View g;
    
    public CharSequence h;
    
    public CharSequence i;
    
    public Drawable j;
    
    public DialogInterface.OnClickListener k;
    
    public CharSequence l;
    
    public Drawable m;
    
    public DialogInterface.OnClickListener n;
    
    public CharSequence o;
    
    public Drawable p;
    
    public DialogInterface.OnClickListener q;
    
    public boolean r;
    
    public DialogInterface.OnCancelListener s;
    
    public DialogInterface.OnDismissListener t;
    
    public DialogInterface.OnKeyListener u;
    
    public CharSequence[] v;
    
    public ListAdapter w;
    
    public DialogInterface.OnClickListener x;
    
    public int y;
    
    public View z;
    
    public f(Context param1Context) {
      this.a = param1Context;
      this.r = true;
      this.b = (LayoutInflater)param1Context.getSystemService("layout_inflater");
    }
    
    private void b(AlertController param1AlertController) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroid/view/LayoutInflater;
      //   4: aload_1
      //   5: getfield L : I
      //   8: aconst_null
      //   9: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
      //   12: checkcast androidx/appcompat/app/AlertController$RecycleListView
      //   15: astore #4
      //   17: aload_0
      //   18: getfield G : Z
      //   21: ifeq -> 82
      //   24: aload_0
      //   25: getfield K : Landroid/database/Cursor;
      //   28: astore_3
      //   29: aload_3
      //   30: ifnonnull -> 61
      //   33: new androidx/appcompat/app/AlertController$f$a
      //   36: dup
      //   37: aload_0
      //   38: aload_0
      //   39: getfield a : Landroid/content/Context;
      //   42: aload_1
      //   43: getfield M : I
      //   46: ldc 16908308
      //   48: aload_0
      //   49: getfield v : [Ljava/lang/CharSequence;
      //   52: aload #4
      //   54: invokespecial <init> : (Landroidx/appcompat/app/AlertController$f;Landroid/content/Context;II[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V
      //   57: astore_3
      //   58: goto -> 178
      //   61: new androidx/appcompat/app/AlertController$f$b
      //   64: dup
      //   65: aload_0
      //   66: aload_0
      //   67: getfield a : Landroid/content/Context;
      //   70: aload_3
      //   71: iconst_0
      //   72: aload #4
      //   74: aload_1
      //   75: invokespecial <init> : (Landroidx/appcompat/app/AlertController$f;Landroid/content/Context;Landroid/database/Cursor;ZLandroidx/appcompat/app/AlertController$RecycleListView;Landroidx/appcompat/app/AlertController;)V
      //   78: astore_3
      //   79: goto -> 178
      //   82: aload_0
      //   83: getfield H : Z
      //   86: ifeq -> 97
      //   89: aload_1
      //   90: getfield N : I
      //   93: istore_2
      //   94: goto -> 102
      //   97: aload_1
      //   98: getfield O : I
      //   101: istore_2
      //   102: aload_0
      //   103: getfield K : Landroid/database/Cursor;
      //   106: astore_3
      //   107: aload_3
      //   108: ifnull -> 147
      //   111: new android/widget/SimpleCursorAdapter
      //   114: dup
      //   115: aload_0
      //   116: getfield a : Landroid/content/Context;
      //   119: iload_2
      //   120: aload_3
      //   121: iconst_1
      //   122: anewarray java/lang/String
      //   125: dup
      //   126: iconst_0
      //   127: aload_0
      //   128: getfield L : Ljava/lang/String;
      //   131: aastore
      //   132: iconst_1
      //   133: newarray int
      //   135: dup
      //   136: iconst_0
      //   137: ldc 16908308
      //   139: iastore
      //   140: invokespecial <init> : (Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[I)V
      //   143: astore_3
      //   144: goto -> 178
      //   147: aload_0
      //   148: getfield w : Landroid/widget/ListAdapter;
      //   151: astore_3
      //   152: aload_3
      //   153: ifnull -> 159
      //   156: goto -> 178
      //   159: new androidx/appcompat/app/AlertController$h
      //   162: dup
      //   163: aload_0
      //   164: getfield a : Landroid/content/Context;
      //   167: iload_2
      //   168: ldc 16908308
      //   170: aload_0
      //   171: getfield v : [Ljava/lang/CharSequence;
      //   174: invokespecial <init> : (Landroid/content/Context;II[Ljava/lang/CharSequence;)V
      //   177: astore_3
      //   178: aload_0
      //   179: getfield O : Landroidx/appcompat/app/AlertController$f$e;
      //   182: astore #5
      //   184: aload #5
      //   186: ifnull -> 198
      //   189: aload #5
      //   191: aload #4
      //   193: invokeinterface a : (Landroid/widget/ListView;)V
      //   198: aload_1
      //   199: aload_3
      //   200: putfield H : Landroid/widget/ListAdapter;
      //   203: aload_1
      //   204: aload_0
      //   205: getfield I : I
      //   208: putfield I : I
      //   211: aload_0
      //   212: getfield x : Landroid/content/DialogInterface$OnClickListener;
      //   215: ifnull -> 237
      //   218: new androidx/appcompat/app/AlertController$f$c
      //   221: dup
      //   222: aload_0
      //   223: aload_1
      //   224: invokespecial <init> : (Landroidx/appcompat/app/AlertController$f;Landroidx/appcompat/app/AlertController;)V
      //   227: astore_3
      //   228: aload #4
      //   230: aload_3
      //   231: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
      //   234: goto -> 259
      //   237: aload_0
      //   238: getfield J : Landroid/content/DialogInterface$OnMultiChoiceClickListener;
      //   241: ifnull -> 259
      //   244: new androidx/appcompat/app/AlertController$f$d
      //   247: dup
      //   248: aload_0
      //   249: aload #4
      //   251: aload_1
      //   252: invokespecial <init> : (Landroidx/appcompat/app/AlertController$f;Landroidx/appcompat/app/AlertController$RecycleListView;Landroidx/appcompat/app/AlertController;)V
      //   255: astore_3
      //   256: goto -> 228
      //   259: aload_0
      //   260: getfield N : Landroid/widget/AdapterView$OnItemSelectedListener;
      //   263: astore_3
      //   264: aload_3
      //   265: ifnull -> 274
      //   268: aload #4
      //   270: aload_3
      //   271: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
      //   274: aload_0
      //   275: getfield H : Z
      //   278: ifeq -> 290
      //   281: aload #4
      //   283: iconst_1
      //   284: invokevirtual setChoiceMode : (I)V
      //   287: goto -> 303
      //   290: aload_0
      //   291: getfield G : Z
      //   294: ifeq -> 303
      //   297: aload #4
      //   299: iconst_2
      //   300: invokevirtual setChoiceMode : (I)V
      //   303: aload_1
      //   304: aload #4
      //   306: putfield g : Landroid/widget/ListView;
      //   309: return
    }
    
    public void a(AlertController param1AlertController) {
      View view2 = this.g;
      if (view2 != null) {
        param1AlertController.a(view2);
      } else {
        CharSequence charSequence1 = this.f;
        if (charSequence1 != null)
          param1AlertController.b(charSequence1); 
        Drawable drawable = this.d;
        if (drawable != null)
          param1AlertController.a(drawable); 
        int j = this.c;
        if (j != 0)
          param1AlertController.b(j); 
        j = this.e;
        if (j != 0)
          param1AlertController.b(param1AlertController.a(j)); 
      } 
      CharSequence charSequence = this.h;
      if (charSequence != null)
        param1AlertController.a(charSequence); 
      if (this.i != null || this.j != null)
        param1AlertController.a(-1, this.i, this.k, (Message)null, this.j); 
      if (this.l != null || this.m != null)
        param1AlertController.a(-2, this.l, this.n, (Message)null, this.m); 
      if (this.o != null || this.p != null)
        param1AlertController.a(-3, this.o, this.q, (Message)null, this.p); 
      if (this.v != null || this.K != null || this.w != null)
        b(param1AlertController); 
      View view1 = this.z;
      if (view1 != null) {
        if (this.E) {
          param1AlertController.a(view1, this.A, this.B, this.C, this.D);
          return;
        } 
        param1AlertController.b(view1);
        return;
      } 
      int i = this.y;
      if (i != 0)
        param1AlertController.c(i); 
    }
    
    class a extends ArrayAdapter<CharSequence> {
      a(AlertController.f this$0, Context param2Context, int param2Int1, int param2Int2, CharSequence[] param2ArrayOfCharSequence, AlertController.RecycleListView param2RecycleListView) {
        super(param2Context, param2Int1, param2Int2, (Object[])param2ArrayOfCharSequence);
      }
      
      public View getView(int param2Int, View param2View, ViewGroup param2ViewGroup) {
        param2View = super.getView(param2Int, param2View, param2ViewGroup);
        boolean[] arrayOfBoolean = this.d.F;
        if (arrayOfBoolean != null && arrayOfBoolean[param2Int])
          this.c.setItemChecked(param2Int, true); 
        return param2View;
      }
    }
    
    class b extends CursorAdapter {
      private final int c;
      
      private final int d;
      
      b(AlertController.f this$0, Context param2Context, Cursor param2Cursor, boolean param2Boolean, AlertController.RecycleListView param2RecycleListView, AlertController param2AlertController) {
        super(param2Context, param2Cursor, param2Boolean);
        Cursor cursor = getCursor();
        this.c = cursor.getColumnIndexOrThrow(this.g.L);
        this.d = cursor.getColumnIndexOrThrow(this.g.M);
      }
      
      public void bindView(View param2View, Context param2Context, Cursor param2Cursor) {
        ((CheckedTextView)param2View.findViewById(16908308)).setText(param2Cursor.getString(this.c));
        AlertController.RecycleListView recycleListView = this.e;
        int i = param2Cursor.getPosition();
        int j = param2Cursor.getInt(this.d);
        boolean bool = true;
        if (j != 1)
          bool = false; 
        recycleListView.setItemChecked(i, bool);
      }
      
      public View newView(Context param2Context, Cursor param2Cursor, ViewGroup param2ViewGroup) {
        return this.g.b.inflate(this.f.M, param2ViewGroup, false);
      }
    }
    
    class c implements AdapterView.OnItemClickListener {
      c(AlertController.f this$0, AlertController param2AlertController) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        this.d.x.onClick((DialogInterface)this.c.b, param2Int);
        if (!this.d.H)
          this.c.b.dismiss(); 
      }
    }
    
    class d implements AdapterView.OnItemClickListener {
      d(AlertController.f this$0, AlertController.RecycleListView param2RecycleListView, AlertController param2AlertController) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        boolean[] arrayOfBoolean = this.e.F;
        if (arrayOfBoolean != null)
          arrayOfBoolean[param2Int] = this.c.isItemChecked(param2Int); 
        this.e.J.onClick((DialogInterface)this.d.b, param2Int, this.c.isItemChecked(param2Int));
      }
    }
    
    public static interface e {
      void a(ListView param2ListView);
    }
  }
  
  class a extends ArrayAdapter<CharSequence> {
    a(AlertController this$0, Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence, AlertController.RecycleListView param1RecycleListView) {
      super(param1Context, param1Int1, param1Int2, (Object[])param1ArrayOfCharSequence);
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      param1View = super.getView(param1Int, param1View, param1ViewGroup);
      boolean[] arrayOfBoolean = this.d.F;
      if (arrayOfBoolean != null && arrayOfBoolean[param1Int])
        this.c.setItemChecked(param1Int, true); 
      return param1View;
    }
  }
  
  class b extends CursorAdapter {
    private final int c;
    
    private final int d;
    
    b(AlertController this$0, Context param1Context, Cursor param1Cursor, boolean param1Boolean, AlertController.RecycleListView param1RecycleListView, AlertController param1AlertController) {
      super(param1Context, param1Cursor, param1Boolean);
      Cursor cursor = getCursor();
      this.c = cursor.getColumnIndexOrThrow(this.g.L);
      this.d = cursor.getColumnIndexOrThrow(this.g.M);
    }
    
    public void bindView(View param1View, Context param1Context, Cursor param1Cursor) {
      ((CheckedTextView)param1View.findViewById(16908308)).setText(param1Cursor.getString(this.c));
      AlertController.RecycleListView recycleListView = this.e;
      int i = param1Cursor.getPosition();
      int j = param1Cursor.getInt(this.d);
      boolean bool = true;
      if (j != 1)
        bool = false; 
      recycleListView.setItemChecked(i, bool);
    }
    
    public View newView(Context param1Context, Cursor param1Cursor, ViewGroup param1ViewGroup) {
      return this.g.b.inflate(this.f.M, param1ViewGroup, false);
    }
  }
  
  class c implements AdapterView.OnItemClickListener {
    c(AlertController this$0, AlertController param1AlertController) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.d.x.onClick((DialogInterface)this.c.b, param1Int);
      if (!this.d.H)
        this.c.b.dismiss(); 
    }
  }
  
  class d implements AdapterView.OnItemClickListener {
    d(AlertController this$0, AlertController.RecycleListView param1RecycleListView, AlertController param1AlertController) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      boolean[] arrayOfBoolean = this.e.F;
      if (arrayOfBoolean != null)
        arrayOfBoolean[param1Int] = this.c.isItemChecked(param1Int); 
      this.e.J.onClick((DialogInterface)this.d.b, param1Int, this.c.isItemChecked(param1Int));
    }
  }
  
  public static interface e {
    void a(ListView param1ListView);
  }
  
  private static final class g extends Handler {
    private WeakReference<DialogInterface> a;
    
    public g(DialogInterface param1DialogInterface) {
      this.a = new WeakReference<DialogInterface>(param1DialogInterface);
    }
    
    public void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != -3 && i != -2 && i != -1) {
        if (i != 1)
          return; 
        ((DialogInterface)param1Message.obj).dismiss();
        return;
      } 
      ((DialogInterface.OnClickListener)param1Message.obj).onClick(this.a.get(), param1Message.what);
    }
  }
  
  private static class h extends ArrayAdapter<CharSequence> {
    public h(Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence) {
      super(param1Context, param1Int1, param1Int2, (Object[])param1ArrayOfCharSequence);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public boolean hasStableIds() {
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/AlertController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */