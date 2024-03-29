package learning.tutorials;

public class BarkingDog {

    public static void main(String[] args)
    {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(shouldWakeUp(false,-5));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {

        if (hourOfDay < 8 || hourOfDay >= 23)
        {
            if(hourOfDay < 0 || hourOfDay >= 23)
            {
                return false;
            }
            else
            {
                return barking;
            }
        }
        else
        {
            return !barking;
        }
    }
}
