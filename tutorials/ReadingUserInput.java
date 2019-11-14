package learning.tutorials;

import java.util.Scanner;
public class ReadingUserInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("When were ya born fren? ");
        boolean hasNextInt = scanner.hasNextInt();


        if(hasNextInt)
        {
            int yearOfBirth = 2019 - scanner.nextInt();
            scanner.nextLine();

            System.out.println("What is your name?");
            String name = scanner.nextLine();
            if(yearOfBirth >= 0 && yearOfBirth <= 150)
            {
                System.out.println("Hi " + name + "! Imma guess you're " + yearOfBirth + " years old?");
            }
            else
            {
                System.out.println("Invalid Age");
            }
        }
        else
        {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
