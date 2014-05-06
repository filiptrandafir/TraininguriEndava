public class FinallyDemo {

    static void method1() {
        try {
            System.out.println("Try din metoda 1");
        } finally {
            System.out.println("Executing finally block in method1()");
        }
    }

    static void method2() {
        try {
            throw new RuntimeException("Unchecked error");
        } finally {
            System.out.println("Executing finally block in method2()");
        }
    }
    
    public static void main (String[] args) {
        method1();
        method2();
    }
}
