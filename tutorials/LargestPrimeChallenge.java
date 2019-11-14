package learning.tutorials;

public class LargestPrimeChallenge
{
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number) {
        if(number > 1)
        {
            for(int i =2; i < number; i++)
            {
                while(number % i == 0 && number/i != 1)
                {
                    number /= i;
                }
            }
            return number;
        }
        return -1;
    }
}
