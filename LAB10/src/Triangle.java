public class Triangle extends Shape {

    private int base, height;

    Triangle(String color, int base, int height) {

        super.setColor(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {

        return base;
    }

    public int getHeight() {

        return height;
    }

    public double getArea() {

        return (double)1/2*getBase()*getHeight();
    }

    public String toString() {

        return super.toString();
    }

}