import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you name, password and initial balance:");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        HDFCAccount thiruAcc = new HDFCAccount(name, balance, password);
        System.out.println("Your account is created with account number: "+thiruAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is: "+thiruAcc.getBalance());

        //deposit
        System.out.println(thiruAcc.depositMoney(500));
        System.out.println("New balance is: "+thiruAcc.getBalance());

        //withdraw
        System.out.print("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.print("Enter your password: ");
        String enteredPassword = sc.next();

        System.out.println(thiruAcc.withdraw(amount, enteredPassword));

        //interest
        System.out.println("Interest for 4 years on current balance " + thiruAcc.getBalance() + "is: " + thiruAcc.calculateInterest(4));

    }

}