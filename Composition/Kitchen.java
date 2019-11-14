package learning.Composition;

public class Kitchen
{
    private boolean sink;
    private int windows;
    private boolean fridge;
    private boolean dishwasher;

    public Kitchen(boolean sink, int windows, boolean fridge, boolean dishwasher)
    {
        this.sink = sink;
        this.windows = windows;
        this.fridge = fridge;
        this.dishwasher = dishwasher;
    }

    public boolean isSink()
    {
        return sink;
    }

    public int getWindows()
    {
        return windows;
    }

    public boolean isFridge()
    {
        return fridge;
    }

    public boolean isDishwasher()
    {
        return dishwasher;
    }
    public void AlternateOnAndOffSink()
    {
        this.sink = !this.sink;
        if(sink == true)
        {
            System.out.println("The sink is on...");
        }
        else
        {
            System.out.println("The sink is off...");
        }
    }
    public void isFridgeOpen()
    {
        this.fridge = !this.fridge;
        if(fridge == true)
        {
            System.out.println("The fridge is open...");
        }
        else
        {
            System.out.println("The fridge is closed...");
        }
    }
}
