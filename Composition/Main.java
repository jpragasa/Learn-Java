package learning.Composition;

public class Main
{
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("110i", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast","Acer", 27, new Resolution(2455, 1440));
        MotherBoard motherBoard = new MotherBoard("jj-900", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherBoard);
        thePC.powerUp();
    }
}
