package net.time4j.calendar;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.t.f;
import net.time4j.calendar.t.g;
import net.time4j.d1.g;
import net.time4j.d1.i0;
import net.time4j.d1.k;
import net.time4j.d1.o0;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.t;
import net.time4j.d1.w;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.e1.c;
import net.time4j.e1.h;
import net.time4j.e1.u;
import net.time4j.f0;
import net.time4j.tz.p;
import net.time4j.w0;
import net.time4j.y0;

@c("dangi")
public final class KoreanCalendar extends f<KoreanCalendar.e, KoreanCalendar> implements h {
  private static final int[] i = new int[] { 
      4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 
      4295, 3, 4297, 7, 4300, 6, 4303, 4, 4306, 2, 
      4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 
      4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 
      4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 
      4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 
      4363, 2, 4365, 7, 4368, 5, 4371, 3, 4373, 9, 
      4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 
      4390, 4, 4392, 9, 4395, 6, 4398, 5, 4401, 2, 
      4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 
      4417, 5, 4420, 3, 4422, 7, 4425, 6, 4428, 4, 
      4431, 2, 4433, 6, 4436, 4, 4439, 3, 4441, 6, 
      4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 
      4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 
      4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 
      4485, 4, 4487, 11, 4490, 7, 4493, 5, 4496, 3, 
      4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 
      4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 
      4525, 12, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 
      4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 
      4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 
      4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 
      4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 
      4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 
      4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 
      4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 
      4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 
      4648, 3, 4650, 9, 4653, 5, 4656, 4, 4659, 2, 
      4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 
      4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 
      4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 
      4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 
      4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 
      4729, 6, 4732, 4, 4735, 3, 4737, 7, 4740, 5, 
      4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 
      4756, 7, 4759, 5, 4762, 4, 4764, 9, 4767, 6, 
      4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 
      4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 
      4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 4, 
      4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 
      4824, 7, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 
      4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 
      4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 
      4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 
      4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 8, 
      4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 
      4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 
      4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 
      4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 
      4946, 7, 4949, 6, 4952, 4, 4955, 2, 4957, 7, 
      4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 
      4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 
      4987, 6, 4990, 5, 4993, 2, 4995, 7, 4998, 5, 
      5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 
      5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 
      5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 
      5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 
      5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 
      5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 
      5082, 6, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 
      5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 
      5109, 7, 5112, 5, 5115, 4, 5117, 8, 5120, 6, 
      5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 
      5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 
      5150, 5, 5153, 4, 5156, 2, 5158, 6, 5161, 5, 
      5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 
      5177, 7, 5180, 5, 5183, 3, 5185, 8, 5188, 6, 
      5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 
      5204, 8, 5207, 6, 5210, 4, 5212, 8, 5215, 7, 
      5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 
      5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 
      5245, 5, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 
      5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 
      5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 
      5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 
      5299, 8, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 
      5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 
      5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 
      5340, 6, 5343, 4, 5345, 10, 5348, 7, 5351, 5, 
      5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 
      5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 
      5381, 5, 5384, 1, 5386, 7, 5389, 6, 5392, 4, 
      5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 
      5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 
      5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 
      5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 
      5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 
      5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 
      5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 
      5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 
      5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 
      5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 
      5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 
      5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 
      5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 
      5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 
      5584, 11, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 
      5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 
      5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 
      5625, 6, 5628, 5, 5631, 4, 5633, 9, 5636, 6 };
  
  public static final p<k> j = k.e.a();
  
  public static final p<Integer> k = (p<Integer>)new f("CYCLE", KoreanCalendar.class, 72, 94, false, null, null);
  
  public static final p<Integer> l = k.e.b();
  
  public static final u<c> m = e.c;
  
  public static final p<o> n = (p)i.e();
  
  public static final u<h> o = g.c;
  
  public static final p<Integer, KoreanCalendar> p = (p<Integer, KoreanCalendar>)new f("MONTH_AS_ORDINAL", KoreanCalendar.class, 1, 12, false, null, null);
  
  public static final p<Integer, KoreanCalendar> q = (p<Integer, KoreanCalendar>)new f("DAY_OF_MONTH", KoreanCalendar.class, 1, 30, 'd');
  
  public static final p<Integer, KoreanCalendar> r = (p<Integer, KoreanCalendar>)new f("DAY_OF_YEAR", KoreanCalendar.class, 1, 355, 'D');
  
  public static final p<w0, KoreanCalendar> s = (p<w0, KoreanCalendar>)new g(KoreanCalendar.class, G());
  
  private static final long serialVersionUID = -4284841131270593971L;
  
  private static final q<KoreanCalendar> t = new q<KoreanCalendar>(KoreanCalendar.class, q, s);
  
  private static final d<KoreanCalendar> u = new d(null);
  
  private static final i0<e, KoreanCalendar> v;
  
