package e.a.a.j;

import java.io.PushbackReader;
import java.io.Reader;

public class b extends PushbackReader {
  private int c = 0;
  
  private int d = 0;
  
  private int e = 0;
  
  public b(Reader paramReader) {
    super(paramReader, 8);
  }
  
  private char a(char paramChar) {
    int i = this.c;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 5)
                return paramChar; 
              this.c = 0;
              return paramChar;
            } 
            if ('0' <= paramChar && paramChar <= '9') {
              this.d = this.d * 10 + Character.digit(paramChar, 10);
              this.e++;
              if (this.e <= 5) {
                this.c = 4;
                return paramChar;
              } 
            } else if (paramChar == ';' && h.a((char)this.d)) {
              this.c = 0;
              return (char)this.d;
            } 
            this.c = 5;
            return paramChar;
          } 
          if (('0' <= paramChar && paramChar <= '9') || ('a' <= paramChar && paramChar <= 'f') || ('A' <= paramChar && paramChar <= 'F')) {
            this.d = this.d * 16 + Character.digit(paramChar, 16);
            this.e++;
            if (this.e <= 4) {
              this.c = 3;
              return paramChar;
            } 
            this.c = 5;
            return paramChar;
          } 
          if (paramChar == ';' && h.a((char)this.d)) {
            this.c = 0;
            return (char)this.d;
          } 
          this.c = 5;
          return paramChar;
        } 
        if (paramChar == 'x') {
          this.d = 0;
          this.e = 0;
          this.c = 3;
          return paramChar;
        } 
        if ('0' <= paramChar && paramChar <= '9') {
          this.d = Character.digit(paramChar, 10);
          this.e = 1;
          this.c = 4;
          return paramChar;
        } 
        this.c = 5;
        return paramChar;
      } 
      if (paramChar == '#') {
        this.c = 2;
        return paramChar;
      } 
      this.c = 5;
      return paramChar;
    } 
    if (paramChar == '&')
      this.c = 1; 
    return paramChar;
  }
  
  public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int k;
    char[] arrayOfChar = new char[8];
    int j = paramInt1;
    paramInt1 = 1;
    int i = 0;
    label34: while (true) {
      int m = 0;
      k = paramInt1;
      while (k != 0 && i < paramInt2) {
        if (super.read(arrayOfChar, m, 1) == 1) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        } 
        if (paramInt1 != 0) {
          char c = a(arrayOfChar[m]);
          int i1 = this.c;
          if (i1 == 0) {
            char c1 = c;
            if (h.a(c))
              c1 = ' '; 
            paramArrayOfchar[j] = c1;
            i++;
            j++;
            continue label34;
          } 
          int n = m + 1;
          m = n;
          k = paramInt1;
          if (i1 == 5) {
            unread(arrayOfChar, 0, n);
            continue label34;
          } 
          continue;
        } 
        k = paramInt1;
        if (m > 0) {
          unread(arrayOfChar, 0, m);
          this.c = 5;
          paramInt1 = 1;
        } 
      } 
      break;
    } 
    paramInt1 = i;
    if (i <= 0) {
      if (k != 0)
        return i; 
      paramInt1 = -1;
    } 
    return paramInt1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */