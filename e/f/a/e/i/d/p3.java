package e.f.a.e.i.d;

final class p3 {
  static String a(a0 parama0) {
    q3 q3 = new q3(parama0);
    StringBuilder stringBuilder = new StringBuilder(q3.size());
    for (int i = 0; i < q3.size(); i++) {
      byte b = q3.a(i);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/p3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */