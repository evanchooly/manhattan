package com.antwerkz.manhattan.test;

import com.antwerkz.manhattan.SystemProperty;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.antwerkz.manhattan.SystemProperty.getClassPath;
import static com.antwerkz.manhattan.SystemProperty.getFileSeparator;
import static com.antwerkz.manhattan.SystemProperty.getHome;
import static com.antwerkz.manhattan.SystemProperty.getLibraryPath;
import static com.antwerkz.manhattan.SystemProperty.getLineSeparator;
import static com.antwerkz.manhattan.SystemProperty.getOsArch;
import static com.antwerkz.manhattan.SystemProperty.getOsName;
import static com.antwerkz.manhattan.SystemProperty.getOsVersion;
import static com.antwerkz.manhattan.SystemProperty.getPathSeparator;
import static com.antwerkz.manhattan.SystemProperty.getRuntimeName;
import static com.antwerkz.manhattan.SystemProperty.getRuntimeVersion;
import static com.antwerkz.manhattan.SystemProperty.getSpecificationName;
import static com.antwerkz.manhattan.SystemProperty.getSpecificationVendor;
import static com.antwerkz.manhattan.SystemProperty.getSpecificationVersion;
import static com.antwerkz.manhattan.SystemProperty.getTempDir;
import static com.antwerkz.manhattan.SystemProperty.getUserCountry;
import static com.antwerkz.manhattan.SystemProperty.getUserDir;
import static com.antwerkz.manhattan.SystemProperty.getUserHome;
import static com.antwerkz.manhattan.SystemProperty.getUserLanguage;
import static com.antwerkz.manhattan.SystemProperty.getUserName;
import static com.antwerkz.manhattan.SystemProperty.getUserTimezone;
import static com.antwerkz.manhattan.SystemProperty.getVendor;
import static com.antwerkz.manhattan.SystemProperty.getVendorUrl;
import static com.antwerkz.manhattan.SystemProperty.getVersion;
import static java.lang.System.getProperty;

public class SystemPropertyJavaTest {
    @Test
    public void check() {
        Assert.assertEquals(getFileSeparator(), getProperty("file.separator"));
        Assert.assertEquals(getClassPath(), getProperty("java.class.path"));
        Assert.assertEquals(getHome(), getProperty("java.home"));
        Assert.assertEquals(getVendor(), getProperty("java.vendor"));
        Assert.assertEquals(getVendorUrl(), getProperty("java.vendor.url"));
        Assert.assertEquals(getVersion(), getProperty("java.version"));
        Assert.assertEquals(getLineSeparator(), getProperty("line.separator"));
        Assert.assertEquals(getOsArch(), getProperty("os.arch"));
        Assert.assertEquals(getOsName(), getProperty("os.name"));
        Assert.assertEquals(getOsVersion(), getProperty("os.version"));
        Assert.assertEquals(getPathSeparator(), getProperty("path.separator"));
        Assert.assertEquals(getUserCountry(), getProperty("user.country"));
        Assert.assertEquals(getUserDir(), getProperty("user.dir"));
        Assert.assertEquals(getUserHome(), getProperty("user.home"));
        Assert.assertEquals(getUserLanguage(), getProperty("user.language"));
        Assert.assertEquals(getUserName(), getProperty("user.name"));
        Assert.assertEquals(getUserTimezone(), getProperty("user.timezone"));

        Assert.assertEquals(getTempDir(), getProperty("java.io.tmpdir"));
        Assert.assertEquals(getLibraryPath(), getProperty("java.library.path"));

        Assert.assertEquals(getRuntimeName(), getProperty("java.runtime.name"));
        Assert.assertEquals(getRuntimeVersion(), getProperty("java.runtime.version"));
        Assert.assertEquals(getSpecificationName(), getProperty("java.specification.name"));
        Assert.assertEquals(getSpecificationVendor(), getProperty("java.specification.vendor"));
        Assert.assertEquals(getSpecificationVersion(), getProperty("java.specification.version"));
    }

    @Test
    public void set() {
        SystemProperty.setUserDir("something else");
        Assert.assertEquals(getUserDir(), "something else");

        SystemProperty.setUserHome("something else");
        Assert.assertEquals(getUserHome(), "something else");

        SystemProperty.setUserName("something else");
        Assert.assertEquals(getUserName(), "something else");

        SystemProperty.setUserCountry("something else");
        Assert.assertEquals(getUserCountry(), "something else");

        SystemProperty.setUserLanguage("something else");
        Assert.assertEquals(getUserLanguage(), "something else");

        SystemProperty.setUserTimezone("something else");
        Assert.assertEquals(getUserTimezone(), "something else");

        SystemProperty.setTempDir("something else");
        Assert.assertEquals(getTempDir(), "something else");
    }
}
