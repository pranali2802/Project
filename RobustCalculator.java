import java.util.Scanner;
class RobustCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter numbers only.");
                sc.next(); // clear wrong input
                continue;
            }
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();
                int result = 0;
                if (choice == 1) {
                    result = num1 + num2;
                } 
                else if (choice == 2) {
                    result = num1 - num2;
                } 
                else if (choice == 3) {
                    result = num1 * num2;
                } 
                else if (choice == 4) {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    result = num1 / num2;
                }
                System.out.println("Result = " + result);
            } 
            else if (choice == 5) {
                System.out.println("Calculator Closed!");
            } 
            else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
