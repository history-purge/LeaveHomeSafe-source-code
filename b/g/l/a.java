package b.g.l;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {
  static final d d = e.c;
  
  private static final String e = Character.toString('‎');
  
  private static final String f = Character.toString('‏');
  
  static final a g = new a(false, 2, d);
  
  static final a h = new a(true, 2, d);
  
  private final boolean a;
  
  private final int b;
  
  private final d c;
  
  a(boolean paramBoolean, int paramInt, d paramd) {
    this.a = paramBoolean;
    this.b = paramInt;
    this.c = paramd;
  }
  
  private String a(CharSequence paramCharSequence, d paramd) {
    boolean bool = paramd.a(paramCharSequence, 0, paramCharSequence.length());
    return (!this.a && (bool || c(paramCharSequence) == 1)) ? e : ((this.a && (!bool || c(paramCharSequence) == -1)) ? f : "");
  }
  
  static boolean a(Locale paramLocale) {
    return (f.b(paramLocale) == 1);
  }
  
  private static int b(CharSequence paramCharSequence) {
    return (new b(paramCharSequence, false)).c();
  }
  
  public static a b() {
    return (new a()).a();
  }
  
  private String b(CharSequence paramCharSequence, d paramd) {
    boolean bool = paramd.a(paramCharSequence, 0, paramCharSequence.length());
    return (!this.a && (bool || b(paramCharSequence) == 1)) ? e : ((this.a && (!bool || b(paramCharSequence) == -1)) ? f : "");
  }
  
  private static int c(CharSequence paramCharSequence) {
    return (new b(paramCharSequence, false)).d();
  }
  
  public CharSequence a(CharSequence paramCharSequence) {
    return a(paramCharSequence, this.c, true);
  }
  
  public CharSequence a(CharSequence paramCharSequence, d paramd, boolean paramBoolean) {
    if (paramCharSequence == null)
      return null; 
    boolean bool = paramd.a(paramCharSequence, 0, paramCharSequence.length());
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
    if (a() && paramBoolean) {
      if (bool) {
        paramd = e.b;
      } else {
        paramd = e.a;
      } 
      spannableStringBuilder.append(b(paramCharSequence, paramd));
    } 
    if (bool != this.a) {
      char c;
      if (bool) {
        c = '‫';
      } else {
        c = '‪';
      } 
      spannableStringBuilder.append(c);
      spannableStringBuilder.append(paramCharSequence);
      spannableStringBuilder.append('‬');
    } else {
      spannableStringBuilder.append(paramCharSequence);
    } 
    if (paramBoolean) {
      if (bool) {
        paramd = e.b;
      } else {
        paramd = e.a;
      } 
      spannableStringBuilder.append(a(paramCharSequence, paramd));
    } 
    return (CharSequence)spannableStringBuilder;
  }
  
  public boolean a() {
    return ((this.b & 0x2) != 0);
  }
  
  public static final class a {
    private boolean a;
    
    private int b;
    
    private d c;
    
    public a() {
      b(a.a(Locale.getDefault()));
    }
    
    private static a a(boolean param1Boolean) {
      return param1Boolean ? a.h : a.g;
    }
    
    private void b(boolean param1Boolean) {
      this.a = param1Boolean;
      this.c = a.d;
      this.b = 2;
    }
    
    public a a() {
      return (this.b == 2 && this.c == a.d) ? a(this.a) : new a(this.a, this.b, this.c);
    }
  }
  
  private static class b {
    private static final byte[] f = new byte[1792];
    
    private final CharSequence a;
    
    private final boolean b;
    
    private final int c;
    
    private int d;
    
    private char e;
    
    static {
      for (int i = 0; i < 1792; i++)
        f[i] = Character.getDirectionality(i); 
    }
    
    b(CharSequence param1CharSequence, boolean param1Boolean) {
      this.a = param1CharSequence;
      this.b = param1Boolean;
      this.c = param1CharSequence.length();
    }
    
    private static byte a(char param1Char) {
      return (param1Char < '܀') ? f[param1Char] : Character.getDirectionality(param1Char);
    }
    
    private byte e() {
      int i = this.d;
      while (true) {
        int j = this.d;
        if (j > 0) {
          CharSequence charSequence = this.a;
          this.d = --j;
          this.e = charSequence.charAt(j);
          j = this.e;
          if (j == 38)
            return 12; 
          if (j == 59)
            break; 
          continue;
        } 
        break;
      } 
      this.d = i;
      this.e = ';';
      return 13;
    }
    
    private byte f() {
      while (true) {
        int i = this.d;
        if (i < this.c) {
          CharSequence charSequence = this.a;
          this.d = i + 1;
          char c = charSequence.charAt(i);
          this.e = c;
          if (c != ';')
            continue; 
        } 
        break;
      } 
      return 12;
    }
    
    private byte g() {
      int i = this.d;
      label21: while (true) {
        int j = this.d;
        if (j > 0) {
          CharSequence charSequence = this.a;
          this.d = --j;
          this.e = charSequence.charAt(j);
          j = this.e;
          if (j == 60)
            return 12; 
          if (j == 62)
            break; 
          if (j == 34 || j == 39) {
            j = this.e;
            while (true) {
              int k = this.d;
              if (k > 0) {
                charSequence = this.a;
                this.d = --k;
                char c = charSequence.charAt(k);
                this.e = c;
                if (c != j)
                  continue; 
                continue label21;
              } 
              continue label21;
            } 
          } 
          continue;
        } 
        break;
      } 
      this.d = i;
      this.e = '>';
      return 13;
    }
    
    private byte h() {
      int i = this.d;
      label19: while (true) {
        int j = this.d;
        if (j < this.c) {
          CharSequence charSequence = this.a;
          this.d = j + 1;
          this.e = charSequence.charAt(j);
          j = this.e;
          if (j == 62)
            return 12; 
          if (j == 34 || j == 39) {
            j = this.e;
            while (true) {
              int k = this.d;
              if (k < this.c) {
                charSequence = this.a;
                this.d = k + 1;
                char c = charSequence.charAt(k);
                this.e = c;
                if (c != j)
                  continue; 
                continue label19;
              } 
              continue label19;
            } 
            break;
          } 
          continue;
        } 
        this.d = i;
        this.e = '<';
        return 13;
      } 
    }
    
    byte a() {
      this.e = this.a.charAt(this.d - 1);
      if (Character.isLowSurrogate(this.e)) {
        int i = Character.codePointBefore(this.a, this.d);
        this.d -= Character.charCount(i);
        return Character.getDirectionality(i);
      } 
      this.d--;
      byte b2 = a(this.e);
      byte b1 = b2;
      if (this.b) {
        char c = this.e;
        if (c == '>')
          return g(); 
        b1 = b2;
        if (c == ';')
          b1 = e(); 
      } 
      return b1;
    }
    
    byte b() {
      this.e = this.a.charAt(this.d);
      if (Character.isHighSurrogate(this.e)) {
        int i = Character.codePointAt(this.a, this.d);
        this.d += Character.charCount(i);
        return Character.getDirectionality(i);
      } 
      this.d++;
      byte b2 = a(this.e);
      byte b1 = b2;
      if (this.b) {
        char c = this.e;
        if (c == '<')
          return h(); 
        b1 = b2;
        if (c == '&')
          b1 = f(); 
      } 
      return b1;
    }
    
    int c() {
      this.d = 0;
      int j = 0;
      byte b1 = 0;
      int i = 0;
      while (this.d < this.c && !j) {
        byte b2 = b();
        if (b2 != 0) {
          if (b2 != 1 && b2 != 2) {
            if (b2 != 9) {
              switch (b2) {
                case 18:
                  i--;
                  b1 = 0;
                  continue;
                case 16:
                case 17:
                  i++;
                  b1 = 1;
                  continue;
                case 14:
                case 15:
                  i++;
                  b1 = -1;
                  continue;
              } 
            } else {
              continue;
            } 
          } else if (i == 0) {
            return 1;
          } 
        } else if (i == 0) {
          return -1;
        } 
        j = i;
      } 
      if (j == 0)
        return 0; 
      if (b1 != 0)
        return b1; 
      while (this.d > 0) {
        switch (a()) {
          default:
            continue;
          case 18:
            i++;
            continue;
          case 16:
          case 17:
            if (j == i)
              return 1; 
            break;
          case 14:
          case 15:
            if (j == i)
              return -1; 
            break;
        } 
        i--;
      } 
      return 0;
    }
    
    int d() {
      this.d = this.c;
      int j = 0;
      int i = 0;
      while (this.d > 0) {
        byte b1 = a();
        if (b1 != 0) {
          if (b1 != 1 && b1 != 2) {
            if (b1 != 9) {
              switch (b1) {
                default:
                  if (!j)
                    break; 
                  continue;
                case 18:
                  i++;
                  continue;
                case 16:
                case 17:
                  if (j == i)
                    return 1; 
                  i--;
                  continue;
                case 14:
                case 15:
                  if (j == i)
                    return -1; 
                  i--;
                  continue;
              } 
            } else {
              continue;
            } 
            continue;
          } 
          if (i == 0)
            return 1; 
          if (j == 0)
            continue; 
          continue;
        } 
        if (i == 0)
          return -1; 
        if (j == 0)
          continue; 
        continue;
        j = i;
      } 
      return 0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */