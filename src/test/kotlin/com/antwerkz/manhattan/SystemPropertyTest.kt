package com.antwerkz.manhattan

import org.testng.Assert
import org.testng.annotations.Test
import java.lang.System.getProperty

class SystemPropertyTest {
    @Test
    fun check() {
        Assert.assertEquals(SystemProperty.fileSeparator(), getProperty("file.separator"))
        Assert.assertEquals(SystemProperty.classPath(), getProperty("java.class.path"))
        Assert.assertEquals(SystemProperty.home(), getProperty("java.home"))
        Assert.assertEquals(SystemProperty.vendor(), getProperty("java.vendor"))
        Assert.assertEquals(SystemProperty.vendorUrl(), getProperty("java.vendor.url"))
        Assert.assertEquals(SystemProperty.version(), getProperty("java.version"))
        Assert.assertEquals(SystemProperty.lineSeparator(), getProperty("line.separator"))
        Assert.assertEquals(SystemProperty.osArch(), getProperty("os.arch"))
        Assert.assertEquals(SystemProperty.osName(), getProperty("os.name"))
        Assert.assertEquals(SystemProperty.osVersion(), getProperty("os.version"))
        Assert.assertEquals(SystemProperty.pathSeparator(), getProperty("path.separator"))
        Assert.assertEquals(SystemProperty.userCountry(), getProperty("user.country"))
        Assert.assertEquals(SystemProperty.userDir(), getProperty("user.dir"))
        Assert.assertEquals(SystemProperty.userHome(), getProperty("user.home"))
        Assert.assertEquals(SystemProperty.userLanguage(), getProperty("user.language"))
        Assert.assertEquals(SystemProperty.userName(), getProperty("user.name"))
        Assert.assertEquals(SystemProperty.userTimezone(), getProperty("user.timezone"))

        Assert.assertEquals(SystemProperty.tempDir(), getProperty("java.io.tmpdir"))
        Assert.assertEquals(SystemProperty.libraryPath(), getProperty("java.library.path"))

        Assert.assertEquals(SystemProperty.runtimeName(), getProperty("java.runtime.name"))
        Assert.assertEquals(SystemProperty.runtimeVersion(), getProperty("java.runtime.version"))
        Assert.assertEquals(SystemProperty.specificationName(), getProperty("java.specification.name"))
        Assert.assertEquals(SystemProperty.specificationVendor(), getProperty("java.specification.vendor"))
        Assert.assertEquals(SystemProperty.specificationVersion(), getProperty("java.specification.version"))
    }

    @Test
    fun set() {
        var original = SystemProperty.userDir("something else")
        Assert.assertEquals(SystemProperty.userDir(), "something else")
        SystemProperty.userDir(original!!)

        original = SystemProperty.userHome("something else")
        Assert.assertEquals(SystemProperty.userHome(), "something else")
        SystemProperty.userHome(original!!)

        original = SystemProperty.userName("something else")
        Assert.assertEquals(SystemProperty.userName(), "something else")
        SystemProperty.userName(original!!)

        original = SystemProperty.userCountry("something else")
        Assert.assertEquals(SystemProperty.userCountry(), "something else")
        SystemProperty.userCountry(original!!)

        original = SystemProperty.userLanguage("something else")
        Assert.assertEquals(SystemProperty.userLanguage(), "something else")
        SystemProperty.userLanguage(original!!)

        original = SystemProperty.userTimezone("something else")
        Assert.assertEquals(SystemProperty.userTimezone(), "something else")
        SystemProperty.userTimezone(original!!)

        original = SystemProperty.tempDir("something else")
        Assert.assertEquals(SystemProperty.tempDir(), "something else")
        SystemProperty.tempDir(original!!)
    }
}
