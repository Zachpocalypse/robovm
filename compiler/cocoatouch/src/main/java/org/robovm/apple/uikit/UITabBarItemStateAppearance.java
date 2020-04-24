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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabBarItemStateAppearance/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITabBarItemStateAppearancePtr extends Ptr<UITabBarItemStateAppearance, UITabBarItemStateAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabBarItemStateAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITabBarItemStateAppearance() {}
    protected UITabBarItemStateAppearance(Handle h, long handle) { super(h, handle); }
    protected UITabBarItemStateAppearance(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleTextAttributes")
    public native NSDictionary<NSString, ?> getTitleTextAttributes();
    @Property(selector = "setTitleTextAttributes:")
    public native void setTitleTextAttributes(NSDictionary<NSString, ?> v);
    @Property(selector = "titlePositionAdjustment")
    public native @ByVal UIOffset getTitlePositionAdjustment();
    @Property(selector = "setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByVal UIOffset v);
    @Property(selector = "iconColor")
    public native UIColor getIconColor();
    @Property(selector = "setIconColor:")
    public native void setIconColor(UIColor v);
    @Property(selector = "badgePositionAdjustment")
    public native @ByVal UIOffset getBadgePositionAdjustment();
    @Property(selector = "setBadgePositionAdjustment:")
    public native void setBadgePositionAdjustment(@ByVal UIOffset v);
    @Property(selector = "badgeBackgroundColor")
    public native UIColor getBadgeBackgroundColor();
    @Property(selector = "setBadgeBackgroundColor:")
    public native void setBadgeBackgroundColor(UIColor v);
    @Property(selector = "badgeTextAttributes")
    public native NSDictionary<NSString, ?> getBadgeTextAttributes();
    @Property(selector = "setBadgeTextAttributes:")
    public native void setBadgeTextAttributes(NSDictionary<NSString, ?> v);
    @Property(selector = "badgeTitlePositionAdjustment")
    public native @ByVal UIOffset getBadgeTitlePositionAdjustment();
    @Property(selector = "setBadgeTitlePositionAdjustment:")
    public native void setBadgeTitlePositionAdjustment(@ByVal UIOffset v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}