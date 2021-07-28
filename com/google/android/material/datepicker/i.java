package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.d;
import androidx.fragment.app.x;
import b.g.m.v;
import com.google.android.material.internal.CheckableImageButton;
import e.f.a.f.a0.g;
import e.f.a.f.e;
import e.f.a.f.f;
import e.f.a.f.h;
import e.f.a.f.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class i<S> extends d {
  static final Object H0 = "CONFIRM_BUTTON_TAG";
  
  static final Object I0 = "CANCEL_BUTTON_TAG";
  
  static final Object J0 = "TOGGLE_BUTTON_TAG";
  
  private int A0;
  
  private CharSequence B0;
  
  private boolean C0;
  
  private TextView D0;
  
  private CheckableImageButton E0;
  
  private g F0;
  
  private Button G0;
  
  private final LinkedHashSet<j<? super S>> r0 = new LinkedHashSet<j<? super S>>();
  
  private final LinkedHashSet<View.OnClickListener> s0 = new LinkedHashSet<View.OnClickListener>();
  
  private final LinkedHashSet<DialogInterface.OnCancelListener> t0 = new LinkedHashSet<DialogInterface.OnCancelListener>();
  
  private final LinkedHashSet<DialogInterface.OnDismissListener> u0 = new LinkedHashSet<DialogInterface.OnDismissListener>();
  
  private int v0;
  
  private d<S> w0;
  
  private p<S> x0;
  
  private a y0;
  
  private h<S> z0;
  
  private void E0() {
    h<S> h1;
    this.z0 = h.a(this.w0, e(t0()), this.y0);
    if (this.E0.isChecked()) {
      k<S> k = k.a(this.w0, this.y0);
    } else {
      h1 = this.z0;
    } 
    this.x0 = h1;
    G0();
    x x = n().b();
    x.b(f.mtrl_calendar_frame, this.x0);
    x.c();
    this.x0.a(new c(this));
  }
  
  public static long F0() {
    return (l.t()).i;
  }
  
  private void G0() {
    String str = C0();
    this.D0.setContentDescription(String.format(a(e.f.a.f.i.mtrl_picker_announce_current_selection), new Object[] { str }));
    this.D0.setText(str);
  }
  
  private void a(CheckableImageButton paramCheckableImageButton) {
    int j;
    boolean bool = this.E0.isChecked();
    Context context = paramCheckableImageButton.getContext();
    if (bool) {
      j = e.f.a.f.i.mtrl_picker_toggle_to_calendar_input_mode;
    } else {
      j = e.f.a.f.i.mtrl_picker_toggle_to_text_input_mode;
    } 
    String str = context.getString(j);
    this.E0.setContentDescription(str);
  }
  
  private static Drawable b(Context paramContext) {
    StateListDrawable stateListDrawable = new StateListDrawable();
    Drawable drawable2 = b.a.k.a.a.c(paramContext, e.ic_calendar_black_24dp);
    stateListDrawable.addState(new int[] { 16842912 }, drawable2);
    Drawable drawable1 = b.a.k.a.a.c(paramContext, e.ic_edit_black_24dp);
    stateListDrawable.addState(new int[0], drawable1);
    return (Drawable)stateListDrawable;
  }
  
  private static int c(Context paramContext) {
    Resources resources = paramContext.getResources();
    return resources.getDimensionPixelSize(e.f.a.f.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(e.f.a.f.d.mtrl_calendar_days_of_week_height) + m.g * resources.getDimensionPixelSize(e.f.a.f.d.mtrl_calendar_day_height) + (m.g - 1) * resources.getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_month_vertical_padding) + resources.getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_bottom_padding);
  }
  
  private static int d(Context paramContext) {
    Resources resources = paramContext.getResources();
    int j = resources.getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_content_padding);
    int k = (l.t()).g;
    return j * 2 + resources.getDimensionPixelSize(e.f.a.f.d.mtrl_calendar_day_width) * k + (k - 1) * resources.getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_month_horizontal_padding);
  }
  
  private int e(Context paramContext) {
    int j = this.v0;
    return (j != 0) ? j : this.w0.b(paramContext);
  }
  
  private void f(Context paramContext) {
    this.E0.setTag(J0);
    this.E0.setImageDrawable(b(paramContext));
    v.a((View)this.E0, null);
    a(this.E0);
    this.E0.setOnClickListener(new d(this));
  }
  
  static boolean g(Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(e.f.a.f.x.b.a(paramContext, e.f.a.f.b.materialCalendarStyle, h.class.getCanonicalName()), new int[] { 16843277 });
    boolean bool = typedArray.getBoolean(0, false);
    typedArray.recycle();
    return bool;
  }
  
  public String C0() {
    return this.w0.a(o());
  }
  
  public final S D0() {
    return this.w0.d();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    int j;
    if (this.C0) {
      j = h.mtrl_picker_fullscreen;
    } else {
      j = h.mtrl_picker_dialog;
    } 
    View view = paramLayoutInflater.inflate(j, paramViewGroup);
    Context context = view.getContext();
    if (this.C0) {
      view.findViewById(f.mtrl_calendar_frame).setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(d(context), -2));
    } else {
      View view1 = view.findViewById(f.mtrl_calendar_main_pane);
      View view2 = view.findViewById(f.mtrl_calendar_frame);
      view1.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(d(context), -1));
      view2.setMinimumHeight(c(t0()));
    } 
    this.D0 = (TextView)view.findViewById(f.mtrl_picker_header_selection_text);
    v.g((View)this.D0, 1);
    this.E0 = (CheckableImageButton)view.findViewById(f.mtrl_picker_header_toggle);
    TextView textView = (TextView)view.findViewById(f.mtrl_picker_title_text);
    CharSequence charSequence = this.B0;
    if (charSequence != null) {
      textView.setText(charSequence);
    } else {
      textView.setText(this.A0);
    } 
    f(context);
    this.G0 = (Button)view.findViewById(f.confirm_button);
    if (this.w0.b()) {
      this.G0.setEnabled(true);
    } else {
      this.G0.setEnabled(false);
    } 
    this.G0.setTag(H0);
    this.G0.setOnClickListener(new a(this));
    Button button = (Button)view.findViewById(f.cancel_button);
    button.setTag(I0);
    button.setOnClickListener(new b(this));
    return view;
  }
  
  public final void c(Bundle paramBundle) {
    super.c(paramBundle);
    Bundle bundle = paramBundle;
    if (paramBundle == null)
      bundle = m(); 
    this.v0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
    this.w0 = (d<S>)bundle.getParcelable("DATE_SELECTOR_KEY");
    this.y0 = (a)bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    this.A0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
    this.B0 = bundle.getCharSequence("TITLE_TEXT_KEY");
  }
  
  public final void e(Bundle paramBundle) {
    super.e(paramBundle);
    paramBundle.putInt("OVERRIDE_THEME_RES_ID", this.v0);
    paramBundle.putParcelable("DATE_SELECTOR_KEY", this.w0);
    a.b b = new a.b(this.y0);
    if (this.z0.z0() != null)
      b.a((this.z0.z0()).i); 
    paramBundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", b.a());
    paramBundle.putInt("TITLE_TEXT_RES_ID_KEY", this.A0);
    paramBundle.putCharSequence("TITLE_TEXT_KEY", this.B0);
  }
  
  public void f0() {
    super.f0();
    Window window = B0().getWindow();
    if (this.C0) {
      window.setLayout(-1, -1);
      window.setBackgroundDrawable((Drawable)this.F0);
    } else {
      window.setLayout(-2, -2);
      int j = F().getDimensionPixelOffset(e.f.a.f.d.mtrl_calendar_dialog_background_inset);
      Rect rect = new Rect(j, j, j, j);
      window.setBackgroundDrawable((Drawable)new InsetDrawable((Drawable)this.F0, j, j, j, j));
      window.getDecorView().setOnTouchListener((View.OnTouchListener)new e.f.a.f.r.a(B0(), rect));
    } 
    E0();
  }
  
  public void g0() {
    this.x0.w0();
    super.g0();
  }
  
  public final Dialog n(Bundle paramBundle) {
    Dialog dialog = new Dialog(t0(), e(t0()));
    Context context = dialog.getContext();
    this.C0 = g(context);
    int j = e.f.a.f.x.b.a(context, e.f.a.f.b.colorSurface, i.class.getCanonicalName());
    this.F0 = new g(context, null, e.f.a.f.b.materialCalendarStyle, j.Widget_MaterialComponents_MaterialCalendar);
    this.F0.a(context);
    this.F0.a(ColorStateList.valueOf(j));
    this.F0.a(v.l(dialog.getWindow().getDecorView()));
    return dialog;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    Iterator<DialogInterface.OnCancelListener> iterator = this.t0.iterator();
    while (iterator.hasNext())
      ((DialogInterface.OnCancelListener)iterator.next()).onCancel(paramDialogInterface); 
    super.onCancel(paramDialogInterface);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    Iterator<DialogInterface.OnDismissListener> iterator = this.u0.iterator();
    while (iterator.hasNext())
      ((DialogInterface.OnDismissListener)iterator.next()).onDismiss(paramDialogInterface); 
    ViewGroup viewGroup = (ViewGroup)M();
    if (viewGroup != null)
      viewGroup.removeAllViews(); 
    super.onDismiss(paramDialogInterface);
  }
  
  class a implements View.OnClickListener {
    a(i this$0) {}
    
    public void onClick(View param1View) {
      Iterator<j> iterator = i.a(this.c).iterator();
      while (iterator.hasNext())
        ((j)iterator.next()).a(this.c.D0()); 
      this.c.w0();
    }
  }
  
  class b implements View.OnClickListener {
    b(i this$0) {}
    
    public void onClick(View param1View) {
      Iterator<View.OnClickListener> iterator = i.b(this.c).iterator();
      while (iterator.hasNext())
        ((View.OnClickListener)iterator.next()).onClick(param1View); 
      this.c.w0();
    }
  }
  
  class c implements o<S> {
    c(i this$0) {}
    
    public void a(S param1S) {
      Button button;
      boolean bool;
      i.c(this.a);
      if (i.d(this.a).b()) {
        button = i.e(this.a);
        bool = true;
      } else {
        button = i.e(this.a);
        bool = false;
      } 
      button.setEnabled(bool);
    }
  }
  
  class d implements View.OnClickListener {
    d(i this$0) {}
    
    public void onClick(View param1View) {
      i.f(this.c).toggle();
      i i1 = this.c;
      i.a(i1, i.f(i1));
      i.g(this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */