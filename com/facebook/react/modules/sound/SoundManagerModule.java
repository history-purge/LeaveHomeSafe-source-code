package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import e.e.o.d0.a.a;

@a(name = "SoundManager")
public class SoundManagerModule extends NativeSoundManagerSpec {
  public static final String NAME = "SoundManager";
  
  public SoundManagerModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public String getName() {
    return "SoundManager";
  }
  
  public void playTouchSound() {
    AudioManager audioManager = (AudioManager)getReactApplicationContext().getSystemService("audio");
    if (audioManager != null)
      audioManager.playSoundEffect(0); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/sound/SoundManagerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */