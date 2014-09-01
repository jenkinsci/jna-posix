package org.jruby.ext.posix;

import com.sun.jna.NativeLong;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DefaultNativeTimeval extends NativeTimeval {
    public NativeLong tv_sec;
    public NativeLong tv_usec;

    public DefaultNativeTimeval() {}

    public void setTime(long[] timeval) {
        assert timeval.length == 2;
        tv_sec.setValue(timeval[0]);
        tv_usec.setValue(timeval[1]);
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[] { 
            "tv_sec", "tv_usec"});
    }
}
