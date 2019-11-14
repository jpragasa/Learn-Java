package learning.OOP;

public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {
        System.out.println("Fish is sleeping...");
    }
    private void swim()
    {
        System.out.println("Fishy is swimming fast...");
    }
    private void moveMuscles()
    {
        System.out.println("Fishy is using muscles...");
    }
    private void moveBackFin()
    {
        System.out.println("Fishy is moving its backfin....");
    }
    private void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
