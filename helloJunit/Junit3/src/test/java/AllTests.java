import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    /**
     * 测试套件：测试所有测试类
     * @return
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("All Tests");
        suite.addTestSuite(MyTest1.class);
        suite.addTestSuite(MyTest2.class);
        // 添加其他测试类
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
