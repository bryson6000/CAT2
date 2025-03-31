public class ExceptionHandling {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2; // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
