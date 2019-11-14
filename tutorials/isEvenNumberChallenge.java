package learning.tutorials;

public class isEvenNumberChallenge {
    public static void main(String[] args)
    {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            evenNumbersFound++;
            System.out.println(number + " is an even number. " + evenNumbersFound + " even numbers found");
            if(evenNumbersFound == 5)
            {
                break;
            }

        }
    }
    public static boolean isEvenNumber(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
