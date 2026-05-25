package com.github.vbauer.jconditions.core.junit;

import com.github.vbauer.jconditions.core.ConditionChecker;
import com.github.vbauer.jconditions.core.ConditionCheckerEngine;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/**
 * @see MethodRule
 * @author Vladislav Bauer
 */
public class ConditionRule implements MethodRule {

    /**
     * {@inheritDoc}
     */
    @Override
    public Statement apply(final Statement base, final FrameworkMethod method, final Object target) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
