package learning.tutorials;

public class MinutesToYearsAndDaysChallenge {
    public static void main(String[] args)
    {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(1440);
    }
    public static void printYearsAndDays(long minutes)
    {
        long hours;
        long days;
        long years;
        if(minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            hours = minutes / 60;
            if(hours >= 24)
            {
                days = hours / 24;
                if(days >= 365)
                {
                    years = days / 365;
                    if(days / 365 != 0)
                    {
                        days = (days % 365);
                    }
                    System.out.println(minutes + " min = " + years + " y and " + days + " d");
                }
                else
                {
                    System.out.println(minutes + " min = " + 0 + " y and " + days + " d");
                }
            }
            else
            {
                System.out.println(0 + " min = " + 0 + " y and " + 0 + " d");
            }
        }
    }
}
