package learning.tutorials;
import java.util.Scanner;
public class ReadingUserInputChallenge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Numbers to add up");

        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("#" + i + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt)
            {
                sum += scanner.nextInt();
            }
            else
            {
                System.out.println("Invalid Entry");
                scanner.close();
            }
            scanner.nextLine();
        }

        System.out.println("Total: " + sum);
        scanner.close();
    }
}
