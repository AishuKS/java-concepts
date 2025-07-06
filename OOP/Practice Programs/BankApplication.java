import java.util.ArrayList;
import java.util.List;

abstract class BankAccount{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }

    public abstract void withdraw(double amount);

    public void display(){
        System.out.println("Account No:" + accountNumber + 
                            "Name: " + accountHolderName + 
                            "Balance: "+ balance);
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;
    private final double minBalance = 1000;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double withdrawAmount){
        if (balance >= minBalance){
            balance = balance - withdrawAmount;
        }
        else{
            System.out.println("No minimum balance in account");
        }
    }
}

class CurrentAccount extends BankAccount{
    private double overDraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overDraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (amount > overDraftLimit){
            System.out.println("Withdraw not allowed above limit");
        }
        else{
            balance = balance - amount;
        }
    }
}

class Bank{
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public BankAccount findAccountByNumber(int accountNumber){
        for (BankAccount acc: accounts){
            if(acc.getAccountNumber() == accountNumber){
                return acc;
            }
        }
        System.out.println("No account found");
        return null;
    }

    public void displayAllAccount(){
        for (BankAccount acc: accounts){
            acc.display();
        }
    }
}

public class BankApplication{
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        BankAccount acc1 = new SavingsAccount(101, "Alice", 5000, 4.5);
        BankAccount acc2 = new CurrentAccount(102, "Sam", 3000, 2000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        acc1.withdraw(25);
        acc1.display();

        bank.displayAllAccount();
    }
}
