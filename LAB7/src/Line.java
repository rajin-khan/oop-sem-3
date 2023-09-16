import java.util.*;

public class Line {

    private Point start = new Point();
    private Point end = new Point();

    public Line(Point start, Point end) {

        this.start.setX(0);
        this.start.setY(0);

        this.end.setX(0);
        this.end.setY(0);
    }

    public Line(int x1, int y1, int x2, int y2) {

        this.start.setX(x1);
        this.start.setY(y1);

        this.end.setX(x2);
        this.end.setY(y2);
    }

    public Point getStart() {

        return start;
    }

    public Point getEnd() {

        return end;
    }

    public void setStart(Point start) {

        this.start = start;
    }

    public void setEnd(Point end) {

        this.end = end;
    }

    public double length() {

        return end.distance(start);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the coordinates of the first point:");

        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();

        System.out.println("\nEnter the coordinates of the second point:");

        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();

        sc.close();


        Point start = new Point(x1,y1);
        Point end = new Point(x2, y2);
        
        Line l1 = new Line(x1, y1, x2, y2);

        System.out.println();

        System.out.println("The line is made up of the coordinates: "+start.toString()+", "+end.toString()+"\n");
        
        System.out.println("The length of the line is = "+l1.length());

        System.out.println();
    }
    
}
