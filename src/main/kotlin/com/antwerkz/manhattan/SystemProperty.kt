package com.antwerkz.manhattan

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

object SystemProperty {
    private fun systemProperty(key: String) = object : ReadWriteProperty<Any, String?> {
        override fun setValue(thisRef: Any, property: KProperty<*>, value: String?) { System.setProperty(key, value) }
        override fun getValue(thisRef: Any, property: KProperty<*>) = System.getProperty(key)
    }
  
    /**
     * Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
     */
    @JvmStatic val fileSeparator: String by systemProperty("file.separator")

    /**
     * Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a
     * platform-specific character specified in the path.separator property.
     */
    @JvmStatic val classPath: String by systemProperty("java.class.path")

    /**
     * Installation directory for Java Runtime Environment (JRE)
     */
    @JvmStatic val home: String? by systemProperty("java.home")

    @JvmStatic val libraryPath: String by systemProperty("java.library.path")

    /**
     * Sequence used by operating system to separate lines in text files
     */
    @JvmStatic val lineSeparator: String by systemProperty("line.separator")

    /**
     * Operating system architecture
     */
    @JvmStatic val osArch: String by systemProperty("os.arch")

    /**
     * Operating system name
     */
    @JvmStatic val osName: String by systemProperty("os.name")

    /**
     * Operating system version
     */
    @JvmStatic val osVersion: String by systemProperty("os.version")

    /**
     * Path separator character used in java.class.path
     */
    @JvmStatic val pathSeparator: String by systemProperty("path.separator")

    /**
     * User working directory
     */
    @JvmStatic var userDir: String by systemProperty("user.dir")

    /**
     * User home directory
     */
    @JvmStatic var userHome: String by systemProperty("user.home")

    /**
     * User account name
     */
    @JvmStatic var userName: String by systemProperty("user.name")

    @JvmStatic var userCountry: String by systemProperty("user.country")

    @JvmStatic var userLanguage: String by systemProperty("user.language")

    @JvmStatic var userTimezone: String by systemProperty("user.timezone")

    @JvmStatic var tempDir: String by systemProperty("java.io.tmpdir")

    @JvmStatic val runtimeName: String by systemProperty("java.runtime.name")
    @JvmStatic val runtimeVersion: String by systemProperty("java.runtime.version")
    @JvmStatic val specificationName: String by systemProperty("java.specification.name")
    @JvmStatic val specificationVendor: String by systemProperty("java.specification.vendor")
    @JvmStatic val specificationVersion: String by systemProperty("java.specification.version")

    /**
     * JRE vendor name
     */
    @JvmStatic val vendor: String by systemProperty("java.vendor")

    /**
     * JRE vendor URL
     */
    @JvmStatic val vendorUrl: String by systemProperty("java.vendor.url")

    /**
     * JRE version number
     */
    @JvmStatic val version: String by systemProperty("java.version")
}
