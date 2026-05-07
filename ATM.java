import java.util.Scanner;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000; // initial balance
        int choice = 0;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            try {
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Current Balance = " + balance);
                }
                else if (choice == 2) {
                    System.out.println("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit <= 0) {
                        throw new IllegalArgumentException("Invalid deposit amount!");
                    }
                    balance += deposit;
                    System.out.println("Money Deposited Successfully!");
                }
                else if (choice == 3) {
                    System.out.println("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        throw new ArithmeticException("Insufficient balance!");
                    }
                    if (withdraw <= 0) {
                       throw new IllegalArgumentException("Invalid withdraw amount!");
                    }
                    balance -= withdraw;
                    System.out.println("Please collect your cash!");
                }
                else if (choice == 4) {
                    System.out.println("Thank you for using ATM!");
                }
                else {
                    throw new IllegalArgumentException("Invalid menu choice!");
                }
            } 

            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); // clear wrong input
                choice = 0;
            } 
            finally {
                System.out.println("Transaction Completed.");
            }
        } while (choice != 4);
        sc.close();
    }
}
