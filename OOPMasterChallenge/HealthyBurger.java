package learning.OOPMasterChallenge;

public class HealthyBurger extends Hamburger
{
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String healthyAddition_1;
    private double healthyAdditionPrice_1;

    private String healthyAddition_2;
    private double healthyAdditionPrice_2;


    public HealthyBurger(String name, String breadRollType, double price)
    {
        super(name,"chicken", price, breadRollType);
        this.name = name;
        this.meat = "chicken";
        this.breadRollType = breadRollType;
        this.price = price;
    }

    @Override
    public void addToPrice(String item)
    {
        switch (item)
        {
            case "guacamole":
                healthyAddition_1 = "guacamole";
                healthyAdditionPrice_1 += .9d;
                break;
            case "salsa":
                healthyAddition_2 = "salsa";
                healthyAdditionPrice_2 += .8d;
                break;
            default:
                System.out.println("Item is not available. Try another option.");
        }
    }

    @Override
    public void removeFromPrice(String item)
    {
        if(item == "guacamole")
        {
            this.price -= .9d;
        }
        if(item == "salsa")
        {
            this.price -= .8d;
        }
        super.removeFromPrice(item);
    }

    @Override
    public double getPrice()
    {
        return this.price + healthyAdditionPrice_2 + healthyAdditionPrice_1;
    }
}
