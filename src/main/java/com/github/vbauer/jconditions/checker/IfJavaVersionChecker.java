package com.github.vbauer.jconditions.checker;

import com.github.vbauer.jconditions.annotation.IfJavaVersion;
import com.github.vbauer.jconditions.core.CheckerContext;
import com.github.vbauer.jconditions.core.ConditionChecker;
import com.github.vbauer.jconditions.util.PropUtils;

/**
 * @author Vladislav Bauer
 */
public class IfJavaVersionChecker implements ConditionChecker<IfJavaVersion> {

    private static final String PROPERTY_JAVA_VERSION = "java.version";

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfied(final CheckerContext<IfJavaVersion> context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String javaVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
