package e.f.a.e.i.k;

public enum v5 {
  A,
  A0,
  B,
  B0,
  C,
  C0,
  D,
  D0,
  E,
  E0,
  F,
  F0,
  G,
  G0,
  H,
  H0,
  I,
  I0,
  J,
  J0,
  K,
  K0,
  L,
  L0,
  M,
  M0,
  N,
  N0,
  O,
  O0,
  P,
  P0,
  Q,
  Q0,
  R,
  R0,
  S,
  S0,
  T,
  T0,
  U,
  U0,
  V,
  V0,
  W,
  W0,
  X,
  X0,
  Y,
  Y0,
  Z,
  Z0,
  a0,
  a1,
  b0,
  b1,
  c(0),
  c0(0),
  c1(0),
  d(1),
  d0(1),
  d1(1),
  e(2),
  e0(2),
  e1(2),
  f(3),
  f0(3),
  f1(3),
  g(11),
  g0(11),
  g1(11),
  h(12),
  h0(12),
  h1(12),
  i(13),
  i0(13),
  i1(13),
  j(21),
  j0(21),
  j1(21),
  k(22),
  k0(22),
  k1(22),
  l(23),
  l0(23),
  l1(23),
  m(141),
  m0(141),
  m1(141),
  n(142),
  n0(142),
  n1(142),
  o(143),
  o0(143),
  o1(143),
  p(144),
  p0(144),
  p1(144),
  q(151),
  q0(151),
  q1(151),
  r(152),
  r0(152),
  r1(152),
  s(153),
  s0(153),
  s1(153),
  t(154),
  t0(154),
  t1(154),
  u(161),
  u0(161),
  v(162),
  v0(162),
  w(164),
  w0(164),
  x(163),
  x0(163),
  y(171),
  y0(171),
  z(172),
  z0(172);
  
