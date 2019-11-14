package learning.tutorials;

public class FloatingPointNumbers {
    public static void main(String[] args)
    {
        //Max and Min values of a Float
        float myFloatMaxValue = Float.MAX_VALUE;
        float myFloatMinValue = Float.MIN_VALUE;
        System.out.println("Max value of a float: " + myFloatMaxValue);
        System.out.println("Min value of a float: " + myFloatMinValue);

        //Max and Min values of a double
        double myDoubleMaxValue = Float.MAX_VALUE;
        double myDoubleMinValue = Float.MIN_VALUE;
        System.out.println("Max value of a double: " + myDoubleMaxValue);
        System.out.println("Min value of a double: " + myDoubleMinValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;
        System.out.println(myIntValue + myFloatValue + myDoubleValue);
    }
}
