package learning.tutorials;

public class NumberPalindromeChallenge
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int lastDigit;
        int originalNumber = number;
        if(originalNumber < 0)
        {
            number *= -1;
        }
        while(number > 0)
        {
            reverse *= 10;
            lastDigit = number % 10;
            reverse += lastDigit;
            number /= 10;
        }
        if(originalNumber < 0)
        {
            reverse *= -1;
        }
        return (originalNumber == reverse) ? true:false;
    }
}
