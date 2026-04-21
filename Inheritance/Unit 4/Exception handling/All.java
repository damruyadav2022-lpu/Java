// public class All {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int arr[] = new int[3];
//         String s = null;

//         try {
//             int ans = a / b;               // ArithmeticException
//             System.out.println(arr[4]);    // ArrayIndexOutOfBoundsException
//             int len = s.length();          // NullPointerException
//         }

//         catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero");
//         } 
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Out of bound");
//         } 
//         catch (NullPointerException e) {
//             System.out.println("Null exception");
//         } 
//         catch (Exception e) {
//             System.out.println("General exception");
//         }finally{
//             System.err.println("It will execute always");
//         }
//     }
// }

// to handle all at one time Try and catch should be just after each one 

public class All {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int arr[] = new int[3];
        String s = null;

        try {
            int ans = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }

        try {
            int len = s.length();
        } catch (NullPointerException e) {
            System.out.println("Null exception");
        }

        finally { 
            System.out.println("It will execute always whether there is exception or not");
        }
    }
}