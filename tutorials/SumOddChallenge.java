package learning.tutorials;

public class SumOddChallenge {
    public static void main(String[] args)
    {
        int start = 10;
        int end = 10;
        System.out.println("The sum in range " + start + " and " + end + " is: " + sumOdd(start,end));
    }

    public static boolean isOdd(int number)
    {
        if(number < 0)
        {
            return false;
        }
        if (number % 2 != 0)
        {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end)
    {
        int total;
        if((end >= start) && (start > 0) && (end > 0))
        {
            for(total = 0; start <= end; start++)
            {
                if(isOdd(start))
                {
                    total += start;
                }
            }
            return total;
        }
        return -1;
    }
}
