class Weapon{


    // Member variables
    private String type;
    private String color;
    private int weight;

// Constructor
    public Weapon(String type){
        this.type = type;
        color = "grey";
        weight = 20;
    }


    // ----GETTERS & setters
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

        public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }



}