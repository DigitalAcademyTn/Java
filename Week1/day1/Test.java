import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello world !");

// VARIABLES 
    //PRIMITIVES
    int x = 3;
    // System.out.println(x);

    boolean vote = true;
    double tax = 3.4;
    // System.out.println(tax);

    float xx = 3.14f;
    // System.out.println(xx);

    char letter = 'c';
    // System.out.println(letter);


//* Object Types (Wrapper Classes)
    Integer y = 1223335;
    String name = "Bob";
    Boolean IsAdmin = true;
    Double pi = 3.14;

// ----------String----------
    String a = "my name is Bob";
    String b = "my name is John";
    // System.out.println(a.length());
    // System.out.println(a); 
    // System.out.println(a.concat(b));
    boolean isTrue = b.contains("j");
    // System.out.println(isTrue);

// ----------Arrays-------
    int[] numbers;
    numbers = new int[3];

    numbers[0] = 11;
    numbers[1] = 5;
    numbers[2] = 2;
    // numbers[3] = 90;
    System.out.println(Arrays.toString(numbers));

    int[] myArray = {4, 8, 8, 5, 9};
    System.out.println(Arrays.toString(myArray));






    }

}


