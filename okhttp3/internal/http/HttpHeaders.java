package okhttp3.internal.http;

import j.c;
import j.f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;

public final class HttpHeaders {
  private static final f QUOTED_STRING_DELIMITERS = f.d("\"\\");
  
  private static final f TOKEN_DELIMITERS = f.d("\t ,=");
  
  public static long contentLength(Headers paramHeaders) {
    return stringToLong(paramHeaders.get("Content-Length"));
  }
  
  public static long contentLength(Response paramResponse) {
    return contentLength(paramResponse.headers());
  }
  
  public static boolean hasBody(Response paramResponse) {
    if (paramResponse.request().method().equals("HEAD"))
      return false; 
    int i = paramResponse.code();
    return ((i < 100 || i >= 200) && i != 204 && i != 304) ? true : ((contentLength(paramResponse) == -1L) ? ("chunked".equalsIgnoreCase(paramResponse.header("Transfer-Encoding"))) : true);
  }
  
  public static boolean hasVaryAll(Headers paramHeaders) {
    return varyFields(paramHeaders).contains("*");
  }
  
  public static boolean hasVaryAll(Response paramResponse) {
    return hasVaryAll(paramResponse.headers());
  }
  
  private static void parseChallengeHeader(List<Challenge> paramList, c paramc) {
    label51: while (true) {
      String str = null;
      while (true) {
        String str2 = str;
        if (str == null) {
          skipWhitespaceAndCommas(paramc);
          str = readToken(paramc);
          str2 = str;
          if (str == null)
            return; 
        } 
        boolean bool1 = skipWhitespaceAndCommas(paramc);
        String str1 = readToken(paramc);
        if (str1 == null) {
          if (!paramc.j())
            return; 
          paramList.add(new Challenge(str2, Collections.emptyMap()));
          return;
        } 
        int i = skipAll(paramc, (byte)61);
        boolean bool2 = skipWhitespaceAndCommas(paramc);
        if (!bool1 && (bool2 || paramc.j())) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str1);
          stringBuilder.append(repeat('=', i));
          paramList.add(new Challenge(str2, Collections.singletonMap(null, stringBuilder.toString())));
          continue label51;
        } 
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        i += skipAll(paramc, (byte)61);
        while (true) {
          str = str1;
          str1 = null;
        } 
        break;
      } 
      break;
    } 
  }
  
  public static List<Challenge> parseChallenges(Headers paramHeaders, String paramString) {
    ArrayList<Challenge> arrayList = new ArrayList();
    for (int i = 0; i < paramHeaders.size(); i++) {
      if (paramString.equalsIgnoreCase(paramHeaders.name(i))) {
        c c = new c();
        c.a(paramHeaders.value(i));
        parseChallengeHeader(arrayList, c);
      } 
    } 
    return arrayList;
  }
  
  public static int parseSeconds(String paramString, int paramInt) {
    try {
      long l = Long.parseLong(paramString);
      return (l > 2147483647L) ? Integer.MAX_VALUE : ((l < 0L) ? 0 : (int)l);
    } catch (NumberFormatException numberFormatException) {
      return paramInt;
    } 
  }
  
  private static String readQuotedString(c paramc) {
    if (paramc.readByte() == 34) {
      c c1 = new c();
      while (true) {
        long l = paramc.b(QUOTED_STRING_DELIMITERS);
        if (l == -1L)
          return null; 
        if (paramc.a(l) == 34) {
          c1.write(paramc, l);
          paramc.readByte();
          return c1.d();
        } 
        if (paramc.s() == l + 1L)
          return null; 
        c1.write(paramc, l);
        paramc.readByte();
        c1.write(paramc, 1L);
      } 
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  private static String readToken(c paramc) {
    try {
      long l2 = paramc.b(TOKEN_DELIMITERS);
      long l1 = l2;
      if (l2 == -1L)
        l1 = paramc.s(); 
      return (l1 != 0L) ? paramc.b(l1) : null;
    } catch (EOFException eOFException) {
      throw new AssertionError();
    } 
  }
  
  public static void receiveHeaders(CookieJar paramCookieJar, HttpUrl paramHttpUrl, Headers paramHeaders) {
    if (paramCookieJar == CookieJar.NO_COOKIES)
      return; 
    List list = Cookie.parseAll(paramHttpUrl, paramHeaders);
    if (list.isEmpty())
      return; 
    paramCookieJar.saveFromResponse(paramHttpUrl, list);
  }
  
  private static String repeat(char paramChar, int paramInt) {
    char[] arrayOfChar = new char[paramInt];
    Arrays.fill(arrayOfChar, paramChar);
    return new String(arrayOfChar);
  }
  
  private static int skipAll(c paramc, byte paramByte) {
    int i = 0;
    while (!paramc.j() && paramc.a(0L) == paramByte) {
      i++;
      paramc.readByte();
    } 
    return i;
  }
  
  public static int skipUntil(String paramString1, int paramInt, String paramString2) {
    while (paramInt < paramString1.length()) {
      if (paramString2.indexOf(paramString1.charAt(paramInt)) != -1)
        return paramInt; 
      paramInt++;
    } 
    return paramInt;
  }
  
  public static int skipWhitespace(String paramString, int paramInt) {
    while (paramInt < paramString.length()) {
      char c = paramString.charAt(paramInt);
      if (c != ' ' && c != '\t')
        return paramInt; 
      paramInt++;
    } 
    return paramInt;
  }
  
  private static boolean skipWhitespaceAndCommas(c paramc) {
    boolean bool = false;
    while (!paramc.j()) {
      byte b = paramc.a(0L);
      if (b == 44) {
        paramc.readByte();
        bool = true;
        continue;
      } 
      if (b == 32 || b == 9)
        paramc.readByte(); 
    } 
    return bool;
  }
  
  private static long stringToLong(String paramString) {
    if (paramString == null)
      return -1L; 
    try {
      return Long.parseLong(paramString);
    } catch (NumberFormatException numberFormatException) {
      return -1L;
    } 
  }
  
  public static Set<String> varyFields(Headers paramHeaders) {
    Set<?> set = Collections.emptySet();
    int j = paramHeaders.size();
    for (int i = 0; i < j; i++) {
      if ("Vary".equalsIgnoreCase(paramHeaders.name(i))) {
        String str = paramHeaders.value(i);
        Set<?> set1 = set;
        if (set.isEmpty())
          set1 = new TreeSet(String.CASE_INSENSITIVE_ORDER); 
        String[] arrayOfString = str.split(",");
        int m = arrayOfString.length;
        int k = 0;
        while (true) {
          set = set1;
          if (k < m) {
            set1.add(arrayOfString[k].trim());
            k++;
            continue;
          } 
          break;
        } 
      } 
    } 
    return (Set)set;
  }
  
  private static Set<String> varyFields(Response paramResponse) {
    return varyFields(paramResponse.headers());
  }
  
  public static Headers varyHeaders(Headers paramHeaders1, Headers paramHeaders2) {
    Set<String> set = varyFields(paramHeaders2);
    if (set.isEmpty())
      return (new Headers.Builder()).build(); 
    Headers.Builder builder = new Headers.Builder();
    int i = 0;
    int j = paramHeaders1.size();
    while (i < j) {
      String str = paramHeaders1.name(i);
      if (set.contains(str))
        builder.add(str, paramHeaders1.value(i)); 
      i++;
    } 
    return builder.build();
  }
  
  public static Headers varyHeaders(Response paramResponse) {
    return varyHeaders(paramResponse.networkResponse().request().headers(), paramResponse.headers());
  }
  
  public static boolean varyMatches(Response paramResponse, Headers paramHeaders, Request paramRequest) {
    for (String str : varyFields(paramResponse)) {
      if (!Util.equal(paramHeaders.values(str), paramRequest.headers(str)))
        return false; 
    } 
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/HttpHeaders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */