import javax.swing.*;

public class GUI {

    JFrame frame;
    JPanel panel;

    public GUI() {

        frame = new JFrame("GUI2 already?");
        frame.setSize(100, 100); //another way to declare the size of the window, pixels by pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //again, for good practice, must include thise
        frame.setVisible(true); //must also add this

        panel = new JPanel(); //panels are sort of like invisible border guideline elements.

    }

    public static void main(String[] args) {

        new GUI();
    }
    
}
