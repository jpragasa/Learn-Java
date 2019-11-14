package learning.tutorials;

public class NumberToWordsChallenge
{
    public static void main(String[] args)
    {
        numberToWords(6);
        System.out.println(reverse(-2));
        System.out.println(getDigitCount(9999));
        System.out.println(getDigitCount(1023456789));
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int last = 0;
        int reverse = reverse(number);

        for (int i = 1; i <= getDigitCount(number); i++) {
            last = reverse % 10;
            reverse /= 10;

            switch (last) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        int n = number;

        while (n != 0) {
            reversed += n % 10;
            n /= 10;
            if(n != 0) {
                reversed *= 10;
            }
        }
        return reversed;
    }

    public static int getDigitCount(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;

        } while (number > 0);
        return count;
    }
}
