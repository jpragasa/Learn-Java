package learning.tutorials;

public class MegaBytesConverter {
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int convert1 = kiloBytes / 1024;
        int convert2 = kiloBytes % 1024;
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.println(kiloBytes + " KB = " + convert1 + " MB and " + convert2 + " KB");
        }
    }
}
