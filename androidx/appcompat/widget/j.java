package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import b.a.c;
import b.a.e;

public final class j {
  private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  
  private static j c;
  
  private m0 a;
  
  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/j
    //   2: monitorenter
    //   3: iload_0
    //   4: aload_1
    //   5: invokestatic a : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   8: astore_1
    //   9: ldc androidx/appcompat/widget/j
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: ldc androidx/appcompat/widget/j
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	14	finally
  }
  
  static void a(Drawable paramDrawable, v0 paramv0, int[] paramArrayOfint) {
    m0.a(paramDrawable, paramv0, paramArrayOfint);
  }
  
  public static j b() {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/j
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/j.c : Landroidx/appcompat/widget/j;
    //   6: ifnonnull -> 12
    //   9: invokestatic c : ()V
    //   12: getstatic androidx/appcompat/widget/j.c : Landroidx/appcompat/widget/j;
    //   15: astore_0
    //   16: ldc androidx/appcompat/widget/j
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: astore_0
    //   22: ldc androidx/appcompat/widget/j
    //   24: monitorexit
    //   25: aload_0
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	21	finally
    //   12	16	21	finally
  }
  
  public static void c() {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/j
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/j.c : Landroidx/appcompat/widget/j;
    //   6: ifnonnull -> 44
    //   9: new androidx/appcompat/widget/j
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic androidx/appcompat/widget/j.c : Landroidx/appcompat/widget/j;
    //   19: getstatic androidx/appcompat/widget/j.c : Landroidx/appcompat/widget/j;
    //   22: invokestatic a : ()Landroidx/appcompat/widget/m0;
    //   25: putfield a : Landroidx/appcompat/widget/m0;
    //   28: getstatic androidx/appcompat/widget/j.c : Landroidx/appcompat/widget/j;
    //   31: getfield a : Landroidx/appcompat/widget/m0;
    //   34: new androidx/appcompat/widget/j$a
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: invokevirtual a : (Landroidx/appcompat/widget/m0$e;)V
    //   44: ldc androidx/appcompat/widget/j
    //   46: monitorexit
    //   47: return
    //   48: astore_0
    //   49: ldc androidx/appcompat/widget/j
    //   51: monitorexit
    //   52: aload_0
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	44	48	finally
  }
  
  public Drawable a(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroidx/appcompat/widget/m0;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual a : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  Drawable a(Context paramContext, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroidx/appcompat/widget/m0;
    //   6: aload_1
    //   7: iload_2
    //   8: iload_3
    //   9: invokevirtual a : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	17	finally
  }
  
  public void a(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroidx/appcompat/widget/m0;
    //   6: aload_1
    //   7: invokevirtual a : (Landroid/content/Context;)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	13	finally
  }
  
  ColorStateList b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroidx/appcompat/widget/m0;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual b : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  class a implements m0.e {
    private final int[] a = new int[] { e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha };
    
    private final int[] b = new int[] { e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha };
    
    private final int[] c = new int[] { e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light };
    
    private final int[] d = new int[] { e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult };
    
    private final int[] e = new int[] { e.abc_tab_indicator_material, e.abc_textfield_search_material };
    
    private final int[] f = new int[] { e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim };
    
    private ColorStateList a(Context param1Context) {
      return b(param1Context, 0);
    }
    
    private void a(Drawable param1Drawable, int param1Int, PorterDuff.Mode param1Mode) {
      Drawable drawable = param1Drawable;
      if (e0.a(param1Drawable))
        drawable = param1Drawable.mutate(); 
      PorterDuff.Mode mode = param1Mode;
      if (param1Mode == null)
        mode = j.a(); 
      drawable.setColorFilter((ColorFilter)j.a(param1Int, mode));
    }
    
    private boolean a(int[] param1ArrayOfint, int param1Int) {
      int j = param1ArrayOfint.length;
      for (int i = 0; i < j; i++) {
        if (param1ArrayOfint[i] == param1Int)
          return true; 
      } 
      return false;
    }
    
    private ColorStateList b(Context param1Context) {
      return b(param1Context, s0.b(param1Context, b.a.a.colorAccent));
    }
    
    private ColorStateList b(Context param1Context, int param1Int) {
      int k = s0.b(param1Context, b.a.a.colorControlHighlight);
      int i = s0.a(param1Context, b.a.a.colorButtonNormal);
      int[] arrayOfInt1 = s0.b;
      int[] arrayOfInt2 = s0.d;
      int j = b.g.f.a.b(k, param1Int);
      int[] arrayOfInt3 = s0.c;
      k = b.g.f.a.b(k, param1Int);
      return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3, s0.f }, new int[] { i, j, k, param1Int });
    }
    
    private ColorStateList c(Context param1Context) {
      return b(param1Context, s0.b(param1Context, b.a.a.colorButtonNormal));
    }
    
    private ColorStateList d(Context param1Context) {
      int[][] arrayOfInt = new int[3][];
      int[] arrayOfInt1 = new int[3];
      ColorStateList colorStateList = s0.c(param1Context, b.a.a.colorSwitchThumbNormal);
      if (colorStateList != null && colorStateList.isStateful()) {
        arrayOfInt[0] = s0.b;
        arrayOfInt1[0] = colorStateList.getColorForState(arrayOfInt[0], 0);
        arrayOfInt[1] = s0.e;
        arrayOfInt1[1] = s0.b(param1Context, b.a.a.colorControlActivated);
        arrayOfInt[2] = s0.f;
        arrayOfInt1[2] = colorStateList.getDefaultColor();
      } else {
        arrayOfInt[0] = s0.b;
        arrayOfInt1[0] = s0.a(param1Context, b.a.a.colorSwitchThumbNormal);
        arrayOfInt[1] = s0.e;
        arrayOfInt1[1] = s0.b(param1Context, b.a.a.colorControlActivated);
        arrayOfInt[2] = s0.f;
        arrayOfInt1[2] = s0.b(param1Context, b.a.a.colorSwitchThumbNormal);
      } 
      return new ColorStateList(arrayOfInt, arrayOfInt1);
    }
    
    public ColorStateList a(Context param1Context, int param1Int) {
      return (param1Int == e.abc_edit_text_material) ? b.a.k.a.a.b(param1Context, c.abc_tint_edittext) : ((param1Int == e.abc_switch_track_mtrl_alpha) ? b.a.k.a.a.b(param1Context, c.abc_tint_switch_track) : ((param1Int == e.abc_switch_thumb_material) ? d(param1Context) : ((param1Int == e.abc_btn_default_mtrl_shape) ? c(param1Context) : ((param1Int == e.abc_btn_borderless_material) ? a(param1Context) : ((param1Int == e.abc_btn_colored_material) ? b(param1Context) : ((param1Int == e.abc_spinner_mtrl_am_alpha || param1Int == e.abc_spinner_textfield_background_material) ? b.a.k.a.a.b(param1Context, c.abc_tint_spinner) : (a(this.b, param1Int) ? s0.c(param1Context, b.a.a.colorControlNormal) : (a(this.e, param1Int) ? b.a.k.a.a.b(param1Context, c.abc_tint_default) : (a(this.f, param1Int) ? b.a.k.a.a.b(param1Context, c.abc_tint_btn_checkable) : ((param1Int == e.abc_seekbar_thumb_material) ? b.a.k.a.a.b(param1Context, c.abc_tint_seek_thumb) : null))))))))));
    }
    
    public PorterDuff.Mode a(int param1Int) {
      return (param1Int == e.abc_switch_thumb_material) ? PorterDuff.Mode.MULTIPLY : null;
    }
    
    public Drawable a(m0 param1m0, Context param1Context, int param1Int) {
      return (Drawable)((param1Int == e.abc_cab_background_top_material) ? new LayerDrawable(new Drawable[] { param1m0.a(param1Context, e.abc_cab_background_internal_bg), param1m0.a(param1Context, e.abc_cab_background_top_mtrl_alpha) }) : null);
    }
    
    public boolean a(Context param1Context, int param1Int, Drawable param1Drawable) {
      // Byte code:
      //   0: invokestatic a : ()Landroid/graphics/PorterDuff$Mode;
      //   3: astore #7
      //   5: aload_0
      //   6: aload_0
      //   7: getfield a : [I
      //   10: iload_2
      //   11: invokespecial a : ([II)Z
      //   14: istore #6
      //   16: ldc_w 16842801
      //   19: istore #4
      //   21: iload #6
      //   23: ifeq -> 39
      //   26: getstatic b/a/a.colorControlNormal : I
      //   29: istore_2
      //   30: iconst_1
      //   31: istore #5
      //   33: iconst_m1
      //   34: istore #4
      //   36: goto -> 127
      //   39: aload_0
      //   40: aload_0
      //   41: getfield c : [I
      //   44: iload_2
      //   45: invokespecial a : ([II)Z
      //   48: ifeq -> 58
      //   51: getstatic b/a/a.colorControlActivated : I
      //   54: istore_2
      //   55: goto -> 30
      //   58: aload_0
      //   59: aload_0
      //   60: getfield d : [I
      //   63: iload_2
      //   64: invokespecial a : ([II)Z
      //   67: ifeq -> 81
      //   70: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
      //   73: astore #7
      //   75: iload #4
      //   77: istore_2
      //   78: goto -> 30
      //   81: iload_2
      //   82: getstatic b/a/e.abc_list_divider_mtrl_alpha : I
      //   85: if_icmpne -> 106
      //   88: ldc_w 16842800
      //   91: istore_2
      //   92: ldc_w 40.8
      //   95: invokestatic round : (F)I
      //   98: istore #4
      //   100: iconst_1
      //   101: istore #5
      //   103: goto -> 127
      //   106: iload_2
      //   107: getstatic b/a/e.abc_dialog_material_background : I
      //   110: if_icmpne -> 119
      //   113: iload #4
      //   115: istore_2
      //   116: goto -> 30
      //   119: iconst_0
      //   120: istore #5
      //   122: iconst_m1
      //   123: istore #4
      //   125: iconst_0
      //   126: istore_2
      //   127: iload #5
      //   129: ifeq -> 178
      //   132: aload_3
      //   133: astore #8
      //   135: aload_3
      //   136: invokestatic a : (Landroid/graphics/drawable/Drawable;)Z
      //   139: ifeq -> 148
      //   142: aload_3
      //   143: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
      //   146: astore #8
      //   148: aload #8
      //   150: aload_1
      //   151: iload_2
      //   152: invokestatic b : (Landroid/content/Context;I)I
      //   155: aload #7
      //   157: invokestatic a : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
      //   160: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
      //   163: iload #4
      //   165: iconst_m1
      //   166: if_icmpeq -> 176
      //   169: aload #8
      //   171: iload #4
      //   173: invokevirtual setAlpha : (I)V
      //   176: iconst_1
      //   177: ireturn
      //   178: iconst_0
      //   179: ireturn
    }
    
    public boolean b(Context param1Context, int param1Int, Drawable param1Drawable) {
      if (param1Int == e.abc_seekbar_track_material) {
        LayerDrawable layerDrawable = (LayerDrawable)param1Drawable;
        a(layerDrawable.findDrawableByLayerId(16908288), s0.b(param1Context, b.a.a.colorControlNormal), j.a());
        param1Drawable = layerDrawable.findDrawableByLayerId(16908303);
        param1Int = b.a.a.colorControlNormal;
        a(param1Drawable, s0.b(param1Context, param1Int), j.a());
        a(layerDrawable.findDrawableByLayerId(16908301), s0.b(param1Context, b.a.a.colorControlActivated), j.a());
        return true;
      } 
      if (param1Int == e.abc_ratingbar_material || param1Int == e.abc_ratingbar_indicator_material || param1Int == e.abc_ratingbar_small_material) {
        LayerDrawable layerDrawable = (LayerDrawable)param1Drawable;
        a(layerDrawable.findDrawableByLayerId(16908288), s0.a(param1Context, b.a.a.colorControlNormal), j.a());
        param1Drawable = layerDrawable.findDrawableByLayerId(16908303);
        param1Int = b.a.a.colorControlActivated;
        a(param1Drawable, s0.b(param1Context, param1Int), j.a());
        a(layerDrawable.findDrawableByLayerId(16908301), s0.b(param1Context, b.a.a.colorControlActivated), j.a());
        return true;
      } 
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */