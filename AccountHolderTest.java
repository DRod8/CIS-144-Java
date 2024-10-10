import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountHolderTest
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        char choice = 'y';
        double balance = 0;
        // Decimal format tool
        DecimalFormat f = new DecimalFormat("#00.00");
        Scanner sc = new Scanner(System.in);
        AccountHolder aObj;
        // set interest rate
        AccountHolder.annualInterestRate = .04;

        do {
            System.out.println("Welcome to Bank App");
            System.out.println("Please enter your initial deposit Amount: ");

            balance = sc.nextDouble();

            while (balance < AccountHolder.MINIMUM_BALANCE) {
                System.out.println("Initial deposit must be at least $" + AccountHolder.MINIMUM_BALANCE);
                balance = sc.nextDouble();
            }


            // instantiate your object
            aObj = new AccountHolder(balance);

            // prompt for deposit
            System.out.println("Please enter your deposit: ");
            balance = sc.nextDouble();
            aObj.deposit(balance);

            // prompt for withdraw
            System.out.println("Please enter your withdraw amount: ");
            balance = sc.nextDouble();
            aObj.withdraw(balance);
            aObj.applyInterest();

            // show balance ( make sure to include interest )
            System.out.println("Ending balance (Including interest): $" + f.format(aObj.balance));

            System.out.println("Continue again? Press Y to continue");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        sc.close();
    }
}

