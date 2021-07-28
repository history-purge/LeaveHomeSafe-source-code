package e.d.c;

import e.d.b.m;
import e.d.b.r;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class j<T extends b> {
  protected final T a;
  
  public j(T paramT) {
    this.a = paramT;
  }
  
  protected static String a(double paramDouble) {
    DecimalFormat decimalFormat = new DecimalFormat("0.0");
    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("f/");
    stringBuilder.append(decimalFormat.format(paramDouble));
    return stringBuilder.toString();
  }
  
  public static String a(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i;
    for (i = 0; i < 4 && i < paramArrayOfint.length; i++) {
      if (i == paramInt)
        stringBuilder.append('.'); 
      char c1 = (char)paramArrayOfint[i];
      char c = c1;
      if (c1 < '0')
        c = (char)(c1 + 48); 
      if (i != 0 || c != '0')
        stringBuilder.append(c); 
    } 
    return stringBuilder.toString();
  }
  
  protected static String b(double paramDouble) {
    DecimalFormat decimalFormat = new DecimalFormat("0.#");
    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(decimalFormat.format(paramDouble));
    stringBuilder.append(" mm");
    return stringBuilder.toString();
  }
  
  protected String a(int paramInt) {
    int i;
    byte[] arrayOfByte = this.a.d(paramInt);
    if (arrayOfByte == null)
      return null; 
    int k = arrayOfByte.length;
    paramInt = 0;
    while (true) {
      i = k;
      if (paramInt < arrayOfByte.length) {
        i = arrayOfByte[paramInt] & 0xFF;
        if (i == 0 || i > 127) {
          i = paramInt;
          break;
        } 
        paramInt++;
        continue;
      } 
      break;
    } 
    return new String(arrayOfByte, 0, i);
  }
  
  protected String a(int paramInt1, int paramInt2) {
    m m = this.a.n(paramInt1);
    if (m == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("%.");
    stringBuilder.append(paramInt2);
    stringBuilder.append("f");
    return String.format(stringBuilder.toString(), new Object[] { Double.valueOf(m.doubleValue()) });
  }
  
  protected String a(int paramInt1, int paramInt2, String... paramVarArgs) {
    Long long_ = this.a.l(paramInt1);
    if (long_ == null)
      return null; 
    long l = long_.longValue() - paramInt2;
    if (l >= 0L && l < paramVarArgs.length) {
      String str = paramVarArgs[(int)l];
      if (str != null)
        return str; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(long_);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  protected String a(int paramInt, String paramString) {
    Integer integer = this.a.k(paramInt);
    return (integer == null) ? null : String.format(paramString, new Object[] { integer });
  }
  
  protected String a(int paramInt, Charset paramCharset) {
    byte[] arrayOfByte = this.a.d(paramInt);
    if (arrayOfByte == null)
      return null; 
    try {
      return (new String(arrayOfByte, paramCharset.name())).trim();
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return null;
    } 
  }
  
  protected String a(int paramInt, Object... paramVarArgs) {
    Integer integer = this.a.k(paramInt);
    if (integer == null)
      return null; 
    ArrayList<Object> arrayList = new ArrayList();
    for (paramInt = 0; paramVarArgs.length > paramInt; paramInt++) {
      Object object = paramVarArgs[paramInt];
      if (object != null) {
        boolean bool;
        if ((integer.intValue() & 0x1) == 1) {
          bool = true;
        } else {
          bool = false;
        } 
        if (object instanceof String[]) {
          object = ((String[])object)[bool];
        } else if (bool && object instanceof String) {
          object = object;
        } else {
          continue;
        } 
        arrayList.add(object);
      } 
      continue;
      integer = Integer.valueOf(integer.intValue() >> 1);
    } 
    return r.a(arrayList, ", ");
  }
  
  protected String a(int paramInt, String... paramVarArgs) {
    return a(paramInt, 0, paramVarArgs);
  }
  
  protected String a(short paramShort) {
    if (paramShort != 0) {
      if (paramShort != 1) {
        if (paramShort != 2) {
          if (paramShort != 3) {
            if (paramShort != 4) {
              if (paramShort != 255) {
                switch (paramShort) {
                  default:
                    return c(paramShort);
                  case 24:
                    return "ISO Studio Tungsten";
                  case 23:
                    return "D50";
                  case 22:
                    return "D75";
                  case 21:
                    return "D65";
                  case 20:
                    return "D55";
                  case 19:
                    return "Standard Light C";
                  case 18:
                    return "Standard Light B";
                  case 17:
                    return "Standard Light A";
                  case 16:
                    return "Warm White Fluorescent";
                  case 15:
                    return "White Fluorescent";
                  case 14:
                    return "Cool White Fluorescent";
                  case 13:
                    return "Day White Fluorescent";
                  case 12:
                    return "Daylight Fluorescent";
                  case 11:
                    return "Shade";
                  case 10:
                    return "Cloudy";
                  case 9:
                    break;
                } 
                return "Fine Weather";
              } 
              return "Other";
            } 
            return "Flash";
          } 
          return "Tungsten (Incandescent)";
        } 
        return "Fluorescent";
      } 
      return "Daylight";
    } 
    return "Unknown";
  }
  
  protected String b(int paramInt) {
    String str;
    byte[] arrayOfByte = this.a.d(paramInt);
    if (arrayOfByte == null)
      return null; 
    paramInt = arrayOfByte.length;
    if (arrayOfByte.length == 1) {
      str = "";
    } else {
      str = "s";
    } 
    return String.format("(%d byte%s)", new Object[] { Integer.valueOf(paramInt), str });
  }
  
  protected String b(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.a.j(paramInt1);
    return (arrayOfInt == null) ? null : a(arrayOfInt, paramInt2);
  }
  
  protected String b(int paramInt, String paramString) {
    String str = this.a.p(paramInt);
    return (str == null) ? null : String.format(paramString, new Object[] { str });
  }
  
  public String c(int paramInt) {
    Object object = this.a.m(paramInt);
    if (object == null)
      return null; 
    if (object.getClass().isArray()) {
      int i = Array.getLength(object);
      if (i > 16)
        return String.format("[%d values]", new Object[] { Integer.valueOf(i) }); 
    } 
    return (object instanceof Date) ? (new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy")).format((Date)object).replaceAll("([0-9]{2} [^ ]+)$", ":$1") : this.a.p(paramInt);
  }
  
  protected String d(int paramInt) {
    Long long_ = this.a.l(paramInt);
    return (long_ == null) ? null : (new Date(long_.longValue())).toString();
  }
  
  protected String e(int paramInt) {
    m m;
    m[] arrayOfM = this.a.o(paramInt);
    if (arrayOfM == null || arrayOfM.length != 4 || (arrayOfM[0].r() && arrayOfM[2].r()))
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    if (arrayOfM[0].b(arrayOfM[1])) {
      m = arrayOfM[0];
    } else {
      stringBuilder.append(arrayOfM[0].a(true));
      stringBuilder.append('-');
      m = arrayOfM[1];
    } 
    stringBuilder.append(m.a(true));
    stringBuilder.append("mm");
    if (!arrayOfM[2].r()) {
      String str;
      stringBuilder.append(' ');
      DecimalFormat decimalFormat = new DecimalFormat("0.0");
      decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
      if (arrayOfM[2].b(arrayOfM[3])) {
        str = a(arrayOfM[2].doubleValue());
      } else {
        stringBuilder.append("f/");
        stringBuilder.append(str.format(arrayOfM[2].doubleValue()));
        stringBuilder.append('-');
        str = str.format(arrayOfM[3].doubleValue());
      } 
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  protected String f(int paramInt) {
    return a(paramInt, 1, new String[] { "Top, left side (Horizontal / normal)", "Top, right side (Mirror horizontal)", "Bottom, right side (Rotate 180)", "Bottom, left side (Mirror vertical)", "Left side, top (Mirror horizontal and rotate 270 CW)", "Right side, top (Rotate 90 CW)", "Right side, bottom (Mirror horizontal and rotate 90 CW)", "Left side, bottom (Rotate 270 CW)" });
  }
  
  protected String g(int paramInt) {
    m m = this.a.n(paramInt);
    if (m != null)
      return m.a(true); 
    Double double_ = this.a.g(paramInt);
    return (double_ != null) ? (new DecimalFormat("0.###")).format(double_) : null;
  }
  
  protected String h(int paramInt) {
    DecimalFormat decimalFormat;
    Float float_ = this.a.h(paramInt);
    if (float_ == null)
      return null; 
    if (float_.floatValue() <= 1.0F) {
      double d3 = float_.floatValue();
      double d4 = Math.log(2.0D);
      Double.isNaN(d3);
      d3 = (float)(1.0D / Math.exp(d3 * d4));
      Double.isNaN(d3);
      float f = (float)Math.round(d3 * 10.0D) / 10.0F;
      decimalFormat = new DecimalFormat("0.##");
      decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(decimalFormat.format(f));
      stringBuilder1.append(" sec");
      return stringBuilder1.toString();
    } 
    double d1 = decimalFormat.floatValue();
    double d2 = Math.log(2.0D);
    Double.isNaN(d1);
    paramInt = (int)Math.exp(d1 * d2);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("1/");
    stringBuilder.append(paramInt);
    stringBuilder.append(" sec");
    return stringBuilder.toString();
  }
  
  protected String i(int paramInt) {
    m m = this.a.n(paramInt);
    return (m == null) ? null : m.a(true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */