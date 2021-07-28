package e.d.c.t;

import e.d.b.r;
import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    return j(567);
  }
  
  public String b() {
    return j(326);
  }
  
  public String c() {
    return j(574);
  }
  
  public String c(int paramInt) {
    return (paramInt != 276) ? ((paramInt != 326) ? ((paramInt != 336) ? ((paramInt != 537) ? ((paramInt != 542) ? ((paramInt != 547) ? ((paramInt != 559) ? ((paramInt != 567) ? ((paramInt != 572) ? ((paramInt != 549) ? ((paramInt != 550) ? ((paramInt != 574) ? ((paramInt != 575) ? super.c(paramInt) : d()) : c()) : f()) : e()) : l()) : a()) : i()) : k()) : j()) : h()) : m()) : b()) : g();
  }
  
  public String d() {
    return k(575);
  }
  
  public String e() {
    return j(549);
  }
  
  public String f() {
    return k(550);
  }
  
  public String g() {
    Integer integer = ((b)this.a).k(276);
    if (integer == null)
      return null; 
    switch (integer.intValue()) {
      default:
        return String.format("Unknown (%d)", new Object[] { integer });
      case 29:
        return "Corel Draw [.CDR]";
      case 28:
        return "Ritzaus Bureau NITF version (RBNITF DTD)";
      case 27:
        return "Tidningarnas Telegrambyra NITF version (TTNITF DTD)";
      case 26:
        return "Tape Archive [.TAR]";
      case 25:
        return "News Industry Text Format (NITF)";
      case 24:
        return "Portable Document File [.PDF] Adobe";
      case 23:
        return "MPEG 2 Audio Layer 3, ISO/IEC";
      case 22:
        return "MPEG 2 Audio Layer 2 (Musicom), ISO/IEC";
      case 21:
        return "Hypertext Markup Language [.HTML] (The Internet Society)";
      case 20:
        return "Freehand (Macromedia/Aldus)";
      case 19:
        return "RIFF Wave (Microsoft Corporation)";
      case 18:
        return "Audio Interchange File Format AIFF (Apple Computer Inc)";
      case 17:
        return "Compressed Binary File [.ZIP] (PKWare Inc)";
      case 16:
        return "PC DOS/Windows Executable Files [.COM][.EXE]";
      case 15:
        return "Audio plus Moving Video [.AVI] (Microsoft)";
      case 14:
        return "Digital Audio File [.WAV] (Microsoft & Creative Labs)";
      case 13:
        return "Bit Mapped Graphics File [.BMP] (Microsoft)";
      case 12:
        return "Photo-CD Image-Pac (Eastman Kodak)";
      case 11:
        return "JPEG File Interchange (JFIF)";
      case 10:
        return "United Press International Down-Load Message";
      case 9:
        return "United Press International ANPA 1312 variant";
      case 8:
        return "IPTC Unstructured Character Oriented File Format (UCOFF)";
      case 7:
        return "MacBinary II";
      case 6:
        return "NAA 89-3 (ANPA 1312)";
      case 5:
        return "AppleSingle (Apple Computer Inc)";
      case 4:
        return "Illustrator (Adobe Graphics data)";
      case 3:
        return "Tagged Image File Format (Adobe/Aldus Image data)";
      case 2:
        return "IPTC7901 Recommended Message Format";
      case 1:
        return "IPTC-NAA Digital Newsphoto Parameter Record";
      case 0:
        break;
    } 
    return "No ObjectData";
  }
  
  public String h() {
    String[] arrayOfString = ((b)this.a).q(537);
    return (arrayOfString == null) ? null : r.a((CharSequence[])arrayOfString, ";");
  }
  
  public String i() {
    return j(559);
  }
  
  public String j() {
    return j(542);
  }
  
  public String j(int paramInt) {
    String str2 = ((b)this.a).p(paramInt);
    if (str2 == null)
      return null; 
    String str1 = str2;
    if (str2.length() == 8) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2.substring(0, 4));
      stringBuilder.append(':');
      stringBuilder.append(str2.substring(4, 6));
      stringBuilder.append(':');
      stringBuilder.append(str2.substring(6));
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  public String k() {
    return k(547);
  }
  
  public String k(int paramInt) {
    String str = ((b)this.a).p(paramInt);
    if (str == null)
      return null; 
    if (str.length() == 6 || str.length() == 11) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str.substring(0, 2));
      stringBuilder.append(':');
      stringBuilder.append(str.substring(2, 4));
      stringBuilder.append(':');
      stringBuilder.append(str.substring(4));
      return stringBuilder.toString();
    } 
    return str;
  }
  
  public String l() {
    return k(572);
  }
  
  public String m() {
    return k(336);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/t/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */