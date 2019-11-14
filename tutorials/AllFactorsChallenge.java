package learning.tutorials;

public class AllFactorsChallenge
{
    public static void main(String[] args)
    {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number)
    {
        if(number < 1)
        {
            System.out.println("Invalid Value");
        }
        int count = 1;
        while(count <= number)
        {
            if(number % count == 0)
            {
                System.out.println(count);
            }
            count++;
        }
    }
}
