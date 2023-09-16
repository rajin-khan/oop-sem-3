import javax.swing.*;
import java.awt.*;

public class Panels {

    public static void main(String[] args) {

        // JPanel a GUI component that functions as a container to hold other component, basically sections off areas of your code.

        JFrame frame = new JFrame("Panels!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);

        //add panels
        JPanel redPanel = new JPanel(); //creating a new panel
        redPanel.setBackground(Color.RED); //setting the bg color of the panel
        redPanel.setBounds(0, 0, 200, 200); //bounds of the panel
        redPanel.setLayout(new BorderLayout()); //refer to line the comment at the bottom, where i typed out about layout manager types (so now it's a borderlayout type)
        frame.add(redPanel); //REMEMBER TO ADD THE PANEL

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(200, 0, 200, 200);
        bluePanel.setLayout(null);
        frame.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 200, 400, 200); 
        //didn't change the setlayout manager to border type, so you remember the default float type
        frame.add(greenPanel);

        //add labels to the panels
        JLabel redLabel = new JLabel();
        redLabel.setText("this panel is red.");
        redLabel.setFont(new Font("Menlo", Font.PLAIN, 11));
        redLabel.setVerticalAlignment(JLabel.CENTER); //since we used the border layout type for the layout manager, we can use these commands
        redLabel.setHorizontalAlignment(JLabel.CENTER); //same as above

        redPanel.add(redLabel); //you can add labels to the panels, or the frames.

        JLabel blueLabel = new JLabel();
        blueLabel.setText("hi.");
        blueLabel.setFont(new Font("Menlo", Font.PLAIN, 11));
        blueLabel.setBounds(0, 0, 200, 50); //this will set the x and y of the text according to the context of the PANEL.

        bluePanel.add(blueLabel);

        JLabel greenLabel = new JLabel();
        greenLabel.setText("this panel is green.");
        greenLabel.setFont(new Font("Menlo", Font.PLAIN, 11)); 
        //didn't change the vert or horizontal alignment here, because you didn't change the type of this panel's layout manager to border type

        greenPanel.add(greenLabel);

        /*
        keep in mind, panels use a flow layout manager, instead of the borderlayout manager like frames do.
        the difference lies in the fact that the border layout manager places things to the left and center by default,
        whereas a flow layout manager pins it to the top and center, and fills the panels, in this case, until the first "row" is filled.
        then it moves on to the next row, and so on and so forth.
        this is why your text appears at the top and center of every panel.
        so, we make the layout manager a border type, because we use that for the frame one and we're familiar with it.
        hence the "redPanel setLayout(new BorderLayout());"
        */

        


        frame.setVisible(true);
    }
    
}
