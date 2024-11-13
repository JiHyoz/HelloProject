package com.zsz.singleton;

/**
 * @Title: Singleton2
 * @Author zhushouzheng
 * @Package com.zsz.singleton
 * @Date 2024/11/13 22:35
 * @Description: 饿汉式（静态代码块）
 */
public class Singleton2 {

    /**
     * 特点：线程安全，加载类时即初始化。
     */

    private static final Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

}
