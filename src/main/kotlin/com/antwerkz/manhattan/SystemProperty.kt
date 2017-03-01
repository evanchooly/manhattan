package com.antwerkz.manhattan

import java.lang.System.getProperty
import java.lang.System.setProperty

object SystemProperty {
    /**
     * Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
     */
    fun fileSeparator(): String? = getProperty("file.separator")
    fun fileSeparator(value: String): String? = setProperty("file.separator", value)

    /**
     * Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a
     * platform-specific character specified in the path.separator property.
     */
    fun classPath(): String? = getProperty("java.class.path")
    fun classPath(value: String): String? = setProperty("java.class.path", value)

    /**
     * Installation directory for Java Runtime Environment (JRE)
     */
    fun javaHome(): String? = getProperty("java.home")
    fun javaHome(value: String): String? = setProperty("java.home", value)

    /**
     * JRE vendor name
     */
    fun javaVendor(): String? = getProperty("java.vendor")
    fun javaVendor(value: String): String? = setProperty("java.vendor", value)

    /**
     * JRE vendor URL
     */
    fun javaVendorUrl(): String? = getProperty("java.vendor.url")
    fun javaVendorUrl(value: String): String? = setProperty("java.vendor.url", value)

    /**
     * JRE version number
     */
    fun javaVersion(): String? = getProperty("java.version")
    fun javaVersion(value: String): String? = setProperty("java.version", value)

    /**
     * Sequence used by operating system to separate lines in text files
     */
    fun lineSeparator(): String? = getProperty("line.separator")
    fun lineSeparator(value: String): String? = setProperty("line.separator", value)

    /**
     * Operating system architecture
     */
    fun osArch(): String? = getProperty("os.arch")
    fun osArch(value: String): String? = setProperty("os.arch", value)

    /**
     * Operating system name
     */
    fun osName(): String? = getProperty("os.name")
    fun osName(value: String): String? = setProperty("os.name", value)

    /**
     * Operating system version
     */
    fun osVersion(): String? = getProperty("os.version")
    fun osVersion(value: String): String? = setProperty("os.version", value)

    /**
     * Path separator character used in java.class.path
     */
    fun pathSeparator(): String? = getProperty("path.separator")
    fun pathSeparator(value: String): String? = setProperty("path.separator", value)

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
}