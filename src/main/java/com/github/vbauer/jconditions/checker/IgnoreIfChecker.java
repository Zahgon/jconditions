package com.github.vbauer.jconditions.checker;

import com.github.vbauer.jconditions.annotation.IgnoreIf;
import com.github.vbauer.jconditions.core.CheckerContext;
import com.github.vbauer.jconditions.core.ConditionChecker;
import com.github.vbauer.jconditions.core.ConditionCheckerExecutor;

/**
 * @author Vladislav Bauer
 */
public class IgnoreIfChecker implements ConditionChecker<IgnoreIf> {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfied(final CheckerContext<IgnoreIf> context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
