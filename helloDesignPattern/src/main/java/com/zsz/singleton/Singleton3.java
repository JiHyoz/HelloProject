package com.zsz.singleton;

/**
 * @Title: Singleton3
 * @Author zhushouzheng
 * @Package com.zsz.singleton
 * @Date 2024/11/13 22:38
 * @Description: 懒汉式（线程不安全）
 */
public class Singleton3 {

    /**
     * 特点：线程不安全，适用于单线程环境
     */

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}
