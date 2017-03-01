package com.antwerkz.manhattan

import org.testng.Assert
import org.testng.annotations.Test
import java.lang.System.getProperty

class SystemPropertyTest {
    @Test
    fun check() {
        Assert.assertEquals(fileSeparator(), getProperty("file.separator"))
        Assert.assertEquals(classPath(), getProperty("java.class.path"))
        Assert.assertEquals(home(), getProperty("java.home"))
        Assert.assertEquals(vendor(), getProperty("java.vendor"))
        Assert.assertEquals(vendorUrl(), getProperty("java.vendor.url"))
        Assert.assertEquals(version(), getProperty("java.version"))
        Assert.assertEquals(lineSeparator(), getProperty("line.separator"))
        Assert.assertEquals(osArch(), getProperty("os.arch"))
        Assert.assertEquals(osName(), getProperty("os.name"))
        Assert.assertEquals(osVersion(), getProperty("os.version"))
        Assert.assertEquals(pathSeparator(), getProperty("path.separator"))
        Assert.assertEquals(userCountry(), getProperty("user.country"))
        Assert.assertEquals(userDir(), getProperty("user.dir"))
        Assert.assertEquals(userHome(), getProperty("user.home"))
        Assert.assertEquals(userLanguage(), getProperty("user.language"))
        Assert.assertEquals(userName(), getProperty("user.name"))
        Assert.assertEquals(userTimezone(), getProperty("user.timezone"))

        Assert.assertEquals(tempDir(), getProperty("java.io.tmpdir"))
        Assert.assertEquals(libraryPath(), getProperty("java.library.path"))

        Assert.assertEquals(runtimeName(), getProperty("java.runtime.name"))
        Assert.assertEquals(runtimeVersion(), getProperty("java.runtime.version"))
        Assert.assertEquals(specificationName(), getProperty("java.specification.name"))
        Assert.assertEquals(specificationVendor(), getProperty("java.specification.vendor"))
        Assert.assertEquals(specificationVersion(), getProperty("java.specification.version"))
    }

    @Test
    fun set() {
        var original = userDir("something else")
        Assert.assertEquals(userDir(), "something else")
        userDir(original!!)

        original = userHome("something else")
        Assert.assertEquals(userHome(), "something else")
        userHome(original!!)

        original = userName("something else")
        Assert.assertEquals(userName(), "something else")
        userName(original!!)

        original = userCountry("something else")
        Assert.assertEquals(userCountry(), "something else")
        userCountry(original!!)

        original = userLanguage("something else")
        Assert.assertEquals(userLanguage(), "something else")
        userLanguage(original!!)

        original = userTimezone("something else")
        Assert.assertEquals(userTimezone(), "something else")
        userTimezone(original!!)

        original = tempDir("something else")
        Assert.assertEquals(tempDir(), "something else")
        tempDir(original!!)
    }
}
