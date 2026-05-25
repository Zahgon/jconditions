package com.github.vbauer.jconditions.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Vladislav Bauer
 */
public final class NetUtils {

    private static final String HTTP_PREFIX = "http://";

    private NetUtils() {
        throw new UnsupportedOperationException();
    }

    public static String fixScheme(final String address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static File copyURLContentToFile(final URLConnection connection, final String target) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static URLConnection connectURL(final String uri, final int timeout) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
