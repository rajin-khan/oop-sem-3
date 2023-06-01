import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame { //it extends jframe

    MainFrame() { //we create the constructor that calls the this frame

        //set everything as usual, but wherever you would put the name of the frame, use "this"
        this.setTitle("Elmo Runner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.darkGray);
        //frame.getContentPane().setBackground(new Color(255, 204, 51)); //can put in RGB values or hex code (start with 0x) here for custom color

        this.setVisible(true);
    }
    
}
