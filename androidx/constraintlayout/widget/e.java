package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {
  private static final int[] d = new int[] { 0, 4, 8 };
  
  private static SparseIntArray e = new SparseIntArray();
  
  private HashMap<String, b> a = new HashMap<String, b>();
  
  private boolean b = true;
  
  private HashMap<Integer, a> c = new HashMap<Integer, a>();
  
  static {
    e.append(k.Constraint_layout_constraintLeft_toLeftOf, 25);
    e.append(k.Constraint_layout_constraintLeft_toRightOf, 26);
    e.append(k.Constraint_layout_constraintRight_toLeftOf, 29);
    e.append(k.Constraint_layout_constraintRight_toRightOf, 30);
    e.append(k.Constraint_layout_constraintTop_toTopOf, 36);
    e.append(k.Constraint_layout_constraintTop_toBottomOf, 35);
    e.append(k.Constraint_layout_constraintBottom_toTopOf, 4);
    e.append(k.Constraint_layout_constraintBottom_toBottomOf, 3);
    e.append(k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
    e.append(k.Constraint_layout_editor_absoluteX, 6);
    e.append(k.Constraint_layout_editor_absoluteY, 7);
    e.append(k.Constraint_layout_constraintGuide_begin, 17);
    e.append(k.Constraint_layout_constraintGuide_end, 18);
    e.append(k.Constraint_layout_constraintGuide_percent, 19);
    e.append(k.Constraint_android_orientation, 27);
    e.append(k.Constraint_layout_constraintStart_toEndOf, 32);
    e.append(k.Constraint_layout_constraintStart_toStartOf, 33);
    e.append(k.Constraint_layout_constraintEnd_toStartOf, 10);
    e.append(k.Constraint_layout_constraintEnd_toEndOf, 9);
    e.append(k.Constraint_layout_goneMarginLeft, 13);
    e.append(k.Constraint_layout_goneMarginTop, 16);
    e.append(k.Constraint_layout_goneMarginRight, 14);
    e.append(k.Constraint_layout_goneMarginBottom, 11);
    e.append(k.Constraint_layout_goneMarginStart, 15);
    e.append(k.Constraint_layout_goneMarginEnd, 12);
    e.append(k.Constraint_layout_constraintVertical_weight, 40);
    e.append(k.Constraint_layout_constraintHorizontal_weight, 39);
    e.append(k.Constraint_layout_constraintHorizontal_chainStyle, 41);
    e.append(k.Constraint_layout_constraintVertical_chainStyle, 42);
    e.append(k.Constraint_layout_constraintHorizontal_bias, 20);
    e.append(k.Constraint_layout_constraintVertical_bias, 37);
    e.append(k.Constraint_layout_constraintDimensionRatio, 5);
    e.append(k.Constraint_layout_constraintLeft_creator, 82);
    e.append(k.Constraint_layout_constraintTop_creator, 82);
    e.append(k.Constraint_layout_constraintRight_creator, 82);
    e.append(k.Constraint_layout_constraintBottom_creator, 82);
    e.append(k.Constraint_layout_constraintBaseline_creator, 82);
    e.append(k.Constraint_android_layout_marginLeft, 24);
    e.append(k.Constraint_android_layout_marginRight, 28);
    e.append(k.Constraint_android_layout_marginStart, 31);
    e.append(k.Constraint_android_layout_marginEnd, 8);
    e.append(k.Constraint_android_layout_marginTop, 34);
    e.append(k.Constraint_android_layout_marginBottom, 2);
    e.append(k.Constraint_android_layout_width, 23);
    e.append(k.Constraint_android_layout_height, 21);
    e.append(k.Constraint_android_visibility, 22);
    e.append(k.Constraint_android_alpha, 43);
    e.append(k.Constraint_android_elevation, 44);
    e.append(k.Constraint_android_rotationX, 45);
    e.append(k.Constraint_android_rotationY, 46);
    e.append(k.Constraint_android_rotation, 60);
    e.append(k.Constraint_android_scaleX, 47);
    e.append(k.Constraint_android_scaleY, 48);
    e.append(k.Constraint_android_transformPivotX, 49);
    e.append(k.Constraint_android_transformPivotY, 50);
    e.append(k.Constraint_android_translationX, 51);
    e.append(k.Constraint_android_translationY, 52);
    e.append(k.Constraint_android_translationZ, 53);
    e.append(k.Constraint_layout_constraintWidth_default, 54);
    e.append(k.Constraint_layout_constraintHeight_default, 55);
    e.append(k.Constraint_layout_constraintWidth_max, 56);
    e.append(k.Constraint_layout_constraintHeight_max, 57);
    e.append(k.Constraint_layout_constraintWidth_min, 58);
    e.append(k.Constraint_layout_constraintHeight_min, 59);
    e.append(k.Constraint_layout_constraintCircle, 61);
    e.append(k.Constraint_layout_constraintCircleRadius, 62);
    e.append(k.Constraint_layout_constraintCircleAngle, 63);
    e.append(k.Constraint_animate_relativeTo, 64);
    e.append(k.Constraint_transitionEasing, 65);
    e.append(k.Constraint_drawPath, 66);
    e.append(k.Constraint_transitionPathRotate, 67);
    e.append(k.Constraint_motionStagger, 79);
    e.append(k.Constraint_android_id, 38);
    e.append(k.Constraint_motionProgress, 68);
    e.append(k.Constraint_layout_constraintWidth_percent, 69);
    e.append(k.Constraint_layout_constraintHeight_percent, 70);
    e.append(k.Constraint_chainUseRtl, 71);
    e.append(k.Constraint_barrierDirection, 72);
    e.append(k.Constraint_barrierMargin, 73);
    e.append(k.Constraint_constraint_referenced_ids, 74);
    e.append(k.Constraint_barrierAllowsGoneWidgets, 75);
    e.append(k.Constraint_pathMotionArc, 76);
    e.append(k.Constraint_layout_constraintTag, 77);
    e.append(k.Constraint_visibilityMode, 78);
    e.append(k.Constraint_layout_constrainedWidth, 80);
    e.append(k.Constraint_layout_constrainedHeight, 81);
  }
  
  private a a(Context paramContext, AttributeSet paramAttributeSet) {
    a a = new a();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.Constraint);
    a(paramContext, a, typedArray);
    typedArray.recycle();
    return a;
  }
  
  private void a(Context paramContext, a parama, TypedArray paramTypedArray) {
    int j = paramTypedArray.getIndexCount();
    int i;
    for (i = 0; i < j; i++) {
      StringBuilder stringBuilder;
      b b6;
      c c4;
      d d4;
      c c3;
      b b5;
      d d3;
      c c2;
      String str1;
      c c1;
      b b4;
      e e2;
      b b3;
      e e1;
      d d2;
      b b2;
      d d1;
      b b1;
      String str2;
      c c5;
      int k = paramTypedArray.getIndex(i);
      if (k != k.Constraint_android_id && k.Constraint_android_layout_marginStart != k && k.Constraint_android_layout_marginEnd != k) {
        parama.c.a = true;
        parama.d.b = true;
        parama.b.a = true;
        parama.e.a = true;
      } 
      switch (e.get(k)) {
        default:
          stringBuilder = new StringBuilder();
          str2 = "Unknown attribute 0x";
          stringBuilder.append(str2);
          stringBuilder.append(Integer.toHexString(k));
          stringBuilder.append("   ");
          stringBuilder.append(e.get(k));
          Log.w("ConstraintSet", stringBuilder.toString());
          break;
        case 82:
          stringBuilder = new StringBuilder();
          str2 = "unused attribute 0x";
          stringBuilder.append(str2);
          stringBuilder.append(Integer.toHexString(k));
          stringBuilder.append("   ");
          stringBuilder.append(e.get(k));
          Log.w("ConstraintSet", stringBuilder.toString());
          break;
        case 81:
          b6 = parama.d;
          b6.i0 = paramTypedArray.getBoolean(k, b6.i0);
          break;
        case 80:
          b6 = parama.d;
          b6.h0 = paramTypedArray.getBoolean(k, b6.h0);
          break;
        case 79:
          c4 = parama.c;
          c4.f = paramTypedArray.getFloat(k, c4.f);
          break;
        case 78:
          d4 = parama.b;
          d4.c = paramTypedArray.getInt(k, d4.c);
          break;
        case 77:
          parama.d.g0 = paramTypedArray.getString(k);
          break;
        case 76:
          c3 = parama.c;
          c3.d = paramTypedArray.getInt(k, c3.d);
          break;
        case 75:
          b5 = parama.d;
          b5.j0 = paramTypedArray.getBoolean(k, b5.j0);
          break;
        case 74:
          parama.d.f0 = paramTypedArray.getString(k);
          break;
        case 73:
          b5 = parama.d;
          b5.c0 = paramTypedArray.getDimensionPixelSize(k, b5.c0);
          break;
        case 72:
          b5 = parama.d;
          b5.b0 = paramTypedArray.getInt(k, b5.b0);
          break;
        case 71:
          Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
          break;
        case 70:
          parama.d.a0 = paramTypedArray.getFloat(k, 1.0F);
          break;
        case 69:
          parama.d.Z = paramTypedArray.getFloat(k, 1.0F);
          break;
        case 68:
          d3 = parama.b;
          d3.e = paramTypedArray.getFloat(k, d3.e);
          break;
        case 67:
          c2 = parama.c;
          c2.g = paramTypedArray.getFloat(k, c2.g);
          break;
        case 66:
          parama.c.e = paramTypedArray.getInt(k, 0);
          break;
        case 65:
          if ((paramTypedArray.peekValue(k)).type == 3) {
            c5 = parama.c;
            str1 = paramTypedArray.getString(k);
          } else {
            c5 = parama.c;
            str1 = b.e.a.a.a.b[paramTypedArray.getInteger(k, 0)];
          } 
          c5.c = str1;
          break;
        case 64:
          c1 = parama.c;
          c1.b = b(paramTypedArray, k, c1.b);
          break;
        case 63:
          b4 = parama.d;
          b4.z = paramTypedArray.getFloat(k, b4.z);
          break;
        case 62:
          b4 = parama.d;
          b4.y = paramTypedArray.getDimensionPixelSize(k, b4.y);
          break;
        case 61:
          b4 = parama.d;
          b4.x = b(paramTypedArray, k, b4.x);
          break;
        case 60:
          e2 = parama.e;
          e2.b = paramTypedArray.getFloat(k, e2.b);
          break;
        case 59:
          b3 = parama.d;
          b3.Y = paramTypedArray.getDimensionPixelSize(k, b3.Y);
          break;
        case 58:
          b3 = parama.d;
          b3.X = paramTypedArray.getDimensionPixelSize(k, b3.X);
          break;
        case 57:
          b3 = parama.d;
          b3.W = paramTypedArray.getDimensionPixelSize(k, b3.W);
          break;
        case 56:
          b3 = parama.d;
          b3.V = paramTypedArray.getDimensionPixelSize(k, b3.V);
          break;
        case 55:
          b3 = parama.d;
          b3.U = paramTypedArray.getInt(k, b3.U);
          break;
        case 54:
          b3 = parama.d;
          b3.T = paramTypedArray.getInt(k, b3.T);
          break;
        case 53:
          if (Build.VERSION.SDK_INT >= 21) {
            e e3 = parama.e;
            e3.k = paramTypedArray.getDimension(k, e3.k);
          } 
          break;
        case 52:
          e1 = parama.e;
          e1.j = paramTypedArray.getDimension(k, e1.j);
          break;
        case 51:
          e1 = parama.e;
          e1.i = paramTypedArray.getDimension(k, e1.i);
          break;
        case 50:
          e1 = parama.e;
          e1.h = paramTypedArray.getDimension(k, e1.h);
          break;
        case 49:
          e1 = parama.e;
          e1.g = paramTypedArray.getDimension(k, e1.g);
          break;
        case 48:
          e1 = parama.e;
          e1.f = paramTypedArray.getFloat(k, e1.f);
          break;
        case 47:
          e1 = parama.e;
          e1.e = paramTypedArray.getFloat(k, e1.e);
          break;
        case 46:
          e1 = parama.e;
          e1.d = paramTypedArray.getFloat(k, e1.d);
          break;
        case 45:
          e1 = parama.e;
          e1.c = paramTypedArray.getFloat(k, e1.c);
          break;
        case 44:
          if (Build.VERSION.SDK_INT >= 21) {
            e1 = parama.e;
            e1.l = true;
            e1.m = paramTypedArray.getDimension(k, e1.m);
          } 
          break;
        case 43:
          d2 = parama.b;
          d2.d = paramTypedArray.getFloat(k, d2.d);
          break;
        case 42:
          b2 = parama.d;
          b2.S = paramTypedArray.getInt(k, b2.S);
          break;
        case 41:
          b2 = parama.d;
          b2.R = paramTypedArray.getInt(k, b2.R);
          break;
        case 40:
          b2 = parama.d;
          b2.P = paramTypedArray.getFloat(k, b2.P);
          break;
        case 39:
          b2 = parama.d;
          b2.Q = paramTypedArray.getFloat(k, b2.Q);
          break;
        case 38:
          parama.a = paramTypedArray.getResourceId(k, parama.a);
          break;
        case 37:
          b2 = parama.d;
          b2.v = paramTypedArray.getFloat(k, b2.v);
          break;
        case 36:
          b2 = parama.d;
          b2.l = b(paramTypedArray, k, b2.l);
          break;
        case 35:
          b2 = parama.d;
          b2.m = b(paramTypedArray, k, b2.m);
          break;
        case 34:
          b2 = parama.d;
          b2.F = paramTypedArray.getDimensionPixelSize(k, b2.F);
          break;
        case 33:
          b2 = parama.d;
          b2.r = b(paramTypedArray, k, b2.r);
          break;
        case 32:
          b2 = parama.d;
          b2.q = b(paramTypedArray, k, b2.q);
          break;
        case 31:
          if (Build.VERSION.SDK_INT >= 17) {
            b2 = parama.d;
            b2.I = paramTypedArray.getDimensionPixelSize(k, b2.I);
          } 
          break;
        case 30:
          b2 = parama.d;
          b2.k = b(paramTypedArray, k, b2.k);
          break;
        case 29:
          b2 = parama.d;
          b2.j = b(paramTypedArray, k, b2.j);
          break;
        case 28:
          b2 = parama.d;
          b2.E = paramTypedArray.getDimensionPixelSize(k, b2.E);
          break;
        case 27:
          b2 = parama.d;
          b2.C = paramTypedArray.getInt(k, b2.C);
          break;
        case 26:
          b2 = parama.d;
          b2.i = b(paramTypedArray, k, b2.i);
          break;
        case 25:
          b2 = parama.d;
          b2.h = b(paramTypedArray, k, b2.h);
          break;
        case 24:
          b2 = parama.d;
          b2.D = paramTypedArray.getDimensionPixelSize(k, b2.D);
          break;
        case 23:
          b2 = parama.d;
          b2.c = paramTypedArray.getLayoutDimension(k, b2.c);
          break;
        case 22:
          d1 = parama.b;
          d1.b = paramTypedArray.getInt(k, d1.b);
          d1 = parama.b;
          d1.b = d[d1.b];
          break;
        case 21:
          b1 = parama.d;
          b1.d = paramTypedArray.getLayoutDimension(k, b1.d);
          break;
        case 20:
          b1 = parama.d;
          b1.u = paramTypedArray.getFloat(k, b1.u);
          break;
        case 19:
          b1 = parama.d;
          b1.g = paramTypedArray.getFloat(k, b1.g);
          break;
        case 18:
          b1 = parama.d;
          b1.f = paramTypedArray.getDimensionPixelOffset(k, b1.f);
          break;
        case 17:
          b1 = parama.d;
          b1.e = paramTypedArray.getDimensionPixelOffset(k, b1.e);
          break;
        case 16:
          b1 = parama.d;
          b1.K = paramTypedArray.getDimensionPixelSize(k, b1.K);
          break;
        case 15:
          b1 = parama.d;
          b1.O = paramTypedArray.getDimensionPixelSize(k, b1.O);
          break;
        case 14:
          b1 = parama.d;
          b1.L = paramTypedArray.getDimensionPixelSize(k, b1.L);
          break;
        case 13:
          b1 = parama.d;
          b1.J = paramTypedArray.getDimensionPixelSize(k, b1.J);
          break;
        case 12:
          b1 = parama.d;
          b1.N = paramTypedArray.getDimensionPixelSize(k, b1.N);
          break;
        case 11:
          b1 = parama.d;
          b1.M = paramTypedArray.getDimensionPixelSize(k, b1.M);
          break;
        case 10:
          b1 = parama.d;
          b1.s = b(paramTypedArray, k, b1.s);
          break;
        case 9:
          b1 = parama.d;
          b1.t = b(paramTypedArray, k, b1.t);
          break;
        case 8:
          if (Build.VERSION.SDK_INT >= 17) {
            b1 = parama.d;
            b1.H = paramTypedArray.getDimensionPixelSize(k, b1.H);
          } 
          break;
        case 7:
          b1 = parama.d;
          b1.B = paramTypedArray.getDimensionPixelOffset(k, b1.B);
          break;
        case 6:
          b1 = parama.d;
          b1.A = paramTypedArray.getDimensionPixelOffset(k, b1.A);
          break;
        case 5:
          parama.d.w = paramTypedArray.getString(k);
          break;
        case 4:
          b1 = parama.d;
          b1.n = b(paramTypedArray, k, b1.n);
          break;
        case 3:
          b1 = parama.d;
          b1.o = b(paramTypedArray, k, b1.o);
          break;
        case 2:
          b1 = parama.d;
          b1.G = paramTypedArray.getDimensionPixelSize(k, b1.G);
          break;
        case 1:
          b1 = parama.d;
          b1.p = b(paramTypedArray, k, b1.p);
          break;
      } 
    } 
  }
  
  private int[] a(View paramView, String paramString) {
    String[] arrayOfString = paramString.split(",");
    Context context = paramView.getContext();
    int[] arrayOfInt = new int[arrayOfString.length];
    int j = 0;
    int i = 0;
    while (true) {
      if (j < arrayOfString.length) {
        String str = arrayOfString[j].trim();
        try {
          m = j.class.getField(str).getInt(null);
        } catch (Exception exception) {
          m = 0;
        } 
        int k = m;
        if (!m)
          k = context.getResources().getIdentifier(str, "id", context.getPackageName()); 
        int m = k;
        if (k == 0) {
          m = k;
          if (paramView.isInEditMode()) {
            m = k;
            if (paramView.getParent() instanceof ConstraintLayout) {
              Object object = ((ConstraintLayout)paramView.getParent()).a(0, str);
              m = k;
              if (object != null) {
                m = k;
                if (object instanceof Integer)
                  m = ((Integer)object).intValue(); 
              } 
            } 
          } 
        } 
        arrayOfInt[i] = m;
        j++;
        i++;
        continue;
      } 
      int[] arrayOfInt1 = arrayOfInt;
      if (i != arrayOfString.length)
        arrayOfInt1 = Arrays.copyOf(arrayOfInt, i); 
      return arrayOfInt1;
    } 
  }
  
  private static int b(TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    int i = paramTypedArray.getResourceId(paramInt1, paramInt2);
    paramInt2 = i;
    if (i == -1)
      paramInt2 = paramTypedArray.getInt(paramInt1, -1); 
    return paramInt2;
  }
  
  public void a(Context paramContext, int paramInt) {
    a((ConstraintLayout)LayoutInflater.from(paramContext).inflate(paramInt, null));
  }
  
  public void a(Context paramContext, XmlPullParser paramXmlPullParser) {
    try {
      int i = paramXmlPullParser.getEventType();
      for (a a = null; i != 1; a = a1) {
        a a1;
        if (i != 0) {
          if (i != 2) {
            if (i != 3) {
              a1 = a;
            } else {
              String str = paramXmlPullParser.getName();
              if ("ConstraintSet".equals(str))
                return; 
              a1 = a;
              if (str.equalsIgnoreCase("Constraint")) {
                this.c.put(Integer.valueOf(a.a), a);
                a1 = null;
              } 
            } 
          } else {
            StringBuilder stringBuilder;
            boolean bool;
            String str = paramXmlPullParser.getName();
            switch (str.hashCode()) {
              case 1803088381:
                if (str.equals("Constraint")) {
                  i = 0;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a(paramContext, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case 1791837707:
                if (a1.equals("CustomAttribute")) {
                  i = 7;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case 1331510167:
                if (a1.equals("Barrier")) {
                  i = 2;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case -71750448:
                if (a1.equals("Guideline")) {
                  i = 1;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case -1238332596:
                if (a1.equals("Transform")) {
                  i = 4;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case -1269513683:
                if (a1.equals("PropertySet")) {
                  i = 3;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case -1984451626:
                if (a1.equals("Motion")) {
                  i = 6;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              case -2025855158:
                bool = a1.equals("Layout");
                if (bool) {
                  i = 5;
                } else {
                  break;
                } 
                switch (i) {
                  default:
                    a1 = a;
                    break;
                  case 7:
                    if (a != null) {
                      b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 6:
                    if (a != null) {
                      a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 5:
                    if (a != null) {
                      a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 4:
                    if (a != null) {
                      a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 3:
                    if (a != null) {
                      a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                      a1 = a;
                      break;
                    } 
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("XML parser error must be within a Constraint ");
                    stringBuilder.append(paramXmlPullParser.getLineNumber());
                    throw new RuntimeException(stringBuilder.toString());
                  case 2:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.d0 = 1;
                    break;
                  case 1:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    a1.d.a = true;
                    a1.d.b = true;
                    break;
                  case 0:
                    a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
            } 
            i = -1;
            switch (i) {
              default:
                a1 = a;
                break;
              case 7:
                if (a != null) {
                  b.a((Context)stringBuilder, paramXmlPullParser, a.f);
                  a1 = a;
                  break;
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("XML parser error must be within a Constraint ");
                stringBuilder.append(paramXmlPullParser.getLineNumber());
                throw new RuntimeException(stringBuilder.toString());
              case 6:
                if (a != null) {
                  a.c.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                  a1 = a;
                  break;
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("XML parser error must be within a Constraint ");
                stringBuilder.append(paramXmlPullParser.getLineNumber());
                throw new RuntimeException(stringBuilder.toString());
              case 5:
                if (a != null) {
                  a.d.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                  a1 = a;
                  break;
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("XML parser error must be within a Constraint ");
                stringBuilder.append(paramXmlPullParser.getLineNumber());
                throw new RuntimeException(stringBuilder.toString());
              case 4:
                if (a != null) {
                  a.e.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                  a1 = a;
                  break;
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("XML parser error must be within a Constraint ");
                stringBuilder.append(paramXmlPullParser.getLineNumber());
                throw new RuntimeException(stringBuilder.toString());
              case 3:
                if (a != null) {
                  a.b.a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                  a1 = a;
                  break;
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("XML parser error must be within a Constraint ");
                stringBuilder.append(paramXmlPullParser.getLineNumber());
                throw new RuntimeException(stringBuilder.toString());
              case 2:
                a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                a1.d.d0 = 1;
                break;
              case 1:
                a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                a1.d.a = true;
                a1.d.b = true;
                break;
              case 0:
                a1 = a((Context)stringBuilder, Xml.asAttributeSet(paramXmlPullParser));
                break;
            } 
          } 
        } else {
          paramXmlPullParser.getName();
          a1 = a;
        } 
        i = paramXmlPullParser.next();
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
  }
  
  public void a(ConstraintLayout paramConstraintLayout) {
    int j = paramConstraintLayout.getChildCount();
    this.c.clear();
    int i = 0;
    while (i < j) {
      View view = paramConstraintLayout.getChildAt(i);
      ConstraintLayout.b b = (ConstraintLayout.b)view.getLayoutParams();
      int k = view.getId();
      if (!this.b || k != -1) {
        if (!this.c.containsKey(Integer.valueOf(k)))
          this.c.put(Integer.valueOf(k), new a()); 
        a a = this.c.get(Integer.valueOf(k));
        a.f = b.a(this.a, view);
        a.a(a, k, b);
        a.b.b = view.getVisibility();
        if (Build.VERSION.SDK_INT >= 17) {
          a.b.d = view.getAlpha();
          a.e.b = view.getRotation();
          a.e.c = view.getRotationX();
          a.e.d = view.getRotationY();
          a.e.e = view.getScaleX();
          a.e.f = view.getScaleY();
          float f1 = view.getPivotX();
          float f2 = view.getPivotY();
          if (f1 != 0.0D || f2 != 0.0D) {
            e e1 = a.e;
            e1.g = f1;
            e1.h = f2;
          } 
          a.e.i = view.getTranslationX();
          a.e.j = view.getTranslationY();
          if (Build.VERSION.SDK_INT >= 21) {
            a.e.k = view.getTranslationZ();
            e e1 = a.e;
            if (e1.l)
              e1.m = view.getElevation(); 
          } 
        } 
        if (view instanceof a) {
          view = view;
          a.d.j0 = view.c();
          a.d.e0 = view.getReferencedIds();
          a.d.b0 = view.getType();
          a.d.c0 = view.getMargin();
        } 
        i++;
        continue;
      } 
      throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    } 
  }
  
  void a(ConstraintLayout paramConstraintLayout, boolean paramBoolean) {
    int j = paramConstraintLayout.getChildCount();
    HashSet hashSet = new HashSet(this.c.keySet());
    int i;
    for (i = 0; i < j; i++) {
      View view = paramConstraintLayout.getChildAt(i);
      int k = view.getId();
      if (!this.c.containsKey(Integer.valueOf(k))) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id unknown ");
        stringBuilder.append(b.e.a.b.a.a(view));
        Log.w("ConstraintSet", stringBuilder.toString());
      } else if (!this.b || k != -1) {
        if (k != -1)
          if (this.c.containsKey(Integer.valueOf(k))) {
            hashSet.remove(Integer.valueOf(k));
            a a = this.c.get(Integer.valueOf(k));
            if (view instanceof a)
              a.d.d0 = 1; 
            int m = a.d.d0;
            if (m != -1 && m == 1) {
              a a1 = (a)view;
              a1.setId(k);
              a1.setType(a.d.b0);
              a1.setMargin(a.d.c0);
              a1.setAllowsGoneWidget(a.d.j0);
              b b1 = a.d;
              int[] arrayOfInt = b1.e0;
              if (arrayOfInt != null) {
                a1.setReferencedIds(arrayOfInt);
              } else {
                String str = b1.f0;
                if (str != null) {
                  b1.e0 = a(a1, str);
                  a1.setReferencedIds(a.d.e0);
                } 
              } 
            } 
            ConstraintLayout.b b = (ConstraintLayout.b)view.getLayoutParams();
            b.a();
            a.a(b);
            if (paramBoolean)
              b.a(view, a.f); 
            view.setLayoutParams((ViewGroup.LayoutParams)b);
            d d = a.b;
            if (d.c == 0)
              view.setVisibility(d.b); 
            if (Build.VERSION.SDK_INT >= 17) {
              view.setAlpha(a.b.d);
              view.setRotation(a.e.b);
              view.setRotationX(a.e.c);
              view.setRotationY(a.e.d);
              view.setScaleX(a.e.e);
              view.setScaleY(a.e.f);
              if (!Float.isNaN(a.e.g))
                view.setPivotX(a.e.g); 
              if (!Float.isNaN(a.e.h))
                view.setPivotY(a.e.h); 
              view.setTranslationX(a.e.i);
              view.setTranslationY(a.e.j);
              if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a.e.k);
                e e1 = a.e;
                if (e1.l)
                  view.setElevation(e1.m); 
              } 
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WARNING NO CONSTRAINTS for view ");
            stringBuilder.append(k);
            Log.v("ConstraintSet", stringBuilder.toString());
          }  
      } else {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      } 
    } 
    for (Integer integer : hashSet) {
      a a = this.c.get(integer);
      i = a.d.d0;
      if (i != -1 && i == 1) {
        a a1 = new a(paramConstraintLayout.getContext());
        a1.setId(integer.intValue());
        b b1 = a.d;
        int[] arrayOfInt = b1.e0;
        if (arrayOfInt != null) {
          a1.setReferencedIds(arrayOfInt);
        } else {
          String str = b1.f0;
          if (str != null) {
            b1.e0 = a(a1, str);
            a1.setReferencedIds(a.d.e0);
          } 
        } 
        a1.setType(a.d.b0);
        a1.setMargin(a.d.c0);
        ConstraintLayout.b b = paramConstraintLayout.generateDefaultLayoutParams();
        a1.b();
        a.a(b);
        paramConstraintLayout.addView(a1, (ViewGroup.LayoutParams)b);
      } 
      if (a.d.a) {
        h h = new h(paramConstraintLayout.getContext());
        h.setId(integer.intValue());
        ConstraintLayout.b b = paramConstraintLayout.generateDefaultLayoutParams();
        a.a(b);
        paramConstraintLayout.addView(h, (ViewGroup.LayoutParams)b);
      } 
    } 
  }
  
  public void a(f paramf) {
    int j = paramf.getChildCount();
    this.c.clear();
    int i = 0;
    while (i < j) {
      View view = paramf.getChildAt(i);
      f.a a = (f.a)view.getLayoutParams();
      int k = view.getId();
      if (!this.b || k != -1) {
        if (!this.c.containsKey(Integer.valueOf(k)))
          this.c.put(Integer.valueOf(k), new a()); 
        a a1 = this.c.get(Integer.valueOf(k));
        if (view instanceof c)
          a.a(a1, (c)view, k, a); 
        a.a(a1, k, a);
        i++;
        continue;
      } 
      throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    } 
  }
  
  public void b(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    try {
      paramInt = xmlResourceParser.getEventType();
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
      return;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
    while (true) {
      if (paramInt != 1) {
        if (paramInt != 0) {
          if (paramInt == 2) {
            String str = xmlResourceParser.getName();
            a a = a((Context)iOException, Xml.asAttributeSet((XmlPullParser)xmlResourceParser));
            if (str.equalsIgnoreCase("Guideline"))
              a.d.a = true; 
            this.c.put(Integer.valueOf(a.a), a);
          } 
        } else {
          xmlResourceParser.getName();
        } 
        paramInt = xmlResourceParser.next();
        continue;
      } 
      return;
    } 
  }
  
  public static class a {
    int a;
    
    public final e.d b = new e.d();
    
    public final e.c c = new e.c();
    
    public final e.b d = new e.b();
    
    public final e.e e = new e.e();
    
    public HashMap<String, b> f = new HashMap<String, b>();
    
    private void a(int param1Int, ConstraintLayout.b param1b) {
      this.a = param1Int;
      e.b b1 = this.d;
      b1.h = param1b.d;
      b1.i = param1b.e;
      b1.j = param1b.f;
      b1.k = param1b.g;
      b1.l = param1b.h;
      b1.m = param1b.i;
      b1.n = param1b.j;
      b1.o = param1b.k;
      b1.p = param1b.l;
      b1.q = param1b.p;
      b1.r = param1b.q;
      b1.s = param1b.r;
      b1.t = param1b.s;
      b1.u = param1b.z;
      b1.v = param1b.A;
      b1.w = param1b.B;
      b1.x = param1b.m;
      b1.y = param1b.n;
      b1.z = param1b.o;
      b1.A = param1b.P;
      b1.B = param1b.Q;
      b1.C = param1b.R;
      b1.g = param1b.c;
      b1.e = param1b.a;
      b1.f = param1b.b;
      b1.c = param1b.width;
      this.d.d = param1b.height;
      b1 = this.d;
      b1.D = param1b.leftMargin;
      b1.E = param1b.rightMargin;
      b1.F = param1b.topMargin;
      b1.G = param1b.bottomMargin;
      b1.P = param1b.E;
      b1.Q = param1b.D;
      b1.S = param1b.G;
      b1.R = param1b.F;
      b1.h0 = param1b.S;
      b1.i0 = param1b.T;
      b1.T = param1b.H;
      b1.U = param1b.I;
      b1.V = param1b.L;
      b1.W = param1b.M;
      b1.X = param1b.J;
      b1.Y = param1b.K;
      b1.Z = param1b.N;
      b1.a0 = param1b.O;
      b1.g0 = param1b.U;
      b1.K = param1b.u;
      b1.M = param1b.w;
      b1.J = param1b.t;
      b1.L = param1b.v;
      b1.O = param1b.x;
      b1.N = param1b.y;
      if (Build.VERSION.SDK_INT >= 17) {
        b1.H = param1b.getMarginEnd();
        this.d.I = param1b.getMarginStart();
      } 
    }
    
    private void a(int param1Int, f.a param1a) {
      a(param1Int, param1a);
      this.b.d = param1a.o0;
      e.e e1 = this.e;
      e1.b = param1a.r0;
      e1.c = param1a.s0;
      e1.d = param1a.t0;
      e1.e = param1a.u0;
      e1.f = param1a.v0;
      e1.g = param1a.w0;
      e1.h = param1a.x0;
      e1.i = param1a.y0;
      e1.j = param1a.z0;
      e1.k = param1a.A0;
      e1.m = param1a.q0;
      e1.l = param1a.p0;
    }
    
    private void a(c param1c, int param1Int, f.a param1a) {
      a(param1Int, param1a);
      if (param1c instanceof a) {
        e.b b1 = this.d;
        b1.d0 = 1;
        param1c = param1c;
        b1.b0 = param1c.getType();
        this.d.e0 = param1c.getReferencedIds();
        this.d.c0 = param1c.getMargin();
      } 
    }
    
    public void a(ConstraintLayout.b param1b) {
      e.b b1 = this.d;
      param1b.d = b1.h;
      param1b.e = b1.i;
      param1b.f = b1.j;
      param1b.g = b1.k;
      param1b.h = b1.l;
      param1b.i = b1.m;
      param1b.j = b1.n;
      param1b.k = b1.o;
      param1b.l = b1.p;
      param1b.p = b1.q;
      param1b.q = b1.r;
      param1b.r = b1.s;
      param1b.s = b1.t;
      param1b.leftMargin = b1.D;
      param1b.rightMargin = b1.E;
      param1b.topMargin = b1.F;
      param1b.bottomMargin = b1.G;
      param1b.x = b1.O;
      param1b.y = b1.N;
      param1b.u = b1.K;
      param1b.w = b1.M;
      param1b.z = b1.u;
      param1b.A = b1.v;
      param1b.m = b1.x;
      param1b.n = b1.y;
      param1b.o = b1.z;
      param1b.B = b1.w;
      param1b.P = b1.A;
      param1b.Q = b1.B;
      param1b.E = b1.P;
      param1b.D = b1.Q;
      param1b.G = b1.S;
      param1b.F = b1.R;
      param1b.S = b1.h0;
      param1b.T = b1.i0;
      param1b.H = b1.T;
      param1b.I = b1.U;
      param1b.L = b1.V;
      param1b.M = b1.W;
      param1b.J = b1.X;
      param1b.K = b1.Y;
      param1b.N = b1.Z;
      param1b.O = b1.a0;
      param1b.R = b1.C;
      param1b.c = b1.g;
      param1b.a = b1.e;
      param1b.b = b1.f;
      param1b.width = b1.c;
      param1b.height = b1.d;
      String str = b1.g0;
      if (str != null)
        param1b.U = str; 
      if (Build.VERSION.SDK_INT >= 17) {
        param1b.setMarginStart(this.d.I);
        param1b.setMarginEnd(this.d.H);
      } 
      param1b.a();
    }
    
    public a clone() {
      a a1 = new a();
      a1.d.a(this.d);
      a1.c.a(this.c);
      a1.b.a(this.b);
      a1.e.a(this.e);
      a1.a = this.a;
      return a1;
    }
  }
  
  public static class b {
    private static SparseIntArray k0 = new SparseIntArray();
    
    public int A = -1;
    
    public int B = -1;
    
    public int C = -1;
    
    public int D = -1;
    
    public int E = -1;
    
    public int F = -1;
    
    public int G = -1;
    
    public int H = -1;
    
    public int I = -1;
    
    public int J = -1;
    
    public int K = -1;
    
    public int L = -1;
    
    public int M = -1;
    
    public int N = -1;
    
    public int O = -1;
    
    public float P = -1.0F;
    
    public float Q = -1.0F;
    
    public int R = 0;
    
    public int S = 0;
    
    public int T = 0;
    
    public int U = 0;
    
    public int V = -1;
    
    public int W = -1;
    
    public int X = -1;
    
    public int Y = -1;
    
    public float Z = 1.0F;
    
    public boolean a = false;
    
    public float a0 = 1.0F;
    
    public boolean b = false;
    
    public int b0 = -1;
    
    public int c;
    
    public int c0 = 0;
    
    public int d;
    
    public int d0 = -1;
    
    public int e = -1;
    
    public int[] e0;
    
    public int f = -1;
    
    public String f0;
    
    public float g = -1.0F;
    
    public String g0;
    
    public int h = -1;
    
    public boolean h0 = false;
    
    public int i = -1;
    
    public boolean i0 = false;
    
    public int j = -1;
    
    public boolean j0 = true;
    
    public int k = -1;
    
    public int l = -1;
    
    public int m = -1;
    
    public int n = -1;
    
    public int o = -1;
    
    public int p = -1;
    
    public int q = -1;
    
    public int r = -1;
    
    public int s = -1;
    
    public int t = -1;
    
    public float u = 0.5F;
    
    public float v = 0.5F;
    
    public String w = null;
    
    public int x = -1;
    
    public int y = 0;
    
    public float z = 0.0F;
    
    static {
      k0.append(k.Layout_layout_constraintLeft_toLeftOf, 24);
      k0.append(k.Layout_layout_constraintLeft_toRightOf, 25);
      k0.append(k.Layout_layout_constraintRight_toLeftOf, 28);
      k0.append(k.Layout_layout_constraintRight_toRightOf, 29);
      k0.append(k.Layout_layout_constraintTop_toTopOf, 35);
      k0.append(k.Layout_layout_constraintTop_toBottomOf, 34);
      k0.append(k.Layout_layout_constraintBottom_toTopOf, 4);
      k0.append(k.Layout_layout_constraintBottom_toBottomOf, 3);
      k0.append(k.Layout_layout_constraintBaseline_toBaselineOf, 1);
      k0.append(k.Layout_layout_editor_absoluteX, 6);
      k0.append(k.Layout_layout_editor_absoluteY, 7);
      k0.append(k.Layout_layout_constraintGuide_begin, 17);
      k0.append(k.Layout_layout_constraintGuide_end, 18);
      k0.append(k.Layout_layout_constraintGuide_percent, 19);
      k0.append(k.Layout_android_orientation, 26);
      k0.append(k.Layout_layout_constraintStart_toEndOf, 31);
      k0.append(k.Layout_layout_constraintStart_toStartOf, 32);
      k0.append(k.Layout_layout_constraintEnd_toStartOf, 10);
      k0.append(k.Layout_layout_constraintEnd_toEndOf, 9);
      k0.append(k.Layout_layout_goneMarginLeft, 13);
      k0.append(k.Layout_layout_goneMarginTop, 16);
      k0.append(k.Layout_layout_goneMarginRight, 14);
      k0.append(k.Layout_layout_goneMarginBottom, 11);
      k0.append(k.Layout_layout_goneMarginStart, 15);
      k0.append(k.Layout_layout_goneMarginEnd, 12);
      k0.append(k.Layout_layout_constraintVertical_weight, 38);
      k0.append(k.Layout_layout_constraintHorizontal_weight, 37);
      k0.append(k.Layout_layout_constraintHorizontal_chainStyle, 39);
      k0.append(k.Layout_layout_constraintVertical_chainStyle, 40);
      k0.append(k.Layout_layout_constraintHorizontal_bias, 20);
      k0.append(k.Layout_layout_constraintVertical_bias, 36);
      k0.append(k.Layout_layout_constraintDimensionRatio, 5);
      k0.append(k.Layout_layout_constraintLeft_creator, 76);
      k0.append(k.Layout_layout_constraintTop_creator, 76);
      k0.append(k.Layout_layout_constraintRight_creator, 76);
      k0.append(k.Layout_layout_constraintBottom_creator, 76);
      k0.append(k.Layout_layout_constraintBaseline_creator, 76);
      k0.append(k.Layout_android_layout_marginLeft, 23);
      k0.append(k.Layout_android_layout_marginRight, 27);
      k0.append(k.Layout_android_layout_marginStart, 30);
      k0.append(k.Layout_android_layout_marginEnd, 8);
      k0.append(k.Layout_android_layout_marginTop, 33);
      k0.append(k.Layout_android_layout_marginBottom, 2);
      k0.append(k.Layout_android_layout_width, 22);
      k0.append(k.Layout_android_layout_height, 21);
      k0.append(k.Layout_layout_constraintCircle, 61);
      k0.append(k.Layout_layout_constraintCircleRadius, 62);
      k0.append(k.Layout_layout_constraintCircleAngle, 63);
      k0.append(k.Layout_layout_constraintWidth_percent, 69);
      k0.append(k.Layout_layout_constraintHeight_percent, 70);
      k0.append(k.Layout_chainUseRtl, 71);
      k0.append(k.Layout_barrierDirection, 72);
      k0.append(k.Layout_barrierMargin, 73);
      k0.append(k.Layout_constraint_referenced_ids, 74);
      k0.append(k.Layout_barrierAllowsGoneWidgets, 75);
    }
    
    void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.Layout);
      this.b = true;
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        int m = k0.get(k);
        if (m != 80) {
          if (m != 81) {
            StringBuilder stringBuilder;
            String str;
            switch (m) {
              default:
                switch (m) {
                  default:
                    switch (m) {
                      default:
                        switch (m) {
                          default:
                            stringBuilder = new StringBuilder();
                            str = "Unknown attribute 0x";
                            stringBuilder.append(str);
                            stringBuilder.append(Integer.toHexString(k));
                            stringBuilder.append("   ");
                            stringBuilder.append(k0.get(k));
                            Log.w("ConstraintSet", stringBuilder.toString());
                            break;
                          case 77:
                            this.g0 = typedArray.getString(k);
                            break;
                          case 76:
                            stringBuilder = new StringBuilder();
                            str = "unused attribute 0x";
                            stringBuilder.append(str);
                            stringBuilder.append(Integer.toHexString(k));
                            stringBuilder.append("   ");
                            stringBuilder.append(k0.get(k));
                            Log.w("ConstraintSet", stringBuilder.toString());
                            break;
                          case 75:
                            this.j0 = typedArray.getBoolean(k, this.j0);
                            break;
                          case 74:
                            this.f0 = typedArray.getString(k);
                            break;
                          case 73:
                            this.c0 = typedArray.getDimensionPixelSize(k, this.c0);
                            break;
                          case 72:
                            this.b0 = typedArray.getInt(k, this.b0);
                            break;
                          case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                          case 70:
                            this.a0 = typedArray.getFloat(k, 1.0F);
                            break;
                          case 69:
                            break;
                        } 
                        this.Z = typedArray.getFloat(k, 1.0F);
                        break;
                      case 63:
                        this.z = typedArray.getFloat(k, this.z);
                        break;
                      case 62:
                        this.y = typedArray.getDimensionPixelSize(k, this.y);
                        break;
                      case 61:
                        break;
                    } 
                    this.x = e.a(typedArray, k, this.x);
                    break;
                  case 59:
                    this.Y = typedArray.getDimensionPixelSize(k, this.Y);
                    break;
                  case 58:
                    this.X = typedArray.getDimensionPixelSize(k, this.X);
                    break;
                  case 57:
                    this.W = typedArray.getDimensionPixelSize(k, this.W);
                    break;
                  case 56:
                    this.V = typedArray.getDimensionPixelSize(k, this.V);
                    break;
                  case 55:
                    this.U = typedArray.getInt(k, this.U);
                    break;
                  case 54:
                    break;
                } 
                this.T = typedArray.getInt(k, this.T);
                break;
              case 40:
                this.S = typedArray.getInt(k, this.S);
                break;
              case 39:
                this.R = typedArray.getInt(k, this.R);
                break;
              case 38:
                this.P = typedArray.getFloat(k, this.P);
                break;
              case 37:
                this.Q = typedArray.getFloat(k, this.Q);
                break;
              case 36:
                this.v = typedArray.getFloat(k, this.v);
                break;
              case 35:
                this.l = e.a(typedArray, k, this.l);
                break;
              case 34:
                this.m = e.a(typedArray, k, this.m);
                break;
              case 33:
                this.F = typedArray.getDimensionPixelSize(k, this.F);
                break;
              case 32:
                this.r = e.a(typedArray, k, this.r);
                break;
              case 31:
                this.q = e.a(typedArray, k, this.q);
                break;
              case 30:
                if (Build.VERSION.SDK_INT >= 17)
                  this.I = typedArray.getDimensionPixelSize(k, this.I); 
                break;
              case 29:
                this.k = e.a(typedArray, k, this.k);
                break;
              case 28:
                this.j = e.a(typedArray, k, this.j);
                break;
              case 27:
                this.E = typedArray.getDimensionPixelSize(k, this.E);
                break;
              case 26:
                this.C = typedArray.getInt(k, this.C);
                break;
              case 25:
                this.i = e.a(typedArray, k, this.i);
                break;
              case 24:
                this.h = e.a(typedArray, k, this.h);
                break;
              case 23:
                this.D = typedArray.getDimensionPixelSize(k, this.D);
                break;
              case 22:
                this.c = typedArray.getLayoutDimension(k, this.c);
                break;
              case 21:
                this.d = typedArray.getLayoutDimension(k, this.d);
                break;
              case 20:
                this.u = typedArray.getFloat(k, this.u);
                break;
              case 19:
                this.g = typedArray.getFloat(k, this.g);
                break;
              case 18:
                this.f = typedArray.getDimensionPixelOffset(k, this.f);
                break;
              case 17:
                this.e = typedArray.getDimensionPixelOffset(k, this.e);
                break;
              case 16:
                this.K = typedArray.getDimensionPixelSize(k, this.K);
                break;
              case 15:
                this.O = typedArray.getDimensionPixelSize(k, this.O);
                break;
              case 14:
                this.L = typedArray.getDimensionPixelSize(k, this.L);
                break;
              case 13:
                this.J = typedArray.getDimensionPixelSize(k, this.J);
                break;
              case 12:
                this.N = typedArray.getDimensionPixelSize(k, this.N);
                break;
              case 11:
                this.M = typedArray.getDimensionPixelSize(k, this.M);
                break;
              case 10:
                this.s = e.a(typedArray, k, this.s);
                break;
              case 9:
                this.t = e.a(typedArray, k, this.t);
                break;
              case 8:
                if (Build.VERSION.SDK_INT >= 17)
                  this.H = typedArray.getDimensionPixelSize(k, this.H); 
                break;
              case 7:
                this.B = typedArray.getDimensionPixelOffset(k, this.B);
                break;
              case 6:
                this.A = typedArray.getDimensionPixelOffset(k, this.A);
                break;
              case 5:
                this.w = typedArray.getString(k);
                break;
              case 4:
                this.n = e.a(typedArray, k, this.n);
                break;
              case 3:
                this.o = e.a(typedArray, k, this.o);
                break;
              case 2:
                this.G = typedArray.getDimensionPixelSize(k, this.G);
                break;
              case 1:
                this.p = e.a(typedArray, k, this.p);
                break;
            } 
          } else {
            this.i0 = typedArray.getBoolean(k, this.i0);
          } 
        } else {
          this.h0 = typedArray.getBoolean(k, this.h0);
        } 
      } 
      typedArray.recycle();
    }
    
    public void a(b param1b) {
      this.a = param1b.a;
      this.c = param1b.c;
      this.b = param1b.b;
      this.d = param1b.d;
      this.e = param1b.e;
      this.f = param1b.f;
      this.g = param1b.g;
      this.h = param1b.h;
      this.i = param1b.i;
      this.j = param1b.j;
      this.k = param1b.k;
      this.l = param1b.l;
      this.m = param1b.m;
      this.n = param1b.n;
      this.o = param1b.o;
      this.p = param1b.p;
      this.q = param1b.q;
      this.r = param1b.r;
      this.s = param1b.s;
      this.t = param1b.t;
      this.u = param1b.u;
      this.v = param1b.v;
      this.w = param1b.w;
      this.x = param1b.x;
      this.y = param1b.y;
      this.z = param1b.z;
      this.A = param1b.A;
      this.B = param1b.B;
      this.C = param1b.C;
      this.D = param1b.D;
      this.E = param1b.E;
      this.F = param1b.F;
      this.G = param1b.G;
      this.H = param1b.H;
      this.I = param1b.I;
      this.J = param1b.J;
      this.K = param1b.K;
      this.L = param1b.L;
      this.M = param1b.M;
      this.N = param1b.N;
      this.O = param1b.O;
      this.P = param1b.P;
      this.Q = param1b.Q;
      this.R = param1b.R;
      this.S = param1b.S;
      this.T = param1b.T;
      this.U = param1b.U;
      this.V = param1b.V;
      this.W = param1b.W;
      this.X = param1b.X;
      this.Y = param1b.Y;
      this.Z = param1b.Z;
      this.a0 = param1b.a0;
      this.b0 = param1b.b0;
      this.c0 = param1b.c0;
      this.d0 = param1b.d0;
      this.g0 = param1b.g0;
      int[] arrayOfInt = param1b.e0;
      if (arrayOfInt != null) {
        this.e0 = Arrays.copyOf(arrayOfInt, arrayOfInt.length);
      } else {
        this.e0 = null;
      } 
      this.f0 = param1b.f0;
      this.h0 = param1b.h0;
      this.i0 = param1b.i0;
      this.j0 = param1b.j0;
    }
  }
  
  public static class c {
    private static SparseIntArray h = new SparseIntArray();
    
    public boolean a = false;
    
    public int b = -1;
    
    public String c = null;
    
    public int d = -1;
    
    public int e = 0;
    
    public float f = Float.NaN;
    
    public float g = Float.NaN;
    
    static {
      h.append(k.Motion_motionPathRotate, 1);
      h.append(k.Motion_pathMotionArc, 2);
      h.append(k.Motion_transitionEasing, 3);
      h.append(k.Motion_drawPath, 4);
      h.append(k.Motion_animate_relativeTo, 5);
      h.append(k.Motion_motionStagger, 6);
    }
    
    void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.Motion);
      this.a = true;
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        String str;
        int k = typedArray.getIndex(i);
        switch (h.get(k)) {
          case 6:
            this.f = typedArray.getFloat(k, this.f);
            break;
          case 5:
            this.b = e.a(typedArray, k, this.b);
            break;
          case 4:
            this.e = typedArray.getInt(k, 0);
            break;
          case 3:
            if ((typedArray.peekValue(k)).type == 3) {
              str = typedArray.getString(k);
            } else {
              str = b.e.a.a.a.b[typedArray.getInteger(k, 0)];
            } 
            this.c = str;
            break;
          case 2:
            this.d = typedArray.getInt(k, this.d);
            break;
          case 1:
            this.g = typedArray.getFloat(k, this.g);
            break;
        } 
      } 
      typedArray.recycle();
    }
    
    public void a(c param1c) {
      this.a = param1c.a;
      this.b = param1c.b;
      this.c = param1c.c;
      this.d = param1c.d;
      this.e = param1c.e;
      this.g = param1c.g;
      this.f = param1c.f;
    }
  }
  
  public static class d {
    public boolean a = false;
    
    public int b = 0;
    
    public int c = 0;
    
    public float d = 1.0F;
    
    public float e = Float.NaN;
    
    void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.PropertySet);
      this.a = true;
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        if (k == k.PropertySet_android_alpha) {
          this.d = typedArray.getFloat(k, this.d);
        } else if (k == k.PropertySet_android_visibility) {
          this.b = typedArray.getInt(k, this.b);
          this.b = e.a()[this.b];
        } else if (k == k.PropertySet_visibilityMode) {
          this.c = typedArray.getInt(k, this.c);
        } else if (k == k.PropertySet_motionProgress) {
          this.e = typedArray.getFloat(k, this.e);
        } 
      } 
      typedArray.recycle();
    }
    
    public void a(d param1d) {
      this.a = param1d.a;
      this.b = param1d.b;
      this.d = param1d.d;
      this.e = param1d.e;
      this.c = param1d.c;
    }
  }
  
  public static class e {
    private static SparseIntArray n = new SparseIntArray();
    
    public boolean a = false;
    
    public float b = 0.0F;
    
    public float c = 0.0F;
    
    public float d = 0.0F;
    
    public float e = 1.0F;
    
    public float f = 1.0F;
    
    public float g = Float.NaN;
    
    public float h = Float.NaN;
    
    public float i = 0.0F;
    
    public float j = 0.0F;
    
    public float k = 0.0F;
    
    public boolean l = false;
    
    public float m = 0.0F;
    
    static {
      n.append(k.Transform_android_rotation, 1);
      n.append(k.Transform_android_rotationX, 2);
      n.append(k.Transform_android_rotationY, 3);
      n.append(k.Transform_android_scaleX, 4);
      n.append(k.Transform_android_scaleY, 5);
      n.append(k.Transform_android_transformPivotX, 6);
      n.append(k.Transform_android_transformPivotY, 7);
      n.append(k.Transform_android_translationX, 8);
      n.append(k.Transform_android_translationY, 9);
      n.append(k.Transform_android_translationZ, 10);
      n.append(k.Transform_android_elevation, 11);
    }
    
    void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.Transform);
      this.a = true;
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        switch (n.get(k)) {
          case 11:
            if (Build.VERSION.SDK_INT >= 21) {
              this.l = true;
              this.m = typedArray.getDimension(k, this.m);
            } 
            break;
          case 10:
            if (Build.VERSION.SDK_INT >= 21)
              this.k = typedArray.getDimension(k, this.k); 
            break;
          case 9:
            this.j = typedArray.getDimension(k, this.j);
            break;
          case 8:
            this.i = typedArray.getDimension(k, this.i);
            break;
          case 7:
            this.h = typedArray.getDimension(k, this.h);
            break;
          case 6:
            this.g = typedArray.getDimension(k, this.g);
            break;
          case 5:
            this.f = typedArray.getFloat(k, this.f);
            break;
          case 4:
            this.e = typedArray.getFloat(k, this.e);
            break;
          case 3:
            this.d = typedArray.getFloat(k, this.d);
            break;
          case 2:
            this.c = typedArray.getFloat(k, this.c);
            break;
          case 1:
            this.b = typedArray.getFloat(k, this.b);
            break;
        } 
      } 
      typedArray.recycle();
    }
    
    public void a(e param1e) {
      this.a = param1e.a;
      this.b = param1e.b;
      this.c = param1e.c;
      this.d = param1e.d;
      this.e = param1e.e;
      this.f = param1e.f;
      this.g = param1e.g;
      this.h = param1e.h;
      this.i = param1e.i;
      this.j = param1e.j;
      this.k = param1e.k;
      this.l = param1e.l;
      this.m = param1e.m;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */