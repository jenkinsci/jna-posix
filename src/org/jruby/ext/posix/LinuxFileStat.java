package org.jruby.ext.posix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinuxFileStat extends BaseNativeFileStat {
    public long st_dev;
    public short __pad1;
    public int st_ino;
    public int st_mode;
    public int st_nlink;
    public int st_uid;
    public int st_gid;
    public long st_rdev;
    public short __pad2;
    public int st_size;
    public int st_blksize;
    public int st_blocks;
    public int st_atime;     // Time of last access (time_t)
    public int st_atimensec; // Time of last access (nanoseconds)
    public int st_mtime;     // Last data modification time (time_t)
    public int st_mtimensec; // Last data modification time (nanoseconds)
    public int st_ctime;     // Time of last status change (time_t)
    public int st_ctimensec; // Time of last status change (nanoseconds)
    public int __unused4;
    public int __unused5;

    public LinuxFileStat(POSIX posix) {
        super(posix);
    }

    public long atime() {
        return st_atime;
    }

    public long blockSize() {
        return st_blksize;
    }

    public long blocks() {
        return st_blocks;
    }

    public long ctime() {
        return st_ctime;
    }

    public long dev() {
        return st_dev;
    }

    public int gid() {
        return st_gid;
    }

    public long ino() {
        return st_ino;
    }

    public int mode() {
        return st_mode;
    }

    public long mtime() {
        return st_mtime;
    }

    public int nlink() {
        return st_nlink;
    }

    public long rdev() {
        return st_rdev;
    }

    public long st_size() {
        return st_size;
    }

    public int uid() {
        return st_uid;
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[] {
            "st_dev", "__pad1", "st_ino", "st_mode", "st_nlink", "st_uid",
            "st_gid", "st_rdev", "__pad2", "st_size", "st_blksize",
            "st_blocks", "st_atime", "st_atimensec", "st_mtime",
            "st_mtimensec"});
    }
}
