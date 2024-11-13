package com.zsz.singleton;

/**
 * @Title: Singleton4
 * @Author zhushouzheng
 * @Package com.zsz.singleton
 * @Date 2024/11/13 22:39
 * @Description: 懒汉式（线程安全，同步方法）
 */
public class Singleton4 {

    /**
     * 特点：线程安全，但性能较差。
     */

    private static Singleton4 instance;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
