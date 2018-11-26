package com.test;

import com.test.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Auther: zhangfx
 * @Date: 2018/11/26/ 11:08
 */
public class Demo3 {

    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("com.test.bean.User");
            //1.调用无参构造器
            User user = (User) aClass.newInstance();
            System.out.println(user);
            //2.调用带参构造器
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, Integer.class);
            User u2 = (User) declaredConstructor.newInstance("测试", 16);
            System.out.println(u2.getName());

            //3调用普通方法
            System.out.println("-------------分割线-------------");
            User u3 = (User) aClass.newInstance();
            Method method = aClass.getDeclaredMethod("setName", String.class);
            method.invoke(u3,"测试2");
            System.out.println(u3.getName());

            //4.调用属性
            System.out.println("-------------分割线-------------");
            User u4 = (User) aClass.newInstance();
            Field name = aClass.getDeclaredField("name");
            name.setAccessible(true);//设置不需要做安全检查 可以访问私有属性
            name.set(u4,"测试5");
            System.out.println(u4.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
