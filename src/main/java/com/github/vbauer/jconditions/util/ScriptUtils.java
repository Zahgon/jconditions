package com.github.vbauer.jconditions.util;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

/**
 * @author Vladislav Bauer
 */
public final class ScriptUtils {

    private ScriptUtils() {
        throw new UnsupportedOperationException();
    }

    public static ScriptEngine findScriptEngine(final String engine) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void addAttribute(final ScriptContext context, final String key, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isSameEngine(final ScriptEngineFactory factory, final String engine) {
        return sameName(factory, engine) || sameLanguage(factory, engine) || sameNames(factory, engine) || sameMimeTypes(factory, engine);
    }

    private static boolean sameMimeTypes(final ScriptEngineFactory factory, final String engine) {
        final List<String> mimeTypes = factory.getMimeTypes();
        if (mimeTypes != null) {
            for (final String mimeType : mimeTypes) {
                if (TextUtils.containsIgnoreCase(mimeType, engine)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sameNames(final ScriptEngineFactory factory, final String engine) {
        final List<String> names = factory.getNames();
        if (names != null) {
            for (final String name : names) {
                if (TextUtils.containsIgnoreCase(name, engine)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sameLanguage(final ScriptEngineFactory factory, final String engine) {
        final String languageName = factory.getLanguageName();
        return TextUtils.containsIgnoreCase(languageName, engine);
    }

    private static boolean sameName(final ScriptEngineFactory factory, final String engine) {
        final String engineName = factory.getEngineName();
        return TextUtils.containsIgnoreCase(engineName, engine);
    }
}
