import java.util.ArrayList;
import java.util.HashMap;

public class Test{
    public static void main(String[] args){
        double d = 35.25;
        double dd = 35.99;
        
        // casting the double d into a int
        //
        // int i = (int) dd; // loss of data
        // System.out.println(i); 

        //implicit casting
        int i = 35;
        float f = i;
        // System.out.println("The number is: " + f);


        
// Enhanced For Loop   
    ArrayList<String> names = new ArrayList<String>();
    names.add("Bob");
    names.add("John");
    names.add("michele");
   
    for(int j=0; j<names.size(); j++){ 
        // System.out.println(names.get(j));
    }

    for(String name : names){
    // System.out.println("hello " + name);
    }


// HashMap
    HashMap<String, String> userMap = new HashMap<String, String>();

    userMap.put("Fname", "Nancy Ninja");
    userMap.put("Lname", "Sam Samurai");

    // System.out.println(userMap);

    String lastName = userMap.get("Lname");
    // System.out.println(lastName);



// Exceptions

    // int[] myNumbers = {1, 2, 3};
    // System.out.println(myNumbers[10]); // err

    try{
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // err
    }
    catch (Exception e) {
        System.out.println("something wrong");
    }
    finally {
      System.out.println("The 'try catch' is finished.");
    }


        }
}