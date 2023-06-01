public class Point {

    private int x;
    private int y;

    public Point() {

        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public String toString() {
        
        return "("+x+","+y+")";
    }

    public double distance(Point point) {

        return Math.sqrt(((this.y-point.y)*(this.y-point.y))+((this.x-point.x)*(this.x-point.x)));
    }
    
}
