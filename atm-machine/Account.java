public class Account {
    public String firstname;
    public String lastname;
    public int accountBalance;
    public int withdrawAmt;

    public void setAccountInfo(String firstname, String lastname, int accountBalance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountBalance = accountBalance;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public int getAccountBalance() {
        return this.accountBalance;
    }

    public int withdrawMoney(int withdrawAmt) {
        this.withdrawAmt = withdrawAmt;
        if(this.accountBalance > this.withdrawAmt) {
            return this.accountBalance - this.withdrawAmt;
        }
        return 0;
    }
}
