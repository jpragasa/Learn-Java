package learning.OOP;

public class VipCustomer
{
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer()
    {
        this("guest", 500, "guest@gmail.com");
    }
    public VipCustomer(String name, double creditLimit)
    {
        this(name, creditLimit, "Unknown");
    }
    public VipCustomer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName()
    {
        return this.name;
    }
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    public String getEmail()
    {
        return this.email;
    }
}
