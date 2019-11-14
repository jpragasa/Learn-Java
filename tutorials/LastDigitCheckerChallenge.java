package learning.tutorials;

public class LastDigitCheckerChallenge
{
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int x, int y, int z)
    {
        if(!isValid(x) || !isValid(y) || !isValid(z))
        {
            return false;
        }
        int xLastDigit = x % 10;
        int yLastDigit = y % 10;
        int zLastDigit = z % 10;

        return xLastDigit == yLastDigit || xLastDigit == zLastDigit || yLastDigit == zLastDigit;
    }

    public static boolean isValid(int num)
    {
        if(num >= 10 && num <= 1000)
        {
            return true;
        }

        return false;
    }
}
