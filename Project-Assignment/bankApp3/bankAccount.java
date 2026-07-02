public class bankAccount{
    
    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;

    public bankAccount(int accountNumber, String accountHolderName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;

    }
    
    
    public double getBalance() {
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
       balance += amount;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
        balance -= amount;
    }
    


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public String getAccountType() {
        return accountType;
    }


    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bankAccount{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", accountHolderName=").append(accountHolderName);
        sb.append(", accountType=").append(accountType);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    void displayDetails() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}


