package learning.tutorials;

public class IfThenElse {
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        if (score == 10000)
        {
            System.out.println(score);
        }

    }
}
