public class TryFinallyReturnDemo {

    static int method() { 
        try {
        	return 1;
        } finally {
            return 2;
        }
    }

    public static void main (String args[]) {
        System.out.println("Returned value is: " + method());  //  returns 2
    }
}
