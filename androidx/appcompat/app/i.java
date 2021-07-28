package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.z;
import b.a.j;
import b.a.o.d;
import b.d.g;
import b.g.m.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i {
  private static final String LOG_TAG = "AppCompatViewInflater";
  
  private static final String[] sClassPrefixList;
  
  private static final g<String, Constructor<? extends View>> sConstructorMap;
  
  private static final Class<?>[] sConstructorSignature = new Class[] { Context.class, AttributeSet.class };
  
  private static final int[] sOnClickAttrs = new int[] { 16843375 };
  
  private final Object[] mConstructorArgs = new Object[2];
  
  static {
    sClassPrefixList = new String[] { "android.widget.", "android.view.", "android.webkit." };
    sConstructorMap = new g();
  }
  
  private void checkOnClickListener(View paramView, AttributeSet paramAttributeSet) {
    Context context = paramView.getContext();
    if (context instanceof ContextWrapper) {
      if (Build.VERSION.SDK_INT >= 15 && !v.C(paramView))
        return; 
      TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, sOnClickAttrs);
      String str = typedArray.getString(0);
      if (str != null)
        paramView.setOnClickListener(new a(paramView, str)); 
      typedArray.recycle();
    } 
  }
  
  private View createViewByPrefix(Context paramContext, String paramString1, String paramString2) {
    Constructor constructor1 = (Constructor)sConstructorMap.get(paramString1);
    Constructor<View> constructor = constructor1;
    if (constructor1 == null) {
      if (paramString2 != null)
        try {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramString2);
          stringBuilder.append(paramString1);
          paramString2 = stringBuilder.toString();
          constructor = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(sConstructorSignature);
          sConstructorMap.put(paramString1, constructor);
          constructor.setAccessible(true);
          return constructor.newInstance(this.mConstructorArgs);
        } catch (Exception exception) {
          return null;
        }  
    } else {
      constructor.setAccessible(true);
      return constructor.newInstance(this.mConstructorArgs);
    } 
    paramString2 = paramString1;
    constructor = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(sConstructorSignature);
    sConstructorMap.put(paramString1, constructor);
    constructor.setAccessible(true);
    return constructor.newInstance(this.mConstructorArgs);
  }
  
  private View createViewFromTag(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    String str = paramString;
    if (paramString.equals("view"))
      str = paramAttributeSet.getAttributeValue(null, "class"); 
    try {
      Object[] arrayOfObject1;
      this.mConstructorArgs[0] = paramContext;
      this.mConstructorArgs[1] = paramAttributeSet;
      if (-1 == str.indexOf('.')) {
        int j;
        for (j = 0; j < sClassPrefixList.length; j++) {
          View view = createViewByPrefix(paramContext, str, sClassPrefixList[j]);
          if (view != null)
            return view; 
        } 
        return null;
      } 
      return createViewByPrefix((Context)arrayOfObject1, str, null);
    } catch (Exception exception) {
      return null;
    } finally {
      Object[] arrayOfObject = this.mConstructorArgs;
      arrayOfObject[0] = null;
      arrayOfObject[1] = null;
    } 
  }
  
  private static Context themifyContext(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2) {
    int j;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.View, 0, 0);
    if (paramBoolean1) {
      j = typedArray.getResourceId(j.View_android_theme, 0);
    } else {
      j = 0;
    } 
    int k = j;
    if (paramBoolean2) {
      k = j;
      if (!j) {
        j = typedArray.getResourceId(j.View_theme, 0);
        k = j;
        if (j != 0) {
          Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
          k = j;
        } 
      } 
    } 
    typedArray.recycle();
    Context context = paramContext;
    if (k != 0) {
      if (paramContext instanceof d) {
        context = paramContext;
        return (Context)((((d)paramContext).a() != k) ? new d(paramContext, k) : context);
      } 
    } else {
      return context;
    } 
    return (Context)new d(paramContext, k);
  }
  
  private void verifyNotNull(View paramView, String paramString) {
    if (paramView != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    stringBuilder.append(" asked to inflate view for <");
    stringBuilder.append(paramString);
    stringBuilder.append(">, but returned null");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected d createAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new d(paramContext, paramAttributeSet);
  }
  
  protected f createButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new f(paramContext, paramAttributeSet);
  }
  
  protected g createCheckBox(Context paramContext, AttributeSet paramAttributeSet) {
    return new g(paramContext, paramAttributeSet);
  }
  
  protected h createCheckedTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new h(paramContext, paramAttributeSet);
  }
  
  protected k createEditText(Context paramContext, AttributeSet paramAttributeSet) {
    return new k(paramContext, paramAttributeSet);
  }
  
  protected m createImageButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new m(paramContext, paramAttributeSet);
  }
  
  protected o createImageView(Context paramContext, AttributeSet paramAttributeSet) {
    return new o(paramContext, paramAttributeSet);
  }
  
  protected p createMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new p(paramContext, paramAttributeSet);
  }
  
  protected s createRadioButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new s(paramContext, paramAttributeSet);
  }
  
  protected t createRatingBar(Context paramContext, AttributeSet paramAttributeSet) {
    return new t(paramContext, paramAttributeSet);
  }
  
  protected u createSeekBar(Context paramContext, AttributeSet paramAttributeSet) {
    return new u(paramContext, paramAttributeSet);
  }
  
  protected w createSpinner(Context paramContext, AttributeSet paramAttributeSet) {
    return new w(paramContext, paramAttributeSet);
  }
  
  protected z createTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new z(paramContext, paramAttributeSet);
  }
  
  protected b0 createToggleButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new b0(paramContext, paramAttributeSet);
  }
  
  protected View createView(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    return null;
  }
  
  final View createView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: iload #5
    //   2: ifeq -> 18
    //   5: aload_1
    //   6: ifnull -> 18
    //   9: aload_1
    //   10: invokevirtual getContext : ()Landroid/content/Context;
    //   13: astore #10
    //   15: goto -> 21
    //   18: aload_3
    //   19: astore #10
    //   21: iload #6
    //   23: ifne -> 34
    //   26: aload #10
    //   28: astore_1
    //   29: iload #7
    //   31: ifeq -> 46
    //   34: aload #10
    //   36: aload #4
    //   38: iload #6
    //   40: iload #7
    //   42: invokestatic themifyContext : (Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
    //   45: astore_1
    //   46: aload_1
    //   47: astore #10
    //   49: iload #8
    //   51: ifeq -> 60
    //   54: aload_1
    //   55: invokestatic b : (Landroid/content/Context;)Landroid/content/Context;
    //   58: astore #10
    //   60: iconst_m1
    //   61: istore #9
    //   63: aload_2
    //   64: invokevirtual hashCode : ()I
    //   67: lookupswitch default -> 188, -1946472170 -> 406, -1455429095 -> 389, -1346021293 -> 372, -938935918 -> 356, -937446323 -> 340, -658531749 -> 323, -339785223 -> 307, 776382189 -> 290, 799298502 -> 273, 1125864064 -> 257, 1413872058 -> 240, 1601505219 -> 223, 1666676343 -> 207, 2001146706 -> 191
    //   188: goto -> 420
    //   191: aload_2
    //   192: ldc_w 'Button'
    //   195: invokevirtual equals : (Ljava/lang/Object;)Z
    //   198: ifeq -> 420
    //   201: iconst_2
    //   202: istore #9
    //   204: goto -> 420
    //   207: aload_2
    //   208: ldc_w 'EditText'
    //   211: invokevirtual equals : (Ljava/lang/Object;)Z
    //   214: ifeq -> 420
    //   217: iconst_3
    //   218: istore #9
    //   220: goto -> 420
    //   223: aload_2
    //   224: ldc_w 'CheckBox'
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifeq -> 420
    //   233: bipush #6
    //   235: istore #9
    //   237: goto -> 420
    //   240: aload_2
    //   241: ldc_w 'AutoCompleteTextView'
    //   244: invokevirtual equals : (Ljava/lang/Object;)Z
    //   247: ifeq -> 420
    //   250: bipush #9
    //   252: istore #9
    //   254: goto -> 420
    //   257: aload_2
    //   258: ldc_w 'ImageView'
    //   261: invokevirtual equals : (Ljava/lang/Object;)Z
    //   264: ifeq -> 420
    //   267: iconst_1
    //   268: istore #9
    //   270: goto -> 420
    //   273: aload_2
    //   274: ldc_w 'ToggleButton'
    //   277: invokevirtual equals : (Ljava/lang/Object;)Z
    //   280: ifeq -> 420
    //   283: bipush #13
    //   285: istore #9
    //   287: goto -> 420
    //   290: aload_2
    //   291: ldc_w 'RadioButton'
    //   294: invokevirtual equals : (Ljava/lang/Object;)Z
    //   297: ifeq -> 420
    //   300: bipush #7
    //   302: istore #9
    //   304: goto -> 420
    //   307: aload_2
    //   308: ldc_w 'Spinner'
    //   311: invokevirtual equals : (Ljava/lang/Object;)Z
    //   314: ifeq -> 420
    //   317: iconst_4
    //   318: istore #9
    //   320: goto -> 420
    //   323: aload_2
    //   324: ldc_w 'SeekBar'
    //   327: invokevirtual equals : (Ljava/lang/Object;)Z
    //   330: ifeq -> 420
    //   333: bipush #12
    //   335: istore #9
    //   337: goto -> 420
    //   340: aload_2
    //   341: ldc_w 'ImageButton'
    //   344: invokevirtual equals : (Ljava/lang/Object;)Z
    //   347: ifeq -> 420
    //   350: iconst_5
    //   351: istore #9
    //   353: goto -> 420
    //   356: aload_2
    //   357: ldc_w 'TextView'
    //   360: invokevirtual equals : (Ljava/lang/Object;)Z
    //   363: ifeq -> 420
    //   366: iconst_0
    //   367: istore #9
    //   369: goto -> 420
    //   372: aload_2
    //   373: ldc_w 'MultiAutoCompleteTextView'
    //   376: invokevirtual equals : (Ljava/lang/Object;)Z
    //   379: ifeq -> 420
    //   382: bipush #10
    //   384: istore #9
    //   386: goto -> 420
    //   389: aload_2
    //   390: ldc_w 'CheckedTextView'
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: ifeq -> 420
    //   399: bipush #8
    //   401: istore #9
    //   403: goto -> 420
    //   406: aload_2
    //   407: ldc_w 'RatingBar'
    //   410: invokevirtual equals : (Ljava/lang/Object;)Z
    //   413: ifeq -> 420
    //   416: bipush #11
    //   418: istore #9
    //   420: iload #9
    //   422: tableswitch default -> 492, 0 -> 661, 1 -> 649, 2 -> 637, 3 -> 625, 4 -> 613, 5 -> 601, 6 -> 589, 7 -> 577, 8 -> 565, 9 -> 553, 10 -> 541, 11 -> 529, 12 -> 517, 13 -> 505
    //   492: aload_0
    //   493: aload #10
    //   495: aload_2
    //   496: aload #4
    //   498: invokevirtual createView : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   501: astore_1
    //   502: goto -> 676
    //   505: aload_0
    //   506: aload #10
    //   508: aload #4
    //   510: invokevirtual createToggleButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/b0;
    //   513: astore_1
    //   514: goto -> 670
    //   517: aload_0
    //   518: aload #10
    //   520: aload #4
    //   522: invokevirtual createSeekBar : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/u;
    //   525: astore_1
    //   526: goto -> 670
    //   529: aload_0
    //   530: aload #10
    //   532: aload #4
    //   534: invokevirtual createRatingBar : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/t;
    //   537: astore_1
    //   538: goto -> 670
    //   541: aload_0
    //   542: aload #10
    //   544: aload #4
    //   546: invokevirtual createMultiAutoCompleteTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/p;
    //   549: astore_1
    //   550: goto -> 670
    //   553: aload_0
    //   554: aload #10
    //   556: aload #4
    //   558: invokevirtual createAutoCompleteTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/d;
    //   561: astore_1
    //   562: goto -> 670
    //   565: aload_0
    //   566: aload #10
    //   568: aload #4
    //   570: invokevirtual createCheckedTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/h;
    //   573: astore_1
    //   574: goto -> 670
    //   577: aload_0
    //   578: aload #10
    //   580: aload #4
    //   582: invokevirtual createRadioButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/s;
    //   585: astore_1
    //   586: goto -> 670
    //   589: aload_0
    //   590: aload #10
    //   592: aload #4
    //   594: invokevirtual createCheckBox : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/g;
    //   597: astore_1
    //   598: goto -> 670
    //   601: aload_0
    //   602: aload #10
    //   604: aload #4
    //   606: invokevirtual createImageButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/m;
    //   609: astore_1
    //   610: goto -> 670
    //   613: aload_0
    //   614: aload #10
    //   616: aload #4
    //   618: invokevirtual createSpinner : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/w;
    //   621: astore_1
    //   622: goto -> 670
    //   625: aload_0
    //   626: aload #10
    //   628: aload #4
    //   630: invokevirtual createEditText : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/k;
    //   633: astore_1
    //   634: goto -> 670
    //   637: aload_0
    //   638: aload #10
    //   640: aload #4
    //   642: invokevirtual createButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/f;
    //   645: astore_1
    //   646: goto -> 670
    //   649: aload_0
    //   650: aload #10
    //   652: aload #4
    //   654: invokevirtual createImageView : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/o;
    //   657: astore_1
    //   658: goto -> 670
    //   661: aload_0
    //   662: aload #10
    //   664: aload #4
    //   666: invokevirtual createTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/z;
    //   669: astore_1
    //   670: aload_0
    //   671: aload_1
    //   672: aload_2
    //   673: invokespecial verifyNotNull : (Landroid/view/View;Ljava/lang/String;)V
    //   676: aload_1
    //   677: astore #11
    //   679: aload_1
    //   680: ifnonnull -> 703
    //   683: aload_1
    //   684: astore #11
    //   686: aload_3
    //   687: aload #10
    //   689: if_acmpeq -> 703
    //   692: aload_0
    //   693: aload #10
    //   695: aload_2
    //   696: aload #4
    //   698: invokespecial createViewFromTag : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   701: astore #11
    //   703: aload #11
    //   705: ifnull -> 716
    //   708: aload_0
    //   709: aload #11
    //   711: aload #4
    //   713: invokespecial checkOnClickListener : (Landroid/view/View;Landroid/util/AttributeSet;)V
    //   716: aload #11
    //   718: areturn
  }
  
  private static class a implements View.OnClickListener {
    private final View c;
    
    private final String d;
    
    private Method e;
    
    private Context f;
    
    public a(View param1View, String param1String) {
      this.c = param1View;
      this.d = param1String;
    }
    
    private void a(Context param1Context) {
      while (true) {
        String str;
        if (param1Context != null) {
          try {
            if (!param1Context.isRestricted()) {
              Method method = param1Context.getClass().getMethod(this.d, new Class[] { View.class });
              if (method != null) {
                this.e = method;
                this.f = param1Context;
                return;
              } 
            } 
          } catch (NoSuchMethodException noSuchMethodException) {}
          if (param1Context instanceof ContextWrapper) {
            param1Context = ((ContextWrapper)param1Context).getBaseContext();
            continue;
          } 
          param1Context = null;
          continue;
        } 
        int i = this.c.getId();
        if (i == -1) {
          str = "";
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(" with id '");
          stringBuilder1.append(this.c.getContext().getResources().getResourceEntryName(i));
          stringBuilder1.append("'");
          str = stringBuilder1.toString();
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find method ");
        stringBuilder.append(this.d);
        stringBuilder.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
        stringBuilder.append(this.c.getClass());
        stringBuilder.append(str);
        IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
        throw illegalStateException;
      } 
    }
    
    public void onClick(View param1View) {
      if (this.e == null)
        a(this.c.getContext()); 
      try {
        this.e.invoke(this.f, new Object[] { param1View });
        return;
      } catch (IllegalAccessException illegalAccessException) {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */