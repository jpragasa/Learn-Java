package learning.tutorials;

public class MethodOverloadingChallenge {

    public static void main(String[] args)
    {
        double feet = 10d;
        double inches = 11d;

        System.out.println(feet + " feet and " + inches + " inches = " + calcFeetAndInchesToCentimeters(feet, inches) + " centimeters");
        System.out.println();
        System.out.println(inches + " inches = " + calcFeetAndInchesToCentimeters(inches) + " centimeters");
        System.out.println(feet + " feet = " + convertFeetToCentimeters(feet) + " centimeters");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet >= 0 || inches >= 0 && inches <= 12)
        {
            return (inches * 2.54) + (feet * 30.48);
        }

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches >= 0)
        {
            return (inches * 2.54);
        }

        return -1;

    }

    public static double convertFeetToCentimeters(double feet)
    {
        if(feet >= 0)
        {
            return (feet * 30.48);
        }
        return -1;
    }
}
