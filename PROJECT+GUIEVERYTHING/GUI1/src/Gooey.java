import javax.swing.*;
import java.awt.*; //used for the gridlayout, more specifically, the layout manager
import java.awt.event.*; //used for the action listener thing

public class Gooey implements ActionListener{ //we only make it implement action listener because it has to listen for the number of clicks, and it looks for the method action performed

    private int count = 0; //variable for the number of clicks, have to put it up here to make the scope of it visible to everything else
    private JFrame frame; //good practice to make the frames and labels global and hence declare these objects earlier, before the constructor, then use the objects later in the constructor
    private JPanel panel; //also good practice to make everything private
    private JLabel label; //we had to make the scope of the label global so the actionperformed method can see it, since we're changing the label

    public Gooey() {

        //main frame creation
        frame = new JFrame(); //creating a new frame (but it has nothing in it until you add a panel)

        //other stuff like buttons and labels
        JButton button = new JButton("Click me bitch!"); //creates a button with the text you just input
        button.addActionListener(this); //created for listening to an action, and the "this" keyword is so that it listens for the action of the button in the Gooey class, and because of it, we had to add the implements actionlistener


        label = new JLabel("Number of Clicks: 0"); //adds a text label, and shows the intial amount of clicks, as 0

        //main panel creation
        panel = new JPanel(); //creating a new panel object

        //parameters of what the panel contains
        panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100)); //this is setting the border(i.e, the dimensions of the window)
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button); //adds the button to the panel
        panel.add(label); //adds the label underneath the button (the position of this label changes based on whether you put this function before or after the add button)

        //what the main frame does
        frame.add(panel, BorderLayout.CENTER); //you add the frame (as i understand it, opens it, with the panel that you created, and starts implementing the border from the center)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //good practice to always add a default close operation
        frame.setTitle("What a sick Gooey"); //what goes on the status bar of the window

        frame.pack(); //idk what this does but also imp
        frame.setVisible(true); //makes the window visible

    }

    public static void main(String[] args) {
        
        new Gooey();
    }

    public void actionPerformed(ActionEvent e) { //this is the method implemented from ActionListener, i.e, the click, and it's tied to the button object, it must also be outside main (bc it's a diff method that's called when you use actionListener)

        //here, we put in what happens when we click, or when the action is performed.
        count++;
        label.setText("Number of cliks: " + count); //every time a click happens, i.e, the action is performed, the text label updates to show a new text
    }
}