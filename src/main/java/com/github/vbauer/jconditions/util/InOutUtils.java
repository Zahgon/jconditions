package com.github.vbauer.jconditions.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Vladislav Bauer
 */
public final class InOutUtils {

    private static final int BUFFER_SIZE = 1024;

    private static final int EOF = -1;

    private InOutUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean closeQuietly(final Closeable closeable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void copy(final InputStream input, final OutputStream output) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
