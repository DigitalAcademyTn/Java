import java.util.ArrayList;

public class Something{

    public void printArray(ArrayList<String> someArr){
        for(int i=0; i<someArr.size(); i++){
            // String tempString = someArr.get(i);
            // System.out.println(tempString+ " is cool");
            someArr.set(i, someArr.get(i)+ " is cool");
        }
        System.out.println(someArr); 
    }

    public String sumArray(ArrayList<Integer> numberArray){
        Integer sum=0;
        for(int number : numberArray ){
            sum += number;
        }
        if(sum > 100){
            return "the sum is big!!!";
        } else {
            return "the sum is less than 100";
        }
    }

    public String hello(String name){
        return "hi " + name;
    }


}