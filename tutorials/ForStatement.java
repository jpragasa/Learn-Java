package learning.tutorials;

public class ForStatement {
    public static void main(String[] args)
    {
        //System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        //double amount = 10000;
        //double interestRate = 2.0;
        /*for(int i = 8; i > 0; i--)
        {
            System.out.println("10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }*/

        int primeNumbersFound = 0;

        for(int i = 2; i <= 20; i++)
        {
            if(isPrime(i))
            {
                primeNumbersFound += 1;
                System.out.println(i + " is Prime");
                if(primeNumbersFound == 3)
                {
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return(amount * (interestRate / 100));
    }

    public static boolean isPrime(int n)
    {
        if( n == 1)
        {
            return false;
        }
        for(int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
