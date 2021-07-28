package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.x0;
import b.a.a;
import b.a.f;
import b.a.g;
import b.a.j;
import b.g.m.v;

public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {
  private j c;
  
  private ImageView d;
  
  private RadioButton e;
  
  private TextView f;
  
  private CheckBox g;
  
  private TextView h;
  
  private ImageView i;
  
  private ImageView j;
  
  private LinearLayout k;
  
  private Drawable l;
  
  private int m;
  
  private Context n;
  
  private boolean o;
  
  private Drawable p;
  
  private boolean q;
  
  private LayoutInflater r;
  
  private boolean s;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.listMenuViewStyle);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    x0 x0 = x0.a(getContext(), paramAttributeSet, j.MenuView, paramInt, 0);
    this.l = x0.b(j.MenuView_android_itemBackground);
    this.m = x0.g(j.MenuView_android_itemTextAppearance, -1);
    this.o = x0.a(j.MenuView_preserveIconSpacing, false);
    this.n = paramContext;
    this.p = x0.b(j.MenuView_subMenuArrow);
    Resources.Theme theme = paramContext.getTheme();
    paramInt = a.dropDownListViewStyle;
    TypedArray typedArray = theme.obtainStyledAttributes(null, new int[] { 16843049 }, paramInt, 0);
    this.q = typedArray.hasValue(0);
    x0.b();
    typedArray.recycle();
  }
  
  private void a(View paramView) {
    a(paramView, -1);
  }
  
  private void a(View paramView, int paramInt) {
    LinearLayout linearLayout = this.k;
    if (linearLayout != null) {
      linearLayout.addView(paramView, paramInt);
      return;
    } 
    addView(paramView, paramInt);
  }
  
  private void b() {
    this.g = (CheckBox)getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup)this, false);
    a((View)this.g);
  }
  
  private void c() {
    this.d = (ImageView)getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup)this, false);
    a((View)this.d, 0);
  }
  
  private void d() {
    this.e = (RadioButton)getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup)this, false);
    a((View)this.e);
  }
  
  private LayoutInflater getInflater() {
    if (this.r == null)
      this.r = LayoutInflater.from(getContext()); 
    return this.r;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean) {
    ImageView imageView = this.i;
    if (imageView != null) {
      byte b;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public void a(j paramj, int paramInt) {
    this.c = paramj;
    if (paramj.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setTitle(paramj.a(this));
    setCheckable(paramj.isCheckable());
    a(paramj.m(), paramj.d());
    setIcon(paramj.getIcon());
    setEnabled(paramj.isEnabled());
    setSubMenuArrowVisible(paramj.hasSubMenu());
    setContentDescription(paramj.getContentDescription());
  }
  
  public void a(boolean paramBoolean, char paramChar) {
    if (paramBoolean && this.c.m()) {
      paramChar = Character.MIN_VALUE;
    } else {
      paramChar = '\b';
    } 
    if (paramChar == '\000')
      this.h.setText(this.c.e()); 
    if (this.h.getVisibility() != paramChar)
      this.h.setVisibility(paramChar); 
  }
  
  public boolean a() {
    return false;
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect) {
    ImageView imageView = this.j;
    if (imageView != null && imageView.getVisibility() == 0) {
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.j.getLayoutParams();
      paramRect.top += this.j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    } 
  }
  
  public j getItemData() {
    return this.c;
  }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    v.a((View)this, this.l);
    this.f = (TextView)findViewById(f.title);
    int i = this.m;
    if (i != -1)
      this.f.setTextAppearance(this.n, i); 
    this.h = (TextView)findViewById(f.shortcut);
    this.i = (ImageView)findViewById(f.submenuarrow);
    ImageView imageView = this.i;
    if (imageView != null)
      imageView.setImageDrawable(this.p); 
    this.j = (ImageView)findViewById(f.group_divider);
    this.k = (LinearLayout)findViewById(f.content);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.d != null && this.o) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)this.d.getLayoutParams();
      if (layoutParams.height > 0 && layoutParams1.width <= 0)
        layoutParams1.width = layoutParams.height; 
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean) {
    CheckBox checkBox;
    RadioButton radioButton;
    if (!paramBoolean && this.e == null && this.g == null)
      return; 
    if (this.c.i()) {
      if (this.e == null)
        d(); 
      RadioButton radioButton1 = this.e;
      CheckBox checkBox1 = this.g;
    } else {
      if (this.g == null)
        b(); 
      checkBox = this.g;
      radioButton = this.e;
    } 
    if (paramBoolean) {
      checkBox.setChecked(this.c.isChecked());
      if (checkBox.getVisibility() != 0)
        checkBox.setVisibility(0); 
      if (radioButton != null && radioButton.getVisibility() != 8) {
        radioButton.setVisibility(8);
        return;
      } 
    } else {
      checkBox = this.g;
      if (checkBox != null)
        checkBox.setVisibility(8); 
      RadioButton radioButton1 = this.e;
      if (radioButton1 != null)
        radioButton1.setVisibility(8); 
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    CheckBox checkBox;
    if (this.c.i()) {
      if (this.e == null)
        d(); 
      RadioButton radioButton = this.e;
    } else {
      if (this.g == null)
        b(); 
      checkBox = this.g;
    } 
    checkBox.setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean) {
    this.s = paramBoolean;
    this.o = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    ImageView imageView = this.j;
    if (imageView != null) {
      byte b;
      if (!this.q && paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    boolean bool;
    if (this.c.l() || this.s) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && !this.o)
      return; 
    if (this.d == null && paramDrawable == null && !this.o)
      return; 
    if (this.d == null)
      c(); 
    if (paramDrawable != null || this.o) {
      ImageView imageView = this.d;
      if (!bool)
        paramDrawable = null; 
      imageView.setImageDrawable(paramDrawable);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0); 
      return;
    } 
    this.d.setVisibility(8);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    TextView textView;
    byte b;
    if (paramCharSequence != null) {
      this.f.setText(paramCharSequence);
      if (this.f.getVisibility() != 0) {
        textView = this.f;
        b = 0;
      } else {
        return;
      } 
    } else {
      int i = this.f.getVisibility();
      b = 8;
      if (i != 8) {
        textView = this.f;
      } else {
        return;
      } 
    } 
    textView.setVisibility(b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */