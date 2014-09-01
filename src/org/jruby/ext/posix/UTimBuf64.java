package org.jruby.ext.posix;

import com.sun.jna.Structure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UTimBuf64 extends Structure {
    public long actime;
    public long modtime;

    public UTimBuf64(long actime, long modtime) {
        this.actime = actime;
        this.modtime = modtime;
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[] { "actime", "modtime" }); 
    }
}
