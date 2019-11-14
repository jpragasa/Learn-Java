package learning.tutorials;

import java.util.Scanner;

public class MinAndMaxChallenge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true)
        {
            System.out.print("Enter Number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int number = scanner.nextInt();

                if(first)
                {
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max)
                {
                    max = number;
                }
                if(number < max)
                {
                    min = number;
                }
            }
            else
            {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Min: " + min + " Max = " + max);
        scanner.close();

    }
}
