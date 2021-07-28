package com.facebook.react.views.viewpager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import e.e.m.a.a;
import e.e.o.d0.a.a;
import e.e.o.h0.m;
import e.e.o.h0.n;
import java.util.Map;

@a(name = "AndroidViewPager")
public class ReactViewPagerManager extends ViewGroupManager<d> implements n<d> {
  public static final int COMMAND_SET_PAGE = 1;
  
  public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
  
  public static final String REACT_CLASS = "AndroidViewPager";
  
  private final y0<d> mDelegate = (y0<d>)new m((b)this);
  
  public void addView(d paramd, View paramView, int paramInt) {
    paramd.a(paramView, paramInt);
  }
  
  protected d createViewInstance(k0 paramk0) {
    return new d((ReactContext)paramk0);
  }
  
  public View getChildAt(d paramd, int paramInt) {
    return paramd.d(paramInt);
  }
  
  public int getChildCount(d paramd) {
    return paramd.getViewCountInAdapter();
  }
  
  public Map<String, Integer> getCommandsMap() {
    return f.a("setPage", Integer.valueOf(1), "setPageWithoutAnimation", Integer.valueOf(2));
  }
  
  public y0<d> getDelegate() {
    return this.mDelegate;
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a("topPageScroll", f.a("registrationName", "onPageScroll"), "topPageScrollStateChanged", f.a("registrationName", "onPageScrollStateChanged"), "topPageSelected", f.a("registrationName", "onPageSelected"));
  }
  
  public String getName() {
    return "AndroidViewPager";
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  public void receiveCommand(d paramd, int paramInt, ReadableArray paramReadableArray) {
    a.a(paramd);
    a.a(paramReadableArray);
    if (paramInt != 1) {
      if (paramInt == 2) {
        paramd.b(paramReadableArray.getInt(0), false);
        return;
      } 
      throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[] { Integer.valueOf(paramInt), ReactViewPagerManager.class.getSimpleName() }));
    } 
    paramd.b(paramReadableArray.getInt(0), true);
  }
  
  public void receiveCommand(d paramd, String paramString, ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_3
    //   6: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_2
    //   11: invokevirtual hashCode : ()I
    //   14: istore #4
    //   16: iload #4
    //   18: ldc -445763635
    //   20: if_icmpeq -> 48
    //   23: iload #4
    //   25: ldc 1984860689
    //   27: if_icmpeq -> 33
    //   30: goto -> 63
    //   33: aload_2
    //   34: ldc 'setPage'
    //   36: invokevirtual equals : (Ljava/lang/Object;)Z
    //   39: ifeq -> 63
    //   42: iconst_0
    //   43: istore #4
    //   45: goto -> 66
    //   48: aload_2
    //   49: ldc 'setPageWithoutAnimation'
    //   51: invokevirtual equals : (Ljava/lang/Object;)Z
    //   54: ifeq -> 63
    //   57: iconst_1
    //   58: istore #4
    //   60: goto -> 66
    //   63: iconst_m1
    //   64: istore #4
    //   66: iload #4
    //   68: ifeq -> 119
    //   71: iload #4
    //   73: iconst_1
    //   74: if_icmpne -> 90
    //   77: aload_1
    //   78: aload_3
    //   79: iconst_0
    //   80: invokeinterface getInt : (I)I
    //   85: iconst_0
    //   86: invokevirtual b : (IZ)V
    //   89: return
    //   90: new java/lang/IllegalArgumentException
    //   93: dup
    //   94: ldc 'Unsupported command %d received by %s.'
    //   96: iconst_2
    //   97: anewarray java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_2
    //   103: aastore
    //   104: dup
    //   105: iconst_1
    //   106: ldc com/facebook/react/views/viewpager/ReactViewPagerManager
    //   108: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: athrow
    //   119: aload_1
    //   120: aload_3
    //   121: iconst_0
    //   122: invokeinterface getInt : (I)I
    //   127: iconst_1
    //   128: invokevirtual b : (IZ)V
    //   131: return
  }
  
  public void removeViewAt(d paramd, int paramInt) {
    paramd.e(paramInt);
  }
  
  public void setInitialPage(d paramd, int paramInt) {}
  
  public void setKeyboardDismissMode(d paramd, String paramString) {}
  
  public void setPage(d paramd, int paramInt) {}
  
  @a(defaultInt = 0, name = "pageMargin")
  public void setPageMargin(d paramd, int paramInt) {
    paramd.setPageMargin((int)q.b(paramInt));
  }
  
  public void setPageWithoutAnimation(d paramd, int paramInt) {}
  
  @a(defaultBoolean = false, name = "peekEnabled")
  public void setPeekEnabled(d paramd, boolean paramBoolean) {
    paramd.setClipToPadding(paramBoolean ^ true);
  }
  
  @a(defaultBoolean = true, name = "scrollEnabled")
  public void setScrollEnabled(d paramd, boolean paramBoolean) {
    paramd.setScrollEnabled(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/viewpager/ReactViewPagerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */