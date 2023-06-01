public class Plant {

    private String name;
    private String color;

    Plant() {

        name = null;
        color = null;
    }

    Plant(String name, String color) {

        this.name = name;
        this.color = color;
    }

    public String getName() {
        
        return name;
    }

    public String getColor() {
        
        return color;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setColor(String color) {
        
        this.color = color;
    }

    public String toString() {

        return "The name of the plant is " + getName() + ", and it's color is " + getColor() + ".";
    }
    
    
}
