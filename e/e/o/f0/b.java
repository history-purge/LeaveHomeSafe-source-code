package e.e.o.f0;

import android.content.Context;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import e.e.o.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b extends z {
  private a a;
  
  public b(a parama) {
    this.a = parama;
  }
  
  public NativeModule a(String paramString, ReactApplicationContext paramReactApplicationContext) {
    a a1;
    byte b1;
    switch (paramString.hashCode()) {
      default:
        b1 = -1;
        break;
      case 1922110066:
        if (paramString.equals("Vibration")) {
          b1 = 24;
          break;
        } 
      case 1721274886:
        if (paramString.equals("NativeAnimatedModule")) {
          b1 = 16;
          break;
        } 
      case 1555425035:
        if (paramString.equals("ShareModule")) {
          b1 = 19;
          break;
        } 
      case 1547941001:
        if (paramString.equals("BlobModule")) {
          b1 = 3;
          break;
        } 
      case 1515242260:
        if (paramString.equals("Networking")) {
          b1 = 17;
          break;
        } 
      case 1221389072:
        if (paramString.equals("AppState")) {
          b1 = 2;
          break;
        } 
      case 563961875:
        if (paramString.equals("IntentAndroid")) {
          b1 = 15;
          break;
        } 
      case 403570038:
        if (paramString.equals("Clipboard")) {
          b1 = 7;
          break;
        } 
      case 283572496:
        if (paramString.equals("ImageEditingManager")) {
          b1 = 12;
          break;
        } 
      case 174691539:
        if (paramString.equals("DatePickerAndroid")) {
          b1 = 8;
          break;
        } 
      case 163245714:
        if (paramString.equals("FrescoModule")) {
          b1 = 10;
          break;
        } 
      case -254310125:
        if (paramString.equals("WebSocketModule")) {
          b1 = 25;
          break;
        } 
      case -382654004:
        if (paramString.equals("StatusBarManager")) {
          b1 = 20;
          break;
        } 
      case -457866500:
        if (paramString.equals("AccessibilityInfo")) {
          b1 = 0;
          break;
        } 
      case -504784764:
        if (paramString.equals("Appearance")) {
          b1 = 1;
          break;
        } 
      case -570370161:
        if (paramString.equals("I18nManager")) {
          b1 = 11;
          break;
        } 
      case -657277650:
        if (paramString.equals("ImageLoader")) {
          b1 = 13;
          break;
        } 
      case -1062061717:
        if (paramString.equals("PermissionsAndroid")) {
          b1 = 18;
          break;
        } 
      case -1344126773:
        if (paramString.equals("FileReaderModule")) {
          b1 = 4;
          break;
        } 
      case -1399423980:
        if (paramString.equals("TimePickerAndroid")) {
          b1 = 22;
          break;
        } 
      case -1505215509:
        if (paramString.equals("CameraRollManager")) {
          b1 = 6;
          break;
        } 
      case -1654566518:
        if (paramString.equals("DialogManagerAndroid")) {
          b1 = 9;
          break;
        } 
      case -1850625090:
        if (paramString.equals("SoundManager")) {
          b1 = 21;
          break;
        } 
      case -1962922905:
        if (paramString.equals("ImageStoreManager")) {
          b1 = 14;
          break;
        } 
      case -2033388651:
        if (paramString.equals("AsyncSQLiteDBStorage")) {
          b1 = 5;
          break;
        } 
      case -2115067288:
        if (paramString.equals("ToastAndroid")) {
          b1 = 23;
          break;
        } 
    } 
    switch (b1) {
      default:
        return null;
      case 25:
        return (NativeModule)new WebSocketModule(paramReactApplicationContext);
      case 24:
        return (NativeModule)new VibrationModule(paramReactApplicationContext);
      case 23:
        return (NativeModule)new ToastModule(paramReactApplicationContext);
      case 22:
        return (NativeModule)new TimePickerDialogModule(paramReactApplicationContext);
      case 21:
        return (NativeModule)new SoundManagerModule(paramReactApplicationContext);
      case 20:
        return (NativeModule)new StatusBarModule(paramReactApplicationContext);
      case 19:
        return (NativeModule)new ShareModule(paramReactApplicationContext);
      case 18:
        return (NativeModule)new PermissionsModule(paramReactApplicationContext);
      case 17:
        return (NativeModule)new NetworkingModule(paramReactApplicationContext);
      case 16:
        return (NativeModule)new NativeAnimatedModule(paramReactApplicationContext);
      case 15:
        return (NativeModule)new IntentModule(paramReactApplicationContext);
      case 14:
        return (NativeModule)new ImageStoreManager(paramReactApplicationContext);
      case 13:
        return (NativeModule)new ImageLoaderModule(paramReactApplicationContext);
      case 12:
        return (NativeModule)new ImageEditingManager(paramReactApplicationContext);
      case 11:
        return (NativeModule)new I18nManagerModule((Context)paramReactApplicationContext);
      case 10:
        a1 = this.a;
        if (a1 == null)
          return (NativeModule)new FrescoModule(paramReactApplicationContext, true, null); 
        a1.a();
        throw null;
      case 9:
        return (NativeModule)new DialogModule(paramReactApplicationContext);
      case 8:
        return (NativeModule)new DatePickerDialogModule(paramReactApplicationContext);
      case 7:
        return (NativeModule)new ClipboardModule((Context)paramReactApplicationContext);
      case 6:
        return (NativeModule)new CameraRollManager(paramReactApplicationContext);
      case 5:
        return (NativeModule)new AsyncStorageModule(paramReactApplicationContext);
      case 4:
        return (NativeModule)new FileReaderModule(paramReactApplicationContext);
      case 3:
        return (NativeModule)new BlobModule(paramReactApplicationContext);
      case 2:
        return (NativeModule)new AppStateModule(paramReactApplicationContext);
      case 1:
        return (NativeModule)new AppearanceModule(paramReactApplicationContext);
      case 0:
        break;
    } 
    return (NativeModule)new AccessibilityInfoModule(paramReactApplicationContext);
  }
  
  public com.facebook.react.module.model.a c() {
    try {
      return (com.facebook.react.module.model.a)Class.forName("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider").newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
      Class[] arrayOfClass = new Class[26];
      int i = 0;
      arrayOfClass[0] = AccessibilityInfoModule.class;
      arrayOfClass[1] = AppearanceModule.class;
      arrayOfClass[2] = AppStateModule.class;
      arrayOfClass[3] = BlobModule.class;
      arrayOfClass[4] = FileReaderModule.class;
      arrayOfClass[5] = AsyncStorageModule.class;
      arrayOfClass[6] = CameraRollManager.class;
      arrayOfClass[7] = ClipboardModule.class;
      arrayOfClass[8] = DatePickerDialogModule.class;
      arrayOfClass[9] = DialogModule.class;
      arrayOfClass[10] = FrescoModule.class;
      arrayOfClass[11] = I18nManagerModule.class;
      arrayOfClass[12] = ImageEditingManager.class;
      arrayOfClass[13] = ImageLoaderModule.class;
      arrayOfClass[14] = ImageStoreManager.class;
      arrayOfClass[15] = IntentModule.class;
      arrayOfClass[16] = NativeAnimatedModule.class;
      arrayOfClass[17] = NetworkingModule.class;
      arrayOfClass[18] = PermissionsModule.class;
      arrayOfClass[19] = ShareModule.class;
      arrayOfClass[20] = StatusBarModule.class;
      arrayOfClass[21] = SoundManagerModule.class;
      arrayOfClass[22] = TimePickerDialogModule.class;
      arrayOfClass[23] = ToastModule.class;
      arrayOfClass[24] = VibrationModule.class;
      arrayOfClass[25] = WebSocketModule.class;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      int j = arrayOfClass.length;
      while (i < j) {
        Class<?> clazz = arrayOfClass[i];
        e.e.o.d0.a.a a1 = (e.e.o.d0.a.a)clazz.getAnnotation(e.e.o.d0.a.a.class);
        hashMap.put(a1.name(), new ReactModuleInfo(a1.name(), clazz.getName(), a1.canOverrideExistingModule(), a1.needsEagerInit(), a1.hasConstants(), a1.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(clazz)));
        i++;
      } 
      return new a(this, hashMap);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", illegalAccessException);
    } 
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<ARTRenderableViewManager> arrayList = new ArrayList();
    arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
    arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
    arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
    arrayList.add(new ReactCheckBoxManager());
    arrayList.add(new ReactDialogPickerManager());
    arrayList.add(new ReactDrawerLayoutManager());
    arrayList.add(new ReactDropdownPickerManager());
    arrayList.add(new ReactHorizontalScrollViewManager());
    arrayList.add(new ReactHorizontalScrollContainerViewManager());
    arrayList.add(new ReactProgressBarViewManager());
    arrayList.add(new ReactScrollViewManager());
    arrayList.add(new ReactSliderManager());
    arrayList.add(new ReactSwitchManager());
    arrayList.add(new SwipeRefreshLayoutManager());
    arrayList.add(new ARTSurfaceViewManager());
    arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
    arrayList.add(new ReactImageManager());
    arrayList.add(new ReactModalHostManager());
    arrayList.add(new ReactRawTextManager());
    arrayList.add(new ReactTextInputManager());
    arrayList.add(new ReactTextViewManager());
    arrayList.add(new ReactViewManager());
    arrayList.add(new ReactViewPagerManager());
    arrayList.add(new ReactVirtualTextViewManager());
    return (List)arrayList;
  }
  
  class a implements com.facebook.react.module.model.a {
    a(b this$0, Map param1Map) {}
    
    public Map<String, ReactModuleInfo> a() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/f0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */