package com.antwerkz.manhattan

import org.testng.Assert
import org.testng.annotations.Test
import org.testng.annotations.DataProvider

class SystemPropertyTest {
    @DataProvider(name = "properties")
    fun data(): Array<Array<*>> {
        return arrayOf(
                arrayOf("file.separator", SystemProperty.fileSeparator()),
                arrayOf("java.class.path", SystemProperty.classPath()),
                arrayOf("java.home", SystemProperty.javaHome()),
                arrayOf("java.vendor", SystemProperty.javaVendor()),
                arrayOf("java.vendor.url", SystemProperty.javaVendorUrl()),
                arrayOf("java.version", SystemProperty.javaVersion()),
                arrayOf("line.separator", SystemProperty.lineSeparator()),
                arrayOf("os.arch", SystemProperty.osArch()),
                arrayOf("os.name", SystemProperty.osName()),
                arrayOf("os.version", SystemProperty.osVersion()),
                arrayOf("path.separator", SystemProperty.pathSeparator()),
                arrayOf("user.dir", SystemProperty.userDir()),
                arrayOf("user.home", SystemProperty.userHome()),
                arrayOf("user.name", SystemProperty.userName())
        )
    }

    @Test(dataProvider = "properties")
    fun compare(property: String, value: String) {
        Assert.assertEquals(value, System.getProperty(property))
    }
}