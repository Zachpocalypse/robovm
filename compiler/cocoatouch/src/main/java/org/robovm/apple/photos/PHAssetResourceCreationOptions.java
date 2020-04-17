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
package org.robovm.apple.photos;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHAssetResourceCreationOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHAssetResourceCreationOptionsPtr extends Ptr<PHAssetResourceCreationOptions, PHAssetResourceCreationOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHAssetResourceCreationOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHAssetResourceCreationOptions() {}
    protected PHAssetResourceCreationOptions(Handle h, long handle) { super(h, handle); }
    protected PHAssetResourceCreationOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "originalFilename")
    public native String getOriginalFilename();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setOriginalFilename:")
    public native void setOriginalFilename(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniformTypeIdentifier")
    public native String getUniformTypeIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setUniformTypeIdentifier:")
    public native void setUniformTypeIdentifier(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "shouldMoveFile")
    public native boolean shouldMoveFile();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShouldMoveFile:")
    public native void setShouldMoveFile(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
