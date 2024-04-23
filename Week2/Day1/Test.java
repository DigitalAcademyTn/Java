import java.util.Arrays;
import java.util.ArrayList;

public class Test{
    // entry point 
    public static void main(String[] args){
        // System.out.println("hello there");
    String[] fruits = {"banana" , "tomato", "starwberry", "kiwi"};

    
    String temp = fruits[0];
    fruits[0] = fruits[fruits.length -1];
    fruits[fruits.length-1] = temp;
    // System.out.println(Arrays.toString(fruits));

// ArrayList

    ArrayList<Integer>  numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(10);
    numbers.add(18);

    // System.out.println(numbers);

    ArrayList<String>  names = new ArrayList<String>();
    names.add("Bob");
    names.add("Mary");
    names.add("John");
    for(int i=0; i<names.size(); i++){
        names.set(i, names.get(i) + " is awesome");
        System.out.println(names.get(i));
    }

    names.remove(1);
    System.out.println(names);


// if statement
    boolean isRaining = false;
    boolean isCold = true;
    
    if(isRaining) {
        // System.out.println("Bring an umbrella.");
    }
    else if(isCold) {
        // System.out.println("Wear a coat.");
    }
    else {
        // System.out.println("Have fun!");
    }
    
// Ternary Operators
    System.out.println(isRaining ? "Bring an umbrella" : "Have fun!");


// instantiate methods from another class

    AnotherFile unicorns = new AnotherFile();

    unicorns.sayHi();
    String text = unicorns.sayHi("Syrine");
    System.out.println(text);

    unicorns.sayHi("Syrine",3);


// Enhanced For Loop



    


    }
}