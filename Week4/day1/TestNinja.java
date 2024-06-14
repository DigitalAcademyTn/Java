public class TestNinja{
    public static void main(String[] args){


        // System.out.println(args[0]);
        // System.out.println(args[1]);

        // System.out.println(" number of ninja " + Ninja.getNumberOfNinja());


        // Ninja ninja1 = new Ninja();
        // ninja1.setName("ahmed");


        Weapon nunchucks = new Weapon("nunchucks");

        Ninja ninja2 = new Ninja("Syrine", nunchucks,30);

        // Ninja ninja3 = new Ninja("Adhar",50, "katana");

        // ninja1.displayInfo();

        ninja2.displayInfo();

        System.out.println("************************");
        System.out.println("weapon : " + ninja2.getWeapon().getColor());

        // System.out.println("************************");

        // ninja3.displayInfo();

        System.out.println("************************");

        System.out.println(" number of ninja "+Ninja.getNumberOfNinja());

        
        
        
    }
}