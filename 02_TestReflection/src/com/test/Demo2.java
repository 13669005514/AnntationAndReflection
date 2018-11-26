package com.test;

import com.test.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * 使用反射获取对象的构造器,方法,属性
 * @Auther: zhangfx
 * @Date: 2018/11/23/ 16:09
 */
public class Demo2 {

    public static void main(String[] args) {
        String path = "com.test.bean.User";
        try {
            Class aClass = Class.forName(path);
            //1.获取所有无参带参构造器
            Constructor[] constructors = aClass.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
            //1.2获取指定的构造器
            System.out.println("-------------分割线-------------");
            Constructor constructor = aClass.getConstructor(null);
            System.out.println(constructor);
            Constructor constructor1 = aClass.getConstructor( String.class,Integer.class);
            System.out.println(constructor1);
            //1.3获取所有的方法
            System.out.println("-------------分割线-------------");
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println("-------------分割线-------------");
            //仅获取此类中的方法
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod);
            }


            //1.4获取指定的方法
            System.out.println("-------------分割线-------------");
            Method setAge = aClass.getDeclaredMethod("setAge", Integer.class);
            System.out.println(setAge);

            //1.5获取所有属性
            System.out.println("-------------分割线-------------");
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }
            //1.6获取指定的属性
            System.out.println("-------------分割线-------------");
            Field name = aClass.getDeclaredField("name");
            System.out.println(name);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
