package e.d.c;

import e.d.b.m;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class b {
  protected final Map<Integer, Object> a = new HashMap<Integer, Object>();
  
  protected final Collection<i> b = new ArrayList<i>();
  
  private final Collection<String> c = new ArrayList<String>(4);
  
  protected j d;
  
  public abstract String a();
  
  public void a(int paramInt, double paramDouble) {
    a(paramInt, Double.valueOf(paramDouble));
  }
  
  public void a(int paramInt, float paramFloat) {
    a(paramInt, Float.valueOf(paramFloat));
  }
  
  public void a(int paramInt1, int paramInt2) {
    a(paramInt1, Integer.valueOf(paramInt2));
  }
  
  public void a(int paramInt, long paramLong) {
    a(paramInt, Long.valueOf(paramLong));
  }
  
  public void a(int paramInt, m paramm) {
    a(paramInt, paramm);
  }
  
  public void a(int paramInt, h paramh) {
    if (paramh != null) {
      a(paramInt, paramh);
      return;
    } 
    throw new NullPointerException("cannot set a null StringValue");
  }
  
  public void a(int paramInt, Object paramObject) {
    if (paramObject != null) {
      if (!this.a.containsKey(Integer.valueOf(paramInt)))
        this.b.add(new i(paramInt, this)); 
      this.a.put(Integer.valueOf(paramInt), paramObject);
      return;
    } 
    throw new NullPointerException("cannot set a null object");
  }
  
  public void a(int paramInt, String paramString) {
    if (paramString != null) {
      a(paramInt, paramString);
      return;
    } 
    throw new NullPointerException("cannot set a null String");
  }
  
  public void a(int paramInt, Date paramDate) {
    a(paramInt, paramDate);
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    a(paramInt, Boolean.valueOf(paramBoolean));
  }
  
  public void a(int paramInt, byte[] paramArrayOfbyte) {
    b(paramInt, paramArrayOfbyte);
  }
  
  public void a(int paramInt, double[] paramArrayOfdouble) {
    b(paramInt, paramArrayOfdouble);
  }
  
  public void a(int paramInt, float[] paramArrayOffloat) {
    b(paramInt, paramArrayOffloat);
  }
  
  public void a(int paramInt, int[] paramArrayOfint) {
    b(paramInt, paramArrayOfint);
  }
  
  public void a(int paramInt, m[] paramArrayOfm) {
    b(paramInt, paramArrayOfm);
  }
  
  public void a(int paramInt, h[] paramArrayOfh) {
    b(paramInt, paramArrayOfh);
  }
  
  public void a(int paramInt, String[] paramArrayOfString) {
    b(paramInt, paramArrayOfString);
  }
  
  public void a(b paramb) {}
  
  public void a(j paramj) {
    if (paramj != null) {
      this.d = paramj;
      return;
    } 
    throw new NullPointerException("cannot set a null descriptor");
  }
  
  public void a(String paramString) {
    this.c.add(paramString);
  }
  
  public boolean a(int paramInt) {
    return this.a.containsKey(Integer.valueOf(paramInt));
  }
  
  protected abstract HashMap<Integer, String> b();
  
  public void b(int paramInt, Object paramObject) {
    a(paramInt, paramObject);
  }
  
  public boolean b(int paramInt) {
    Boolean bool = c(paramInt);
    if (bool != null)
      return bool.booleanValue(); 
    Object object = m(paramInt);
    if (object == null) {
      object = new StringBuilder();
      object.append("Tag '");
      object.append(t(paramInt));
      object.append("' has not been set -- check using containsTag() first");
      throw new f(object.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Tag '");
    stringBuilder.append(paramInt);
    stringBuilder.append("' cannot be converted to a boolean.  It is of type '");
    stringBuilder.append(object.getClass());
    stringBuilder.append("'.");
    throw new f(stringBuilder.toString());
  }
  
  public Boolean c(int paramInt) {
    object = m(paramInt);
    if (object == null)
      return null; 
    if (object instanceof Boolean)
      return (Boolean)object; 
    if (object instanceof String || object instanceof h)
      try {
        boolean bool = Boolean.getBoolean(object.toString());
        return Boolean.valueOf(bool);
      } catch (NumberFormatException object) {
        return null;
      }  
    if (object instanceof Number) {
      boolean bool;
      if (((Number)object).doubleValue() != 0.0D) {
        bool = true;
      } else {
        bool = false;
      } 
      return Boolean.valueOf(bool);
    } 
    return null;
  }
  
  public Collection<i> c() {
    return Collections.unmodifiableCollection(this.b);
  }
  
  public boolean d() {
    return (this.c.size() > 0);
  }
  
  public byte[] d(int paramInt) {
    byte[] arrayOfByte;
    Object object = m(paramInt);
    m[] arrayOfM = null;
    if (object == null)
      return null; 
    if (object instanceof h)
      return ((h)object).a(); 
    boolean bool = object instanceof m[];
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    paramInt = 0;
    if (bool) {
      arrayOfM = (m[])object;
      object = new byte[arrayOfM.length];
      while (paramInt < object.length) {
        object[paramInt] = arrayOfM[paramInt].byteValue();
        paramInt++;
      } 
      return (byte[])object;
    } 
    if (object instanceof byte[])
      return (byte[])object; 
    if (object instanceof int[]) {
      int[] arrayOfInt = (int[])object;
      object = new byte[arrayOfInt.length];
      for (paramInt = bool1; paramInt < arrayOfInt.length; paramInt++)
        object[paramInt] = (byte)arrayOfInt[paramInt]; 
      return (byte[])object;
    } 
    if (object instanceof short[]) {
      short[] arrayOfShort = (short[])object;
      object = new byte[arrayOfShort.length];
      for (paramInt = bool2; paramInt < arrayOfShort.length; paramInt++)
        object[paramInt] = (byte)arrayOfShort[paramInt]; 
      return (byte[])object;
    } 
    if (object instanceof CharSequence) {
      CharSequence charSequence = (CharSequence)object;
      object = new byte[charSequence.length()];
      for (paramInt = bool3; paramInt < charSequence.length(); paramInt++)
        object[paramInt] = (byte)charSequence.charAt(paramInt); 
      return (byte[])object;
    } 
    if (object instanceof Integer) {
      arrayOfByte = new byte[1];
      arrayOfByte[0] = ((Integer)object).byteValue();
    } 
    return arrayOfByte;
  }
  
  public String e(int paramInt) {
    return this.d.c(paramInt);
  }
  
  public boolean e() {
    return (this.c.isEmpty() && this.b.isEmpty());
  }
  
  public double f(int paramInt) {
    Double double_ = g(paramInt);
    if (double_ != null)
      return double_.doubleValue(); 
    Object object = m(paramInt);
    if (object == null) {
      object = new StringBuilder();
      object.append("Tag '");
      object.append(t(paramInt));
      object.append("' has not been set -- check using containsTag() first");
      throw new f(object.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Tag '");
    stringBuilder.append(paramInt);
    stringBuilder.append("' cannot be converted to a double.  It is of type '");
    stringBuilder.append(object.getClass());
    stringBuilder.append("'.");
    throw new f(stringBuilder.toString());
  }
  
  public Double g(int paramInt) {
    object = m(paramInt);
    if (object == null)
      return null; 
    if (object instanceof String || object instanceof h)
      try {
        double d = Double.parseDouble(object.toString());
        return Double.valueOf(d);
      } catch (NumberFormatException object) {
        return null;
      }  
    return (object instanceof Number) ? Double.valueOf(((Number)object).doubleValue()) : null;
  }
  
  public Float h(int paramInt) {
    object = m(paramInt);
    if (object == null)
      return null; 
    if (object instanceof String || object instanceof h)
      try {
        float f = Float.parseFloat(object.toString());
        return Float.valueOf(f);
      } catch (NumberFormatException object) {
        return null;
      }  
    return (object instanceof Number) ? Float.valueOf(((Number)object).floatValue()) : null;
  }
  
  public int i(int paramInt) {
    Integer integer = k(paramInt);
    if (integer != null)
      return integer.intValue(); 
    Object object = m(paramInt);
    if (object == null) {
      object = new StringBuilder();
      object.append("Tag '");
      object.append(t(paramInt));
      object.append("' has not been set -- check using containsTag() first");
      throw new f(object.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Tag '");
    stringBuilder.append(paramInt);
    stringBuilder.append("' cannot be converted to int.  It is of type '");
    stringBuilder.append(object.getClass());
    stringBuilder.append("'.");
    throw new f(stringBuilder.toString());
  }
  
  public int[] j(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual m : (I)Ljava/lang/Object;
    //   5: astore #7
    //   7: aconst_null
    //   8: astore #6
    //   10: aload #7
    //   12: ifnonnull -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: aload #7
    //   19: instanceof [I
    //   22: ifeq -> 31
    //   25: aload #7
    //   27: checkcast [I
    //   30: areturn
    //   31: aload #7
    //   33: instanceof [Le/d/b/m;
    //   36: istore #5
    //   38: iconst_0
    //   39: istore_2
    //   40: iconst_0
    //   41: istore_3
    //   42: iconst_0
    //   43: istore #4
    //   45: iconst_0
    //   46: istore_1
    //   47: iload #5
    //   49: ifeq -> 94
    //   52: aload #7
    //   54: checkcast [Le/d/b/m;
    //   57: astore #6
    //   59: aload #6
    //   61: arraylength
    //   62: newarray int
    //   64: astore #7
    //   66: iload_1
    //   67: aload #7
    //   69: arraylength
    //   70: if_icmpge -> 91
    //   73: aload #7
    //   75: iload_1
    //   76: aload #6
    //   78: iload_1
    //   79: aaload
    //   80: invokevirtual intValue : ()I
    //   83: iastore
    //   84: iload_1
    //   85: iconst_1
    //   86: iadd
    //   87: istore_1
    //   88: goto -> 66
    //   91: aload #7
    //   93: areturn
    //   94: aload #7
    //   96: instanceof [S
    //   99: ifeq -> 143
    //   102: aload #7
    //   104: checkcast [S
    //   107: astore #6
    //   109: aload #6
    //   111: arraylength
    //   112: newarray int
    //   114: astore #7
    //   116: iload_2
    //   117: istore_1
    //   118: iload_1
    //   119: aload #6
    //   121: arraylength
    //   122: if_icmpge -> 140
    //   125: aload #7
    //   127: iload_1
    //   128: aload #6
    //   130: iload_1
    //   131: saload
    //   132: iastore
    //   133: iload_1
    //   134: iconst_1
    //   135: iadd
    //   136: istore_1
    //   137: goto -> 118
    //   140: aload #7
    //   142: areturn
    //   143: aload #7
    //   145: instanceof [B
    //   148: ifeq -> 192
    //   151: aload #7
    //   153: checkcast [B
    //   156: astore #6
    //   158: aload #6
    //   160: arraylength
    //   161: newarray int
    //   163: astore #7
    //   165: iload_3
    //   166: istore_1
    //   167: iload_1
    //   168: aload #6
    //   170: arraylength
    //   171: if_icmpge -> 189
    //   174: aload #7
    //   176: iload_1
    //   177: aload #6
    //   179: iload_1
    //   180: baload
    //   181: iastore
    //   182: iload_1
    //   183: iconst_1
    //   184: iadd
    //   185: istore_1
    //   186: goto -> 167
    //   189: aload #7
    //   191: areturn
    //   192: aload #7
    //   194: instanceof java/lang/CharSequence
    //   197: ifeq -> 254
    //   200: aload #7
    //   202: checkcast java/lang/CharSequence
    //   205: astore #6
    //   207: aload #6
    //   209: invokeinterface length : ()I
    //   214: newarray int
    //   216: astore #7
    //   218: iload #4
    //   220: istore_1
    //   221: iload_1
    //   222: aload #6
    //   224: invokeinterface length : ()I
    //   229: if_icmpge -> 251
    //   232: aload #7
    //   234: iload_1
    //   235: aload #6
    //   237: iload_1
    //   238: invokeinterface charAt : (I)C
    //   243: iastore
    //   244: iload_1
    //   245: iconst_1
    //   246: iadd
    //   247: istore_1
    //   248: goto -> 221
    //   251: aload #7
    //   253: areturn
    //   254: aload #7
    //   256: instanceof java/lang/Integer
    //   259: ifeq -> 279
    //   262: iconst_1
    //   263: newarray int
    //   265: astore #6
    //   267: aload #6
    //   269: iconst_0
    //   270: aload #7
    //   272: checkcast java/lang/Integer
    //   275: invokevirtual intValue : ()I
    //   278: iastore
    //   279: aload #6
    //   281: areturn
  }
  
  public Integer k(int paramInt) {
    Object object = m(paramInt);
    if (object == null)
      return null; 
    if (object instanceof Number) {
      paramInt = ((Number)object).intValue();
      return Integer.valueOf(paramInt);
    } 
    boolean bool = object instanceof String;
    paramInt = 0;
    if (bool || object instanceof h) {
      try {
        int i = Integer.parseInt(object.toString());
        return Integer.valueOf(i);
      } catch (NumberFormatException numberFormatException) {}
      return Integer.valueOf(paramInt);
    } 
    if (object instanceof m[]) {
      object = object;
      if (object.length == 1) {
        paramInt = object[0].intValue();
        return Integer.valueOf(paramInt);
      } 
    } else if (object instanceof byte[]) {
      object = object;
      if (object.length == 1) {
        Object object1 = object[0];
        return Integer.valueOf(object1);
      } 
    } else if (object instanceof int[]) {
      object = object;
      if (object.length == 1) {
        Object object1 = object[0];
        return Integer.valueOf(object1);
      } 
    } else if (object instanceof short[]) {
      object = object;
      if (object.length == 1) {
        Object object1 = object[0];
        return Integer.valueOf(object1);
      } 
    } 
    return null;
  }
  
  public Long l(int paramInt) {
    object = m(paramInt);
    if (object == null)
      return null; 
    if (object instanceof Number) {
      long l = ((Number)object).longValue();
      return Long.valueOf(l);
    } 
    if (object instanceof String || object instanceof h)
      try {
        long l = Long.parseLong(object.toString());
        return Long.valueOf(l);
      } catch (NumberFormatException object) {
        return null;
      }  
    if (object instanceof m[]) {
      object = object;
      if (object.length == 1) {
        long l = object[0].longValue();
        return Long.valueOf(l);
      } 
    } else {
      Object object1;
      if (object instanceof byte[]) {
        object = object;
        if (object.length == 1) {
          object1 = object[0];
        } else {
          return null;
        } 
      } else if (object instanceof int[]) {
        object = object;
        if (object.length == 1) {
          object1 = object[0];
        } else {
          return null;
        } 
      } else if (object instanceof short[]) {
        object = object;
        if (object.length == 1) {
          object1 = object[0];
        } else {
          return null;
        } 
      } else {
        return null;
      } 
      long l = object1;
      return Long.valueOf(l);
    } 
    return null;
  }
  
  public Object m(int paramInt) {
    return this.a.get(Integer.valueOf(paramInt));
  }
  
  public m n(int paramInt) {
    Object object = m(paramInt);
    m m = null;
    if (object == null)
      return null; 
    if (object instanceof m)
      return (m)object; 
    if (object instanceof Integer)
      return new m(((Integer)object).intValue(), 1L); 
    if (object instanceof Long)
      m = new m(((Long)object).longValue(), 1L); 
    return m;
  }
  
  public m[] o(int paramInt) {
    Object object = m(paramInt);
    return (object == null) ? null : ((object instanceof m[]) ? (m[])object : null);
  }
  
  public String p(int paramInt) {
    Object object = m(paramInt);
    if (object == null)
      return null; 
    if (object instanceof m)
      return ((m)object).a(true); 
    if (object.getClass().isArray()) {
      int i = Array.getLength(object);
      Class<?> clazz = object.getClass().getComponentType();
      StringBuilder stringBuilder = new StringBuilder();
      boolean bool = Object.class.isAssignableFrom(clazz);
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      boolean bool6 = false;
      paramInt = 0;
      if (bool) {
        while (paramInt < i) {
          if (paramInt != 0)
            stringBuilder.append(' '); 
          stringBuilder.append(Array.get(object, paramInt).toString());
          paramInt++;
        } 
      } else if (clazz.getName().equals("int")) {
        for (paramInt = bool1; paramInt < i; paramInt++) {
          if (paramInt != 0)
            stringBuilder.append(' '); 
          stringBuilder.append(Array.getInt(object, paramInt));
        } 
      } else if (clazz.getName().equals("short")) {
        for (paramInt = bool2; paramInt < i; paramInt++) {
          if (paramInt != 0)
            stringBuilder.append(' '); 
          stringBuilder.append(Array.getShort(object, paramInt));
        } 
      } else if (clazz.getName().equals("long")) {
        for (paramInt = bool3; paramInt < i; paramInt++) {
          if (paramInt != 0)
            stringBuilder.append(' '); 
          stringBuilder.append(Array.getLong(object, paramInt));
        } 
      } else {
        String str;
        if (clazz.getName().equals("float")) {
          DecimalFormat decimalFormat = new DecimalFormat("0.###");
          for (paramInt = bool4; paramInt < i; paramInt++) {
            if (paramInt != 0)
              stringBuilder.append(' '); 
            String str1 = decimalFormat.format(Array.getFloat(object, paramInt));
            str = str1;
            if (str1.equals("-0"))
              str = "0"; 
            stringBuilder.append(str);
          } 
        } else if (str.getName().equals("double")) {
          DecimalFormat decimalFormat = new DecimalFormat("0.###");
          for (paramInt = bool5; paramInt < i; paramInt++) {
            if (paramInt != 0)
              stringBuilder.append(' '); 
            String str1 = decimalFormat.format(Array.getDouble(object, paramInt));
            str = str1;
            if (str1.equals("-0"))
              str = "0"; 
            stringBuilder.append(str);
          } 
        } else if (str.getName().equals("byte")) {
          for (paramInt = bool6; paramInt < i; paramInt++) {
            if (paramInt != 0)
              stringBuilder.append(' '); 
            stringBuilder.append(Array.getByte(object, paramInt) & 0xFF);
          } 
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Unexpected array component type: ");
          stringBuilder1.append(str.getName());
          a(stringBuilder1.toString());
        } 
      } 
      return stringBuilder.toString();
    } 
    return (object instanceof Double) ? (new DecimalFormat("0.###")).format(((Double)object).doubleValue()) : ((object instanceof Float) ? (new DecimalFormat("0.###")).format(((Float)object).floatValue()) : object.toString());
  }
  
  public String[] q(int paramInt) {
    Object object2 = m(paramInt);
    Object object1 = null;
    if (object2 == null)
      return null; 
    if (object2 instanceof String[])
      return (String[])object2; 
    boolean bool = object2 instanceof String;
    boolean bool1 = false;
    boolean bool2 = false;
    paramInt = 0;
    if (bool)
      return new String[] { (String)object2 }; 
    if (object2 instanceof h)
      return new String[] { object2.toString() }; 
    if (object2 instanceof h[]) {
      object1 = object2;
      object2 = new String[object1.length];
      while (paramInt < object2.length) {
        object2[paramInt] = object1[paramInt].toString();
        paramInt++;
      } 
      return (String[])object2;
    } 
    if (object2 instanceof int[]) {
      int[] arrayOfInt = (int[])object2;
      object2 = new String[arrayOfInt.length];
      for (paramInt = bool1; paramInt < object2.length; paramInt++)
        object2[paramInt] = Integer.toString(arrayOfInt[paramInt]); 
      return (String[])object2;
    } 
    if (object2 instanceof byte[]) {
      byte[] arrayOfByte = (byte[])object2;
      object2 = new String[arrayOfByte.length];
      for (paramInt = bool2; paramInt < object2.length; paramInt++)
        object2[paramInt] = Byte.toString(arrayOfByte[paramInt]); 
      return (String[])object2;
    } 
    if (object2 instanceof m[]) {
      m[] arrayOfM = (m[])object2;
      object2 = new String[arrayOfM.length];
      paramInt = 0;
      while (true) {
        object1 = object2;
        if (paramInt < object2.length) {
          object2[paramInt] = arrayOfM[paramInt].a(false);
          paramInt++;
          continue;
        } 
        break;
      } 
    } 
    return (String[])object1;
  }
  
  public h r(int paramInt) {
    Object object = m(paramInt);
    return (object instanceof h) ? (h)object : null;
  }
  
  public h[] s(int paramInt) {
    Object object = m(paramInt);
    h[] arrayOfH = null;
    if (object == null)
      return null; 
    if (object instanceof h[])
      return (h[])object; 
    if (object instanceof h) {
      arrayOfH = new h[1];
      arrayOfH[0] = (h)object;
    } 
    return arrayOfH;
  }
  
  public String t(int paramInt) {
    String str;
    HashMap<Integer, String> hashMap = b();
    if (!hashMap.containsKey(Integer.valueOf(paramInt))) {
      for (str = Integer.toHexString(paramInt); str.length() < 4; str = stringBuilder1.toString()) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("0");
        stringBuilder1.append(str);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown tag (0x");
      stringBuilder.append(str);
      stringBuilder.append(")");
      return stringBuilder.toString();
    } 
    return (String)str.get(Integer.valueOf(paramInt));
  }
  
  public String toString() {
    String str1;
    String str2 = a();
    int i = this.a.size();
    if (this.a.size() == 1) {
      str1 = "tag";
    } else {
      str1 = "tags";
    } 
    return String.format("%s Directory (%d %s)", new Object[] { str2, Integer.valueOf(i), str1 });
  }
  
  public boolean u(int paramInt) {
    return b().containsKey(Integer.valueOf(paramInt));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */