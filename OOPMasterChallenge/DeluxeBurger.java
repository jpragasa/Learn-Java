package learning.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger
{
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String DeluxeAddition_1;
    private double healthyAdditionPrice_1;

    private String DeluxeAddition_2;
    private double healthyAdditionPrice_2;


    public DeluxeBurger(String name, String meat, String breadRollType, double price)
    {
        super(name,meat, price, breadRollType);
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    @Override
    public void addToPrice(String item)
    {
        switch (item)
        {
            case "bacon":
                DeluxeAddition_1 = "bacon";
                healthyAdditionPrice_1 += .2d;
                break;
            case "mushrooms":
                DeluxeAddition_2 = "mushrooms";
                healthyAdditionPrice_2 += .1d;
                break;
            default:
                System.out.println("Item is not available. Try another option.");
        }
    }

    @Override
    public void removeFromPrice(String item)
    {
        if(item == "bacon")
        {
            this.price -= .2d;
        }
        if(item == "mushrooms")
        {
            this.price -= .1d;
        }
        super.removeFromPrice(item);
    }

    @Override
    public double getPrice()
    {
        return this.price + healthyAdditionPrice_1 + healthyAdditionPrice_2;
    }
}
