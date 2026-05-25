package com.github.vbauer.jconditions.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Vladislav Bauer
 */
public final class ReflexUtils {

    private static final String PACKAGE_JAVA_LANG_ANNOTATION = "java.lang.annotation";

    private ReflexUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isInJavaLangAnnotationPackage(final Annotation annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <T> T getFieldValue(final Object object, final String fieldName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends AccessibleObject> T makeAccessible(final T object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Collection<Annotation> findAllAnnotations(final Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T instantiate(final Object instance, final Class<T> checkerClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T> T instantiateImpl(final Object instance, final Class<T> clazz) throws Exception {
        if (clazz.isMemberClass() && !Modifier.isStatic(clazz.getModifiers())) {
            return instantiateInnerClass(instance, clazz);
        }
        return instantiateClass(clazz);
    }

    private static <T> T instantiateClass(final Class<T> clazz) throws Exception {
        final Constructor<T> constructor = clazz.getDeclaredConstructor();
        return ReflexUtils.makeAccessible(constructor).newInstance();
    }

    private static <T> T instantiateInnerClass(final Object instance, final Class<T> clazz) throws Exception {
        final Class<?> outerClass = clazz.getDeclaringClass();
        final Constructor<T> constructor = clazz.getDeclaredConstructor(outerClass);
        return ReflexUtils.makeAccessible(constructor).newInstance(instance);
    }
}
