package b.r;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class k0 {
  private static LayoutTransition a;
  
  private static Field b;
  
  private static boolean c;
  
  private static Method d;
  
  private static boolean e;
  
  private static void a(LayoutTransition paramLayoutTransition) {
    if (!e) {
      try {
        d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
        d.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
      } 
      e = true;
    } 
    Method method = d;
    if (method != null)
      try {
        method.invoke(paramLayoutTransition, new Object[0]);
        return;
      } catch (IllegalAccessException illegalAccessException) {
        Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
        return;
      } catch (InvocationTargetException invocationTargetException) {
        Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
        return;
      }  
  }
  
  static void a(ViewGroup paramViewGroup, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   3: astore #4
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore_2
    //   9: aload #4
    //   11: ifnonnull -> 64
    //   14: new b/r/k0$a
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: putstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   24: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   27: iconst_2
    //   28: aconst_null
    //   29: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   32: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   35: iconst_0
    //   36: aconst_null
    //   37: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   40: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   43: iconst_1
    //   44: aconst_null
    //   45: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   48: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   51: iconst_3
    //   52: aconst_null
    //   53: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   56: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   59: iconst_4
    //   60: aconst_null
    //   61: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   64: iload_1
    //   65: ifeq -> 121
    //   68: aload_0
    //   69: invokevirtual getLayoutTransition : ()Landroid/animation/LayoutTransition;
    //   72: astore #4
    //   74: aload #4
    //   76: ifnull -> 109
    //   79: aload #4
    //   81: invokevirtual isRunning : ()Z
    //   84: ifeq -> 92
    //   87: aload #4
    //   89: invokestatic a : (Landroid/animation/LayoutTransition;)V
    //   92: aload #4
    //   94: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   97: if_acmpeq -> 109
    //   100: aload_0
    //   101: getstatic b/r/s.transition_layout_save : I
    //   104: aload #4
    //   106: invokevirtual setTag : (ILjava/lang/Object;)V
    //   109: getstatic b/r/k0.a : Landroid/animation/LayoutTransition;
    //   112: astore #4
    //   114: aload_0
    //   115: aload #4
    //   117: invokevirtual setLayoutTransition : (Landroid/animation/LayoutTransition;)V
    //   120: return
    //   121: aload_0
    //   122: aconst_null
    //   123: invokevirtual setLayoutTransition : (Landroid/animation/LayoutTransition;)V
    //   126: getstatic b/r/k0.c : Z
    //   129: ifne -> 164
    //   132: ldc android/view/ViewGroup
    //   134: ldc 'mLayoutSuppressed'
    //   136: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   139: putstatic b/r/k0.b : Ljava/lang/reflect/Field;
    //   142: getstatic b/r/k0.b : Ljava/lang/reflect/Field;
    //   145: iconst_1
    //   146: invokevirtual setAccessible : (Z)V
    //   149: goto -> 160
    //   152: ldc 'ViewGroupUtilsApi14'
    //   154: ldc 'Failed to access mLayoutSuppressed field by reflection'
    //   156: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   159: pop
    //   160: iconst_1
    //   161: putstatic b/r/k0.c : Z
    //   164: getstatic b/r/k0.b : Ljava/lang/reflect/Field;
    //   167: astore #4
    //   169: iload_3
    //   170: istore_1
    //   171: aload #4
    //   173: ifnull -> 212
    //   176: aload #4
    //   178: aload_0
    //   179: invokevirtual getBoolean : (Ljava/lang/Object;)Z
    //   182: istore_1
    //   183: iload_1
    //   184: ifeq -> 201
    //   187: getstatic b/r/k0.b : Ljava/lang/reflect/Field;
    //   190: aload_0
    //   191: iconst_0
    //   192: invokevirtual setBoolean : (Ljava/lang/Object;Z)V
    //   195: goto -> 201
    //   198: goto -> 204
    //   201: goto -> 212
    //   204: ldc 'ViewGroupUtilsApi14'
    //   206: ldc 'Failed to get mLayoutSuppressed field by reflection'
    //   208: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   211: pop
    //   212: iload_1
    //   213: ifeq -> 220
    //   216: aload_0
    //   217: invokevirtual requestLayout : ()V
    //   220: aload_0
    //   221: getstatic b/r/s.transition_layout_save : I
    //   224: invokevirtual getTag : (I)Ljava/lang/Object;
    //   227: checkcast android/animation/LayoutTransition
    //   230: astore #4
    //   232: aload #4
    //   234: ifnull -> 248
    //   237: aload_0
    //   238: getstatic b/r/s.transition_layout_save : I
    //   241: aconst_null
    //   242: invokevirtual setTag : (ILjava/lang/Object;)V
    //   245: goto -> 114
    //   248: return
    //   249: astore #4
    //   251: goto -> 152
    //   254: astore #4
    //   256: iload_2
    //   257: istore_1
    //   258: goto -> 204
    //   261: astore #4
    //   263: goto -> 198
    // Exception table:
    //   from	to	target	type
    //   132	149	249	java/lang/NoSuchFieldException
    //   176	183	254	java/lang/IllegalAccessException
    //   187	195	261	java/lang/IllegalAccessException
  }
  
  static final class a extends LayoutTransition {
    public boolean isChangingLayout() {
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */