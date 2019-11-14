package learning.tutorials;

public class KeyWords {
    public static void main(String[] args)
    {
        //Make Sure you are not using one of the 53 keywords as a variable
        // false, true, null, etc...

        //Java Statements

        double kilometres = (100 * 1.609888);
        int highScore = 50;

        if(highScore == 50)
        {
            System.out.println("This is an expression!");
        }

        int score = 100; // = is the operator, 100 is the expression, in is the keyword
        if (score > 99) // if is the keyword, score > 99 is the expression
        {
            System.out.println("You got the high score!"); //System.out.println is the keywords and method, The text is the expression
            score = 0;
        }
    }
}
