import javax.swing.*;
import java.awt.*; //for the border layout

public class Bordersss {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); //creating the frame
        frame.setTitle("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 0)); //we don't really need to set up a frame with a border layout, it happens by default
        //furthermore, the two ints in the constructor for BorderLayout contains values for margin width between components. so if the 1st one is 0, you see vertical margins (since there is a horizontal gap), and if the second one is zero, you see horizontal margins (since there is a vertical gap)

        JPanel panel1 = new JPanel(); //creating the panels
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED); //setting the color of the panels
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100, 100)); //sets a preferred size of the panel when it initially opens. now, since panel 1 is red and attaches to north, it's height stays constant, so the heigh 100 setting is fine, but the width changes as you expand the window, which is the point of the borderlayout.
        panel2.setPreferredSize(new Dimension(100, 100)); //so here, height is unaffected by the setting here because it changes dynamically, but the width setting does matter.
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100)); //since panel 5 is at the center, it explands dynamically, so the height width setting here doesn't really matter

        //----------sub panels---------- (TO GO ON TOP OF PANELS) (if you want, no point in doing it realistically speaking)

        JPanel subpanel1 = new JPanel(); //creating the subpanels 
        JPanel subpanel2 = new JPanel();
        JPanel subpanel3 = new JPanel();
        JPanel subpanel4 = new JPanel();
        JPanel subpanel5 = new JPanel();

        subpanel1.setBackground(Color.BLACK); //setting the color of the subpanels
        subpanel2.setBackground(Color.DARK_GRAY);
        subpanel3.setBackground(Color.GRAY);
        subpanel4.setBackground(Color.LIGHT_GRAY);
        subpanel5.setBackground(Color.WHITE);

        subpanel1.setPreferredSize(new Dimension(50, 50)); 
        subpanel2.setPreferredSize(new Dimension(50, 50)); 
        subpanel3.setPreferredSize(new Dimension(50, 50));
        subpanel4.setPreferredSize(new Dimension(50, 50));
        subpanel5.setPreferredSize(new Dimension(50, 50));

        //INTEGRAL: since we're going to add the subpanels on top of panels with the Borderlayout manager, we need to set the panel's (not the subpanel's) layout manager to new borderlayout.

        //say we wanna add a subpanel to panel 5. then,
        panel5.setLayout(new BorderLayout()); //we make the layout manager of panel5 (the center panel, as borderlayout)

        panel5.add(subpanel1, BorderLayout.NORTH); //we add the subpanel with the borderlayout the same way we added the normal panels to the frame. 
        panel5.add(subpanel2, BorderLayout.WEST);
        panel5.add(subpanel3, BorderLayout.EAST);
        panel5.add(subpanel4, BorderLayout.SOUTH);

        //----------sub panels----------

        frame.add(panel1, BorderLayout.NORTH); // adding the panel using the border layout, you have (the name of the panel, the BorderLayout.NORTH/SOUTH/EAST/WEST/CENTER/other stuff);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        

        frame.setVisible(true);
    }
    
}
