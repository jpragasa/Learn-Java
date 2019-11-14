package learning.Encapsulation;

public class Main
{
    public static void main(String[] args)
    {
//        EnhancedPlayer player = new EnhancedPlayer("Josh",300,"Spear");
//        System.out.println("Initial health is " + player.getHealth());
//        System.out.println("My weapon is a " + player.getWeapon());

        Printer printer = new Printer(true);
        printer.addPages(6);
        printer.fillTonerLevel(20);
        System.out.println("Toner: " + printer.getTonerLevel() + " \nPrinted Pages: " + printer.getPagesPrinted() + " \nIs this printer duplex?: " + printer.getIsDuplex());
    }
}

//        Player player = new Player();
//        player.name = "Josh";
//        player.health = 20;
//        player.weapon = "Spear";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
