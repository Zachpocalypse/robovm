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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIVisualEffectView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIVisualEffectViewPtr extends Ptr<UIVisualEffectView, UIVisualEffectViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIVisualEffectView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIVisualEffectView() {}
    protected UIVisualEffectView(Handle h, long handle) { super(h, handle); }
    protected UIVisualEffectView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEffect:")
    public UIVisualEffectView(UIVisualEffect effect) { super((SkipInit) null); initObject(init(effect)); }
    @Method(selector = "initWithCoder:")
    public UIVisualEffectView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithFrame:")
    public UIVisualEffectView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentView")
    public native UIView getContentView();
    @Property(selector = "effect")
    public native UIVisualEffect getEffect();
    @Property(selector = "setEffect:")
    public native void setEffect(UIVisualEffect v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEffect:")
    protected native @Pointer long init(UIVisualEffect effect);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
