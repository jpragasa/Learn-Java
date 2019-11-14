package learning.tutorials;

public class IfThenStatements {
    public static void main(String[] args)
    {
        //Simple Controle Flow statements aka conditional logic
        //Conditional operators: > < >= <= && || !=
        boolean isAlien = true;

        if (isAlien == false)
        {
            System.out.println("It is not an alien!");
        }
        else
        {
            System.out.println("Yep...it's definitely an alien....");
        }

        int topScore = 100;
        if (topScore >= 100 || isAlien == true)
        {
            System.out.println("You got the high score!");
        }
        else
        {
            System.out.println("You Lose!");
        }

        int newValue = 50;
        if (newValue == 50)
        {
            System.out.println("This is correct!");
        }

        boolean isCar = false;
        boolean wasCar = isCar ? true:false;
        wasCar = true;
        if (wasCar)
        {
            System.out.println("This is true!");
        }
    }
}
