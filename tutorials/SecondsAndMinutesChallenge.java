package learning.tutorials;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args)
    {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(99));
        System.out.println(getDurationString(50));
    }

    private static String getDurationString(int minutes, int seconds)
    {
        int hours;
        if(minutes >= 0 && seconds >= 0 && seconds <= 59)
        {
            if(minutes >= 60)
            {
                hours = minutes / 60;
                minutes %= 60;
                if(seconds > 60)
                {
                    minutes += (seconds/60);
                    return (hours + "h " + minutes + "m " + seconds + "s");
                }

                return (hours + "h " + minutes + "m " + seconds + "s");
            }

            return ("0h " + minutes + "m " + seconds + "s");
        }

        return INVALID_VALUE_MESSAGE;

    }

    private static String getDurationString(int seconds)
    {
        if(seconds >= 0)
        {
            if(seconds >= 60)
            {
                return getDurationString(seconds /= 60, seconds %= 60);
            }
            return getDurationString(0, seconds);
        }

        return INVALID_VALUE_MESSAGE;

    }

}
