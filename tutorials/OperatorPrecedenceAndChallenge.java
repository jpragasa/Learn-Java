package learning.tutorials;

public class OperatorPrecedenceAndChallenge {
    public static void main(String[] args)
    {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double total = (num1 + num2) * 100d;

        double remainder = total % 40.00d;

        boolean isRemainder = remainder == 0 ? true: false;

        if(isRemainder == true)
        {
            System.out.println("This number is even because it has no remainder!");
        }
        else
        {
            System.out.println("This number has a remainder of: " + remainder);
        }
    }
}
