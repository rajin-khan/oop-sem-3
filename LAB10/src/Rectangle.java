public class Rectangle extends Shape {

    private int length, width;

    Rectangle(String color, int length, int width) {

        super.setColor(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {

        return length;
    }

    public int getWidth() {

        return width;
    }

    public double getArea() {

        return getLength()*getWidth();
    }

    public String toString() {

        return super.toString();
    }

}
