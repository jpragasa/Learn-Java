package learning.tutorials;

public class EvenDigitChallenge
{
    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number)
    {
        int lastDigit;
        int sum = 0;
        if(number < 0)
        {
            return -1;
        }

        while(number > 0)
        {
            lastDigit = number % 10;
            if(lastDigit % 2 == 0)
            {
                sum += lastDigit;
            }
            number /= 10;
        }

        return sum;
    }
}
