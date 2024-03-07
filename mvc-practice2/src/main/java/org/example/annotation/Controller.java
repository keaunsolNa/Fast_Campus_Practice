package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 대상 타겟
@Target({ElementType.TYPE})
// 유지 기간
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
}
