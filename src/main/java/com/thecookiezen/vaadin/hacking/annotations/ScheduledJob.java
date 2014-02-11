package com.thecookiezen.vaadin.hacking.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author nikom
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ScheduledJob {
	String cronExpression() default "";
	long fixedRate() default -1;
	boolean durable() default false;
	boolean shouldRecover() default true;
	String name() default "";
	String group() default "";
}
