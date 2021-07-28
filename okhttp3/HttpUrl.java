package okhttp3;

import j.c;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class HttpUrl {
  static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
  
  static final String FRAGMENT_ENCODE_SET = "";
  
  static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
  
  private static final char[] HEX_DIGITS = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'A', 'B', 'C', 'D', 'E', 'F' };
  
  static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
  
  static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
  
  static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
  
  static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
  
  static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
  
  static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
  
  static final String QUERY_ENCODE_SET = " \"'<>#";
  
  static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
  
  private final String fragment;
  
  final String host;
  
  private final String password;
  
  private final List<String> pathSegments;
  
  final int port;
  
  private final List<String> queryNamesAndValues;
  
  final String scheme;
  
  private final String url;
  
  private final String username;
  
  HttpUrl(Builder paramBuilder) {
    String str1;
    this.scheme = paramBuilder.scheme;
    this.username = percentDecode(paramBuilder.encodedUsername, false);
    this.password = percentDecode(paramBuilder.encodedPassword, false);
    this.host = paramBuilder.host;
    this.port = paramBuilder.effectivePort();
    this.pathSegments = percentDecode(paramBuilder.encodedPathSegments, false);
    List<String> list = paramBuilder.encodedQueryNamesAndValues;
    List list1 = null;
    if (list != null) {
      list = percentDecode(list, true);
    } else {
      list = null;
    } 
    this.queryNamesAndValues = list;
    String str2 = paramBuilder.encodedFragment;
    list = list1;
    if (str2 != null)
      str1 = percentDecode(str2, false); 
    this.fragment = str1;
    this.url = paramBuilder.toString();
  }
  
  static String canonicalize(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Charset paramCharset) {
    for (int i = paramInt1; i < paramInt2; i += Character.charCount(j)) {
      int j = paramString1.codePointAt(i);
      if (j < 32 || j == 127 || (j >= 128 && paramBoolean4) || paramString2.indexOf(j) != -1 || (j == 37 && (!paramBoolean1 || (paramBoolean2 && !percentEncoded(paramString1, i, paramInt2)))) || (j == 43 && paramBoolean3)) {
        c c = new c();
        c.a(paramString1, paramInt1, i);
        canonicalize(c, paramString1, i, paramInt2, paramString2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramCharset);
        return c.d();
      } 
    } 
    return paramString1.substring(paramInt1, paramInt2);
  }
  
  static String canonicalize(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    return canonicalize(paramString1, 0, paramString1.length(), paramString2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, null);
  }
  
  static String canonicalize(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Charset paramCharset) {
    return canonicalize(paramString1, 0, paramString1.length(), paramString2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramCharset);
  }
  
  static void canonicalize(c paramc, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Charset paramCharset) {
    for (Object object = null; paramInt1 < paramInt2; object = SYNTHETIC_LOCAL_VARIABLE_14) {
      int i = paramString1.codePointAt(paramInt1);
      if (paramBoolean1) {
        Object object1 = object;
        if (i != 9) {
          object1 = object;
          if (i != 10) {
            object1 = object;
            if (i != 12) {
              if (i == 13) {
                object1 = object;
                continue;
              } 
            } else {
              continue;
            } 
          } else {
            continue;
          } 
        } else {
          continue;
        } 
      } 
      if (i == 43 && paramBoolean3) {
        String str;
        if (paramBoolean1) {
          str = "+";
        } else {
          str = "%2B";
        } 
        paramc.a(str);
        Object object1 = object;
      } else if (i < 32 || i == 127 || (i >= 128 && paramBoolean4) || paramString2.indexOf(i) != -1 || (i == 37 && (!paramBoolean1 || (paramBoolean2 && !percentEncoded(paramString1, paramInt1, paramInt2))))) {
        Object object1 = object;
        if (object == null)
          object1 = new c(); 
        if (paramCharset == null || paramCharset.equals(Util.UTF_8)) {
          object1.c(i);
        } else {
          object1.a(paramString1, paramInt1, Character.charCount(i) + paramInt1, paramCharset);
        } 
        while (true) {
          Object object2 = object1;
          if (!object1.j()) {
            int j = object1.readByte() & 0xFF;
            paramc.writeByte(37);
            paramc.writeByte(HEX_DIGITS[j >> 4 & 0xF]);
            paramc.writeByte(HEX_DIGITS[j & 0xF]);
            continue;
          } 
          break;
        } 
      } else {
        paramc.c(i);
        Object object1 = object;
      } 
      continue;
      paramInt1 += Character.charCount(SYNTHETIC_LOCAL_VARIABLE_10);
    } 
  }
  
  public static int defaultPort(String paramString) {
    return paramString.equals("http") ? 80 : (paramString.equals("https") ? 443 : -1);
  }
  
  public static HttpUrl get(String paramString) {
    return (new Builder()).parse(null, paramString).build();
  }
  
  public static HttpUrl get(URI paramURI) {
    return parse(paramURI.toString());
  }
  
  public static HttpUrl get(URL paramURL) {
    return parse(paramURL.toString());
  }
  
  static void namesAndValuesToQueryString(StringBuilder paramStringBuilder, List<String> paramList) {
    int j = paramList.size();
    for (int i = 0; i < j; i += 2) {
      String str1 = paramList.get(i);
      String str2 = paramList.get(i + 1);
      if (i > 0)
        paramStringBuilder.append('&'); 
      paramStringBuilder.append(str1);
      if (str2 != null) {
        paramStringBuilder.append('=');
        paramStringBuilder.append(str2);
      } 
    } 
  }
  
  public static HttpUrl parse(String paramString) {
    try {
      return get(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      return null;
    } 
  }
  
  static void pathSegmentsToString(StringBuilder paramStringBuilder, List<String> paramList) {
    int j = paramList.size();
    for (int i = 0; i < j; i++) {
      paramStringBuilder.append('/');
      paramStringBuilder.append(paramList.get(i));
    } 
  }
  
  static String percentDecode(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    for (int i = paramInt1; i < paramInt2; i++) {
      char c = paramString.charAt(i);
      if (c == '%' || (c == '+' && paramBoolean)) {
        c c1 = new c();
        c1.a(paramString, paramInt1, i);
        percentDecode(c1, paramString, i, paramInt2, paramBoolean);
        return c1.d();
      } 
    } 
    return paramString.substring(paramInt1, paramInt2);
  }
  
  static String percentDecode(String paramString, boolean paramBoolean) {
    return percentDecode(paramString, 0, paramString.length(), paramBoolean);
  }
  
  private List<String> percentDecode(List<String> paramList, boolean paramBoolean) {
    int j = paramList.size();
    ArrayList<String> arrayList = new ArrayList(j);
    for (int i = 0; i < j; i++) {
      String str = paramList.get(i);
      if (str != null) {
        str = percentDecode(str, paramBoolean);
      } else {
        str = null;
      } 
      arrayList.add(str);
    } 
    return Collections.unmodifiableList(arrayList);
  }
  
  static void percentDecode(c paramc, String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: iload_3
    //   2: if_icmpge -> 123
    //   5: aload_1
    //   6: iload_2
    //   7: invokevirtual codePointAt : (I)I
    //   10: istore #6
    //   12: iload #6
    //   14: bipush #37
    //   16: if_icmpne -> 83
    //   19: iload_2
    //   20: iconst_2
    //   21: iadd
    //   22: istore #5
    //   24: iload #5
    //   26: iload_3
    //   27: if_icmpge -> 83
    //   30: aload_1
    //   31: iload_2
    //   32: iconst_1
    //   33: iadd
    //   34: invokevirtual charAt : (I)C
    //   37: invokestatic decodeHexDigit : (C)I
    //   40: istore #7
    //   42: aload_1
    //   43: iload #5
    //   45: invokevirtual charAt : (I)C
    //   48: invokestatic decodeHexDigit : (C)I
    //   51: istore #8
    //   53: iload #7
    //   55: iconst_m1
    //   56: if_icmpeq -> 105
    //   59: iload #8
    //   61: iconst_m1
    //   62: if_icmpeq -> 105
    //   65: aload_0
    //   66: iload #7
    //   68: iconst_4
    //   69: ishl
    //   70: iload #8
    //   72: iadd
    //   73: invokevirtual writeByte : (I)Lj/c;
    //   76: pop
    //   77: iload #5
    //   79: istore_2
    //   80: goto -> 112
    //   83: iload #6
    //   85: bipush #43
    //   87: if_icmpne -> 105
    //   90: iload #4
    //   92: ifeq -> 105
    //   95: aload_0
    //   96: bipush #32
    //   98: invokevirtual writeByte : (I)Lj/c;
    //   101: pop
    //   102: goto -> 112
    //   105: aload_0
    //   106: iload #6
    //   108: invokevirtual c : (I)Lj/c;
    //   111: pop
    //   112: iload_2
    //   113: iload #6
    //   115: invokestatic charCount : (I)I
    //   118: iadd
    //   119: istore_2
    //   120: goto -> 0
    //   123: return
  }
  
  static boolean percentEncoded(String paramString, int paramInt1, int paramInt2) {
    int i = paramInt1 + 2;
    return (i < paramInt2 && paramString.charAt(paramInt1) == '%' && Util.decodeHexDigit(paramString.charAt(paramInt1 + 1)) != -1 && Util.decodeHexDigit(paramString.charAt(i)) != -1);
  }
  
  static List<String> queryStringToNamesAndValues(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    for (int i = 0; i <= paramString.length(); i = j + 1) {
      String str;
      int k = paramString.indexOf('&', i);
      int j = k;
      if (k == -1)
        j = paramString.length(); 
      k = paramString.indexOf('=', i);
      if (k == -1 || k > j) {
        arrayList.add(paramString.substring(i, j));
        str = null;
      } else {
        arrayList.add(paramString.substring(i, k));
        str = paramString.substring(k + 1, j);
      } 
      arrayList.add(str);
    } 
    return arrayList;
  }
  
  public String encodedFragment() {
    if (this.fragment == null)
      return null; 
    int i = this.url.indexOf('#');
    return this.url.substring(i + 1);
  }
  
  public String encodedPassword() {
    if (this.password.isEmpty())
      return ""; 
    int i = this.url.indexOf(':', this.scheme.length() + 3);
    int j = this.url.indexOf('@');
    return this.url.substring(i + 1, j);
  }
  
  public String encodedPath() {
    int i = this.url.indexOf('/', this.scheme.length() + 3);
    String str = this.url;
    int j = Util.delimiterOffset(str, i, str.length(), "?#");
    return this.url.substring(i, j);
  }
  
  public List<String> encodedPathSegments() {
    int i = this.url.indexOf('/', this.scheme.length() + 3);
    String str = this.url;
    int j = Util.delimiterOffset(str, i, str.length(), "?#");
    ArrayList<String> arrayList = new ArrayList();
    while (i < j) {
      int k = i + 1;
      i = Util.delimiterOffset(this.url, k, j, '/');
      arrayList.add(this.url.substring(k, i));
    } 
    return arrayList;
  }
  
  public String encodedQuery() {
    if (this.queryNamesAndValues == null)
      return null; 
    int i = this.url.indexOf('?') + 1;
    String str = this.url;
    int j = Util.delimiterOffset(str, i, str.length(), '#');
    return this.url.substring(i, j);
  }
  
  public String encodedUsername() {
    if (this.username.isEmpty())
      return ""; 
    int i = this.scheme.length() + 3;
    String str = this.url;
    int j = Util.delimiterOffset(str, i, str.length(), ":@");
    return this.url.substring(i, j);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof HttpUrl && ((HttpUrl)paramObject).url.equals(this.url));
  }
  
  public String fragment() {
    return this.fragment;
  }
  
  public int hashCode() {
    return this.url.hashCode();
  }
  
  public String host() {
    return this.host;
  }
  
  public boolean isHttps() {
    return this.scheme.equals("https");
  }
  
  public Builder newBuilder() {
    byte b;
    Builder builder = new Builder();
    builder.scheme = this.scheme;
    builder.encodedUsername = encodedUsername();
    builder.encodedPassword = encodedPassword();
    builder.host = this.host;
    if (this.port != defaultPort(this.scheme)) {
      b = this.port;
    } else {
      b = -1;
    } 
    builder.port = b;
    builder.encodedPathSegments.clear();
    builder.encodedPathSegments.addAll(encodedPathSegments());
    builder.encodedQuery(encodedQuery());
    builder.encodedFragment = encodedFragment();
    return builder;
  }
  
  public Builder newBuilder(String paramString) {
    try {
      return (new Builder()).parse(this, paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      return null;
    } 
  }
  
  public String password() {
    return this.password;
  }
  
  public List<String> pathSegments() {
    return this.pathSegments;
  }
  
  public int pathSize() {
    return this.pathSegments.size();
  }
  
  public int port() {
    return this.port;
  }
  
  public String query() {
    if (this.queryNamesAndValues == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    namesAndValuesToQueryString(stringBuilder, this.queryNamesAndValues);
    return stringBuilder.toString();
  }
  
  public String queryParameter(String paramString) {
    List<String> list = this.queryNamesAndValues;
    if (list == null)
      return null; 
    int i = 0;
    int j = list.size();
    while (i < j) {
      if (paramString.equals(this.queryNamesAndValues.get(i)))
        return this.queryNamesAndValues.get(i + 1); 
      i += 2;
    } 
    return null;
  }
  
  public String queryParameterName(int paramInt) {
    List<String> list = this.queryNamesAndValues;
    if (list != null)
      return list.get(paramInt * 2); 
    throw new IndexOutOfBoundsException();
  }
  
  public Set<String> queryParameterNames() {
    if (this.queryNamesAndValues == null)
      return Collections.emptySet(); 
    LinkedHashSet<? extends String> linkedHashSet = new LinkedHashSet();
    int i = 0;
    int j = this.queryNamesAndValues.size();
    while (i < j) {
      linkedHashSet.add(this.queryNamesAndValues.get(i));
      i += 2;
    } 
    return Collections.unmodifiableSet(linkedHashSet);
  }
  
  public String queryParameterValue(int paramInt) {
    List<String> list = this.queryNamesAndValues;
    if (list != null)
      return list.get(paramInt * 2 + 1); 
    throw new IndexOutOfBoundsException();
  }
  
  public List<String> queryParameterValues(String paramString) {
    if (this.queryNamesAndValues == null)
      return Collections.emptyList(); 
    ArrayList<? extends String> arrayList = new ArrayList();
    int i = 0;
    int j = this.queryNamesAndValues.size();
    while (i < j) {
      if (paramString.equals(this.queryNamesAndValues.get(i)))
        arrayList.add(this.queryNamesAndValues.get(i + 1)); 
      i += 2;
    } 
    return Collections.unmodifiableList(arrayList);
  }
  
  public int querySize() {
    List<String> list = this.queryNamesAndValues;
    return (list != null) ? (list.size() / 2) : 0;
  }
  
  public String redact() {
    return newBuilder("/...").username("").password("").build().toString();
  }
  
  public HttpUrl resolve(String paramString) {
    Builder builder = newBuilder(paramString);
    return (builder != null) ? builder.build() : null;
  }
  
  public String scheme() {
    return this.scheme;
  }
  
  public String toString() {
    return this.url;
  }
  
  public String topPrivateDomain() {
    return Util.verifyAsIpAddress(this.host) ? null : PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
  }
  
  public URI uri() {
    String str = newBuilder().reencodeForUri().toString();
    try {
      return new URI(str);
    } catch (URISyntaxException uRISyntaxException) {
      try {
        return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
      } catch (Exception exception) {
        throw new RuntimeException(uRISyntaxException);
      } 
    } 
  }
  
  public URL url() {
    try {
      return new URL(this.url);
    } catch (MalformedURLException malformedURLException) {
      throw new RuntimeException(malformedURLException);
    } 
  }
  
  public String username() {
    return this.username;
  }
  
  public static final class Builder {
    static final String INVALID_HOST = "Invalid URL host";
    
    String encodedFragment;
    
    String encodedPassword = "";
    
    final List<String> encodedPathSegments = new ArrayList<String>();
    
    List<String> encodedQueryNamesAndValues;
    
    String encodedUsername = "";
    
    String host;
    
    int port = -1;
    
    String scheme;
    
    public Builder() {
      this.encodedPathSegments.add("");
    }
    
    private Builder addPathSegments(String param1String, boolean param1Boolean) {
      int i = 0;
      while (true) {
        boolean bool;
        int j = Util.delimiterOffset(param1String, i, param1String.length(), "/\\");
        if (j < param1String.length()) {
          bool = true;
        } else {
          bool = false;
        } 
        push(param1String, i, j, bool, param1Boolean);
        i = ++j;
        if (j > param1String.length())
          return this; 
      } 
    }
    
    private static String canonicalizeHost(String param1String, int param1Int1, int param1Int2) {
      return Util.canonicalizeHost(HttpUrl.percentDecode(param1String, param1Int1, param1Int2, false));
    }
    
    private boolean isDot(String param1String) {
      return (param1String.equals(".") || param1String.equalsIgnoreCase("%2e"));
    }
    
    private boolean isDotDot(String param1String) {
      return (param1String.equals("..") || param1String.equalsIgnoreCase("%2e.") || param1String.equalsIgnoreCase(".%2e") || param1String.equalsIgnoreCase("%2e%2e"));
    }
    
    private static int parsePort(String param1String, int param1Int1, int param1Int2) {
      try {
        param1Int1 = Integer.parseInt(HttpUrl.canonicalize(param1String, param1Int1, param1Int2, "", false, false, false, true, null));
        return (param1Int1 > 0 && param1Int1 <= 65535) ? param1Int1 : -1;
      } catch (NumberFormatException numberFormatException) {
        return -1;
      } 
    }
    
    private void pop() {
      List<String> list = this.encodedPathSegments;
      if (((String)list.remove(list.size() - 1)).isEmpty() && !this.encodedPathSegments.isEmpty()) {
        list = this.encodedPathSegments;
        list.set(list.size() - 1, "");
        return;
      } 
      this.encodedPathSegments.add("");
    }
    
    private static int portColonOffset(String param1String, int param1Int1, int param1Int2) {
      while (param1Int1 < param1Int2) {
        char c = param1String.charAt(param1Int1);
        if (c != ':') {
          int i = param1Int1;
          if (c != '[') {
            i = param1Int1;
          } else {
            while (true) {
              param1Int1 = i + 1;
              i = param1Int1;
              if (param1Int1 < param1Int2) {
                i = param1Int1;
                if (param1String.charAt(param1Int1) == ']') {
                  i = param1Int1;
                  break;
                } 
                continue;
              } 
              break;
            } 
          } 
          param1Int1 = i + 1;
          continue;
        } 
        return param1Int1;
      } 
      return param1Int2;
    }
    
    private void push(String param1String, int param1Int1, int param1Int2, boolean param1Boolean1, boolean param1Boolean2) {
      param1String = HttpUrl.canonicalize(param1String, param1Int1, param1Int2, " \"<>^`{}|/\\?#", param1Boolean2, false, false, true, null);
      if (isDot(param1String))
        return; 
      if (isDotDot(param1String)) {
        pop();
        return;
      } 
      List<String> list = this.encodedPathSegments;
      if (((String)list.get(list.size() - 1)).isEmpty()) {
        list = this.encodedPathSegments;
        list.set(list.size() - 1, param1String);
      } else {
        this.encodedPathSegments.add(param1String);
      } 
      if (param1Boolean1)
        this.encodedPathSegments.add(""); 
    }
    
    private void removeAllCanonicalQueryParameters(String param1String) {
      for (int i = this.encodedQueryNamesAndValues.size() - 2; i >= 0; i -= 2) {
        if (param1String.equals(this.encodedQueryNamesAndValues.get(i))) {
          this.encodedQueryNamesAndValues.remove(i + 1);
          this.encodedQueryNamesAndValues.remove(i);
          if (this.encodedQueryNamesAndValues.isEmpty()) {
            this.encodedQueryNamesAndValues = null;
            return;
          } 
        } 
      } 
    }
    
    private void resolvePath(String param1String, int param1Int1, int param1Int2) {
      if (param1Int1 == param1Int2)
        return; 
      char c = param1String.charAt(param1Int1);
      if (c == '/' || c == '\\') {
        this.encodedPathSegments.clear();
        this.encodedPathSegments.add("");
      } else {
        List<String> list = this.encodedPathSegments;
        list.set(list.size() - 1, "");
        while (true) {
          if (param1Int1 < param1Int2) {
            boolean bool;
            int i = Util.delimiterOffset(param1String, param1Int1, param1Int2, "/\\");
            if (i < param1Int2) {
              bool = true;
            } else {
              bool = false;
            } 
            push(param1String, param1Int1, i, bool, true);
            param1Int1 = i;
            if (bool) {
              param1Int1 = i;
            } else {
              continue;
            } 
          } else {
            break;
          } 
          param1Int1++;
        } 
        return;
      } 
      param1Int1++;
      continue;
    }
    
    private static int schemeDelimiterOffset(String param1String, int param1Int1, int param1Int2) {
      // Byte code:
      //   0: iload_2
      //   1: iload_1
      //   2: isub
      //   3: iconst_2
      //   4: if_icmpge -> 9
      //   7: iconst_m1
      //   8: ireturn
      //   9: aload_0
      //   10: iload_1
      //   11: invokevirtual charAt : (I)C
      //   14: istore #4
      //   16: iload #4
      //   18: bipush #97
      //   20: if_icmplt -> 32
      //   23: iload_1
      //   24: istore_3
      //   25: iload #4
      //   27: bipush #122
      //   29: if_icmple -> 50
      //   32: iload #4
      //   34: bipush #65
      //   36: if_icmplt -> 153
      //   39: iload_1
      //   40: istore_3
      //   41: iload #4
      //   43: bipush #90
      //   45: if_icmple -> 50
      //   48: iconst_m1
      //   49: ireturn
      //   50: iload_3
      //   51: iconst_1
      //   52: iadd
      //   53: istore_1
      //   54: iload_1
      //   55: iload_2
      //   56: if_icmpge -> 153
      //   59: aload_0
      //   60: iload_1
      //   61: invokevirtual charAt : (I)C
      //   64: istore #4
      //   66: iload #4
      //   68: bipush #97
      //   70: if_icmplt -> 82
      //   73: iload_1
      //   74: istore_3
      //   75: iload #4
      //   77: bipush #122
      //   79: if_icmple -> 50
      //   82: iload #4
      //   84: bipush #65
      //   86: if_icmplt -> 98
      //   89: iload_1
      //   90: istore_3
      //   91: iload #4
      //   93: bipush #90
      //   95: if_icmple -> 50
      //   98: iload #4
      //   100: bipush #48
      //   102: if_icmplt -> 114
      //   105: iload_1
      //   106: istore_3
      //   107: iload #4
      //   109: bipush #57
      //   111: if_icmple -> 50
      //   114: iload_1
      //   115: istore_3
      //   116: iload #4
      //   118: bipush #43
      //   120: if_icmpeq -> 50
      //   123: iload_1
      //   124: istore_3
      //   125: iload #4
      //   127: bipush #45
      //   129: if_icmpeq -> 50
      //   132: iload #4
      //   134: bipush #46
      //   136: if_icmpne -> 144
      //   139: iload_1
      //   140: istore_3
      //   141: goto -> 50
      //   144: iload #4
      //   146: bipush #58
      //   148: if_icmpne -> 153
      //   151: iload_1
      //   152: ireturn
      //   153: iconst_m1
      //   154: ireturn
    }
    
    private static int slashCount(String param1String, int param1Int1, int param1Int2) {
      int i = 0;
      while (param1Int1 < param1Int2) {
        char c = param1String.charAt(param1Int1);
        if (c == '\\' || c == '/') {
          i++;
          param1Int1++;
        } 
      } 
      return i;
    }
    
    public Builder addEncodedPathSegment(String param1String) {
      if (param1String != null) {
        push(param1String, 0, param1String.length(), false, true);
        return this;
      } 
      throw new NullPointerException("encodedPathSegment == null");
    }
    
    public Builder addEncodedPathSegments(String param1String) {
      if (param1String != null)
        return addPathSegments(param1String, true); 
      throw new NullPointerException("encodedPathSegments == null");
    }
    
    public Builder addEncodedQueryParameter(String param1String1, String param1String2) {
      if (param1String1 != null) {
        if (this.encodedQueryNamesAndValues == null)
          this.encodedQueryNamesAndValues = new ArrayList<String>(); 
        this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(param1String1, " \"'<>#&=", true, false, true, true));
        List<String> list = this.encodedQueryNamesAndValues;
        if (param1String2 != null) {
          param1String1 = HttpUrl.canonicalize(param1String2, " \"'<>#&=", true, false, true, true);
        } else {
          param1String1 = null;
        } 
        list.add(param1String1);
        return this;
      } 
      throw new NullPointerException("encodedName == null");
    }
    
    public Builder addPathSegment(String param1String) {
      if (param1String != null) {
        push(param1String, 0, param1String.length(), false, false);
        return this;
      } 
      throw new NullPointerException("pathSegment == null");
    }
    
    public Builder addPathSegments(String param1String) {
      if (param1String != null)
        return addPathSegments(param1String, false); 
      throw new NullPointerException("pathSegments == null");
    }
    
    public Builder addQueryParameter(String param1String1, String param1String2) {
      if (param1String1 != null) {
        if (this.encodedQueryNamesAndValues == null)
          this.encodedQueryNamesAndValues = new ArrayList<String>(); 
        this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(param1String1, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
        List<String> list = this.encodedQueryNamesAndValues;
        if (param1String2 != null) {
          param1String1 = HttpUrl.canonicalize(param1String2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
        } else {
          param1String1 = null;
        } 
        list.add(param1String1);
        return this;
      } 
      throw new NullPointerException("name == null");
    }
    
    public HttpUrl build() {
      if (this.scheme != null) {
        if (this.host != null)
          return new HttpUrl(this); 
        throw new IllegalStateException("host == null");
      } 
      throw new IllegalStateException("scheme == null");
    }
    
    int effectivePort() {
      int i = this.port;
      return (i != -1) ? i : HttpUrl.defaultPort(this.scheme);
    }
    
    public Builder encodedFragment(String param1String) {
      if (param1String != null) {
        param1String = HttpUrl.canonicalize(param1String, "", true, false, false, false);
      } else {
        param1String = null;
      } 
      this.encodedFragment = param1String;
      return this;
    }
    
    public Builder encodedPassword(String param1String) {
      if (param1String != null) {
        this.encodedPassword = HttpUrl.canonicalize(param1String, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
        return this;
      } 
      throw new NullPointerException("encodedPassword == null");
    }
    
    public Builder encodedPath(String param1String) {
      if (param1String != null) {
        if (param1String.startsWith("/")) {
          resolvePath(param1String, 0, param1String.length());
          return this;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected encodedPath: ");
        stringBuilder.append(param1String);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("encodedPath == null");
    }
    
    public Builder encodedQuery(String param1String) {
      if (param1String != null) {
        List<String> list = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(param1String, " \"'<>#", true, false, true, true));
      } else {
        param1String = null;
      } 
      this.encodedQueryNamesAndValues = (List<String>)param1String;
      return this;
    }
    
    public Builder encodedUsername(String param1String) {
      if (param1String != null) {
        this.encodedUsername = HttpUrl.canonicalize(param1String, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
        return this;
      } 
      throw new NullPointerException("encodedUsername == null");
    }
    
    public Builder fragment(String param1String) {
      if (param1String != null) {
        param1String = HttpUrl.canonicalize(param1String, "", false, false, false, false);
      } else {
        param1String = null;
      } 
      this.encodedFragment = param1String;
      return this;
    }
    
    public Builder host(String param1String) {
      if (param1String != null) {
        String str = canonicalizeHost(param1String, 0, param1String.length());
        if (str != null) {
          this.host = str;
          return this;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected host: ");
        stringBuilder.append(param1String);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("host == null");
    }
    
    Builder parse(HttpUrl param1HttpUrl, String param1String) {
      // Byte code:
      //   0: aload_2
      //   1: iconst_0
      //   2: aload_2
      //   3: invokevirtual length : ()I
      //   6: invokestatic skipLeadingAsciiWhitespace : (Ljava/lang/String;II)I
      //   9: istore_3
      //   10: aload_2
      //   11: iload_3
      //   12: aload_2
      //   13: invokevirtual length : ()I
      //   16: invokestatic skipTrailingAsciiWhitespace : (Ljava/lang/String;II)I
      //   19: istore #8
      //   21: aload_2
      //   22: iload_3
      //   23: iload #8
      //   25: invokestatic schemeDelimiterOffset : (Ljava/lang/String;II)I
      //   28: istore #4
      //   30: iload #4
      //   32: iconst_m1
      //   33: if_icmpeq -> 142
      //   36: aload_2
      //   37: iconst_1
      //   38: iload_3
      //   39: ldc_w 'https:'
      //   42: iconst_0
      //   43: bipush #6
      //   45: invokevirtual regionMatches : (ZILjava/lang/String;II)Z
      //   48: ifeq -> 66
      //   51: aload_0
      //   52: ldc_w 'https'
      //   55: putfield scheme : Ljava/lang/String;
      //   58: iload_3
      //   59: bipush #6
      //   61: iadd
      //   62: istore_3
      //   63: goto -> 154
      //   66: aload_2
      //   67: iconst_1
      //   68: iload_3
      //   69: ldc_w 'http:'
      //   72: iconst_0
      //   73: iconst_5
      //   74: invokevirtual regionMatches : (ZILjava/lang/String;II)Z
      //   77: ifeq -> 94
      //   80: aload_0
      //   81: ldc_w 'http'
      //   84: putfield scheme : Ljava/lang/String;
      //   87: iload_3
      //   88: iconst_5
      //   89: iadd
      //   90: istore_3
      //   91: goto -> 154
      //   94: new java/lang/StringBuilder
      //   97: dup
      //   98: invokespecial <init> : ()V
      //   101: astore_1
      //   102: aload_1
      //   103: ldc_w 'Expected URL scheme 'http' or 'https' but was ''
      //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   109: pop
      //   110: aload_1
      //   111: aload_2
      //   112: iconst_0
      //   113: iload #4
      //   115: invokevirtual substring : (II)Ljava/lang/String;
      //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   121: pop
      //   122: aload_1
      //   123: ldc_w '''
      //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   129: pop
      //   130: new java/lang/IllegalArgumentException
      //   133: dup
      //   134: aload_1
      //   135: invokevirtual toString : ()Ljava/lang/String;
      //   138: invokespecial <init> : (Ljava/lang/String;)V
      //   141: athrow
      //   142: aload_1
      //   143: ifnull -> 854
      //   146: aload_0
      //   147: aload_1
      //   148: getfield scheme : Ljava/lang/String;
      //   151: putfield scheme : Ljava/lang/String;
      //   154: aload_2
      //   155: iload_3
      //   156: iload #8
      //   158: invokestatic slashCount : (Ljava/lang/String;II)I
      //   161: istore #4
      //   163: iload #4
      //   165: iconst_2
      //   166: if_icmpge -> 279
      //   169: aload_1
      //   170: ifnull -> 279
      //   173: aload_1
      //   174: getfield scheme : Ljava/lang/String;
      //   177: aload_0
      //   178: getfield scheme : Ljava/lang/String;
      //   181: invokevirtual equals : (Ljava/lang/Object;)Z
      //   184: ifne -> 190
      //   187: goto -> 279
      //   190: aload_0
      //   191: aload_1
      //   192: invokevirtual encodedUsername : ()Ljava/lang/String;
      //   195: putfield encodedUsername : Ljava/lang/String;
      //   198: aload_0
      //   199: aload_1
      //   200: invokevirtual encodedPassword : ()Ljava/lang/String;
      //   203: putfield encodedPassword : Ljava/lang/String;
      //   206: aload_0
      //   207: aload_1
      //   208: getfield host : Ljava/lang/String;
      //   211: putfield host : Ljava/lang/String;
      //   214: aload_0
      //   215: aload_1
      //   216: getfield port : I
      //   219: putfield port : I
      //   222: aload_0
      //   223: getfield encodedPathSegments : Ljava/util/List;
      //   226: invokeinterface clear : ()V
      //   231: aload_0
      //   232: getfield encodedPathSegments : Ljava/util/List;
      //   235: aload_1
      //   236: invokevirtual encodedPathSegments : ()Ljava/util/List;
      //   239: invokeinterface addAll : (Ljava/util/Collection;)Z
      //   244: pop
      //   245: iload_3
      //   246: iload #8
      //   248: if_icmpeq -> 264
      //   251: iload_3
      //   252: istore #4
      //   254: aload_2
      //   255: iload_3
      //   256: invokevirtual charAt : (I)C
      //   259: bipush #35
      //   261: if_icmpne -> 689
      //   264: aload_0
      //   265: aload_1
      //   266: invokevirtual encodedQuery : ()Ljava/lang/String;
      //   269: invokevirtual encodedQuery : (Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;
      //   272: pop
      //   273: iload_3
      //   274: istore #4
      //   276: goto -> 689
      //   279: iload_3
      //   280: iload #4
      //   282: iadd
      //   283: istore #6
      //   285: iconst_0
      //   286: istore_3
      //   287: iconst_0
      //   288: istore #4
      //   290: aload_2
      //   291: iload #6
      //   293: iload #8
      //   295: ldc_w '@/\?#'
      //   298: invokestatic delimiterOffset : (Ljava/lang/String;IILjava/lang/String;)I
      //   301: istore #5
      //   303: iload #5
      //   305: iload #8
      //   307: if_icmpeq -> 321
      //   310: aload_2
      //   311: iload #5
      //   313: invokevirtual charAt : (I)C
      //   316: istore #7
      //   318: goto -> 324
      //   321: iconst_m1
      //   322: istore #7
      //   324: iload #7
      //   326: iconst_m1
      //   327: if_icmpeq -> 553
      //   330: iload #7
      //   332: bipush #35
      //   334: if_icmpeq -> 553
      //   337: iload #7
      //   339: bipush #47
      //   341: if_icmpeq -> 553
      //   344: iload #7
      //   346: bipush #92
      //   348: if_icmpeq -> 553
      //   351: iload #7
      //   353: bipush #63
      //   355: if_icmpeq -> 553
      //   358: iload #7
      //   360: bipush #64
      //   362: if_icmpeq -> 368
      //   365: goto -> 550
      //   368: iload_3
      //   369: ifne -> 491
      //   372: aload_2
      //   373: iload #6
      //   375: iload #5
      //   377: bipush #58
      //   379: invokestatic delimiterOffset : (Ljava/lang/String;IIC)I
      //   382: istore #9
      //   384: iload #5
      //   386: istore #7
      //   388: aload_2
      //   389: iload #6
      //   391: iload #9
      //   393: ldc ' "':;<=>@[]^`{}|/\?#'
      //   395: iconst_1
      //   396: iconst_0
      //   397: iconst_0
      //   398: iconst_1
      //   399: aconst_null
      //   400: invokestatic canonicalize : (Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
      //   403: astore #10
      //   405: aload #10
      //   407: astore_1
      //   408: iload #4
      //   410: ifeq -> 450
      //   413: new java/lang/StringBuilder
      //   416: dup
      //   417: invokespecial <init> : ()V
      //   420: astore_1
      //   421: aload_1
      //   422: aload_0
      //   423: getfield encodedUsername : Ljava/lang/String;
      //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   429: pop
      //   430: aload_1
      //   431: ldc_w '%40'
      //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   437: pop
      //   438: aload_1
      //   439: aload #10
      //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   444: pop
      //   445: aload_1
      //   446: invokevirtual toString : ()Ljava/lang/String;
      //   449: astore_1
      //   450: aload_0
      //   451: aload_1
      //   452: putfield encodedUsername : Ljava/lang/String;
      //   455: iload #9
      //   457: iload #7
      //   459: if_icmpeq -> 485
      //   462: aload_0
      //   463: aload_2
      //   464: iload #9
      //   466: iconst_1
      //   467: iadd
      //   468: iload #7
      //   470: ldc ' "':;<=>@[]^`{}|/\?#'
      //   472: iconst_1
      //   473: iconst_0
      //   474: iconst_0
      //   475: iconst_1
      //   476: aconst_null
      //   477: invokestatic canonicalize : (Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
      //   480: putfield encodedPassword : Ljava/lang/String;
      //   483: iconst_1
      //   484: istore_3
      //   485: iconst_1
      //   486: istore #4
      //   488: goto -> 544
      //   491: new java/lang/StringBuilder
      //   494: dup
      //   495: invokespecial <init> : ()V
      //   498: astore_1
      //   499: aload_1
      //   500: aload_0
      //   501: getfield encodedPassword : Ljava/lang/String;
      //   504: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   507: pop
      //   508: aload_1
      //   509: ldc_w '%40'
      //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   515: pop
      //   516: aload_1
      //   517: aload_2
      //   518: iload #6
      //   520: iload #5
      //   522: ldc ' "':;<=>@[]^`{}|/\?#'
      //   524: iconst_1
      //   525: iconst_0
      //   526: iconst_0
      //   527: iconst_1
      //   528: aconst_null
      //   529: invokestatic canonicalize : (Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
      //   532: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   535: pop
      //   536: aload_0
      //   537: aload_1
      //   538: invokevirtual toString : ()Ljava/lang/String;
      //   541: putfield encodedPassword : Ljava/lang/String;
      //   544: iload #5
      //   546: iconst_1
      //   547: iadd
      //   548: istore #6
      //   550: goto -> 290
      //   553: aload_2
      //   554: iload #6
      //   556: iload #5
      //   558: invokestatic portColonOffset : (Ljava/lang/String;II)I
      //   561: istore_3
      //   562: iload_3
      //   563: iconst_1
      //   564: iadd
      //   565: istore #4
      //   567: iload #4
      //   569: iload #5
      //   571: if_icmpge -> 656
      //   574: aload_0
      //   575: aload_2
      //   576: iload #6
      //   578: iload_3
      //   579: invokestatic canonicalizeHost : (Ljava/lang/String;II)Ljava/lang/String;
      //   582: putfield host : Ljava/lang/String;
      //   585: aload_0
      //   586: aload_2
      //   587: iload #4
      //   589: iload #5
      //   591: invokestatic parsePort : (Ljava/lang/String;II)I
      //   594: putfield port : I
      //   597: aload_0
      //   598: getfield port : I
      //   601: iconst_m1
      //   602: if_icmpeq -> 608
      //   605: goto -> 678
      //   608: new java/lang/StringBuilder
      //   611: dup
      //   612: invokespecial <init> : ()V
      //   615: astore_1
      //   616: aload_1
      //   617: ldc_w 'Invalid URL port: "'
      //   620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   623: pop
      //   624: aload_1
      //   625: aload_2
      //   626: iload #4
      //   628: iload #5
      //   630: invokevirtual substring : (II)Ljava/lang/String;
      //   633: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   636: pop
      //   637: aload_1
      //   638: bipush #34
      //   640: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   643: pop
      //   644: new java/lang/IllegalArgumentException
      //   647: dup
      //   648: aload_1
      //   649: invokevirtual toString : ()Ljava/lang/String;
      //   652: invokespecial <init> : (Ljava/lang/String;)V
      //   655: athrow
      //   656: aload_0
      //   657: aload_2
      //   658: iload #6
      //   660: iload_3
      //   661: invokestatic canonicalizeHost : (Ljava/lang/String;II)Ljava/lang/String;
      //   664: putfield host : Ljava/lang/String;
      //   667: aload_0
      //   668: aload_0
      //   669: getfield scheme : Ljava/lang/String;
      //   672: invokestatic defaultPort : (Ljava/lang/String;)I
      //   675: putfield port : I
      //   678: aload_0
      //   679: getfield host : Ljava/lang/String;
      //   682: ifnull -> 807
      //   685: iload #5
      //   687: istore #4
      //   689: aload_2
      //   690: iload #4
      //   692: iload #8
      //   694: ldc_w '?#'
      //   697: invokestatic delimiterOffset : (Ljava/lang/String;IILjava/lang/String;)I
      //   700: istore #5
      //   702: aload_0
      //   703: aload_2
      //   704: iload #4
      //   706: iload #5
      //   708: invokespecial resolvePath : (Ljava/lang/String;II)V
      //   711: iload #5
      //   713: istore_3
      //   714: iload #5
      //   716: iload #8
      //   718: if_icmpge -> 769
      //   721: iload #5
      //   723: istore_3
      //   724: aload_2
      //   725: iload #5
      //   727: invokevirtual charAt : (I)C
      //   730: bipush #63
      //   732: if_icmpne -> 769
      //   735: aload_2
      //   736: iload #5
      //   738: iload #8
      //   740: bipush #35
      //   742: invokestatic delimiterOffset : (Ljava/lang/String;IIC)I
      //   745: istore_3
      //   746: aload_0
      //   747: aload_2
      //   748: iload #5
      //   750: iconst_1
      //   751: iadd
      //   752: iload_3
      //   753: ldc ' "'<>#'
      //   755: iconst_1
      //   756: iconst_0
      //   757: iconst_1
      //   758: iconst_1
      //   759: aconst_null
      //   760: invokestatic canonicalize : (Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
      //   763: invokestatic queryStringToNamesAndValues : (Ljava/lang/String;)Ljava/util/List;
      //   766: putfield encodedQueryNamesAndValues : Ljava/util/List;
      //   769: iload_3
      //   770: iload #8
      //   772: if_icmpge -> 805
      //   775: aload_2
      //   776: iload_3
      //   777: invokevirtual charAt : (I)C
      //   780: bipush #35
      //   782: if_icmpne -> 805
      //   785: aload_0
      //   786: aload_2
      //   787: iconst_1
      //   788: iload_3
      //   789: iadd
      //   790: iload #8
      //   792: ldc ''
      //   794: iconst_1
      //   795: iconst_0
      //   796: iconst_0
      //   797: iconst_0
      //   798: aconst_null
      //   799: invokestatic canonicalize : (Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
      //   802: putfield encodedFragment : Ljava/lang/String;
      //   805: aload_0
      //   806: areturn
      //   807: new java/lang/StringBuilder
      //   810: dup
      //   811: invokespecial <init> : ()V
      //   814: astore_1
      //   815: aload_1
      //   816: ldc_w 'Invalid URL host: "'
      //   819: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   822: pop
      //   823: aload_1
      //   824: aload_2
      //   825: iload #6
      //   827: iload_3
      //   828: invokevirtual substring : (II)Ljava/lang/String;
      //   831: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   834: pop
      //   835: aload_1
      //   836: bipush #34
      //   838: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   841: pop
      //   842: new java/lang/IllegalArgumentException
      //   845: dup
      //   846: aload_1
      //   847: invokevirtual toString : ()Ljava/lang/String;
      //   850: invokespecial <init> : (Ljava/lang/String;)V
      //   853: athrow
      //   854: new java/lang/IllegalArgumentException
      //   857: dup
      //   858: ldc_w 'Expected URL scheme 'http' or 'https' but no colon was found'
      //   861: invokespecial <init> : (Ljava/lang/String;)V
      //   864: astore_1
      //   865: goto -> 870
      //   868: aload_1
      //   869: athrow
      //   870: goto -> 868
    }
    
    public Builder password(String param1String) {
      if (param1String != null) {
        this.encodedPassword = HttpUrl.canonicalize(param1String, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return this;
      } 
      throw new NullPointerException("password == null");
    }
    
    public Builder port(int param1Int) {
      if (param1Int > 0 && param1Int <= 65535) {
        this.port = param1Int;
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unexpected port: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public Builder query(String param1String) {
      if (param1String != null) {
        List<String> list = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(param1String, " \"'<>#", false, false, true, true));
      } else {
        param1String = null;
      } 
      this.encodedQueryNamesAndValues = (List<String>)param1String;
      return this;
    }
    
    Builder reencodeForUri() {
      int j = this.encodedPathSegments.size();
      boolean bool = false;
      int i;
      for (i = 0; i < j; i++) {
        String str1 = this.encodedPathSegments.get(i);
        this.encodedPathSegments.set(i, HttpUrl.canonicalize(str1, "[]", true, true, false, true));
      } 
      List<String> list = this.encodedQueryNamesAndValues;
      if (list != null) {
        j = list.size();
        for (i = bool; i < j; i++) {
          String str1 = this.encodedQueryNamesAndValues.get(i);
          if (str1 != null)
            this.encodedQueryNamesAndValues.set(i, HttpUrl.canonicalize(str1, "\\^`{|}", true, true, true, true)); 
        } 
      } 
      String str = this.encodedFragment;
      if (str != null)
        this.encodedFragment = HttpUrl.canonicalize(str, " \"#<>\\^`{|}", true, true, false, false); 
      return this;
    }
    
    public Builder removeAllEncodedQueryParameters(String param1String) {
      if (param1String != null) {
        if (this.encodedQueryNamesAndValues == null)
          return this; 
        removeAllCanonicalQueryParameters(HttpUrl.canonicalize(param1String, " \"'<>#&=", true, false, true, true));
        return this;
      } 
      throw new NullPointerException("encodedName == null");
    }
    
    public Builder removeAllQueryParameters(String param1String) {
      if (param1String != null) {
        if (this.encodedQueryNamesAndValues == null)
          return this; 
        removeAllCanonicalQueryParameters(HttpUrl.canonicalize(param1String, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
        return this;
      } 
      throw new NullPointerException("name == null");
    }
    
    public Builder removePathSegment(int param1Int) {
      this.encodedPathSegments.remove(param1Int);
      if (this.encodedPathSegments.isEmpty())
        this.encodedPathSegments.add(""); 
      return this;
    }
    
    public Builder scheme(String param1String) {
      if (param1String != null) {
        String str = "http";
        if (param1String.equalsIgnoreCase("http")) {
          param1String = str;
          this.scheme = param1String;
          return this;
        } 
        str = "https";
        if (param1String.equalsIgnoreCase("https")) {
          param1String = str;
          this.scheme = param1String;
          return this;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected scheme: ");
        stringBuilder.append(param1String);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      NullPointerException nullPointerException = new NullPointerException("scheme == null");
      throw nullPointerException;
    }
    
    public Builder setEncodedPathSegment(int param1Int, String param1String) {
      if (param1String != null) {
        String str = HttpUrl.canonicalize(param1String, 0, param1String.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
        this.encodedPathSegments.set(param1Int, str);
        if (!isDot(str) && !isDotDot(str))
          return this; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected path segment: ");
        stringBuilder.append(param1String);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("encodedPathSegment == null");
    }
    
    public Builder setEncodedQueryParameter(String param1String1, String param1String2) {
      removeAllEncodedQueryParameters(param1String1);
      addEncodedQueryParameter(param1String1, param1String2);
      return this;
    }
    
    public Builder setPathSegment(int param1Int, String param1String) {
      if (param1String != null) {
        String str = HttpUrl.canonicalize(param1String, 0, param1String.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
        if (!isDot(str) && !isDotDot(str)) {
          this.encodedPathSegments.set(param1Int, str);
          return this;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected path segment: ");
        stringBuilder.append(param1String);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("pathSegment == null");
    }
    
    public Builder setQueryParameter(String param1String1, String param1String2) {
      removeAllQueryParameters(param1String1);
      addQueryParameter(param1String1, param1String2);
      return this;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      String str = this.scheme;
      if (str != null) {
        stringBuilder.append(str);
        str = "://";
      } else {
        str = "//";
      } 
      stringBuilder.append(str);
      if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
        stringBuilder.append(this.encodedUsername);
        if (!this.encodedPassword.isEmpty()) {
          stringBuilder.append(':');
          stringBuilder.append(this.encodedPassword);
        } 
        stringBuilder.append('@');
      } 
      str = this.host;
      if (str != null)
        if (str.indexOf(':') != -1) {
          stringBuilder.append('[');
          stringBuilder.append(this.host);
          stringBuilder.append(']');
        } else {
          stringBuilder.append(this.host);
        }  
      if (this.port != -1 || this.scheme != null) {
        int i = effectivePort();
        str = this.scheme;
        if (str == null || i != HttpUrl.defaultPort(str)) {
          stringBuilder.append(':');
          stringBuilder.append(i);
        } 
      } 
      HttpUrl.pathSegmentsToString(stringBuilder, this.encodedPathSegments);
      if (this.encodedQueryNamesAndValues != null) {
        stringBuilder.append('?');
        HttpUrl.namesAndValuesToQueryString(stringBuilder, this.encodedQueryNamesAndValues);
      } 
      if (this.encodedFragment != null) {
        stringBuilder.append('#');
        stringBuilder.append(this.encodedFragment);
      } 
      return stringBuilder.toString();
    }
    
    public Builder username(String param1String) {
      if (param1String != null) {
        this.encodedUsername = HttpUrl.canonicalize(param1String, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return this;
      } 
      throw new NullPointerException("username == null");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/HttpUrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */