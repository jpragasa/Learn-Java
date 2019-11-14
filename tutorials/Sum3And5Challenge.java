package learning.tutorials;

public class Sum3And5Challenge {
    public static void main(String[] args)
    {
        isDivisibleBy3And5(0,0);
    }

    private static void isDivisibleBy3And5(int add, int total)
    {
        for(int i = 1; i <= 1000; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                total += 1;
                add += i;
                System.out.println(i + " is divisible by 3 and 5");
                if(total == 5)
                {
                    break;
                }
            }
        }
        System.out.println("The total of 5 numbers found that are divisible by 3 and 5 is " + add);
    }
}
