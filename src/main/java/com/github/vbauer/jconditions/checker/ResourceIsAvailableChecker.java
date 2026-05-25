package com.github.vbauer.jconditions.checker;

import com.github.vbauer.jconditions.annotation.ResourceIsAvailable;
import com.github.vbauer.jconditions.core.CheckerContext;
import com.github.vbauer.jconditions.core.ConditionChecker;
import com.github.vbauer.jconditions.util.FSUtils;
import com.github.vbauer.jconditions.util.NetUtils;
import com.github.vbauer.jconditions.util.PropUtils;
import java.io.File;
import java.net.URLConnection;

/**
 * @author Vladislav Bauer
 */
public class ResourceIsAvailableChecker implements ConditionChecker<ResourceIsAvailable> {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfied(final CheckerContext<ResourceIsAvailable> context) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
