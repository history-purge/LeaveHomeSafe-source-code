package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import b.g.m.v;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.scroll.h;
import com.facebook.react.views.scroll.i;
import com.facebook.react.views.text.b0;
import com.facebook.react.views.text.c0;
import com.facebook.react.views.text.h;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.s;
import com.facebook.react.views.text.x;
import com.facebook.react.views.text.z;
import e.e.o.d0.a.a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

@a(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager<c, i> {
  private static final int AUTOCAPITALIZE_FLAGS = 28672;
  
  private static final int BLUR_TEXT_INPUT = 2;
  
  private static final InputFilter[] EMPTY_FILTERS;
  
  private static final int FOCUS_TEXT_INPUT = 1;
  
  private static final int IME_ACTION_ID = 1648;
  
  private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
  
  private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
  
  private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
  
  private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
  
  private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
  
  private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
  
  private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
  
  private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
  
  private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
  
  private static final int PASSWORD_VISIBILITY_FLAG = 16;
  
  public static final String REACT_CLASS = "AndroidTextInput";
  
  private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
  
  private static final int SET_TEXT_AND_SELECTION = 4;
  
  private static final int[] SPACING_TYPES = new int[] { 8, 0, 2, 1, 3 };
  
  public static final String TAG = "ReactTextInputManager";
  
  private static final int UNSET = -1;
  
  protected s mReactTextViewManagerCallback;
  
  static {
    EMPTY_FILTERS = new InputFilter[0];
  }
  
  private static void checkPasswordType(c paramc) {
    if ((paramc.getStagedInputType() & 0x3002) != 0 && (paramc.getStagedInputType() & 0x80) != 0)
      updateStagedInputTypeFlag(paramc, 128, 16); 
  }
  
  private static com.facebook.react.uimanager.events.d getEventDispatcher(ReactContext paramReactContext, c paramc) {
    return q0.b(paramReactContext, paramc.getId());
  }
  
  private q getReactTextUpdate(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
    spannableStringBuilder.append(c0.a(paramString, c0.g));
    return new q((Spannable)spannableStringBuilder, paramInt1, false, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0, 0, paramInt2, paramInt3);
  }
  
  private void setAutofillHints(c paramc, String... paramVarArgs) {
    if (Build.VERSION.SDK_INT < 26)
      return; 
    paramc.setAutofillHints(paramVarArgs);
  }
  
  private void setImportantForAutofill(c paramc, int paramInt) {
    if (Build.VERSION.SDK_INT < 26)
      return; 
    paramc.setImportantForAutofill(paramInt);
  }
  
  private static void updateStagedInputTypeFlag(c paramc, int paramInt1, int paramInt2) {
    paramc.setStagedInputType((paramInt1 ^ 0xFFFFFFFF) & paramc.getStagedInputType() | paramInt2);
  }
  
  protected void addEventEmitters(k0 paramk0, c paramc) {
    paramc.addTextChangedListener(new g(this, (ReactContext)paramk0, paramc));
    paramc.setOnFocusChangeListener(new b(this, paramk0, paramc));
    paramc.setOnEditorActionListener(new c(this, paramc, paramk0));
  }
  
  protected EditText createInternalEditText(k0 paramk0) {
    return new EditText((Context)paramk0);
  }
  
  public h createShadowNodeInstance() {
    return new m();
  }
  
  public h createShadowNodeInstance(s params) {
    return new m(params);
  }
  
  public c createViewInstance(k0 paramk0) {
    c c = new c((Context)paramk0);
    c.setInputType(c.getInputType() & 0xFFFDFFFF);
    c.setReturnKeyType("done");
    return c;
  }
  
  public Map<String, Integer> getCommandsMap() {
    return com.facebook.react.common.f.a("focusTextInput", Integer.valueOf(1), "blurTextInput", Integer.valueOf(2));
  }
  
  public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
    com.facebook.react.common.f.b b = com.facebook.react.common.f.a();
    b.a("topSubmitEditing", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
    b.a("topEndEditing", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onEndEditing", "captured", "onEndEditingCapture")));
    b.a("topTextInput", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onTextInput", "captured", "onTextInputCapture")));
    b.a("topFocus", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onFocus", "captured", "onFocusCapture")));
    b.a("topBlur", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onBlur", "captured", "onBlurCapture")));
    b.a("topKeyPress", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onKeyPress", "captured", "onKeyPressCapture")));
    return b.a();
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    com.facebook.react.common.f.b b = com.facebook.react.common.f.a();
    b.a(i.a(i.e), com.facebook.react.common.f.a("registrationName", "onScroll"));
    return b.a();
  }
  
  public Map getExportedViewConstants() {
    return com.facebook.react.common.f.a("AutoCapitalizationType", com.facebook.react.common.f.a("none", Integer.valueOf(0), "characters", Integer.valueOf(4096), "words", Integer.valueOf(8192), "sentences", Integer.valueOf(16384)));
  }
  
  public String getName() {
    return "AndroidTextInput";
  }
  
  public Class<? extends i> getShadowNodeClass() {
    return (Class)m.class;
  }
  
  protected void onAfterUpdateTransaction(c paramc) {
    super.onAfterUpdateTransaction((View)paramc);
    paramc.g();
    paramc.c();
  }
  
  public void receiveCommand(c paramc, int paramInt, ReadableArray paramReadableArray) {
    String str;
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4)
            return; 
          str = "setTextAndSelection";
        } else {
          return;
        } 
      } else {
        str = "blur";
      } 
    } else {
      str = "focus";
    } 
    receiveCommand(paramc, str, paramReadableArray);
  }
  
  public void receiveCommand(c paramc, String paramString, ReadableArray paramReadableArray) {
    int i;
    switch (paramString.hashCode()) {
      default:
        i = -1;
        break;
      case 1690703013:
        if (paramString.equals("focusTextInput")) {
          i = 1;
          break;
        } 
      case 1427010500:
        if (paramString.equals("setTextAndSelection")) {
          i = 4;
          break;
        } 
      case 97604824:
        if (paramString.equals("focus")) {
          i = 0;
          break;
        } 
      case 3027047:
        if (paramString.equals("blur")) {
          i = 2;
          break;
        } 
      case -1699362314:
        if (paramString.equals("blurTextInput")) {
          i = 3;
          break;
        } 
    } 
    if (i != 0 && i != 1) {
      if (i != 2 && i != 3) {
        if (i != 4)
          return; 
        int m = paramReadableArray.getInt(0);
        if (m == -1)
          return; 
        paramString = paramReadableArray.getString(1);
        int j = paramReadableArray.getInt(2);
        int k = paramReadableArray.getInt(3);
        i = k;
        if (k == -1)
          i = j; 
        paramc.b(getReactTextUpdate(paramString, m, j, i));
        paramc.a(m, j, i);
        return;
      } 
      paramc.b();
      return;
    } 
    paramc.h();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "allowFontScaling")
  public void setAllowFontScaling(c paramc, boolean paramBoolean) {
    paramc.setAllowFontScaling(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "autoCapitalize")
  public void setAutoCapitalize(c paramc, Dynamic paramDynamic) {
    char c1;
    ReadableType readableType1 = paramDynamic.getType();
    ReadableType readableType2 = ReadableType.Number;
    char c2 = '䀀';
    if (readableType1 == readableType2) {
      c1 = paramDynamic.asInt();
    } else {
      c1 = c2;
      if (paramDynamic.getType() == ReadableType.String) {
        String str = paramDynamic.asString();
        if (str.equals("none")) {
          c1 = Character.MIN_VALUE;
        } else if (str.equals("characters")) {
          c1 = 'က';
        } else if (str.equals("words")) {
          c1 = ' ';
        } else {
          str.equals("sentences");
          c1 = c2;
        } 
      } 
    } 
    updateStagedInputTypeFlag(paramc, 28672, c1);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "autoCorrect")
  public void setAutoCorrect(c paramc, Boolean paramBoolean) {
    boolean bool;
    if (paramBoolean != null) {
      if (paramBoolean.booleanValue()) {
        bool = true;
      } else {
        bool = true;
      } 
    } else {
      bool = false;
    } 
    updateStagedInputTypeFlag(paramc, 557056, bool);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "autoFocus")
  public void setAutoFocus(c paramc, boolean paramBoolean) {
    paramc.setAutoFocus(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "blurOnSubmit")
  public void setBlurOnSubmit(c paramc, Boolean paramBoolean) {
    paramc.setBlurOnSubmit(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
  public void setBorderColor(c paramc, int paramInt, Integer paramInteger) {
    float f1;
    float f2 = Float.NaN;
    if (paramInteger == null) {
      f1 = Float.NaN;
    } else {
      f1 = (paramInteger.intValue() & 0xFFFFFF);
    } 
    if (paramInteger != null)
      f2 = (paramInteger.intValue() >>> 24); 
    paramc.a(SPACING_TYPES[paramInt], f1, f2);
  }
  
  @com.facebook.react.uimanager.e1.b(defaultFloat = NaNF, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
  public void setBorderRadius(c paramc, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!com.facebook.yoga.g.a(paramFloat))
      f = q.b(paramFloat); 
    if (paramInt == 0) {
      paramc.setBorderRadius(f);
      return;
    } 
    paramc.a(f, paramInt - 1);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "borderStyle")
  public void setBorderStyle(c paramc, String paramString) {
    paramc.setBorderStyle(paramString);
  }
  
  @com.facebook.react.uimanager.e1.b(defaultFloat = NaNF, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
  public void setBorderWidth(c paramc, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!com.facebook.yoga.g.a(paramFloat))
      f = q.b(paramFloat); 
    paramc.a(SPACING_TYPES[paramInt], f);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "caretHidden")
  public void setCaretHidden(c paramc, boolean paramBoolean) {
    paramc.setCursorVisible(paramBoolean ^ true);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
  public void setColor(c paramc, Integer paramInteger) {
    String str1;
    String str2;
    if (paramInteger == null) {
      ColorStateList colorStateList = com.facebook.react.views.text.d.a(paramc.getContext());
      if (colorStateList != null) {
        paramc.setTextColor(colorStateList);
        return;
      } 
      Context context = paramc.getContext();
      str2 = TAG;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not get default text color from View Context: ");
      if (context != null) {
        str1 = context.getClass().getCanonicalName();
      } else {
        str1 = "null";
      } 
      stringBuilder.append(str1);
      ReactSoftException.logSoftException(str2, new IllegalStateException(stringBuilder.toString()));
      return;
    } 
    str1.setTextColor(str2.intValue());
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "contextMenuHidden")
  public void setContextMenuHidden(c paramc, boolean paramBoolean) {
    paramc.setOnLongClickListener(new a(this, paramBoolean));
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "cursorColor")
  public void setCursorColor(c paramc, Integer paramInteger) {
    if (paramInteger == null)
      return; 
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      Drawable drawable = paramc.getTextCursorDrawable();
      if (drawable != null) {
        drawable.setColorFilter((ColorFilter)new BlendModeColorFilter(paramInteger.intValue(), BlendMode.SRC_IN));
        paramc.setTextCursorDrawable(drawable);
      } 
      return;
    } 
    if (i == 28)
      return; 
    try {
      Field field2 = TextView.class.getDeclaredField("mCursorDrawableRes");
      field2.setAccessible(true);
      i = field2.getInt(paramc);
      if (i == 0)
        return; 
      Drawable drawable = b.g.e.a.c(paramc.getContext(), i);
      drawable.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.SRC_IN);
      Field field1 = TextView.class.getDeclaredField("mEditor");
      field1.setAccessible(true);
      Object object = field1.get(paramc);
      field1 = object.getClass().getDeclaredField("mCursorDrawable");
      field1.setAccessible(true);
      field1.set(object, new Drawable[] { drawable, drawable });
      return;
    } catch (NoSuchFieldException|IllegalAccessException noSuchFieldException) {
      return;
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "disableFullscreenUI")
  public void setDisableFullscreenUI(c paramc, boolean paramBoolean) {
    paramc.setDisableFullscreenUI(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "editable")
  public void setEditable(c paramc, boolean paramBoolean) {
    paramc.setEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontFamily")
  public void setFontFamily(c paramc, String paramString) {
    paramc.setFontFamily(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 14.0F, name = "fontSize")
  public void setFontSize(c paramc, float paramFloat) {
    paramc.setFontSize(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontStyle")
  public void setFontStyle(c paramc, String paramString) {
    paramc.setFontStyle(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontWeight")
  public void setFontWeight(c paramc, String paramString) {
    paramc.setFontWeight(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "importantForAutofill")
  public void setImportantForAutofill(c paramc, String paramString) {
    boolean bool;
    if ("no".equals(paramString)) {
      bool = true;
    } else if ("noExcludeDescendants".equals(paramString)) {
      bool = true;
    } else if ("yes".equals(paramString)) {
      bool = true;
    } else if ("yesExcludeDescendants".equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    setImportantForAutofill(paramc, bool);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "includeFontPadding")
  public void setIncludeFontPadding(c paramc, boolean paramBoolean) {
    paramc.setIncludeFontPadding(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "inlineImageLeft")
  public void setInlineImageLeft(c paramc, String paramString) {
    paramc.setCompoundDrawablesWithIntrinsicBounds(e.e.o.i0.b.c.a().b(paramc.getContext(), paramString), 0, 0, 0);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "inlineImagePadding")
  public void setInlineImagePadding(c paramc, int paramInt) {
    paramc.setCompoundDrawablePadding(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "keyboardType")
  public void setKeyboardType(c paramc, String paramString) {
    boolean bool;
    if ("numeric".equalsIgnoreCase(paramString)) {
      bool = true;
    } else if ("number-pad".equalsIgnoreCase(paramString)) {
      bool = true;
    } else if ("decimal-pad".equalsIgnoreCase(paramString)) {
      bool = true;
    } else if ("email-address".equalsIgnoreCase(paramString)) {
      bool = true;
    } else if ("phone-pad".equalsIgnoreCase(paramString)) {
      bool = true;
    } else if ("visible-password".equalsIgnoreCase(paramString)) {
      bool = true;
    } else {
      bool = true;
    } 
    updateStagedInputTypeFlag(paramc, 15, bool);
    checkPasswordType(paramc);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0F, name = "letterSpacing")
  public void setLetterSpacing(c paramc, float paramFloat) {
    paramc.setLetterSpacingPt(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = NaNF, name = "maxFontSizeMultiplier")
  public void setMaxFontSizeMultiplier(c paramc, float paramFloat) {
    paramc.setMaxFontSizeMultiplier(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "maxLength")
  public void setMaxLength(c paramc, Integer paramInteger) {
    InputFilter[] arrayOfInputFilter1;
    InputFilter[] arrayOfInputFilter2 = paramc.getFilters();
    InputFilter[] arrayOfInputFilter3 = EMPTY_FILTERS;
    int i = 0;
    if (paramInteger == null) {
      arrayOfInputFilter1 = arrayOfInputFilter3;
      if (arrayOfInputFilter2.length > 0) {
        LinkedList<InputFilter> linkedList = new LinkedList();
        while (i < arrayOfInputFilter2.length) {
          if (!(arrayOfInputFilter2[i] instanceof InputFilter.LengthFilter))
            linkedList.add(arrayOfInputFilter2[i]); 
          i++;
        } 
        arrayOfInputFilter1 = arrayOfInputFilter3;
        if (!linkedList.isEmpty())
          arrayOfInputFilter1 = linkedList.<InputFilter>toArray(new InputFilter[linkedList.size()]); 
      } 
    } else if (arrayOfInputFilter2.length > 0) {
      i = 0;
      boolean bool = false;
      while (i < arrayOfInputFilter2.length) {
        if (arrayOfInputFilter2[i] instanceof InputFilter.LengthFilter) {
          arrayOfInputFilter2[i] = (InputFilter)new InputFilter.LengthFilter(arrayOfInputFilter1.intValue());
          bool = true;
        } 
        i++;
      } 
      if (!bool) {
        arrayOfInputFilter3 = new InputFilter[arrayOfInputFilter2.length + 1];
        System.arraycopy(arrayOfInputFilter2, 0, arrayOfInputFilter3, 0, arrayOfInputFilter2.length);
        arrayOfInputFilter2[arrayOfInputFilter2.length] = (InputFilter)new InputFilter.LengthFilter(arrayOfInputFilter1.intValue());
        arrayOfInputFilter1 = arrayOfInputFilter3;
      } else {
        arrayOfInputFilter1 = arrayOfInputFilter2;
      } 
    } else {
      arrayOfInputFilter2 = new InputFilter[1];
      arrayOfInputFilter2[0] = (InputFilter)new InputFilter.LengthFilter(arrayOfInputFilter1.intValue());
      arrayOfInputFilter1 = arrayOfInputFilter2;
    } 
    paramc.setFilters(arrayOfInputFilter1);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "multiline")
  public void setMultiline(c paramc, boolean paramBoolean) {
    int i;
    int j = 0;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 131072;
    } 
    if (paramBoolean)
      j = 131072; 
    updateStagedInputTypeFlag(paramc, i, j);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "numberOfLines")
  public void setNumLines(c paramc, int paramInt) {
    paramc.setLines(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "onContentSizeChange")
  public void setOnContentSizeChange(c paramc, boolean paramBoolean) {
    a a;
    if (paramBoolean) {
      a = new d(this, paramc);
    } else {
      a = null;
    } 
    paramc.setContentSizeWatcher(a);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "onKeyPress")
  public void setOnKeyPress(c paramc, boolean paramBoolean) {
    paramc.setOnKeyPress(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "onScroll")
  public void setOnScroll(c paramc, boolean paramBoolean) {
    o o;
    if (paramBoolean) {
      o = new e(this, paramc);
    } else {
      o = null;
    } 
    paramc.setScrollWatcher(o);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "onSelectionChange")
  public void setOnSelectionChange(c paramc, boolean paramBoolean) {
    p p;
    if (paramBoolean) {
      p = new f(this, paramc);
    } else {
      p = null;
    } 
    paramc.setSelectionWatcher(p);
  }
  
  public void setPadding(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramc.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "placeholder")
  public void setPlaceholder(c paramc, String paramString) {
    paramc.setHint(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "placeholderTextColor")
  public void setPlaceholderTextColor(c paramc, Integer paramInteger) {
    if (paramInteger == null) {
      paramc.setHintTextColor(com.facebook.react.views.text.d.c(paramc.getContext()));
      return;
    } 
    paramc.setHintTextColor(paramInteger.intValue());
  }
  
  @com.facebook.react.uimanager.e1.a(name = "returnKeyLabel")
  public void setReturnKeyLabel(c paramc, String paramString) {
    paramc.setImeActionLabel(paramString, 1648);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "returnKeyType")
  public void setReturnKeyType(c paramc, String paramString) {
    paramc.setReturnKeyType(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "secureTextEntry")
  public void setSecureTextEntry(c paramc, boolean paramBoolean) {
    char c1;
    char c2 = Character.MIN_VALUE;
    if (paramBoolean) {
      c1 = Character.MIN_VALUE;
    } else {
      c1 = '';
    } 
    if (paramBoolean)
      c2 = ''; 
    updateStagedInputTypeFlag(paramc, c1, c2);
    checkPasswordType(paramc);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "selectTextOnFocus")
  public void setSelectTextOnFocus(c paramc, boolean paramBoolean) {
    paramc.setSelectAllOnFocus(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "selectionColor")
  public void setSelectionColor(c paramc, Integer paramInteger) {
    int i;
    if (paramInteger == null) {
      i = com.facebook.react.views.text.d.b(paramc.getContext());
    } else {
      i = paramInteger.intValue();
    } 
    paramc.setHighlightColor(i);
    setCursorColor(paramc, paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textAlign")
  public void setTextAlign(c paramc, String paramString) {
    StringBuilder stringBuilder;
    if ("justify".equals(paramString)) {
      if (Build.VERSION.SDK_INT >= 26)
        paramc.setJustificationMode(1); 
    } else {
      if (Build.VERSION.SDK_INT >= 26)
        paramc.setJustificationMode(0); 
      if (paramString == null || "auto".equals(paramString)) {
        paramc.setGravityHorizontal(0);
        return;
      } 
      if (!"left".equals(paramString)) {
        if ("right".equals(paramString)) {
          paramc.setGravityHorizontal(5);
          return;
        } 
        if ("center".equals(paramString)) {
          paramc.setGravityHorizontal(1);
          return;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid textAlign: ");
        stringBuilder.append(paramString);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      } 
    } 
    stringBuilder.setGravityHorizontal(3);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textAlignVertical")
  public void setTextAlignVertical(c paramc, String paramString) {
    StringBuilder stringBuilder;
    byte b;
    if (paramString == null || "auto".equals(paramString)) {
      b = 0;
    } else if ("top".equals(paramString)) {
      b = 48;
    } else if ("bottom".equals(paramString)) {
      b = 80;
    } else if ("center".equals(paramString)) {
      b = 16;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid textAlignVertical: ");
      stringBuilder.append(paramString);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.setGravityVertical(b);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "autoCompleteType")
  public void setTextContentType(c paramc, String paramString) {
    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException;
    if (paramString != null) {
      if ("username".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "username" });
        return;
      } 
      if ("password".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "password" });
        return;
      } 
      if ("email".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "emailAddress" });
        return;
      } 
      if ("name".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "name" });
        return;
      } 
      if ("tel".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "phone" });
        return;
      } 
      if ("street-address".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "postalAddress" });
        return;
      } 
      if ("postal-code".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "postalCode" });
        return;
      } 
      if ("cc-number".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "creditCardNumber" });
        return;
      } 
      if ("cc-csc".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "creditCardSecurityCode" });
        return;
      } 
      if ("cc-exp".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "creditCardExpirationDate" });
        return;
      } 
      if ("cc-exp-month".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "creditCardExpirationMonth" });
        return;
      } 
      if ("cc-exp-year".equals(paramString)) {
        setAutofillHints(paramc, new String[] { "creditCardExpirationYear" });
        return;
      } 
      if (!"off".equals(paramString)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid autoCompleteType: ");
        stringBuilder.append(paramString);
        jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
        throw jSApplicationIllegalArgumentException;
      } 
    } 
    setImportantForAutofill((c)jSApplicationIllegalArgumentException, 2);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "underlineColorAndroid")
  public void setUnderlineColor(c paramc, Integer paramInteger) {
    Drawable drawable2 = paramc.getBackground();
    Drawable drawable1 = drawable2;
    if (drawable2.getConstantState() != null)
      try {
        drawable1 = drawable2.mutate();
      } catch (NullPointerException nullPointerException) {
        e.e.e.e.a.b(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", nullPointerException);
        drawable1 = drawable2;
      }  
    if (paramInteger == null) {
      drawable1.clearColorFilter();
      return;
    } 
    drawable1.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.SRC_IN);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "showSoftInputOnFocus")
  public void showKeyboardOnFocus(c paramc, boolean paramBoolean) {
    paramc.setShowSoftInputOnFocus(paramBoolean);
  }
  
  public void updateExtraData(c paramc, Object paramObject) {
    if (paramObject instanceof q) {
      paramObject = paramObject;
      int i = (int)paramObject.e();
      int j = (int)paramObject.g();
      int k = (int)paramObject.f();
      int m = (int)paramObject.d();
      if (i != -1 || j != -1 || k != -1 || m != -1) {
        if (i == -1)
          i = paramc.getPaddingLeft(); 
        if (j == -1)
          j = paramc.getPaddingTop(); 
        if (k == -1)
          k = paramc.getPaddingRight(); 
        if (m == -1)
          m = paramc.getPaddingBottom(); 
        paramc.setPadding(i, j, k, m);
      } 
      if (paramObject.a())
        z.a(paramObject.j(), (TextView)paramc); 
      paramc.c((q)paramObject);
      paramc.a(paramObject.b(), paramObject.i(), paramObject.h());
    } 
  }
  
  public Object updateState(c paramc, c0 paramc0, j0 paramj0) {
    ReadableNativeMap readableNativeMap2 = paramj0.getState();
    if (!readableNativeMap2.getBoolean("hasThemeData")) {
      EditText editText;
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      ReactContext reactContext = q0.a((View)paramc);
      if (reactContext instanceof k0) {
        editText = createInternalEditText((k0)reactContext);
        writableNativeMap.putNull("textChanged");
        writableNativeMap.putDouble("themePaddingStart", q.a(v.u((View)editText)));
        writableNativeMap.putDouble("themePaddingEnd", q.a(v.t((View)editText)));
        writableNativeMap.putDouble("themePaddingTop", q.a(editText.getPaddingTop()));
        writableNativeMap.putDouble("themePaddingBottom", q.a(editText.getPaddingBottom()));
        paramj0.a((WritableMap)writableNativeMap);
      } else {
        String str1;
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ReactContext is not a ThemedReactContent: ");
        if (editText != null) {
          str1 = editText.getClass().getName();
        } else {
          str1 = "null";
        } 
        stringBuilder.append(str1);
        ReactSoftException.logSoftException(str2, new IllegalStateException(stringBuilder.toString()));
      } 
    } 
    ReadableNativeMap readableNativeMap1 = readableNativeMap2.getMap("attributedString");
    ReadableNativeMap readableNativeMap3 = readableNativeMap2.getMap("paragraphAttributes");
    Spannable spannable = b0.b(paramc.getContext(), (ReadableMap)readableNativeMap1, this.mReactTextViewManagerCallback);
    int i = x.h(readableNativeMap3.getString("textBreakStrategy"));
    paramc.G = paramj0;
    return q.a(spannable, readableNativeMap2.getInt("mostRecentEventCount"), false, x.b(paramc0), i, x.a(paramc0), (ReadableMap)readableNativeMap1);
  }
  
  class a implements View.OnLongClickListener {
    a(ReactTextInputManager this$0, boolean param1Boolean) {}
    
    public boolean onLongClick(View param1View) {
      return this.c;
    }
  }
  
  class b implements View.OnFocusChangeListener {
    b(ReactTextInputManager this$0, k0 param1k0, c param1c) {}
    
    public void onFocusChange(View param1View, boolean param1Boolean) {
      g g;
      com.facebook.react.uimanager.events.d d = ReactTextInputManager.getEventDispatcher((ReactContext)this.c, this.d);
      if (param1Boolean) {
        i i = new i(this.d.getId());
      } else {
        d.a(new f(this.d.getId()));
        g = new g(this.d.getId(), this.d.getText().toString());
      } 
      d.a(g);
    }
  }
  
  class c implements TextView.OnEditorActionListener {
    c(ReactTextInputManager this$0, c param1c, k0 param1k0) {}
    
    public boolean onEditorAction(TextView param1TextView, int param1Int, KeyEvent param1KeyEvent) {
      boolean bool = true;
      if ((param1Int & 0xFF) != 0 || param1Int == 0) {
        boolean bool2 = this.a.getBlurOnSubmit();
        boolean bool3 = this.a.f();
        ReactTextInputManager.getEventDispatcher((ReactContext)this.b, this.a).a(new n(this.a.getId(), this.a.getText().toString()));
        if (bool2)
          this.a.clearFocus(); 
        boolean bool1 = bool;
        if (!bool2) {
          if (!bool3)
            return true; 
          bool1 = bool;
          if (param1Int != 5) {
            if (param1Int == 7)
              return true; 
            bool1 = false;
          } 
        } 
        return bool1;
      } 
      return true;
    }
  }
  
  private class d implements a {
    private c a;
    
    private com.facebook.react.uimanager.events.d b;
    
    private int c = 0;
    
    private int d = 0;
    
    public d(ReactTextInputManager this$0, c param1c) {
      this.a = param1c;
      this.b = ((UIManagerModule)q0.a((View)param1c).getNativeModule(UIManagerModule.class)).getEventDispatcher();
    }
    
    public void a() {
      int i = this.a.getWidth();
      int j = this.a.getHeight();
      if (this.a.getLayout() != null) {
        i = this.a.getCompoundPaddingLeft() + this.a.getLayout().getWidth() + this.a.getCompoundPaddingRight();
        j = this.a.getCompoundPaddingTop() + this.a.getLayout().getHeight() + this.a.getCompoundPaddingBottom();
      } 
      if (i != this.c || j != this.d) {
        this.d = j;
        this.c = i;
        this.b.a(new b(this.a.getId(), q.a(i), q.a(j)));
      } 
    }
  }
  
  private class e implements o {
    private c a;
    
    private com.facebook.react.uimanager.events.d b;
    
    private int c;
    
    private int d;
    
    public e(ReactTextInputManager this$0, c param1c) {
      this.a = param1c;
      this.b = ReactTextInputManager.getEventDispatcher(q0.a((View)param1c), param1c);
    }
    
    public void a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (this.c != param1Int1 || this.d != param1Int2) {
        h h = h.b(this.a.getId(), i.e, param1Int1, param1Int2, 0.0F, 0.0F, 0, 0, this.a.getWidth(), this.a.getHeight());
        this.b.a((com.facebook.react.uimanager.events.c)h);
        this.c = param1Int1;
        this.d = param1Int2;
      } 
    }
  }
  
  private class f implements p {
    private c a;
    
    private com.facebook.react.uimanager.events.d b;
    
    private int c;
    
    private int d;
    
    public f(ReactTextInputManager this$0, c param1c) {
      this.a = param1c;
      this.b = ReactTextInputManager.getEventDispatcher(q0.a((View)param1c), param1c);
    }
    
    public void a(int param1Int1, int param1Int2) {
      int i = Math.min(param1Int1, param1Int2);
      param1Int1 = Math.max(param1Int1, param1Int2);
      if (this.c != i || this.d != param1Int1) {
        this.b.a(new l(this.a.getId(), i, param1Int1));
        this.c = i;
        this.d = param1Int1;
      } 
    }
  }
  
  private class g implements TextWatcher {
    private com.facebook.react.uimanager.events.d c;
    
    private c d;
    
    private String e;
    
    public g(ReactTextInputManager this$0, ReactContext param1ReactContext, c param1c) {
      this.c = ReactTextInputManager.getEventDispatcher(param1ReactContext, param1c);
      this.d = param1c;
      this.e = null;
    }
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      this.e = param1CharSequence.toString();
    }
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      if (this.d.H)
        return; 
      if (param1Int3 == 0 && param1Int2 == 0)
        return; 
      e.e.m.a.a.a(this.e);
      String str1 = param1CharSequence.toString();
      int j = param1Int1 + param1Int3;
      String str2 = str1.substring(param1Int1, j);
      str1 = this.e;
      int i = param1Int1 + param1Int2;
      str1 = str1.substring(param1Int1, i);
      if (param1Int3 == param1Int2 && str2.equals(str1))
        return; 
      JavaOnlyMap javaOnlyMap = this.d.F;
      if (javaOnlyMap != null && javaOnlyMap.hasKey("fragments")) {
        String str5 = param1CharSequence.subSequence(param1Int1, j).toString();
        String str3 = javaOnlyMap.getString("string");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str3.substring(0, param1Int1));
        stringBuilder.append(str5);
        param1Int3 = str3.length();
        String str4 = "";
        if (param1Int3 > i) {
          str3 = str3.substring(i);
        } else {
          str3 = "";
        } 
        stringBuilder.append(str3);
        javaOnlyMap.putString("string", stringBuilder.toString());
        JavaOnlyArray javaOnlyArray2 = (JavaOnlyArray)javaOnlyMap.getArray("fragments");
        i = 0;
        j = 0;
        int k = 0;
        str3 = str4;
        JavaOnlyArray javaOnlyArray1 = javaOnlyArray2;
        param1Int3 = param1Int1;
        param1Int1 = i;
        i = k;
        while (i < javaOnlyArray1.size() && param1Int1 == 0) {
          JavaOnlyMap javaOnlyMap1 = (JavaOnlyMap)javaOnlyArray1.getMap(i);
          String str = javaOnlyMap1.getString("string");
          k = j + str.length();
          if (k >= param1Int3) {
            j = param1Int3 - j;
            param1Int1 = str.length() - j;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str.substring(0, j));
            stringBuilder1.append(str5);
            stringBuilder1.append(str.substring(j + Math.min(param1Int2, param1Int1)));
            javaOnlyMap1.putString("string", stringBuilder1.toString());
            if (param1Int1 < param1Int2) {
              param1Int3 += param1Int1;
              param1Int2 -= param1Int1;
              str5 = str3;
              param1Int1 = 0;
            } else {
              param1Int1 = 1;
            } 
          } 
          i++;
          j = k;
        } 
        param1Int1 = param1Int3;
      } 
      param1Int3 = 0;
      if (this.d.G != null && javaOnlyMap != null) {
        WritableNativeMap writableNativeMap1 = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        while (param1Int3 < javaOnlyMap.getArray("fragments").size()) {
          ReadableMap readableMap = javaOnlyMap.getArray("fragments").getMap(param1Int3);
          WritableNativeMap writableNativeMap = new WritableNativeMap();
          writableNativeMap.putDouble("reactTag", readableMap.getInt("reactTag"));
          writableNativeMap.putString("string", readableMap.getString("string"));
          writableNativeArray.pushMap((ReadableMap)writableNativeMap);
          param1Int3++;
        } 
        writableNativeMap2.putString("string", javaOnlyMap.getString("string"));
        writableNativeMap2.putArray("fragments", (ReadableArray)writableNativeArray);
        writableNativeMap1.putInt("mostRecentEventCount", this.d.e());
        writableNativeMap1.putMap("textChanged", (ReadableMap)writableNativeMap2);
        this.d.G.a((WritableMap)writableNativeMap1);
      } 
      this.c.a(new e(this.d.getId(), param1CharSequence.toString(), this.d.e()));
      this.c.a(new h(this.d.getId(), str2, str1, param1Int1, param1Int1 + param1Int2));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/ReactTextInputManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */