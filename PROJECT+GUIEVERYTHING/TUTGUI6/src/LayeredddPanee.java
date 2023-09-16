import javax.swing.*;
import java.awt.*;

public class LayeredddPanee {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("JLayered Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); //has to be set to null to use jlayeredpane, i think

        JLabel label1 = new JLabel();
        label1.setBounds(50, 50, 200, 200); //we're creating labels to add to the jlayeredpane
        label1.setOpaque(true);
        label1.setBackground(Color.RED);

        JLabel label2 = new JLabel();
        label2.setBounds(100, 100, 200, 200); 
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);

        JLabel label3 = new JLabel();
        label3.setBounds(150, 150, 200, 200); 
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);

        //a JLayeredPane is a Swing component that provides a third dimension for positioning components. essentially providing depth or a z-axis.
        //similar to a JPanel, except we can spacify different layers

        JLayeredPane layeredPane = new JLayeredPane(); //creating the jlayeredpane
        layeredPane.setBounds(0, 0, 500, 500); //MUST ALWAYS SET THE BOUNDS OF THE JLAYEREDPANE TO THE EXACT SIZE OF THE FRAME, OR ELSE THE 3D SPACE THING WON'T APPLY TO ALL PARTS OF THE FRAME
        
        //adding the labels to the jlpane
        //by default, java adds the FIRST component you add to the top of the JLpane, and so on and so forth, UNLESS YOU CHANGE IT IN THE ADD CONSTRUCTOR.

        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); //in the constructor of add, we can specify in which layer we put it, like this
        layeredPane.add(label2, Integer.valueOf(0)); //however, since most people don't need to remember the name of the layer, this shortcut can be used, with 0 being the back-est layer.
        layeredPane.add(label3, Integer.valueOf(1));    

        frame.add(layeredPane); //the jlpane is like a panel, just a container, so it's invisible until you add some components like a jlabel to it, which we did.

        
        /*
        now, these layers have names, with the back-most one being 
        DEFAULT, (followed by):
            PALETTE, 
                MODAL, 
                    POP UP
                        DRAG (front-est layer).
        hence, we can use these names to add things to those layers of the jlpane, if we want to do it like that
        */
        
        frame.setVisible(true);
    }
    
}
