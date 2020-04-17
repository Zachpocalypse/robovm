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
package org.robovm.apple.corebluetooth;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreBluetooth") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBPeripheral/*</name>*/ 
    extends /*<extends>*/CBPeer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CBPeripheralPtr extends Ptr<CBPeripheral, CBPeripheralPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CBPeripheral.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CBPeripheral() {}
    protected CBPeripheral(Handle h, long handle) { super(h, handle); }
    protected CBPeripheral(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CBPeripheralDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CBPeripheralDelegate v);
    @Property(selector = "name")
    public native String getName();
    /**
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Property(selector = "RSSI")
    public native NSNumber getRSSI();
    @Property(selector = "state")
    public native CBPeripheralState getState();
    @Property(selector = "services")
    public native NSArray<CBService> getServices();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "canSendWriteWithoutResponse")
    public native boolean canSendWriteWithoutResponse();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "ancsAuthorized")
    public native boolean isAncsAuthorized();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "readRSSI")
    public native void readRSSI();
    @Method(selector = "discoverServices:")
    public native void discoverServices(NSArray<CBUUID> serviceUUIDs);
    @Method(selector = "discoverIncludedServices:forService:")
    public native void discoverIncludedServices(NSArray<CBUUID> includedServiceUUIDs, CBService service);
    @Method(selector = "discoverCharacteristics:forService:")
    public native void discoverCharacteristics(NSArray<CBUUID> characteristicUUIDs, CBService service);
    @Method(selector = "readValueForCharacteristic:")
    public native void readValue(CBCharacteristic characteristic);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "maximumWriteValueLengthForType:")
    public native @MachineSizedUInt long maximumWriteValueLengthForType(CBCharacteristicWriteType type);
    @Method(selector = "writeValue:forCharacteristic:type:")
    public native void writeValue(NSData data, CBCharacteristic characteristic, CBCharacteristicWriteType type);
    @Method(selector = "setNotifyValue:forCharacteristic:")
    public native void setNotifyValue(boolean enabled, CBCharacteristic characteristic);
    @Method(selector = "discoverDescriptorsForCharacteristic:")
    public native void discoverDescriptors(CBCharacteristic characteristic);
    @Method(selector = "readValueForDescriptor:")
    public native void readValue(CBDescriptor descriptor);
    @Method(selector = "writeValue:forDescriptor:")
    public native void writeValue(NSData data, CBDescriptor descriptor);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "openL2CAPChannel:")
    public native void openL2CAPChannel(short PSM);
    /*</methods>*/
}
