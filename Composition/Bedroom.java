package learning.Composition;

public class Bedroom
{
    private int windows;
    private int doors;
    private boolean television;

    public Bedroom(int windows, int doors, boolean television)
    {
        this.windows = windows;
        this.doors = doors;
        this.television = television;
    }

    public int getWindows()
    {
        return windows;
    }

    public int getDoors()
    {
        return doors;
    }

    public boolean isTelevision()
    {
        return television;
    }

    public void turnOnTV()
    {
        System.out.println("The TV is on.....Looks like Jeopardy is on.....ew");
    }
}
