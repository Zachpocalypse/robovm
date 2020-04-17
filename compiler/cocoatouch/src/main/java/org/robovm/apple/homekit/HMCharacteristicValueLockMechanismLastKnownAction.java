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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/HMCharacteristicValueLockMechanismLastKnownAction/*</name>*/ implements ValuedEnum {
    /*<values>*/
    SecuredUsingPhysicalMovementInterior(0L),
    UnsecuredUsingPhysicalMovementInterior(1L),
    SecuredUsingPhysicalMovementExterior(2L),
    UnsecuredUsingPhysicalMovementExterior(3L),
    SecuredWithKeypad(4L),
    UnsecuredWithKeypad(5L),
    SecuredRemotely(6L),
    UnsecuredRemotely(7L),
    SecuredWithAutomaticSecureTimeout(8L),
    SecuredUsingPhysicalMovement(9L),
    UnsecuredUsingPhysicalMovement(10L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/HMCharacteristicValueLockMechanismLastKnownAction/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/HMCharacteristicValueLockMechanismLastKnownAction/*</name>*/ valueOf(long n) {
        for (/*<name>*/HMCharacteristicValueLockMechanismLastKnownAction/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/HMCharacteristicValueLockMechanismLastKnownAction/*</name>*/.class.getName());
    }
}
