package e.f.a.e.i.n;

final class w5 {
  static String a(z1 paramz1) {
    z5 z5 = new z5(paramz1);
    StringBuilder stringBuilder = new StringBuilder(z5.zza());
    for (int i = 0; i < z5.zza(); i++) {
      byte b = z5.f(i);
      if (b != 34) {
        if (b != 39) {
          if (b != 92) {
            String str;
            int j;
            switch (b) {
              default:
                if (b < 32 || b > 126) {
                  stringBuilder.append('\\');
                  stringBuilder.append((char)((b >>> 6 & 0x3) + 48));
                  stringBuilder.append((char)((b >>> 3 & 0x7) + 48));
                  j = (b & 0x7) + 48;
                } 
                stringBuilder.append((char)j);
                break;
              case 13:
                str = "\\r";
                stringBuilder.append(str);
              case 12:
                str = "\\f";
                stringBuilder.append(str);
              case 11:
                str = "\\v";
                stringBuilder.append(str);
              case 10:
                str = "\\n";
                stringBuilder.append(str);
              case 9:
                str = "\\t";
                stringBuilder.append(str);
              case 8:
                str = "\\b";
                stringBuilder.append(str);
              case 7:
                str = "\\a";
                stringBuilder.append(str);
            } 
          } else {
            String str = "\\\\";
            stringBuilder.append(str);
          } 
        } else {
          String str = "\\'";
          stringBuilder.append(str);
        } 
      } else {
        String str = "\\\"";
        stringBuilder.append(str);
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/w5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */