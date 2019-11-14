package learning.OOP;

public class Bank
{
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank()
    {
        this("445566", 0, "Default Name","no email available","1112225555");//this has to be the first line called in the constructor
        System.out.println("Empty Constructor Called");
    }
    public Bank(String number, double balance, String customerName, String email, String phoneNumber)
    {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Bank(String customerName, String email, String phoneNumber)
    {
        this("99999", 100.55, customerName, email, phoneNumber);
    }
    public void setNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public String getNumber()
    {
        return this.accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void depositFunds(double number)
    {
        this.balance += number;
        System.out.println("$" + number + " has been deposited into your account. \nYour current balance is: " + "$" + this.balance + "\nHave a nice day!");

    }
    public void withdrawFunds(double number)
    {
        if (this.balance - number < 0)
        {
            System.out.println("Insufficient Funds");
        }
        else
        {
            this.balance -= number;
            System.out.println("$" + number + " has been withdrawn\n" + "Your current balance is: $" + this.balance + "\nHave a nice day!");
        }
    }
}
