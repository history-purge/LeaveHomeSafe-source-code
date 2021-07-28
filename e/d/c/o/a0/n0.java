package e.d.c.o.a0;

import e.d.b.b;
import e.d.c.a;
import e.d.c.b;
import e.d.c.d;
import java.io.IOException;
import java.util.HashMap;

public class n0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(1), "Quality Mode");
    e.put(Integer.valueOf(2), "Version");
    e.put(Integer.valueOf(3), "White Balance");
    e.put(Integer.valueOf(7), "Focus Mode");
    e.put(Integer.valueOf(15), "AF Area Mode");
    e.put(Integer.valueOf(26), "Image Stabilization");
    e.put(Integer.valueOf(28), "Macro Mode");
    e.put(Integer.valueOf(31), "Record Mode");
    e.put(Integer.valueOf(32), "Audio");
    e.put(Integer.valueOf(37), "Internal Serial Number");
    e.put(Integer.valueOf(33), "Unknown Data Dump");
    e.put(Integer.valueOf(34), "Easy Mode");
    e.put(Integer.valueOf(35), "White Balance Bias");
    e.put(Integer.valueOf(36), "Flash Bias");
    e.put(Integer.valueOf(38), "Exif Version");
    e.put(Integer.valueOf(40), "Color Effect");
    e.put(Integer.valueOf(41), "Camera Uptime");
    e.put(Integer.valueOf(42), "Burst Mode");
    e.put(Integer.valueOf(43), "Sequence Number");
    e.put(Integer.valueOf(44), "Contrast Mode");
    e.put(Integer.valueOf(45), "Noise Reduction");
    e.put(Integer.valueOf(46), "Self Timer");
    e.put(Integer.valueOf(48), "Rotation");
    e.put(Integer.valueOf(49), "AF Assist Lamp");
    e.put(Integer.valueOf(50), "Color Mode");
    e.put(Integer.valueOf(51), "Baby Age");
    e.put(Integer.valueOf(52), "Optical Zoom Mode");
    e.put(Integer.valueOf(53), "Conversion Lens");
    e.put(Integer.valueOf(54), "Travel Day");
    e.put(Integer.valueOf(57), "Contrast");
    e.put(Integer.valueOf(58), "World Time Location");
    e.put(Integer.valueOf(59), "Text Stamp");
    e.put(Integer.valueOf(60), "Program ISO");
    e.put(Integer.valueOf(61), "Advanced Scene Mode");
    e.put(Integer.valueOf(3584), "Print Image Matching (PIM) Info");
    e.put(Integer.valueOf(63), "Number of Detected Faces");
    e.put(Integer.valueOf(64), "Saturation");
    e.put(Integer.valueOf(65), "Sharpness");
    e.put(Integer.valueOf(66), "Film Mode");
    e.put(Integer.valueOf(68), "Color Temp Kelvin");
    e.put(Integer.valueOf(69), "Bracket Settings");
    e.put(Integer.valueOf(70), "White Balance Adjust (AB)");
    e.put(Integer.valueOf(71), "White Balance Adjust (GM)");
    e.put(Integer.valueOf(72), "Flash Curtain");
    e.put(Integer.valueOf(73), "Long Exposure Noise Reduction");
    e.put(Integer.valueOf(75), "Panasonic Image Width");
    e.put(Integer.valueOf(76), "Panasonic Image Height");
    e.put(Integer.valueOf(77), "Af Point Position");
    e.put(Integer.valueOf(78), "Face Detection Info");
    e.put(Integer.valueOf(81), "Lens Type");
    e.put(Integer.valueOf(82), "Lens Serial Number");
    e.put(Integer.valueOf(83), "Accessory Type");
    e.put(Integer.valueOf(84), "Accessory Serial Number");
    e.put(Integer.valueOf(89), "Transform");
    e.put(Integer.valueOf(93), "Intelligent Exposure");
    e.put(Integer.valueOf(96), "Lens Firmware Version");
    e.put(Integer.valueOf(97), "Face Recognition Info");
    e.put(Integer.valueOf(98), "Flash Warning");
    e.put(Integer.valueOf(99), "Recognized Face Flags");
    e.put(Integer.valueOf(101), "Title");
    e.put(Integer.valueOf(102), "Baby Name");
    e.put(Integer.valueOf(103), "Location");
    e.put(Integer.valueOf(105), "Country");
    e.put(Integer.valueOf(107), "State");
    e.put(Integer.valueOf(109), "City");
    e.put(Integer.valueOf(111), "Landmark");
    e.put(Integer.valueOf(112), "Intelligent Resolution");
    e.put(Integer.valueOf(119), "Burst Speed");
    e.put(Integer.valueOf(121), "Intelligent D-Range");
    e.put(Integer.valueOf(124), "Clear Retouch");
    e.put(Integer.valueOf(128), "City 2");
    e.put(Integer.valueOf(137), "Photo Style");
    e.put(Integer.valueOf(138), "Shading Compensation");
    e.put(Integer.valueOf(140), "Accelerometer Z");
    e.put(Integer.valueOf(141), "Accelerometer X");
    e.put(Integer.valueOf(142), "Accelerometer Y");
    e.put(Integer.valueOf(143), "Camera Orientation");
    e.put(Integer.valueOf(144), "Roll Angle");
    e.put(Integer.valueOf(145), "Pitch Angle");
    e.put(Integer.valueOf(147), "Sweep Panorama Direction");
    e.put(Integer.valueOf(148), "Sweep Panorama Field Of View");
    e.put(Integer.valueOf(150), "Timer Recording");
    e.put(Integer.valueOf(157), "Internal ND Filter");
    e.put(Integer.valueOf(158), "HDR");
    e.put(Integer.valueOf(159), "Shutter Type");
    e.put(Integer.valueOf(163), "Clear Retouch Value");
    e.put(Integer.valueOf(171), "Touch AE");
    e.put(Integer.valueOf(32768), "Makernote Version");
    e.put(Integer.valueOf(32769), "Scene Mode");
    e.put(Integer.valueOf(32772), "White Balance (Red)");
    e.put(Integer.valueOf(32773), "White Balance (Green)");
    e.put(Integer.valueOf(32774), "White Balance (Blue)");
    e.put(Integer.valueOf(32775), "Flash Fired");
    e.put(Integer.valueOf(62), "Text Stamp 1");
    e.put(Integer.valueOf(32776), "Text Stamp 2");
    e.put(Integer.valueOf(32777), "Text Stamp 3");
    e.put(Integer.valueOf(32784), "Baby Age 1");
    e.put(Integer.valueOf(32786), "Transform 1");
  }
  
  public n0() {
    a(new m0(this));
  }
  
  public String a() {
    return "Panasonic Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
  
  public d[] f() {
    byte[] arrayOfByte = d(78);
    if (arrayOfByte == null)
      return null; 
    b b1 = new b(arrayOfByte);
    int i = 0;
    b1.a(false);
    try {
      int j = b1.k(0);
      if (j == 0)
        return null; 
      d[] arrayOfD = new d[j];
      while (i < j) {
        int k = i * 8 + 2;
        arrayOfD[i] = new d(b1.k(k), b1.k(k + 2), b1.k(k + 4), b1.k(k + 6), null, null);
        i++;
      } 
      return arrayOfD;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public d[] g() {
    byte[] arrayOfByte = d(97);
    if (arrayOfByte == null)
      return null; 
    b b1 = new b(arrayOfByte);
    int i = 0;
    b1.a(false);
    try {
      int j = b1.k(0);
      if (j == 0)
        return null; 
      d[] arrayOfD = new d[j];
      while (i < j) {
        int k = i * 44 + 4;
        String str1 = b1.a(k, 20, "ASCII").trim();
        String str2 = b1.a(k + 28, 20, "ASCII").trim();
        arrayOfD[i] = new d(b1.k(k + 20), b1.k(k + 22), b1.k(k + 24), b1.k(k + 26), str1, a.a(str2));
        i++;
      } 
      return arrayOfD;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public a v(int paramInt) {
    String str = p(paramInt);
    return (str == null) ? null : a.a(str);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */