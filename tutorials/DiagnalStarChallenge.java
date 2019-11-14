package learning.tutorials;

public class DiagnalStarChallenge
{
    public static void main(String[] args)
    {
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        if(number >= 5) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j == 1 || j == number || i == 1 || i == number || j == i || j == (number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
