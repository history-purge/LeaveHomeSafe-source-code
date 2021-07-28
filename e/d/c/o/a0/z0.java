package e.d.c.o.a0;

import e.d.c.b;
import java.util.HashMap;

public class z0 extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(255), "Makernote Offset");
    e.put(Integer.valueOf(256), "Sanyo Thumbnail");
    e.put(Integer.valueOf(512), "Special Mode");
    e.put(Integer.valueOf(513), "Sanyo Quality");
    e.put(Integer.valueOf(514), "Macro");
    e.put(Integer.valueOf(516), "Digital Zoom");
    e.put(Integer.valueOf(519), "Software Version");
    e.put(Integer.valueOf(520), "Pict Info");
    e.put(Integer.valueOf(521), "Camera ID");
    e.put(Integer.valueOf(526), "Sequential Shot");
    e.put(Integer.valueOf(527), "Wide Range");
    e.put(Integer.valueOf(528), "Color Adjustment Node");
    e.put(Integer.valueOf(531), "Quick Shot");
    e.put(Integer.valueOf(532), "Self Timer");
    e.put(Integer.valueOf(534), "Voice Memo");
    e.put(Integer.valueOf(535), "Record Shutter Release");
    e.put(Integer.valueOf(536), "Flicker Reduce");
    e.put(Integer.valueOf(537), "Optical Zoom On");
    e.put(Integer.valueOf(539), "Digital Zoom On");
    e.put(Integer.valueOf(541), "Light Source Special");
    e.put(Integer.valueOf(542), "Resaved");
    e.put(Integer.valueOf(543), "Scene Select");
    e.put(Integer.valueOf(547), "Manual Focus Distance or Face Info");
    e.put(Integer.valueOf(548), "Sequence Shot Interval");
    e.put(Integer.valueOf(549), "Flash Mode");
    e.put(Integer.valueOf(3584), "Print IM");
    e.put(Integer.valueOf(3840), "Data Dump");
  }
  
  public z0() {
    a(new y0(this));
  }
  
  public String a() {
    return "Sanyo Makernote";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */