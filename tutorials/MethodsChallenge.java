package learning.tutorials;

public class MethodsChallenge {
    public static void main(String[] args)
    {
        displayHighScorePosition("Josh", calculateHighScore(1500));
        displayHighScorePosition("Cailyn", calculateHighScore(900));
        displayHighScorePosition("Rachel", calculateHighScore(400));
        displayHighScorePosition("Jackie", calculateHighScore(50));
    }

    public static void displayHighScorePosition(String name, int highScore)
    {
        System.out.println(name + " managed to get into position " + highScore);
    }

    public static int calculateHighScore(int playerScore)
    {
        if (playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000)
        {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
}
