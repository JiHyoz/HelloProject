package com.zsz.singleton;

/**
 * @Title: Singleton5
 * @Author zhushouzheng
 * @Package com.zsz.singleton
 * @Date 2024/11/13 22:42
 * @Description: 双重检查锁定
 */
public class Singleton5 {

    /**
     * 特点：线程安全，性能较好。
     */

    private volatile static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
