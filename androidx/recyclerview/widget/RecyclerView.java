package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b.g.m.j;
import b.g.m.k;
import b.g.m.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements t, j, k {
  static {
    int i = Build.VERSION.SDK_INT;
    if (i == 18 || i == 19 || i == 20) {
      bool = true;
    } else {
      bool = false;
    } 
    FORCE_INVALIDATE_DISPLAY_LIST = bool;
    if (Build.VERSION.SDK_INT >= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    ALLOW_SIZE_IN_UNSPECIFIED_SPEC = bool;
    if (Build.VERSION.SDK_INT >= 16) {
      bool = true;
    } else {
      bool = false;
    } 
    POST_UPDATES_ON_ANIMATION = bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    ALLOW_THREAD_GAP_WORK = bool;
    if (Build.VERSION.SDK_INT <= 15) {
      bool = true;
    } else {
      bool = false;
    } 
    FORCE_ABS_FOCUS_SEARCH_DIRECTION = bool;
    if (Build.VERSION.SDK_INT <= 15) {
      bool = true;
    } else {
      bool = false;
    } 
    IGNORE_DETACHED_FOCUSED_CHILD = bool;
    Class<int> clazz = int.class;
    LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[] { Context.class, AttributeSet.class, clazz, clazz };
    sQuinticInterpolator = new c();
  }
  
  public RecyclerView(Context paramContext) {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.o.a.recyclerViewStyle);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    e.b b1;
    this.mObserver = new x(this);
    this.mRecycler = new v(this);
    this.mViewInfoStore = new q();
    this.mUpdateChildViewsRunnable = new a(this);
    this.mTempRect = new Rect();
    this.mTempRect2 = new Rect();
    this.mTempRectF = new RectF();
    this.mItemDecorations = new ArrayList<n>();
    this.mOnItemTouchListeners = new ArrayList<s>();
    this.mInterceptRequestLayoutDepth = 0;
    this.mDataSetHasChangedAfterLayout = false;
    this.mDispatchItemsChangedEvent = false;
    this.mLayoutOrScrollCounter = 0;
    this.mDispatchScrollCounter = 0;
    this.mEdgeEffectFactory = new k();
    this.mItemAnimator = new c();
    this.mScrollState = 0;
    this.mScrollPointerId = -1;
    this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
    this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
    boolean bool2 = true;
    this.mPreserveFocusAfterLayout = true;
    this.mViewFlinger = new c0(this);
    if (ALLOW_THREAD_GAP_WORK) {
      b1 = new e.b();
    } else {
      b1 = null;
    } 
    this.mPrefetchRegistry = b1;
    this.mState = new a0();
    this.mItemsAddedOrRemoved = false;
    this.mItemsChanged = false;
    this.mItemAnimatorListener = new m(this);
    this.mPostedAnimatorRunner = false;
    this.mMinMaxLayoutPositions = new int[2];
    this.mScrollOffset = new int[2];
    this.mNestedOffsets = new int[2];
    this.mReusableIntPair = new int[2];
    this.mPendingAccessibilityImportanceChange = new ArrayList<d0>();
    this.mItemAnimatorRunner = new b(this);
    this.mViewInfoProcessCallback = new d(this);
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
    this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    this.mScaledHorizontalScrollFactor = b.g.m.w.b(viewConfiguration, paramContext);
    this.mScaledVerticalScrollFactor = b.g.m.w.c(viewConfiguration, paramContext);
    this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
    this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    if (getOverScrollMode() == 2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    setWillNotDraw(bool1);
    this.mItemAnimator.a(this.mItemAnimatorListener);
    initAdapterManager();
    initChildrenHelper();
    initAutofill();
    if (b.g.m.v.n((View)this) == 0)
      b.g.m.v.h((View)this, 1); 
    this.mAccessibilityManager = (AccessibilityManager)getContext().getSystemService("accessibility");
    setAccessibilityDelegateCompat(new l(this));
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.o.c.RecyclerView, paramInt, 0);
    if (Build.VERSION.SDK_INT >= 29)
      saveAttributeDataForStyleable(paramContext, b.o.c.RecyclerView, paramAttributeSet, typedArray, paramInt, 0); 
    String str = typedArray.getString(b.o.c.RecyclerView_layoutManager);
    if (typedArray.getInt(b.o.c.RecyclerView_android_descendantFocusability, -1) == -1)
      setDescendantFocusability(262144); 
    this.mClipToPadding = typedArray.getBoolean(b.o.c.RecyclerView_android_clipToPadding, true);
    this.mEnableFastScroller = typedArray.getBoolean(b.o.c.RecyclerView_fastScrollEnabled, false);
    if (this.mEnableFastScroller)
      initFastScroller((StateListDrawable)typedArray.getDrawable(b.o.c.RecyclerView_fastScrollVerticalThumbDrawable), typedArray.getDrawable(b.o.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable)typedArray.getDrawable(b.o.c.RecyclerView_fastScrollHorizontalThumbDrawable), typedArray.getDrawable(b.o.c.RecyclerView_fastScrollHorizontalTrackDrawable)); 
    typedArray.recycle();
    createLayoutManager(paramContext, str, paramAttributeSet, paramInt, 0);
    boolean bool1 = bool2;
    if (Build.VERSION.SDK_INT >= 21) {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, NESTED_SCROLLING_ATTRS, paramInt, 0);
      if (Build.VERSION.SDK_INT >= 29)
        saveAttributeDataForStyleable(paramContext, NESTED_SCROLLING_ATTRS, paramAttributeSet, typedArray, paramInt, 0); 
      bool1 = typedArray.getBoolean(0, true);
      typedArray.recycle();
    } 
    setNestedScrollingEnabled(bool1);
  }
  
  private void addAnimatingView(d0 paramd0) {
    boolean bool;
    View view = paramd0.a;
    if (view.getParent() == this) {
      bool = true;
    } else {
      bool = false;
    } 
    this.mRecycler.c(getChildViewHolder(view));
    if (paramd0.s()) {
      this.mChildHelper.a(view, -1, view.getLayoutParams(), true);
      return;
    } 
    b b1 = this.mChildHelper;
    if (!bool) {
      b1.a(view, true);
      return;
    } 
    b1.a(view);
  }
  
  private void animateChange(d0 paramd01, d0 paramd02, l.c paramc1, l.c paramc2, boolean paramBoolean1, boolean paramBoolean2) {
    paramd01.a(false);
    if (paramBoolean1)
      addAnimatingView(paramd01); 
    if (paramd01 != paramd02) {
      if (paramBoolean2)
        addAnimatingView(paramd02); 
      paramd01.h = paramd02;
      addAnimatingView(paramd01);
      this.mRecycler.c(paramd01);
      paramd02.a(false);
      paramd02.i = paramd01;
    } 
    if (this.mItemAnimator.a(paramd01, paramd02, paramc1, paramc2))
      postAnimationRunner(); 
  }
  
  private void cancelScroll() {
    resetScroll();
    setScrollState(0);
  }
  
  static void clearNestedRecyclerViewIfNotNested(d0 paramd0) {
    WeakReference<RecyclerView> weakReference = paramd0.b;
    if (weakReference != null) {
      weakReference = (WeakReference<RecyclerView>)weakReference.get();
      label17: while (true) {
        View view = (View)weakReference;
        while (view != null) {
          if (view == paramd0.a)
            return; 
          ViewParent viewParent = view.getParent();
          if (viewParent instanceof View)
            continue label17; 
          viewParent = null;
        } 
        paramd0.b = null;
        break;
      } 
    } 
  }
  
  private void createLayoutManager(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    if (paramString != null) {
      paramString = paramString.trim();
      if (!paramString.isEmpty()) {
        String str = getFullClassName(paramContext, paramString);
        try {
          StringBuilder stringBuilder;
          ClassLoader classLoader;
          if (isInEditMode()) {
            classLoader = getClass().getClassLoader();
          } else {
            classLoader = paramContext.getClassLoader();
          } 
          Class<? extends o> clazz = Class.forName(str, false, classLoader).asSubclass(o.class);
          NoSuchMethodException noSuchMethodException2 = null;
          try {
            Constructor<? extends o> constructor = clazz.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
            Object[] arrayOfObject = { paramContext, paramAttributeSet, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) };
          } catch (NoSuchMethodException noSuchMethodException) {
            try {
              Constructor<? extends o> constructor = clazz.getConstructor(new Class[0]);
              noSuchMethodException = noSuchMethodException2;
              constructor.setAccessible(true);
              setLayoutManager(constructor.newInstance((Object[])noSuchMethodException));
              return;
            } catch (NoSuchMethodException noSuchMethodException1) {
              noSuchMethodException1.initCause(noSuchMethodException);
              stringBuilder = new StringBuilder();
              stringBuilder.append(paramAttributeSet.getPositionDescription());
              stringBuilder.append(": Error creating LayoutManager ");
              stringBuilder.append(str);
              throw new IllegalStateException(stringBuilder.toString(), noSuchMethodException1);
            } 
          } 
          noSuchMethodException1.setAccessible(true);
          setLayoutManager(noSuchMethodException1.newInstance((Object[])stringBuilder));
          return;
        } catch (ClassNotFoundException classNotFoundException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Unable to find LayoutManager ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), classNotFoundException);
        } catch (InvocationTargetException invocationTargetException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Could not instantiate the LayoutManager: ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), invocationTargetException);
        } catch (InstantiationException instantiationException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Could not instantiate the LayoutManager: ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Cannot access non-public constructor ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), illegalAccessException);
        } catch (ClassCastException classCastException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramAttributeSet.getPositionDescription());
          stringBuilder.append(": Class is not a LayoutManager ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString(), classCastException);
        } 
      } 
    } 
  }
  
  private boolean didChildRangeChange(int paramInt1, int paramInt2) {
    findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
    int[] arrayOfInt = this.mMinMaxLayoutPositions;
    boolean bool = false;
    if (arrayOfInt[0] != paramInt1 || arrayOfInt[1] != paramInt2)
      bool = true; 
    return bool;
  }
  
  private void dispatchContentChangedIfNecessary() {
    int i = this.mEatenAccessibilityChangeFlags;
    this.mEatenAccessibilityChangeFlags = 0;
    if (i != 0 && isAccessibilityEnabled()) {
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
      accessibilityEvent.setEventType(2048);
      b.g.m.e0.b.a(accessibilityEvent, i);
      sendAccessibilityEventUnchecked(accessibilityEvent);
    } 
  }
  
  private void dispatchLayoutStep1() {
    a0 a01 = this.mState;
    boolean bool = true;
    a01.a(1);
    fillRemainingScrollValues(this.mState);
    this.mState.j = false;
    startInterceptRequestLayout();
    this.mViewInfoStore.a();
    onEnterLayoutOrScroll();
    processAdapterUpdatesAndSetAnimationFlags();
    saveFocusInfo();
    a01 = this.mState;
    if (!a01.k || !this.mItemsChanged)
      bool = false; 
    a01.i = bool;
    this.mItemsChanged = false;
    this.mItemsAddedOrRemoved = false;
    a01 = this.mState;
    a01.h = a01.l;
    a01.f = this.mAdapter.a();
    findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
    if (this.mState.k) {
      int n = this.mChildHelper.a();
      for (int i = 0; i < n; i++) {
        d0 d0 = getChildViewHolderInt(this.mChildHelper.c(i));
        if (!d0.y() && (!d0.o() || this.mAdapter.c())) {
          l.c c = this.mItemAnimator.a(this.mState, d0, l.e(d0), d0.k());
          this.mViewInfoStore.c(d0, c);
          if (this.mState.i && d0.t() && !d0.q() && !d0.y() && !d0.o()) {
            long l1 = getChangedHolderKey(d0);
            this.mViewInfoStore.a(l1, d0);
          } 
        } 
      } 
    } 
    if (this.mState.l) {
      saveOldPositions();
      a01 = this.mState;
      bool = a01.g;
      a01.g = false;
      this.mLayout.e(this.mRecycler, a01);
      this.mState.g = bool;
      for (int i = 0; i < this.mChildHelper.a(); i++) {
        d0 d0 = getChildViewHolderInt(this.mChildHelper.c(i));
        if (!d0.y() && !this.mViewInfoStore.c(d0)) {
          int i1 = l.e(d0);
          bool = d0.b(8192);
          int n = i1;
          if (!bool)
            n = i1 | 0x1000; 
          l.c c = this.mItemAnimator.a(this.mState, d0, n, d0.k());
          if (bool) {
            recordAnimationInfoIfBouncedHiddenView(d0, c);
          } else {
            this.mViewInfoStore.a(d0, c);
          } 
        } 
      } 
    } 
    clearOldPositions();
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    this.mState.e = 2;
  }
  
  private void dispatchLayoutStep2() {
    boolean bool;
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    this.mState.a(6);
    this.mAdapterHelper.b();
    this.mState.f = this.mAdapter.a();
    a0 a01 = this.mState;
    a01.d = 0;
    a01.h = false;
    this.mLayout.e(this.mRecycler, a01);
    a01 = this.mState;
    a01.g = false;
    this.mPendingSavedState = null;
    if (a01.k && this.mItemAnimator != null) {
      bool = true;
    } else {
      bool = false;
    } 
    a01.k = bool;
    this.mState.e = 4;
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
  }
  
  private void dispatchLayoutStep3() {
    this.mState.a(4);
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    a0 a01 = this.mState;
    a01.e = 1;
    if (a01.k) {
      for (int i = this.mChildHelper.a() - 1; i >= 0; i--) {
        d0 d01 = getChildViewHolderInt(this.mChildHelper.c(i));
        if (d01.y())
          continue; 
        long l1 = getChangedHolderKey(d01);
        l.c c = this.mItemAnimator.a(this.mState, d01);
        d0 d02 = this.mViewInfoStore.a(l1);
        if (d02 != null && !d02.y()) {
          boolean bool1 = this.mViewInfoStore.b(d02);
          boolean bool2 = this.mViewInfoStore.b(d01);
          if (!bool1 || d02 != d01) {
            l.c c1 = this.mViewInfoStore.f(d02);
            this.mViewInfoStore.b(d01, c);
            c = this.mViewInfoStore.e(d01);
            if (c1 == null) {
              handleMissingPreInfoForChangeError(l1, d01, d02);
            } else {
              animateChange(d02, d01, c1, c, bool1, bool2);
            } 
            continue;
          } 
        } 
        this.mViewInfoStore.b(d01, c);
        continue;
      } 
      this.mViewInfoStore.a(this.mViewInfoProcessCallback);
    } 
    this.mLayout.c(this.mRecycler);
    a01 = this.mState;
    a01.c = a01.f;
    this.mDataSetHasChangedAfterLayout = false;
    this.mDispatchItemsChangedEvent = false;
    a01.k = false;
    a01.l = false;
    this.mLayout.h = false;
    ArrayList<d0> arrayList = this.mRecycler.b;
    if (arrayList != null)
      arrayList.clear(); 
    o o1 = this.mLayout;
    if (o1.n) {
      o1.m = 0;
      o1.n = false;
      this.mRecycler.j();
    } 
    this.mLayout.g(this.mState);
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    this.mViewInfoStore.a();
    int[] arrayOfInt = this.mMinMaxLayoutPositions;
    if (didChildRangeChange(arrayOfInt[0], arrayOfInt[1]))
      dispatchOnScrolled(0, 0); 
    recoverFocusFromState();
    resetFocusInfo();
  }
  
  private boolean dispatchToOnItemTouchListeners(MotionEvent paramMotionEvent) {
    s s1 = this.mInterceptingOnItemTouchListener;
    if (s1 == null)
      return (paramMotionEvent.getAction() == 0) ? false : findInterceptingOnItemTouchListener(paramMotionEvent); 
    s1.b(this, paramMotionEvent);
    int i = paramMotionEvent.getAction();
    if (i == 3 || i == 1)
      this.mInterceptingOnItemTouchListener = null; 
    return true;
  }
  
  private boolean findInterceptingOnItemTouchListener(MotionEvent paramMotionEvent) {
    int n = paramMotionEvent.getAction();
    int i1 = this.mOnItemTouchListeners.size();
    for (int i = 0; i < i1; i++) {
      s s1 = this.mOnItemTouchListeners.get(i);
      if (s1.a(this, paramMotionEvent) && n != 3) {
        this.mInterceptingOnItemTouchListener = s1;
        return true;
      } 
    } 
    return false;
  }
  
  private void findMinMaxChildLayoutPositions(int[] paramArrayOfint) {
    int i2 = this.mChildHelper.a();
    if (i2 == 0) {
      paramArrayOfint[0] = -1;
      paramArrayOfint[1] = -1;
      return;
    } 
    int i1 = 0;
    int i = Integer.MAX_VALUE;
    int n;
    for (n = Integer.MIN_VALUE; i1 < i2; n = i3) {
      int i3;
      d0 d0 = getChildViewHolderInt(this.mChildHelper.c(i1));
      if (d0.y()) {
        i3 = n;
      } else {
        int i5 = d0.i();
        int i4 = i;
        if (i5 < i)
          i4 = i5; 
        i = i4;
        i3 = n;
        if (i5 > n) {
          i3 = i5;
          i = i4;
        } 
      } 
      i1++;
    } 
    paramArrayOfint[0] = i;
    paramArrayOfint[1] = n;
  }
  
  static RecyclerView findNestedRecyclerView(View paramView) {
    if (!(paramView instanceof ViewGroup))
      return null; 
    if (paramView instanceof RecyclerView)
      return (RecyclerView)paramView; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int n = viewGroup.getChildCount();
    for (int i = 0; i < n; i++) {
      RecyclerView recyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
      if (recyclerView != null)
        return recyclerView; 
    } 
    return null;
  }
  
  private View findNextViewToFocus() {
    int i = this.mState.m;
    if (i == -1)
      i = 0; 
    int i1 = this.mState.a();
    for (int n = i; n < i1; n++) {
      d0 d0 = findViewHolderForAdapterPosition(n);
      if (d0 == null)
        break; 
      if (d0.a.hasFocusable())
        return d0.a; 
    } 
    for (i = Math.min(i1, i) - 1; i >= 0; i--) {
      d0 d0 = findViewHolderForAdapterPosition(i);
      if (d0 == null)
        return null; 
      if (d0.a.hasFocusable())
        return d0.a; 
    } 
    return null;
  }
  
  static d0 getChildViewHolderInt(View paramView) {
    return (paramView == null) ? null : ((p)paramView.getLayoutParams()).a;
  }
  
  static void getDecoratedBoundsWithMarginsInt(View paramView, Rect paramRect) {
    p p = (p)paramView.getLayoutParams();
    Rect rect = p.b;
    paramRect.set(paramView.getLeft() - rect.left - p.leftMargin, paramView.getTop() - rect.top - p.topMargin, paramView.getRight() + rect.right + p.rightMargin, paramView.getBottom() + rect.bottom + p.bottomMargin);
  }
  
  private int getDeepestFocusedViewWithId(View paramView) {
    int i;
    while (true) {
      i = paramView.getId();
      while (!paramView.isFocused() && paramView instanceof ViewGroup && paramView.hasFocus()) {
        View view = ((ViewGroup)paramView).getFocusedChild();
        paramView = view;
        if (view.getId() != -1)
          paramView = view; 
      } 
      break;
    } 
    return i;
  }
  
  private String getFullClassName(Context paramContext, String paramString) {
    if (paramString.charAt(0) == '.') {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramContext.getPackageName());
      stringBuilder1.append(paramString);
      return stringBuilder1.toString();
    } 
    if (paramString.contains("."))
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(RecyclerView.class.getPackage().getName());
    stringBuilder.append('.');
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  private b.g.m.m getScrollingChildHelper() {
    if (this.mScrollingChildHelper == null)
      this.mScrollingChildHelper = new b.g.m.m((View)this); 
    return this.mScrollingChildHelper;
  }
  
  private void handleMissingPreInfoForChangeError(long paramLong, d0 paramd01, d0 paramd02) {
    StringBuilder stringBuilder1;
    int n = this.mChildHelper.a();
    int i;
    for (i = 0; i < n; i++) {
      d0 d01 = getChildViewHolderInt(this.mChildHelper.c(i));
      if (d01 != paramd01 && getChangedHolderKey(d01) == paramLong) {
        g g1 = this.mAdapter;
        if (g1 != null && g1.c()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
          stringBuilder.append(d01);
          stringBuilder.append(" \n View Holder 2:");
          stringBuilder.append(paramd01);
          stringBuilder.append(exceptionLabel());
          throw new IllegalStateException(stringBuilder.toString());
        } 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
        stringBuilder1.append(d01);
        stringBuilder1.append(" \n View Holder 2:");
        stringBuilder1.append(paramd01);
        stringBuilder1.append(exceptionLabel());
        throw new IllegalStateException(stringBuilder1.toString());
      } 
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
    stringBuilder2.append(stringBuilder1);
    stringBuilder2.append(" cannot be found but it is necessary for ");
    stringBuilder2.append(paramd01);
    stringBuilder2.append(exceptionLabel());
    Log.e("RecyclerView", stringBuilder2.toString());
  }
  
  private boolean hasUpdatedView() {
    int n = this.mChildHelper.a();
    for (int i = 0; i < n; i++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.c(i));
      if (d0 != null && !d0.y() && d0.t())
        return true; 
    } 
    return false;
  }
  
  @SuppressLint({"InlinedApi"})
  private void initAutofill() {
    if (b.g.m.v.o((View)this) == 0)
      b.g.m.v.i((View)this, 8); 
  }
  
  private void initChildrenHelper() {
    this.mChildHelper = new b(new e(this));
  }
  
  private boolean isPreferredNextFocus(View paramView1, View paramView2, int paramInt) {
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool1 = false;
    boolean bool6 = false;
    boolean bool2 = false;
    null = bool6;
    if (paramView2 != null) {
      byte b2;
      if (paramView2 == this)
        return false; 
      if (findContainingItemView(paramView2) == null)
        return false; 
      if (paramView1 == null)
        return true; 
      if (findContainingItemView(paramView1) == null)
        return true; 
      this.mTempRect.set(0, 0, paramView1.getWidth(), paramView1.getHeight());
      this.mTempRect2.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
      offsetDescendantRectToMyCoords(paramView1, this.mTempRect);
      offsetDescendantRectToMyCoords(paramView2, this.mTempRect2);
      int i = this.mLayout.k();
      byte b1 = -1;
      if (i == 1) {
        b2 = -1;
      } else {
        b2 = 1;
      } 
      Rect rect = this.mTempRect;
      i = rect.left;
      int n = this.mTempRect2.left;
      if ((i < n || rect.right <= n) && this.mTempRect.right < this.mTempRect2.right) {
        i = 1;
      } else {
        rect = this.mTempRect;
        i = rect.right;
        n = this.mTempRect2.right;
        if ((i > n || rect.left >= n) && this.mTempRect.left > this.mTempRect2.left) {
          i = -1;
        } else {
          i = 0;
        } 
      } 
      rect = this.mTempRect;
      n = rect.top;
      int i1 = this.mTempRect2.top;
      if ((n < i1 || rect.bottom <= i1) && this.mTempRect.bottom < this.mTempRect2.bottom) {
        b1 = 1;
      } else {
        rect = this.mTempRect;
        n = rect.bottom;
        i1 = this.mTempRect2.bottom;
        if ((n <= i1 && rect.top < i1) || this.mTempRect.top <= this.mTempRect2.top)
          b1 = 0; 
      } 
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 17) {
            if (paramInt != 33) {
              if (paramInt != 66) {
                if (paramInt == 130) {
                  null = bool2;
                  if (b1 > 0)
                    null = true; 
                  return null;
                } 
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid direction: ");
                stringBuilder.append(paramInt);
                stringBuilder.append(exceptionLabel());
                throw new IllegalArgumentException(stringBuilder.toString());
              } 
              null = bool3;
              if (i > 0)
                null = true; 
              return null;
            } 
            null = bool4;
            if (b1 < 0)
              null = true; 
            return null;
          } 
          null = bool5;
          if (i < 0)
            null = true; 
          return null;
        } 
        if (b1 <= 0) {
          null = bool1;
          if (b1 == 0) {
            null = bool1;
            if (i * b2 >= 0)
              return true; 
          } 
          return null;
        } 
      } else {
        if (b1 >= 0) {
          null = bool6;
          if (b1 == 0) {
            null = bool6;
            if (i * b2 <= 0)
              null = true; 
          } 
          return null;
        } 
        null = true;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  private void onPointerUp(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.mScrollPointerId) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.mScrollPointerId = paramMotionEvent.getPointerId(i);
      int n = (int)(paramMotionEvent.getX(i) + 0.5F);
      this.mLastTouchX = n;
      this.mInitialTouchX = n;
      i = (int)(paramMotionEvent.getY(i) + 0.5F);
      this.mLastTouchY = i;
      this.mInitialTouchY = i;
    } 
  }
  
  private boolean predictiveItemAnimationsEnabled() {
    return (this.mItemAnimator != null && this.mLayout.D());
  }
  
  private void processAdapterUpdatesAndSetAnimationFlags() {
    boolean bool1;
    if (this.mDataSetHasChangedAfterLayout) {
      this.mAdapterHelper.f();
      if (this.mDispatchItemsChangedEvent)
        this.mLayout.d(this); 
    } 
    if (predictiveItemAnimationsEnabled()) {
      this.mAdapterHelper.e();
    } else {
      this.mAdapterHelper.b();
    } 
    boolean bool = this.mItemsAddedOrRemoved;
    boolean bool2 = false;
    if (bool || this.mItemsChanged) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    a0 a01 = this.mState;
    if (this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || bool1 || this.mLayout.h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.c())) {
      bool = true;
    } else {
      bool = false;
    } 
    a01.k = bool;
    a01 = this.mState;
    bool = bool2;
    if (a01.k) {
      bool = bool2;
      if (bool1) {
        bool = bool2;
        if (!this.mDataSetHasChangedAfterLayout) {
          bool = bool2;
          if (predictiveItemAnimationsEnabled())
            bool = true; 
        } 
      } 
    } 
    a01.l = bool;
  }
  
  private void pullGlows(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #8
    //   3: fload_2
    //   4: fconst_0
    //   5: fcmpg
    //   6: ifge -> 57
    //   9: aload_0
    //   10: invokevirtual ensureLeftGlow : ()V
    //   13: aload_0
    //   14: getfield mLeftGlow : Landroid/widget/EdgeEffect;
    //   17: astore #9
    //   19: fload_2
    //   20: fneg
    //   21: aload_0
    //   22: invokevirtual getWidth : ()I
    //   25: i2f
    //   26: fdiv
    //   27: fstore #6
    //   29: fconst_1
    //   30: fload_3
    //   31: aload_0
    //   32: invokevirtual getHeight : ()I
    //   35: i2f
    //   36: fdiv
    //   37: fsub
    //   38: fstore #5
    //   40: fload #6
    //   42: fstore_3
    //   43: aload #9
    //   45: fload_3
    //   46: fload #5
    //   48: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   51: iconst_1
    //   52: istore #7
    //   54: goto -> 104
    //   57: fload_2
    //   58: fconst_0
    //   59: fcmpl
    //   60: ifle -> 101
    //   63: aload_0
    //   64: invokevirtual ensureRightGlow : ()V
    //   67: aload_0
    //   68: getfield mRightGlow : Landroid/widget/EdgeEffect;
    //   71: astore #9
    //   73: fload_2
    //   74: aload_0
    //   75: invokevirtual getWidth : ()I
    //   78: i2f
    //   79: fdiv
    //   80: fstore #5
    //   82: fload_3
    //   83: aload_0
    //   84: invokevirtual getHeight : ()I
    //   87: i2f
    //   88: fdiv
    //   89: fstore #6
    //   91: fload #5
    //   93: fstore_3
    //   94: fload #6
    //   96: fstore #5
    //   98: goto -> 43
    //   101: iconst_0
    //   102: istore #7
    //   104: fload #4
    //   106: fconst_0
    //   107: fcmpg
    //   108: ifge -> 145
    //   111: aload_0
    //   112: invokevirtual ensureTopGlow : ()V
    //   115: aload_0
    //   116: getfield mTopGlow : Landroid/widget/EdgeEffect;
    //   119: fload #4
    //   121: fneg
    //   122: aload_0
    //   123: invokevirtual getHeight : ()I
    //   126: i2f
    //   127: fdiv
    //   128: fload_1
    //   129: aload_0
    //   130: invokevirtual getWidth : ()I
    //   133: i2f
    //   134: fdiv
    //   135: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   138: iload #8
    //   140: istore #7
    //   142: goto -> 187
    //   145: fload #4
    //   147: fconst_0
    //   148: fcmpl
    //   149: ifle -> 187
    //   152: aload_0
    //   153: invokevirtual ensureBottomGlow : ()V
    //   156: aload_0
    //   157: getfield mBottomGlow : Landroid/widget/EdgeEffect;
    //   160: fload #4
    //   162: aload_0
    //   163: invokevirtual getHeight : ()I
    //   166: i2f
    //   167: fdiv
    //   168: fconst_1
    //   169: fload_1
    //   170: aload_0
    //   171: invokevirtual getWidth : ()I
    //   174: i2f
    //   175: fdiv
    //   176: fsub
    //   177: invokestatic a : (Landroid/widget/EdgeEffect;FF)V
    //   180: iload #8
    //   182: istore #7
    //   184: goto -> 187
    //   187: iload #7
    //   189: ifne -> 205
    //   192: fload_2
    //   193: fconst_0
    //   194: fcmpl
    //   195: ifne -> 205
    //   198: fload #4
    //   200: fconst_0
    //   201: fcmpl
    //   202: ifeq -> 209
    //   205: aload_0
    //   206: invokestatic M : (Landroid/view/View;)V
    //   209: return
  }
  
  private void recoverFocusFromState() {
    if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
      View view1;
      if (getDescendantFocusability() == 131072 && isFocused())
        return; 
      if (!isFocused()) {
        view1 = getFocusedChild();
        if (IGNORE_DETACHED_FOCUSED_CHILD && (view1.getParent() == null || !view1.hasFocus())) {
          if (this.mChildHelper.a() == 0) {
            requestFocus();
            return;
          } 
        } else if (!this.mChildHelper.c(view1)) {
          return;
        } 
      } 
      long l1 = this.mState.n;
      View view2 = null;
      if (l1 != -1L && this.mAdapter.c()) {
        view1 = (View)findViewHolderForItemId(this.mState.n);
      } else {
        view1 = null;
      } 
      if (view1 == null || this.mChildHelper.c(((d0)view1).a) || !((d0)view1).a.hasFocusable()) {
        view1 = view2;
        if (this.mChildHelper.a() > 0)
          view1 = findNextViewToFocus(); 
      } else {
        view1 = ((d0)view1).a;
      } 
      if (view1 != null) {
        int i = this.mState.o;
        if (i != -1L) {
          view2 = view1.findViewById(i);
          if (view2 != null && view2.isFocusable())
            view1 = view2; 
        } 
        view1.requestFocus();
      } 
    } 
  }
  
  private void releaseGlows() {
    EdgeEffect edgeEffect = this.mLeftGlow;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool2 = this.mLeftGlow.isFinished();
    } else {
      bool2 = false;
    } 
    edgeEffect = this.mTopGlow;
    boolean bool1 = bool2;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool1 = bool2 | this.mTopGlow.isFinished();
    } 
    edgeEffect = this.mRightGlow;
    boolean bool2 = bool1;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool2 = bool1 | this.mRightGlow.isFinished();
    } 
    edgeEffect = this.mBottomGlow;
    bool1 = bool2;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool1 = bool2 | this.mBottomGlow.isFinished();
    } 
    if (bool1)
      b.g.m.v.M((View)this); 
  }
  
  private void requestChildOnScreen(View paramView1, View paramView2) {
    boolean bool;
    View view;
    if (paramView2 != null) {
      view = paramView2;
    } else {
      view = paramView1;
    } 
    this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (layoutParams instanceof p) {
      p p = (p)layoutParams;
      if (!p.c) {
        Rect rect1 = p.b;
        Rect rect2 = this.mTempRect;
        rect2.left -= rect1.left;
        rect2.right += rect1.right;
        rect2.top -= rect1.top;
        rect2.bottom += rect1.bottom;
      } 
    } 
    if (paramView2 != null) {
      offsetDescendantRectToMyCoords(paramView2, this.mTempRect);
      offsetRectIntoDescendantCoords(paramView1, this.mTempRect);
    } 
    o o1 = this.mLayout;
    Rect rect = this.mTempRect;
    boolean bool1 = this.mFirstLayoutComplete;
    if (paramView2 == null) {
      bool = true;
    } else {
      bool = false;
    } 
    o1.a(this, paramView1, rect, bool1 ^ true, bool);
  }
  
  private void resetFocusInfo() {
    a0 a01 = this.mState;
    a01.n = -1L;
    a01.m = -1;
    a01.o = -1;
  }
  
  private void resetScroll() {
    VelocityTracker velocityTracker = this.mVelocityTracker;
    if (velocityTracker != null)
      velocityTracker.clear(); 
    stopNestedScroll(0);
    releaseGlows();
  }
  
  private void saveFocusInfo() {
    int i;
    long l1;
    d0 d01;
    boolean bool = this.mPreserveFocusAfterLayout;
    d0 d02 = null;
    if (bool && hasFocus() && this.mAdapter != null) {
      d01 = (d0)getFocusedChild();
    } else {
      d01 = null;
    } 
    if (d01 == null) {
      d01 = d02;
    } else {
      d01 = findContainingViewHolder((View)d01);
    } 
    if (d01 == null) {
      resetFocusInfo();
      return;
    } 
    a0 a01 = this.mState;
    if (this.mAdapter.c()) {
      l1 = d01.g();
    } else {
      l1 = -1L;
    } 
    a01.n = l1;
    a01 = this.mState;
    if (this.mDataSetHasChangedAfterLayout) {
      i = -1;
    } else if (d01.q()) {
      i = d01.d;
    } else {
      i = d01.f();
    } 
    a01.m = i;
    this.mState.o = getDeepestFocusedViewWithId(d01.a);
  }
  
  private void setAdapterInternal(g paramg, boolean paramBoolean1, boolean paramBoolean2) {
    g g1 = this.mAdapter;
    if (g1 != null) {
      g1.b(this.mObserver);
      this.mAdapter.b(this);
    } 
    if (!paramBoolean1 || paramBoolean2)
      removeAndRecycleViews(); 
    this.mAdapterHelper.f();
    g1 = this.mAdapter;
    this.mAdapter = paramg;
    if (paramg != null) {
      paramg.a(this.mObserver);
      paramg.a(this);
    } 
    o o1 = this.mLayout;
    if (o1 != null)
      o1.a(g1, this.mAdapter); 
    this.mRecycler.a(g1, this.mAdapter, paramBoolean1);
    this.mState.g = true;
  }
  
  private void stopScrollersInternal() {
    this.mViewFlinger.b();
    o o1 = this.mLayout;
    if (o1 != null)
      o1.C(); 
  }
  
  void absorbGlows(int paramInt1, int paramInt2) {
    if (paramInt1 < 0) {
      ensureLeftGlow();
      if (this.mLeftGlow.isFinished())
        this.mLeftGlow.onAbsorb(-paramInt1); 
    } else if (paramInt1 > 0) {
      ensureRightGlow();
      if (this.mRightGlow.isFinished())
        this.mRightGlow.onAbsorb(paramInt1); 
    } 
    if (paramInt2 < 0) {
      ensureTopGlow();
      if (this.mTopGlow.isFinished())
        this.mTopGlow.onAbsorb(-paramInt2); 
    } else if (paramInt2 > 0) {
      ensureBottomGlow();
      if (this.mBottomGlow.isFinished())
        this.mBottomGlow.onAbsorb(paramInt2); 
    } 
    if (paramInt1 != 0 || paramInt2 != 0)
      b.g.m.v.M((View)this); 
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    o o1 = this.mLayout;
    if (o1 == null || !o1.a(this, paramArrayList, paramInt1, paramInt2))
      super.addFocusables(paramArrayList, paramInt1, paramInt2); 
  }
  
  public void addItemDecoration(n paramn) {
    addItemDecoration(paramn, -1);
  }
  
  public void addItemDecoration(n paramn, int paramInt) {
    o o1 = this.mLayout;
    if (o1 != null)
      o1.a("Cannot add item decoration during a scroll  or layout"); 
    if (this.mItemDecorations.isEmpty())
      setWillNotDraw(false); 
    if (paramInt < 0) {
      this.mItemDecorations.add(paramn);
    } else {
      this.mItemDecorations.add(paramInt, paramn);
    } 
    markItemDecorInsetsDirty();
    requestLayout();
  }
  
  public void addOnChildAttachStateChangeListener(q paramq) {
    if (this.mOnChildAttachStateListeners == null)
      this.mOnChildAttachStateListeners = new ArrayList<q>(); 
    this.mOnChildAttachStateListeners.add(paramq);
  }
  
  public void addOnItemTouchListener(s params) {
    this.mOnItemTouchListeners.add(params);
  }
  
  public void addOnScrollListener(t paramt) {
    if (this.mScrollListeners == null)
      this.mScrollListeners = new ArrayList<t>(); 
    this.mScrollListeners.add(paramt);
  }
  
  void animateAppearance(d0 paramd0, l.c paramc1, l.c paramc2) {
    paramd0.a(false);
    if (this.mItemAnimator.a(paramd0, paramc1, paramc2))
      postAnimationRunner(); 
  }
  
  void animateDisappearance(d0 paramd0, l.c paramc1, l.c paramc2) {
    addAnimatingView(paramd0);
    paramd0.a(false);
    if (this.mItemAnimator.b(paramd0, paramc1, paramc2))
      postAnimationRunner(); 
  }
  
  void assertInLayoutOrScroll(String paramString) {
    if (!isComputingLayout()) {
      StringBuilder stringBuilder1;
      if (paramString == null) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
        stringBuilder1.append(exceptionLabel());
        throw new IllegalStateException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append((String)stringBuilder1);
      stringBuilder2.append(exceptionLabel());
      throw new IllegalStateException(stringBuilder2.toString());
    } 
  }
  
  void assertNotInLayoutOrScroll(String paramString) {
    if (isComputingLayout()) {
      StringBuilder stringBuilder;
      if (paramString == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
        stringBuilder.append(exceptionLabel());
        throw new IllegalStateException(stringBuilder.toString());
      } 
      throw new IllegalStateException(stringBuilder);
    } 
    if (this.mDispatchScrollCounter > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(exceptionLabel());
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder.toString()));
    } 
  }
  
  boolean canReuseUpdatedViewHolder(d0 paramd0) {
    l l1 = this.mItemAnimator;
    return (l1 == null || l1.a(paramd0, paramd0.k()));
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof p && this.mLayout.a((p)paramLayoutParams));
  }
  
  void clearOldPositions() {
    int n = this.mChildHelper.b();
    for (int i = 0; i < n; i++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
      if (!d0.y())
        d0.a(); 
    } 
    this.mRecycler.b();
  }
  
  public void clearOnChildAttachStateChangeListeners() {
    List<q> list = this.mOnChildAttachStateListeners;
    if (list != null)
      list.clear(); 
  }
  
  public void clearOnScrollListeners() {
    List<t> list = this.mScrollListeners;
    if (list != null)
      list.clear(); 
  }
  
  public int computeHorizontalScrollExtent() {
    o o1 = this.mLayout;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.a())
      i = this.mLayout.a(this.mState); 
    return i;
  }
  
  public int computeHorizontalScrollOffset() {
    o o1 = this.mLayout;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.a())
      i = this.mLayout.b(this.mState); 
    return i;
  }
  
  public int computeHorizontalScrollRange() {
    o o1 = this.mLayout;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.a())
      i = this.mLayout.c(this.mState); 
    return i;
  }
  
  public int computeVerticalScrollExtent() {
    o o1 = this.mLayout;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.b())
      i = this.mLayout.d(this.mState); 
    return i;
  }
  
  public int computeVerticalScrollOffset() {
    o o1 = this.mLayout;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.b())
      i = this.mLayout.e(this.mState); 
    return i;
  }
  
  public int computeVerticalScrollRange() {
    o o1 = this.mLayout;
    int i = 0;
    if (o1 == null)
      return 0; 
    if (o1.b())
      i = this.mLayout.f(this.mState); 
    return i;
  }
  
  void considerReleasingGlowsOnScroll(int paramInt1, int paramInt2) {
    EdgeEffect edgeEffect = this.mLeftGlow;
    if (edgeEffect != null && !edgeEffect.isFinished() && paramInt1 > 0) {
      this.mLeftGlow.onRelease();
      bool2 = this.mLeftGlow.isFinished();
    } else {
      bool2 = false;
    } 
    edgeEffect = this.mRightGlow;
    boolean bool1 = bool2;
    if (edgeEffect != null) {
      bool1 = bool2;
      if (!edgeEffect.isFinished()) {
        bool1 = bool2;
        if (paramInt1 < 0) {
          this.mRightGlow.onRelease();
          bool1 = bool2 | this.mRightGlow.isFinished();
        } 
      } 
    } 
    edgeEffect = this.mTopGlow;
    boolean bool2 = bool1;
    if (edgeEffect != null) {
      bool2 = bool1;
      if (!edgeEffect.isFinished()) {
        bool2 = bool1;
        if (paramInt2 > 0) {
          this.mTopGlow.onRelease();
          bool2 = bool1 | this.mTopGlow.isFinished();
        } 
      } 
    } 
    edgeEffect = this.mBottomGlow;
    bool1 = bool2;
    if (edgeEffect != null) {
      bool1 = bool2;
      if (!edgeEffect.isFinished()) {
        bool1 = bool2;
        if (paramInt2 < 0) {
          this.mBottomGlow.onRelease();
          bool1 = bool2 | this.mBottomGlow.isFinished();
        } 
      } 
    } 
    if (bool1)
      b.g.m.v.M((View)this); 
  }
  
  void consumePendingUpdateOperations() {
    if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
      b.g.j.j.a("RV FullInvalidate");
      dispatchLayout();
      b.g.j.j.a();
      return;
    } 
    if (!this.mAdapterHelper.c())
      return; 
    if (this.mAdapterHelper.c(4) && !this.mAdapterHelper.c(11)) {
      b.g.j.j.a("RV PartialInvalidate");
      startInterceptRequestLayout();
      onEnterLayoutOrScroll();
      this.mAdapterHelper.e();
      if (!this.mLayoutWasDefered)
        if (hasUpdatedView()) {
          dispatchLayout();
        } else {
          this.mAdapterHelper.a();
        }  
      stopInterceptRequestLayout(true);
      onExitLayoutOrScroll();
    } else if (this.mAdapterHelper.c()) {
      b.g.j.j.a("RV FullInvalidate");
      dispatchLayout();
    } else {
      return;
    } 
    b.g.j.j.a();
  }
  
  void defaultOnMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(o.a(paramInt1, getPaddingLeft() + getPaddingRight(), b.g.m.v.r((View)this)), o.a(paramInt2, getPaddingTop() + getPaddingBottom(), b.g.m.v.q((View)this)));
  }
  
  void dispatchChildAttached(View paramView) {
    d0 d0 = getChildViewHolderInt(paramView);
    onChildAttachedToWindow(paramView);
    g<d0> g1 = this.mAdapter;
    if (g1 != null && d0 != null)
      g1.b(d0); 
    List<q> list = this.mOnChildAttachStateListeners;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((q)this.mOnChildAttachStateListeners.get(i)).a(paramView);  
  }
  
  void dispatchChildDetached(View paramView) {
    d0 d0 = getChildViewHolderInt(paramView);
    onChildDetachedFromWindow(paramView);
    g<d0> g1 = this.mAdapter;
    if (g1 != null && d0 != null)
      g1.c(d0); 
    List<q> list = this.mOnChildAttachStateListeners;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((q)this.mOnChildAttachStateListeners.get(i)).b(paramView);  
  }
  
  void dispatchLayout() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mAdapter : Landroidx/recyclerview/widget/RecyclerView$g;
    //   4: ifnonnull -> 19
    //   7: ldc_w 'No adapter attached; skipping layout'
    //   10: astore_1
    //   11: ldc 'RecyclerView'
    //   13: aload_1
    //   14: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   17: pop
    //   18: return
    //   19: aload_0
    //   20: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   23: ifnonnull -> 33
    //   26: ldc_w 'No layout manager attached; skipping layout'
    //   29: astore_1
    //   30: goto -> 11
    //   33: aload_0
    //   34: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
    //   37: astore_1
    //   38: aload_1
    //   39: iconst_0
    //   40: putfield j : Z
    //   43: aload_1
    //   44: getfield e : I
    //   47: iconst_1
    //   48: if_icmpne -> 70
    //   51: aload_0
    //   52: invokespecial dispatchLayoutStep1 : ()V
    //   55: aload_0
    //   56: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   59: aload_0
    //   60: invokevirtual e : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   63: aload_0
    //   64: invokespecial dispatchLayoutStep2 : ()V
    //   67: goto -> 119
    //   70: aload_0
    //   71: getfield mAdapterHelper : Landroidx/recyclerview/widget/a;
    //   74: invokevirtual d : ()Z
    //   77: ifne -> 55
    //   80: aload_0
    //   81: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   84: invokevirtual r : ()I
    //   87: aload_0
    //   88: invokevirtual getWidth : ()I
    //   91: if_icmpne -> 55
    //   94: aload_0
    //   95: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   98: invokevirtual h : ()I
    //   101: aload_0
    //   102: invokevirtual getHeight : ()I
    //   105: if_icmpeq -> 111
    //   108: goto -> 55
    //   111: aload_0
    //   112: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   115: aload_0
    //   116: invokevirtual e : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   119: aload_0
    //   120: invokespecial dispatchLayoutStep3 : ()V
    //   123: return
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, paramInt3);
  }
  
  public final void dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint1, paramInt5, paramArrayOfint2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint, int paramInt5) {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint, paramInt5);
  }
  
  void dispatchOnScrollStateChanged(int paramInt) {
    o o1 = this.mLayout;
    if (o1 != null)
      o1.g(paramInt); 
    onScrollStateChanged(paramInt);
    t t1 = this.mScrollListener;
    if (t1 != null)
      t1.a(this, paramInt); 
    List<t> list = this.mScrollListeners;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((t)this.mScrollListeners.get(i)).a(this, paramInt);  
  }
  
  void dispatchOnScrolled(int paramInt1, int paramInt2) {
    this.mDispatchScrollCounter++;
    int i = getScrollX();
    int n = getScrollY();
    onScrollChanged(i, n, i - paramInt1, n - paramInt2);
    onScrolled(paramInt1, paramInt2);
    t t1 = this.mScrollListener;
    if (t1 != null)
      t1.a(this, paramInt1, paramInt2); 
    List<t> list = this.mScrollListeners;
    if (list != null)
      for (i = list.size() - 1; i >= 0; i--)
        ((t)this.mScrollListeners.get(i)).a(this, paramInt1, paramInt2);  
    this.mDispatchScrollCounter--;
  }
  
  void dispatchPendingImportantForAccessibilityChanges() {
    for (int i = this.mPendingAccessibilityImportanceChange.size() - 1; i >= 0; i--) {
      d0 d0 = this.mPendingAccessibilityImportanceChange.get(i);
      if (d0.a.getParent() == this && !d0.y()) {
        int n = d0.q;
        if (n != -1) {
          b.g.m.v.h(d0.a, n);
          d0.q = -1;
        } 
      } 
    } 
    this.mPendingAccessibilityImportanceChange.clear();
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    onPopulateAccessibilityEvent(paramAccessibilityEvent);
    return true;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray) {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    int n = this.mItemDecorations.size();
    boolean bool = false;
    int i;
    for (i = 0; i < n; i++)
      ((n)this.mItemDecorations.get(i)).b(paramCanvas, this, this.mState); 
    EdgeEffect edgeEffect = this.mLeftGlow;
    if (edgeEffect != null && !edgeEffect.isFinished()) {
      int i1 = paramCanvas.save();
      if (this.mClipToPadding) {
        i = getPaddingBottom();
      } else {
        i = 0;
      } 
      paramCanvas.rotate(270.0F);
      paramCanvas.translate((-getHeight() + i), 0.0F);
      edgeEffect = this.mLeftGlow;
      if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
        n = 1;
      } else {
        n = 0;
      } 
      paramCanvas.restoreToCount(i1);
    } else {
      n = 0;
    } 
    edgeEffect = this.mTopGlow;
    i = n;
    if (edgeEffect != null) {
      i = n;
      if (!edgeEffect.isFinished()) {
        int i1 = paramCanvas.save();
        if (this.mClipToPadding)
          paramCanvas.translate(getPaddingLeft(), getPaddingTop()); 
        edgeEffect = this.mTopGlow;
        if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
          i = 1;
        } else {
          i = 0;
        } 
        i = n | i;
        paramCanvas.restoreToCount(i1);
      } 
    } 
    edgeEffect = this.mRightGlow;
    n = i;
    if (edgeEffect != null) {
      n = i;
      if (!edgeEffect.isFinished()) {
        int i1 = paramCanvas.save();
        int i2 = getWidth();
        if (this.mClipToPadding) {
          n = getPaddingTop();
        } else {
          n = 0;
        } 
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-n, -i2);
        edgeEffect = this.mRightGlow;
        if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
          n = 1;
        } else {
          n = 0;
        } 
        n = i | n;
        paramCanvas.restoreToCount(i1);
      } 
    } 
    edgeEffect = this.mBottomGlow;
    if (edgeEffect != null && !edgeEffect.isFinished()) {
      float f;
      int i1 = paramCanvas.save();
      paramCanvas.rotate(180.0F);
      if (this.mClipToPadding) {
        f = (-getWidth() + getPaddingRight());
        i = -getHeight() + getPaddingBottom();
      } else {
        f = -getWidth();
        i = -getHeight();
      } 
      paramCanvas.translate(f, i);
      edgeEffect = this.mBottomGlow;
      i = bool;
      if (edgeEffect != null) {
        i = bool;
        if (edgeEffect.draw(paramCanvas))
          i = 1; 
      } 
      i |= n;
      paramCanvas.restoreToCount(i1);
    } else {
      i = n;
    } 
    n = i;
    if (i == 0) {
      n = i;
      if (this.mItemAnimator != null) {
        n = i;
        if (this.mItemDecorations.size() > 0) {
          n = i;
          if (this.mItemAnimator.g())
            n = 1; 
        } 
      } 
    } 
    if (n != 0)
      b.g.m.v.M((View)this); 
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  void ensureBottomGlow() {
    int i;
    int n;
    EdgeEffect edgeEffect;
    if (this.mBottomGlow != null)
      return; 
    this.mBottomGlow = this.mEdgeEffectFactory.a(this, 3);
    if (this.mClipToPadding) {
      edgeEffect = this.mBottomGlow;
      i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      n = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    } else {
      edgeEffect = this.mBottomGlow;
      i = getMeasuredWidth();
      n = getMeasuredHeight();
    } 
    edgeEffect.setSize(i, n);
  }
  
  void ensureLeftGlow() {
    int i;
    int n;
    EdgeEffect edgeEffect;
    if (this.mLeftGlow != null)
      return; 
    this.mLeftGlow = this.mEdgeEffectFactory.a(this, 0);
    if (this.mClipToPadding) {
      edgeEffect = this.mLeftGlow;
      i = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      n = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    } else {
      edgeEffect = this.mLeftGlow;
      i = getMeasuredHeight();
      n = getMeasuredWidth();
    } 
    edgeEffect.setSize(i, n);
  }
  
  void ensureRightGlow() {
    int i;
    int n;
    EdgeEffect edgeEffect;
    if (this.mRightGlow != null)
      return; 
    this.mRightGlow = this.mEdgeEffectFactory.a(this, 2);
    if (this.mClipToPadding) {
      edgeEffect = this.mRightGlow;
      i = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      n = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    } else {
      edgeEffect = this.mRightGlow;
      i = getMeasuredHeight();
      n = getMeasuredWidth();
    } 
    edgeEffect.setSize(i, n);
  }
  
  void ensureTopGlow() {
    int i;
    int n;
    EdgeEffect edgeEffect;
    if (this.mTopGlow != null)
      return; 
    this.mTopGlow = this.mEdgeEffectFactory.a(this, 1);
    if (this.mClipToPadding) {
      edgeEffect = this.mTopGlow;
      i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      n = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    } else {
      edgeEffect = this.mTopGlow;
      i = getMeasuredWidth();
      n = getMeasuredHeight();
    } 
    edgeEffect.setSize(i, n);
  }
  
  String exceptionLabel() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" ");
    stringBuilder.append(toString());
    stringBuilder.append(", adapter:");
    stringBuilder.append(this.mAdapter);
    stringBuilder.append(", layout:");
    stringBuilder.append(this.mLayout);
    stringBuilder.append(", context:");
    stringBuilder.append(getContext());
    return stringBuilder.toString();
  }
  
  final void fillRemainingScrollValues(a0 parama0) {
    if (getScrollState() == 2) {
      OverScroller overScroller = this.mViewFlinger.e;
      parama0.p = overScroller.getFinalX() - overScroller.getCurrX();
      parama0.q = overScroller.getFinalY() - overScroller.getCurrY();
      return;
    } 
    parama0.p = 0;
    parama0.q = 0;
  }
  
  public View findChildViewUnder(float paramFloat1, float paramFloat2) {
    int i;
    for (i = this.mChildHelper.a() - 1; i >= 0; i--) {
      View view = this.mChildHelper.c(i);
      float f1 = view.getTranslationX();
      float f2 = view.getTranslationY();
      if (paramFloat1 >= view.getLeft() + f1 && paramFloat1 <= view.getRight() + f1 && paramFloat2 >= view.getTop() + f2 && paramFloat2 <= view.getBottom() + f2)
        return view; 
    } 
    return null;
  }
  
  public View findContainingItemView(View paramView) {
    ViewParent viewParent;
    while (true) {
      viewParent = paramView.getParent();
      if (viewParent != null && viewParent != this && viewParent instanceof View) {
        paramView = (View)viewParent;
        continue;
      } 
      break;
    } 
    return (viewParent == this) ? paramView : null;
  }
  
  public d0 findContainingViewHolder(View paramView) {
    paramView = findContainingItemView(paramView);
    return (paramView == null) ? null : getChildViewHolder(paramView);
  }
  
  public d0 findViewHolderForAdapterPosition(int paramInt) {
    boolean bool = this.mDataSetHasChangedAfterLayout;
    d0 d0 = null;
    if (bool)
      return null; 
    int n = this.mChildHelper.b();
    int i = 0;
    while (i < n) {
      d0 d02 = getChildViewHolderInt(this.mChildHelper.d(i));
      d0 d01 = d0;
      if (d02 != null) {
        d01 = d0;
        if (!d02.q()) {
          d01 = d0;
          if (getAdapterPositionFor(d02) == paramInt)
            if (this.mChildHelper.c(d02.a)) {
              d01 = d02;
            } else {
              return d02;
            }  
        } 
      } 
      i++;
      d0 = d01;
    } 
    return d0;
  }
  
  public d0 findViewHolderForItemId(long paramLong) {
    g g1 = this.mAdapter;
    d0 d02 = null;
    d0 d01 = null;
    if (g1 != null) {
      if (!g1.c())
        return null; 
      int n = this.mChildHelper.b();
      int i = 0;
      while (true) {
        d02 = d01;
        if (i < n) {
          d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
          d02 = d01;
          if (d0 != null) {
            d02 = d01;
            if (!d0.q()) {
              d02 = d01;
              if (d0.g() == paramLong)
                if (this.mChildHelper.c(d0.a)) {
                  d02 = d0;
                } else {
                  return d0;
                }  
            } 
          } 
          i++;
          d01 = d02;
          continue;
        } 
        break;
      } 
    } 
    return d02;
  }
  
  public d0 findViewHolderForLayoutPosition(int paramInt) {
    return findViewHolderForPosition(paramInt, false);
  }
  
  @Deprecated
  public d0 findViewHolderForPosition(int paramInt) {
    return findViewHolderForPosition(paramInt, false);
  }
  
  d0 findViewHolderForPosition(int paramInt, boolean paramBoolean) {
    int n = this.mChildHelper.b();
    Object object = null;
    int i = 0;
    while (i < n) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
      Object object1 = object;
      if (d0 != null) {
        object1 = object;
        if (!d0.q()) {
          if (paramBoolean) {
            if (d0.c != paramInt) {
              object1 = object;
              continue;
            } 
          } else if (d0.i() != paramInt) {
            object1 = object;
            continue;
          } 
          if (this.mChildHelper.c(d0.a)) {
            object1 = d0;
          } else {
            return d0;
          } 
        } 
      } 
      continue;
      i++;
      object = SYNTHETIC_LOCAL_VARIABLE_6;
    } 
    return (d0)object;
  }
  
  public boolean fling(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   4: astore #11
    //   6: iconst_0
    //   7: istore #7
    //   9: aload #11
    //   11: ifnonnull -> 25
    //   14: ldc 'RecyclerView'
    //   16: ldc_w 'Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.'
    //   19: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   22: pop
    //   23: iconst_0
    //   24: ireturn
    //   25: aload_0
    //   26: getfield mLayoutSuppressed : Z
    //   29: ifeq -> 34
    //   32: iconst_0
    //   33: ireturn
    //   34: aload #11
    //   36: invokevirtual a : ()Z
    //   39: istore #9
    //   41: aload_0
    //   42: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   45: invokevirtual b : ()Z
    //   48: istore #10
    //   50: iload #9
    //   52: ifeq -> 69
    //   55: iload_1
    //   56: istore #5
    //   58: iload_1
    //   59: invokestatic abs : (I)I
    //   62: aload_0
    //   63: getfield mMinFlingVelocity : I
    //   66: if_icmpge -> 72
    //   69: iconst_0
    //   70: istore #5
    //   72: iload #10
    //   74: ifeq -> 91
    //   77: iload_2
    //   78: istore #6
    //   80: iload_2
    //   81: invokestatic abs : (I)I
    //   84: aload_0
    //   85: getfield mMinFlingVelocity : I
    //   88: if_icmpge -> 94
    //   91: iconst_0
    //   92: istore #6
    //   94: iload #5
    //   96: ifne -> 106
    //   99: iload #6
    //   101: ifne -> 106
    //   104: iconst_0
    //   105: ireturn
    //   106: iload #5
    //   108: i2f
    //   109: fstore_3
    //   110: iload #6
    //   112: i2f
    //   113: fstore #4
    //   115: aload_0
    //   116: fload_3
    //   117: fload #4
    //   119: invokevirtual dispatchNestedPreFling : (FF)Z
    //   122: ifne -> 260
    //   125: iload #9
    //   127: ifne -> 144
    //   130: iload #10
    //   132: ifeq -> 138
    //   135: goto -> 144
    //   138: iconst_0
    //   139: istore #8
    //   141: goto -> 147
    //   144: iconst_1
    //   145: istore #8
    //   147: aload_0
    //   148: fload_3
    //   149: fload #4
    //   151: iload #8
    //   153: invokevirtual dispatchNestedFling : (FFZ)Z
    //   156: pop
    //   157: aload_0
    //   158: getfield mOnFlingListener : Landroidx/recyclerview/widget/RecyclerView$r;
    //   161: astore #11
    //   163: aload #11
    //   165: ifnull -> 182
    //   168: aload #11
    //   170: iload #5
    //   172: iload #6
    //   174: invokevirtual a : (II)Z
    //   177: ifeq -> 182
    //   180: iconst_1
    //   181: ireturn
    //   182: iload #8
    //   184: ifeq -> 260
    //   187: iload #7
    //   189: istore_1
    //   190: iload #9
    //   192: ifeq -> 197
    //   195: iconst_1
    //   196: istore_1
    //   197: iload_1
    //   198: istore_2
    //   199: iload #10
    //   201: ifeq -> 208
    //   204: iload_1
    //   205: iconst_2
    //   206: ior
    //   207: istore_2
    //   208: aload_0
    //   209: iload_2
    //   210: iconst_1
    //   211: invokevirtual startNestedScroll : (II)Z
    //   214: pop
    //   215: aload_0
    //   216: getfield mMaxFlingVelocity : I
    //   219: istore_1
    //   220: iload_1
    //   221: ineg
    //   222: iload #5
    //   224: iload_1
    //   225: invokestatic min : (II)I
    //   228: invokestatic max : (II)I
    //   231: istore_1
    //   232: aload_0
    //   233: getfield mMaxFlingVelocity : I
    //   236: istore_2
    //   237: iload_2
    //   238: ineg
    //   239: iload #6
    //   241: iload_2
    //   242: invokestatic min : (II)I
    //   245: invokestatic max : (II)I
    //   248: istore_2
    //   249: aload_0
    //   250: getfield mViewFlinger : Landroidx/recyclerview/widget/RecyclerView$c0;
    //   253: iload_1
    //   254: iload_2
    //   255: invokevirtual a : (II)V
    //   258: iconst_1
    //   259: ireturn
    //   260: iconst_0
    //   261: ireturn
  }
  
  public View focusSearch(View paramView, int paramInt) {
    byte b1;
    View view1;
    View view2 = this.mLayout.d(paramView, paramInt);
    if (view2 != null)
      return view2; 
    if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    FocusFinder focusFinder = FocusFinder.getInstance();
    if (b1 && (paramInt == 2 || paramInt == 1)) {
      if (this.mLayout.b()) {
        byte b3;
        byte b4;
        if (paramInt == 2) {
          b3 = 130;
        } else {
          b3 = 33;
        } 
        if (focusFinder.findNextFocus(this, paramView, b3) == null) {
          b4 = 1;
        } else {
          b4 = 0;
        } 
        b1 = b4;
        if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
          paramInt = b3;
          b1 = b4;
        } 
      } else {
        b1 = 0;
      } 
      byte b2 = b1;
      int i = paramInt;
      if (!b1) {
        b2 = b1;
        i = paramInt;
        if (this.mLayout.a()) {
          byte b3;
          if (this.mLayout.k() == 1) {
            b1 = 1;
          } else {
            b1 = 0;
          } 
          if (paramInt == 2) {
            b3 = 1;
          } else {
            b3 = 0;
          } 
          if ((b1 ^ b3) != 0) {
            b1 = 66;
          } else {
            b1 = 17;
          } 
          if (focusFinder.findNextFocus(this, paramView, b1) == null) {
            b3 = 1;
          } else {
            b3 = 0;
          } 
          b2 = b3;
          i = paramInt;
          if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
            i = b1;
            b2 = b3;
          } 
        } 
      } 
      if (b2 != 0) {
        consumePendingUpdateOperations();
        if (findContainingItemView(paramView) == null)
          return null; 
        startInterceptRequestLayout();
        this.mLayout.a(paramView, i, this.mRecycler, this.mState);
        stopInterceptRequestLayout(false);
      } 
      view1 = focusFinder.findNextFocus(this, paramView, i);
      paramInt = i;
    } else {
      view1 = view1.findNextFocus(this, paramView, paramInt);
      if (view1 == null && b1 != 0) {
        consumePendingUpdateOperations();
        if (findContainingItemView(paramView) == null)
          return null; 
        startInterceptRequestLayout();
        view1 = this.mLayout.a(paramView, paramInt, this.mRecycler, this.mState);
        stopInterceptRequestLayout(false);
      } 
    } 
    if (view1 != null && !view1.hasFocusable()) {
      if (getFocusedChild() == null)
        return super.focusSearch(paramView, paramInt); 
      requestChildOnScreen(view1, null);
      return paramView;
    } 
    return isPreferredNextFocus(paramView, view1, paramInt) ? view1 : super.focusSearch(paramView, paramInt);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    o o1 = this.mLayout;
    if (o1 != null)
      return (ViewGroup.LayoutParams)o1.c(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecyclerView has no LayoutManager");
    stringBuilder.append(exceptionLabel());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    o o1 = this.mLayout;
    if (o1 != null)
      return (ViewGroup.LayoutParams)o1.a(getContext(), paramAttributeSet); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecyclerView has no LayoutManager");
    stringBuilder.append(exceptionLabel());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    o o1 = this.mLayout;
    if (o1 != null)
      return (ViewGroup.LayoutParams)o1.a(paramLayoutParams); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecyclerView has no LayoutManager");
    stringBuilder.append(exceptionLabel());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public CharSequence getAccessibilityClassName() {
    return "androidx.recyclerview.widget.RecyclerView";
  }
  
  public g getAdapter() {
    return this.mAdapter;
  }
  
  int getAdapterPositionFor(d0 paramd0) {
    return (paramd0.b(524) || !paramd0.n()) ? -1 : this.mAdapterHelper.a(paramd0.c);
  }
  
  public int getBaseline() {
    o o1 = this.mLayout;
    return (o1 != null) ? o1.d() : super.getBaseline();
  }
  
  long getChangedHolderKey(d0 paramd0) {
    return this.mAdapter.c() ? paramd0.g() : paramd0.c;
  }
  
  public int getChildAdapterPosition(View paramView) {
    d0 d0 = getChildViewHolderInt(paramView);
    return (d0 != null) ? d0.f() : -1;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    j j1 = this.mChildDrawingOrderCallback;
    return (j1 == null) ? super.getChildDrawingOrder(paramInt1, paramInt2) : j1.a(paramInt1, paramInt2);
  }
  
  public long getChildItemId(View paramView) {
    g g1 = this.mAdapter;
    long l2 = -1L;
    long l1 = l2;
    if (g1 != null) {
      if (!g1.c())
        return -1L; 
      d0 d0 = getChildViewHolderInt(paramView);
      l1 = l2;
      if (d0 != null)
        l1 = d0.g(); 
    } 
    return l1;
  }
  
  public int getChildLayoutPosition(View paramView) {
    d0 d0 = getChildViewHolderInt(paramView);
    return (d0 != null) ? d0.i() : -1;
  }
  
  @Deprecated
  public int getChildPosition(View paramView) {
    return getChildAdapterPosition(paramView);
  }
  
  public d0 getChildViewHolder(View paramView) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent == null || viewParent == this)
      return getChildViewHolderInt(paramView); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a direct child of ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public boolean getClipToPadding() {
    return this.mClipToPadding;
  }
  
  public l getCompatAccessibilityDelegate() {
    return this.mAccessibilityDelegate;
  }
  
  public void getDecoratedBoundsWithMargins(View paramView, Rect paramRect) {
    getDecoratedBoundsWithMarginsInt(paramView, paramRect);
  }
  
  public k getEdgeEffectFactory() {
    return this.mEdgeEffectFactory;
  }
  
  public l getItemAnimator() {
    return this.mItemAnimator;
  }
  
  Rect getItemDecorInsetsForChild(View paramView) {
    p p = (p)paramView.getLayoutParams();
    if (!p.c)
      return p.b; 
    if (this.mState.d() && (p.b() || p.d()))
      return p.b; 
    Rect rect = p.b;
    rect.set(0, 0, 0, 0);
    int n = this.mItemDecorations.size();
    for (int i = 0; i < n; i++) {
      this.mTempRect.set(0, 0, 0, 0);
      ((n)this.mItemDecorations.get(i)).a(this.mTempRect, paramView, this, this.mState);
      int i1 = rect.left;
      Rect rect1 = this.mTempRect;
      rect.left = i1 + rect1.left;
      rect.top += rect1.top;
      rect.right += rect1.right;
      rect.bottom += rect1.bottom;
    } 
    p.c = false;
    return rect;
  }
  
  public n getItemDecorationAt(int paramInt) {
    int i = getItemDecorationCount();
    if (paramInt >= 0 && paramInt < i)
      return this.mItemDecorations.get(paramInt); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramInt);
    stringBuilder.append(" is an invalid index for size ");
    stringBuilder.append(i);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public int getItemDecorationCount() {
    return this.mItemDecorations.size();
  }
  
  public o getLayoutManager() {
    return this.mLayout;
  }
  
  public int getMaxFlingVelocity() {
    return this.mMaxFlingVelocity;
  }
  
  public int getMinFlingVelocity() {
    return this.mMinFlingVelocity;
  }
  
  long getNanoTime() {
    return ALLOW_THREAD_GAP_WORK ? System.nanoTime() : 0L;
  }
  
  public r getOnFlingListener() {
    return this.mOnFlingListener;
  }
  
  public boolean getPreserveFocusAfterLayout() {
    return this.mPreserveFocusAfterLayout;
  }
  
  public u getRecycledViewPool() {
    return this.mRecycler.d();
  }
  
  public int getScrollState() {
    return this.mScrollState;
  }
  
  public boolean hasFixedSize() {
    return this.mHasFixedSize;
  }
  
  public boolean hasNestedScrollingParent() {
    return getScrollingChildHelper().a();
  }
  
  public boolean hasNestedScrollingParent(int paramInt) {
    return getScrollingChildHelper().a(paramInt);
  }
  
  public boolean hasPendingAdapterUpdates() {
    return (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.c());
  }
  
  void initAdapterManager() {
    this.mAdapterHelper = new a(new f(this));
  }
  
  void initFastScroller(StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2) {
    if (paramStateListDrawable1 != null && paramDrawable1 != null && paramStateListDrawable2 != null && paramDrawable2 != null) {
      Resources resources = getContext().getResources();
      new d(this, paramStateListDrawable1, paramDrawable1, paramStateListDrawable2, paramDrawable2, resources.getDimensionPixelSize(b.o.b.fastscroll_default_thickness), resources.getDimensionPixelSize(b.o.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(b.o.b.fastscroll_margin));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to set fast scroller without both required drawables.");
    stringBuilder.append(exceptionLabel());
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void invalidateGlows() {
    this.mBottomGlow = null;
    this.mTopGlow = null;
    this.mRightGlow = null;
    this.mLeftGlow = null;
  }
  
  public void invalidateItemDecorations() {
    if (this.mItemDecorations.size() == 0)
      return; 
    o o1 = this.mLayout;
    if (o1 != null)
      o1.a("Cannot invalidate item decorations during a scroll or layout"); 
    markItemDecorInsetsDirty();
    requestLayout();
  }
  
  boolean isAccessibilityEnabled() {
    AccessibilityManager accessibilityManager = this.mAccessibilityManager;
    return (accessibilityManager != null && accessibilityManager.isEnabled());
  }
  
  public boolean isAnimating() {
    l l1 = this.mItemAnimator;
    return (l1 != null && l1.g());
  }
  
  public boolean isAttachedToWindow() {
    return this.mIsAttached;
  }
  
  public boolean isComputingLayout() {
    return (this.mLayoutOrScrollCounter > 0);
  }
  
  @Deprecated
  public boolean isLayoutFrozen() {
    return isLayoutSuppressed();
  }
  
  public final boolean isLayoutSuppressed() {
    return this.mLayoutSuppressed;
  }
  
  public boolean isNestedScrollingEnabled() {
    return getScrollingChildHelper().b();
  }
  
  void jumpToPositionForSmoothScroller(int paramInt) {
    if (this.mLayout == null)
      return; 
    setScrollState(2);
    this.mLayout.i(paramInt);
    awakenScrollBars();
  }
  
  void markItemDecorInsetsDirty() {
    int n = this.mChildHelper.b();
    for (int i = 0; i < n; i++)
      ((p)this.mChildHelper.d(i).getLayoutParams()).c = true; 
    this.mRecycler.g();
  }
  
  void markKnownViewsInvalid() {
    int n = this.mChildHelper.b();
    for (int i = 0; i < n; i++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
      if (d0 != null && !d0.y())
        d0.a(6); 
    } 
    markItemDecorInsetsDirty();
    this.mRecycler.h();
  }
  
  public void offsetChildrenHorizontal(int paramInt) {
    int n = this.mChildHelper.a();
    for (int i = 0; i < n; i++)
      this.mChildHelper.c(i).offsetLeftAndRight(paramInt); 
  }
  
  public void offsetChildrenVertical(int paramInt) {
    int n = this.mChildHelper.a();
    for (int i = 0; i < n; i++)
      this.mChildHelper.c(i).offsetTopAndBottom(paramInt); 
  }
  
  void offsetPositionRecordsForInsert(int paramInt1, int paramInt2) {
    int n = this.mChildHelper.b();
    for (int i = 0; i < n; i++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
      if (d0 != null && !d0.y() && d0.c >= paramInt1) {
        d0.a(paramInt2, false);
        this.mState.g = true;
      } 
    } 
    this.mRecycler.a(paramInt1, paramInt2);
    requestLayout();
  }
  
  void offsetPositionRecordsForMove(int paramInt1, int paramInt2) {
    int i;
    int n;
    boolean bool;
    int i2 = this.mChildHelper.b();
    if (paramInt1 < paramInt2) {
      i = paramInt1;
      n = paramInt2;
      bool = true;
    } else {
      n = paramInt1;
      i = paramInt2;
      bool = true;
    } 
    int i1;
    for (i1 = 0; i1 < i2; i1++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i1));
      if (d0 != null) {
        int i3 = d0.c;
        if (i3 >= i && i3 <= n) {
          if (i3 == paramInt1) {
            d0.a(paramInt2 - paramInt1, false);
          } else {
            d0.a(bool, false);
          } 
          this.mState.g = true;
        } 
      } 
    } 
    this.mRecycler.b(paramInt1, paramInt2);
    requestLayout();
  }
  
  void offsetPositionRecordsForRemove(int paramInt1, int paramInt2, boolean paramBoolean) {
    int n = this.mChildHelper.b();
    int i;
    for (i = 0; i < n; i++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
      if (d0 != null && !d0.y()) {
        int i1 = d0.c;
        if (i1 >= paramInt1 + paramInt2) {
          d0.a(-paramInt2, paramBoolean);
        } else if (i1 >= paramInt1) {
          d0.a(paramInt1 - 1, -paramInt2, paramBoolean);
        } else {
          continue;
        } 
        this.mState.g = true;
      } 
      continue;
    } 
    this.mRecycler.a(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  protected void onAttachedToWindow() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial onAttachedToWindow : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield mLayoutOrScrollCounter : I
    //   9: iconst_1
    //   10: istore_2
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield mIsAttached : Z
    //   16: aload_0
    //   17: getfield mFirstLayoutComplete : Z
    //   20: ifeq -> 33
    //   23: aload_0
    //   24: invokevirtual isLayoutRequested : ()Z
    //   27: ifne -> 33
    //   30: goto -> 35
    //   33: iconst_0
    //   34: istore_2
    //   35: aload_0
    //   36: iload_2
    //   37: putfield mFirstLayoutComplete : Z
    //   40: aload_0
    //   41: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   44: astore_3
    //   45: aload_3
    //   46: ifnull -> 54
    //   49: aload_3
    //   50: aload_0
    //   51: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield mPostedAnimatorRunner : Z
    //   59: getstatic androidx/recyclerview/widget/RecyclerView.ALLOW_THREAD_GAP_WORK : Z
    //   62: ifeq -> 162
    //   65: aload_0
    //   66: getstatic androidx/recyclerview/widget/e.g : Ljava/lang/ThreadLocal;
    //   69: invokevirtual get : ()Ljava/lang/Object;
    //   72: checkcast androidx/recyclerview/widget/e
    //   75: putfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   78: aload_0
    //   79: getfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   82: ifnonnull -> 154
    //   85: aload_0
    //   86: new androidx/recyclerview/widget/e
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: putfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   96: aload_0
    //   97: invokestatic k : (Landroid/view/View;)Landroid/view/Display;
    //   100: astore_3
    //   101: aload_0
    //   102: invokevirtual isInEditMode : ()Z
    //   105: ifne -> 128
    //   108: aload_3
    //   109: ifnull -> 128
    //   112: aload_3
    //   113: invokevirtual getRefreshRate : ()F
    //   116: fstore_1
    //   117: fload_1
    //   118: ldc_w 30.0
    //   121: fcmpl
    //   122: iflt -> 128
    //   125: goto -> 132
    //   128: ldc_w 60.0
    //   131: fstore_1
    //   132: aload_0
    //   133: getfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   136: astore_3
    //   137: aload_3
    //   138: ldc_w 1.0E9
    //   141: fload_1
    //   142: fdiv
    //   143: f2l
    //   144: putfield e : J
    //   147: getstatic androidx/recyclerview/widget/e.g : Ljava/lang/ThreadLocal;
    //   150: aload_3
    //   151: invokevirtual set : (Ljava/lang/Object;)V
    //   154: aload_0
    //   155: getfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   158: aload_0
    //   159: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   162: return
  }
  
  public void onChildAttachedToWindow(View paramView) {}
  
  public void onChildDetachedFromWindow(View paramView) {}
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    l l1 = this.mItemAnimator;
    if (l1 != null)
      l1.b(); 
    stopScroll();
    this.mIsAttached = false;
    o o1 = this.mLayout;
    if (o1 != null)
      o1.a(this, this.mRecycler); 
    this.mPendingAccessibilityImportanceChange.clear();
    removeCallbacks(this.mItemAnimatorRunner);
    this.mViewInfoStore.b();
    if (ALLOW_THREAD_GAP_WORK) {
      e e1 = this.mGapWorker;
      if (e1 != null) {
        e1.b(this);
        this.mGapWorker = null;
      } 
    } 
  }
  
  public void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int n = this.mItemDecorations.size();
    for (int i = 0; i < n; i++)
      ((n)this.mItemDecorations.get(i)).a(paramCanvas, this, this.mState); 
  }
  
  void onEnterLayoutOrScroll() {
    this.mLayoutOrScrollCounter++;
  }
  
  void onExitLayoutOrScroll() {
    onExitLayoutOrScroll(true);
  }
  
  void onExitLayoutOrScroll(boolean paramBoolean) {
    this.mLayoutOrScrollCounter--;
    if (this.mLayoutOrScrollCounter < 1) {
      this.mLayoutOrScrollCounter = 0;
      if (paramBoolean) {
        dispatchContentChangedIfNecessary();
        dispatchPendingImportantForAccessibilityChanges();
      } 
    } 
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield mLayoutSuppressed : Z
    //   13: ifeq -> 18
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_1
    //   19: invokevirtual getAction : ()I
    //   22: bipush #8
    //   24: if_icmpne -> 172
    //   27: aload_1
    //   28: invokevirtual getSource : ()I
    //   31: iconst_2
    //   32: iand
    //   33: ifeq -> 87
    //   36: aload_0
    //   37: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   40: invokevirtual b : ()Z
    //   43: ifeq -> 57
    //   46: aload_1
    //   47: bipush #9
    //   49: invokevirtual getAxisValue : (I)F
    //   52: fneg
    //   53: fstore_3
    //   54: goto -> 59
    //   57: fconst_0
    //   58: fstore_3
    //   59: fload_3
    //   60: fstore_2
    //   61: aload_0
    //   62: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   65: invokevirtual a : ()Z
    //   68: ifeq -> 138
    //   71: aload_1
    //   72: bipush #10
    //   74: invokevirtual getAxisValue : (I)F
    //   77: fstore #4
    //   79: fload_3
    //   80: fstore_2
    //   81: fload #4
    //   83: fstore_3
    //   84: goto -> 140
    //   87: aload_1
    //   88: invokevirtual getSource : ()I
    //   91: ldc_w 4194304
    //   94: iand
    //   95: ifeq -> 136
    //   98: aload_1
    //   99: bipush #26
    //   101: invokevirtual getAxisValue : (I)F
    //   104: fstore_3
    //   105: aload_0
    //   106: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   109: invokevirtual b : ()Z
    //   112: ifeq -> 121
    //   115: fload_3
    //   116: fneg
    //   117: fstore_2
    //   118: goto -> 138
    //   121: aload_0
    //   122: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   125: invokevirtual a : ()Z
    //   128: ifeq -> 136
    //   131: fconst_0
    //   132: fstore_2
    //   133: goto -> 140
    //   136: fconst_0
    //   137: fstore_2
    //   138: fconst_0
    //   139: fstore_3
    //   140: fload_2
    //   141: fconst_0
    //   142: fcmpl
    //   143: ifne -> 152
    //   146: fload_3
    //   147: fconst_0
    //   148: fcmpl
    //   149: ifeq -> 172
    //   152: aload_0
    //   153: fload_3
    //   154: aload_0
    //   155: getfield mScaledHorizontalScrollFactor : F
    //   158: fmul
    //   159: f2i
    //   160: fload_2
    //   161: aload_0
    //   162: getfield mScaledVerticalScrollFactor : F
    //   165: fmul
    //   166: f2i
    //   167: aload_1
    //   168: invokevirtual scrollByInternal : (IILandroid/view/MotionEvent;)Z
    //   171: pop
    //   172: iconst_0
    //   173: ireturn
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    StringBuilder stringBuilder;
    boolean bool1 = this.mLayoutSuppressed;
    boolean bool = false;
    if (bool1)
      return false; 
    this.mInterceptingOnItemTouchListener = null;
    if (findInterceptingOnItemTouchListener(paramMotionEvent)) {
      cancelScroll();
      return true;
    } 
    o o1 = this.mLayout;
    if (o1 == null)
      return false; 
    bool1 = o1.a();
    boolean bool2 = this.mLayout.b();
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain(); 
    this.mVelocityTracker.addMovement(paramMotionEvent);
    int n = paramMotionEvent.getActionMasked();
    int i = paramMotionEvent.getActionIndex();
    if (n != 0) {
      if (n != 1) {
        if (n != 2) {
          if (n != 3) {
            if (n != 5) {
              if (n == 6)
                onPointerUp(paramMotionEvent); 
            } else {
              this.mScrollPointerId = paramMotionEvent.getPointerId(i);
              n = (int)(paramMotionEvent.getX(i) + 0.5F);
              this.mLastTouchX = n;
              this.mInitialTouchX = n;
              i = (int)(paramMotionEvent.getY(i) + 0.5F);
              this.mLastTouchY = i;
              this.mInitialTouchY = i;
            } 
          } else {
            cancelScroll();
          } 
        } else {
          n = paramMotionEvent.findPointerIndex(this.mScrollPointerId);
          if (n < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error processing scroll; pointer index for id ");
            stringBuilder.append(this.mScrollPointerId);
            stringBuilder.append(" not found. Did any MotionEvents get skipped?");
            Log.e("RecyclerView", stringBuilder.toString());
            return false;
          } 
          i = (int)(stringBuilder.getX(n) + 0.5F);
          int i1 = (int)(stringBuilder.getY(n) + 0.5F);
          if (this.mScrollState != 1) {
            n = this.mInitialTouchX;
            int i2 = this.mInitialTouchY;
            if (bool1 && Math.abs(i - n) > this.mTouchSlop) {
              this.mLastTouchX = i;
              i = 1;
            } else {
              i = 0;
            } 
            n = i;
            if (bool2) {
              n = i;
              if (Math.abs(i1 - i2) > this.mTouchSlop) {
                this.mLastTouchY = i1;
                n = 1;
              } 
            } 
            if (n != 0)
              setScrollState(1); 
          } 
        } 
      } else {
        this.mVelocityTracker.clear();
        stopNestedScroll(0);
      } 
    } else {
      if (this.mIgnoreMotionEventTillDown)
        this.mIgnoreMotionEventTillDown = false; 
      this.mScrollPointerId = stringBuilder.getPointerId(0);
      i = (int)(stringBuilder.getX() + 0.5F);
      this.mLastTouchX = i;
      this.mInitialTouchX = i;
      i = (int)(stringBuilder.getY() + 0.5F);
      this.mLastTouchY = i;
      this.mInitialTouchY = i;
      if (this.mScrollState == 2) {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        stopNestedScroll(1);
      } 
      int[] arrayOfInt = this.mNestedOffsets;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      if (bool1) {
        i = 1;
      } else {
        i = 0;
      } 
      n = i;
      if (bool2)
        n = i | 0x2; 
      startNestedScroll(n, 0);
    } 
    if (this.mScrollState == 1)
      bool = true; 
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    b.g.j.j.a("RV OnLayout");
    dispatchLayout();
    b.g.j.j.a();
    this.mFirstLayoutComplete = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    o o1 = this.mLayout;
    if (o1 == null) {
      defaultOnMeasure(paramInt1, paramInt2);
      return;
    } 
    boolean bool1 = o1.v();
    boolean bool = false;
    if (bool1) {
      int i = View.MeasureSpec.getMode(paramInt1);
      int n = View.MeasureSpec.getMode(paramInt2);
      this.mLayout.a(this.mRecycler, this.mState, paramInt1, paramInt2);
      boolean bool2 = bool;
      if (i == 1073741824) {
        bool2 = bool;
        if (n == 1073741824)
          bool2 = true; 
      } 
      if (!bool2) {
        if (this.mAdapter == null)
          return; 
        if (this.mState.e == 1)
          dispatchLayoutStep1(); 
        this.mLayout.b(paramInt1, paramInt2);
        this.mState.j = true;
        dispatchLayoutStep2();
        this.mLayout.d(paramInt1, paramInt2);
        if (this.mLayout.B()) {
          this.mLayout.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
          this.mState.j = true;
          dispatchLayoutStep2();
          this.mLayout.d(paramInt1, paramInt2);
          return;
        } 
      } else {
        return;
      } 
    } else {
      if (this.mHasFixedSize) {
        this.mLayout.a(this.mRecycler, this.mState, paramInt1, paramInt2);
        return;
      } 
      if (this.mAdapterUpdateDuringMeasure) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        onExitLayoutOrScroll();
        a0 a01 = this.mState;
        if (a01.l) {
          a01.h = true;
        } else {
          this.mAdapterHelper.b();
          this.mState.h = false;
        } 
        this.mAdapterUpdateDuringMeasure = false;
        stopInterceptRequestLayout(false);
      } else if (this.mState.l) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        return;
      } 
      g g1 = this.mAdapter;
      if (g1 != null) {
        this.mState.f = g1.a();
      } else {
        this.mState.f = 0;
      } 
      startInterceptRequestLayout();
      this.mLayout.a(this.mRecycler, this.mState, paramInt1, paramInt2);
      stopInterceptRequestLayout(false);
      this.mState.h = false;
    } 
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    return isComputingLayout() ? false : super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof y)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    this.mPendingSavedState = (y)paramParcelable;
    super.onRestoreInstanceState(this.mPendingSavedState.e());
    o o1 = this.mLayout;
    if (o1 != null) {
      Parcelable parcelable = this.mPendingSavedState.e;
      if (parcelable != null)
        o1.a(parcelable); 
    } 
  }
  
  protected Parcelable onSaveInstanceState() {
    y y2 = new y(super.onSaveInstanceState());
    y y1 = this.mPendingSavedState;
    if (y1 != null) {
      y2.a(y1);
      return (Parcelable)y2;
    } 
    o o1 = this.mLayout;
    if (o1 != null) {
      Parcelable parcelable = o1.y();
    } else {
      o1 = null;
    } 
    y2.e = (Parcelable)o1;
    return (Parcelable)y2;
  }
  
  public void onScrollStateChanged(int paramInt) {}
  
  public void onScrolled(int paramInt1, int paramInt2) {}
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3 || paramInt2 != paramInt4)
      invalidateGlows(); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield mLayoutSuppressed : Z
    //   4: istore #13
    //   6: iconst_0
    //   7: istore #10
    //   9: iload #13
    //   11: ifne -> 1070
    //   14: aload_0
    //   15: getfield mIgnoreMotionEventTillDown : Z
    //   18: ifeq -> 23
    //   21: iconst_0
    //   22: ireturn
    //   23: aload_0
    //   24: aload_1
    //   25: invokespecial dispatchToOnItemTouchListeners : (Landroid/view/MotionEvent;)Z
    //   28: ifeq -> 37
    //   31: aload_0
    //   32: invokespecial cancelScroll : ()V
    //   35: iconst_1
    //   36: ireturn
    //   37: aload_0
    //   38: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   41: astore #15
    //   43: aload #15
    //   45: ifnonnull -> 50
    //   48: iconst_0
    //   49: ireturn
    //   50: aload #15
    //   52: invokevirtual a : ()Z
    //   55: istore #13
    //   57: aload_0
    //   58: getfield mLayout : Landroidx/recyclerview/widget/RecyclerView$o;
    //   61: invokevirtual b : ()Z
    //   64: istore #14
    //   66: aload_0
    //   67: getfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   70: ifnonnull -> 80
    //   73: aload_0
    //   74: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   77: putfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   80: aload_1
    //   81: invokevirtual getActionMasked : ()I
    //   84: istore #5
    //   86: aload_1
    //   87: invokevirtual getActionIndex : ()I
    //   90: istore #4
    //   92: iload #5
    //   94: ifne -> 113
    //   97: aload_0
    //   98: getfield mNestedOffsets : [I
    //   101: astore #15
    //   103: aload #15
    //   105: iconst_1
    //   106: iconst_0
    //   107: iastore
    //   108: aload #15
    //   110: iconst_0
    //   111: iconst_0
    //   112: iastore
    //   113: aload_1
    //   114: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   117: astore #15
    //   119: aload_0
    //   120: getfield mNestedOffsets : [I
    //   123: astore #16
    //   125: aload #15
    //   127: aload #16
    //   129: iconst_0
    //   130: iaload
    //   131: i2f
    //   132: aload #16
    //   134: iconst_1
    //   135: iaload
    //   136: i2f
    //   137: invokevirtual offsetLocation : (FF)V
    //   140: iload #5
    //   142: ifeq -> 953
    //   145: iload #5
    //   147: iconst_1
    //   148: if_icmpeq -> 845
    //   151: iload #5
    //   153: iconst_2
    //   154: if_icmpeq -> 273
    //   157: iload #5
    //   159: iconst_3
    //   160: if_icmpeq -> 262
    //   163: iload #5
    //   165: iconst_5
    //   166: if_icmpeq -> 195
    //   169: iload #5
    //   171: bipush #6
    //   173: if_icmpeq -> 183
    //   176: iload #10
    //   178: istore #8
    //   180: goto -> 1049
    //   183: aload_0
    //   184: aload_1
    //   185: invokespecial onPointerUp : (Landroid/view/MotionEvent;)V
    //   188: iload #10
    //   190: istore #8
    //   192: goto -> 1049
    //   195: aload_0
    //   196: aload_1
    //   197: iload #4
    //   199: invokevirtual getPointerId : (I)I
    //   202: putfield mScrollPointerId : I
    //   205: aload_1
    //   206: iload #4
    //   208: invokevirtual getX : (I)F
    //   211: ldc_w 0.5
    //   214: fadd
    //   215: f2i
    //   216: istore #5
    //   218: aload_0
    //   219: iload #5
    //   221: putfield mLastTouchX : I
    //   224: aload_0
    //   225: iload #5
    //   227: putfield mInitialTouchX : I
    //   230: aload_1
    //   231: iload #4
    //   233: invokevirtual getY : (I)F
    //   236: ldc_w 0.5
    //   239: fadd
    //   240: f2i
    //   241: istore #4
    //   243: aload_0
    //   244: iload #4
    //   246: putfield mLastTouchY : I
    //   249: aload_0
    //   250: iload #4
    //   252: putfield mInitialTouchY : I
    //   255: iload #10
    //   257: istore #8
    //   259: goto -> 1049
    //   262: aload_0
    //   263: invokespecial cancelScroll : ()V
    //   266: iload #10
    //   268: istore #8
    //   270: goto -> 1049
    //   273: aload_1
    //   274: aload_0
    //   275: getfield mScrollPointerId : I
    //   278: invokevirtual findPointerIndex : (I)I
    //   281: istore #4
    //   283: iload #4
    //   285: ifge -> 333
    //   288: new java/lang/StringBuilder
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: astore_1
    //   296: aload_1
    //   297: ldc_w 'Error processing scroll; pointer index for id '
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: aload_1
    //   305: aload_0
    //   306: getfield mScrollPointerId : I
    //   309: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload_1
    //   314: ldc_w ' not found. Did any MotionEvents get skipped?'
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: ldc 'RecyclerView'
    //   323: aload_1
    //   324: invokevirtual toString : ()Ljava/lang/String;
    //   327: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   330: pop
    //   331: iconst_0
    //   332: ireturn
    //   333: aload_1
    //   334: iload #4
    //   336: invokevirtual getX : (I)F
    //   339: ldc_w 0.5
    //   342: fadd
    //   343: f2i
    //   344: istore #11
    //   346: aload_1
    //   347: iload #4
    //   349: invokevirtual getY : (I)F
    //   352: ldc_w 0.5
    //   355: fadd
    //   356: f2i
    //   357: istore #12
    //   359: aload_0
    //   360: getfield mLastTouchX : I
    //   363: iload #11
    //   365: isub
    //   366: istore #4
    //   368: aload_0
    //   369: getfield mLastTouchY : I
    //   372: iload #12
    //   374: isub
    //   375: istore #8
    //   377: iload #4
    //   379: istore #5
    //   381: iload #8
    //   383: istore #7
    //   385: aload_0
    //   386: getfield mScrollState : I
    //   389: iconst_1
    //   390: if_icmpeq -> 555
    //   393: iload #4
    //   395: istore #6
    //   397: iload #13
    //   399: ifeq -> 453
    //   402: aload_0
    //   403: getfield mTouchSlop : I
    //   406: istore #5
    //   408: iload #4
    //   410: ifle -> 427
    //   413: iconst_0
    //   414: iload #4
    //   416: iload #5
    //   418: isub
    //   419: invokestatic max : (II)I
    //   422: istore #4
    //   424: goto -> 438
    //   427: iconst_0
    //   428: iload #4
    //   430: iload #5
    //   432: iadd
    //   433: invokestatic min : (II)I
    //   436: istore #4
    //   438: iload #4
    //   440: istore #6
    //   442: iload #4
    //   444: ifeq -> 453
    //   447: iconst_1
    //   448: istore #5
    //   450: goto -> 460
    //   453: iconst_0
    //   454: istore #5
    //   456: iload #6
    //   458: istore #4
    //   460: iload #8
    //   462: istore #6
    //   464: iload #5
    //   466: istore #9
    //   468: iload #14
    //   470: ifeq -> 529
    //   473: aload_0
    //   474: getfield mTouchSlop : I
    //   477: istore #6
    //   479: iload #8
    //   481: ifle -> 498
    //   484: iconst_0
    //   485: iload #8
    //   487: iload #6
    //   489: isub
    //   490: invokestatic max : (II)I
    //   493: istore #7
    //   495: goto -> 509
    //   498: iconst_0
    //   499: iload #8
    //   501: iload #6
    //   503: iadd
    //   504: invokestatic min : (II)I
    //   507: istore #7
    //   509: iload #7
    //   511: istore #6
    //   513: iload #5
    //   515: istore #9
    //   517: iload #7
    //   519: ifeq -> 529
    //   522: iconst_1
    //   523: istore #9
    //   525: iload #7
    //   527: istore #6
    //   529: iload #4
    //   531: istore #5
    //   533: iload #6
    //   535: istore #7
    //   537: iload #9
    //   539: ifeq -> 555
    //   542: aload_0
    //   543: iconst_1
    //   544: invokevirtual setScrollState : (I)V
    //   547: iload #6
    //   549: istore #7
    //   551: iload #4
    //   553: istore #5
    //   555: iload #5
    //   557: istore #6
    //   559: iload #10
    //   561: istore #8
    //   563: aload_0
    //   564: getfield mScrollState : I
    //   567: iconst_1
    //   568: if_icmpne -> 1049
    //   571: aload_0
    //   572: getfield mReusableIntPair : [I
    //   575: astore #16
    //   577: aload #16
    //   579: iconst_0
    //   580: iconst_0
    //   581: iastore
    //   582: aload #16
    //   584: iconst_1
    //   585: iconst_0
    //   586: iastore
    //   587: iload #13
    //   589: ifeq -> 599
    //   592: iload #6
    //   594: istore #8
    //   596: goto -> 602
    //   599: iconst_0
    //   600: istore #8
    //   602: iload #14
    //   604: ifeq -> 614
    //   607: iload #7
    //   609: istore #9
    //   611: goto -> 617
    //   614: iconst_0
    //   615: istore #9
    //   617: iload #6
    //   619: istore #5
    //   621: iload #7
    //   623: istore #4
    //   625: aload_0
    //   626: iload #8
    //   628: iload #9
    //   630: aload_0
    //   631: getfield mReusableIntPair : [I
    //   634: aload_0
    //   635: getfield mScrollOffset : [I
    //   638: iconst_0
    //   639: invokevirtual dispatchNestedPreScroll : (II[I[II)Z
    //   642: ifeq -> 721
    //   645: aload_0
    //   646: getfield mReusableIntPair : [I
    //   649: astore #16
    //   651: iload #6
    //   653: aload #16
    //   655: iconst_0
    //   656: iaload
    //   657: isub
    //   658: istore #5
    //   660: iload #7
    //   662: aload #16
    //   664: iconst_1
    //   665: iaload
    //   666: isub
    //   667: istore #4
    //   669: aload_0
    //   670: getfield mNestedOffsets : [I
    //   673: astore #16
    //   675: aload #16
    //   677: iconst_0
    //   678: iaload
    //   679: istore #6
    //   681: aload_0
    //   682: getfield mScrollOffset : [I
    //   685: astore #17
    //   687: aload #16
    //   689: iconst_0
    //   690: iload #6
    //   692: aload #17
    //   694: iconst_0
    //   695: iaload
    //   696: iadd
    //   697: iastore
    //   698: aload #16
    //   700: iconst_1
    //   701: aload #16
    //   703: iconst_1
    //   704: iaload
    //   705: aload #17
    //   707: iconst_1
    //   708: iaload
    //   709: iadd
    //   710: iastore
    //   711: aload_0
    //   712: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   715: iconst_1
    //   716: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   721: aload_0
    //   722: getfield mScrollOffset : [I
    //   725: astore #16
    //   727: aload_0
    //   728: iload #11
    //   730: aload #16
    //   732: iconst_0
    //   733: iaload
    //   734: isub
    //   735: putfield mLastTouchX : I
    //   738: aload_0
    //   739: iload #12
    //   741: aload #16
    //   743: iconst_1
    //   744: iaload
    //   745: isub
    //   746: putfield mLastTouchY : I
    //   749: iload #13
    //   751: ifeq -> 761
    //   754: iload #5
    //   756: istore #6
    //   758: goto -> 764
    //   761: iconst_0
    //   762: istore #6
    //   764: iload #14
    //   766: ifeq -> 776
    //   769: iload #4
    //   771: istore #7
    //   773: goto -> 779
    //   776: iconst_0
    //   777: istore #7
    //   779: aload_0
    //   780: iload #6
    //   782: iload #7
    //   784: aload_1
    //   785: invokevirtual scrollByInternal : (IILandroid/view/MotionEvent;)Z
    //   788: ifeq -> 801
    //   791: aload_0
    //   792: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   795: iconst_1
    //   796: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   801: iload #10
    //   803: istore #8
    //   805: aload_0
    //   806: getfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   809: ifnull -> 1049
    //   812: iload #5
    //   814: ifne -> 826
    //   817: iload #10
    //   819: istore #8
    //   821: iload #4
    //   823: ifeq -> 1049
    //   826: aload_0
    //   827: getfield mGapWorker : Landroidx/recyclerview/widget/e;
    //   830: aload_0
    //   831: iload #5
    //   833: iload #4
    //   835: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;II)V
    //   838: iload #10
    //   840: istore #8
    //   842: goto -> 1049
    //   845: aload_0
    //   846: getfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   849: aload #15
    //   851: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   854: aload_0
    //   855: getfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   858: sipush #1000
    //   861: aload_0
    //   862: getfield mMaxFlingVelocity : I
    //   865: i2f
    //   866: invokevirtual computeCurrentVelocity : (IF)V
    //   869: iload #13
    //   871: ifeq -> 890
    //   874: aload_0
    //   875: getfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   878: aload_0
    //   879: getfield mScrollPointerId : I
    //   882: invokevirtual getXVelocity : (I)F
    //   885: fneg
    //   886: fstore_2
    //   887: goto -> 892
    //   890: fconst_0
    //   891: fstore_2
    //   892: iload #14
    //   894: ifeq -> 913
    //   897: aload_0
    //   898: getfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   901: aload_0
    //   902: getfield mScrollPointerId : I
    //   905: invokevirtual getYVelocity : (I)F
    //   908: fneg
    //   909: fstore_3
    //   910: goto -> 915
    //   913: fconst_0
    //   914: fstore_3
    //   915: fload_2
    //   916: fconst_0
    //   917: fcmpl
    //   918: ifne -> 927
    //   921: fload_3
    //   922: fconst_0
    //   923: fcmpl
    //   924: ifeq -> 938
    //   927: aload_0
    //   928: fload_2
    //   929: f2i
    //   930: fload_3
    //   931: f2i
    //   932: invokevirtual fling : (II)Z
    //   935: ifne -> 943
    //   938: aload_0
    //   939: iconst_0
    //   940: invokevirtual setScrollState : (I)V
    //   943: aload_0
    //   944: invokespecial resetScroll : ()V
    //   947: iconst_1
    //   948: istore #8
    //   950: goto -> 1049
    //   953: aload_0
    //   954: aload_1
    //   955: iconst_0
    //   956: invokevirtual getPointerId : (I)I
    //   959: putfield mScrollPointerId : I
    //   962: aload_1
    //   963: invokevirtual getX : ()F
    //   966: ldc_w 0.5
    //   969: fadd
    //   970: f2i
    //   971: istore #4
    //   973: aload_0
    //   974: iload #4
    //   976: putfield mLastTouchX : I
    //   979: aload_0
    //   980: iload #4
    //   982: putfield mInitialTouchX : I
    //   985: aload_1
    //   986: invokevirtual getY : ()F
    //   989: ldc_w 0.5
    //   992: fadd
    //   993: f2i
    //   994: istore #4
    //   996: aload_0
    //   997: iload #4
    //   999: putfield mLastTouchY : I
    //   1002: aload_0
    //   1003: iload #4
    //   1005: putfield mInitialTouchY : I
    //   1008: iload #13
    //   1010: ifeq -> 1019
    //   1013: iconst_1
    //   1014: istore #4
    //   1016: goto -> 1022
    //   1019: iconst_0
    //   1020: istore #4
    //   1022: iload #4
    //   1024: istore #5
    //   1026: iload #14
    //   1028: ifeq -> 1037
    //   1031: iload #4
    //   1033: iconst_2
    //   1034: ior
    //   1035: istore #5
    //   1037: aload_0
    //   1038: iload #5
    //   1040: iconst_0
    //   1041: invokevirtual startNestedScroll : (II)Z
    //   1044: pop
    //   1045: iload #10
    //   1047: istore #8
    //   1049: iload #8
    //   1051: ifne -> 1063
    //   1054: aload_0
    //   1055: getfield mVelocityTracker : Landroid/view/VelocityTracker;
    //   1058: aload #15
    //   1060: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   1063: aload #15
    //   1065: invokevirtual recycle : ()V
    //   1068: iconst_1
    //   1069: ireturn
    //   1070: iconst_0
    //   1071: ireturn
  }
  
  void postAnimationRunner() {
    if (!this.mPostedAnimatorRunner && this.mIsAttached) {
      b.g.m.v.a((View)this, this.mItemAnimatorRunner);
      this.mPostedAnimatorRunner = true;
    } 
  }
  
  void processDataSetCompletelyChanged(boolean paramBoolean) {
    this.mDispatchItemsChangedEvent = paramBoolean | this.mDispatchItemsChangedEvent;
    this.mDataSetHasChangedAfterLayout = true;
    markKnownViewsInvalid();
  }
  
  void recordAnimationInfoIfBouncedHiddenView(d0 paramd0, l.c paramc) {
    paramd0.a(0, 8192);
    if (this.mState.i && paramd0.t() && !paramd0.q() && !paramd0.y()) {
      long l1 = getChangedHolderKey(paramd0);
      this.mViewInfoStore.a(l1, paramd0);
    } 
    this.mViewInfoStore.c(paramd0, paramc);
  }
  
  void removeAndRecycleViews() {
    l l1 = this.mItemAnimator;
    if (l1 != null)
      l1.b(); 
    o o1 = this.mLayout;
    if (o1 != null) {
      o1.b(this.mRecycler);
      this.mLayout.c(this.mRecycler);
    } 
    this.mRecycler.a();
  }
  
  boolean removeAnimatingView(View paramView) {
    startInterceptRequestLayout();
    boolean bool = this.mChildHelper.e(paramView);
    if (bool) {
      d0 d0 = getChildViewHolderInt(paramView);
      this.mRecycler.c(d0);
      this.mRecycler.b(d0);
    } 
    stopInterceptRequestLayout(bool ^ true);
    return bool;
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean) {
    StringBuilder stringBuilder;
    d0 d0 = getChildViewHolderInt(paramView);
    if (d0 != null)
      if (d0.s()) {
        d0.d();
      } else if (!d0.y()) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
        stringBuilder.append(d0);
        stringBuilder.append(exceptionLabel());
        throw new IllegalArgumentException(stringBuilder.toString());
      }  
    stringBuilder.clearAnimation();
    dispatchChildDetached((View)stringBuilder);
    super.removeDetachedView((View)stringBuilder, paramBoolean);
  }
  
  public void removeItemDecoration(n paramn) {
    o o1 = this.mLayout;
    if (o1 != null)
      o1.a("Cannot remove item decoration during a scroll  or layout"); 
    this.mItemDecorations.remove(paramn);
    if (this.mItemDecorations.isEmpty()) {
      boolean bool;
      if (getOverScrollMode() == 2) {
        bool = true;
      } else {
        bool = false;
      } 
      setWillNotDraw(bool);
    } 
    markItemDecorInsetsDirty();
    requestLayout();
  }
  
  public void removeItemDecorationAt(int paramInt) {
    int i = getItemDecorationCount();
    if (paramInt >= 0 && paramInt < i) {
      removeItemDecoration(getItemDecorationAt(paramInt));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramInt);
    stringBuilder.append(" is an invalid index for size ");
    stringBuilder.append(i);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public void removeOnChildAttachStateChangeListener(q paramq) {
    List<q> list = this.mOnChildAttachStateListeners;
    if (list == null)
      return; 
    list.remove(paramq);
  }
  
  public void removeOnItemTouchListener(s params) {
    this.mOnItemTouchListeners.remove(params);
    if (this.mInterceptingOnItemTouchListener == params)
      this.mInterceptingOnItemTouchListener = null; 
  }
  
  public void removeOnScrollListener(t paramt) {
    List<t> list = this.mScrollListeners;
    if (list != null)
      list.remove(paramt); 
  }
  
  void repositionShadowingViews() {
    int n = this.mChildHelper.a();
    for (int i = 0; i < n; i++) {
      View view = this.mChildHelper.c(i);
      d0 d0 = getChildViewHolder(view);
      if (d0 != null) {
        d0 = d0.i;
        if (d0 != null) {
          View view1 = d0.a;
          int i1 = view.getLeft();
          int i2 = view.getTop();
          if (i1 != view1.getLeft() || i2 != view1.getTop())
            view1.layout(i1, i2, view1.getWidth() + i1, view1.getHeight() + i2); 
        } 
      } 
    } 
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (!this.mLayout.a(this, this.mState, paramView1, paramView2) && paramView2 != null)
      requestChildOnScreen(paramView1, paramView2); 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    return this.mLayout.a(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    int n = this.mOnItemTouchListeners.size();
    for (int i = 0; i < n; i++)
      ((s)this.mOnItemTouchListeners.get(i)).a(paramBoolean); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout() {
    if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
      super.requestLayout();
      return;
    } 
    this.mLayoutWasDefered = true;
  }
  
  void saveOldPositions() {
    int n = this.mChildHelper.b();
    for (int i = 0; i < n; i++) {
      d0 d0 = getChildViewHolderInt(this.mChildHelper.d(i));
      if (!d0.y())
        d0.w(); 
    } 
  }
  
  public void scrollBy(int paramInt1, int paramInt2) {
    o o1 = this.mLayout;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    if (this.mLayoutSuppressed)
      return; 
    boolean bool1 = o1.a();
    boolean bool2 = this.mLayout.b();
    if (bool1 || bool2) {
      if (!bool1)
        paramInt1 = 0; 
      if (!bool2)
        paramInt2 = 0; 
      scrollByInternal(paramInt1, paramInt2, null);
    } 
  }
  
  boolean scrollByInternal(int paramInt1, int paramInt2, MotionEvent paramMotionEvent) {
    boolean bool1;
    boolean bool2;
    byte b1;
    byte b2;
    boolean bool3;
    consumePendingUpdateOperations();
    g g1 = this.mAdapter;
    boolean bool5 = true;
    if (g1 != null) {
      int[] arrayOfInt = this.mReusableIntPair;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      scrollStep(paramInt1, paramInt2, arrayOfInt);
      arrayOfInt = this.mReusableIntPair;
      b1 = arrayOfInt[0];
      b2 = arrayOfInt[1];
      bool2 = b2;
      bool1 = b1;
      b1 = paramInt1 - b1;
      b2 = paramInt2 - b2;
    } else {
      bool1 = false;
      bool2 = false;
      b1 = 0;
      b2 = 0;
    } 
    if (!this.mItemDecorations.isEmpty())
      invalidate(); 
    int[] arrayOfInt1 = this.mReusableIntPair;
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = 0;
    dispatchNestedScroll(bool1, bool2, b1, b2, this.mScrollOffset, 0, arrayOfInt1);
    arrayOfInt1 = this.mReusableIntPair;
    int i = arrayOfInt1[0];
    int n = arrayOfInt1[1];
    if (arrayOfInt1[0] != 0 || arrayOfInt1[1] != 0) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    int i1 = this.mLastTouchX;
    arrayOfInt1 = this.mScrollOffset;
    this.mLastTouchX = i1 - arrayOfInt1[0];
    this.mLastTouchY -= arrayOfInt1[1];
    int[] arrayOfInt2 = this.mNestedOffsets;
    arrayOfInt2[0] = arrayOfInt2[0] + arrayOfInt1[0];
    arrayOfInt2[1] = arrayOfInt2[1] + arrayOfInt1[1];
    if (getOverScrollMode() != 2) {
      if (paramMotionEvent != null && !b.g.m.i.a(paramMotionEvent, 8194))
        pullGlows(paramMotionEvent.getX(), (b1 - i), paramMotionEvent.getY(), (b2 - n)); 
      considerReleasingGlowsOnScroll(paramInt1, paramInt2);
    } 
    if (bool1 || bool2)
      dispatchOnScrolled(bool1, bool2); 
    if (!awakenScrollBars())
      invalidate(); 
    boolean bool4 = bool5;
    if (!bool3) {
      bool4 = bool5;
      if (!bool1) {
        if (bool2)
          return true; 
        bool4 = false;
      } 
    } 
    return bool4;
  }
  
  void scrollStep(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    b.g.j.j.a("RV Scroll");
    fillRemainingScrollValues(this.mState);
    if (paramInt1 != 0) {
      paramInt1 = this.mLayout.a(paramInt1, this.mRecycler, this.mState);
    } else {
      paramInt1 = 0;
    } 
    if (paramInt2 != 0) {
      paramInt2 = this.mLayout.b(paramInt2, this.mRecycler, this.mState);
    } else {
      paramInt2 = 0;
    } 
    b.g.j.j.a();
    repositionShadowingViews();
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    if (paramArrayOfint != null) {
      paramArrayOfint[0] = paramInt1;
      paramArrayOfint[1] = paramInt2;
    } 
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void scrollToPosition(int paramInt) {
    if (this.mLayoutSuppressed)
      return; 
    stopScroll();
    o o1 = this.mLayout;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    o1.i(paramInt);
    awakenScrollBars();
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent) {
    if (shouldDeferAccessibilityEvent(paramAccessibilityEvent))
      return; 
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(l paraml) {
    this.mAccessibilityDelegate = paraml;
    b.g.m.v.a((View)this, this.mAccessibilityDelegate);
  }
  
  public void setAdapter(g paramg) {
    setLayoutFrozen(false);
    setAdapterInternal(paramg, false, true);
    processDataSetCompletelyChanged(false);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(j paramj) {
    boolean bool;
    if (paramj == this.mChildDrawingOrderCallback)
      return; 
    this.mChildDrawingOrderCallback = paramj;
    if (this.mChildDrawingOrderCallback != null) {
      bool = true;
    } else {
      bool = false;
    } 
    setChildrenDrawingOrderEnabled(bool);
  }
  
  boolean setChildImportantForAccessibilityInternal(d0 paramd0, int paramInt) {
    if (isComputingLayout()) {
      paramd0.q = paramInt;
      this.mPendingAccessibilityImportanceChange.add(paramd0);
      return false;
    } 
    b.g.m.v.h(paramd0.a, paramInt);
    return true;
  }
  
  public void setClipToPadding(boolean paramBoolean) {
    if (paramBoolean != this.mClipToPadding)
      invalidateGlows(); 
    this.mClipToPadding = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.mFirstLayoutComplete)
      requestLayout(); 
  }
  
  public void setEdgeEffectFactory(k paramk) {
    androidx.core.util.f.a(paramk);
    this.mEdgeEffectFactory = paramk;
    invalidateGlows();
  }
  
  public void setHasFixedSize(boolean paramBoolean) {
    this.mHasFixedSize = paramBoolean;
  }
  
  public void setItemAnimator(l paraml) {
    l l1 = this.mItemAnimator;
    if (l1 != null) {
      l1.b();
      this.mItemAnimator.a((l.b)null);
    } 
    this.mItemAnimator = paraml;
    paraml = this.mItemAnimator;
    if (paraml != null)
      paraml.a(this.mItemAnimatorListener); 
  }
  
  public void setItemViewCacheSize(int paramInt) {
    this.mRecycler.f(paramInt);
  }
  
  @Deprecated
  public void setLayoutFrozen(boolean paramBoolean) {
    suppressLayout(paramBoolean);
  }
  
  public void setLayoutManager(o paramo) {
    if (paramo == this.mLayout)
      return; 
    stopScroll();
    if (this.mLayout != null) {
      l l1 = this.mItemAnimator;
      if (l1 != null)
        l1.b(); 
      this.mLayout.b(this.mRecycler);
      this.mLayout.c(this.mRecycler);
      this.mRecycler.a();
      if (this.mIsAttached)
        this.mLayout.a(this, this.mRecycler); 
      this.mLayout.f((RecyclerView)null);
      this.mLayout = null;
    } else {
      this.mRecycler.a();
    } 
    this.mChildHelper.c();
    this.mLayout = paramo;
    if (paramo != null)
      if (paramo.b == null) {
        this.mLayout.f(this);
        if (this.mIsAttached)
          this.mLayout.a(this); 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutManager ");
        stringBuilder.append(paramo);
        stringBuilder.append(" is already attached to a RecyclerView:");
        stringBuilder.append(paramo.b.exceptionLabel());
        throw new IllegalArgumentException(stringBuilder.toString());
      }  
    this.mRecycler.j();
    requestLayout();
  }
  
  @Deprecated
  public void setLayoutTransition(LayoutTransition paramLayoutTransition) {
    if (Build.VERSION.SDK_INT < 18) {
      if (paramLayoutTransition == null) {
        suppressLayout(false);
        return;
      } 
      if (paramLayoutTransition.getAnimator(0) == null && paramLayoutTransition.getAnimator(1) == null && paramLayoutTransition.getAnimator(2) == null && paramLayoutTransition.getAnimator(3) == null && paramLayoutTransition.getAnimator(4) == null) {
        suppressLayout(true);
        return;
      } 
    } 
    if (paramLayoutTransition == null) {
      super.setLayoutTransition(null);
      return;
    } 
    throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    getScrollingChildHelper().a(paramBoolean);
  }
  
  public void setOnFlingListener(r paramr) {
    this.mOnFlingListener = paramr;
  }
  
  @Deprecated
  public void setOnScrollListener(t paramt) {
    this.mScrollListener = paramt;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean) {
    this.mPreserveFocusAfterLayout = paramBoolean;
  }
  
  public void setRecycledViewPool(u paramu) {
    this.mRecycler.a(paramu);
  }
  
  public void setRecyclerListener(w paramw) {
    this.mRecyclerListener = paramw;
  }
  
  void setScrollState(int paramInt) {
    if (paramInt == this.mScrollState)
      return; 
    this.mScrollState = paramInt;
    if (paramInt != 2)
      stopScrollersInternal(); 
    dispatchOnScrollStateChanged(paramInt);
  }
  
  public void setScrollingTouchSlop(int paramInt) {
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    if (paramInt != 0)
      if (paramInt != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
        stringBuilder.append(paramInt);
        stringBuilder.append("; using default value");
        Log.w("RecyclerView", stringBuilder.toString());
      } else {
        paramInt = viewConfiguration.getScaledPagingTouchSlop();
        this.mTouchSlop = paramInt;
      }  
    paramInt = viewConfiguration.getScaledTouchSlop();
    this.mTouchSlop = paramInt;
  }
  
  public void setViewCacheExtension(b0 paramb0) {
    this.mRecycler.a(paramb0);
  }
  
  boolean shouldDeferAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (isComputingLayout()) {
      boolean bool1;
      if (paramAccessibilityEvent != null) {
        bool1 = b.g.m.e0.b.a(paramAccessibilityEvent);
      } else {
        bool1 = false;
      } 
      boolean bool2 = bool1;
      if (!bool1)
        bool2 = false; 
      this.mEatenAccessibilityChangeFlags = bool2 | this.mEatenAccessibilityChangeFlags;
      return true;
    } 
    return false;
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2) {
    smoothScrollBy(paramInt1, paramInt2, null);
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, Interpolator paramInterpolator) {
    smoothScrollBy(paramInt1, paramInt2, paramInterpolator, -2147483648);
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, Interpolator paramInterpolator, int paramInt3) {
    smoothScrollBy(paramInt1, paramInt2, paramInterpolator, paramInt3, false);
  }
  
  void smoothScrollBy(int paramInt1, int paramInt2, Interpolator paramInterpolator, int paramInt3, boolean paramBoolean) {
    o o1 = this.mLayout;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    if (this.mLayoutSuppressed)
      return; 
    boolean bool = o1.a();
    int n = 0;
    int i = paramInt1;
    if (!bool)
      i = 0; 
    if (!this.mLayout.b())
      paramInt2 = 0; 
    if (i != 0 || paramInt2 != 0) {
      if (paramInt3 == Integer.MIN_VALUE || paramInt3 > 0) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      } 
      if (paramInt1 != 0) {
        if (paramBoolean) {
          paramInt1 = n;
          if (i != 0)
            paramInt1 = 1; 
          n = paramInt1;
          if (paramInt2 != 0)
            n = paramInt1 | 0x2; 
          startNestedScroll(n, 1);
        } 
        this.mViewFlinger.a(i, paramInt2, paramInt3, paramInterpolator);
        return;
      } 
      scrollBy(i, paramInt2);
    } 
  }
  
  public void smoothScrollToPosition(int paramInt) {
    if (this.mLayoutSuppressed)
      return; 
    o o1 = this.mLayout;
    if (o1 == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    o1.a(this, this.mState, paramInt);
  }
  
  void startInterceptRequestLayout() {
    this.mInterceptRequestLayoutDepth++;
    if (this.mInterceptRequestLayoutDepth == 1 && !this.mLayoutSuppressed)
      this.mLayoutWasDefered = false; 
  }
  
  public boolean startNestedScroll(int paramInt) {
    return getScrollingChildHelper().b(paramInt);
  }
  
  public boolean startNestedScroll(int paramInt1, int paramInt2) {
    return getScrollingChildHelper().a(paramInt1, paramInt2);
  }
  
  void stopInterceptRequestLayout(boolean paramBoolean) {
    if (this.mInterceptRequestLayoutDepth < 1)
      this.mInterceptRequestLayoutDepth = 1; 
    if (!paramBoolean && !this.mLayoutSuppressed)
      this.mLayoutWasDefered = false; 
    if (this.mInterceptRequestLayoutDepth == 1) {
      if (paramBoolean && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null)
        dispatchLayout(); 
      if (!this.mLayoutSuppressed)
        this.mLayoutWasDefered = false; 
    } 
    this.mInterceptRequestLayoutDepth--;
  }
  
  public void stopNestedScroll() {
    getScrollingChildHelper().c();
  }
  
  public void stopNestedScroll(int paramInt) {
    getScrollingChildHelper().c(paramInt);
  }
  
  public void stopScroll() {
    setScrollState(0);
    stopScrollersInternal();
  }
  
  public final void suppressLayout(boolean paramBoolean) {
    if (paramBoolean != this.mLayoutSuppressed) {
      assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
      if (!paramBoolean) {
        this.mLayoutSuppressed = false;
        if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null)
          requestLayout(); 
        this.mLayoutWasDefered = false;
        return;
      } 
      long l1 = SystemClock.uptimeMillis();
      onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
      this.mLayoutSuppressed = true;
      this.mIgnoreMotionEventTillDown = true;
      stopScroll();
    } 
  }
  
  public void swapAdapter(g paramg, boolean paramBoolean) {
    setLayoutFrozen(false);
    setAdapterInternal(paramg, true, paramBoolean);
    processDataSetCompletelyChanged(true);
    requestLayout();
  }
  
  void viewRangeUpdate(int paramInt1, int paramInt2, Object paramObject) {
    int n = this.mChildHelper.b();
    int i;
    for (i = 0; i < n; i++) {
      View view = this.mChildHelper.d(i);
      d0 d0 = getChildViewHolderInt(view);
      if (d0 != null && !d0.y()) {
        int i1 = d0.c;
        if (i1 >= paramInt1 && i1 < paramInt1 + paramInt2) {
          d0.a(2);
          d0.a(paramObject);
          ((p)view.getLayoutParams()).c = true;
        } 
      } 
    } 
    this.mRecycler.c(paramInt1, paramInt2);
  }
  
  static {
    boolean bool;
  }
  
  static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
  
  static final boolean ALLOW_THREAD_GAP_WORK;
  
  static final boolean DEBUG = false;
  
  static final int DEFAULT_ORIENTATION = 1;
  
  static final boolean DISPATCH_TEMP_DETACH = false;
  
  private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
  
  static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
  
  static final long FOREVER_NS = 9223372036854775807L;
  
  public static final int HORIZONTAL = 0;
  
  private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
  
  private static final int INVALID_POINTER = -1;
  
  public static final int INVALID_TYPE = -1;
  
  private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
  
  static final int MAX_SCROLL_DURATION = 2000;
  
  private static final int[] NESTED_SCROLLING_ATTRS = new int[] { 16843830 };
  
  public static final long NO_ID = -1L;
  
  public static final int NO_POSITION = -1;
  
  static final boolean POST_UPDATES_ON_ANIMATION;
  
  public static final int SCROLL_STATE_DRAGGING = 1;
  
  public static final int SCROLL_STATE_IDLE = 0;
  
  public static final int SCROLL_STATE_SETTLING = 2;
  
  static final String TAG = "RecyclerView";
  
  public static final int TOUCH_SLOP_DEFAULT = 0;
  
  public static final int TOUCH_SLOP_PAGING = 1;
  
  static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
  
  static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
  
  private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
  
  static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
  
  private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
  
  private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
  
  static final String TRACE_PREFETCH_TAG = "RV Prefetch";
  
  static final String TRACE_SCROLL_TAG = "RV Scroll";
  
  public static final int UNDEFINED_DURATION = -2147483648;
  
  static final boolean VERBOSE_TRACING = false;
  
  public static final int VERTICAL = 1;
  
  static final Interpolator sQuinticInterpolator;
  
  l mAccessibilityDelegate;
  
  private final AccessibilityManager mAccessibilityManager;
  
  g mAdapter;
  
  a mAdapterHelper;
  
  boolean mAdapterUpdateDuringMeasure;
  
  private EdgeEffect mBottomGlow;
  
  private j mChildDrawingOrderCallback;
  
  b mChildHelper;
  
  boolean mClipToPadding;
  
  boolean mDataSetHasChangedAfterLayout;
  
  boolean mDispatchItemsChangedEvent;
  
  private int mDispatchScrollCounter;
  
  private int mEatenAccessibilityChangeFlags;
  
  private k mEdgeEffectFactory;
  
  boolean mEnableFastScroller;
  
  boolean mFirstLayoutComplete;
  
  e mGapWorker;
  
  boolean mHasFixedSize;
  
  private boolean mIgnoreMotionEventTillDown;
  
  private int mInitialTouchX;
  
  private int mInitialTouchY;
  
  private int mInterceptRequestLayoutDepth;
  
  private s mInterceptingOnItemTouchListener;
  
  boolean mIsAttached;
  
  l mItemAnimator;
  
  private l.b mItemAnimatorListener;
  
  private Runnable mItemAnimatorRunner;
  
  final ArrayList<n> mItemDecorations;
  
  boolean mItemsAddedOrRemoved;
  
  boolean mItemsChanged;
  
  private int mLastTouchX;
  
  private int mLastTouchY;
  
  o mLayout;
  
  private int mLayoutOrScrollCounter;
  
  boolean mLayoutSuppressed;
  
  boolean mLayoutWasDefered;
  
  private EdgeEffect mLeftGlow;
  
  private final int mMaxFlingVelocity;
  
  private final int mMinFlingVelocity;
  
  private final int[] mMinMaxLayoutPositions;
  
  private final int[] mNestedOffsets;
  
  private final x mObserver;
  
  private List<q> mOnChildAttachStateListeners;
  
  private r mOnFlingListener;
  
  private final ArrayList<s> mOnItemTouchListeners;
  
  final List<d0> mPendingAccessibilityImportanceChange;
  
  private y mPendingSavedState;
  
  boolean mPostedAnimatorRunner;
  
  e.b mPrefetchRegistry;
  
  private boolean mPreserveFocusAfterLayout;
  
  final v mRecycler;
  
  w mRecyclerListener;
  
  final int[] mReusableIntPair;
  
  private EdgeEffect mRightGlow;
  
  private float mScaledHorizontalScrollFactor;
  
  private float mScaledVerticalScrollFactor;
  
  private t mScrollListener;
  
  private List<t> mScrollListeners;
  
  private final int[] mScrollOffset;
  
  private int mScrollPointerId;
  
  private int mScrollState;
  
  private b.g.m.m mScrollingChildHelper;
  
  final a0 mState;
  
  final Rect mTempRect;
  
  private final Rect mTempRect2;
  
  final RectF mTempRectF;
  
  private EdgeEffect mTopGlow;
  
  private int mTouchSlop;
  
  final Runnable mUpdateChildViewsRunnable;
  
  private VelocityTracker mVelocityTracker;
  
  final c0 mViewFlinger;
  
  private final q.b mViewInfoProcessCallback;
  
  final q mViewInfoStore;
  
  class a implements Runnable {
    a(RecyclerView this$0) {}
    
    public void run() {
      RecyclerView recyclerView = this.c;
      if (recyclerView.mFirstLayoutComplete) {
        if (recyclerView.isLayoutRequested())
          return; 
        recyclerView = this.c;
        if (!recyclerView.mIsAttached) {
          recyclerView.requestLayout();
          return;
        } 
        if (recyclerView.mLayoutSuppressed) {
          recyclerView.mLayoutWasDefered = true;
          return;
        } 
        recyclerView.consumePendingUpdateOperations();
      } 
    }
  }
  
  public static class a0 {
    int a = -1;
    
    private SparseArray<Object> b;
    
    int c = 0;
    
    int d = 0;
    
    int e = 1;
    
    int f = 0;
    
    boolean g = false;
    
    boolean h = false;
    
    boolean i = false;
    
    boolean j = false;
    
    boolean k = false;
    
    boolean l = false;
    
    int m;
    
    long n;
    
    int o;
    
    int p;
    
    int q;
    
    public int a() {
      return this.h ? (this.c - this.d) : this.f;
    }
    
    void a(int param1Int) {
      if ((this.e & param1Int) != 0)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Layout state should be one of ");
      stringBuilder.append(Integer.toBinaryString(param1Int));
      stringBuilder.append(" but it is ");
      stringBuilder.append(Integer.toBinaryString(this.e));
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    void a(RecyclerView.g param1g) {
      this.e = 1;
      this.f = param1g.a();
      this.h = false;
      this.i = false;
      this.j = false;
    }
    
    public int b() {
      return this.a;
    }
    
    public boolean c() {
      return (this.a != -1);
    }
    
    public boolean d() {
      return this.h;
    }
    
    public boolean e() {
      return this.l;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("State{mTargetPosition=");
      stringBuilder.append(this.a);
      stringBuilder.append(", mData=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mItemCount=");
      stringBuilder.append(this.f);
      stringBuilder.append(", mIsMeasuring=");
      stringBuilder.append(this.j);
      stringBuilder.append(", mPreviousLayoutItemCount=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mStructureChanged=");
      stringBuilder.append(this.g);
      stringBuilder.append(", mInPreLayout=");
      stringBuilder.append(this.h);
      stringBuilder.append(", mRunSimpleAnimations=");
      stringBuilder.append(this.k);
      stringBuilder.append(", mRunPredictiveAnimations=");
      stringBuilder.append(this.l);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  class b implements Runnable {
    b(RecyclerView this$0) {}
    
    public void run() {
      RecyclerView.l l = this.c.mItemAnimator;
      if (l != null)
        l.i(); 
      this.c.mPostedAnimatorRunner = false;
    }
  }
  
  public static abstract class b0 {
    public abstract View a(RecyclerView.v param1v, int param1Int1, int param1Int2);
  }
  
  static final class c implements Interpolator {
    public float getInterpolation(float param1Float) {
      param1Float--;
      return param1Float * param1Float * param1Float * param1Float * param1Float + 1.0F;
    }
  }
  
  class c0 implements Runnable {
    private int c;
    
    private int d;
    
    OverScroller e;
    
    Interpolator f = RecyclerView.sQuinticInterpolator;
    
    private boolean g = false;
    
    private boolean h = false;
    
    c0(RecyclerView this$0) {
      this.e = new OverScroller(this$0.getContext(), RecyclerView.sQuinticInterpolator);
    }
    
    private float a(float param1Float) {
      return (float)Math.sin(((param1Float - 0.5F) * 0.47123894F));
    }
    
    private int a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool;
      int i = Math.abs(param1Int1);
      int j = Math.abs(param1Int2);
      if (i > j) {
        bool = true;
      } else {
        bool = false;
      } 
      param1Int3 = (int)Math.sqrt((param1Int3 * param1Int3 + param1Int4 * param1Int4));
      param1Int2 = (int)Math.sqrt((param1Int1 * param1Int1 + param1Int2 * param1Int2));
      RecyclerView recyclerView = this.i;
      if (bool) {
        param1Int1 = recyclerView.getWidth();
      } else {
        param1Int1 = recyclerView.getHeight();
      } 
      param1Int4 = param1Int1 / 2;
      float f2 = param1Int2;
      float f1 = param1Int1;
      float f3 = Math.min(1.0F, f2 * 1.0F / f1);
      f2 = param1Int4;
      f3 = a(f3);
      if (param1Int3 > 0) {
        param1Int1 = Math.round(Math.abs((f2 + f3 * f2) / param1Int3) * 1000.0F) * 4;
      } else {
        if (bool) {
          param1Int1 = i;
        } else {
          param1Int1 = j;
        } 
        param1Int1 = (int)((param1Int1 / f1 + 1.0F) * 300.0F);
      } 
      return Math.min(param1Int1, 2000);
    }
    
    private void c() {
      this.i.removeCallbacks(this);
      b.g.m.v.a((View)this.i, this);
    }
    
    void a() {
      if (this.g) {
        this.h = true;
        return;
      } 
      c();
    }
    
    public void a(int param1Int1, int param1Int2) {
      this.i.setScrollState(2);
      this.d = 0;
      this.c = 0;
      Interpolator interpolator1 = this.f;
      Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
      if (interpolator1 != interpolator2) {
        this.f = interpolator2;
        this.e = new OverScroller(this.i.getContext(), RecyclerView.sQuinticInterpolator);
      } 
      this.e.fling(0, 0, param1Int1, param1Int2, -2147483648, 2147483647, -2147483648, 2147483647);
      a();
    }
    
    public void a(int param1Int1, int param1Int2, int param1Int3, Interpolator param1Interpolator) {
      int i = param1Int3;
      if (param1Int3 == Integer.MIN_VALUE)
        i = a(param1Int1, param1Int2, 0, 0); 
      Interpolator interpolator = param1Interpolator;
      if (param1Interpolator == null)
        interpolator = RecyclerView.sQuinticInterpolator; 
      if (this.f != interpolator) {
        this.f = interpolator;
        this.e = new OverScroller(this.i.getContext(), interpolator);
      } 
      this.d = 0;
      this.c = 0;
      this.i.setScrollState(2);
      this.e.startScroll(0, 0, param1Int1, param1Int2, i);
      if (Build.VERSION.SDK_INT < 23)
        this.e.computeScrollOffset(); 
      a();
    }
    
    public void b() {
      this.i.removeCallbacks(this);
      this.e.abortAnimation();
    }
    
    public void run() {
      RecyclerView recyclerView = this.i;
      if (recyclerView.mLayout == null) {
        b();
        return;
      } 
      this.h = false;
      this.g = true;
      recyclerView.consumePendingUpdateOperations();
      OverScroller overScroller = this.e;
      if (overScroller.computeScrollOffset()) {
        int i = overScroller.getCurrX();
        int j = overScroller.getCurrY();
        int m = i - this.c;
        int k = j - this.d;
        this.c = i;
        this.d = j;
        RecyclerView recyclerView1 = this.i;
        int[] arrayOfInt2 = recyclerView1.mReusableIntPair;
        arrayOfInt2[0] = 0;
        arrayOfInt2[1] = 0;
        i = m;
        j = k;
        if (recyclerView1.dispatchNestedPreScroll(m, k, arrayOfInt2, null, 1)) {
          int[] arrayOfInt = this.i.mReusableIntPair;
          i = m - arrayOfInt[0];
          j = k - arrayOfInt[1];
        } 
        if (this.i.getOverScrollMode() != 2)
          this.i.considerReleasingGlowsOnScroll(i, j); 
        recyclerView1 = this.i;
        if (recyclerView1.mAdapter != null) {
          arrayOfInt2 = recyclerView1.mReusableIntPair;
          arrayOfInt2[0] = 0;
          arrayOfInt2[1] = 0;
          recyclerView1.scrollStep(i, j, arrayOfInt2);
          recyclerView1 = this.i;
          arrayOfInt2 = recyclerView1.mReusableIntPair;
          int i2 = arrayOfInt2[0];
          int i3 = arrayOfInt2[1];
          int i4 = i - i2;
          int i5 = j - i3;
          RecyclerView.z z2 = recyclerView1.mLayout.g;
          i = i4;
          k = i3;
          j = i2;
          m = i5;
          if (z2 != null) {
            i = i4;
            k = i3;
            j = i2;
            m = i5;
            if (!z2.d()) {
              i = i4;
              k = i3;
              j = i2;
              m = i5;
              if (z2.e()) {
                i = this.i.mState.a();
                if (i == 0) {
                  z2.h();
                  i = i4;
                  k = i3;
                  j = i2;
                  m = i5;
                } else {
                  if (z2.c() >= i)
                    z2.c(i - 1); 
                  z2.a(i2, i3);
                  i = i4;
                  k = i3;
                  j = i2;
                  m = i5;
                } 
              } 
            } 
          } 
        } else {
          k = 0;
          boolean bool = false;
          m = j;
          j = bool;
        } 
        if (!this.i.mItemDecorations.isEmpty())
          this.i.invalidate(); 
        recyclerView1 = this.i;
        arrayOfInt2 = recyclerView1.mReusableIntPair;
        arrayOfInt2[0] = 0;
        arrayOfInt2[1] = 0;
        recyclerView1.dispatchNestedScroll(j, k, i, m, null, 1, arrayOfInt2);
        int[] arrayOfInt1 = this.i.mReusableIntPair;
        int i1 = i - arrayOfInt1[0];
        int n = m - arrayOfInt1[1];
        if (j != 0 || k != 0)
          this.i.dispatchOnScrolled(j, k); 
        if (!this.i.awakenScrollBars())
          this.i.invalidate(); 
        if (overScroller.getCurrX() == overScroller.getFinalX()) {
          i = 1;
        } else {
          i = 0;
        } 
        if (overScroller.getCurrY() == overScroller.getFinalY()) {
          m = 1;
        } else {
          m = 0;
        } 
        if (overScroller.isFinished() || ((i != 0 || i1 != 0) && (m != 0 || n != 0))) {
          i = 1;
        } else {
          i = 0;
        } 
        RecyclerView.z z1 = this.i.mLayout.g;
        if (z1 != null && z1.d()) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m == 0 && i != 0) {
          if (this.i.getOverScrollMode() != 2) {
            j = (int)overScroller.getCurrVelocity();
            if (i1 < 0) {
              i = -j;
            } else if (i1 > 0) {
              i = j;
            } else {
              i = 0;
            } 
            if (n < 0) {
              j = -j;
            } else if (n <= 0) {
              j = 0;
            } 
            this.i.absorbGlows(i, j);
          } 
          if (RecyclerView.ALLOW_THREAD_GAP_WORK)
            this.i.mPrefetchRegistry.a(); 
        } else {
          a();
          RecyclerView recyclerView2 = this.i;
          e e = recyclerView2.mGapWorker;
          if (e != null)
            e.a(recyclerView2, j, k); 
        } 
      } 
      RecyclerView.z z = this.i.mLayout.g;
      if (z != null && z.d())
        z.a(0, 0); 
      this.g = false;
      if (this.h) {
        c();
        return;
      } 
      this.i.setScrollState(0);
      this.i.stopNestedScroll(1);
    }
  }
  
  class d implements q.b {
    d(RecyclerView this$0) {}
    
    public void a(RecyclerView.d0 param1d0) {
      RecyclerView recyclerView = this.a;
      recyclerView.mLayout.a(param1d0.a, recyclerView.mRecycler);
    }
    
    public void a(RecyclerView.d0 param1d0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2) {
      this.a.animateAppearance(param1d0, param1c1, param1c2);
    }
    
    public void b(RecyclerView.d0 param1d0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2) {
      this.a.mRecycler.c(param1d0);
      this.a.animateDisappearance(param1d0, param1c1, param1c2);
    }
    
    public void c(RecyclerView.d0 param1d0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2) {
      param1d0.a(false);
      RecyclerView recyclerView = this.a;
      boolean bool = recyclerView.mDataSetHasChangedAfterLayout;
      RecyclerView.l l = recyclerView.mItemAnimator;
      if (bool ? l.a(param1d0, param1d0, param1c1, param1c2) : l.c(param1d0, param1c1, param1c2))
        this.a.postAnimationRunner(); 
    }
  }
  
  public static abstract class d0 {
    private static final List<Object> s = Collections.emptyList();
    
    public final View a;
    
    WeakReference<RecyclerView> b;
    
    int c = -1;
    
    int d = -1;
    
    long e = -1L;
    
    int f = -1;
    
    int g = -1;
    
    d0 h = null;
    
    d0 i = null;
    
    int j;
    
    List<Object> k = null;
    
    List<Object> l = null;
    
    private int m = 0;
    
    RecyclerView.v n = null;
    
    boolean o = false;
    
    private int p = 0;
    
    int q = -1;
    
    RecyclerView r;
    
    public d0(View param1View) {
      if (param1View != null) {
        this.a = param1View;
        return;
      } 
      throw new IllegalArgumentException("itemView may not be null");
    }
    
    private void B() {
      if (this.k == null) {
        this.k = new ArrayList();
        this.l = Collections.unmodifiableList(this.k);
      } 
    }
    
    boolean A() {
      return ((this.j & 0x20) != 0);
    }
    
    void a() {
      this.d = -1;
      this.g = -1;
    }
    
    void a(int param1Int) {
      this.j = param1Int | this.j;
    }
    
    void a(int param1Int1, int param1Int2) {
      this.j = param1Int1 & param1Int2 | this.j & (param1Int2 ^ 0xFFFFFFFF);
    }
    
    void a(int param1Int1, int param1Int2, boolean param1Boolean) {
      a(8);
      a(param1Int2, param1Boolean);
      this.c = param1Int1;
    }
    
    void a(int param1Int, boolean param1Boolean) {
      if (this.d == -1)
        this.d = this.c; 
      if (this.g == -1)
        this.g = this.c; 
      if (param1Boolean)
        this.g += param1Int; 
      this.c += param1Int;
      if (this.a.getLayoutParams() != null)
        ((RecyclerView.p)this.a.getLayoutParams()).c = true; 
    }
    
    void a(RecyclerView.v param1v, boolean param1Boolean) {
      this.n = param1v;
      this.o = param1Boolean;
    }
    
    void a(RecyclerView param1RecyclerView) {
      int i = this.q;
      if (i == -1)
        i = b.g.m.v.n(this.a); 
      this.p = i;
      param1RecyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }
    
    void a(Object param1Object) {
      if (param1Object == null) {
        a(1024);
        return;
      } 
      if ((0x400 & this.j) == 0) {
        B();
        this.k.add(param1Object);
      } 
    }
    
    public final void a(boolean param1Boolean) {
      int i = this.m;
      if (param1Boolean) {
        i--;
      } else {
        i++;
      } 
      this.m = i;
      i = this.m;
      if (i < 0) {
        this.m = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        stringBuilder.append(this);
        Log.e("View", stringBuilder.toString());
        return;
      } 
      if (!param1Boolean && i == 1) {
        i = this.j | 0x10;
      } else if (param1Boolean && this.m == 0) {
        i = this.j & 0xFFFFFFEF;
      } else {
        return;
      } 
      this.j = i;
    }
    
    void b() {
      List<Object> list = this.k;
      if (list != null)
        list.clear(); 
      this.j &= 0xFFFFFBFF;
    }
    
    void b(RecyclerView param1RecyclerView) {
      param1RecyclerView.setChildImportantForAccessibilityInternal(this, this.p);
      this.p = 0;
    }
    
    boolean b(int param1Int) {
      return ((param1Int & this.j) != 0);
    }
    
    void c() {
      this.j &= 0xFFFFFFDF;
    }
    
    void d() {
      this.j &= 0xFFFFFEFF;
    }
    
    boolean e() {
      return ((this.j & 0x10) == 0 && b.g.m.v.E(this.a));
    }
    
    public final int f() {
      RecyclerView recyclerView = this.r;
      return (recyclerView == null) ? -1 : recyclerView.getAdapterPositionFor(this);
    }
    
    public final long g() {
      return this.e;
    }
    
    public final int h() {
      return this.f;
    }
    
    public final int i() {
      int j = this.g;
      int i = j;
      if (j == -1)
        i = this.c; 
      return i;
    }
    
    public final int j() {
      return this.d;
    }
    
    List<Object> k() {
      if ((this.j & 0x400) == 0) {
        List<Object> list = this.k;
        return (list == null || list.size() == 0) ? s : this.l;
      } 
      return s;
    }
    
    boolean l() {
      return ((this.j & 0x200) != 0 || o());
    }
    
    boolean m() {
      return (this.a.getParent() != null && this.a.getParent() != this.r);
    }
    
    boolean n() {
      return ((this.j & 0x1) != 0);
    }
    
    boolean o() {
      return ((this.j & 0x4) != 0);
    }
    
    public final boolean p() {
      return ((this.j & 0x10) == 0 && !b.g.m.v.E(this.a));
    }
    
    boolean q() {
      return ((this.j & 0x8) != 0);
    }
    
    boolean r() {
      return (this.n != null);
    }
    
    boolean s() {
      return ((this.j & 0x100) != 0);
    }
    
    boolean t() {
      return ((this.j & 0x2) != 0);
    }
    
    public String toString() {
      String str;
      if (getClass().isAnonymousClass()) {
        str = "ViewHolder";
      } else {
        str = getClass().getSimpleName();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("{");
      stringBuilder.append(Integer.toHexString(hashCode()));
      stringBuilder.append(" position=");
      stringBuilder.append(this.c);
      stringBuilder.append(" id=");
      stringBuilder.append(this.e);
      stringBuilder.append(", oldPos=");
      stringBuilder.append(this.d);
      stringBuilder.append(", pLpos:");
      stringBuilder.append(this.g);
      stringBuilder = new StringBuilder(stringBuilder.toString());
      if (r()) {
        stringBuilder.append(" scrap ");
        if (this.o) {
          str = "[changeScrap]";
        } else {
          str = "[attachedScrap]";
        } 
        stringBuilder.append(str);
      } 
      if (o())
        stringBuilder.append(" invalid"); 
      if (!n())
        stringBuilder.append(" unbound"); 
      if (u())
        stringBuilder.append(" update"); 
      if (q())
        stringBuilder.append(" removed"); 
      if (y())
        stringBuilder.append(" ignored"); 
      if (s())
        stringBuilder.append(" tmpDetached"); 
      if (!p()) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(" not recyclable(");
        stringBuilder1.append(this.m);
        stringBuilder1.append(")");
        stringBuilder.append(stringBuilder1.toString());
      } 
      if (l())
        stringBuilder.append(" undefined adapter position"); 
      if (this.a.getParent() == null)
        stringBuilder.append(" no parent"); 
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    boolean u() {
      return ((this.j & 0x2) != 0);
    }
    
    void v() {
      this.j = 0;
      this.c = -1;
      this.d = -1;
      this.e = -1L;
      this.g = -1;
      this.m = 0;
      this.h = null;
      this.i = null;
      b();
      this.p = 0;
      this.q = -1;
      RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }
    
    void w() {
      if (this.d == -1)
        this.d = this.c; 
    }
    
    boolean x() {
      return ((this.j & 0x10) != 0);
    }
    
    boolean y() {
      return ((this.j & 0x80) != 0);
    }
    
    void z() {
      this.n.c(this);
    }
  }
  
  class e implements b.b {
    e(RecyclerView this$0) {}
    
    public int a() {
      return this.a.getChildCount();
    }
    
    public View a(int param1Int) {
      return this.a.getChildAt(param1Int);
    }
    
    public void a(View param1View) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0 != null)
        d0.a(this.a); 
    }
    
    public void a(View param1View, int param1Int) {
      this.a.addView(param1View, param1Int);
      this.a.dispatchChildAttached(param1View);
    }
    
    public void a(View param1View, int param1Int, ViewGroup.LayoutParams param1LayoutParams) {
      StringBuilder stringBuilder;
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0 != null)
        if (d0.s() || d0.y()) {
          d0.d();
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Called attach on a child which is not detached: ");
          stringBuilder.append(d0);
          stringBuilder.append(this.a.exceptionLabel());
          throw new IllegalArgumentException(stringBuilder.toString());
        }  
      this.a.attachViewToParent((View)stringBuilder, param1Int, param1LayoutParams);
    }
    
    public RecyclerView.d0 b(View param1View) {
      return RecyclerView.getChildViewHolderInt(param1View);
    }
    
    public void b() {
      int j = a();
      for (int i = 0; i < j; i++) {
        View view = a(i);
        this.a.dispatchChildDetached(view);
        view.clearAnimation();
      } 
      this.a.removeAllViews();
    }
    
    public void b(int param1Int) {
      View view = a(param1Int);
      if (view != null) {
        RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(view);
        if (d0 != null)
          if (!d0.s() || d0.y()) {
            d0.a(256);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("called detach on an already detached child ");
            stringBuilder.append(d0);
            stringBuilder.append(this.a.exceptionLabel());
            throw new IllegalArgumentException(stringBuilder.toString());
          }  
      } 
      this.a.detachViewFromParent(param1Int);
    }
    
    public void c(int param1Int) {
      View view = this.a.getChildAt(param1Int);
      if (view != null) {
        this.a.dispatchChildDetached(view);
        view.clearAnimation();
      } 
      this.a.removeViewAt(param1Int);
    }
    
    public void c(View param1View) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0 != null)
        d0.b(this.a); 
    }
    
    public int d(View param1View) {
      return this.a.indexOfChild(param1View);
    }
  }
  
  class f implements a.a {
    f(RecyclerView this$0) {}
    
    public RecyclerView.d0 a(int param1Int) {
      RecyclerView.d0 d0 = this.a.findViewHolderForPosition(param1Int, true);
      return (d0 == null) ? null : (this.a.mChildHelper.c(d0.a) ? null : d0);
    }
    
    public void a(int param1Int1, int param1Int2) {
      this.a.offsetPositionRecordsForMove(param1Int1, param1Int2);
      this.a.mItemsAddedOrRemoved = true;
    }
    
    public void a(int param1Int1, int param1Int2, Object param1Object) {
      this.a.viewRangeUpdate(param1Int1, param1Int2, param1Object);
      this.a.mItemsChanged = true;
    }
    
    public void a(a.b param1b) {
      c(param1b);
    }
    
    public void b(int param1Int1, int param1Int2) {
      this.a.offsetPositionRecordsForRemove(param1Int1, param1Int2, false);
      this.a.mItemsAddedOrRemoved = true;
    }
    
    public void b(a.b param1b) {
      c(param1b);
    }
    
    public void c(int param1Int1, int param1Int2) {
      this.a.offsetPositionRecordsForInsert(param1Int1, param1Int2);
      this.a.mItemsAddedOrRemoved = true;
    }
    
    void c(a.b param1b) {
      int i = param1b.a;
      if (i != 1) {
        if (i != 2) {
          if (i != 4) {
            if (i != 8)
              return; 
            RecyclerView recyclerView3 = this.a;
            recyclerView3.mLayout.a(recyclerView3, param1b.b, param1b.d, 1);
            return;
          } 
          RecyclerView recyclerView2 = this.a;
          recyclerView2.mLayout.a(recyclerView2, param1b.b, param1b.d, param1b.c);
          return;
        } 
        RecyclerView recyclerView1 = this.a;
        recyclerView1.mLayout.b(recyclerView1, param1b.b, param1b.d);
        return;
      } 
      RecyclerView recyclerView = this.a;
      recyclerView.mLayout.a(recyclerView, param1b.b, param1b.d);
    }
    
    public void d(int param1Int1, int param1Int2) {
      this.a.offsetPositionRecordsForRemove(param1Int1, param1Int2, true);
      RecyclerView recyclerView = this.a;
      recyclerView.mItemsAddedOrRemoved = true;
      RecyclerView.a0 a0 = recyclerView.mState;
      a0.d += param1Int2;
    }
  }
  
  public static abstract class g<VH extends d0> {
    private final RecyclerView.h a = new RecyclerView.h();
    
    private boolean b = false;
    
    public abstract int a();
    
    public long a(int param1Int) {
      return -1L;
    }
    
    public final VH a(ViewGroup param1ViewGroup, int param1Int) {
      try {
        b.g.j.j.a("RV CreateView");
        param1ViewGroup = (ViewGroup)b(param1ViewGroup, param1Int);
        if (((RecyclerView.d0)param1ViewGroup).a.getParent() == null) {
          ((RecyclerView.d0)param1ViewGroup).f = param1Int;
          return (VH)param1ViewGroup;
        } 
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
      } finally {
        b.g.j.j.a();
      } 
    }
    
    public final void a(VH param1VH, int param1Int) {
      ((RecyclerView.d0)param1VH).c = param1Int;
      if (c())
        ((RecyclerView.d0)param1VH).e = a(param1Int); 
      param1VH.a(1, 519);
      b.g.j.j.a("RV OnBindView");
      a(param1VH, param1Int, param1VH.k());
      param1VH.b();
      ViewGroup.LayoutParams layoutParams = ((RecyclerView.d0)param1VH).a.getLayoutParams();
      if (layoutParams instanceof RecyclerView.p)
        ((RecyclerView.p)layoutParams).c = true; 
      b.g.j.j.a();
    }
    
    public void a(VH param1VH, int param1Int, List<Object> param1List) {
      b(param1VH, param1Int);
    }
    
    public void a(RecyclerView.i param1i) {
      this.a.registerObserver(param1i);
    }
    
    public void a(RecyclerView param1RecyclerView) {}
    
    public void a(boolean param1Boolean) {
      if (!b()) {
        this.b = param1Boolean;
        return;
      } 
      throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
    
    public boolean a(VH param1VH) {
      return false;
    }
    
    public int b(int param1Int) {
      return 0;
    }
    
    public abstract VH b(ViewGroup param1ViewGroup, int param1Int);
    
    public void b(VH param1VH) {}
    
    public abstract void b(VH param1VH, int param1Int);
    
    public void b(RecyclerView.i param1i) {
      this.a.unregisterObserver(param1i);
    }
    
    public void b(RecyclerView param1RecyclerView) {}
    
    public final boolean b() {
      return this.a.a();
    }
    
    public void c(VH param1VH) {}
    
    public final boolean c() {
      return this.b;
    }
    
    public final void d() {
      this.a.b();
    }
    
    public void d(VH param1VH) {}
  }
  
  static class h extends Observable<i> {
    public boolean a() {
      return this.mObservers.isEmpty() ^ true;
    }
    
    public void b() {
      for (int i = this.mObservers.size() - 1; i >= 0; i--)
        ((RecyclerView.i)this.mObservers.get(i)).a(); 
    }
  }
  
  public static abstract class i {
    public void a() {}
  }
  
  public static interface j {
    int a(int param1Int1, int param1Int2);
  }
  
  public static class k {
    protected EdgeEffect a(RecyclerView param1RecyclerView, int param1Int) {
      return new EdgeEffect(param1RecyclerView.getContext());
    }
  }
  
  public static abstract class l {
    private b a = null;
    
    private ArrayList<a> b = new ArrayList<a>();
    
    private long c = 120L;
    
    private long d = 120L;
    
    private long e = 250L;
    
    private long f = 250L;
    
    static int e(RecyclerView.d0 param1d0) {
      int j = param1d0.j & 0xE;
      if (param1d0.o())
        return 4; 
      int i = j;
      if ((j & 0x4) == 0) {
        int k = param1d0.j();
        int m = param1d0.f();
        i = j;
        if (k != -1) {
          i = j;
          if (m != -1) {
            i = j;
            if (k != m)
              i = j | 0x800; 
          } 
        } 
      } 
      return i;
    }
    
    public c a(RecyclerView.a0 param1a0, RecyclerView.d0 param1d0) {
      c c = h();
      c.a(param1d0);
      return c;
    }
    
    public c a(RecyclerView.a0 param1a0, RecyclerView.d0 param1d0, int param1Int, List<Object> param1List) {
      c c = h();
      c.a(param1d0);
      return c;
    }
    
    public final void a() {
      int j = this.b.size();
      for (int i = 0; i < j; i++)
        ((a)this.b.get(i)).a(); 
      this.b.clear();
    }
    
    void a(b param1b) {
      this.a = param1b;
    }
    
    public abstract boolean a(RecyclerView.d0 param1d0);
    
    public abstract boolean a(RecyclerView.d0 param1d01, RecyclerView.d0 param1d02, c param1c1, c param1c2);
    
    public abstract boolean a(RecyclerView.d0 param1d0, c param1c1, c param1c2);
    
    public boolean a(RecyclerView.d0 param1d0, List<Object> param1List) {
      return a(param1d0);
    }
    
    public abstract void b();
    
    public final void b(RecyclerView.d0 param1d0) {
      d(param1d0);
      b b1 = this.a;
      if (b1 != null)
        b1.a(param1d0); 
    }
    
    public abstract boolean b(RecyclerView.d0 param1d0, c param1c1, c param1c2);
    
    public long c() {
      return this.c;
    }
    
    public abstract void c(RecyclerView.d0 param1d0);
    
    public abstract boolean c(RecyclerView.d0 param1d0, c param1c1, c param1c2);
    
    public long d() {
      return this.f;
    }
    
    public void d(RecyclerView.d0 param1d0) {}
    
    public long e() {
      return this.e;
    }
    
    public long f() {
      return this.d;
    }
    
    public abstract boolean g();
    
    public c h() {
      return new c();
    }
    
    public abstract void i();
    
    public static interface a {
      void a();
    }
    
    static interface b {
      void a(RecyclerView.d0 param2d0);
    }
    
    public static class c {
      public int a;
      
      public int b;
      
      public c a(RecyclerView.d0 param2d0) {
        a(param2d0, 0);
        return this;
      }
      
      public c a(RecyclerView.d0 param2d0, int param2Int) {
        View view = param2d0.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
        return this;
      }
    }
  }
  
  public static interface a {
    void a();
  }
  
  static interface b {
    void a(RecyclerView.d0 param1d0);
  }
  
  public static class c {
    public int a;
    
    public int b;
    
    public c a(RecyclerView.d0 param1d0) {
      a(param1d0, 0);
      return this;
    }
    
    public c a(RecyclerView.d0 param1d0, int param1Int) {
      View view = param1d0.a;
      this.a = view.getLeft();
      this.b = view.getTop();
      view.getRight();
      view.getBottom();
      return this;
    }
  }
  
  private class m implements l.b {
    m(RecyclerView this$0) {}
    
    public void a(RecyclerView.d0 param1d0) {
      param1d0.a(true);
      if (param1d0.h != null && param1d0.i == null)
        param1d0.h = null; 
      param1d0.i = null;
      if (!param1d0.x() && !this.a.removeAnimatingView(param1d0.a) && param1d0.s())
        this.a.removeDetachedView(param1d0.a, false); 
    }
  }
  
  public static abstract class n {
    @Deprecated
    public void a(Canvas param1Canvas, RecyclerView param1RecyclerView) {}
    
    public void a(Canvas param1Canvas, RecyclerView param1RecyclerView, RecyclerView.a0 param1a0) {
      a(param1Canvas, param1RecyclerView);
    }
    
    @Deprecated
    public void a(Rect param1Rect, int param1Int, RecyclerView param1RecyclerView) {
      param1Rect.set(0, 0, 0, 0);
    }
    
    public void a(Rect param1Rect, View param1View, RecyclerView param1RecyclerView, RecyclerView.a0 param1a0) {
      a(param1Rect, ((RecyclerView.p)param1View.getLayoutParams()).a(), param1RecyclerView);
    }
    
    @Deprecated
    public void b(Canvas param1Canvas, RecyclerView param1RecyclerView) {}
    
    public void b(Canvas param1Canvas, RecyclerView param1RecyclerView, RecyclerView.a0 param1a0) {
      b(param1Canvas, param1RecyclerView);
    }
  }
  
  public static abstract class o {
    b a;
    
    RecyclerView b;
    
    private final p.b c = new a(this);
    
    private final p.b d = new b(this);
    
    p e = new p(this.c);
    
    p f = new p(this.d);
    
    RecyclerView.z g;
    
    boolean h = false;
    
    boolean i = false;
    
    boolean j = false;
    
    private boolean k = true;
    
    private boolean l = true;
    
    int m;
    
    boolean n;
    
    private int o;
    
    private int p;
    
    private int q;
    
    private int r;
    
    public static int a(int param1Int1, int param1Int2, int param1Int3) {
      int i = View.MeasureSpec.getMode(param1Int1);
      param1Int1 = View.MeasureSpec.getSize(param1Int1);
      if (i != Integer.MIN_VALUE) {
        if (i != 1073741824)
          param1Int1 = Math.max(param1Int2, param1Int3); 
        return param1Int1;
      } 
      return Math.min(param1Int1, Math.max(param1Int2, param1Int3));
    }
    
    public static int a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean) {
      // Byte code:
      //   0: iconst_0
      //   1: istore #6
      //   3: iconst_0
      //   4: iload_0
      //   5: iload_2
      //   6: isub
      //   7: invokestatic max : (II)I
      //   10: istore #5
      //   12: iload #4
      //   14: ifeq -> 62
      //   17: iload_3
      //   18: iflt -> 24
      //   21: goto -> 66
      //   24: iload_3
      //   25: iconst_m1
      //   26: if_icmpne -> 120
      //   29: iload_1
      //   30: ldc -2147483648
      //   32: if_icmpeq -> 52
      //   35: iload_1
      //   36: ifeq -> 45
      //   39: iload_1
      //   40: ldc 1073741824
      //   42: if_icmpeq -> 52
      //   45: iconst_0
      //   46: istore_1
      //   47: iconst_0
      //   48: istore_0
      //   49: goto -> 55
      //   52: iload #5
      //   54: istore_0
      //   55: iload_0
      //   56: istore_2
      //   57: iload_1
      //   58: istore_0
      //   59: goto -> 125
      //   62: iload_3
      //   63: iflt -> 74
      //   66: iload_3
      //   67: istore_2
      //   68: ldc 1073741824
      //   70: istore_0
      //   71: goto -> 125
      //   74: iload_3
      //   75: iconst_m1
      //   76: if_icmpne -> 87
      //   79: iload_1
      //   80: istore_0
      //   81: iload #5
      //   83: istore_2
      //   84: goto -> 125
      //   87: iload_3
      //   88: bipush #-2
      //   90: if_icmpne -> 120
      //   93: iload_1
      //   94: ldc -2147483648
      //   96: if_icmpeq -> 111
      //   99: iload #5
      //   101: istore_2
      //   102: iload #6
      //   104: istore_0
      //   105: iload_1
      //   106: ldc 1073741824
      //   108: if_icmpne -> 125
      //   111: ldc -2147483648
      //   113: istore_0
      //   114: iload #5
      //   116: istore_2
      //   117: goto -> 125
      //   120: iconst_0
      //   121: istore_2
      //   122: iload #6
      //   124: istore_0
      //   125: iload_2
      //   126: iload_0
      //   127: invokestatic makeMeasureSpec : (II)I
      //   130: ireturn
    }
    
    public static d a(Context param1Context, AttributeSet param1AttributeSet, int param1Int1, int param1Int2) {
      d d = new d();
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, b.o.c.RecyclerView, param1Int1, param1Int2);
      d.a = typedArray.getInt(b.o.c.RecyclerView_android_orientation, 1);
      d.b = typedArray.getInt(b.o.c.RecyclerView_spanCount, 1);
      d.c = typedArray.getBoolean(b.o.c.RecyclerView_reverseLayout, false);
      d.d = typedArray.getBoolean(b.o.c.RecyclerView_stackFromEnd, false);
      typedArray.recycle();
      return d;
    }
    
    private void a(int param1Int, View param1View) {
      this.a.a(param1Int);
    }
    
    private void a(View param1View, int param1Int, boolean param1Boolean) {
      StringBuilder stringBuilder;
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (param1Boolean || d0.q()) {
        this.b.mViewInfoStore.a(d0);
      } else {
        this.b.mViewInfoStore.g(d0);
      } 
      RecyclerView.p p1 = (RecyclerView.p)param1View.getLayoutParams();
      if (d0.A() || d0.r()) {
        if (d0.r()) {
          d0.z();
        } else {
          d0.c();
        } 
        this.a.a(param1View, param1Int, param1View.getLayoutParams(), false);
      } else if (param1View.getParent() == this.b) {
        int j = this.a.b(param1View);
        int i = param1Int;
        if (param1Int == -1)
          i = this.a.a(); 
        if (j != -1) {
          if (j != i)
            this.b.mLayout.a(j, i); 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          stringBuilder.append(this.b.indexOfChild(param1View));
          stringBuilder.append(this.b.exceptionLabel());
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } else {
        this.a.a(param1View, param1Int, false);
        p1.c = true;
        RecyclerView.z z1 = this.g;
        if (z1 != null && z1.e())
          this.g.b(param1View); 
      } 
      if (p1.d) {
        ((RecyclerView.d0)stringBuilder).a.invalidate();
        p1.d = false;
      } 
    }
    
    private void a(RecyclerView.v param1v, int param1Int, View param1View) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0.y())
        return; 
      if (d0.o() && !d0.q() && !this.b.mAdapter.c()) {
        h(param1Int);
        param1v.b(d0);
        return;
      } 
      b(param1Int);
      param1v.c(param1View);
      this.b.mViewInfoStore.d(d0);
    }
    
    private static boolean b(int param1Int1, int param1Int2, int param1Int3) {
      int i = View.MeasureSpec.getMode(param1Int2);
      param1Int2 = View.MeasureSpec.getSize(param1Int2);
      boolean bool2 = false;
      boolean bool1 = false;
      if (param1Int3 > 0 && param1Int1 != param1Int3)
        return false; 
      if (i != Integer.MIN_VALUE) {
        if (i != 0) {
          if (i != 1073741824)
            return false; 
          if (param1Int2 == param1Int1)
            bool1 = true; 
          return bool1;
        } 
        return true;
      } 
      bool1 = bool2;
      if (param1Int2 >= param1Int1)
        bool1 = true; 
      return bool1;
    }
    
    private int[] c(View param1View, Rect param1Rect) {
      int i = o();
      int j = q();
      int k = r();
      int i5 = p();
      int n = h();
      int i1 = n();
      int i6 = param1View.getLeft() + param1Rect.left - param1View.getScrollX();
      int i2 = param1View.getTop() + param1Rect.top - param1View.getScrollY();
      int i7 = param1Rect.width();
      int i3 = param1Rect.height();
      int i4 = i6 - i;
      i = Math.min(0, i4);
      int m = i2 - j;
      j = Math.min(0, m);
      i5 = i7 + i6 - k - i5;
      k = Math.max(0, i5);
      n = Math.max(0, i3 + i2 - n - i1);
      if (k() == 1) {
        if (k != 0) {
          i = k;
        } else {
          i = Math.max(i, i5);
        } 
      } else if (i == 0) {
        i = Math.min(i4, k);
      } 
      if (j == 0)
        j = Math.min(m, n); 
      return new int[] { i, j };
    }
    
    private boolean d(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      View view = param1RecyclerView.getFocusedChild();
      if (view == null)
        return false; 
      int i = o();
      int j = q();
      int k = r();
      int m = p();
      int n = h();
      int i1 = n();
      Rect rect = this.b.mTempRect;
      b(view, rect);
      return (rect.left - param1Int1 < k - m && rect.right - param1Int1 > i && rect.top - param1Int2 < n - i1) ? (!(rect.bottom - param1Int2 <= j)) : false;
    }
    
    public void A() {
      this.h = true;
    }
    
    boolean B() {
      return false;
    }
    
    void C() {
      RecyclerView.z z1 = this.g;
      if (z1 != null)
        z1.h(); 
    }
    
    public boolean D() {
      return false;
    }
    
    public int a(int param1Int, RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public int a(RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public int a(RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      RecyclerView recyclerView = this.b;
      byte b1 = 1;
      int i = b1;
      if (recyclerView != null) {
        if (recyclerView.mAdapter == null)
          return 1; 
        i = b1;
        if (a())
          i = this.b.mAdapter.a(); 
      } 
      return i;
    }
    
    public View a(View param1View, int param1Int, RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      return null;
    }
    
    public RecyclerView.p a(Context param1Context, AttributeSet param1AttributeSet) {
      return new RecyclerView.p(param1Context, param1AttributeSet);
    }
    
    public RecyclerView.p a(ViewGroup.LayoutParams param1LayoutParams) {
      return (param1LayoutParams instanceof RecyclerView.p) ? new RecyclerView.p((RecyclerView.p)param1LayoutParams) : ((param1LayoutParams instanceof ViewGroup.MarginLayoutParams) ? new RecyclerView.p((ViewGroup.MarginLayoutParams)param1LayoutParams) : new RecyclerView.p(param1LayoutParams));
    }
    
    public void a(int param1Int1, int param1Int2) {
      View view = d(param1Int1);
      if (view != null) {
        b(param1Int1);
        c(view, param1Int2);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot move a child from non-existing index:");
      stringBuilder.append(param1Int1);
      stringBuilder.append(this.b.toString());
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public void a(int param1Int1, int param1Int2, RecyclerView.a0 param1a0, c param1c) {}
    
    public void a(int param1Int, c param1c) {}
    
    public void a(int param1Int, RecyclerView.v param1v) {
      View view = d(param1Int);
      h(param1Int);
      param1v.b(view);
    }
    
    public void a(Rect param1Rect, int param1Int1, int param1Int2) {
      int i = param1Rect.width();
      int j = o();
      int k = p();
      int m = param1Rect.height();
      int n = q();
      int i1 = n();
      c(a(param1Int1, i + j + k, m()), a(param1Int2, m + n + i1, l()));
    }
    
    public void a(Parcelable param1Parcelable) {}
    
    public void a(View param1View) {
      a(param1View, -1);
    }
    
    public void a(View param1View, int param1Int) {
      a(param1View, param1Int, true);
    }
    
    public void a(View param1View, int param1Int1, int param1Int2) {
      RecyclerView.p p1 = (RecyclerView.p)param1View.getLayoutParams();
      Rect rect = this.b.getItemDecorInsetsForChild(param1View);
      int k = rect.left;
      int m = rect.right;
      int i = rect.top;
      int j = rect.bottom;
      param1Int1 = a(r(), s(), o() + p() + p1.leftMargin + p1.rightMargin + param1Int1 + k + m, p1.width, a());
      param1Int2 = a(h(), i(), q() + n() + p1.topMargin + p1.bottomMargin + param1Int2 + i + j, p1.height, b());
      if (a(param1View, param1Int1, param1Int2, p1))
        param1View.measure(param1Int1, param1Int2); 
    }
    
    public void a(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      RecyclerView.p p1 = (RecyclerView.p)param1View.getLayoutParams();
      Rect rect = p1.b;
      param1View.layout(param1Int1 + rect.left + p1.leftMargin, param1Int2 + rect.top + p1.topMargin, param1Int3 - rect.right - p1.rightMargin, param1Int4 - rect.bottom - p1.bottomMargin);
    }
    
    public void a(View param1View, int param1Int, RecyclerView.p param1p) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0.q()) {
        this.b.mViewInfoStore.a(d0);
      } else {
        this.b.mViewInfoStore.g(d0);
      } 
      this.a.a(param1View, param1Int, (ViewGroup.LayoutParams)param1p, d0.q());
    }
    
    public void a(View param1View, Rect param1Rect) {
      RecyclerView recyclerView = this.b;
      if (recyclerView == null) {
        param1Rect.set(0, 0, 0, 0);
        return;
      } 
      param1Rect.set(recyclerView.getItemDecorInsetsForChild(param1View));
    }
    
    public void a(View param1View, RecyclerView.v param1v) {
      o(param1View);
      param1v.b(param1View);
    }
    
    void a(View param1View, b.g.m.e0.c param1c) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0 != null && !d0.q() && !this.a.c(d0.a)) {
        RecyclerView recyclerView = this.b;
        a(recyclerView.mRecycler, recyclerView.mState, param1View, param1c);
      } 
    }
    
    public void a(View param1View, boolean param1Boolean, Rect param1Rect) {
      if (param1Boolean) {
        Rect rect = ((RecyclerView.p)param1View.getLayoutParams()).b;
        param1Rect.set(-rect.left, -rect.top, param1View.getWidth() + rect.right, param1View.getHeight() + rect.bottom);
      } else {
        param1Rect.set(0, 0, param1View.getWidth(), param1View.getHeight());
      } 
      if (this.b != null) {
        Matrix matrix = param1View.getMatrix();
        if (matrix != null && !matrix.isIdentity()) {
          RectF rectF = this.b.mTempRectF;
          rectF.set(param1Rect);
          matrix.mapRect(rectF);
          param1Rect.set((int)Math.floor(rectF.left), (int)Math.floor(rectF.top), (int)Math.ceil(rectF.right), (int)Math.ceil(rectF.bottom));
        } 
      } 
      param1Rect.offset(param1View.getLeft(), param1View.getTop());
    }
    
    public void a(AccessibilityEvent param1AccessibilityEvent) {
      RecyclerView recyclerView = this.b;
      a(recyclerView.mRecycler, recyclerView.mState, param1AccessibilityEvent);
    }
    
    public void a(RecyclerView.g param1g1, RecyclerView.g param1g2) {}
    
    public void a(RecyclerView.v param1v) {
      for (int i = e() - 1; i >= 0; i--)
        a(param1v, i, d(i)); 
    }
    
    public void a(RecyclerView.v param1v, RecyclerView.a0 param1a0, int param1Int1, int param1Int2) {
      this.b.defaultOnMeasure(param1Int1, param1Int2);
    }
    
    public void a(RecyclerView.v param1v, RecyclerView.a0 param1a0, View param1View, b.g.m.e0.c param1c) {
      boolean bool1;
      boolean bool2;
      if (b()) {
        bool1 = l(param1View);
      } else {
        bool1 = false;
      } 
      if (a()) {
        bool2 = l(param1View);
      } else {
        bool2 = false;
      } 
      param1c.b(b.g.m.e0.c.c.a(bool1, 1, bool2, 1, false, false));
    }
    
    public void a(RecyclerView.v param1v, RecyclerView.a0 param1a0, AccessibilityEvent param1AccessibilityEvent) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        if (param1AccessibilityEvent == null)
          return; 
        boolean bool2 = true;
        boolean bool1 = bool2;
        if (!recyclerView.canScrollVertically(1)) {
          bool1 = bool2;
          if (!this.b.canScrollVertically(-1)) {
            bool1 = bool2;
            if (!this.b.canScrollHorizontally(-1))
              if (this.b.canScrollHorizontally(1)) {
                bool1 = bool2;
              } else {
                bool1 = false;
              }  
          } 
        } 
        param1AccessibilityEvent.setScrollable(bool1);
        RecyclerView.g g = this.b.mAdapter;
        if (g != null)
          param1AccessibilityEvent.setItemCount(g.a()); 
      } 
    }
    
    public void a(RecyclerView.v param1v, RecyclerView.a0 param1a0, b.g.m.e0.c param1c) {
      if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
        param1c.a(8192);
        param1c.l(true);
      } 
      if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
        param1c.a(4096);
        param1c.l(true);
      } 
      param1c.a(b.g.m.e0.c.b.a(b(param1v, param1a0), a(param1v, param1a0), d(param1v, param1a0), c(param1v, param1a0)));
    }
    
    void a(RecyclerView.z param1z) {
      if (this.g == param1z)
        this.g = null; 
    }
    
    void a(RecyclerView param1RecyclerView) {
      this.i = true;
      b(param1RecyclerView);
    }
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2, Object param1Object) {
      c(param1RecyclerView, param1Int1, param1Int2);
    }
    
    public void a(RecyclerView param1RecyclerView, RecyclerView.a0 param1a0, int param1Int) {
      Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }
    
    void a(RecyclerView param1RecyclerView, RecyclerView.v param1v) {
      this.i = false;
      b(param1RecyclerView, param1v);
    }
    
    void a(b.g.m.e0.c param1c) {
      RecyclerView recyclerView = this.b;
      a(recyclerView.mRecycler, recyclerView.mState, param1c);
    }
    
    public void a(String param1String) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.assertNotInLayoutOrScroll(param1String); 
    }
    
    public boolean a() {
      return false;
    }
    
    boolean a(int param1Int, Bundle param1Bundle) {
      RecyclerView recyclerView = this.b;
      return a(recyclerView.mRecycler, recyclerView.mState, param1Int, param1Bundle);
    }
    
    boolean a(View param1View, int param1Int1, int param1Int2, RecyclerView.p param1p) {
      return (param1View.isLayoutRequested() || !this.k || !b(param1View.getWidth(), param1Int1, param1p.width) || !b(param1View.getHeight(), param1Int2, param1p.height));
    }
    
    boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      RecyclerView recyclerView = this.b;
      return a(recyclerView.mRecycler, recyclerView.mState, param1View, param1Int, param1Bundle);
    }
    
    public boolean a(View param1View, boolean param1Boolean1, boolean param1Boolean2) {
      if (this.e.a(param1View, 24579) && this.f.a(param1View, 24579)) {
        param1Boolean2 = true;
      } else {
        param1Boolean2 = false;
      } 
      return param1Boolean1 ? param1Boolean2 : (param1Boolean2 ^ true);
    }
    
    public boolean a(RecyclerView.p param1p) {
      return (param1p != null);
    }
    
    public boolean a(RecyclerView.v param1v, RecyclerView.a0 param1a0, int param1Int, Bundle param1Bundle) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   4: astore_1
      //   5: aload_1
      //   6: ifnonnull -> 11
      //   9: iconst_0
      //   10: ireturn
      //   11: iload_3
      //   12: sipush #4096
      //   15: if_icmpeq -> 96
      //   18: iload_3
      //   19: sipush #8192
      //   22: if_icmpeq -> 33
      //   25: iconst_0
      //   26: istore_3
      //   27: iconst_0
      //   28: istore #5
      //   30: goto -> 169
      //   33: aload_1
      //   34: iconst_m1
      //   35: invokevirtual canScrollVertically : (I)Z
      //   38: ifeq -> 60
      //   41: aload_0
      //   42: invokevirtual h : ()I
      //   45: aload_0
      //   46: invokevirtual q : ()I
      //   49: isub
      //   50: aload_0
      //   51: invokevirtual n : ()I
      //   54: isub
      //   55: ineg
      //   56: istore_3
      //   57: goto -> 62
      //   60: iconst_0
      //   61: istore_3
      //   62: iload_3
      //   63: istore #5
      //   65: aload_0
      //   66: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   69: iconst_m1
      //   70: invokevirtual canScrollHorizontally : (I)Z
      //   73: ifeq -> 167
      //   76: aload_0
      //   77: invokevirtual r : ()I
      //   80: aload_0
      //   81: invokevirtual o : ()I
      //   84: isub
      //   85: aload_0
      //   86: invokevirtual p : ()I
      //   89: isub
      //   90: ineg
      //   91: istore #5
      //   93: goto -> 154
      //   96: aload_1
      //   97: iconst_1
      //   98: invokevirtual canScrollVertically : (I)Z
      //   101: ifeq -> 122
      //   104: aload_0
      //   105: invokevirtual h : ()I
      //   108: aload_0
      //   109: invokevirtual q : ()I
      //   112: isub
      //   113: aload_0
      //   114: invokevirtual n : ()I
      //   117: isub
      //   118: istore_3
      //   119: goto -> 124
      //   122: iconst_0
      //   123: istore_3
      //   124: iload_3
      //   125: istore #5
      //   127: aload_0
      //   128: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   131: iconst_1
      //   132: invokevirtual canScrollHorizontally : (I)Z
      //   135: ifeq -> 167
      //   138: aload_0
      //   139: invokevirtual r : ()I
      //   142: aload_0
      //   143: invokevirtual o : ()I
      //   146: isub
      //   147: aload_0
      //   148: invokevirtual p : ()I
      //   151: isub
      //   152: istore #5
      //   154: iload_3
      //   155: istore #6
      //   157: iload #5
      //   159: istore_3
      //   160: iload #6
      //   162: istore #5
      //   164: goto -> 169
      //   167: iconst_0
      //   168: istore_3
      //   169: iload #5
      //   171: ifne -> 180
      //   174: iload_3
      //   175: ifne -> 180
      //   178: iconst_0
      //   179: ireturn
      //   180: aload_0
      //   181: getfield b : Landroidx/recyclerview/widget/RecyclerView;
      //   184: iload_3
      //   185: iload #5
      //   187: aconst_null
      //   188: ldc -2147483648
      //   190: iconst_1
      //   191: invokevirtual smoothScrollBy : (IILandroid/view/animation/Interpolator;IZ)V
      //   194: iconst_1
      //   195: ireturn
    }
    
    public boolean a(RecyclerView.v param1v, RecyclerView.a0 param1a0, View param1View, int param1Int, Bundle param1Bundle) {
      return false;
    }
    
    public boolean a(RecyclerView param1RecyclerView, View param1View, Rect param1Rect, boolean param1Boolean) {
      return a(param1RecyclerView, param1View, param1Rect, param1Boolean, false);
    }
    
    public boolean a(RecyclerView param1RecyclerView, View param1View, Rect param1Rect, boolean param1Boolean1, boolean param1Boolean2) {
      int[] arrayOfInt = c(param1View, param1Rect);
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      if ((!param1Boolean2 || d(param1RecyclerView, i, j)) && (i != 0 || j != 0)) {
        if (param1Boolean1) {
          param1RecyclerView.scrollBy(i, j);
          return true;
        } 
        param1RecyclerView.smoothScrollBy(i, j);
        return true;
      } 
      return false;
    }
    
    @Deprecated
    public boolean a(RecyclerView param1RecyclerView, View param1View1, View param1View2) {
      return (x() || param1RecyclerView.isComputingLayout());
    }
    
    public boolean a(RecyclerView param1RecyclerView, RecyclerView.a0 param1a0, View param1View1, View param1View2) {
      return a(param1RecyclerView, param1View1, param1View2);
    }
    
    public boolean a(RecyclerView param1RecyclerView, ArrayList<View> param1ArrayList, int param1Int1, int param1Int2) {
      return false;
    }
    
    public boolean a(Runnable param1Runnable) {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null) ? recyclerView.removeCallbacks(param1Runnable) : false;
    }
    
    public int b(int param1Int, RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public int b(RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public int b(RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      RecyclerView recyclerView = this.b;
      byte b1 = 1;
      int i = b1;
      if (recyclerView != null) {
        if (recyclerView.mAdapter == null)
          return 1; 
        i = b1;
        if (b())
          i = this.b.mAdapter.a(); 
      } 
      return i;
    }
    
    public void b(int param1Int) {
      a(param1Int, d(param1Int));
    }
    
    void b(int param1Int1, int param1Int2) {
      this.q = View.MeasureSpec.getSize(param1Int1);
      this.o = View.MeasureSpec.getMode(param1Int1);
      if (this.o == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
        this.q = 0; 
      this.r = View.MeasureSpec.getSize(param1Int2);
      this.p = View.MeasureSpec.getMode(param1Int2);
      if (this.p == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
        this.r = 0; 
    }
    
    public void b(View param1View) {
      b(param1View, -1);
    }
    
    public void b(View param1View, int param1Int) {
      a(param1View, param1Int, false);
    }
    
    public void b(View param1View, Rect param1Rect) {
      RecyclerView.getDecoratedBoundsWithMarginsInt(param1View, param1Rect);
    }
    
    public void b(RecyclerView.v param1v) {
      for (int i = e() - 1; i >= 0; i--) {
        if (!RecyclerView.getChildViewHolderInt(d(i)).y())
          a(i, param1v); 
      } 
    }
    
    public void b(RecyclerView.z param1z) {
      RecyclerView.z z1 = this.g;
      if (z1 != null && param1z != z1 && z1.e())
        this.g.h(); 
      this.g = param1z;
      this.g.a(this.b, this);
    }
    
    public void b(RecyclerView param1RecyclerView) {}
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
    
    public void b(RecyclerView param1RecyclerView, RecyclerView.v param1v) {
      c(param1RecyclerView);
    }
    
    public boolean b() {
      return false;
    }
    
    boolean b(View param1View, int param1Int1, int param1Int2, RecyclerView.p param1p) {
      return (!this.k || !b(param1View.getMeasuredWidth(), param1Int1, param1p.width) || !b(param1View.getMeasuredHeight(), param1Int2, param1p.height));
    }
    
    public int c(RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public int c(RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public View c(int param1Int) {
      int j = e();
      for (int i = 0; i < j; i++) {
        View view = d(i);
        RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(view);
        if (d0 != null && d0.i() == param1Int && !d0.y() && (this.b.mState.d() || !d0.q()))
          return view; 
      } 
      return null;
    }
    
    public View c(View param1View) {
      RecyclerView recyclerView = this.b;
      if (recyclerView == null)
        return null; 
      param1View = recyclerView.findContainingItemView(param1View);
      return (param1View == null) ? null : (this.a.c(param1View) ? null : param1View);
    }
    
    public abstract RecyclerView.p c();
    
    public void c(int param1Int1, int param1Int2) {
      this.b.setMeasuredDimension(param1Int1, param1Int2);
    }
    
    public void c(View param1View, int param1Int) {
      a(param1View, param1Int, (RecyclerView.p)param1View.getLayoutParams());
    }
    
    void c(RecyclerView.v param1v) {
      int j = param1v.e();
      for (int i = j - 1; i >= 0; i--) {
        View view = param1v.c(i);
        RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(view);
        if (!d0.y()) {
          d0.a(false);
          if (d0.s())
            this.b.removeDetachedView(view, false); 
          RecyclerView.l l = this.b.mItemAnimator;
          if (l != null)
            l.c(d0); 
          d0.a(true);
          param1v.a(view);
        } 
      } 
      param1v.c();
      if (j > 0)
        this.b.invalidate(); 
    }
    
    @Deprecated
    public void c(RecyclerView param1RecyclerView) {}
    
    public void c(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
    
    public int d() {
      return -1;
    }
    
    public int d(View param1View) {
      return ((RecyclerView.p)param1View.getLayoutParams()).b.bottom;
    }
    
    public int d(RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public View d(int param1Int) {
      b b1 = this.a;
      return (b1 != null) ? b1.c(param1Int) : null;
    }
    
    public View d(View param1View, int param1Int) {
      return null;
    }
    
    void d(int param1Int1, int param1Int2) {
      int i1 = e();
      if (i1 == 0) {
        this.b.defaultOnMeasure(param1Int1, param1Int2);
        return;
      } 
      int j = 0;
      int n = Integer.MAX_VALUE;
      int k = Integer.MAX_VALUE;
      int m = Integer.MIN_VALUE;
      int i;
      for (i = Integer.MIN_VALUE; j < i1; i = i4) {
        View view = d(j);
        Rect rect = this.b.mTempRect;
        b(view, rect);
        int i3 = rect.left;
        int i2 = n;
        if (i3 < n)
          i2 = i3; 
        n = rect.right;
        i3 = m;
        if (n > m)
          i3 = n; 
        n = rect.top;
        m = k;
        if (n < k)
          m = n; 
        k = rect.bottom;
        int i4 = i;
        if (k > i)
          i4 = k; 
        j++;
        k = m;
        n = i2;
        m = i3;
      } 
      this.b.mTempRect.set(n, k, m, i);
      a(this.b.mTempRect, param1Int1, param1Int2);
    }
    
    public void d(RecyclerView param1RecyclerView) {}
    
    public boolean d(RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      return false;
    }
    
    public int e() {
      b b1 = this.a;
      return (b1 != null) ? b1.a() : 0;
    }
    
    public int e(View param1View) {
      return param1View.getBottom() + d(param1View);
    }
    
    public int e(RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public void e(int param1Int) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.offsetChildrenHorizontal(param1Int); 
    }
    
    public void e(RecyclerView.v param1v, RecyclerView.a0 param1a0) {
      Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }
    
    void e(RecyclerView param1RecyclerView) {
      b(View.MeasureSpec.makeMeasureSpec(param1RecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(param1RecyclerView.getHeight(), 1073741824));
    }
    
    public int f(View param1View) {
      return param1View.getLeft() - k(param1View);
    }
    
    public int f(RecyclerView.a0 param1a0) {
      return 0;
    }
    
    public void f(int param1Int) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.offsetChildrenVertical(param1Int); 
    }
    
    void f(RecyclerView param1RecyclerView) {
      int i;
      if (param1RecyclerView == null) {
        this.b = null;
        this.a = null;
        i = 0;
        this.q = 0;
      } else {
        this.b = param1RecyclerView;
        this.a = param1RecyclerView.mChildHelper;
        this.q = param1RecyclerView.getWidth();
        i = param1RecyclerView.getHeight();
      } 
      this.r = i;
      this.o = 1073741824;
      this.p = 1073741824;
    }
    
    public boolean f() {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null && recyclerView.mClipToPadding);
    }
    
    public int g(View param1View) {
      Rect rect = ((RecyclerView.p)param1View.getLayoutParams()).b;
      return param1View.getMeasuredHeight() + rect.top + rect.bottom;
    }
    
    public View g() {
      RecyclerView recyclerView = this.b;
      if (recyclerView == null)
        return null; 
      View view = recyclerView.getFocusedChild();
      return (view != null) ? (this.a.c(view) ? null : view) : null;
    }
    
    public void g(int param1Int) {}
    
    public void g(RecyclerView.a0 param1a0) {}
    
    public int h() {
      return this.r;
    }
    
    public int h(View param1View) {
      Rect rect = ((RecyclerView.p)param1View.getLayoutParams()).b;
      return param1View.getMeasuredWidth() + rect.left + rect.right;
    }
    
    public void h(int param1Int) {
      if (d(param1Int) != null)
        this.a.e(param1Int); 
    }
    
    public int i() {
      return this.p;
    }
    
    public int i(View param1View) {
      return param1View.getRight() + m(param1View);
    }
    
    public void i(int param1Int) {}
    
    public int j() {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null) {
        RecyclerView.g g = recyclerView.getAdapter();
      } else {
        recyclerView = null;
      } 
      return (recyclerView != null) ? recyclerView.a() : 0;
    }
    
    public int j(View param1View) {
      return param1View.getTop() - n(param1View);
    }
    
    public int k() {
      return b.g.m.v.p((View)this.b);
    }
    
    public int k(View param1View) {
      return ((RecyclerView.p)param1View.getLayoutParams()).b.left;
    }
    
    public int l() {
      return b.g.m.v.q((View)this.b);
    }
    
    public int l(View param1View) {
      return ((RecyclerView.p)param1View.getLayoutParams()).a();
    }
    
    public int m() {
      return b.g.m.v.r((View)this.b);
    }
    
    public int m(View param1View) {
      return ((RecyclerView.p)param1View.getLayoutParams()).b.right;
    }
    
    public int n() {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null) ? recyclerView.getPaddingBottom() : 0;
    }
    
    public int n(View param1View) {
      return ((RecyclerView.p)param1View.getLayoutParams()).b.top;
    }
    
    public int o() {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null) ? recyclerView.getPaddingLeft() : 0;
    }
    
    public void o(View param1View) {
      this.a.d(param1View);
    }
    
    public int p() {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null) ? recyclerView.getPaddingRight() : 0;
    }
    
    public int q() {
      RecyclerView recyclerView = this.b;
      return (recyclerView != null) ? recyclerView.getPaddingTop() : 0;
    }
    
    public int r() {
      return this.q;
    }
    
    public int s() {
      return this.o;
    }
    
    boolean t() {
      int j = e();
      for (int i = 0; i < j; i++) {
        ViewGroup.LayoutParams layoutParams = d(i).getLayoutParams();
        if (layoutParams.width < 0 && layoutParams.height < 0)
          return true; 
      } 
      return false;
    }
    
    public boolean u() {
      return this.i;
    }
    
    public boolean v() {
      return this.j;
    }
    
    public final boolean w() {
      return this.l;
    }
    
    public boolean x() {
      RecyclerView.z z1 = this.g;
      return (z1 != null && z1.e());
    }
    
    public Parcelable y() {
      return null;
    }
    
    public void z() {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.requestLayout(); 
    }
    
    class a implements p.b {
      a(RecyclerView.o this$0) {}
      
      public int a() {
        return this.a.r() - this.a.p();
      }
      
      public int a(View param2View) {
        RecyclerView.p p = (RecyclerView.p)param2View.getLayoutParams();
        return this.a.f(param2View) - p.leftMargin;
      }
      
      public View a(int param2Int) {
        return this.a.d(param2Int);
      }
      
      public int b() {
        return this.a.o();
      }
      
      public int b(View param2View) {
        RecyclerView.p p = (RecyclerView.p)param2View.getLayoutParams();
        return this.a.i(param2View) + p.rightMargin;
      }
    }
    
    class b implements p.b {
      b(RecyclerView.o this$0) {}
      
      public int a() {
        return this.a.h() - this.a.n();
      }
      
      public int a(View param2View) {
        RecyclerView.p p = (RecyclerView.p)param2View.getLayoutParams();
        return this.a.j(param2View) - p.topMargin;
      }
      
      public View a(int param2Int) {
        return this.a.d(param2Int);
      }
      
      public int b() {
        return this.a.q();
      }
      
      public int b(View param2View) {
        RecyclerView.p p = (RecyclerView.p)param2View.getLayoutParams();
        return this.a.e(param2View) + p.bottomMargin;
      }
    }
    
    public static interface c {
      void a(int param2Int1, int param2Int2);
    }
    
    public static class d {
      public int a;
      
      public int b;
      
      public boolean c;
      
      public boolean d;
    }
  }
  
  class a implements p.b {
    a(RecyclerView this$0) {}
    
    public int a() {
      return this.a.r() - this.a.p();
    }
    
    public int a(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.f(param1View) - p.leftMargin;
    }
    
    public View a(int param1Int) {
      return this.a.d(param1Int);
    }
    
    public int b() {
      return this.a.o();
    }
    
    public int b(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.i(param1View) + p.rightMargin;
    }
  }
  
  class b implements p.b {
    b(RecyclerView this$0) {}
    
    public int a() {
      return this.a.h() - this.a.n();
    }
    
    public int a(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.j(param1View) - p.topMargin;
    }
    
    public View a(int param1Int) {
      return this.a.d(param1Int);
    }
    
    public int b() {
      return this.a.q();
    }
    
    public int b(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.e(param1View) + p.bottomMargin;
    }
  }
  
  public static interface c {
    void a(int param1Int1, int param1Int2);
  }
  
  public static class d {
    public int a;
    
    public int b;
    
    public boolean c;
    
    public boolean d;
  }
  
  public static class p extends ViewGroup.MarginLayoutParams {
    RecyclerView.d0 a;
    
    final Rect b = new Rect();
    
    boolean c = true;
    
    boolean d = false;
    
    public p(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public p(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public p(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public p(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public p(p param1p) {
      super((ViewGroup.LayoutParams)param1p);
    }
    
    public int a() {
      return this.a.i();
    }
    
    public boolean b() {
      return this.a.t();
    }
    
    public boolean c() {
      return this.a.q();
    }
    
    public boolean d() {
      return this.a.o();
    }
  }
  
  public static interface q {
    void a(View param1View);
    
    void b(View param1View);
  }
  
  public static abstract class r {
    public abstract boolean a(int param1Int1, int param1Int2);
  }
  
  public static interface s {
    void a(boolean param1Boolean);
    
    boolean a(RecyclerView param1RecyclerView, MotionEvent param1MotionEvent);
    
    void b(RecyclerView param1RecyclerView, MotionEvent param1MotionEvent);
  }
  
  public static abstract class t {
    public void a(RecyclerView param1RecyclerView, int param1Int) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {}
  }
  
  public static class u {
    SparseArray<a> a = new SparseArray();
    
    private int b = 0;
    
    private a b(int param1Int) {
      a a2 = (a)this.a.get(param1Int);
      a a1 = a2;
      if (a2 == null) {
        a1 = new a();
        this.a.put(param1Int, a1);
      } 
      return a1;
    }
    
    long a(long param1Long1, long param1Long2) {
      return (param1Long1 == 0L) ? param1Long2 : (param1Long1 / 4L * 3L + param1Long2 / 4L);
    }
    
    public RecyclerView.d0 a(int param1Int) {
      a a = (a)this.a.get(param1Int);
      if (a != null && !a.a.isEmpty()) {
        ArrayList<RecyclerView.d0> arrayList = a.a;
        for (param1Int = arrayList.size() - 1; param1Int >= 0; param1Int--) {
          if (!((RecyclerView.d0)arrayList.get(param1Int)).m())
            return arrayList.remove(param1Int); 
        } 
      } 
      return null;
    }
    
    void a() {
      this.b++;
    }
    
    void a(int param1Int, long param1Long) {
      a a = b(param1Int);
      a.d = a(a.d, param1Long);
    }
    
    public void a(RecyclerView.d0 param1d0) {
      int i = param1d0.h();
      ArrayList<RecyclerView.d0> arrayList = (b(i)).a;
      if (((a)this.a.get(i)).b <= arrayList.size())
        return; 
      param1d0.v();
      arrayList.add(param1d0);
    }
    
    void a(RecyclerView.g param1g1, RecyclerView.g param1g2, boolean param1Boolean) {
      if (param1g1 != null)
        c(); 
      if (!param1Boolean && this.b == 0)
        b(); 
      if (param1g2 != null)
        a(); 
    }
    
    boolean a(int param1Int, long param1Long1, long param1Long2) {
      long l = (b(param1Int)).d;
      return (l == 0L || param1Long1 + l < param1Long2);
    }
    
    public void b() {
      for (int i = 0; i < this.a.size(); i++)
        ((a)this.a.valueAt(i)).a.clear(); 
    }
    
    void b(int param1Int, long param1Long) {
      a a = b(param1Int);
      a.c = a(a.c, param1Long);
    }
    
    boolean b(int param1Int, long param1Long1, long param1Long2) {
      long l = (b(param1Int)).c;
      return (l == 0L || param1Long1 + l < param1Long2);
    }
    
    void c() {
      this.b--;
    }
    
    static class a {
      final ArrayList<RecyclerView.d0> a = new ArrayList<RecyclerView.d0>();
      
      int b = 5;
      
      long c = 0L;
      
      long d = 0L;
    }
  }
  
  static class a {
    final ArrayList<RecyclerView.d0> a = new ArrayList<RecyclerView.d0>();
    
    int b = 5;
    
    long c = 0L;
    
    long d = 0L;
  }
  
  public final class v {
    final ArrayList<RecyclerView.d0> a = new ArrayList<RecyclerView.d0>();
    
    ArrayList<RecyclerView.d0> b = null;
    
    final ArrayList<RecyclerView.d0> c = new ArrayList<RecyclerView.d0>();
    
    private final List<RecyclerView.d0> d = Collections.unmodifiableList(this.a);
    
    private int e = 2;
    
    int f = 2;
    
    RecyclerView.u g;
    
    private RecyclerView.b0 h;
    
    public v(RecyclerView this$0) {}
    
    private void a(ViewGroup param1ViewGroup, boolean param1Boolean) {
      int i;
      for (i = param1ViewGroup.getChildCount() - 1; i >= 0; i--) {
        View view = param1ViewGroup.getChildAt(i);
        if (view instanceof ViewGroup)
          a((ViewGroup)view, true); 
      } 
      if (!param1Boolean)
        return; 
      if (param1ViewGroup.getVisibility() == 4) {
        param1ViewGroup.setVisibility(0);
        param1ViewGroup.setVisibility(4);
        return;
      } 
      i = param1ViewGroup.getVisibility();
      param1ViewGroup.setVisibility(4);
      param1ViewGroup.setVisibility(i);
    }
    
    private boolean a(RecyclerView.d0 param1d0, int param1Int1, int param1Int2, long param1Long) {
      param1d0.r = this.i;
      int i = param1d0.h();
      long l = this.i.getNanoTime();
      if (param1Long != Long.MAX_VALUE && !this.g.a(i, l, param1Long))
        return false; 
      this.i.mAdapter.a(param1d0, param1Int1);
      param1Long = this.i.getNanoTime();
      this.g.a(param1d0.h(), param1Long - l);
      e(param1d0);
      if (this.i.mState.d())
        param1d0.g = param1Int2; 
      return true;
    }
    
    private void e(RecyclerView.d0 param1d0) {
      if (this.i.isAccessibilityEnabled()) {
        View view = param1d0.a;
        if (b.g.m.v.n(view) == 0)
          b.g.m.v.h(view, 1); 
        l l = this.i.mAccessibilityDelegate;
        if (l == null)
          return; 
        b.g.m.a a = l.b();
        if (a instanceof l.a)
          ((l.a)a).d(view); 
        b.g.m.v.a(view, a);
      } 
    }
    
    private void f(RecyclerView.d0 param1d0) {
      View view = param1d0.a;
      if (view instanceof ViewGroup)
        a((ViewGroup)view, false); 
    }
    
    public int a(int param1Int) {
      if (param1Int >= 0 && param1Int < this.i.mState.a())
        return !this.i.mState.d() ? param1Int : this.i.mAdapterHelper.b(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("invalid position ");
      stringBuilder.append(param1Int);
      stringBuilder.append(". State item count is ");
      stringBuilder.append(this.i.mState.a());
      stringBuilder.append(this.i.exceptionLabel());
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
    
    RecyclerView.d0 a(int param1Int, boolean param1Boolean) {
      int j = this.a.size();
      boolean bool = false;
      int i;
      for (i = 0; i < j; i++) {
        RecyclerView.d0 d0 = this.a.get(i);
        if (!d0.A() && d0.i() == param1Int && !d0.o() && (this.i.mState.h || !d0.q())) {
          d0.a(32);
          return d0;
        } 
      } 
      if (!param1Boolean) {
        View view = this.i.mChildHelper.b(param1Int);
        if (view != null) {
          RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(view);
          this.i.mChildHelper.f(view);
          param1Int = this.i.mChildHelper.b(view);
          if (param1Int != -1) {
            this.i.mChildHelper.a(param1Int);
            c(view);
            d0.a(8224);
            return d0;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("layout index should not be -1 after unhiding a view:");
          stringBuilder.append(d0);
          stringBuilder.append(this.i.exceptionLabel());
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
      j = this.c.size();
      for (i = bool; i < j; i++) {
        RecyclerView.d0 d0 = this.c.get(i);
        if (!d0.o() && d0.i() == param1Int && !d0.m()) {
          if (!param1Boolean)
            this.c.remove(i); 
          return d0;
        } 
      } 
      return null;
    }
    
    RecyclerView.d0 a(int param1Int, boolean param1Boolean, long param1Long) {
      // Byte code:
      //   0: iload_1
      //   1: iflt -> 1050
      //   4: iload_1
      //   5: aload_0
      //   6: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   9: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   12: invokevirtual a : ()I
      //   15: if_icmpge -> 1050
      //   18: aload_0
      //   19: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   22: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   25: invokevirtual d : ()Z
      //   28: istore #10
      //   30: iconst_1
      //   31: istore #9
      //   33: iload #10
      //   35: ifeq -> 60
      //   38: aload_0
      //   39: iload_1
      //   40: invokevirtual b : (I)Landroidx/recyclerview/widget/RecyclerView$d0;
      //   43: astore #16
      //   45: aload #16
      //   47: astore #15
      //   49: aload #16
      //   51: ifnull -> 63
      //   54: iconst_1
      //   55: istore #6
      //   57: goto -> 70
      //   60: aconst_null
      //   61: astore #15
      //   63: iconst_0
      //   64: istore #6
      //   66: aload #15
      //   68: astore #16
      //   70: aload #16
      //   72: astore #15
      //   74: iload #6
      //   76: istore #5
      //   78: aload #16
      //   80: ifnonnull -> 188
      //   83: aload_0
      //   84: iload_1
      //   85: iload_2
      //   86: invokevirtual a : (IZ)Landroidx/recyclerview/widget/RecyclerView$d0;
      //   89: astore #16
      //   91: aload #16
      //   93: astore #15
      //   95: iload #6
      //   97: istore #5
      //   99: aload #16
      //   101: ifnull -> 188
      //   104: aload_0
      //   105: aload #16
      //   107: invokevirtual d : (Landroidx/recyclerview/widget/RecyclerView$d0;)Z
      //   110: ifne -> 181
      //   113: iload_2
      //   114: ifne -> 171
      //   117: aload #16
      //   119: iconst_4
      //   120: invokevirtual a : (I)V
      //   123: aload #16
      //   125: invokevirtual r : ()Z
      //   128: ifeq -> 152
      //   131: aload_0
      //   132: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   135: aload #16
      //   137: getfield a : Landroid/view/View;
      //   140: iconst_0
      //   141: invokevirtual removeDetachedView : (Landroid/view/View;Z)V
      //   144: aload #16
      //   146: invokevirtual z : ()V
      //   149: goto -> 165
      //   152: aload #16
      //   154: invokevirtual A : ()Z
      //   157: ifeq -> 165
      //   160: aload #16
      //   162: invokevirtual c : ()V
      //   165: aload_0
      //   166: aload #16
      //   168: invokevirtual b : (Landroidx/recyclerview/widget/RecyclerView$d0;)V
      //   171: aconst_null
      //   172: astore #15
      //   174: iload #6
      //   176: istore #5
      //   178: goto -> 188
      //   181: iconst_1
      //   182: istore #5
      //   184: aload #16
      //   186: astore #15
      //   188: aload #15
      //   190: astore #16
      //   192: iload #5
      //   194: istore #7
      //   196: aload #15
      //   198: ifnonnull -> 747
      //   201: aload_0
      //   202: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   205: getfield mAdapterHelper : Landroidx/recyclerview/widget/a;
      //   208: iload_1
      //   209: invokevirtual b : (I)I
      //   212: istore #7
      //   214: iload #7
      //   216: iflt -> 654
      //   219: iload #7
      //   221: aload_0
      //   222: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   225: getfield mAdapter : Landroidx/recyclerview/widget/RecyclerView$g;
      //   228: invokevirtual a : ()I
      //   231: if_icmpge -> 654
      //   234: aload_0
      //   235: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   238: getfield mAdapter : Landroidx/recyclerview/widget/RecyclerView$g;
      //   241: iload #7
      //   243: invokevirtual b : (I)I
      //   246: istore #8
      //   248: iload #5
      //   250: istore #6
      //   252: aload_0
      //   253: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   256: getfield mAdapter : Landroidx/recyclerview/widget/RecyclerView$g;
      //   259: invokevirtual c : ()Z
      //   262: ifeq -> 313
      //   265: aload_0
      //   266: aload_0
      //   267: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   270: getfield mAdapter : Landroidx/recyclerview/widget/RecyclerView$g;
      //   273: iload #7
      //   275: invokevirtual a : (I)J
      //   278: iload #8
      //   280: iload_2
      //   281: invokevirtual a : (JIZ)Landroidx/recyclerview/widget/RecyclerView$d0;
      //   284: astore #16
      //   286: aload #16
      //   288: astore #15
      //   290: iload #5
      //   292: istore #6
      //   294: aload #16
      //   296: ifnull -> 313
      //   299: aload #16
      //   301: iload #7
      //   303: putfield c : I
      //   306: iconst_1
      //   307: istore #6
      //   309: aload #16
      //   311: astore #15
      //   313: aload #15
      //   315: astore #16
      //   317: aload #15
      //   319: ifnonnull -> 472
      //   322: aload_0
      //   323: getfield h : Landroidx/recyclerview/widget/RecyclerView$b0;
      //   326: astore #17
      //   328: aload #15
      //   330: astore #16
      //   332: aload #17
      //   334: ifnull -> 472
      //   337: aload #17
      //   339: aload_0
      //   340: iload_1
      //   341: iload #8
      //   343: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView$v;II)Landroid/view/View;
      //   346: astore #17
      //   348: aload #15
      //   350: astore #16
      //   352: aload #17
      //   354: ifnull -> 472
      //   357: aload_0
      //   358: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   361: aload #17
      //   363: invokevirtual getChildViewHolder : (Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;
      //   366: astore #16
      //   368: aload #16
      //   370: ifnull -> 428
      //   373: aload #16
      //   375: invokevirtual y : ()Z
      //   378: ifne -> 384
      //   381: goto -> 472
      //   384: new java/lang/StringBuilder
      //   387: dup
      //   388: invokespecial <init> : ()V
      //   391: astore #15
      //   393: aload #15
      //   395: ldc_w 'getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.'
      //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   401: pop
      //   402: aload #15
      //   404: aload_0
      //   405: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   408: invokevirtual exceptionLabel : ()Ljava/lang/String;
      //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   414: pop
      //   415: new java/lang/IllegalArgumentException
      //   418: dup
      //   419: aload #15
      //   421: invokevirtual toString : ()Ljava/lang/String;
      //   424: invokespecial <init> : (Ljava/lang/String;)V
      //   427: athrow
      //   428: new java/lang/StringBuilder
      //   431: dup
      //   432: invokespecial <init> : ()V
      //   435: astore #15
      //   437: aload #15
      //   439: ldc_w 'getViewForPositionAndType returned a view which does not have a ViewHolder'
      //   442: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   445: pop
      //   446: aload #15
      //   448: aload_0
      //   449: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   452: invokevirtual exceptionLabel : ()Ljava/lang/String;
      //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   458: pop
      //   459: new java/lang/IllegalArgumentException
      //   462: dup
      //   463: aload #15
      //   465: invokevirtual toString : ()Ljava/lang/String;
      //   468: invokespecial <init> : (Ljava/lang/String;)V
      //   471: athrow
      //   472: aload #16
      //   474: astore #15
      //   476: aload #16
      //   478: ifnonnull -> 526
      //   481: aload_0
      //   482: invokevirtual d : ()Landroidx/recyclerview/widget/RecyclerView$u;
      //   485: iload #8
      //   487: invokevirtual a : (I)Landroidx/recyclerview/widget/RecyclerView$d0;
      //   490: astore #16
      //   492: aload #16
      //   494: astore #15
      //   496: aload #16
      //   498: ifnull -> 526
      //   501: aload #16
      //   503: invokevirtual v : ()V
      //   506: aload #16
      //   508: astore #15
      //   510: getstatic androidx/recyclerview/widget/RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST : Z
      //   513: ifeq -> 526
      //   516: aload_0
      //   517: aload #16
      //   519: invokespecial f : (Landroidx/recyclerview/widget/RecyclerView$d0;)V
      //   522: aload #16
      //   524: astore #15
      //   526: aload #15
      //   528: astore #16
      //   530: iload #6
      //   532: istore #7
      //   534: aload #15
      //   536: ifnonnull -> 747
      //   539: aload_0
      //   540: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   543: invokevirtual getNanoTime : ()J
      //   546: lstore #11
      //   548: lload_3
      //   549: ldc2_w 9223372036854775807
      //   552: lcmp
      //   553: ifeq -> 573
      //   556: aload_0
      //   557: getfield g : Landroidx/recyclerview/widget/RecyclerView$u;
      //   560: iload #8
      //   562: lload #11
      //   564: lload_3
      //   565: invokevirtual b : (IJJ)Z
      //   568: ifne -> 573
      //   571: aconst_null
      //   572: areturn
      //   573: aload_0
      //   574: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   577: astore #15
      //   579: aload #15
      //   581: getfield mAdapter : Landroidx/recyclerview/widget/RecyclerView$g;
      //   584: aload #15
      //   586: iload #8
      //   588: invokevirtual a : (Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
      //   591: astore #15
      //   593: getstatic androidx/recyclerview/widget/RecyclerView.ALLOW_THREAD_GAP_WORK : Z
      //   596: ifeq -> 628
      //   599: aload #15
      //   601: getfield a : Landroid/view/View;
      //   604: invokestatic findNestedRecyclerView : (Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
      //   607: astore #16
      //   609: aload #16
      //   611: ifnull -> 628
      //   614: aload #15
      //   616: new java/lang/ref/WeakReference
      //   619: dup
      //   620: aload #16
      //   622: invokespecial <init> : (Ljava/lang/Object;)V
      //   625: putfield b : Ljava/lang/ref/WeakReference;
      //   628: aload_0
      //   629: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   632: invokevirtual getNanoTime : ()J
      //   635: lstore #13
      //   637: aload_0
      //   638: getfield g : Landroidx/recyclerview/widget/RecyclerView$u;
      //   641: iload #8
      //   643: lload #13
      //   645: lload #11
      //   647: lsub
      //   648: invokevirtual b : (IJ)V
      //   651: goto -> 755
      //   654: new java/lang/StringBuilder
      //   657: dup
      //   658: invokespecial <init> : ()V
      //   661: astore #15
      //   663: aload #15
      //   665: ldc_w 'Inconsistency detected. Invalid item position '
      //   668: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   671: pop
      //   672: aload #15
      //   674: iload_1
      //   675: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   678: pop
      //   679: aload #15
      //   681: ldc_w '(offset:'
      //   684: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   687: pop
      //   688: aload #15
      //   690: iload #7
      //   692: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   695: pop
      //   696: aload #15
      //   698: ldc_w ').state:'
      //   701: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   704: pop
      //   705: aload #15
      //   707: aload_0
      //   708: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   711: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   714: invokevirtual a : ()I
      //   717: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   720: pop
      //   721: aload #15
      //   723: aload_0
      //   724: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   727: invokevirtual exceptionLabel : ()Ljava/lang/String;
      //   730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   733: pop
      //   734: new java/lang/IndexOutOfBoundsException
      //   737: dup
      //   738: aload #15
      //   740: invokevirtual toString : ()Ljava/lang/String;
      //   743: invokespecial <init> : (Ljava/lang/String;)V
      //   746: athrow
      //   747: aload #16
      //   749: astore #15
      //   751: iload #7
      //   753: istore #6
      //   755: iload #6
      //   757: ifeq -> 858
      //   760: aload_0
      //   761: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   764: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   767: invokevirtual d : ()Z
      //   770: ifne -> 858
      //   773: aload #15
      //   775: sipush #8192
      //   778: invokevirtual b : (I)Z
      //   781: ifeq -> 858
      //   784: aload #15
      //   786: iconst_0
      //   787: sipush #8192
      //   790: invokevirtual a : (II)V
      //   793: aload_0
      //   794: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   797: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   800: getfield k : Z
      //   803: ifeq -> 858
      //   806: aload #15
      //   808: invokestatic e : (Landroidx/recyclerview/widget/RecyclerView$d0;)I
      //   811: istore #5
      //   813: aload_0
      //   814: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   817: astore #16
      //   819: aload #16
      //   821: getfield mItemAnimator : Landroidx/recyclerview/widget/RecyclerView$l;
      //   824: aload #16
      //   826: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   829: aload #15
      //   831: iload #5
      //   833: sipush #4096
      //   836: ior
      //   837: aload #15
      //   839: invokevirtual k : ()Ljava/util/List;
      //   842: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)Landroidx/recyclerview/widget/RecyclerView$l$c;
      //   845: astore #16
      //   847: aload_0
      //   848: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   851: aload #15
      //   853: aload #16
      //   855: invokevirtual recordAnimationInfoIfBouncedHiddenView : (Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
      //   858: aload_0
      //   859: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   862: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   865: invokevirtual d : ()Z
      //   868: ifeq -> 888
      //   871: aload #15
      //   873: invokevirtual n : ()Z
      //   876: ifeq -> 888
      //   879: aload #15
      //   881: iload_1
      //   882: putfield g : I
      //   885: goto -> 915
      //   888: aload #15
      //   890: invokevirtual n : ()Z
      //   893: ifeq -> 920
      //   896: aload #15
      //   898: invokevirtual u : ()Z
      //   901: ifne -> 920
      //   904: aload #15
      //   906: invokevirtual o : ()Z
      //   909: ifeq -> 915
      //   912: goto -> 920
      //   915: iconst_0
      //   916: istore_2
      //   917: goto -> 940
      //   920: aload_0
      //   921: aload #15
      //   923: aload_0
      //   924: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   927: getfield mAdapterHelper : Landroidx/recyclerview/widget/a;
      //   930: iload_1
      //   931: invokevirtual b : (I)I
      //   934: iload_1
      //   935: lload_3
      //   936: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$d0;IIJ)Z
      //   939: istore_2
      //   940: aload #15
      //   942: getfield a : Landroid/view/View;
      //   945: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   948: astore #16
      //   950: aload #16
      //   952: ifnonnull -> 984
      //   955: aload_0
      //   956: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   959: invokevirtual generateDefaultLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   962: astore #16
      //   964: aload #16
      //   966: checkcast androidx/recyclerview/widget/RecyclerView$p
      //   969: astore #16
      //   971: aload #15
      //   973: getfield a : Landroid/view/View;
      //   976: aload #16
      //   978: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
      //   981: goto -> 1017
      //   984: aload_0
      //   985: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   988: aload #16
      //   990: invokevirtual checkLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)Z
      //   993: ifne -> 1010
      //   996: aload_0
      //   997: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   1000: aload #16
      //   1002: invokevirtual generateLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
      //   1005: astore #16
      //   1007: goto -> 964
      //   1010: aload #16
      //   1012: checkcast androidx/recyclerview/widget/RecyclerView$p
      //   1015: astore #16
      //   1017: aload #16
      //   1019: aload #15
      //   1021: putfield a : Landroidx/recyclerview/widget/RecyclerView$d0;
      //   1024: iload #6
      //   1026: ifeq -> 1039
      //   1029: iload_2
      //   1030: ifeq -> 1039
      //   1033: iload #9
      //   1035: istore_2
      //   1036: goto -> 1041
      //   1039: iconst_0
      //   1040: istore_2
      //   1041: aload #16
      //   1043: iload_2
      //   1044: putfield d : Z
      //   1047: aload #15
      //   1049: areturn
      //   1050: new java/lang/StringBuilder
      //   1053: dup
      //   1054: invokespecial <init> : ()V
      //   1057: astore #15
      //   1059: aload #15
      //   1061: ldc_w 'Invalid item position '
      //   1064: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1067: pop
      //   1068: aload #15
      //   1070: iload_1
      //   1071: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1074: pop
      //   1075: aload #15
      //   1077: ldc_w '('
      //   1080: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1083: pop
      //   1084: aload #15
      //   1086: iload_1
      //   1087: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1090: pop
      //   1091: aload #15
      //   1093: ldc_w '). Item count:'
      //   1096: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1099: pop
      //   1100: aload #15
      //   1102: aload_0
      //   1103: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   1106: getfield mState : Landroidx/recyclerview/widget/RecyclerView$a0;
      //   1109: invokevirtual a : ()I
      //   1112: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1115: pop
      //   1116: aload #15
      //   1118: aload_0
      //   1119: getfield i : Landroidx/recyclerview/widget/RecyclerView;
      //   1122: invokevirtual exceptionLabel : ()Ljava/lang/String;
      //   1125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1128: pop
      //   1129: new java/lang/IndexOutOfBoundsException
      //   1132: dup
      //   1133: aload #15
      //   1135: invokevirtual toString : ()Ljava/lang/String;
      //   1138: invokespecial <init> : (Ljava/lang/String;)V
      //   1141: astore #15
      //   1143: goto -> 1149
      //   1146: aload #15
      //   1148: athrow
      //   1149: goto -> 1146
    }
    
    RecyclerView.d0 a(long param1Long, int param1Int, boolean param1Boolean) {
      int i;
      for (i = this.a.size() - 1; i >= 0; i--) {
        RecyclerView.d0 d0 = this.a.get(i);
        if (d0.g() == param1Long && !d0.A()) {
          if (param1Int == d0.h()) {
            d0.a(32);
            if (d0.q() && !this.i.mState.d())
              d0.a(2, 14); 
            return d0;
          } 
          if (!param1Boolean) {
            this.a.remove(i);
            this.i.removeDetachedView(d0.a, false);
            a(d0.a);
          } 
        } 
      } 
      for (i = this.c.size() - 1; i >= 0; i--) {
        RecyclerView.d0 d0 = this.c.get(i);
        if (d0.g() == param1Long && !d0.m()) {
          if (param1Int == d0.h()) {
            if (!param1Boolean)
              this.c.remove(i); 
            return d0;
          } 
          if (!param1Boolean) {
            e(i);
            return null;
          } 
        } 
      } 
      return null;
    }
    
    public void a() {
      this.a.clear();
      i();
    }
    
    void a(int param1Int1, int param1Int2) {
      int j = this.c.size();
      for (int i = 0; i < j; i++) {
        RecyclerView.d0 d0 = this.c.get(i);
        if (d0 != null && d0.c >= param1Int1)
          d0.a(param1Int2, true); 
      } 
    }
    
    void a(int param1Int1, int param1Int2, boolean param1Boolean) {
      int i;
      for (i = this.c.size() - 1; i >= 0; i--) {
        RecyclerView.d0 d0 = this.c.get(i);
        if (d0 != null) {
          int j = d0.c;
          if (j >= param1Int1 + param1Int2) {
            d0.a(-param1Int2, param1Boolean);
          } else if (j >= param1Int1) {
            d0.a(8);
            e(i);
          } 
        } 
      } 
    }
    
    void a(View param1View) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      d0.n = null;
      d0.o = false;
      d0.c();
      b(d0);
    }
    
    void a(RecyclerView.b0 param1b0) {
      this.h = param1b0;
    }
    
    void a(RecyclerView.d0 param1d0) {
      RecyclerView.w w = this.i.mRecyclerListener;
      if (w != null)
        w.a(param1d0); 
      RecyclerView.g<RecyclerView.d0> g = this.i.mAdapter;
      if (g != null)
        g.d(param1d0); 
      RecyclerView recyclerView = this.i;
      if (recyclerView.mState != null)
        recyclerView.mViewInfoStore.h(param1d0); 
    }
    
    void a(RecyclerView.d0 param1d0, boolean param1Boolean) {
      RecyclerView.clearNestedRecyclerViewIfNotNested(param1d0);
      View view = param1d0.a;
      l l = this.i.mAccessibilityDelegate;
      if (l != null) {
        b.g.m.a a = l.b();
        if (a instanceof l.a) {
          a = ((l.a)a).c(view);
        } else {
          a = null;
        } 
        b.g.m.v.a(view, a);
      } 
      if (param1Boolean)
        a(param1d0); 
      param1d0.r = null;
      d().a(param1d0);
    }
    
    void a(RecyclerView.g param1g1, RecyclerView.g param1g2, boolean param1Boolean) {
      a();
      d().a(param1g1, param1g2, param1Boolean);
    }
    
    void a(RecyclerView.u param1u) {
      RecyclerView.u u1 = this.g;
      if (u1 != null)
        u1.c(); 
      this.g = param1u;
      if (this.g != null && this.i.getAdapter() != null)
        this.g.a(); 
    }
    
    View b(int param1Int, boolean param1Boolean) {
      return (a(param1Int, param1Boolean, Long.MAX_VALUE)).a;
    }
    
    RecyclerView.d0 b(int param1Int) {
      ArrayList<RecyclerView.d0> arrayList = this.b;
      if (arrayList != null) {
        int j = arrayList.size();
        if (j == 0)
          return null; 
        boolean bool = false;
        for (int i = 0; i < j; i++) {
          RecyclerView.d0 d0 = this.b.get(i);
          if (!d0.A() && d0.i() == param1Int) {
            d0.a(32);
            return d0;
          } 
        } 
        if (this.i.mAdapter.c()) {
          param1Int = this.i.mAdapterHelper.b(param1Int);
          if (param1Int > 0 && param1Int < this.i.mAdapter.a()) {
            long l = this.i.mAdapter.a(param1Int);
            for (param1Int = bool; param1Int < j; param1Int++) {
              RecyclerView.d0 d0 = this.b.get(param1Int);
              if (!d0.A() && d0.g() == l) {
                d0.a(32);
                return d0;
              } 
            } 
          } 
        } 
      } 
      return null;
    }
    
    void b() {
      int j = this.c.size();
      boolean bool = false;
      int i;
      for (i = 0; i < j; i++)
        ((RecyclerView.d0)this.c.get(i)).a(); 
      j = this.a.size();
      for (i = 0; i < j; i++)
        ((RecyclerView.d0)this.a.get(i)).a(); 
      ArrayList<RecyclerView.d0> arrayList = this.b;
      if (arrayList != null) {
        j = arrayList.size();
        for (i = bool; i < j; i++)
          ((RecyclerView.d0)this.b.get(i)).a(); 
      } 
    }
    
    void b(int param1Int1, int param1Int2) {
      int i;
      int j;
      boolean bool;
      if (param1Int1 < param1Int2) {
        i = param1Int1;
        j = param1Int2;
        bool = true;
      } else {
        j = param1Int1;
        i = param1Int2;
        bool = true;
      } 
      int m = this.c.size();
      int k;
      for (k = 0; k < m; k++) {
        RecyclerView.d0 d0 = this.c.get(k);
        if (d0 != null) {
          int n = d0.c;
          if (n >= i && n <= j)
            if (n == param1Int1) {
              d0.a(param1Int2 - param1Int1, false);
            } else {
              d0.a(bool, false);
            }  
        } 
      } 
    }
    
    public void b(View param1View) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0.s())
        this.i.removeDetachedView(param1View, false); 
      if (d0.r()) {
        d0.z();
      } else if (d0.A()) {
        d0.c();
      } 
      b(d0);
      if (this.i.mItemAnimator != null && !d0.p())
        this.i.mItemAnimator.c(d0); 
    }
    
    void b(RecyclerView.d0 param1d0) {
      IllegalArgumentException illegalArgumentException;
      StringBuilder stringBuilder1;
      boolean bool2 = param1d0.r();
      boolean bool1 = false;
      int i = 0;
      if (bool2 || param1d0.a.getParent() != null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scrapped or attached views may not be recycled. isScrap:");
        stringBuilder.append(param1d0.r());
        stringBuilder.append(" isAttached:");
        if (param1d0.a.getParent() != null)
          bool1 = true; 
        stringBuilder.append(bool1);
        stringBuilder.append(this.i.exceptionLabel());
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
      } 
      if (!illegalArgumentException.s()) {
        if (!illegalArgumentException.y()) {
          int j;
          int k;
          bool1 = illegalArgumentException.e();
          RecyclerView.g<IllegalArgumentException> g = this.i.mAdapter;
          if (g != null && bool1 && g.a(illegalArgumentException)) {
            j = 1;
          } else {
            j = 0;
          } 
          if (j || illegalArgumentException.p()) {
            if (this.f > 0 && !illegalArgumentException.b(526)) {
              int m = this.c.size();
              j = m;
              if (m >= this.f) {
                j = m;
                if (m > 0) {
                  e(0);
                  j = m - 1;
                } 
              } 
              m = j;
              if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                m = j;
                if (j > 0) {
                  m = j;
                  if (!this.i.mPrefetchRegistry.a(((RecyclerView.d0)illegalArgumentException).c)) {
                    while (--j >= 0) {
                      m = ((RecyclerView.d0)this.c.get(j)).c;
                      if (!this.i.mPrefetchRegistry.a(m))
                        break; 
                      j--;
                    } 
                    m = j + 1;
                  } 
                } 
              } 
              this.c.add(m, illegalArgumentException);
              j = 1;
            } else {
              j = 0;
            } 
            k = i;
            i = j;
            if (j == 0) {
              a((RecyclerView.d0)illegalArgumentException, true);
              k = 1;
              i = j;
            } 
          } else {
            j = 0;
            k = i;
            i = j;
          } 
          this.i.mViewInfoStore.h((RecyclerView.d0)illegalArgumentException);
          if (i == 0 && k == 0 && bool1)
            ((RecyclerView.d0)illegalArgumentException).r = null; 
          return;
        } 
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        stringBuilder1.append(this.i.exceptionLabel());
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
      stringBuilder2.append(stringBuilder1);
      stringBuilder2.append(this.i.exceptionLabel());
      throw new IllegalArgumentException(stringBuilder2.toString());
    }
    
    View c(int param1Int) {
      return ((RecyclerView.d0)this.a.get(param1Int)).a;
    }
    
    void c() {
      this.a.clear();
      ArrayList<RecyclerView.d0> arrayList = this.b;
      if (arrayList != null)
        arrayList.clear(); 
    }
    
    void c(int param1Int1, int param1Int2) {
      for (int i = this.c.size() - 1; i >= 0; i--) {
        RecyclerView.d0 d0 = this.c.get(i);
        if (d0 != null) {
          int j = d0.c;
          if (j >= param1Int1 && j < param1Int2 + param1Int1) {
            d0.a(2);
            e(i);
          } 
        } 
      } 
    }
    
    void c(View param1View) {
      ArrayList<RecyclerView.d0> arrayList;
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(param1View);
      if (d0.b(12) || !d0.t() || this.i.canReuseUpdatedViewHolder(d0)) {
        if (!d0.o() || d0.q() || this.i.mAdapter.c()) {
          d0.a(this, false);
          arrayList = this.a;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          stringBuilder.append(this.i.exceptionLabel());
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        if (this.b == null)
          this.b = new ArrayList<RecyclerView.d0>(); 
        d0.a(this, true);
        arrayList = this.b;
      } 
      arrayList.add(d0);
    }
    
    void c(RecyclerView.d0 param1d0) {
      ArrayList<RecyclerView.d0> arrayList;
      if (param1d0.o) {
        arrayList = this.b;
      } else {
        arrayList = this.a;
      } 
      arrayList.remove(param1d0);
      param1d0.n = null;
      param1d0.o = false;
      param1d0.c();
    }
    
    public View d(int param1Int) {
      return b(param1Int, false);
    }
    
    RecyclerView.u d() {
      if (this.g == null)
        this.g = new RecyclerView.u(); 
      return this.g;
    }
    
    boolean d(RecyclerView.d0 param1d0) {
      if (param1d0.q())
        return this.i.mState.d(); 
      int i = param1d0.c;
      if (i >= 0 && i < this.i.mAdapter.a()) {
        boolean bool1 = this.i.mState.d();
        boolean bool = false;
        if (!bool1 && this.i.mAdapter.b(param1d0.c) != param1d0.h())
          return false; 
        if (this.i.mAdapter.c()) {
          if (param1d0.g() == this.i.mAdapter.a(param1d0.c))
            bool = true; 
          return bool;
        } 
        return true;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
      stringBuilder.append(param1d0);
      stringBuilder.append(this.i.exceptionLabel());
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
    
    int e() {
      return this.a.size();
    }
    
    void e(int param1Int) {
      a(this.c.get(param1Int), true);
      this.c.remove(param1Int);
    }
    
    public List<RecyclerView.d0> f() {
      return this.d;
    }
    
    public void f(int param1Int) {
      this.e = param1Int;
      j();
    }
    
    void g() {
      int j = this.c.size();
      for (int i = 0; i < j; i++) {
        RecyclerView.p p = (RecyclerView.p)((RecyclerView.d0)this.c.get(i)).a.getLayoutParams();
        if (p != null)
          p.c = true; 
      } 
    }
    
    void h() {
      int j = this.c.size();
      for (int i = 0; i < j; i++) {
        RecyclerView.d0 d0 = this.c.get(i);
        if (d0 != null) {
          d0.a(6);
          d0.a((Object)null);
        } 
      } 
      RecyclerView.g g = this.i.mAdapter;
      if (g == null || !g.c())
        i(); 
    }
    
    void i() {
      for (int i = this.c.size() - 1; i >= 0; i--)
        e(i); 
      this.c.clear();
      if (RecyclerView.ALLOW_THREAD_GAP_WORK)
        this.i.mPrefetchRegistry.a(); 
    }
    
    void j() {
      RecyclerView.o o = this.i.mLayout;
      if (o != null) {
        i = o.m;
      } else {
        i = 0;
      } 
      this.f = this.e + i;
      for (int i = this.c.size() - 1; i >= 0 && this.c.size() > this.f; i--)
        e(i); 
    }
  }
  
  public static interface w {
    void a(RecyclerView.d0 param1d0);
  }
  
  private class x extends i {
    x(RecyclerView this$0) {}
    
    public void a() {
      this.a.assertNotInLayoutOrScroll(null);
      RecyclerView recyclerView = this.a;
      recyclerView.mState.g = true;
      recyclerView.processDataSetCompletelyChanged(true);
      if (!this.a.mAdapterHelper.c())
        this.a.requestLayout(); 
    }
  }
  
  public static class y extends b.i.a.a {
    public static final Parcelable.Creator<y> CREATOR = (Parcelable.Creator<y>)new a();
    
    Parcelable e;
    
    y(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      if (param1ClassLoader == null)
        param1ClassLoader = RecyclerView.o.class.getClassLoader(); 
      this.e = param1Parcel.readParcelable(param1ClassLoader);
    }
    
    y(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    void a(y param1y) {
      this.e = param1y.e;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeParcelable(this.e, 0);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<y> {
      public RecyclerView.y createFromParcel(Parcel param2Parcel) {
        return new RecyclerView.y(param2Parcel, null);
      }
      
      public RecyclerView.y createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new RecyclerView.y(param2Parcel, param2ClassLoader);
      }
      
      public RecyclerView.y[] newArray(int param2Int) {
        return new RecyclerView.y[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<y> {
    public RecyclerView.y createFromParcel(Parcel param1Parcel) {
      return new RecyclerView.y(param1Parcel, null);
    }
    
    public RecyclerView.y createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new RecyclerView.y(param1Parcel, param1ClassLoader);
    }
    
    public RecyclerView.y[] newArray(int param1Int) {
      return new RecyclerView.y[param1Int];
    }
  }
  
  public static abstract class z {
    private int a = -1;
    
    private RecyclerView b;
    
    private RecyclerView.o c;
    
    private boolean d;
    
    private boolean e;
    
    private View f;
    
    private final a g = new a(0, 0);
    
    private boolean h;
    
    public int a() {
      return this.b.mLayout.e();
    }
    
    public int a(View param1View) {
      return this.b.getChildLayoutPosition(param1View);
    }
    
    public PointF a(int param1Int) {
      RecyclerView.o o1 = b();
      if (o1 instanceof b)
        return ((b)o1).a(param1Int); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
      stringBuilder.append(b.class.getCanonicalName());
      Log.w("RecyclerView", stringBuilder.toString());
      return null;
    }
    
    void a(int param1Int1, int param1Int2) {
      RecyclerView recyclerView = this.b;
      if (this.a == -1 || recyclerView == null)
        h(); 
      if (this.d && this.f == null && this.c != null) {
        PointF pointF = a(this.a);
        if (pointF != null && (pointF.x != 0.0F || pointF.y != 0.0F))
          recyclerView.scrollStep((int)Math.signum(pointF.x), (int)Math.signum(pointF.y), null); 
      } 
      this.d = false;
      View view = this.f;
      if (view != null)
        if (a(view) == this.a) {
          a(this.f, recyclerView.mState, this.g);
          this.g.a(recyclerView);
          h();
        } else {
          Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
          this.f = null;
        }  
      if (this.e) {
        a(param1Int1, param1Int2, recyclerView.mState, this.g);
        boolean bool = this.g.a();
        this.g.a(recyclerView);
        if (bool && this.e) {
          this.d = true;
          recyclerView.mViewFlinger.a();
        } 
      } 
    }
    
    protected abstract void a(int param1Int1, int param1Int2, RecyclerView.a0 param1a0, a param1a);
    
    protected void a(PointF param1PointF) {
      float f1 = param1PointF.x;
      float f2 = param1PointF.y;
      f1 = (float)Math.sqrt((f1 * f1 + f2 * f2));
      param1PointF.x /= f1;
      param1PointF.y /= f1;
    }
    
    protected abstract void a(View param1View, RecyclerView.a0 param1a0, a param1a);
    
    void a(RecyclerView param1RecyclerView, RecyclerView.o param1o) {
      param1RecyclerView.mViewFlinger.b();
      if (this.h) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("An instance of ");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" was started more than once. Each instance of");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
        Log.w("RecyclerView", stringBuilder.toString());
      } 
      this.b = param1RecyclerView;
      this.c = param1o;
      int i = this.a;
      if (i != -1) {
        this.b.mState.a = i;
        this.e = true;
        this.d = true;
        this.f = b(c());
        f();
        this.b.mViewFlinger.a();
        this.h = true;
        return;
      } 
      throw new IllegalArgumentException("Invalid target position");
    }
    
    public View b(int param1Int) {
      return this.b.mLayout.c(param1Int);
    }
    
    public RecyclerView.o b() {
      return this.c;
    }
    
    protected void b(View param1View) {
      if (a(param1View) == c())
        this.f = param1View; 
    }
    
    public int c() {
      return this.a;
    }
    
    public void c(int param1Int) {
      this.a = param1Int;
    }
    
    public boolean d() {
      return this.d;
    }
    
    public boolean e() {
      return this.e;
    }
    
    protected abstract void f();
    
    protected abstract void g();
    
    protected final void h() {
      if (!this.e)
        return; 
      this.e = false;
      g();
      this.b.mState.a = -1;
      this.f = null;
      this.a = -1;
      this.d = false;
      this.c.a(this);
      this.c = null;
      this.b = null;
    }
    
    public static class a {
      private int a;
      
      private int b;
      
      private int c;
      
      private int d = -1;
      
      private Interpolator e;
      
      private boolean f = false;
      
      private int g = 0;
      
      public a(int param2Int1, int param2Int2) {
        this(param2Int1, param2Int2, -2147483648, null);
      }
      
      public a(int param2Int1, int param2Int2, int param2Int3, Interpolator param2Interpolator) {
        this.a = param2Int1;
        this.b = param2Int2;
        this.c = param2Int3;
        this.e = param2Interpolator;
      }
      
      private void b() {
        if (this.e == null || this.c >= 1) {
          if (this.c >= 1)
            return; 
          throw new IllegalStateException("Scroll duration must be a positive number");
        } 
        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
      }
      
      public void a(int param2Int) {
        this.d = param2Int;
      }
      
      public void a(int param2Int1, int param2Int2, int param2Int3, Interpolator param2Interpolator) {
        this.a = param2Int1;
        this.b = param2Int2;
        this.c = param2Int3;
        this.e = param2Interpolator;
        this.f = true;
      }
      
      void a(RecyclerView param2RecyclerView) {
        int i = this.d;
        if (i >= 0) {
          this.d = -1;
          param2RecyclerView.jumpToPositionForSmoothScroller(i);
          this.f = false;
          return;
        } 
        if (this.f) {
          b();
          param2RecyclerView.mViewFlinger.a(this.a, this.b, this.c, this.e);
          this.g++;
          if (this.g > 10)
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"); 
          this.f = false;
          return;
        } 
        this.g = 0;
      }
      
      boolean a() {
        return (this.d >= 0);
      }
    }
    
    public static interface b {
      PointF a(int param2Int);
    }
  }
  
  public static class a {
    private int a;
    
    private int b;
    
    private int c;
    
    private int d = -1;
    
    private Interpolator e;
    
    private boolean f = false;
    
    private int g = 0;
    
    public a(int param1Int1, int param1Int2) {
      this(param1Int1, param1Int2, -2147483648, null);
    }
    
    public a(int param1Int1, int param1Int2, int param1Int3, Interpolator param1Interpolator) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.e = param1Interpolator;
    }
    
    private void b() {
      if (this.e == null || this.c >= 1) {
        if (this.c >= 1)
          return; 
        throw new IllegalStateException("Scroll duration must be a positive number");
      } 
      throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
    }
    
    public void a(int param1Int) {
      this.d = param1Int;
    }
    
    public void a(int param1Int1, int param1Int2, int param1Int3, Interpolator param1Interpolator) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.e = param1Interpolator;
      this.f = true;
    }
    
    void a(RecyclerView param1RecyclerView) {
      int i = this.d;
      if (i >= 0) {
        this.d = -1;
        param1RecyclerView.jumpToPositionForSmoothScroller(i);
        this.f = false;
        return;
      } 
      if (this.f) {
        b();
        param1RecyclerView.mViewFlinger.a(this.a, this.b, this.c, this.e);
        this.g++;
        if (this.g > 10)
          Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"); 
        this.f = false;
        return;
      } 
      this.g = 0;
    }
    
    boolean a() {
      return (this.d >= 0);
    }
  }
  
  public static interface b {
    PointF a(int param1Int);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */