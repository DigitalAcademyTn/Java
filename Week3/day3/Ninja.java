public class Ninja{

    // Member variables
    private int health;
    private String name;
    private String weapon;
    private int damage;

    // Class vaiables
    private static int numberOfNinja;

    // Constructor
    public Ninja(String name,String weapon, int damage){
        this.name = name;
        this.health = 120;
        this.weapon = weapon;
        this.damage = damage;
        numberOfNinja++;
    }

    // Overloading Constructor

    public Ninja(String name){
        this.name = name;
        this.health = 120;
        this.weapon = "punches";
        this.damage = 25;
        numberOfNinja++;
    }


    public Ninja(){
        this.name = "anonymous";
        this.health = 100;
        this.weapon = "punches";
        this.damage = 25;
    }

// methods 
public void displayStat(){
    System.out.println("name: " + this.name);
    System.out.println("health: " + this.health);
    System.out.println("weapon: " + this.weapon);
    System.out.println("damage: " + this.damage);
}

public void attack(Ninja target){
    target.setHealth(target.getHealth() - this.damage);
    System.out.println(this.name + " attack " + target.name);

}

public void eatPizza(){
    System.out.println(this.getName() + " Eat Pizza");
    this.health += 25;
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

// Class methods
public static int getNumberOfNinja(){
    return numberOfNinja;
}




}