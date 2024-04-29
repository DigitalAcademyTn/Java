public class Ninja{

// Member variables
    private String name;
    private int health;

//  Constructor
public Ninja(String name){
    this.name= name;
    this.health = 100;
}
// OVERLOADING Constructor
public Ninja(String name, int health){
    this.name = name;
    this.health= health;
}

// Methods 
public void displayStatic(){
    System.out.println("Name: " + name);
    System.out.println("Health: " + health);
}

public void eatBanana(){
    this.health = this.health + 30;
}


// Getters and Setters
public String getName(){

    return this.name;
}
 public void setName(String newName){
    this.name = newName;
 }

public int getHealth(){
    return this.health;
}
 public void setHealth(int newHealth){
    this.health = newHealth;
 }

}