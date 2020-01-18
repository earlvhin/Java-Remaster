import java.io.*;
public class atmMachine {
    // Program resets every transaction made, will improve for proper transaction flow.
    public static void main(String[] args)throws IOException {
        Account new_account = new Account();
        new_account = new Account();
        new_account.setAccountInfo("Boss", "Busabos", 5000);
        welcomeMessage(new_account.getFirstName(), new_account.getAccountBalance());
    }

    public static void welcomeMessage(String accountOwner, int accountBalance)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi " + accountOwner + ", Welcome to Deku Bank! Please Select Transaction");
        System.out.println("Your current balance is: " + accountBalance);
        System.out.println("1 - Deposit Money");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Check Bank Account");
        System.out.println("8 - Exit");
        selectedTransaction(Integer.parseInt(input.readLine()), accountBalance);
    }

    public static void selectedTransaction(int transCode, int accountBalance)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        switch(transCode) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                int addAmount = Integer.parseInt(input.readLine());
                System.out.println("Your new Account Balance is " + addMoney(addAmount, accountBalance));
                break;
            case 2:
                System.out.print("Enter Amount to withdraw: ");
                int withdrawAmount = Integer.parseInt(input.readLine());
                System.out.println("Your withdrew "+ withdrawAmount + ".");
                System.out.println("Remaining Balance: " + withdrawMoney(withdrawAmount, accountBalance));
                break;
            case 3:
                System.out.print("Your current balance is: " + accountBalance);
                break;
        }
    }

    public static int addMoney(int addedMoney, int accountBalance) {
        return accountBalance + addedMoney;
    }

    public static int withdrawMoney(int withdrawAmt, int accountBalance) {
        return accountBalance - withdrawAmt;
    }
}
