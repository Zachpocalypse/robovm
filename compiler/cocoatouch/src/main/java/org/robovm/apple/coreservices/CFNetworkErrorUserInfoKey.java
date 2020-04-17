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
package org.robovm.apple.coreservices;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFNetworkErrorUserInfoKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFNetworkErrorUserInfoKey/*</name>*/ 
    extends /*<extends>*/NSErrorUserInfoKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFNetworkErrorUserInfoKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFNetworkErrorUserInfoKey toObject(Class<CFNetworkErrorUserInfoKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFNetworkErrorUserInfoKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFNetworkErrorUserInfoKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CFNetworkErrorUserInfoKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFNetworkErrorUserInfoKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFNetworkErrorUserInfoKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFNetworkErrorUserInfoKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CFNetworkErrorUserInfoKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFNetworkErrorUserInfoKey URLErrorFailingURLError = new CFNetworkErrorUserInfoKey("URLErrorFailingURLError");
    public static final CFNetworkErrorUserInfoKey URLErrorFailingURLStringError = new CFNetworkErrorUserInfoKey("URLErrorFailingURLStringError");
    public static final CFNetworkErrorUserInfoKey GetAddrInfoFailure = new CFNetworkErrorUserInfoKey("GetAddrInfoFailure");
    public static final CFNetworkErrorUserInfoKey SOCKSStatusCode = new CFNetworkErrorUserInfoKey("SOCKSStatusCode");
    public static final CFNetworkErrorUserInfoKey SOCKSVersion = new CFNetworkErrorUserInfoKey("SOCKSVersion");
    public static final CFNetworkErrorUserInfoKey SOCKSNegotiationMethod = new CFNetworkErrorUserInfoKey("SOCKSNegotiationMethod");
    public static final CFNetworkErrorUserInfoKey DNSServiceFailure = new CFNetworkErrorUserInfoKey("DNSServiceFailure");
    public static final CFNetworkErrorUserInfoKey FTPStatusCode = new CFNetworkErrorUserInfoKey("FTPStatusCode");
    /*</constants>*/
    
    private static /*<name>*/CFNetworkErrorUserInfoKey/*</name>*/[] values = new /*<name>*/CFNetworkErrorUserInfoKey/*</name>*/[] {/*<value_list>*/URLErrorFailingURLError, URLErrorFailingURLStringError, GetAddrInfoFailure, SOCKSStatusCode, SOCKSVersion, SOCKSNegotiationMethod, DNSServiceFailure, FTPStatusCode/*</value_list>*/};
    
    /*<name>*/CFNetworkErrorUserInfoKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFNetworkErrorUserInfoKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CFNetworkErrorUserInfoKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFNetworkErrorUserInfoKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFURLErrorFailingURLErrorKey", optional=true)
        public static native NSString URLErrorFailingURLError();
        @GlobalValue(symbol="kCFURLErrorFailingURLStringErrorKey", optional=true)
        public static native NSString URLErrorFailingURLStringError();
        @GlobalValue(symbol="kCFGetAddrInfoFailureKey", optional=true)
        public static native NSString GetAddrInfoFailure();
        @GlobalValue(symbol="kCFSOCKSStatusCodeKey", optional=true)
        public static native NSString SOCKSStatusCode();
        @GlobalValue(symbol="kCFSOCKSVersionKey", optional=true)
        public static native NSString SOCKSVersion();
        @GlobalValue(symbol="kCFSOCKSNegotiationMethodKey", optional=true)
        public static native NSString SOCKSNegotiationMethod();
        @GlobalValue(symbol="kCFDNSServiceFailureKey", optional=true)
        public static native NSString DNSServiceFailure();
        @GlobalValue(symbol="kCFFTPStatusCodeKey", optional=true)
        public static native NSString FTPStatusCode();
        /*</values>*/
    }
}
