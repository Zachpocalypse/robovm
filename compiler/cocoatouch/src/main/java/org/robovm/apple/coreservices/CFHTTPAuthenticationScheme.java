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
@Marshaler(/*<name>*/CFHTTPAuthenticationScheme/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFHTTPAuthenticationScheme/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFHTTPAuthenticationScheme/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFHTTPAuthenticationScheme toObject(Class<CFHTTPAuthenticationScheme> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFHTTPAuthenticationScheme.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFHTTPAuthenticationScheme o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFHTTPAuthenticationScheme> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFHTTPAuthenticationScheme> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFHTTPAuthenticationScheme.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFHTTPAuthenticationScheme> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFHTTPAuthenticationScheme o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFHTTPAuthenticationScheme Basic = new CFHTTPAuthenticationScheme("Basic");
    public static final CFHTTPAuthenticationScheme Digest = new CFHTTPAuthenticationScheme("Digest");
    public static final CFHTTPAuthenticationScheme NTLM = new CFHTTPAuthenticationScheme("NTLM");
    public static final CFHTTPAuthenticationScheme Kerberos = new CFHTTPAuthenticationScheme("Kerberos");
    public static final CFHTTPAuthenticationScheme Negotiate = new CFHTTPAuthenticationScheme("Negotiate");
    public static final CFHTTPAuthenticationScheme Negotiate2 = new CFHTTPAuthenticationScheme("Negotiate2");
    public static final CFHTTPAuthenticationScheme XMobileMeAuthToken = new CFHTTPAuthenticationScheme("XMobileMeAuthToken");
    /*</constants>*/
    
    private static /*<name>*/CFHTTPAuthenticationScheme/*</name>*/[] values = new /*<name>*/CFHTTPAuthenticationScheme/*</name>*/[] {/*<value_list>*/Basic, Digest, NTLM, Kerberos, Negotiate, Negotiate2, XMobileMeAuthToken/*</value_list>*/};
    
    /*<name>*/CFHTTPAuthenticationScheme/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFHTTPAuthenticationScheme/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFHTTPAuthenticationScheme/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFHTTPAuthenticationScheme/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeBasic", optional=true)
        public static native CFString Basic();
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeDigest", optional=true)
        public static native CFString Digest();
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeNTLM", optional=true)
        public static native CFString NTLM();
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeKerberos", optional=true)
        public static native CFString Kerberos();
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeNegotiate", optional=true)
        public static native CFString Negotiate();
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeNegotiate2", optional=true)
        public static native CFString Negotiate2();
        @GlobalValue(symbol="kCFHTTPAuthenticationSchemeXMobileMeAuthToken", optional=true)
        public static native CFString XMobileMeAuthToken();
        /*</values>*/
    }
}
