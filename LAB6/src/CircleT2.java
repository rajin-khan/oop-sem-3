public class CircleT2 {

    final double PI = 3.14;

    double radius;
    double area;
    double perimeter;
    String colour;

    CircleT2(double radius, String colour) {

        area = PI*radius*radius;
        perimeter = 2*PI*radius;
        this.colour = colour;
    }
    
}

