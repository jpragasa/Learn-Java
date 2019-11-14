package learning.tutorials;

public class SumFirstAndLastDigitChallenge
{
    public static void main(String[] args)
    {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number)
    {
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number < 0)
        {
            return -1;
        }
        while (number > 0)
        {
            firstDigit = number % 10;
            number /= 10;
        }
        return lastDigit + firstDigit;
    }
}
