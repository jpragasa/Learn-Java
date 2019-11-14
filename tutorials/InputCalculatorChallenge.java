package learning.tutorials;

import java.util.Scanner;

public class InputCalculatorChallenge
{
    public static void main(String[] args)
    {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;
        while(true)
        {
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt)
            {
                int userInput = scanner.nextInt();
                scanner.nextLine();
                count++;
                sum += userInput;
                average = Math.round((double)sum / (double)count);
            }
            else
            {
                break;
            }
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
