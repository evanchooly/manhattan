package com.antwerkz.manhattan

import org.testng.Assert
import org.testng.annotations.Test
import org.testng.annotations.DataProvider
import java.lang.System.getProperty
import java.util.TreeSet

class SystemPropertyTest {
    @DataProvider(name = "properties")
    fun data(): Array<Array<*>> {
        return arrayOf(
                arrayOf("file.separator", SystemProperty.fileSeparator()),
                arrayOf("java.class.path", SystemProperty.classPath()),
                arrayOf("java.home", SystemProperty.home()),
                arrayOf("java.vendor", SystemProperty.vendor()),
                arrayOf("java.vendor.url", SystemProperty.vendorUrl()),
                arrayOf("java.version", SystemProperty.version()),
                arrayOf("line.separator", SystemProperty.lineSeparator()),
                arrayOf("os.arch", SystemProperty.osArch()),
                arrayOf("os.name", SystemProperty.osName()),
                arrayOf("os.version", SystemProperty.osVersion()),
                arrayOf("path.separator", SystemProperty.pathSeparator()),
                arrayOf("user.country", SystemProperty.userCountry()),
                arrayOf("user.dir", SystemProperty.userDir()),
                arrayOf("user.home", SystemProperty.userHome()),
                arrayOf("user.language", SystemProperty.userLanguage()),
                arrayOf("user.name", SystemProperty.userName()),
                arrayOf("user.timezone", SystemProperty.userTimezone()),

                arrayOf("java.io.tmpdir", SystemProperty.tempDir()),
                arrayOf("java.library.path", SystemProperty.libraryPath()),

                arrayOf("java.runtime.name", SystemProperty.runtimeName()),
                arrayOf("java.runtime.version", SystemProperty.runtimeVersion()),
                arrayOf("java.specification.name", SystemProperty.specificationName()),
                arrayOf("java.specification.vendor", SystemProperty.specificationVendor()),
                arrayOf("java.specification.version", SystemProperty.specificationVersion())
        )
    }

    @Test
    fun show() {
        TreeSet(System.getProperties()
                .keys)
                .forEach {
                    println("$it => ${getProperty(it.toString())}")
                }
    }

    @Test(dataProvider = "properties")
    fun check(property: String, value: String) {
        Assert.assertEquals(value, System.getProperty(property))
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
