public class BankAccount {
    private String CustName;
    private String Email;
    private double balance;
    private int accNumber;
    private int phoneNumber;

    //Methods to Deposit and Withdraw from the account
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <= 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }
    }

    //Setters

    public void setCustName(String custName) {
        CustName = custName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getCustName() {
        return CustName;
    }

    public String getEmail() {
        return Email;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
