package learning.tutorials;

public class PrimitiveTypesChallenge {
    public static void main(String[] args)
    {
        byte byteNum = 13;
        short shortNum = 32000;
        int intNum = 500;
        long longNum = (50000 + (10 * byteNum + shortNum + intNum));

        System.out.println(longNum);
    }
}
