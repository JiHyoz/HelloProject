import junit.framework.TestCase;

public class MyTest2 extends TestCase {

    // 类级别的初始化
    private static void oneTimeSetUp() {
        // 类级别的初始化代码
        System.out.println("MyTest2.oneTimeSetUp: 初始化资源");
    }

    // 类级别的清理
    public static void oneTimeTearDown() {
        // 类级别的清理代码
        System.out.println("MyTest2.oneTimeTearDown: 清理资源");
    }

    // 方法级别的初始化
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // 方法级别的初始化代码
        System.out.println("MyTest2.setUp: 初始化资源");
    }

    // 方法级别的清理
    @Override
    protected void tearDown() throws Exception {
        // 方法级别的清理代码
        System.out.println("MyTest2.tearDown: 清理资源");
        super.tearDown();
    }

    // 测试方法1
    public void testMethod1() {
        // 测试方法1
        System.out.println("MyTest2.testMethod1: 执行测试方法1");
        assertEquals(2, 1 + 1);
    }

    // 测试方法2
    public void testMethod2() {
        // 测试方法2
        System.out.println("MyTest2.testMethod2: 执行测试方法2");
        assertEquals(4, 2 + 2);
    }

    // 主方法，用于运行测试
    public static void main(String[] args) {
        oneTimeSetUp();
        junit.textui.TestRunner.run(MyTest2.class);
        oneTimeTearDown(); // 调用类级别的清理方法
    }
}
