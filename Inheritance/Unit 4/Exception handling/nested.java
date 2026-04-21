public class nested {
    public static void main(String[] args) {

        try {
            //int b = 100/0;
            try {
                int a = 10 / 0; // Exception occurs here
            } catch (Exception e) {
                System.out.println("Inner catch");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }

    }
}