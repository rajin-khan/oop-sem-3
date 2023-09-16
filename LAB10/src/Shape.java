public abstract class Shape {

    private String color;

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public abstract double getArea();

    public String toString() {

        return "The color is: " + getColor() + ", and the area is: " + getArea() + "cm².\n";
    }
    
}
