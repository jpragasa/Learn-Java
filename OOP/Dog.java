package learning.OOP;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = teeth;
        this.coat = coat;
    }
    private void chew()
    {
        System.out.println("Dog is chewing........");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog is eating......");
        chew();
        super.eat();
    }
    public void walk()
    {
        System.out.println("Dog is walking...");
        super.move(3);
    }
    public void run()
    {
        System.out.println("Dog is running...");
        super.move(6);
    }
    private void moveLegs(int speed)
    {
        System.out.println("Dog is moving at " + speed + " speed...");
    }
    @Override
    public void move(int speed)
    {
        System.out.println("Original speed overrided");
        moveLegs(speed * 30);
        super.move(speed);
    }
}