  static {
    i0.b b = i0.b.a(e.class, KoreanCalendar.class, new c(), u);
    b.a(j, new b(null));
    b.a(k, f.g((p<?>)m));
    b.a(l, new f(null), e.e);
    b.a((p)m, f.j((p<?>)o), e.e);
    b.a(n, i.e());
    b.a((p)o, f.i(q), e.f);
    b.a(p, f.h(q), e.f);
    b.a(q, f.C(), e.h);
    b.a(r, f.D(), e.h);
    b.a(s, new r<g>(G(), new a()), e.h);
    q<KoreanCalendar> q1 = t;
    b.a(q1, q.c(q1));
    b.a(b.a, new n<KoreanCalendar>(u, r));
    b.a(e.d, f.f(0), e.d.b(), Collections.singleton(e.e));
    b.a(e.e, f.f(1), e.e.b(), Collections.singleton(e.d));
    b.a(e.f, f.f(2), e.f.b(), Collections.emptySet());
    b.a(e.g, f.f(3), e.g.b(), Collections.singleton(e.h));
    b.a(e.h, f.f(4), e.h.b(), Collections.singleton(e.g));
    b.a(new b.g((Class)KoreanCalendar.class, q, r, G()));
    v = b.a();
  }
  
  private KoreanCalendar(int paramInt1, int paramInt2, h paramh, int paramInt3, long paramLong) {
    super(paramInt1, paramInt2, paramh, paramInt3, paramLong);
  }
  
  public static y0 G() {
    return y0.a(new Locale("ko", "KR"));
  }
  
  static KoreanCalendar a(int paramInt1, int paramInt2, h paramh, int paramInt3) {
    return new KoreanCalendar(paramInt1, paramInt2, paramh, paramInt3, u.b(paramInt1, paramInt2, paramh, paramInt3));
  }
  
