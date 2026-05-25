package com.github.vbauer.jconditions.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Vladislav Bauer
 */
public final class PropUtils {

    private static final String VAR_PREFIX = "${";

    private static final String VAR_POSTFIX = "}";

    private PropUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getSystemProperty(final String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Map<String, String> getSystemProperties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Map<String, String> convertPropertiesToMap(final Properties properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String injectProperties(final String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean hasAnyWithProperties(final String value, final String... variants) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
