package com.cn;

/**
 * @Description:
 * 测试自定义注解的使用
 * @Auther: zhangfx
 * @Date: 2018/11/23/ 11:40
 */

@MyAnnotation("oooo")
public class test2 {

    @MyAnnotation(value = "123")
    public void  sum(){

    }


}
