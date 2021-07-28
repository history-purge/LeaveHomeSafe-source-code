package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.h1.e;
import com.facebook.react.uimanager.h1.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class m {
  private static final String l = "m";
  
  private final SparseArray<View> a;
  
  private final SparseArray<ViewManager> b;
  
  private final SparseBooleanArray c;
  
  private final a1 d;
  
  private final e.e.o.g0.a e = new e.e.o.g0.a();
  
  private final RootViewManager f;
  
  private final e g = new e();
  
  private final RectF h = new RectF();
  
  private boolean i;
  
  private PopupMenu j;
  
  private HashMap<Integer, Set<Integer>> k;
  
  public m(a1 parama1) {
    this(parama1, new RootViewManager());
  }
  
  public m(a1 parama1, RootViewManager paramRootViewManager) {
    this.d = parama1;
    this.a = new SparseArray();
    this.b = new SparseArray();
    this.c = new SparseBooleanArray();
    this.f = paramRootViewManager;
  }
  
  private static String a(ViewGroup paramViewGroup, ViewGroupManager<ViewGroup> paramViewGroupManager, int[] paramArrayOfint1, w0[] paramArrayOfw0, int[] paramArrayOfint2) {
    StringBuilder stringBuilder = new StringBuilder();
    if (paramViewGroup != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("View tag:");
      stringBuilder1.append(paramViewGroup.getId());
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("  children(");
      stringBuilder1.append(paramViewGroupManager.getChildCount(paramViewGroup));
      stringBuilder1.append("): [\n");
      stringBuilder.append(stringBuilder1.toString());
      int i;
      for (i = 0; i < paramViewGroupManager.getChildCount((T)paramViewGroup); i += 16) {
        int j = 0;
        while (true) {
          int k = i + j;
          if (k < paramViewGroupManager.getChildCount((T)paramViewGroup) && j < 16) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append(paramViewGroupManager.getChildAt(paramViewGroup, k).getId());
            stringBuilder1.append(",");
            stringBuilder.append(stringBuilder1.toString());
            j++;
            continue;
          } 
          break;
        } 
        stringBuilder.append("\n");
      } 
      stringBuilder.append(" ],\n");
    } 
    if (paramArrayOfint1 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("  indicesToRemove(");
      stringBuilder1.append(paramArrayOfint1.length);
      stringBuilder1.append("): [\n");
      stringBuilder.append(stringBuilder1.toString());
      int i;
      for (i = 0; i < paramArrayOfint1.length; i += 16) {
        int j = 0;
        while (true) {
          int k = i + j;
          if (k < paramArrayOfint1.length && j < 16) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append(paramArrayOfint1[k]);
            stringBuilder1.append(",");
            stringBuilder.append(stringBuilder1.toString());
            j++;
            continue;
          } 
          break;
        } 
        stringBuilder.append("\n");
      } 
      stringBuilder.append(" ],\n");
    } 
    if (paramArrayOfw0 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("  viewsToAdd(");
      stringBuilder1.append(paramArrayOfw0.length);
      stringBuilder1.append("): [\n");
      stringBuilder.append(stringBuilder1.toString());
      int i;
      for (i = 0; i < paramArrayOfw0.length; i += 16) {
        int j = 0;
        while (true) {
          int k = i + j;
          if (k < paramArrayOfw0.length && j < 16) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("[");
            stringBuilder1.append((paramArrayOfw0[k]).b);
            stringBuilder1.append(",");
            stringBuilder1.append((paramArrayOfw0[k]).a);
            stringBuilder1.append("],");
            stringBuilder.append(stringBuilder1.toString());
            j++;
            continue;
          } 
          break;
        } 
        stringBuilder.append("\n");
      } 
      stringBuilder.append(" ],\n");
    } 
    if (paramArrayOfint2 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("  tagsToDelete(");
      stringBuilder1.append(paramArrayOfint2.length);
      stringBuilder1.append("): [\n");
      stringBuilder.append(stringBuilder1.toString());
      int i;
      for (i = 0; i < paramArrayOfint2.length; i += 16) {
        int j = 0;
        while (true) {
          int k = i + j;
          if (k < paramArrayOfint2.length && j < 16) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append(paramArrayOfint2[k]);
            stringBuilder1.append(",");
            stringBuilder.append(stringBuilder1.toString());
            j++;
            continue;
          } 
          break;
        } 
        stringBuilder.append("\n");
      } 
      stringBuilder.append(" ]\n");
    } 
    return stringBuilder.toString();
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.i && this.g.a(paramView)) {
      this.g.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  private void a(View paramView, RectF paramRectF) {
    View view1;
    Matrix matrix1;
    Matrix matrix2 = paramView.getMatrix();
    View view3 = paramView;
    if (!matrix2.isIdentity()) {
      matrix1 = matrix2;
    } else {
      while (true) {
        Matrix matrix;
        paramRectF.offset(matrix1.getLeft(), matrix1.getTop());
        ViewParent viewParent = matrix1.getParent();
        if (viewParent instanceof View) {
          view1 = (View)viewParent;
          paramRectF.offset(-view1.getScrollX(), -view1.getScrollY());
          matrix2 = view1.getMatrix();
          View view = view1;
          if (!matrix2.isIdentity()) {
            matrix = matrix2;
          } else {
            continue;
          } 
        } else {
          break;
        } 
        matrix.mapRect(paramRectF);
        view2 = view1;
      } 
      return;
    } 
    view2.mapRect(paramRectF);
    View view2 = view1;
    continue;
  }
  
  private void a(View paramView, int[] paramArrayOfint) {
    this.h.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    a(paramView, this.h);
    paramArrayOfint[0] = Math.round(this.h.left);
    paramArrayOfint[1] = Math.round(this.h.top);
    RectF rectF = this.h;
    paramArrayOfint[2] = Math.round(rectF.right - rectF.left);
    rectF = this.h;
    paramArrayOfint[3] = Math.round(rectF.bottom - rectF.top);
  }
  
  private boolean a(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint == null)
      return false; 
    int j = paramArrayOfint.length;
    for (int i = 0; i < j; i++) {
      if (paramArrayOfint[i] == paramInt)
        return true; 
    } 
    return false;
  }
  
  private Set<Integer> d(int paramInt) {
    if (this.k == null)
      this.k = new HashMap<Integer, Set<Integer>>(); 
    if (!this.k.containsKey(Integer.valueOf(paramInt)))
      this.k.put(Integer.valueOf(paramInt), new HashSet<Integer>()); 
    return this.k.get(Integer.valueOf(paramInt));
  }
  
  private k0 e(int paramInt) {
    View view = (View)this.a.get(paramInt);
    if (view != null)
      return (k0)view.getContext(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Could not find view with tag ");
    stringBuilder.append(paramInt);
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public int a(int paramInt, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Landroid/util/SparseArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast android/view/View
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 38
    //   23: fload_2
    //   24: fload_3
    //   25: aload #4
    //   27: checkcast android/view/ViewGroup
    //   30: invokestatic a : (FFLandroid/view/ViewGroup;)I
    //   33: istore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: iload_1
    //   37: ireturn
    //   38: new java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore #4
    //   47: aload #4
    //   49: ldc_w 'Could not find view with tag '
    //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload #4
    //   58: iload_1
    //   59: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   66: dup
    //   67: aload #4
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: athrow
    //   76: astore #4
    //   78: aload_0
    //   79: monitorexit
    //   80: aload #4
    //   82: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	76	finally
    //   23	34	76	finally
    //   38	76	76	finally
  }
  
  public void a() {
    this.e.a();
  }
  
  public void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield c : Landroid/util/SparseBooleanArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Z
    //   13: ifne -> 53
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_2
    //   24: aload_2
    //   25: ldc_w 'View with tag '
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_2
    //   33: iload_1
    //   34: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_2
    //   39: ldc_w ' is not registered as a root view'
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_2
    //   47: invokevirtual toString : ()Ljava/lang/String;
    //   50: invokestatic assertUnreachable : (Ljava/lang/String;)V
    //   53: aload_0
    //   54: aload_0
    //   55: getfield a : Landroid/util/SparseArray;
    //   58: iload_1
    //   59: invokevirtual get : (I)Ljava/lang/Object;
    //   62: checkcast android/view/View
    //   65: invokevirtual a : (Landroid/view/View;)V
    //   68: aload_0
    //   69: getfield c : Landroid/util/SparseBooleanArray;
    //   72: iload_1
    //   73: invokevirtual delete : (I)V
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore_2
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_2
    //   83: athrow
    // Exception table:
    //   from	to	target	type
    //   2	53	79	finally
    //   53	76	79	finally
  }
  
  public void a(int paramInt1, int paramInt2) {
    View view = (View)this.a.get(paramInt1);
    if (view != null) {
      view.sendAccessibilityEvent(paramInt2);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Could not find view with tag ");
    stringBuilder.append(paramInt1);
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: lconst_0
    //   6: ldc_w 'NativeViewHierarchyManager_updateLayout'
    //   9: invokestatic a : (JLjava/lang/String;)Lcom/facebook/systrace/b$b;
    //   12: astore #7
    //   14: aload #7
    //   16: ldc_w 'parentTag'
    //   19: iload_1
    //   20: invokevirtual a : (Ljava/lang/String;I)Lcom/facebook/systrace/b$b;
    //   23: pop
    //   24: aload #7
    //   26: ldc_w 'tag'
    //   29: iload_2
    //   30: invokevirtual a : (Ljava/lang/String;I)Lcom/facebook/systrace/b$b;
    //   33: pop
    //   34: aload #7
    //   36: invokevirtual a : ()V
    //   39: aload_0
    //   40: iload_2
    //   41: invokevirtual b : (I)Landroid/view/View;
    //   44: astore #7
    //   46: aload #7
    //   48: iload #5
    //   50: ldc_w 1073741824
    //   53: invokestatic makeMeasureSpec : (II)I
    //   56: iload #6
    //   58: ldc_w 1073741824
    //   61: invokestatic makeMeasureSpec : (II)I
    //   64: invokevirtual measure : (II)V
    //   67: aload #7
    //   69: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   72: astore #8
    //   74: aload #8
    //   76: instanceof com/facebook/react/uimanager/f0
    //   79: ifeq -> 89
    //   82: aload #8
    //   84: invokeinterface requestLayout : ()V
    //   89: aload_0
    //   90: getfield c : Landroid/util/SparseBooleanArray;
    //   93: iload_1
    //   94: invokevirtual get : (I)Z
    //   97: ifne -> 143
    //   100: aload_0
    //   101: getfield b : Landroid/util/SparseArray;
    //   104: iload_1
    //   105: invokevirtual get : (I)Ljava/lang/Object;
    //   108: checkcast com/facebook/react/uimanager/ViewManager
    //   111: astore #8
    //   113: aload #8
    //   115: instanceof com/facebook/react/uimanager/f
    //   118: ifeq -> 159
    //   121: aload #8
    //   123: checkcast com/facebook/react/uimanager/f
    //   126: astore #8
    //   128: aload #8
    //   130: ifnull -> 206
    //   133: aload #8
    //   135: invokeinterface needsCustomLayoutForChildren : ()Z
    //   140: ifne -> 206
    //   143: aload_0
    //   144: aload #7
    //   146: iload_3
    //   147: iload #4
    //   149: iload #5
    //   151: iload #6
    //   153: invokespecial a : (Landroid/view/View;IIII)V
    //   156: goto -> 206
    //   159: new java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: astore #7
    //   168: aload #7
    //   170: ldc_w 'Trying to use view with tag '
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload #7
    //   179: iload_1
    //   180: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: aload #7
    //   186: ldc_w ' as a parent, but its Manager doesn't implement IViewManagerWithChildren'
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: new com/facebook/react/uimanager/g
    //   196: dup
    //   197: aload #7
    //   199: invokevirtual toString : ()Ljava/lang/String;
    //   202: invokespecial <init> : (Ljava/lang/String;)V
    //   205: athrow
    //   206: lconst_0
    //   207: invokestatic a : (J)V
    //   210: aload_0
    //   211: monitorexit
    //   212: return
    //   213: astore #7
    //   215: lconst_0
    //   216: invokestatic a : (J)V
    //   219: aload #7
    //   221: athrow
    //   222: astore #7
    //   224: aload_0
    //   225: monitorexit
    //   226: aload #7
    //   228: athrow
    // Exception table:
    //   from	to	target	type
    //   2	39	222	finally
    //   39	89	213	finally
    //   89	128	213	finally
    //   133	143	213	finally
    //   143	156	213	finally
    //   159	206	213	finally
    //   206	210	222	finally
    //   215	222	222	finally
  }
  
  @Deprecated
  public void a(int paramInt1, int paramInt2, ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Landroid/util/SparseArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast android/view/View
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 38
    //   23: aload_0
    //   24: iload_1
    //   25: invokevirtual c : (I)Lcom/facebook/react/uimanager/ViewManager;
    //   28: aload #4
    //   30: iload_2
    //   31: aload_3
    //   32: invokevirtual receiveCommand : (Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: new java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore_3
    //   46: aload_3
    //   47: ldc_w 'Trying to send command to a non-existing view with tag ['
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload_3
    //   55: iload_1
    //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload_3
    //   61: ldc_w '] and command '
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: iload_2
    //   70: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: new com/facebook/react/bridge/RetryableMountingLayerException
    //   77: dup
    //   78: aload_3
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokespecial <init> : (Ljava/lang/String;)V
    //   85: athrow
    //   86: astore_3
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_3
    //   90: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	86	finally
    //   23	35	86	finally
    //   38	86	86	finally
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifne -> 18
    //   6: aload_0
    //   7: getfield e : Le/e/o/g0/a;
    //   10: iload_2
    //   11: aconst_null
    //   12: invokevirtual a : (ILandroid/view/ViewParent;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: getfield a : Landroid/util/SparseArray;
    //   22: iload_1
    //   23: invokevirtual get : (I)Ljava/lang/Object;
    //   26: checkcast android/view/View
    //   29: astore #4
    //   31: iload_2
    //   32: iload_1
    //   33: if_icmpeq -> 60
    //   36: aload #4
    //   38: instanceof android/view/ViewParent
    //   41: ifeq -> 60
    //   44: aload_0
    //   45: getfield e : Le/e/o/g0/a;
    //   48: iload_2
    //   49: aload #4
    //   51: checkcast android/view/ViewParent
    //   54: invokevirtual a : (ILandroid/view/ViewParent;)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload_0
    //   61: getfield c : Landroid/util/SparseBooleanArray;
    //   64: iload_1
    //   65: invokevirtual get : (I)Z
    //   68: ifeq -> 113
    //   71: new java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #5
    //   80: aload #5
    //   82: ldc_w 'Cannot block native responder on '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload #5
    //   91: iload_1
    //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload #5
    //   98: ldc_w ' that is a root view'
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #5
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: invokestatic assertUnreachable : (Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield e : Le/e/o/g0/a;
    //   117: iload_2
    //   118: aload #4
    //   120: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   123: invokevirtual a : (ILandroid/view/ViewParent;)V
    //   126: aload_0
    //   127: monitorexit
    //   128: return
    //   129: astore #4
    //   131: aload_0
    //   132: monitorexit
    //   133: aload #4
    //   135: athrow
    // Exception table:
    //   from	to	target	type
    //   6	15	129	finally
    //   18	31	129	finally
    //   36	57	129	finally
    //   60	113	129	finally
    //   113	126	129	finally
  }
  
  public void a(int paramInt, View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: aload_2
    //   5: invokevirtual b : (ILandroid/view/View;)V
    //   8: aload_0
    //   9: monitorexit
    //   10: return
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
  }
  
  public void a(int paramInt, ReadableArray paramReadableArray, Callback paramCallback1, Callback paramCallback2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Landroid/util/SparseArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast android/view/View
    //   16: astore #5
    //   18: aload #5
    //   20: ifnonnull -> 66
    //   23: new java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore_2
    //   31: aload_2
    //   32: ldc_w 'Can't display popup. Could not find view with tag '
    //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_2
    //   40: iload_1
    //   41: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload #4
    //   47: iconst_1
    //   48: anewarray java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_2
    //   54: invokevirtual toString : ()Ljava/lang/String;
    //   57: aastore
    //   58: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   63: aload_0
    //   64: monitorexit
    //   65: return
    //   66: aload_0
    //   67: new android/widget/PopupMenu
    //   70: dup
    //   71: aload_0
    //   72: iload_1
    //   73: invokespecial e : (I)Lcom/facebook/react/uimanager/k0;
    //   76: aload #5
    //   78: invokespecial <init> : (Landroid/content/Context;Landroid/view/View;)V
    //   81: putfield j : Landroid/widget/PopupMenu;
    //   84: aload_0
    //   85: getfield j : Landroid/widget/PopupMenu;
    //   88: invokevirtual getMenu : ()Landroid/view/Menu;
    //   91: astore #4
    //   93: iconst_0
    //   94: istore_1
    //   95: iload_1
    //   96: aload_2
    //   97: invokeinterface size : ()I
    //   102: if_icmpge -> 130
    //   105: aload #4
    //   107: iconst_0
    //   108: iconst_0
    //   109: iload_1
    //   110: aload_2
    //   111: iload_1
    //   112: invokeinterface getString : (I)Ljava/lang/String;
    //   117: invokeinterface add : (IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    //   122: pop
    //   123: iload_1
    //   124: iconst_1
    //   125: iadd
    //   126: istore_1
    //   127: goto -> 95
    //   130: new com/facebook/react/uimanager/m$b
    //   133: dup
    //   134: aload_3
    //   135: aconst_null
    //   136: invokespecial <init> : (Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/uimanager/m$a;)V
    //   139: astore_2
    //   140: aload_0
    //   141: getfield j : Landroid/widget/PopupMenu;
    //   144: aload_2
    //   145: invokevirtual setOnMenuItemClickListener : (Landroid/widget/PopupMenu$OnMenuItemClickListener;)V
    //   148: aload_0
    //   149: getfield j : Landroid/widget/PopupMenu;
    //   152: aload_2
    //   153: invokevirtual setOnDismissListener : (Landroid/widget/PopupMenu$OnDismissListener;)V
    //   156: aload_0
    //   157: getfield j : Landroid/widget/PopupMenu;
    //   160: invokevirtual show : ()V
    //   163: aload_0
    //   164: monitorexit
    //   165: return
    //   166: astore_2
    //   167: aload_0
    //   168: monitorexit
    //   169: goto -> 174
    //   172: aload_2
    //   173: athrow
    //   174: goto -> 172
    // Exception table:
    //   from	to	target	type
    //   2	18	166	finally
    //   23	63	166	finally
    //   66	93	166	finally
    //   95	123	166	finally
    //   130	163	166	finally
  }
  
  public void a(int paramInt, c0 paramc0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: iload_1
    //   7: invokevirtual c : (I)Lcom/facebook/react/uimanager/ViewManager;
    //   10: astore_3
    //   11: aload_0
    //   12: iload_1
    //   13: invokevirtual b : (I)Landroid/view/View;
    //   16: astore #4
    //   18: aload_2
    //   19: ifnull -> 72
    //   22: aload_3
    //   23: aload #4
    //   25: aload_2
    //   26: invokevirtual updateProperties : (Landroid/view/View;Lcom/facebook/react/uimanager/c0;)V
    //   29: goto -> 72
    //   32: astore_2
    //   33: getstatic com/facebook/react/uimanager/m.l : Ljava/lang/String;
    //   36: astore_3
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #4
    //   46: aload #4
    //   48: ldc_w 'Unable to update properties for view tag '
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload #4
    //   57: iload_1
    //   58: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_3
    //   63: aload #4
    //   65: invokevirtual toString : ()Ljava/lang/String;
    //   68: aload_2
    //   69: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: astore_2
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_2
    //   79: athrow
    // Exception table:
    //   from	to	target	type
    //   2	5	75	finally
    //   5	18	32	com/facebook/react/uimanager/g
    //   5	18	75	finally
    //   22	29	32	com/facebook/react/uimanager/g
    //   22	29	75	finally
    //   33	72	75	finally
  }
  
  public void a(int paramInt, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: iload_1
    //   7: invokevirtual c : (I)Lcom/facebook/react/uimanager/ViewManager;
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual b : (I)Landroid/view/View;
    //   15: aload_2
    //   16: invokevirtual updateExtraData : (Landroid/view/View;Ljava/lang/Object;)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  public void a(int paramInt, String paramString, ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Landroid/util/SparseArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast android/view/View
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 38
    //   23: aload_0
    //   24: iload_1
    //   25: invokevirtual c : (I)Lcom/facebook/react/uimanager/ViewManager;
    //   28: aload #4
    //   30: aload_2
    //   31: aload_3
    //   32: invokevirtual receiveCommand : (Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: new java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore_3
    //   46: aload_3
    //   47: ldc_w 'Trying to send command to a non-existing view with tag ['
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload_3
    //   55: iload_1
    //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload_3
    //   61: ldc_w '] and command '
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: aload_2
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: new com/facebook/react/bridge/RetryableMountingLayerException
    //   77: dup
    //   78: aload_3
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokespecial <init> : (Ljava/lang/String;)V
    //   85: athrow
    //   86: astore_2
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_2
    //   90: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	86	finally
    //   23	35	86	finally
    //   38	86	86	finally
  }
  
  public void a(int paramInt, int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Landroid/util/SparseArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast android/view/View
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 121
    //   23: aload #4
    //   25: invokestatic a : (Landroid/view/View;)Lcom/facebook/react/uimanager/f0;
    //   28: checkcast android/view/View
    //   31: astore #5
    //   33: aload #5
    //   35: ifnull -> 79
    //   38: aload_0
    //   39: aload #5
    //   41: aload_2
    //   42: invokespecial a : (Landroid/view/View;[I)V
    //   45: aload_2
    //   46: iconst_0
    //   47: iaload
    //   48: istore_1
    //   49: aload_2
    //   50: iconst_1
    //   51: iaload
    //   52: istore_3
    //   53: aload_0
    //   54: aload #4
    //   56: aload_2
    //   57: invokespecial a : (Landroid/view/View;[I)V
    //   60: aload_2
    //   61: iconst_0
    //   62: aload_2
    //   63: iconst_0
    //   64: iaload
    //   65: iload_1
    //   66: isub
    //   67: iastore
    //   68: aload_2
    //   69: iconst_1
    //   70: aload_2
    //   71: iconst_1
    //   72: iaload
    //   73: iload_3
    //   74: isub
    //   75: iastore
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: new java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: astore_2
    //   87: aload_2
    //   88: ldc_w 'Native view '
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_2
    //   96: iload_1
    //   97: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_2
    //   102: ldc_w ' is no longer on screen'
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: new com/facebook/react/uimanager/o
    //   112: dup
    //   113: aload_2
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: invokespecial <init> : (Ljava/lang/String;)V
    //   120: athrow
    //   121: new java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore_2
    //   129: aload_2
    //   130: ldc_w 'No native view for '
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_2
    //   138: iload_1
    //   139: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_2
    //   144: ldc_w ' currently exists'
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: new com/facebook/react/uimanager/o
    //   154: dup
    //   155: aload_2
    //   156: invokevirtual toString : ()Ljava/lang/String;
    //   159: invokespecial <init> : (Ljava/lang/String;)V
    //   162: athrow
    //   163: astore_2
    //   164: aload_0
    //   165: monitorexit
    //   166: aload_2
    //   167: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	163	finally
    //   23	33	163	finally
    //   38	45	163	finally
    //   53	60	163	finally
    //   79	121	163	finally
    //   121	163	163	finally
  }
  
  public void a(int paramInt, int[] paramArrayOfint1, w0[] paramArrayOfw0, int[] paramArrayOfint2) {
    // Byte code:
    //   0: aload_2
    //   1: astore #9
    //   3: aload_0
    //   4: monitorenter
    //   5: invokestatic assertOnUiThread : ()V
    //   8: aload_0
    //   9: iload_1
    //   10: invokespecial d : (I)Ljava/util/Set;
    //   13: astore #12
    //   15: aload_0
    //   16: getfield a : Landroid/util/SparseArray;
    //   19: iload_1
    //   20: invokevirtual get : (I)Ljava/lang/Object;
    //   23: checkcast android/view/ViewGroup
    //   26: astore #10
    //   28: aload_0
    //   29: iload_1
    //   30: invokevirtual c : (I)Lcom/facebook/react/uimanager/ViewManager;
    //   33: checkcast com/facebook/react/uimanager/ViewGroupManager
    //   36: astore #11
    //   38: aload #10
    //   40: ifnull -> 816
    //   43: aload #11
    //   45: aload #10
    //   47: invokevirtual getChildCount : (Landroid/view/ViewGroup;)I
    //   50: istore #5
    //   52: aload #9
    //   54: ifnull -> 899
    //   57: aload #9
    //   59: arraylength
    //   60: iconst_1
    //   61: isub
    //   62: istore #6
    //   64: iload #6
    //   66: iflt -> 899
    //   69: aload #9
    //   71: iload #6
    //   73: iaload
    //   74: istore #7
    //   76: iload #7
    //   78: iflt -> 335
    //   81: iload #7
    //   83: aload #11
    //   85: aload #10
    //   87: invokevirtual getChildCount : (Landroid/view/ViewGroup;)I
    //   90: if_icmplt -> 195
    //   93: aload_0
    //   94: getfield c : Landroid/util/SparseBooleanArray;
    //   97: iload_1
    //   98: invokevirtual get : (I)Z
    //   101: ifeq -> 121
    //   104: aload #11
    //   106: aload #10
    //   108: invokevirtual getChildCount : (Landroid/view/ViewGroup;)I
    //   111: istore #5
    //   113: iload #5
    //   115: ifne -> 121
    //   118: aload_0
    //   119: monitorexit
    //   120: return
    //   121: new java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore_2
    //   129: aload_2
    //   130: ldc_w 'Trying to remove a view index above child count '
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_2
    //   138: iload #7
    //   140: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_2
    //   145: ldc_w ' view tag: '
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload_2
    //   153: iload_1
    //   154: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_2
    //   159: ldc_w '\\n detail: '
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload_2
    //   167: aload #10
    //   169: aload #11
    //   171: aload #9
    //   173: aload_3
    //   174: aload #4
    //   176: invokestatic a : (Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ViewGroupManager;[I[Lcom/facebook/react/uimanager/w0;[I)Ljava/lang/String;
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: new com/facebook/react/uimanager/g
    //   186: dup
    //   187: aload_2
    //   188: invokevirtual toString : ()Ljava/lang/String;
    //   191: invokespecial <init> : (Ljava/lang/String;)V
    //   194: athrow
    //   195: iload #7
    //   197: iload #5
    //   199: if_icmpge -> 261
    //   202: aload #11
    //   204: aload #10
    //   206: iload #7
    //   208: invokevirtual getChildAt : (Landroid/view/ViewGroup;I)Landroid/view/View;
    //   211: astore #13
    //   213: aload_0
    //   214: getfield i : Z
    //   217: ifeq -> 249
    //   220: aload_0
    //   221: getfield g : Lcom/facebook/react/uimanager/h1/e;
    //   224: aload #13
    //   226: invokevirtual a : (Landroid/view/View;)Z
    //   229: ifeq -> 249
    //   232: aload_0
    //   233: aload #4
    //   235: aload #13
    //   237: invokevirtual getId : ()I
    //   240: invokespecial a : ([II)Z
    //   243: ifeq -> 249
    //   246: goto -> 886
    //   249: aload #11
    //   251: aload #10
    //   253: iload #7
    //   255: invokevirtual removeViewAt : (Landroid/view/ViewGroup;I)V
    //   258: goto -> 886
    //   261: new java/lang/StringBuilder
    //   264: dup
    //   265: invokespecial <init> : ()V
    //   268: astore_2
    //   269: aload_2
    //   270: ldc_w 'Trying to remove an out of order view index:'
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload_2
    //   278: iload #7
    //   280: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: aload_2
    //   285: ldc_w ' view tag: '
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_2
    //   293: iload_1
    //   294: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: aload_2
    //   299: ldc_w '\\n detail: '
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload_2
    //   307: aload #10
    //   309: aload #11
    //   311: aload #9
    //   313: aload_3
    //   314: aload #4
    //   316: invokestatic a : (Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ViewGroupManager;[I[Lcom/facebook/react/uimanager/w0;[I)Ljava/lang/String;
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: new com/facebook/react/uimanager/g
    //   326: dup
    //   327: aload_2
    //   328: invokevirtual toString : ()Ljava/lang/String;
    //   331: invokespecial <init> : (Ljava/lang/String;)V
    //   334: athrow
    //   335: new java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial <init> : ()V
    //   342: astore_2
    //   343: aload_2
    //   344: ldc_w 'Trying to remove a negative view index:'
    //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: pop
    //   351: aload_2
    //   352: iload #7
    //   354: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: aload_2
    //   359: ldc_w ' view tag: '
    //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: pop
    //   366: aload_2
    //   367: iload_1
    //   368: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   371: pop
    //   372: aload_2
    //   373: ldc_w '\\n detail: '
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: pop
    //   380: aload_2
    //   381: aload #10
    //   383: aload #11
    //   385: aload #9
    //   387: aload_3
    //   388: aload #4
    //   390: invokestatic a : (Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ViewGroupManager;[I[Lcom/facebook/react/uimanager/w0;[I)Ljava/lang/String;
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: new com/facebook/react/uimanager/g
    //   400: dup
    //   401: aload_2
    //   402: invokevirtual toString : ()Ljava/lang/String;
    //   405: invokespecial <init> : (Ljava/lang/String;)V
    //   408: athrow
    //   409: iload #5
    //   411: aload #4
    //   413: arraylength
    //   414: if_icmpge -> 919
    //   417: aload #4
    //   419: iload #5
    //   421: iaload
    //   422: istore #6
    //   424: aload_0
    //   425: getfield a : Landroid/util/SparseArray;
    //   428: iload #6
    //   430: invokevirtual get : (I)Ljava/lang/Object;
    //   433: checkcast android/view/View
    //   436: astore #9
    //   438: aload #9
    //   440: ifnull -> 513
    //   443: aload_0
    //   444: getfield i : Z
    //   447: ifeq -> 504
    //   450: aload_0
    //   451: getfield g : Lcom/facebook/react/uimanager/h1/e;
    //   454: aload #9
    //   456: invokevirtual a : (Landroid/view/View;)Z
    //   459: ifeq -> 504
    //   462: aload #12
    //   464: iload #6
    //   466: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   469: invokeinterface add : (Ljava/lang/Object;)Z
    //   474: pop
    //   475: aload_0
    //   476: getfield g : Lcom/facebook/react/uimanager/h1/e;
    //   479: aload #9
    //   481: new com/facebook/react/uimanager/m$a
    //   484: dup
    //   485: aload_0
    //   486: aload #11
    //   488: aload #10
    //   490: aload #9
    //   492: aload #12
    //   494: iload_1
    //   495: invokespecial <init> : (Lcom/facebook/react/uimanager/m;Lcom/facebook/react/uimanager/ViewGroupManager;Landroid/view/ViewGroup;Landroid/view/View;Ljava/util/Set;I)V
    //   498: invokevirtual a : (Landroid/view/View;Lcom/facebook/react/uimanager/h1/f;)V
    //   501: goto -> 910
    //   504: aload_0
    //   505: aload #9
    //   507: invokevirtual a : (Landroid/view/View;)V
    //   510: goto -> 910
    //   513: new java/lang/StringBuilder
    //   516: dup
    //   517: invokespecial <init> : ()V
    //   520: astore #9
    //   522: aload #9
    //   524: ldc_w 'Trying to destroy unknown view tag: '
    //   527: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: pop
    //   531: aload #9
    //   533: iload #6
    //   535: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   538: pop
    //   539: aload #9
    //   541: ldc_w '\\n detail: '
    //   544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: pop
    //   548: aload #9
    //   550: aload #10
    //   552: aload #11
    //   554: aload_2
    //   555: aload_3
    //   556: aload #4
    //   558: invokestatic a : (Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ViewGroupManager;[I[Lcom/facebook/react/uimanager/w0;[I)Ljava/lang/String;
    //   561: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: pop
    //   565: new com/facebook/react/uimanager/g
    //   568: dup
    //   569: aload #9
    //   571: invokevirtual toString : ()Ljava/lang/String;
    //   574: invokespecial <init> : (Ljava/lang/String;)V
    //   577: athrow
    //   578: iload #6
    //   580: aload_3
    //   581: arraylength
    //   582: if_icmpge -> 791
    //   585: aload_3
    //   586: iload #6
    //   588: aaload
    //   589: astore #9
    //   591: aload_0
    //   592: getfield a : Landroid/util/SparseArray;
    //   595: aload #9
    //   597: getfield a : I
    //   600: invokevirtual get : (I)Ljava/lang/Object;
    //   603: checkcast android/view/View
    //   606: astore #13
    //   608: aload #13
    //   610: ifnull -> 723
    //   613: aload #9
    //   615: getfield b : I
    //   618: istore #8
    //   620: aload #12
    //   622: invokeinterface isEmpty : ()Z
    //   627: ifne -> 703
    //   630: iconst_0
    //   631: istore #5
    //   633: iconst_0
    //   634: istore #7
    //   636: iload #5
    //   638: istore #8
    //   640: iload #5
    //   642: aload #10
    //   644: invokevirtual getChildCount : ()I
    //   647: if_icmpge -> 703
    //   650: iload #7
    //   652: aload #9
    //   654: getfield b : I
    //   657: if_icmpne -> 667
    //   660: iload #5
    //   662: istore #8
    //   664: goto -> 703
    //   667: iload #7
    //   669: istore #8
    //   671: aload #12
    //   673: aload #10
    //   675: iload #5
    //   677: invokevirtual getChildAt : (I)Landroid/view/View;
    //   680: invokevirtual getId : ()I
    //   683: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   686: invokeinterface contains : (Ljava/lang/Object;)Z
    //   691: ifne -> 929
    //   694: iload #7
    //   696: iconst_1
    //   697: iadd
    //   698: istore #8
    //   700: goto -> 929
    //   703: aload #11
    //   705: aload #10
    //   707: aload #13
    //   709: iload #8
    //   711: invokevirtual addView : (Landroid/view/ViewGroup;Landroid/view/View;I)V
    //   714: iload #6
    //   716: iconst_1
    //   717: iadd
    //   718: istore #6
    //   720: goto -> 578
    //   723: new java/lang/StringBuilder
    //   726: dup
    //   727: invokespecial <init> : ()V
    //   730: astore #12
    //   732: aload #12
    //   734: ldc_w 'Trying to add unknown view tag: '
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: pop
    //   741: aload #12
    //   743: aload #9
    //   745: getfield a : I
    //   748: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   751: pop
    //   752: aload #12
    //   754: ldc_w '\\n detail: '
    //   757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: aload #12
    //   763: aload #10
    //   765: aload #11
    //   767: aload_2
    //   768: aload_3
    //   769: aload #4
    //   771: invokestatic a : (Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ViewGroupManager;[I[Lcom/facebook/react/uimanager/w0;[I)Ljava/lang/String;
    //   774: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: pop
    //   778: new com/facebook/react/uimanager/g
    //   781: dup
    //   782: aload #12
    //   784: invokevirtual toString : ()Ljava/lang/String;
    //   787: invokespecial <init> : (Ljava/lang/String;)V
    //   790: athrow
    //   791: aload #12
    //   793: invokeinterface isEmpty : ()Z
    //   798: ifeq -> 813
    //   801: aload_0
    //   802: getfield k : Ljava/util/HashMap;
    //   805: iload_1
    //   806: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   809: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   812: pop
    //   813: aload_0
    //   814: monitorexit
    //   815: return
    //   816: new java/lang/StringBuilder
    //   819: dup
    //   820: invokespecial <init> : ()V
    //   823: astore_2
    //   824: aload_2
    //   825: ldc_w 'Trying to manageChildren view with tag '
    //   828: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: pop
    //   832: aload_2
    //   833: iload_1
    //   834: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   837: pop
    //   838: aload_2
    //   839: ldc_w ' which doesn't exist\\n detail: '
    //   842: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   845: pop
    //   846: aload_2
    //   847: aload #10
    //   849: aload #11
    //   851: aload #9
    //   853: aload_3
    //   854: aload #4
    //   856: invokestatic a : (Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ViewGroupManager;[I[Lcom/facebook/react/uimanager/w0;[I)Ljava/lang/String;
    //   859: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   862: pop
    //   863: new com/facebook/react/uimanager/g
    //   866: dup
    //   867: aload_2
    //   868: invokevirtual toString : ()Ljava/lang/String;
    //   871: invokespecial <init> : (Ljava/lang/String;)V
    //   874: athrow
    //   875: astore_2
    //   876: aload_0
    //   877: monitorexit
    //   878: goto -> 883
    //   881: aload_2
    //   882: athrow
    //   883: goto -> 881
    //   886: iload #6
    //   888: iconst_1
    //   889: isub
    //   890: istore #6
    //   892: iload #7
    //   894: istore #5
    //   896: goto -> 64
    //   899: aload #4
    //   901: ifnull -> 919
    //   904: iconst_0
    //   905: istore #5
    //   907: goto -> 409
    //   910: iload #5
    //   912: iconst_1
    //   913: iadd
    //   914: istore #5
    //   916: goto -> 409
    //   919: aload_3
    //   920: ifnull -> 791
    //   923: iconst_0
    //   924: istore #6
    //   926: goto -> 578
    //   929: iload #5
    //   931: iconst_1
    //   932: iadd
    //   933: istore #5
    //   935: iload #8
    //   937: istore #7
    //   939: goto -> 636
    // Exception table:
    //   from	to	target	type
    //   5	38	875	finally
    //   43	52	875	finally
    //   57	64	875	finally
    //   81	113	875	finally
    //   121	195	875	finally
    //   202	246	875	finally
    //   249	258	875	finally
    //   261	335	875	finally
    //   335	409	875	finally
    //   409	417	875	finally
    //   424	438	875	finally
    //   443	501	875	finally
    //   504	510	875	finally
    //   513	578	875	finally
    //   578	585	875	finally
    //   591	608	875	finally
    //   613	620	875	finally
    //   620	630	875	finally
    //   640	660	875	finally
    //   671	694	875	finally
    //   703	714	875	finally
    //   723	791	875	finally
    //   791	813	875	finally
    //   816	875	875	finally
  }
  
  protected void a(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_1
    //   6: ifnonnull -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: getfield b : Landroid/util/SparseArray;
    //   16: aload_1
    //   17: invokevirtual getId : ()I
    //   20: invokevirtual get : (I)Ljava/lang/Object;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull -> 31
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: aload_0
    //   32: getfield c : Landroid/util/SparseBooleanArray;
    //   35: aload_1
    //   36: invokevirtual getId : ()I
    //   39: invokevirtual get : (I)Z
    //   42: ifne -> 57
    //   45: aload_0
    //   46: aload_1
    //   47: invokevirtual getId : ()I
    //   50: invokevirtual c : (I)Lcom/facebook/react/uimanager/ViewManager;
    //   53: aload_1
    //   54: invokevirtual onDropViewInstance : (Landroid/view/View;)V
    //   57: aload_0
    //   58: getfield b : Landroid/util/SparseArray;
    //   61: aload_1
    //   62: invokevirtual getId : ()I
    //   65: invokevirtual get : (I)Ljava/lang/Object;
    //   68: checkcast com/facebook/react/uimanager/ViewManager
    //   71: astore #4
    //   73: aload_1
    //   74: instanceof android/view/ViewGroup
    //   77: ifeq -> 169
    //   80: aload #4
    //   82: instanceof com/facebook/react/uimanager/ViewGroupManager
    //   85: ifeq -> 169
    //   88: aload_1
    //   89: checkcast android/view/ViewGroup
    //   92: astore_3
    //   93: aload #4
    //   95: checkcast com/facebook/react/uimanager/ViewGroupManager
    //   98: astore #4
    //   100: aload #4
    //   102: aload_3
    //   103: invokevirtual getChildCount : (Landroid/view/ViewGroup;)I
    //   106: iconst_1
    //   107: isub
    //   108: istore_2
    //   109: iload_2
    //   110: iflt -> 163
    //   113: aload #4
    //   115: aload_3
    //   116: iload_2
    //   117: invokevirtual getChildAt : (Landroid/view/ViewGroup;I)Landroid/view/View;
    //   120: astore #5
    //   122: aload #5
    //   124: ifnonnull -> 139
    //   127: getstatic com/facebook/react/uimanager/m.l : Ljava/lang/String;
    //   130: ldc_w 'Unable to drop null child view'
    //   133: invokestatic b : (Ljava/lang/String;Ljava/lang/String;)V
    //   136: goto -> 205
    //   139: aload_0
    //   140: getfield a : Landroid/util/SparseArray;
    //   143: aload #5
    //   145: invokevirtual getId : ()I
    //   148: invokevirtual get : (I)Ljava/lang/Object;
    //   151: ifnull -> 205
    //   154: aload_0
    //   155: aload #5
    //   157: invokevirtual a : (Landroid/view/View;)V
    //   160: goto -> 205
    //   163: aload #4
    //   165: aload_3
    //   166: invokevirtual removeAllViews : (Landroid/view/ViewGroup;)V
    //   169: aload_0
    //   170: getfield a : Landroid/util/SparseArray;
    //   173: aload_1
    //   174: invokevirtual getId : ()I
    //   177: invokevirtual remove : (I)V
    //   180: aload_0
    //   181: getfield b : Landroid/util/SparseArray;
    //   184: aload_1
    //   185: invokevirtual getId : ()I
    //   188: invokevirtual remove : (I)V
    //   191: aload_0
    //   192: monitorexit
    //   193: return
    //   194: astore_1
    //   195: aload_0
    //   196: monitorexit
    //   197: goto -> 202
    //   200: aload_1
    //   201: athrow
    //   202: goto -> 200
    //   205: iload_2
    //   206: iconst_1
    //   207: isub
    //   208: istore_2
    //   209: goto -> 109
    // Exception table:
    //   from	to	target	type
    //   2	5	194	finally
    //   12	24	194	finally
    //   31	57	194	finally
    //   57	109	194	finally
    //   113	122	194	finally
    //   127	136	194	finally
    //   139	160	194	finally
    //   163	169	194	finally
    //   169	191	194	finally
  }
  
  void a(ReadableMap paramReadableMap, Callback paramCallback) {
    this.g.a(paramReadableMap, paramCallback);
  }
  
  public void a(k0 paramk0, int paramInt, String paramString, c0 paramc0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: lconst_0
    //   6: ldc_w 'NativeViewHierarchyManager_createView'
    //   9: invokestatic a : (JLjava/lang/String;)Lcom/facebook/systrace/b$b;
    //   12: astore #5
    //   14: aload #5
    //   16: ldc_w 'tag'
    //   19: iload_2
    //   20: invokevirtual a : (Ljava/lang/String;I)Lcom/facebook/systrace/b$b;
    //   23: pop
    //   24: aload #5
    //   26: ldc_w 'className'
    //   29: aload_3
    //   30: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Lcom/facebook/systrace/b$b;
    //   33: pop
    //   34: aload #5
    //   36: invokevirtual a : ()V
    //   39: aload_0
    //   40: getfield d : Lcom/facebook/react/uimanager/a1;
    //   43: aload_3
    //   44: invokevirtual a : (Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    //   47: astore_3
    //   48: aload_3
    //   49: aload_1
    //   50: aconst_null
    //   51: aconst_null
    //   52: aload_0
    //   53: getfield e : Le/e/o/g0/a;
    //   56: invokevirtual createView : (Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/c0;Lcom/facebook/react/uimanager/j0;Le/e/o/g0/a;)Landroid/view/View;
    //   59: astore_1
    //   60: aload_0
    //   61: getfield a : Landroid/util/SparseArray;
    //   64: iload_2
    //   65: aload_1
    //   66: invokevirtual put : (ILjava/lang/Object;)V
    //   69: aload_0
    //   70: getfield b : Landroid/util/SparseArray;
    //   73: iload_2
    //   74: aload_3
    //   75: invokevirtual put : (ILjava/lang/Object;)V
    //   78: aload_1
    //   79: iload_2
    //   80: invokevirtual setId : (I)V
    //   83: aload #4
    //   85: ifnull -> 95
    //   88: aload_3
    //   89: aload_1
    //   90: aload #4
    //   92: invokevirtual updateProperties : (Landroid/view/View;Lcom/facebook/react/uimanager/c0;)V
    //   95: lconst_0
    //   96: invokestatic a : (J)V
    //   99: aload_0
    //   100: monitorexit
    //   101: return
    //   102: astore_1
    //   103: lconst_0
    //   104: invokestatic a : (J)V
    //   107: aload_1
    //   108: athrow
    //   109: astore_1
    //   110: aload_0
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    // Exception table:
    //   from	to	target	type
    //   2	39	109	finally
    //   39	83	102	finally
    //   88	95	102	finally
    //   95	99	109	finally
    //   103	109	109	finally
  }
  
  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public final View b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast android/view/View
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 22
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_2
    //   21: areturn
    //   22: new java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore_2
    //   30: aload_2
    //   31: ldc_w 'Trying to resolve view with tag '
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_2
    //   39: iload_1
    //   40: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_2
    //   45: ldc_w ' which doesn't exist'
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: new com/facebook/react/uimanager/g
    //   55: dup
    //   56: aload_2
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: athrow
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	64	finally
    //   22	64	64	finally
  }
  
  void b() {
    this.g.a();
  }
  
  protected final void b(int paramInt, View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: invokevirtual getId : ()I
    //   6: iconst_m1
    //   7: if_icmpeq -> 60
    //   10: getstatic com/facebook/react/uimanager/m.l : Ljava/lang/String;
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #4
    //   23: aload #4
    //   25: ldc_w 'Trying to add a root view with an explicit id ('
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload #4
    //   34: aload_2
    //   35: invokevirtual getId : ()I
    //   38: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload #4
    //   44: ldc_w ') already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.'
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload_3
    //   52: aload #4
    //   54: invokevirtual toString : ()Ljava/lang/String;
    //   57: invokestatic b : (Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield a : Landroid/util/SparseArray;
    //   64: iload_1
    //   65: aload_2
    //   66: invokevirtual put : (ILjava/lang/Object;)V
    //   69: aload_0
    //   70: getfield b : Landroid/util/SparseArray;
    //   73: iload_1
    //   74: aload_0
    //   75: getfield f : Lcom/facebook/react/uimanager/RootViewManager;
    //   78: invokevirtual put : (ILjava/lang/Object;)V
    //   81: aload_0
    //   82: getfield c : Landroid/util/SparseBooleanArray;
    //   85: iload_1
    //   86: iconst_1
    //   87: invokevirtual put : (IZ)V
    //   90: aload_2
    //   91: iload_1
    //   92: invokevirtual setId : (I)V
    //   95: aload_0
    //   96: monitorexit
    //   97: return
    //   98: astore_2
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_2
    //   102: athrow
    // Exception table:
    //   from	to	target	type
    //   2	60	98	finally
    //   60	95	98	finally
  }
  
  public void b(int paramInt, int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Landroid/util/SparseArray;
    //   9: iload_1
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast android/view/View
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull -> 87
    //   21: aload_3
    //   22: aload_2
    //   23: invokevirtual getLocationOnScreen : ([I)V
    //   26: aload_3
    //   27: invokevirtual getContext : ()Landroid/content/Context;
    //   30: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   33: astore #4
    //   35: aload #4
    //   37: ldc_w 'status_bar_height'
    //   40: ldc_w 'dimen'
    //   43: ldc_w 'android'
    //   46: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   49: istore_1
    //   50: iload_1
    //   51: ifle -> 70
    //   54: aload #4
    //   56: iload_1
    //   57: invokevirtual getDimension : (I)F
    //   60: f2i
    //   61: istore_1
    //   62: aload_2
    //   63: iconst_1
    //   64: aload_2
    //   65: iconst_1
    //   66: iaload
    //   67: iload_1
    //   68: isub
    //   69: iastore
    //   70: aload_2
    //   71: iconst_2
    //   72: aload_3
    //   73: invokevirtual getWidth : ()I
    //   76: iastore
    //   77: aload_2
    //   78: iconst_3
    //   79: aload_3
    //   80: invokevirtual getHeight : ()I
    //   83: iastore
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: new java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: astore_2
    //   95: aload_2
    //   96: ldc_w 'No native view for '
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_2
    //   104: iload_1
    //   105: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload_2
    //   110: ldc_w ' currently exists'
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: new com/facebook/react/uimanager/o
    //   120: dup
    //   121: aload_2
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: athrow
    //   129: astore_2
    //   130: aload_0
    //   131: monitorexit
    //   132: aload_2
    //   133: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	129	finally
    //   21	50	129	finally
    //   54	62	129	finally
    //   70	84	129	finally
    //   87	129	129	finally
  }
  
  public final ViewManager c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast com/facebook/react/uimanager/ViewManager
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 22
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_2
    //   21: areturn
    //   22: new java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore_2
    //   30: aload_2
    //   31: ldc_w 'ViewManager for tag '
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_2
    //   39: iload_1
    //   40: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_2
    //   45: ldc_w ' could not be found.\\n'
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: new com/facebook/react/uimanager/g
    //   55: dup
    //   56: aload_2
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: athrow
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	64	finally
    //   22	64	64	finally
  }
  
  public void c() {
    PopupMenu popupMenu = this.j;
    if (popupMenu != null)
      popupMenu.dismiss(); 
  }
  
  class a implements f {
    a(m this$0, ViewGroupManager param1ViewGroupManager, ViewGroup param1ViewGroup, View param1View, Set param1Set, int param1Int) {}
    
    public void a() {
      UiThreadUtil.assertOnUiThread();
      this.a.removeView(this.b, this.c);
      this.f.a(this.c);
      this.d.remove(Integer.valueOf(this.c.getId()));
      if (this.d.isEmpty())
        m.a(this.f).remove(Integer.valueOf(this.e)); 
    }
  }
  
  private static class b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {
    final Callback a;
    
    boolean b = false;
    
    private b(Callback param1Callback) {
      this.a = param1Callback;
    }
    
    public void onDismiss(PopupMenu param1PopupMenu) {
      if (!this.b) {
        this.a.invoke(new Object[] { "dismissed" });
        this.b = true;
      } 
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      boolean bool1 = this.b;
      boolean bool = false;
      if (!bool1) {
        Callback callback = this.a;
        int i = param1MenuItem.getOrder();
        bool = true;
        callback.invoke(new Object[] { "itemSelected", Integer.valueOf(i) });
        this.b = true;
      } 
      return bool;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */