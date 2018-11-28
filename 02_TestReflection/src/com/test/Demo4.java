package com.test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;

/**
 * @Description:
 * //动态编译文件代码
 * @Auther: zhangfx
 * @Date: 2018/11/28/ 09:16
 */
public class Demo4 {

    public static void main(String[] args) throws IOException {

        /**
         * 编译java文件
         */
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        int run = javaCompiler.run(null, null, null, "G://HelloWord.java");
        System.out.println(run==0?1:3);

        /**
         * 运行class文件
         */
        Runtime runtime = Runtime.getRuntime();

        Process exec = runtime.exec("java -cp G://HelloWord.class");

        InputStream inputStream = exec.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


    }

}
