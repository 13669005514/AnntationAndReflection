package com.cn;

/**
 * 内置的三大注解的使用
 * @author zhangfx 2018/11/23
 */
@MyAnnotation
public class test {

    /**
     * @Override 覆盖方法的注解
     *
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @Deprecated 表示过时方法 不建议使用
     */
    @Deprecated
    public  void  test001() {
        System.out.println("此方法已经过时");
    }

    public static void main(String[] args) {
        //表示抑制编译错误信息
        @SuppressWarnings("All")
        test test = new test();
        test.test001();

    }


}
