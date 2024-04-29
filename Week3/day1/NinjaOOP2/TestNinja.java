public class TestNinja{
    public static void main(String[] args){

        // Instanciate the Ninja class
        Ninja leo = new Ninja();
        Ninja Miky = new Ninja("Miky", 33); 

        System.out.println(leo.getName());
        System.out.println("===========");
        System.out.println(Miky.getName());


    }
}