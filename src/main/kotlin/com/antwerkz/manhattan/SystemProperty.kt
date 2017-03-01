package com.antwerkz.manhattan

import java.lang.System.getProperty

object SystemProperty {
    /**
     * Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
     */
    fun fileSeparator() = getProperty("file.separator")

    /**
     * Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a
     * platform-specific character specified in the path.separator property.
     */
    fun classPath() = getProperty("java.class.path")

    /**
     * Installation directory for Java Runtime Environment (JRE)
     */
    fun javaHome() = getProperty("java.home")

    /**
     * JRE vendor name
     */
    fun javaVendor() = getProperty("java.vendor")

    /**
     * JRE vendor URL
     */
    fun javaVendorUrl() = getProperty("java.vendor.url")

    /**
     * JRE version number
     */
    fun javaVersion() = getProperty("java.version")

    /**
     * Sequence used by operating system to separate lines in text files
     */
    fun lineSeparator() = getProperty("line.separator")

    /**
     * Operating system architecture
     */
    fun osArch() = getProperty("os.arch")

    /**
     * Operating system name
     */
    fun osName() = getProperty("os.name")

    /**
     * Operating system version
     */
    fun osVersion() = getProperty("os.version")

    /**
     * Path separator character used in java.class.path
     */
    fun pathSeparator() = getProperty("path.separator")

    /**
     * User working directory
     */
    fun userDir() = getProperty("user.dir")

    /**
     * User home directory
     */
    fun userHome() = getProperty("user.home")

    /**
     * User account name
     */
    fun userName() = getProperty("user.name")
}