package com.cn;

/**
 * @Description:
 * 注解的实际使用
 * @Auther: zhangfx
 * @Date: 2018/11/26/ 14:34
 */
@MyAnnotation("/user")
public class User {

    @MyAnnotation2(name = "张三",lenth = 12)
    public String name;

    @MyAnnotation2(name = "年龄",lenth = 10)
    public String sex;





}
