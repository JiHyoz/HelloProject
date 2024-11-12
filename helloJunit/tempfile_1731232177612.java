import junit.framework.TestCase;

public class MyTest extends TestCase {

    // 构造函数
    public MyTest(String name) {
        super(name);
    }

    // 初始化方法
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // 初始化代码
        System.out.println("setUp: 初始化资源");
    }

    // 清理方法
    @Override
    protected void tearDown() throws Exception {
        // 清理代码
        System.out.println("tearDown: 清理资源");
        super.tearDown();
    }

    // 测试方法1
    public void testMethod1() {
        // 测试方法1
        System.out.println("testMethod1: 执行测试方法1");
        assertEquals(2, 1 + 1);
    }

    // 测试方法2
    public void testMethod2() {
        // 测试方法2
        System.out.println("testMethod2: 执行测试方法2");
        assertEquals(4, 2 + 2);
    }
}
