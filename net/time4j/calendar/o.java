package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.a0;
import net.time4j.calendar.s.c;
import net.time4j.calendar.s.f;
import net.time4j.tz.k;
import net.time4j.tz.p;

public enum o {
  c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
  
  private static final o[] A;
  
  private static final String[] B;
  
  private static final String[] C;
  
  private static final String[] D;
  
  private static final String[] E;
  
  private static final String[] F;
  
  private static final String[] G;
  
  private static final String[] H;
  
  static {
    I = new o[] { 
        c, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z };
    A = values();
    B = new String[] { 
        "lichun", "yushui", "jingzhe", "chunfen", "qingming", "guyu", "lixia", "xiaoman", "mangzhong", "xiazhi", 
        "xiaoshu", "dashu", "liqiu", "chushu", "bailu", "qiufen", "hanlu", "shuangjiang", "lidong", "xiaoxue", 
        "daxue", "dongzhi", "xiaohan", "dahan" };
    C = new String[] { 
        "lìchūn", "yǔshuǐ", "jīngzhé", "chūnfēn", "qīngmíng", "gǔyǔ", "lìxià", "xiǎomǎn", "mángzhòng", "xiàzhì", 
        "xiǎoshǔ", "dàshǔ", "lìqiū", "chǔshǔ", "báilù", "qiūfēn", "hánlù", "shuāngjiàng", "lìdōng", "xiǎoxuě", 
        "dàxuě", "dōngzhì", "xiǎohán", "dàhán" };
    D = new String[] { 
        "立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", 
        "小暑", "大暑", "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", 
        "大雪", "冬至", "小寒", "大寒" };
    E = new String[] { 
        "立春", "雨水", "驚蟄", "春分", "清明", "穀雨", "立夏", "小滿", "芒種", "夏至", 
        "小暑", "大暑", "立秋", "處暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", 
        "大雪", "冬至", "小寒", "大寒" };
    F = new String[] { 
        "입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하", "소만", "망종", "하지", 
        "소서", "대서", "입추", "처서", "백로", "추분", "한로", "상강", "입동", "소설", 
        "대설", "동지", "소한", "대한" };
    G = new String[] { 
        "Lập xuân", "Vũ thủy", "Kinh trập", "Xuân phân", "Thanh minh", "Cốc vũ", "Lập hạ", "Tiểu mãn", "Mang chủng", "Hạ chí", 
        "Tiểu thử", "Đại thử", "Lập thu", "Xử thử", "Bạch lộ", "Thu phân", "Hàn lộ", "Sương giáng", "Lập đông", "Tiểu tuyết", 
        "Đại tuyết", "Đông chí", "Tiểu hàn", "Đại hàn" };
    H = new String[] { 
        "立春", "雨水", "啓蟄", "春分", "清明", "穀雨", "立夏", "小満", "芒種", "夏至", 
        "小暑", "大暑", "立秋", "処暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", 
        "大雪", "冬至", "小寒", "大寒" };
  }
  
  private static double a(double paramDouble) {
    return paramDouble - Math.floor(paramDouble / 360.0D) * 360.0D;
  }
  
  private a0 a(a0 parama0) {
    double d4 = a();
    double d1 = c.a(parama0).b();
    double d2 = b(d1);
    Double.isNaN(d4);
    double d3 = a(d4 - d2) * 365.242189D / 360.0D + d1;
    d2 = Math.max(d1, d3 - 5.0D);
    d1 = d3 + 5.0D;
    while (true) {
      d3 = (d2 + d1) / 2.0D;
      if (d1 - d2 < 1.0E-5D)
        return c.a(d3).c(); 
      double d = b(d3);
      Double.isNaN(d4);
      if (a(d - d4) < 180.0D) {
        d1 = d3;
        continue;
      } 
      d2 = d3;
    } 
  }
  
  static o a(CharSequence paramCharSequence, Locale paramLocale, ParsePosition paramParsePosition) {
    String[] arrayOfString = b(paramLocale);
    boolean bool = paramLocale.getLanguage().isEmpty();
    int j = paramParsePosition.getIndex();
    for (int i = 0; i < arrayOfString.length; i++) {
      String str1 = arrayOfString[i];
      String str2 = paramCharSequence.subSequence(j, Math.min(paramCharSequence.length(), str1.length() + j)).toString();
      if ((bool && str2.equalsIgnoreCase(str1)) || str2.equals(str1)) {
        paramParsePosition.setIndex(paramParsePosition.getIndex() + str1.length());
        return A[i];
      } 
    } 
    if (paramLocale.getLanguage().isEmpty() || arrayOfString != C) {
      paramParsePosition.setErrorIndex(paramParsePosition.getIndex());
      return null;
    } 
    return a(paramCharSequence, Locale.ROOT, paramParsePosition);
  }
  
  static double b(double paramDouble) {
    return f.f.a(paramDouble, "solar-longitude");
  }
  
  public static o b(a0 parama0) {
    int i = (int)Math.floor(b(c.a(parama0).b()) / 15.0D);
    return A[(i + 3) % 24];
  }
  
  private static String[] b(Locale paramLocale) {
    return paramLocale.getLanguage().equals("zh") ? (paramLocale.getCountry().equals("TW") ? E : D) : (paramLocale.getLanguage().equals("ko") ? F : (paramLocale.getLanguage().equals("vi") ? G : (paramLocale.getLanguage().equals("ja") ? H : (paramLocale.getLanguage().isEmpty() ? B : C))));
  }
  
  public int a() {
    return (ordinal() + 21) % 24 * 15;
  }
  
  public String a(Locale paramLocale) {
    return b(paramLocale)[ordinal()];
  }
  
  public <D extends f<?, D>> D a(D paramD) {
    d<D> d = paramD.v();
    long l = paramD.q();
    p p = d.b(l);
    return d.a(a(d.d(l)).b((k)p).y().q());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */