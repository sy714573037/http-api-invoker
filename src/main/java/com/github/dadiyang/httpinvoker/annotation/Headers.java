package com.github.dadiyang.httpinvoker.annotation;

import java.lang.annotation.*;

/**
 * Indicates the parameter is a header map.
 * <p>
 * This annotation should only be annotated on parameter of Map&lt;String, String&gt; type
 * @author huangxuyang
 * date 2018/12/21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface Headers {
}
