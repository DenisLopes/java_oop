package entities;

public class AccountRegistration {

    private String accountHolderName;
    private int accountNumber;
    private double accountDeposit;

    public AccountRegistration(String accountHolderName, int accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public AccountRegistration(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountDeposit() {
        return accountDeposit;
    }


    public void deposit(double value){
        accountDeposit += value;
    }

    public void withdraw(double value){
        accountDeposit -= value + 5.0;
    }

    public String toString(){
        return "Holder name: "
                + accountHolderName
                + ", Account Number: "
                + accountNumber
                + ", Deposit: $ "
                + String.format("%.2f", accountDeposit);

    }

}
