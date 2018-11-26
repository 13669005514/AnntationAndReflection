package com.test;

import java.lang.reflect.Constructor;

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
            Constructor constructor1 = aClass.getConstructor( String.class,int.class);
            System.out.println(constructor1);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }


}
