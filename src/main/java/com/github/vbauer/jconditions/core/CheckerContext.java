package com.github.vbauer.jconditions.core;

/**
 * @param <T> type of context object
 * @author Vladislav Bauer
 */
public class CheckerContext<T> {

    private final Object instance;

    private final T annotation;

    public CheckerContext(final Object instance, final T annotation) {
        this.instance = instance;
        this.annotation = annotation;
    }

    public Object getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T getAnnotation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
