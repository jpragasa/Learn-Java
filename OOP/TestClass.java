package learning.OOP;

public class TestClass
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4,1,20, "Long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add = " + calculator.getAdditionResult());
//        System.out.println("subtract = " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply = " + calculator.getMultiplicationResult());
//        System.out.println("divide = " + calculator.getDivisionResult());

//        Bank bank = new Bank("8800909",400, "Cailyn Bentley", "cuteAdorableStringgirl@seu.edu","8889990000");
//        System.out.println(bank.getBalance());
//
//        VipCustomer customer = new VipCustomer("Josh", 9000, "jpragasa@seu.edu");
////        System.out.println(customer.getCreditLimit());
////        System.out.println(customer.getName());
////        System.out.println(customer.getEmail());
//        Wall wall = new Wall(5,4);
//        System.out.println(wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("Width = " + wall.getWidth());
//        System.out.println("Height = " + wall.getHeight());
//        System.out.println("Area = " + wall.getArea());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0) = " + first.distance());
//        System.out.println("distance(second) = " + first.distance(second));
//        System.out.println("distance(2,2) = " + first.distance(2, 2));
//
//        Point point = new Point();
//        System.out.println("distance() = " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("Total = " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("Total = " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0,1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real = " + one.getReal());
//        System.out.println("one.imaginary = " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real = " + one.getReal());
//        System.out.println("one.imaginary = " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real = " + number.getReal());
//        System.out.println("number.imaginary = " + number.getImaginary());