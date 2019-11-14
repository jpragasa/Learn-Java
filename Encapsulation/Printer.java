package learning.Encapsulation;

public class Printer
{
    private int tonerLevel = 50;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(boolean isDuplex)
    {
        this.isDuplex = isDuplex;
    }

    public int getPagesPrinted()
    {
        return this.pagesPrinted;
    }

    public int getTonerLevel()
    {
        return this.tonerLevel;
    }

    public boolean getIsDuplex()
    {
        return this.isDuplex;
    }

    public int fillTonerLevel(int tonerLevel)
    {
        this.tonerLevel += tonerLevel;
        if(this.tonerLevel == 10)
        {
            System.out.println("Your toner is low. Please refill...");
        }
        if(this.tonerLevel <= 0)
        {
            System.out.println("Your toner level is empty. Refill is required to continue...");
            this.tonerLevel = 0;
        }
        return this.tonerLevel;
    }

    public int addPages(int pagesPrinted)
    {
        this.pagesPrinted = pagesPrinted;
        this.tonerLevel -= 10;
        if(this.pagesPrinted <= 0)
        {
            System.out.println("No pages were printed");
        }
        if(this.isDuplex == true)
        {
            int trueCount = this.pagesPrinted /= 2;
            this.pagesPrinted = trueCount + this.pagesPrinted % 2;
        }
        return this.pagesPrinted;
    }
}
