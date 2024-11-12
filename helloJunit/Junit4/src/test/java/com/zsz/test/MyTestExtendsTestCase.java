package com.zsz.test;

import junit.framework.TestCase;

/**
 * @Title: MyTestExtendsTestCase
 * @Author zhushouzheng
 * @Package com.zsz.test
 * @Date 2024/11/10 16:56
 * @Description: Junit4框架测试继承TestCase
 */
public class MyTestExtendsTestCase extends TestCase {

    /**
     * 相关说明
     * 1. 继承TestCase
     * 2. 测试方法必须以test开头
     */

    /**
     * 继承 TestCase
     * 兼容 JUnit 3：
     * 继承 TestCase 的类可以与 JUnit 3 兼容。
     * 测试方法必须以 test 开头。
     * 方法命名限制：
     * 测试方法必须以 test 开头，例如 testMethod()。
     * 设置和清理方法：
     * 使用 setUp() 和 tearDown() 方法进行测试前的初始化和测试后的清理工作。
     * 测试方法签名：
     * 测试方法必须是 public void 且无参数。
     */

    // 类级别的初始化
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // 初始化代码
        System.out.println("setUp: 初始化资源");
    }

    // 类级别的清理
    @Override
    protected void tearDown() throws Exception {
        // 清理代码
        System.out.println("tearDown: 清理资源");
        super.tearDown();
    }


 /*   protected void setUp() {
        // 初始化代码
        System.out.println("start");
    }

    protected void tearDown() {
        // 清理代码
        System.out.println("end");
    }*/


    public void testAdd() {
        //测试代码
        assertEquals(2, 1 + 1);  // assertEquals方法来源于 junit.framework.TestCase
        System.out.println("testAdd");
    }

    public void testSubtract() {
        //测试代码
        assertEquals(0, 1 - 1);
        System.out.println("testSubtract");
    }
}
