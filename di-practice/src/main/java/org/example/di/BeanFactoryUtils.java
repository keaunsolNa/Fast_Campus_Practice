package org.example.di;

import org.example.annotation.Inject;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.util.Set;

public class BeanFactoryUtils {

    public static Constructor<?> getInjectedConstructors(Class<?> clazz) {
        // Inject annotation 붙은 생성자만 가져오기
        Set<Constructor> injectedConstructors = ReflectionUtils.getAllConstructors(clazz, ReflectionUtils.withAnnotation(Inject.class));
        if (injectedConstructors.isEmpty()) {
            return null;
        }

        return injectedConstructors.iterator().next();
    }
}
