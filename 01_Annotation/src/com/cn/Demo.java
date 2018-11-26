package com.cn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Description:
 * 注解与反射的综合应用
 * @Auther: zhangfx
 * @Date: 2018/11/26/ 14:39
 */
public class Demo {

    public static void main(String[] args) {

        User user = new User();
        Class<? extends User> aClass = user.getClass();

        try {

            Annotation[] annotations1 = aClass.getAnnotations();
            for (Annotation annotation : annotations1) {
                System.out.println(annotation);
            }


            Field name = aClass.getDeclaredField("name");
            MyAnnotation2 annotation1 = name.getAnnotation(MyAnnotation2.class);
            System.out.println(annotation1.name());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
