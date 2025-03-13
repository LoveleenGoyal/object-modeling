import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, BankAccount account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.addAccount(account);
        System.out.println("Account " + account.getAccountNumber() + " opened for " + customer.getName() + " at " + bankName);
    }

    public void displayBankDetails() {
        System.out.println("Bank name: " + bankName);
        for(Customer customer: customers) {
            customer.displayCustomerDetails();
        }
    }


}
class Customer {
    private String customerName;
    private ArrayList<BankAccount> accounts;

    // Constructor
    public Customer(String customerName) {
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }

    // Method to add a bank account to the customer
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // Method to get customer name
    public String getName() {
        return customerName;
    }

    // Method to view balance of all accounts
    public void viewBalance() {
        System.out.println("Customer: " + customerName + " Account Balances:");
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " Balance: $" + account.getBalance());
        }
    }

    public void displayCustomerDetails() {
        System.out.println("Customer name: " + customerName);
        for(BankAccount account : accounts){
            account.displayAccountDetails();
        }
    }


}
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs" + balance);
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");

        // Creating customers
        Customer cust1 = new Customer("Alice Johnson");
        Customer cust2 = new Customer("Bob Smith");

        // Creating bank accounts
        BankAccount acc1 = new BankAccount("1001", 5000.0);
        BankAccount acc2 = new BankAccount("1002", 3000.0);
        BankAccount acc3 = new BankAccount("1003", 7000.0);

        // Associating customers with accounts in the bank
        bank.openAccount(cust1, acc1);
        bank.openAccount(cust1, acc2);
        bank.openAccount(cust2, acc3);

        // Displaying bank customers and their accounts
        bank.displayBankDetails();

        // Viewing balances
        cust1.viewBalance();
        cust2.viewBalance();

    }
}
