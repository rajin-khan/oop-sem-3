import javax.swing.*;
import java.awt.*;

public class Gridddd {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 10)); //assigns them according to the number of components in columns by default.
        //integer values in gridlayout constructor: 1st: number of rows, 2nd: number of cols.
        //                                        :  3rd: horizontal spacing, 4th, vertical spacing

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);
    }
    
}
