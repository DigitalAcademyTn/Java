import java.util.ArrayList;

public class NewTest{
    public static void main(String[] args){

        Something  test = new Something();

        ArrayList<String> coolSTring = new ArrayList<String>();
        coolSTring.add("Adhar");
        coolSTring.add("Syrine");
        coolSTring.add("Mhamed");

        // test.printArray(coolSTring);

        // System.out.println(coolSTring);

        ArrayList<Integer> coolNumbers = new ArrayList<Integer>();
        coolNumbers.add(44);
        coolNumbers.add(2);
        coolNumbers.add(33);

        String sum = test.sumArray(coolNumbers);
        System.out.println(sum);

        System.out.println("---------------");
        String userName = System.console().readLine();
        
        System.out.println(test.hello(userName));
    }
}
    
