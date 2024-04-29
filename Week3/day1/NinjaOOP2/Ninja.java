public class Ninja{

    // Member variables
    private String name;
    private int health;
    private int damage;
    

// Constructor
public Ninja(){
    this.name = "anonymous";
    this.health = 120;
    this.damage = 20;
}

// Overloading Constrcutor
public Ninja(String name, int damage){
    this.name = name;
    this.health = 120;
    this.damage = damage;
}


// Getters & Setters
public String getName(){
    return this.name;
}
public void setName(String name){
    this.name = name;
}

public int getHealth(){
    return this.health;
}
public void setHealth(int health){
    this.health = health;
}

public int getDamage(){
    return this.damage;
}
public void setDamage(int damage){
    this.damage = damage;
}



}