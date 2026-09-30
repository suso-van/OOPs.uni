public abstract class Accounts {
    private String accountNumber;
    private String accountHolderName;
    private String address;
    protected double balance;

    public Accounts(String accountNumber, String accountHolderName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
    public void displayAccountDetails() {
        display();
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
class CurrentAccount extends Accounts {
    private double rateOfInterest;
    public CurrentAccount(String accountNumber, String accountHolderName, String address,
                         double balance, double rateOfInterest) {
        super(accountNumber, accountHolderName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }
    public double calculateAmount() {
        return getBalance() + (getBalance() * rateOfInterest / 100);
    }
    public void displayAccountDetails() {
        display();
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}
class SavingAccount extends Accounts {
    private double rateOfInterest;
    public SavingAccount(String accountNumber, String accountHolderName, String address,
                         double balance, double rateOfInterest) {
        super(accountNumber, accountHolderName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }
    public double calculateAmount() {
        return getBalance() + (getBalance() * rateOfInterest / 100);
    }
    public void displayAccountDetails() {
        display();
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

class Test{
        public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount("C101", "Rahul", "Delhi", 5000, 5);
        SavingAccount s = new SavingAccount("S101", "Priya", "Kolkata", 7000, 4);

        c.displayAccountDetails();
        System.out.println("Current Account Amount: " + c.calculateAmount());

        s.displayAccountDetails();
        System.out.println("Saving Account Amount: " + s.calculateAmount());
    }
}