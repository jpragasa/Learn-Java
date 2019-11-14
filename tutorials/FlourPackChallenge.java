package learning.tutorials;

public class FlourPackChallenge
{
    public static void main(String[] args)
    {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(3,2,-12));
        System.out.println(canPack(5,3,24));
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        int big = bigCount * 5;
        int small = smallCount;
        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }
        if(big + small == goal)
        {
            return true;
        }
        if(big + small > goal)
        {
            if(big > goal && small == 0)
            {
                return false;
            }
            else if((big <= goal && big + small >= goal) || (big / 2 + small >= goal))
            {
                return true;
            }
        }
        return false;
    }
}
