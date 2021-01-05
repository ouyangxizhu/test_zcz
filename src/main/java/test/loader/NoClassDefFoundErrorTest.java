package test.loader;

/**
 * @author czz
 */
public class NoClassDefFoundErrorTest {
    static class TestClass {
        public static TestClass instance = init();

        public static TestClass init() {
            String a = null;
            a.charAt(0); //force a null point exception;
            return new TestClass();
        }
    }

    static public void main(String[] args) {
        accessStatic(); // a ExceptionInInitializerError raised cause by NullPointer
        accessStatic(); //now a NoClassDefFoundError occurs;

        //the class of TestClass is still available;
        //然后尝试解释一下第19行代码为什么可以正常执行？
        System.out.println("TestClass.class=" + TestClass.class);
    }

    static void accessStatic() {
        TestClass a;

        try {
            a = TestClass.instance;
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
