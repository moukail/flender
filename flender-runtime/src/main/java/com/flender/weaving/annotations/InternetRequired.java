package com.flender.weaving.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Joel on 01/07/2015.
 */
@Target({METHOD})
@Retention(RUNTIME)
public @interface InternetRequired
{
    String value() default "alert";
}
