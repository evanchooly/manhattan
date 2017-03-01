package com.antwerkz.manhattan

import java.lang.System.getProperty
import java.lang.System.setProperty

object SystemProperty {
    /**
     * Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
     */
    @JvmStatic fun fileSeparator(): String? = getProperty("file.separator")

    /**
     * Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a
     * platform-specific character specified in the path.separator property.
     */
    @JvmStatic fun classPath(): String? = getProperty("java.class.path")

    /**
     * Installation directory for Java Runtime Environment (JRE)
     */
    @JvmStatic fun home(): String? = getProperty("java.home")

    @JvmStatic fun libraryPath(): String? = getProperty("java.library.path")

    /**
     * Sequence used by operating system to separate lines in text files
     */
    @JvmStatic fun lineSeparator(): String? = getProperty("line.separator")

    /**
     * Operating system architecture
     */
    @JvmStatic fun osArch(): String? = getProperty("os.arch")

    /**
     * Operating system name
     */
    @JvmStatic fun osName(): String? = getProperty("os.name")

    /**
     * Operating system version
     */
    @JvmStatic fun osVersion(): String? = getProperty("os.version")

    /**
     * Path separator character used in java.class.path
     */
    @JvmStatic fun pathSeparator(): String? = getProperty("path.separator")

    /**
     * User working directory
     */
    @JvmStatic fun userDir(): String? = getProperty("user.dir")

    @JvmStatic fun userDir(value: String): String? = setProperty("user.dir", value)

    /**
     * User home directory
     */
    @JvmStatic fun userHome(): String? = getProperty("user.home")

    @JvmStatic fun userHome(value: String): String? = setProperty("user.home", value)

    /**
     * User account name
     */
    @JvmStatic fun userName(): String? = getProperty("user.name")

    @JvmStatic fun userName(value: String): String? = setProperty("user.name", value)

    @JvmStatic fun userCountry(): String? = getProperty("user.country")
    @JvmStatic fun userCountry(value: String): String? = setProperty("user.country", value)

    @JvmStatic fun userLanguage(): String? = getProperty("user.language")
    @JvmStatic fun userLanguage(value: String): String? = setProperty("user.language", value)

    @JvmStatic fun userTimezone(): String? = getProperty("user.timezone")
    @JvmStatic fun userTimezone(value: String): String? = setProperty("user.timezone", value)

    @JvmStatic fun tempDir(): String? = getProperty("java.io.tmpdir")
    @JvmStatic fun tempDir(value: String): String? = setProperty("java.io.tmpdir", value)

    @JvmStatic fun runtimeName(): String? = getProperty("java.runtime.name")
    @JvmStatic fun runtimeVersion(): String? = getProperty("java.runtime.version")
    @JvmStatic fun specificationName(): String? = getProperty("java.specification.name")
    @JvmStatic fun specificationVendor(): String? = getProperty("java.specification.vendor")
    @JvmStatic fun specificationVersion(): String? = getProperty("java.specification.version")

    /**
     * JRE vendor name
     */
    @JvmStatic fun vendor(): String? = getProperty("java.vendor")

    /**
     * JRE vendor URL
     */
    @JvmStatic fun vendorUrl(): String? = getProperty("java.vendor.url")

    /**
     * JRE version number
     */
    @JvmStatic fun version(): String? = getProperty("java.version")
}
