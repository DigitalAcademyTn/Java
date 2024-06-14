class Ninja{

    // Member variables
    private String name;
    private Integer health;
    // private String weapon;
    private Weapon weapon;
    private Integer damage;

    // class variables
    private static int numberOfNinja;


//  OVERLOADING Constructor
public Ninja(String name, Weapon weapon, Integer damage){
    this.name = name;
    this.health = 100;
    this.weapon = weapon;
    this.damage = damage; 
    numberOfNinja++;
}

public Ninja(String name, Integer damage, Weapon weapon){
    this.name = name;
    this.health = 200;
    this.weapon = weapon;
    this.damage = damage; 
    numberOfNinja++;

}

public Ninja(){
    this.name = "anonymous";
    this.health = 100;
    Weapon weapon1 = new Weapon("katana");
    this.weapon = weapon1;
    this.damage = 25; 
    numberOfNinja++;
}


// -----------Methods----------
public void displayInfo(){
    System.out.println("name :" + name);
    System.out.println("health :" + health);
    System.out.println("weapon :" + weapon);
    System.out.println("damage :" + damage);
}



    // GETTERS & SETTERS
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Integer getHealth(){
        return health;
    }

    public void setHealth(Integer health){
        this.health = health;
    }

    public Integer getDamage(){
        return damage;
    }

    public void setDamage(Integer damage){
        this.damage = damage;
    }


// ------static method--------
    public static int getNumberOfNinja(){
        return numberOfNinja;
    }








}