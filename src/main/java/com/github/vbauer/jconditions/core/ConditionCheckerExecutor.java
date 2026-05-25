package com.github.vbauer.jconditions.core;

import com.github.vbauer.jconditions.util.ReflexUtils;

/**
 * @author Vladislav Bauer
 */
public final class ConditionCheckerExecutor {

    private ConditionCheckerExecutor() {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    @SuppressWarnings("rawtypes")
    public static boolean isSatisfied(final CheckerContext<?> context, final Class<? extends ConditionChecker>... checkerClasses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("rawtypes")
    public static boolean isSatisfied(final CheckerContext context, final Class<? extends ConditionChecker> checkerClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static boolean isSatisfied(final CheckerContext context, final ConditionChecker checker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
