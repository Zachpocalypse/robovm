/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.avfoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioUnitDistortion/*</name>*/ 
    extends /*<extends>*/AVAudioUnitEffect/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioUnitDistortionPtr extends Ptr<AVAudioUnitDistortion, AVAudioUnitDistortionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioUnitDistortion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioUnitDistortion() {}
    protected AVAudioUnitDistortion(Handle h, long handle) { super(h, handle); }
    protected AVAudioUnitDistortion(SkipInit skipInit) { super(skipInit); }
    @WeaklyLinked
    @Method(selector = "initWithAudioComponentDescription:")
    public AVAudioUnitDistortion(@ByVal AudioComponentDescription audioComponentDescription) { super(audioComponentDescription); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "preGain")
    public native float getPreGain();
    @Property(selector = "setPreGain:")
    public native void setPreGain(float v);
    @Property(selector = "wetDryMix")
    public native float getWetDryMix();
    @Property(selector = "setWetDryMix:")
    public native void setWetDryMix(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadFactoryPreset:")
    public native void loadFactoryPreset(AVAudioUnitDistortionPreset preset);
    /*</methods>*/
}
