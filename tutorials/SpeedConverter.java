package learning.tutorials;

public class SpeedConverter {
    public static void main(String[] args)
    {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        double convert = kilometersPerHour / 1.609;
        if(kilometersPerHour < 0)
        {
            return -1;
        }
        else
        {
            return Math.round(convert);
        }
    }

    public static void printConversion(double kilometersPerHour)
    {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
