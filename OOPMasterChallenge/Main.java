package learning.OOPMasterChallenge;

public class Main
{
    public static void main(String[] args)
    {
        Hamburger hamburger = new Hamburger("Basic burger", "burger patty", 2.00, "Italian");
        HealthyBurger healthyBurger = new HealthyBurger("Veggy Burger","Wheat",5);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Mighty Burger", "Burger Patty x3", "Italian", 8);
        hamburger.addToPrice("lettuce");
        hamburger.addToPrice("tomato");
        hamburger.addToPrice("carrot");
        healthyBurger.addToPrice("guacamole");
        healthyBurger.addToPrice("salsa");
        deluxeBurger.addToPrice("bacon");
        deluxeBurger.addToPrice("mushrooms");
        System.out.println(hamburger.getPrice());
        System.out.println(healthyBurger.getPrice());
        System.out.println(deluxeBurger.getPrice());
    }
}
