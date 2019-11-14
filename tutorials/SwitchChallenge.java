package learning.tutorials;

import java.util.Random;

public class SwitchChallenge {
    public static void main(String[] args)
    {
        char newChar = 'a';
        switch (newChar)
        {
            case 'a':
                System.out.println("a was found");
                break;
            case 'b':
                System.out.println("b was found");
                break;
            case 'c':
                System.out.println("c was found");
                break;
            case 'd':
                System.out.println("d was found");
                break;
            case 'e':
                System.out.println("e was found");
                break;
            default:
                System.out.println("a,b,c,d, or e was not found");
        }
    }
}
