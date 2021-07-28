package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType {
  private static final Pattern PARAMETER;
  
  private static final String QUOTED = "\"([^\"]*)\"";
  
  private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
  
  private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
  
  private final String charset;
  
  private final String mediaType;
  
  private final String subtype;
  
  private final String type;
  
  static {
    PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
  }
  
  private MediaType(String paramString1, String paramString2, String paramString3, String paramString4) {
    this.mediaType = paramString1;
    this.type = paramString2;
    this.subtype = paramString3;
    this.charset = paramString4;
  }
  
  public static MediaType get(String paramString) {
    Matcher matcher = TYPE_SUBTYPE.matcher(paramString);
    if (matcher.lookingAt()) {
      String str1;
      String str2 = matcher.group(1).toLowerCase(Locale.US);
      String str3 = matcher.group(2).toLowerCase(Locale.US);
      Matcher matcher1 = null;
      Matcher matcher2 = PARAMETER.matcher(paramString);
      int i = matcher.end();
      while (i < paramString.length()) {
        matcher2.region(i, paramString.length());
        if (matcher2.lookingAt()) {
          String str4;
          String str5 = matcher2.group(1);
          matcher = matcher1;
          if (str5 != null)
            if (!str5.equalsIgnoreCase("charset")) {
              matcher = matcher1;
            } else {
              str5 = matcher2.group(2);
              if (str5 != null) {
                str4 = str5;
                if (str5.startsWith("'")) {
                  str4 = str5;
                  if (str5.endsWith("'")) {
                    str4 = str5;
                    if (str5.length() > 2)
                      str4 = str5.substring(1, str5.length() - 1); 
                  } 
                } 
              } else {
                str4 = matcher2.group(3);
              } 
              if (matcher1 != null && !str4.equalsIgnoreCase((String)matcher1)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Multiple charsets defined: \"");
                stringBuilder2.append((String)matcher1);
                stringBuilder2.append("\" and: \"");
                stringBuilder2.append(str4);
                stringBuilder2.append("\" for: \"");
                stringBuilder2.append(paramString);
                stringBuilder2.append('"');
                throw new IllegalArgumentException(stringBuilder2.toString());
              } 
            }  
          i = matcher2.end();
          str1 = str4;
          continue;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Parameter is not formatted correctly: \"");
        stringBuilder1.append(paramString.substring(i));
        stringBuilder1.append("\" for: \"");
        stringBuilder1.append(paramString);
        stringBuilder1.append('"');
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      return new MediaType(paramString, str2, str3, str1);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No subtype found for: \"");
    stringBuilder.append(paramString);
    stringBuilder.append('"');
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public static MediaType parse(String paramString) {
    try {
      return get(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      return null;
    } 
  }
  
  public Charset charset() {
    return charset(null);
  }
  
  public Charset charset(Charset paramCharset) {
    Charset charset = paramCharset;
    try {
      if (this.charset != null)
        charset = Charset.forName(this.charset); 
      return charset;
    } catch (IllegalArgumentException illegalArgumentException) {
      return paramCharset;
    } 
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof MediaType && ((MediaType)paramObject).mediaType.equals(this.mediaType));
  }
  
  public int hashCode() {
    return this.mediaType.hashCode();
  }
  
  public String subtype() {
    return this.subtype;
  }
  
  public String toString() {
    return this.mediaType;
  }
  
  public String type() {
    return this.type;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/MediaType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */