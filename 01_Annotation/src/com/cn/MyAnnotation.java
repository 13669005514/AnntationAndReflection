package com.cn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 *  Target注解表示指定改注解可以作用于什么上面(包,类,方法,变量)
 *  Retention注解表示定义被它所注解的注解保留多久
 *              RUNTIME 保留至运行时。所以我们可以通过反射去获取注解信息
 *  default 表示指定一个默认值
 * @Auther: zhangfx
 * @Date: 2018/11/23/ 11:05
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

        String value() default "";


}
