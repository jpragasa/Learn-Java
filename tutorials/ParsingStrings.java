package learning.tutorials;

public class ParsingStrings
{
    public static void main(String[] args)
    {
        String numberAsString = "2019.125";
        System.out.println("numberAsString: " + numberAsString);

        //Converts string to int
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString " + numberAsString);
        System.out.println("Number = " + number);
    }
}
