public class TestNinja{
    public static void main(String[] args){

// instantiate the ninja
        Ninja ninja1 = new Ninja("Rafael");

        Ninja ninja2 = new Ninja("leo", 70);

        // System.out.println(ninja1);

        // ninja1.setName("leo");
        // System.out.println(ninja1.getName());


        System.out.println(ninja1.getName());
        System.out.println("========");
        System.out.println(ninja1.getHealth());

        
        System.out.println(ninja2.getName());
        System.out.println("========");
        System.out.println(ninja2.getHealth());

        // ninja1.setHealth(ninja1.getHealth()-20);
        // System.out.println("========");
        // System.out.println(ninja1.getHealth());

        System.out.println("-------------------");
        ninja1.displayStatic();
        ninja1.eatBanana();
        ninja1.displayStatic();


    }
   
}