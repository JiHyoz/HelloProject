package com.zsz;

/**
 * @Title: ClassUnderTest
 * @Author zhushouzheng
 * @Package com.zsz
 * @Date 2024/11/7 23:57
 * @description: ClassUnderTest
 */
public class ClassUnderTest {

    private Dependency dependency;
    public void someMethod() {
        dependency.someDependencyMethod();
        System.out.println("someMethod");
    }

}