  public static KoreanCalendar a(j paramj, h paramh, int paramInt) {
    return a(paramj.a(), paramj.c().b(), paramh, paramInt);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this);
  }
  
  protected i0<e, KoreanCalendar> s() {
    return v;
  }
  
  protected KoreanCalendar t() {
    return this;
  }
  
  d<KoreanCalendar> v() {
    return u;
  }
  
  private static class SPX implements Externalizable {
    private static final long serialVersionUID = 1L;
    
    private transient Object c;
    
    public SPX() {}
    
    SPX(Object param1Object) {
      this.c = param1Object;
    }
    
    private KoreanCalendar a(ObjectInput param1ObjectInput) {
      byte b1 = param1ObjectInput.readByte();
      byte b2 = param1ObjectInput.readByte();
      byte b3 = param1ObjectInput.readByte();
      boolean bool = param1ObjectInput.readBoolean();
      byte b4 = param1ObjectInput.readByte();
      h h2 = h.f(b3);
      h h1 = h2;
      if (bool)
        h1 = h2.c(); 
      return KoreanCalendar.a(b1, b2, h1, b4);
    }
    
    private void a(ObjectOutput param1ObjectOutput) {
      f f = (f)this.c;
      param1ObjectOutput.writeByte(f.w());
      param1ObjectOutput.writeByte(f.getYear().b());
      param1ObjectOutput.writeByte(f.getMonth().a());
      param1ObjectOutput.writeBoolean(f.getMonth().b());
      param1ObjectOutput.writeByte(f.r());
    }
    
    private Object readResolve() {
      return this.c;
    }
    
    public void readExternal(ObjectInput param1ObjectInput) {
      if (param1ObjectInput.readByte() == 15) {
        this.c = a(param1ObjectInput);
        return;
      } 
      throw new InvalidObjectException("Unknown calendar type.");
    }
    
    public void writeExternal(ObjectOutput param1ObjectOutput) {
      param1ObjectOutput.writeByte(15);
      a(param1ObjectOutput);
    }
  }
  
  static final class a implements t<KoreanCalendar, k<KoreanCalendar>> {
    public k<KoreanCalendar> a(KoreanCalendar param1KoreanCalendar) {
      return KoreanCalendar.E();
    }
  }
  
  private static class b implements z<KoreanCalendar, k> {
    private b() {}
    
    public KoreanCalendar a(KoreanCalendar param1KoreanCalendar, k param1k, boolean param1Boolean) {
      if (a(param1KoreanCalendar, param1k))
        return param1KoreanCalendar; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid Korean era: ");
      stringBuilder.append(param1k);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public p<?> a(KoreanCalendar param1KoreanCalendar) {
      throw new AbstractMethodError("Never called.");
    }
    
    public boolean a(KoreanCalendar param1KoreanCalendar, k param1k) {
      return (param1k == k.e);
    }
    
    public p<?> b(KoreanCalendar param1KoreanCalendar) {
      throw new AbstractMethodError("Never called.");
    }
    
    public k c(KoreanCalendar param1KoreanCalendar) {
      return k.e;
    }
    
    public k d(KoreanCalendar param1KoreanCalendar) {
      return k.e;
    }
    
    public k e(KoreanCalendar param1KoreanCalendar) {
      return k.e;
    }
  }
  
  private static class c extends a<KoreanCalendar> {
    c() {
      super(KoreanCalendar.class);
    }
    
    public KoreanCalendar a(q<?> param1q, net.time4j.d1.d param1d, boolean param1Boolean1, boolean param1Boolean2) {
      j j;
      int i = param1q.a(b.a);
      if (i == Integer.MIN_VALUE) {
        if (param1q.c((p)KoreanCalendar.m) && param1q.c(KoreanCalendar.k)) {
          j = ((c)param1q.e((p)KoreanCalendar.m)).f(param1q.a(KoreanCalendar.k));
        } else {
          i = param1q.a(k.e.b());
          if (i != Integer.MIN_VALUE) {
            j = j.a(i);
          } else {
            param1d = null;
          } 
        } 
      } else {
        j = j.b(i);
      } 
      if (j == null) {
        param1q.b((p)o0.c, "Cannot determine East Asian year.");
        return null;
      } 
      if (param1q.c((p)KoreanCalendar.o)) {
        h h = (h)param1q.e((p)KoreanCalendar.o);
        i = param1q.a(KoreanCalendar.q);
        if (i != Integer.MIN_VALUE)
          return KoreanCalendar.a(j, h, i); 
      } else {
        i = param1q.a(KoreanCalendar.r);
        if (i != Integer.MIN_VALUE && i >= 1)
          return (KoreanCalendar)KoreanCalendar.a(j, h.f(1), 1).b((i - 1), KoreanCalendar.e.h); 
      } 
      return null;
    }
  }
  
  private static class d extends d<KoreanCalendar> {
    private static final List<p> d;
    
    private static final long e = f0.b(1908, 4, 1).q();
    
    private static final long f = f0.b(1912, 1, 1).q();
    
    private static final long g = f0.b(1954, 3, 21).q();
    
    private static final long h = f0.b(1961, 8, 10).q();
    
    private d() {}
    
    KoreanCalendar a(int param1Int1, int param1Int2, h param1h, int param1Int3, long param1Long) {
      return new KoreanCalendar(param1Int1, param1Int2, param1h, param1Int3, param1Long, null);
    }
    
    p b(long param1Long) {
      if (param1Long < e) {
        List<p> list1 = d;
        boolean bool = false;
        return list1.get(bool);
      } 
      if (param1Long < f) {
        List<p> list1 = d;
        boolean bool = true;
        return list1.get(bool);
      } 
      if (param1Long < g) {
        List<p> list1 = d;
        byte b1 = 2;
        return list1.get(b1);
      } 
      long l = h;
      List<p> list = d;
      if (param1Long < l) {
        byte b1 = 3;
        return list.get(b1);
      } 
      byte b = 4;
      return list.get(b);
    }
    
    int[] c() {
      return KoreanCalendar.F();
    }
    
    static {
      ArrayList<p> arrayList = new ArrayList(5);
      arrayList.add(p.a(net.time4j.tz.f.d, 126, 58, 0.0D));
      arrayList.add(p.a(net.time4j.tz.f.d, 8, 30));
      arrayList.add(p.a(net.time4j.tz.f.d, 9, 0));
      arrayList.add(p.a(net.time4j.tz.f.d, 8, 30));
      arrayList.add(p.a(net.time4j.tz.f.d, 9, 0));
      d = Collections.unmodifiableList(arrayList);
    }
  }
  
  public enum e implements w {
    d(1.893415507776E9D),
    e(3.15569251296E7D),
    f(2551442.8775903997D),
    g(604800.0D),
    h(86400.0D);
    
    private final transient double c;
    
    e(double param1Double) {
      this.c = param1Double;
    }
    
    public double b() {
      return this.c;
    }
  }
  
  private static class f implements z<KoreanCalendar, Integer> {
    private f() {}
    
    private int f(KoreanCalendar param1KoreanCalendar) {
      return param1KoreanCalendar.w() * 60 + param1KoreanCalendar.getYear().b() - 364;
    }
    
    public KoreanCalendar a(KoreanCalendar param1KoreanCalendar, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null) {
        if (a(param1KoreanCalendar, param1Integer)) {
          int i = f(param1KoreanCalendar);
          return (KoreanCalendar)param1KoreanCalendar.b((param1Integer.intValue() - i), KoreanCalendar.e.e);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid year of era: ");
        stringBuilder.append(param1Integer);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Missing year of era.");
    }
    
    public p<?> a(KoreanCalendar param1KoreanCalendar) {
      throw new AbstractMethodError("Never called.");
    }
    
    public boolean a(KoreanCalendar param1KoreanCalendar, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = d(param1KoreanCalendar).intValue();
      int j = c(param1KoreanCalendar).intValue();
      boolean bool1 = bool2;
      if (param1Integer.intValue() >= i) {
        bool1 = bool2;
        if (param1Integer.intValue() <= j)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(KoreanCalendar param1KoreanCalendar) {
      throw new AbstractMethodError("Never called.");
    }
    
    public Integer c(KoreanCalendar param1KoreanCalendar) {
      return Integer.valueOf(5332);
    }
    
    public Integer d(KoreanCalendar param1KoreanCalendar) {
      return Integer.valueOf(3978);
    }
    
    public Integer e(KoreanCalendar param1KoreanCalendar) {
      return Integer.valueOf(f(param1KoreanCalendar));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/KoreanCalendar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */