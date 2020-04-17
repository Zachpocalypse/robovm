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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSIntersectionDistancePrimitiveIndexInstanceIndex/*</name>*/ 
    extends /*<extends>*/Struct<MPSIntersectionDistancePrimitiveIndexInstanceIndex>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSIntersectionDistancePrimitiveIndexInstanceIndexPtr extends Ptr<MPSIntersectionDistancePrimitiveIndexInstanceIndex, MPSIntersectionDistancePrimitiveIndexInstanceIndexPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSIntersectionDistancePrimitiveIndexInstanceIndex() {}
    public MPSIntersectionDistancePrimitiveIndexInstanceIndex(float distance, int primitiveIndex, int instanceIndex) {
        this.setDistance(distance);
        this.setPrimitiveIndex(primitiveIndex);
        this.setInstanceIndex(instanceIndex);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native float getDistance();
    @StructMember(0) public native MPSIntersectionDistancePrimitiveIndexInstanceIndex setDistance(float distance);
    @StructMember(1) public native int getPrimitiveIndex();
    @StructMember(1) public native MPSIntersectionDistancePrimitiveIndexInstanceIndex setPrimitiveIndex(int primitiveIndex);
    @StructMember(2) public native int getInstanceIndex();
    @StructMember(2) public native MPSIntersectionDistancePrimitiveIndexInstanceIndex setInstanceIndex(int instanceIndex);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
