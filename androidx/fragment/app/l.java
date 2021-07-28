package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class l implements LayoutInflater.Factory2 {
  final n c;
  
  l(n paramn) {
    this.c = paramn;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: ldc androidx/fragment/app/h
    //   2: invokevirtual getName : ()Ljava/lang/String;
    //   5: aload_2
    //   6: invokevirtual equals : (Ljava/lang/Object;)Z
    //   9: ifeq -> 27
    //   12: new androidx/fragment/app/h
    //   15: dup
    //   16: aload_3
    //   17: aload #4
    //   19: aload_0
    //   20: getfield c : Landroidx/fragment/app/n;
    //   23: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/n;)V
    //   26: areturn
    //   27: ldc 'fragment'
    //   29: aload_2
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: istore #8
    //   35: aconst_null
    //   36: astore_2
    //   37: iload #8
    //   39: ifne -> 44
    //   42: aconst_null
    //   43: areturn
    //   44: aload #4
    //   46: aconst_null
    //   47: ldc 'class'
    //   49: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   54: astore #9
    //   56: aload_3
    //   57: aload #4
    //   59: getstatic b/l/c.Fragment : [I
    //   62: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   65: astore #11
    //   67: aload #9
    //   69: astore #10
    //   71: aload #9
    //   73: ifnonnull -> 86
    //   76: aload #11
    //   78: getstatic b/l/c.Fragment_android_name : I
    //   81: invokevirtual getString : (I)Ljava/lang/String;
    //   84: astore #10
    //   86: aload #11
    //   88: getstatic b/l/c.Fragment_android_id : I
    //   91: iconst_m1
    //   92: invokevirtual getResourceId : (II)I
    //   95: istore #7
    //   97: aload #11
    //   99: getstatic b/l/c.Fragment_android_tag : I
    //   102: invokevirtual getString : (I)Ljava/lang/String;
    //   105: astore #12
    //   107: aload #11
    //   109: invokevirtual recycle : ()V
    //   112: aload #10
    //   114: ifnull -> 810
    //   117: aload_3
    //   118: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   121: aload #10
    //   123: invokestatic b : (Ljava/lang/ClassLoader;Ljava/lang/String;)Z
    //   126: ifne -> 131
    //   129: aconst_null
    //   130: areturn
    //   131: aload_1
    //   132: ifnull -> 144
    //   135: aload_1
    //   136: invokevirtual getId : ()I
    //   139: istore #5
    //   141: goto -> 147
    //   144: iconst_0
    //   145: istore #5
    //   147: iload #5
    //   149: iconst_m1
    //   150: if_icmpne -> 213
    //   153: iload #7
    //   155: iconst_m1
    //   156: if_icmpne -> 213
    //   159: aload #12
    //   161: ifnull -> 167
    //   164: goto -> 213
    //   167: new java/lang/StringBuilder
    //   170: dup
    //   171: invokespecial <init> : ()V
    //   174: astore_1
    //   175: aload_1
    //   176: aload #4
    //   178: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_1
    //   188: ldc ': Must specify unique android:id, android:tag, or have a parent with an id for '
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload_1
    //   195: aload #10
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: new java/lang/IllegalArgumentException
    //   204: dup
    //   205: aload_1
    //   206: invokevirtual toString : ()Ljava/lang/String;
    //   209: invokespecial <init> : (Ljava/lang/String;)V
    //   212: athrow
    //   213: iload #7
    //   215: iconst_m1
    //   216: if_icmpeq -> 229
    //   219: aload_0
    //   220: getfield c : Landroidx/fragment/app/n;
    //   223: iload #7
    //   225: invokevirtual a : (I)Landroidx/fragment/app/Fragment;
    //   228: astore_2
    //   229: aload_2
    //   230: astore #9
    //   232: aload_2
    //   233: ifnonnull -> 255
    //   236: aload_2
    //   237: astore #9
    //   239: aload #12
    //   241: ifnull -> 255
    //   244: aload_0
    //   245: getfield c : Landroidx/fragment/app/n;
    //   248: aload #12
    //   250: invokevirtual c : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    //   253: astore #9
    //   255: aload #9
    //   257: astore_2
    //   258: aload #9
    //   260: ifnonnull -> 282
    //   263: aload #9
    //   265: astore_2
    //   266: iload #5
    //   268: iconst_m1
    //   269: if_icmpeq -> 282
    //   272: aload_0
    //   273: getfield c : Landroidx/fragment/app/n;
    //   276: iload #5
    //   278: invokevirtual a : (I)Landroidx/fragment/app/Fragment;
    //   281: astore_2
    //   282: aload_2
    //   283: ifnonnull -> 486
    //   286: aload_0
    //   287: getfield c : Landroidx/fragment/app/n;
    //   290: invokevirtual s : ()Landroidx/fragment/app/j;
    //   293: aload_3
    //   294: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   297: aload #10
    //   299: invokevirtual a : (Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    //   302: astore #9
    //   304: aload #9
    //   306: iconst_1
    //   307: putfield p : Z
    //   310: iload #7
    //   312: ifeq -> 322
    //   315: iload #7
    //   317: istore #6
    //   319: goto -> 326
    //   322: iload #5
    //   324: istore #6
    //   326: aload #9
    //   328: iload #6
    //   330: putfield y : I
    //   333: aload #9
    //   335: iload #5
    //   337: putfield z : I
    //   340: aload #9
    //   342: aload #12
    //   344: putfield A : Ljava/lang/String;
    //   347: aload #9
    //   349: iconst_1
    //   350: putfield q : Z
    //   353: aload_0
    //   354: getfield c : Landroidx/fragment/app/n;
    //   357: astore_2
    //   358: aload #9
    //   360: aload_2
    //   361: putfield u : Landroidx/fragment/app/n;
    //   364: aload #9
    //   366: aload_2
    //   367: invokevirtual v : ()Landroidx/fragment/app/k;
    //   370: putfield v : Landroidx/fragment/app/k;
    //   373: aload #9
    //   375: aload_0
    //   376: getfield c : Landroidx/fragment/app/n;
    //   379: invokevirtual v : ()Landroidx/fragment/app/k;
    //   382: invokevirtual f : ()Landroid/content/Context;
    //   385: aload #4
    //   387: aload #9
    //   389: getfield d : Landroid/os/Bundle;
    //   392: invokevirtual a : (Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    //   395: aload_0
    //   396: getfield c : Landroidx/fragment/app/n;
    //   399: aload #9
    //   401: invokevirtual a : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/v;
    //   404: astore_2
    //   405: aload #9
    //   407: astore_3
    //   408: aload_2
    //   409: astore #4
    //   411: iconst_2
    //   412: invokestatic d : (I)Z
    //   415: ifeq -> 595
    //   418: new java/lang/StringBuilder
    //   421: dup
    //   422: invokespecial <init> : ()V
    //   425: astore #11
    //   427: aload #11
    //   429: ldc 'Fragment '
    //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: pop
    //   435: aload #11
    //   437: aload #9
    //   439: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   442: pop
    //   443: ldc ' has been inflated via the <fragment> tag: id=0x'
    //   445: astore #4
    //   447: aload #9
    //   449: astore_3
    //   450: aload #11
    //   452: aload #4
    //   454: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: pop
    //   458: aload #11
    //   460: iload #7
    //   462: invokestatic toHexString : (I)Ljava/lang/String;
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: ldc 'FragmentManager'
    //   471: aload #11
    //   473: invokevirtual toString : ()Ljava/lang/String;
    //   476: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   479: pop
    //   480: aload_2
    //   481: astore #4
    //   483: goto -> 595
    //   486: aload_2
    //   487: getfield q : Z
    //   490: ifne -> 715
    //   493: aload_2
    //   494: iconst_1
    //   495: putfield q : Z
    //   498: aload_0
    //   499: getfield c : Landroidx/fragment/app/n;
    //   502: astore_3
    //   503: aload_2
    //   504: aload_3
    //   505: putfield u : Landroidx/fragment/app/n;
    //   508: aload_2
    //   509: aload_3
    //   510: invokevirtual v : ()Landroidx/fragment/app/k;
    //   513: putfield v : Landroidx/fragment/app/k;
    //   516: aload_2
    //   517: aload_0
    //   518: getfield c : Landroidx/fragment/app/n;
    //   521: invokevirtual v : ()Landroidx/fragment/app/k;
    //   524: invokevirtual f : ()Landroid/content/Context;
    //   527: aload #4
    //   529: aload_2
    //   530: getfield d : Landroid/os/Bundle;
    //   533: invokevirtual a : (Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    //   536: aload_0
    //   537: getfield c : Landroidx/fragment/app/n;
    //   540: aload_2
    //   541: invokevirtual c : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/v;
    //   544: astore #9
    //   546: aload_2
    //   547: astore_3
    //   548: aload #9
    //   550: astore #4
    //   552: iconst_2
    //   553: invokestatic d : (I)Z
    //   556: ifeq -> 595
    //   559: new java/lang/StringBuilder
    //   562: dup
    //   563: invokespecial <init> : ()V
    //   566: astore #11
    //   568: aload #11
    //   570: ldc 'Retained Fragment '
    //   572: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: aload #11
    //   578: aload_2
    //   579: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   582: pop
    //   583: ldc ' has been re-attached via the <fragment> tag: id=0x'
    //   585: astore #4
    //   587: aload_2
    //   588: astore_3
    //   589: aload #9
    //   591: astore_2
    //   592: goto -> 450
    //   595: aload_3
    //   596: aload_1
    //   597: checkcast android/view/ViewGroup
    //   600: putfield I : Landroid/view/ViewGroup;
    //   603: aload #4
    //   605: invokevirtual l : ()V
    //   608: aload #4
    //   610: invokevirtual j : ()V
    //   613: aload_3
    //   614: getfield J : Landroid/view/View;
    //   617: astore_1
    //   618: aload_1
    //   619: ifnull -> 674
    //   622: iload #7
    //   624: ifeq -> 633
    //   627: aload_1
    //   628: iload #7
    //   630: invokevirtual setId : (I)V
    //   633: aload_3
    //   634: getfield J : Landroid/view/View;
    //   637: invokevirtual getTag : ()Ljava/lang/Object;
    //   640: ifnonnull -> 652
    //   643: aload_3
    //   644: getfield J : Landroid/view/View;
    //   647: aload #12
    //   649: invokevirtual setTag : (Ljava/lang/Object;)V
    //   652: aload_3
    //   653: getfield J : Landroid/view/View;
    //   656: new androidx/fragment/app/l$a
    //   659: dup
    //   660: aload_0
    //   661: aload #4
    //   663: invokespecial <init> : (Landroidx/fragment/app/l;Landroidx/fragment/app/v;)V
    //   666: invokevirtual addOnAttachStateChangeListener : (Landroid/view/View$OnAttachStateChangeListener;)V
    //   669: aload_3
    //   670: getfield J : Landroid/view/View;
    //   673: areturn
    //   674: new java/lang/StringBuilder
    //   677: dup
    //   678: invokespecial <init> : ()V
    //   681: astore_1
    //   682: aload_1
    //   683: ldc 'Fragment '
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: pop
    //   689: aload_1
    //   690: aload #10
    //   692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: pop
    //   696: aload_1
    //   697: ldc ' did not create a view.'
    //   699: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: pop
    //   703: new java/lang/IllegalStateException
    //   706: dup
    //   707: aload_1
    //   708: invokevirtual toString : ()Ljava/lang/String;
    //   711: invokespecial <init> : (Ljava/lang/String;)V
    //   714: athrow
    //   715: new java/lang/StringBuilder
    //   718: dup
    //   719: invokespecial <init> : ()V
    //   722: astore_1
    //   723: aload_1
    //   724: aload #4
    //   726: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   731: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: pop
    //   735: aload_1
    //   736: ldc ': Duplicate id 0x'
    //   738: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   741: pop
    //   742: aload_1
    //   743: iload #7
    //   745: invokestatic toHexString : (I)Ljava/lang/String;
    //   748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   751: pop
    //   752: aload_1
    //   753: ldc ', tag '
    //   755: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: pop
    //   759: aload_1
    //   760: aload #12
    //   762: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: pop
    //   766: aload_1
    //   767: ldc ', or parent id 0x'
    //   769: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: pop
    //   773: aload_1
    //   774: iload #5
    //   776: invokestatic toHexString : (I)Ljava/lang/String;
    //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: aload_1
    //   784: ldc_w ' with another fragment for '
    //   787: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: pop
    //   791: aload_1
    //   792: aload #10
    //   794: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   797: pop
    //   798: new java/lang/IllegalArgumentException
    //   801: dup
    //   802: aload_1
    //   803: invokevirtual toString : ()Ljava/lang/String;
    //   806: invokespecial <init> : (Ljava/lang/String;)V
    //   809: athrow
    //   810: aconst_null
    //   811: areturn
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  class a implements View.OnAttachStateChangeListener {
    a(l this$0, v param1v) {}
    
    public void onViewAttachedToWindow(View param1View) {
      Fragment fragment = this.c.k();
      this.c.l();
      d0.a((ViewGroup)fragment.J.getParent(), this.d.c).b();
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */