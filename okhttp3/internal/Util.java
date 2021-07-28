package okhttp3.internal;

import j.c;
import j.e;
import j.f;
import j.t;
import j.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;

public final class Util {
  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  
  public static final RequestBody EMPTY_REQUEST;
  
  public static final ResponseBody EMPTY_RESPONSE;
  
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  
  public static final Charset ISO_8859_1;
  
  public static final Comparator<String> NATURAL_ORDER;
  
  public static final TimeZone UTC;
  
  private static final Charset UTF_16_BE;
  
  private static final f UTF_16_BE_BOM;
  
  private static final Charset UTF_16_LE;
  
  private static final f UTF_16_LE_BOM;
  
  private static final Charset UTF_32_BE;
  
  private static final f UTF_32_BE_BOM;
  
  private static final Charset UTF_32_LE;
  
  private static final f UTF_32_LE_BOM;
  
  public static final Charset UTF_8;
  
  private static final f UTF_8_BOM;
  
  private static final Pattern VERIFY_AS_IP_ADDRESS;
  
  private static final Method addSuppressedExceptionMethod;
  
  static {
    byte[] arrayOfByte = EMPTY_BYTE_ARRAY;
    Method method = null;
    EMPTY_RESPONSE = ResponseBody.create(null, arrayOfByte);
    EMPTY_REQUEST = RequestBody.create(null, EMPTY_BYTE_ARRAY);
    UTF_8_BOM = f.b("efbbbf");
    UTF_16_BE_BOM = f.b("feff");
    UTF_16_LE_BOM = f.b("fffe");
    UTF_32_BE_BOM = f.b("0000ffff");
    UTF_32_LE_BOM = f.b("ffff0000");
    UTF_8 = Charset.forName("UTF-8");
    ISO_8859_1 = Charset.forName("ISO-8859-1");
    UTF_16_BE = Charset.forName("UTF-16BE");
    UTF_16_LE = Charset.forName("UTF-16LE");
    UTF_32_BE = Charset.forName("UTF-32BE");
    UTF_32_LE = Charset.forName("UTF-32LE");
    UTC = TimeZone.getTimeZone("GMT");
    NATURAL_ORDER = new Comparator<String>() {
        public int compare(String param1String1, String param1String2) {
          return param1String1.compareTo(param1String2);
        }
      };
    try {
      Method method1 = Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class });
      method = method1;
    } catch (Exception exception) {}
    addSuppressedExceptionMethod = method;
    VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  }
  
  public static void addSuppressedIfPossible(Throwable paramThrowable1, Throwable paramThrowable2) {
    Method method = addSuppressedExceptionMethod;
    if (method != null)
      try {
        method.invoke(paramThrowable1, new Object[] { paramThrowable2 });
        return;
      } catch (InvocationTargetException|IllegalAccessException invocationTargetException) {
        return;
      }  
  }
  
  public static AssertionError assertionError(String paramString, Exception paramException) {
    AssertionError assertionError = new AssertionError(paramString);
    try {
      assertionError.initCause(paramException);
      return assertionError;
    } catch (IllegalStateException illegalStateException) {
      return assertionError;
    } 
  }
  
  public static Charset bomAwareCharset(e parame, Charset paramCharset) {
    if (parame.a(0L, UTF_8_BOM)) {
      parame.skip(UTF_8_BOM.s());
      return UTF_8;
    } 
    if (parame.a(0L, UTF_16_BE_BOM)) {
      parame.skip(UTF_16_BE_BOM.s());
      return UTF_16_BE;
    } 
    if (parame.a(0L, UTF_16_LE_BOM)) {
      parame.skip(UTF_16_LE_BOM.s());
      return UTF_16_LE;
    } 
    if (parame.a(0L, UTF_32_BE_BOM)) {
      parame.skip(UTF_32_BE_BOM.s());
      return UTF_32_BE;
    } 
    if (parame.a(0L, UTF_32_LE_BOM)) {
      parame.skip(UTF_32_LE_BOM.s());
      return UTF_32_LE;
    } 
    return paramCharset;
  }
  
  public static String canonicalizeHost(String paramString) {
    if (paramString.contains(":")) {
      InetAddress inetAddress;
      if (paramString.startsWith("[") && paramString.endsWith("]")) {
        inetAddress = decodeIpv6(paramString, 1, paramString.length() - 1);
      } else {
        inetAddress = decodeIpv6(paramString, 0, paramString.length());
      } 
      if (inetAddress == null)
        return null; 
      byte[] arrayOfByte = inetAddress.getAddress();
      if (arrayOfByte.length == 16)
        return inet6AddressToAscii(arrayOfByte); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid IPv6 address: '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new AssertionError(stringBuilder.toString());
    } 
    try {
      paramString = IDN.toASCII(paramString).toLowerCase(Locale.US);
      if (paramString.isEmpty())
        return null; 
      boolean bool = containsInvalidHostnameAsciiCodes(paramString);
      return bool ? null : paramString;
    } catch (IllegalArgumentException illegalArgumentException) {
      return null;
    } 
  }
  
  public static int checkDuration(String paramString, long paramLong, TimeUnit paramTimeUnit) {
    if (paramLong >= 0L) {
      if (paramTimeUnit != null) {
        long l = paramTimeUnit.toMillis(paramLong);
        if (l <= 2147483647L) {
          if (l != 0L || paramLong <= 0L)
            return (int)l; 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append(paramString);
          stringBuilder2.append(" too small.");
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramString);
        stringBuilder1.append(" too large.");
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      throw new NullPointerException("unit == null");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(" < 0");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static void checkOffsetAndCount(long paramLong1, long paramLong2, long paramLong3) {
    if ((paramLong2 | paramLong3) >= 0L && paramLong2 <= paramLong1 && paramLong1 - paramLong2 >= paramLong3)
      return; 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public static void closeQuietly(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {
        return;
      }  
  }
  
  public static void closeQuietly(ServerSocket paramServerSocket) {
    if (paramServerSocket != null)
      try {
        paramServerSocket.close();
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {
        return;
      }  
  }
  
  public static void closeQuietly(Socket paramSocket) {
    if (paramSocket != null)
      try {
        paramSocket.close();
        return;
      } catch (AssertionError assertionError) {
        if (isAndroidGetsocknameError(assertionError))
          return; 
        throw assertionError;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {
        return;
      }  
  }
  
  public static String[] concat(String[] paramArrayOfString, String paramString) {
    String[] arrayOfString = new String[paramArrayOfString.length + 1];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramArrayOfString.length);
    arrayOfString[arrayOfString.length - 1] = paramString;
    return arrayOfString;
  }
  
  private static boolean containsInvalidHostnameAsciiCodes(String paramString) {
    int i = 0;
    while (i < paramString.length()) {
      char c = paramString.charAt(i);
      if (c > '\037') {
        if (c >= '')
          return true; 
        if (" #%/:?@[\\]".indexOf(c) != -1)
          return true; 
        i++;
        continue;
      } 
      return true;
    } 
    return false;
  }
  
  public static int decodeHexDigit(char paramChar) {
    if (paramChar >= '0' && paramChar <= '9')
      return paramChar - 48; 
    byte b = 97;
    if (paramChar < 'a' || paramChar > 'f') {
      b = 65;
      if (paramChar < 'A' || paramChar > 'F')
        return -1; 
    } 
    return paramChar - b + 10;
  }
  
  private static boolean decodeIpv4Suffix(String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    int j = paramInt3;
    int i = paramInt1;
    while (i < paramInt2) {
      if (j == paramArrayOfbyte.length)
        return false; 
      paramInt1 = i;
      if (j != paramInt3) {
        if (paramString.charAt(i) != '.')
          return false; 
        paramInt1 = i + 1;
      } 
      i = paramInt1;
      int k = 0;
      while (i < paramInt2) {
        char c = paramString.charAt(i);
        if (c < '0' || c > '9')
          break; 
        if (!k && paramInt1 != i)
          return false; 
        k = k * 10 + c - 48;
        if (k > 255)
          return false; 
        i++;
      } 
      if (i - paramInt1 == 0)
        return false; 
      paramArrayOfbyte[j] = (byte)k;
      j++;
    } 
    return !(j != paramInt3 + 4);
  }
  
  private static InetAddress decodeIpv6(String paramString, int paramInt1, int paramInt2) {
    int k;
    int n;
    byte[] arrayOfByte = new byte[16];
    int i = 0;
    int j = -1;
    int m = -1;
    while (true) {
      k = i;
      n = j;
      if (paramInt1 < paramInt2) {
        if (i == arrayOfByte.length)
          return null; 
        n = paramInt1 + 2;
        if (n <= paramInt2 && paramString.regionMatches(paramInt1, "::", 0, 2)) {
          if (j != -1)
            return null; 
          k = i + 2;
          paramInt1 = k;
          if (n == paramInt2) {
            n = paramInt1;
            break;
          } 
          m = n;
          i = k;
          j = paramInt1;
          paramInt1 = m;
        } else {
          k = paramInt1;
          if (i != 0)
            if (paramString.regionMatches(paramInt1, ":", 0, 1)) {
              k = paramInt1 + 1;
            } else {
              if (paramString.regionMatches(paramInt1, ".", 0, 1)) {
                if (!decodeIpv4Suffix(paramString, m, paramInt2, arrayOfByte, i - 2))
                  return null; 
                k = i + 2;
                n = j;
                break;
              } 
              return null;
            }  
          paramInt1 = k;
        } 
        k = paramInt1;
        m = 0;
        while (k < paramInt2) {
          n = decodeHexDigit(paramString.charAt(k));
          if (n == -1)
            break; 
          m = (m << 4) + n;
          k++;
        } 
        n = k - paramInt1;
        if (n != 0) {
          if (n > 4)
            return null; 
          n = i + 1;
          arrayOfByte[i] = (byte)(m >>> 8 & 0xFF);
          i = n + 1;
          arrayOfByte[n] = (byte)(m & 0xFF);
          m = paramInt1;
          paramInt1 = k;
          continue;
        } 
        return null;
      } 
      break;
    } 
    if (k != arrayOfByte.length) {
      if (n == -1)
        return null; 
      paramInt1 = arrayOfByte.length;
      paramInt2 = k - n;
      System.arraycopy(arrayOfByte, n, arrayOfByte, paramInt1 - paramInt2, paramInt2);
      Arrays.fill(arrayOfByte, n, arrayOfByte.length - k + n, (byte)0);
    } 
    try {
      return InetAddress.getByAddress(arrayOfByte);
    } catch (UnknownHostException unknownHostException) {
      AssertionError assertionError = new AssertionError();
      throw assertionError;
    } 
  }
  
  public static int delimiterOffset(String paramString, int paramInt1, int paramInt2, char paramChar) {
    while (paramInt1 < paramInt2) {
      if (paramString.charAt(paramInt1) == paramChar)
        return paramInt1; 
      paramInt1++;
    } 
    return paramInt2;
  }
  
  public static int delimiterOffset(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    while (paramInt1 < paramInt2) {
      if (paramString2.indexOf(paramString1.charAt(paramInt1)) != -1)
        return paramInt1; 
      paramInt1++;
    } 
    return paramInt2;
  }
  
  public static boolean discard(t paramt, int paramInt, TimeUnit paramTimeUnit) {
    try {
      return skipAll(paramt, paramInt, paramTimeUnit);
    } catch (IOException iOException) {
      return false;
    } 
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static String format(String paramString, Object... paramVarArgs) {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String hostHeader(HttpUrl paramHttpUrl, boolean paramBoolean) {
    String str;
    if (paramHttpUrl.host().contains(":")) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("[");
      stringBuilder1.append(paramHttpUrl.host());
      stringBuilder1.append("]");
      str = stringBuilder1.toString();
    } else {
      str = paramHttpUrl.host();
    } 
    if (!paramBoolean) {
      String str1 = str;
      if (paramHttpUrl.port() != HttpUrl.defaultPort(paramHttpUrl.scheme())) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(":");
        stringBuilder1.append(paramHttpUrl.port());
        return stringBuilder1.toString();
      } 
      return str1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(":");
    stringBuilder.append(paramHttpUrl.port());
    return stringBuilder.toString();
  }
  
  public static <T> List<T> immutableList(List<T> paramList) {
    return Collections.unmodifiableList(new ArrayList<T>(paramList));
  }
  
  public static <T> List<T> immutableList(T... paramVarArgs) {
    return Collections.unmodifiableList(Arrays.asList((T[])paramVarArgs.clone()));
  }
  
  public static <K, V> Map<K, V> immutableMap(Map<K, V> paramMap) {
    return paramMap.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap<K, V>(paramMap));
  }
  
  public static int indexOf(Comparator<String> paramComparator, String[] paramArrayOfString, String paramString) {
    int j = paramArrayOfString.length;
    for (int i = 0; i < j; i++) {
      if (paramComparator.compare(paramArrayOfString[i], paramString) == 0)
        return i; 
    } 
    return -1;
  }
  
  public static int indexOfControlOrNonAscii(String paramString) {
    int j = paramString.length();
    int i = 0;
    while (i < j) {
      char c = paramString.charAt(i);
      if (c > '\037') {
        if (c >= '')
          return i; 
        i++;
        continue;
      } 
      return i;
    } 
    return -1;
  }
  
  private static String inet6AddressToAscii(byte[] paramArrayOfbyte) {
    boolean bool = false;
    int i = 0;
    int k = -1;
    int j;
    for (j = 0; i < paramArrayOfbyte.length; j = n) {
      int m;
      for (m = i; m < 16 && paramArrayOfbyte[m] == 0 && paramArrayOfbyte[m + 1] == 0; m += 2);
      int i2 = m - i;
      int i1 = k;
      int n = j;
      if (i2 > j) {
        i1 = k;
        n = j;
        if (i2 >= 4) {
          n = i2;
          i1 = i;
        } 
      } 
      i = m + 2;
      k = i1;
    } 
    c c = new c();
    for (i = bool; i < paramArrayOfbyte.length; i += 2) {
      if (i == k) {
        c.writeByte(58);
        int m = i + j;
        i = m;
        if (m == 16) {
          c.writeByte(58);
          i = m;
        } 
        continue;
      } 
      if (i > 0)
        c.writeByte(58); 
      c.h(((paramArrayOfbyte[i] & 0xFF) << 8 | paramArrayOfbyte[i + 1] & 0xFF));
    } 
    return c.d();
  }
  
  public static String[] intersect(Comparator<? super String> paramComparator, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    ArrayList<String> arrayList = new ArrayList();
    int j = paramArrayOfString1.length;
    for (int i = 0; i < j; i++) {
      String str = paramArrayOfString1[i];
      int m = paramArrayOfString2.length;
      int k;
      for (k = 0; k < m; k++) {
        if (paramComparator.compare(str, paramArrayOfString2[k]) == 0) {
          arrayList.add(str);
          break;
        } 
      } 
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  public static boolean isAndroidGetsocknameError(AssertionError paramAssertionError) {
    return (paramAssertionError.getCause() != null && paramAssertionError.getMessage() != null && paramAssertionError.getMessage().contains("getsockname failed"));
  }
  
  public static boolean nonEmptyIntersection(Comparator<String> paramComparator, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    if (paramArrayOfString1 != null && paramArrayOfString2 != null && paramArrayOfString1.length != 0) {
      if (paramArrayOfString2.length == 0)
        return false; 
      int j = paramArrayOfString1.length;
      for (int i = 0; i < j; i++) {
        String str = paramArrayOfString1[i];
        int m = paramArrayOfString2.length;
        int k;
        for (k = 0; k < m; k++) {
          if (paramComparator.compare(str, paramArrayOfString2[k]) == 0)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public static X509TrustManager platformTrustManager() {
    try {
      TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      trustManagerFactory.init((KeyStore)null);
      TrustManager[] arrayOfTrustManager = trustManagerFactory.getTrustManagers();
      if (arrayOfTrustManager.length == 1 && arrayOfTrustManager[0] instanceof X509TrustManager)
        return (X509TrustManager)arrayOfTrustManager[0]; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected default trust managers:");
      stringBuilder.append(Arrays.toString((Object[])arrayOfTrustManager));
      throw new IllegalStateException(stringBuilder.toString());
    } catch (GeneralSecurityException generalSecurityException) {
      throw assertionError("No System TLS", generalSecurityException);
    } 
  }
  
  public static boolean skipAll(t paramt, int paramInt, TimeUnit paramTimeUnit) {
    u u;
    long l1;
    long l2 = System.nanoTime();
    if (paramt.timeout().hasDeadline()) {
      l1 = paramt.timeout().deadlineNanoTime() - l2;
    } else {
      l1 = Long.MAX_VALUE;
    } 
    paramt.timeout().deadlineNanoTime(Math.min(l1, paramTimeUnit.toNanos(paramInt)) + l2);
    try {
      c c = new c();
      while (paramt.read(c, 8192L) != -1L)
        c.a(); 
      u = paramt.timeout();
      return true;
    } catch (InterruptedIOException interruptedIOException) {
      u = u.timeout();
      return false;
    } finally {
      u = u.timeout();
      if (l1 == Long.MAX_VALUE) {
        u.clearDeadline();
      } else {
        u.deadlineNanoTime(l2 + l1);
      } 
    } 
  }
  
  public static int skipLeadingAsciiWhitespace(String paramString, int paramInt1, int paramInt2) {
    while (paramInt1 < paramInt2) {
      char c = paramString.charAt(paramInt1);
      if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ')
        return paramInt1; 
      paramInt1++;
    } 
    return paramInt2;
  }
  
  public static int skipTrailingAsciiWhitespace(String paramString, int paramInt1, int paramInt2) {
    while (--paramInt2 >= paramInt1) {
      char c = paramString.charAt(paramInt2);
      if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ')
        return paramInt2 + 1; 
      paramInt2--;
    } 
    return paramInt1;
  }
  
  public static ThreadFactory threadFactory(final String name, final boolean daemon) {
    return new ThreadFactory() {
        public Thread newThread(Runnable param1Runnable) {
          param1Runnable = new Thread(param1Runnable, name);
          param1Runnable.setDaemon(daemon);
          return (Thread)param1Runnable;
        }
      };
  }
  
  public static Headers toHeaders(List<Header> paramList) {
    Headers.Builder builder = new Headers.Builder();
    for (Header header : paramList)
      Internal.instance.addLenient(builder, header.name.v(), header.value.v()); 
    return builder.build();
  }
  
  public static String trimSubstring(String paramString, int paramInt1, int paramInt2) {
    paramInt1 = skipLeadingAsciiWhitespace(paramString, paramInt1, paramInt2);
    return paramString.substring(paramInt1, skipTrailingAsciiWhitespace(paramString, paramInt1, paramInt2));
  }
  
  public static boolean verifyAsIpAddress(String paramString) {
    return VERIFY_AS_IP_ADDRESS.matcher(paramString).matches();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */