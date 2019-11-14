package learning.OOP;

public class Cars extends Vehicle
{
    private double speed;
    private int wheels;
    private int doors;

    public Cars(String model, String steering, boolean changeGears, boolean moving, double speed, int wheels, int doors)
    {
        super(model, steering, changeGears, moving);
        this.speed = speed;
        this.wheels = wheels;
        this.doors = doors;
        if(this.wheels <= 0)
        {
            model = "Unknown model";
            super.setModel(model);
            System.out.println("This model type is unknown, therefore it may not even be car, sorry......");
        }
    }

    public double getSpeed()
    {
        return speed;
    }

    public int getWheels()
    {
        return wheels;
    }

    public int getDoors()
    {
        return doors;
    }
    public void addSpeed(double speed)
    {
        this.speed += speed;
    }
    public void subtractSpeed(double speed)
    {
        this.speed -= speed;
    }
}
