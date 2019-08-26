package cn.itcast.demo03_filter;

import java.io.File;

public class FileFilterImpl implements java.io.FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }

        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}
