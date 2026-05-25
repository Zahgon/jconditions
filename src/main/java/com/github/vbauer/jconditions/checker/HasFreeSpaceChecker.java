package com.github.vbauer.jconditions.checker;

import com.github.vbauer.jconditions.annotation.HasFreeSpace;
import com.github.vbauer.jconditions.core.CheckerContext;
import com.github.vbauer.jconditions.core.ConditionChecker;
import java.io.File;

/**
 * @author Vladislav Bauer
 */
public class HasFreeSpaceChecker implements ConditionChecker<HasFreeSpace> {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfied(final CheckerContext<HasFreeSpace> context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isSatisfied(final String[] targets, final long min, final long max) {
        for (final String target : targets) {
            if (!isSatisfied(target, max, min)) {
                return false;
            }
        }
        return targets.length > 0;
    }

    private boolean isSatisfied(final String target, final long max, final long min) {
        final File file = new File(target);
        if (file.exists()) {
            final long freeSpace = file.getFreeSpace();
            if (min != HasFreeSpace.UNDEFINED && freeSpace < min) {
                return false;
            }
            return max == HasFreeSpace.UNDEFINED || freeSpace <= max;
        }
        return true;
    }
}
