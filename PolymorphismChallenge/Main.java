package learning.PolymorphismChallenge;

class Car
{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders)
    {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        if(this.cylinders <= 0)
        {
            System.out.println("This does not have any cylinders...");
            this.name = "Unknown";
        }
        this.wheels = 4;
    }
    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
    public void startEngine()
    {
        this.engine = !this.engine;
        if(this.engine == true)
        {
            System.out.println("Engine is stirring....\nCar is now on...");
        }
        else
        {
            System.out.println("Engine is slowing down...\nCar is now off...");
        }
    }
    public void accelerate()
    {
        if(this.engine == false)
        {
            System.out.println("Car is off. This function is not available...");
        }
        else
        {
            System.out.println("Car is accelerating....");
        }
    }
    public void brake()
    {
        if(this.engine == false)
        {
            System.out.println("There is no use breaking, the car is not on...");
        }
        else
        {
            System.out.println("Car is slowing down......\nIt is now at a complete stop...");
        }
    }
}

class Dodge extends Car
{
    private int wheels;
    private String name;
    private int cylinders;
    private boolean engine;

    public Dodge(String name,int cylinders)
    {
        super(name,cylinders);
        this.name = name;
        if(this.name != "Dodge Dart")
        {
            System.out.println("This is not a Dodge product");
            this.name = "Unknown";
        }
        else
        {
            this.name = name;
        }
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    @Override
    public int getWheels()
    {
        return wheels;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getCylinders()
    {
        return cylinders;
    }

    @Override
    public boolean isEngine()
    {
        return engine;
    }

    @Override
    public void startEngine()
    {
        this.engine = !this.engine;
        if(this.engine == true)
        {
            System.out.println(this.name + " is stirring....\n" + this.name + " is now on...");
        }
        else
        {
            System.out.println("Engine is slowing down...\nCar is now off...");
        }
    }

    @Override
    public void accelerate()
    {
        super.accelerate();
    }

    @Override
    public void brake()
    {
        super.brake();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Dodge dodge = new Dodge("Dodge Dart",4);
        dodge.startEngine();
        dodge.accelerate();
        dodge.brake();
    }
}
