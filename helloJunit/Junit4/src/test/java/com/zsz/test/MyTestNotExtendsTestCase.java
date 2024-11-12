package com.zsz.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Title: MyTestNotExtendsTestCase
 * @Author zhushouzheng
 * @Package com.zsz.test
 * @Date 2024/11/10 17:12
 * @Description: Junit4框架测试不继承TestCase
 */
public class MyTestNotExtendsTestCase {

    /**
     * 不继承 TestCase
     * 使用注解：
     * 使用 @Test 注解标记测试方法。
     * 使用 @Before 和 @After 注解标记测试前的初始化和测试后的清理方法。
     * 使用 @BeforeClass 和 @AfterClass 注解标记类级别的初始化和清理方法。
     * 方法命名灵活：
     * 测试方法的命名不再受限，可以使用任何合法的方法名。
     * 更丰富的注解支持：
     * 支持 @Ignore 注解来忽略某些测试方法。
     * 支持 @RunWith 注解来自定义测试运行器。
     * 更强大的断言：
     * 使用 org.junit.Assert 提供的断言方法，功能更强大。
     */

    @Before
    //@Before 每个测试方法前执行
    public void setUp() {
        // 初始化代码
        System.out.println("start");
    }

    @After
    //@After 每个测试方法后执行
    public void tearDown() {
        // 清理代码
        System.out.println("end");
    }

    @Test
    //@Test 标记为测试方法
    public void testAdd() {
        // 测试代码
        //assertEquals 来源于 org.junit.Assert
        //静态导入  引包   import static org.junit.Assert.assertEquals;
        assertEquals(2, 1 + 1);
        //普通导入
        Assert.assertEquals(2, 1 + 1);

        System.out.println("testAdd");
    }

    @Test
    public void testSubtract() {
        // 测试代码
        assertEquals(0, 1 - 1);
        System.out.println("testSubtract");
    }
}
