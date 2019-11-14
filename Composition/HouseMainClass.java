package learning.Composition;


import org.w3c.dom.ls.LSOutput;

public class HouseMainClass
{
    public static void main(String args)
    {
        House house = new House(new LivingRoom(2,1,2,true),
                new Kitchen(false,1,false,true),
                new Bedroom(3,1,true));
    }
}
