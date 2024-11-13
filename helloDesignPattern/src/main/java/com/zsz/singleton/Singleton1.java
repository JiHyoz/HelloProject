package com.zsz.singleton;

/**
 * @Title: Singleton
 * @Author zhushouzheng
 * @Package com.zsz.singleton
 * @Date 2024/11/13 22:27
 * @Description: 懒汉式（静态常量）
 */
public class Singleton1 {

    /**
     * 特点：线程安全，加载类时即初始化
     */

    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}

