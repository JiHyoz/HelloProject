import junit.framework.TestCase;

public class MyTest1 extends TestCase {

    // 构造函数
    public MyTest1(String name) {
        super(name);
    }

    // 初始化方法
    @Override
    protected void setUp() throws Exception {
        // 初始化代码
        System.out.println("MyTest1.setUp: 初始化资源");

    }

    // 清理方法
    @Override
    protected void tearDown() throws Exception {
        // 清理代码
        System.out.println("MyTest1.tearDown: 清理资源");
    }

    // 测试方法1
    public void testMethod1() {
        // 测试方法1
        System.out.println("MyTest1.testMethod1: 执行测试方法1");
        assertEquals(2, 1 + 1);
    }

    // 测试方法2
    public void testMethod2() {
        // 测试方法2
        System.out.println("MyTest1.testMethod2: 执行测试方法2");
        assertEquals(4, 2 + 2);
    }

    // 测试方法3
    public void testMethod3() {
        // 测试方法3
        System.out.println("MyTest1.testMethod3: 执行测试方法3");
    }

    // 主方法，用于运行测试
    public static void main(String[] args) {
        System.out.println("MyTest1.main:主方法开始加载");
        junit.textui.TestRunner.run(MyTest1.class);
        System.out.println("MyTest1.main:主方法结束加载");
    }
}
