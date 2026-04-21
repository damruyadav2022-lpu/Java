public class thro {
    public static void main(String args[]) {
        String i = "150";  // test value
        try {
            validage(i);
            System.out.println("Age validated successful");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }

    public static void validage(String input) {
        int age = Integer.parseInt(input.trim());

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (age > 120) {
            throw new IllegalArgumentException("Age cannot be greater than 120");
        }
        
    }
}