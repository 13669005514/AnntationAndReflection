package com.test;

/**
 * @Description:
 * 初次使用反射的基本操作
 * @Auther: zhangfx
 * @Date: 2018/11/23/ 15:03
 */
public class Demo {

    public static void main(String[] args) {
        String path = "com.test.bean.User";
        try {
            //1.第一种方式
            Class<?> aClass = Class.forName(path);
            System.out.println(aClass);
            //2.第二种方式
            Class aClass1 = path.getClass();
            System.out.println(aClass1);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
