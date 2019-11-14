package learning.Composition;

public class LivingRoom
{
    private int doors;
    private int windows;
    private int couch;
    private boolean television;

    public LivingRoom(int doors, int windows, int couch, boolean television)
    {
        this.doors = doors;
        this.windows = windows;
        this.couch = couch;
        this.television = television;
    }

    public int getDoors()
    {
        return doors;
    }

    public int getWindows()
    {
        return windows;
    }

    public int getCouch()
    {
        return couch;
    }

    public boolean getTelevision()
    {
        return television;
    }
    public void turnOnTV()
    {
        this.television = !television;
        if(television == true)
        {
            System.out.println("The tv is on....looks like jeopardy is showing");
        }
        else
        {
            System.out.println("The tv is off...");
        }
    }
}
