package learning.tutorials;

public class DecimalComparator {

    public static void main(String[] args)
    {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        num1 *= 1000;
        num2 *= 1000;
        if((int)num1 == (int)num2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
