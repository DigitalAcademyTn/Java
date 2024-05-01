public class Ninja{

    // Member variables
    private int health;
    private String name;
    private String weapon;
    private int damage;


    // Constructor
    public Ninja(String name,String weapon, int damage){
        this.name = name;
        this.health = 120;
        this.weapon = weapon;
        this.damage = damage;
    }

    // Overloading Constructor

    public Ninja(String name){
        this.name = name;
        this.health = 120;
        this.weapon = "punches";
        this.damage = 25;
    }


    public Ninja(){
        this.name = "anonymous";
        this.health = 100;
        this.weapon = "punches";
        this.damage = 25;
    }

// method 
public void displayStat(){
    System.out.println("name: " + this.name);
    System.out.println("health: " + this.health);
    System.out.println("weapon: " + this.weapon);
    System.out.println("damage: " + this.damage);
}

public void attack(Ninja ninja){
    ninja.setHealth(ninja.getHealth() - this.damage);
    System.out.println(this.name + " attack " + ninja.name);

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

public String getWeapon(){
    return this.weapon;
}
public void setWeapon(String weapon){
    this.weapon = weapon;
}

public int getDamage(){
    return this.damage;
}
public void setDamage(int damage){
    this.damage = damage;
}







}