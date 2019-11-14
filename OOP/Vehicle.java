package learning.OOP;

public class Vehicle
{
  private String model;
  private String steering;
  private boolean changeGears;
  private boolean moving;

    public Vehicle(String model, String steering, boolean changeGears, boolean moving) {
        this.model = model;
        this.steering = steering;
        this.changeGears = changeGears;
        this.moving = moving;
    }
    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getSteering()
    {
        return steering;
    }

    public boolean isChangeGears()
    {
        return changeGears;
    }

    public boolean isMoving()
    {
        return moving;
    }
}

