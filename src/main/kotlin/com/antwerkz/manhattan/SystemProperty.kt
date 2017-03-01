package com.antwerkz.manhattan

import java.lang.System.getProperty
import java.lang.System.setProperty

object SystemProperty {
    /**
     * Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
     */
    fun fileSeparator(): String? = getProperty("file.separator")

    /**
     * Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a
     * platform-specific character specified in the path.separator property.
     */
    fun classPath(): String? = getProperty("java.class.path")

    /**
     * Installation directory for Java Runtime Environment (JRE)
     */
    fun home(): String? = getProperty("java.home")

    fun libraryPath(): String? = getProperty("java.library.path")

    /**
     * Sequence used by operating system to separate lines in text files
     */
    fun lineSeparator(): String? = getProperty("line.separator")

    /**
     * Operating system architecture
     */
    fun osArch(): String? = getProperty("os.arch")

    /**
     * Operating system name
     */
    fun osName(): String? = getProperty("os.name")

    /**
     * Operating system version
     */
    fun osVersion(): String? = getProperty("os.version")

    /**
     * Path separator character used in java.class.path
     */
    fun pathSeparator(): String? = getProperty("path.separator")

    /**
     * User working directory
     */
    fun userDir(): String? = getProperty("user.dir")
    fun userDir(value: String): String? = setProperty("user.dir", value)

    /**
     * User home directory
     */
    fun userHome(): String? = getProperty("user.home")
    fun userHome(value: String): String? = setProperty("user.home", value)

    /**
     * User account name
     */
    fun userName(): String? = getProperty("user.name")
    fun userName(value: String): String? = setProperty("user.name", value)

    fun userCountry(): String? = getProperty("user.country")
    fun userCountry(value: String): String? = setProperty("user.country", value)

    fun userLanguage(): String? = getProperty("user.language")
    fun userLanguage(value: String): String? = setProperty("user.language", value)

    fun userTimezone(): String? = getProperty("user.timezone")
    fun userTimezone(value: String): String? = setProperty("user.timezone", value)

    fun tempDir(): String? = getProperty("java.io.tmpdir")
    fun tempDir(value: String): String? = setProperty("java.io.tmpdir", value)

    fun runtimeName(): String? = getProperty("java.runtime.name")
    fun runtimeVersion(): String? = getProperty("java.runtime.version")
    fun specificationName(): String? = getProperty("java.specification.name")
    fun specificationVendor(): String? = getProperty("java.specification.vendor")
    fun specificationVersion(): String? = getProperty("java.specification.version")

    /**
     * JRE vendor name
     */
    fun vendor(): String? = getProperty("java.vendor")

    /**
     * JRE vendor URL
     */
    fun vendorUrl(): String? = getProperty("java.vendor.url")

    /**
     * JRE version number
     */
    fun version(): String? = getProperty("java.version")
}
