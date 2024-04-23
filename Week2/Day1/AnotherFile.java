public class AnotherFile{

public void sayHi(){
    System.out.println("Hi !");
}

public String sayHi(String name){
    return "hi " + name;
}


public void sayHi(String name, int numberOfTime){
    
    for(int i =0 ; i< numberOfTime; i++){
        System.out.println(name);
    }

}

}