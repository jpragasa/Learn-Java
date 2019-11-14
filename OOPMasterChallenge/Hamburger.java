package learning.OOPMasterChallenge;

public class Hamburger
{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition_1;
    private double additionPrice;

    private String addition_2;
    private double additionPrice_2;

    private String addition_3;
    private double additionPrice_3;

//    private String addition_4;
//    private double additionPrice_4 = 0;

    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addToPrice(String item)
    {
        switch (item)
        {
            case "lettuce":
                addition_1 = item;
                additionPrice += .5d;
                break;
            case "tomato":
                addition_2 = item;
                additionPrice += .3d;
                break;
            case "carrot":
                addition_3 = item;
                additionPrice_3 += .7d;
                break;
            default:
                System.out.println("This item is unknown. Call function again and enter a proper item to be added.\nlettuce, tomato, or carrot are your choices.");
        }
    }

    public void removeFromPrice(String item)
    {
        switch (item)
        {
            case "lettuce":
                addition_1 = item;
                additionPrice -= .5d;
                break;
            case "tomato":
                addition_2 = item;
                additionPrice -= .3d;
                break;
            case "carrot":
                addition_3 = item;
                additionPrice_3 -= .7d;
                break;
            default:
                System.out.println("This item is unknown. Call function again and enter a proper item to be added.\nlettuce, tomato, or carrot are your choices.");
        }
        if(this.price <= 0)
        {
            System.out.println("You are in the negative range. Amount now set to 0.");
            this.price = 0;
        }
    }

    public double getPrice()
    {
        return this.price += (additionPrice + additionPrice_2 + additionPrice_3);
    }
}