  static {
    A = new v5("ON_DEVICE_TRANSLATOR_LOAD", 24, 173);
    B = new v5("ON_DEVICE_TRANSLATOR_CLOSE", 25, 174);
    C = new v5("ON_DEVICE_TRANSLATOR_DOWNLOAD", 26, 175);
    D = new v5("ON_DEVICE_ENTITY_EXTRACTION_ANNOTATE", 27, 241);
    E = new v5("ON_DEVICE_ENTITY_EXTRACTION_CREATE", 28, 242);
    F = new v5("ON_DEVICE_ENTITY_EXTRACTION_LOAD", 29, 243);
    G = new v5("ON_DEVICE_ENTITY_EXTRACTION_CLOSE", 30, 244);
    H = new v5("ON_DEVICE_ENTITY_EXTRACTION_DOWNLOAD", 31, 245);
    I = new v5("ON_DEVICE_OBJECT_CREATE", 32, 191);
    J = new v5("ON_DEVICE_OBJECT_LOAD", 33, 192);
    K = new v5("ON_DEVICE_OBJECT_INFERENCE", 34, 193);
    L = new v5("ON_DEVICE_OBJECT_CLOSE", 35, 194);
    M = new v5("ON_DEVICE_DI_CREATE", 36, 311);
    N = new v5("ON_DEVICE_DI_LOAD", 37, 312);
    O = new v5("ON_DEVICE_DI_DOWNLOAD", 38, 313);
    P = new v5("ON_DEVICE_DI_RECOGNIZE", 39, 314);
    Q = new v5("ON_DEVICE_DI_CLOSE", 40, 315);
    R = new v5("ON_DEVICE_POSE_CREATE", 41, 321);
    S = new v5("ON_DEVICE_POSE_LOAD", 42, 322);
    T = new v5("ON_DEVICE_POSE_INFERENCE", 43, 323);
    U = new v5("ON_DEVICE_POSE_CLOSE", 44, 324);
    V = new v5("ON_DEVICE_SEGMENTATION_CREATE", 45, 331);
    W = new v5("ON_DEVICE_SEGMENTATION_LOAD", 46, 332);
    X = new v5("ON_DEVICE_SEGMENTATION_INFERENCE", 47, 333);
    Y = new v5("ON_DEVICE_SEGMENTATION_CLOSE", 48, 334);
    Z = new v5("CUSTOM_OBJECT_CREATE", 49, 341);
    a0 = new v5("CUSTOM_OBJECT_LOAD", 50, 342);
    b0 = new v5("CUSTOM_OBJECT_INFERENCE", 51, 343);
    c0 = new v5("CUSTOM_OBJECT_CLOSE", 52, 344);
    d0 = new v5("CUSTOM_IMAGE_LABEL_CREATE", 53, 351);
    e0 = new v5("CUSTOM_IMAGE_LABEL_LOAD", 54, 352);
    f0 = new v5("CUSTOM_IMAGE_LABEL_DETECT", 55, 353);
    g0 = new v5("CUSTOM_IMAGE_LABEL_CLOSE", 56, 354);
    h0 = new v5("CLOUD_FACE_DETECT", 57, 31);
    i0 = new v5("CLOUD_FACE_CREATE", 58, 32);
    j0 = new v5("CLOUD_FACE_CLOSE", 59, 33);
    k0 = new v5("CLOUD_CROP_HINTS_CREATE", 60, 41);
    l0 = new v5("CLOUD_CROP_HINTS_DETECT", 61, 42);
    m0 = new v5("CLOUD_CROP_HINTS_CLOSE", 62, 43);
    n0 = new v5("CLOUD_DOCUMENT_TEXT_CREATE", 63, 51);
    o0 = new v5("CLOUD_DOCUMENT_TEXT_DETECT", 64, 52);
    p0 = new v5("CLOUD_DOCUMENT_TEXT_CLOSE", 65, 53);
    q0 = new v5("CLOUD_IMAGE_PROPERTIES_CREATE", 66, 61);
    r0 = new v5("CLOUD_IMAGE_PROPERTIES_DETECT", 67, 62);
    s0 = new v5("CLOUD_IMAGE_PROPERTIES_CLOSE", 68, 63);
    t0 = new v5("CLOUD_IMAGE_LABEL_CREATE", 69, 71);
    u0 = new v5("CLOUD_IMAGE_LABEL_DETECT", 70, 72);
    v0 = new v5("CLOUD_IMAGE_LABEL_CLOSE", 71, 73);
    w0 = new v5("CLOUD_LANDMARK_CREATE", 72, 81);
    x0 = new v5("CLOUD_LANDMARK_DETECT", 73, 82);
    y0 = new v5("CLOUD_LANDMARK_CLOSE", 74, 83);
    z0 = new v5("CLOUD_LOGO_CREATE", 75, 91);
    A0 = new v5("CLOUD_LOGO_DETECT", 76, 92);
    B0 = new v5("CLOUD_LOGO_CLOSE", 77, 93);
    C0 = new v5("CLOUD_SAFE_SEARCH_CREATE", 78, 111);
    D0 = new v5("CLOUD_SAFE_SEARCH_DETECT", 79, 112);
    E0 = new v5("CLOUD_SAFE_SEARCH_CLOSE", 80, 113);
    F0 = new v5("CLOUD_TEXT_CREATE", 81, 121);
    G0 = new v5("CLOUD_TEXT_DETECT", 82, 122);
    H0 = new v5("CLOUD_TEXT_CLOSE", 83, 123);
    I0 = new v5("CLOUD_WEB_SEARCH_CREATE", 84, 131);
    J0 = new v5("CLOUD_WEB_SEARCH_DETECT", 85, 132);
    K0 = new v5("CLOUD_WEB_SEARCH_CLOSE", 86, 133);
    L0 = new v5("CUSTOM_MODEL_RUN", 87, 102);
    M0 = new v5("CUSTOM_MODEL_CREATE", 88, 103);
    N0 = new v5("CUSTOM_MODEL_CLOSE", 89, 104);
    O0 = new v5("CUSTOM_MODEL_LOAD", 90, 105);
    P0 = new v5("AUTOML_IMAGE_LABELING_RUN", 91, 181);
    Q0 = new v5("AUTOML_IMAGE_LABELING_CREATE", 92, 182);
    R0 = new v5("AUTOML_IMAGE_LABELING_CLOSE", 93, 183);
    S0 = new v5("AUTOML_IMAGE_LABELING_LOAD", 94, 184);
    T0 = new v5("MODEL_DOWNLOAD", 95, 100);
    U0 = new v5("MODEL_UPDATE", 96, 101);
    V0 = new v5("REMOTE_MODEL_IS_DOWNLOADED", 97, 251);
    W0 = new v5("REMOTE_MODEL_DELETE_ON_DEVICE", 98, 252);
    X0 = new v5("ACCELERATION_ANALYTICS", 99, 260);
    Y0 = new v5("AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE", 100, 200);
    Z0 = new v5("AGGREGATED_CUSTOM_MODEL_INFERENCE", 101, 201);
    a1 = new v5("AGGREGATED_ON_DEVICE_BARCODE_DETECTION", 102, 202);
    b1 = new v5("AGGREGATED_ON_DEVICE_FACE_DETECTION", 103, 203);
    c1 = new v5("AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION", 104, 204);
    d1 = new v5("AGGREGATED_ON_DEVICE_OBJECT_INFERENCE", 105, 205);
    e1 = new v5("AGGREGATED_ON_DEVICE_TEXT_DETECTION", 106, 206);
    f1 = new v5("AGGREGATED_ON_DEVICE_POSE_DETECTION", 107, 207);
    g1 = new v5("AGGREGATED_ON_DEVICE_SEGMENTATION", 108, 208);
    h1 = new v5("AGGREGATED_CUSTOM_OBJECT_INFERENCE", 109, 209);
    i1 = new v5("AGGREGATED_CUSTOM_IMAGE_LABEL_DETECTION", 110, 210);
    j1 = new v5("REMOTE_CONFIG_FETCH", 111, 271);
    k1 = new v5("REMOTE_CONFIG_ACTIVATE", 112, 272);
    l1 = new v5("REMOTE_CONFIG_LOAD", 113, 273);
    m1 = new v5("REMOTE_CONFIG_FRC_FETCH", 114, 281);
    n1 = new v5("INSTALLATION_ID_INIT", 115, 291);
    o1 = new v5("INSTALLATION_ID_REGISTER_NEW_ID", 116, 292);
    p1 = new v5("INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN", 117, 293);
    q1 = new v5("INSTALLATION_ID_FIS_CREATE_INSTALLATION", 118, 301);
    r1 = new v5("INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN", 119, 302);
    s1 = new v5("INPUT_IMAGE_CONSTRUCTION", 120, 361);
    t1 = new v5("HANDLE_LEAKED", 121, 371);
    u1 = new v5[] { 
        c, d, e, f, g, h, i, j, k, l, 
        m, n, o, p, q, r, s, t, u, v, 
        w, x, y, z, A, B, C, D, E, F, 
        G, H, I, J, K, L, M, N, O, P, 
        Q, R, S, T, U, V, W, X, Y, Z, 
        a0, b0, c0, d0, e0, f0, g0, h0, i0, j0, 
        k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, 
        u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, 
        E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, 
        O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, 
        Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, 
        i1, j1, k1, l1, m1, n1, o1, p1, q1, r1, 
        s1, t1 };
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/v5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */