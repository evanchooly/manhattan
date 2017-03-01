package com.antwerkz.manhattan

import org.testng.Assert
import org.testng.annotations.Test
import org.testng.annotations.DataProvider

class SystemPropertyTest {
    @DataProvider(name = "properties")
    fun data(): Array<Array<*>> {
        return arrayOf(
                arrayOf<Any>("file.separator", { SystemProperty.fileSeparator() }, { name: String -> SystemProperty.fileSeparator(name) } ),
                arrayOf<Any>("java.class.path", { SystemProperty.classPath() }, { name: String -> SystemProperty.classPath(name) } ),
                arrayOf<Any>("java.home", { SystemProperty.javaHome() }, { name: String -> SystemProperty.javaHome(name) } ),
                arrayOf<Any>("java.vendor", { SystemProperty.javaVendor() }, { name: String -> SystemProperty.javaVendor(name) } ),
                arrayOf<Any>("java.vendor.url", { SystemProperty.javaVendorUrl() }, { name: String -> SystemProperty.javaVendorUrl(name) } ),
                arrayOf<Any>("java.version", { SystemProperty.javaVersion() }, { name: String -> SystemProperty.javaVersion(name) } ),
                arrayOf<Any>("line.separator", { SystemProperty.lineSeparator() }, { name: String -> SystemProperty.lineSeparator(name) } ),
                arrayOf<Any>("os.arch", { SystemProperty.osArch() }, { name: String -> SystemProperty.osArch(name) } ),
                arrayOf<Any>("os.name", { SystemProperty.osName() }, { name: String -> SystemProperty.osName(name) } ),
                arrayOf<Any>("os.version", { SystemProperty.osVersion() }, { name: String -> SystemProperty.osVersion(name) } ),
                arrayOf<Any>("path.separator", { SystemProperty.pathSeparator() }, { name: String -> SystemProperty.pathSeparator(name) } ),
                arrayOf<Any>("user.dir", { SystemProperty.userDir() }, { name: String -> SystemProperty.userDir(name) } ),
                arrayOf<Any>("user.home", { SystemProperty.userHome() }, { name: String -> SystemProperty.userHome(name) } ),
                arrayOf<Any>("user.name", { SystemProperty.userName() }, { name: String -> SystemProperty.userName(name) } )
        )
    }

    @Test(dataProvider = "properties")
    fun check(property: String, read: () -> String, set: (name: String) -> String) {
        Assert.assertEquals(read(), System.getProperty(property))
        val update = property.replace(".", " ")
        val original = set(update)

        Assert.assertEquals(read(), update)
        set(original)
        Assert.assertEquals(read(), original)
    }
}