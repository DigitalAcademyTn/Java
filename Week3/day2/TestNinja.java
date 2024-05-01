public class TestNinja{
    public static void main(String[] args){

        // instantiate the Ninja class
        Ninja Miky = new Ninja("Miky");
        Ninja Leo = new Ninja("Leo", "katana", 33);

        Miky.displayStat();
        Leo.attack(Miky);
        Miky.displayStat();

        // System.out.println(Leo.getName());
        // System.out.println("=========");
        // System.out.println(Leo.getDamage());
        // System.out.println("=========");
        // System.out.println(Leo.getHealth());
        // System.out.println("=========");
        // System.out.println(Leo.getWeapon());

    }
}