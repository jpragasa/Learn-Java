package learning.tutorials;

public class WhileStatement{
    public static void main(String[] args)
    {
        int count = 1;
        while(count != 6)
        {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 0;
        do
        {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
    }
}
