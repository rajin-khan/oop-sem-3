import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //for the actionlistener


public class MainFrame extends JFrame implements ActionListener{

    //it is much easier to do buttons with a different class, so we're doing that.

    JButton button; //we declared the button globally so it would come in scope of the actionperformed method
    JLabel eventLabel; //same here
    int count = 1; //to show number of button presses

    MainFrame() {

        //the frame
        this.setTitle("Fart Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLayout(null);

        //creating an image icon for use later
        ImageIcon image = new ImageIcon("poo.png");
        
        //random bs labels i added emnei
        JLabel toplabel = new JLabel();
        toplabel.setText("I AM THE HOLY FART BUTTON");
        toplabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        toplabel.setForeground(Color.YELLOW);
        toplabel.setBounds(110, 50, 180, 30);
        this.add(toplabel);

        //more random bs labels
        JLabel bottomlabel = new JLabel();
        bottomlabel.setText("TREMBLE BEFORE MY POWER!");
        bottomlabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        bottomlabel.setForeground(Color.YELLOW);
        bottomlabel.setBounds(110, 300, 180, 30);
        this.add(bottomlabel);

        //MAIN STUFF

        //a JButton is a button that performs an action when clicked on.

        //creating the button
        button = new JButton();
        button.setBounds(125, 155, 140, 80);
        button.addActionListener(this); //we need to add an action listen method, which implements the action performed (also, "this" means we're just putting in the frame where the button is, or so to speak, the class which is implementing the actionlistener)
        
        //formatting the button
        button.setText("shid and fard");
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 9));
        button.setForeground(Color.BLACK); //change the color of text
        button.setBackground(Color.LIGHT_GRAY); //buttons behave a little weirdly on mac, you just see the border of the button change
        
        button.setBorderPainted(false); //to get rid of the border issue, (just for your mac)
        button.setOpaque(true); //make the color change visible (just for your mac)

        button.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK)); //for the border of the button, though it doesn't show up, dw, probably a fix on stack overflow, mac has button issues.
        button.setFocusable(false); //do this to get rid of the border around the button that makes it look like it's selected
        button.setIcon(image); //add an image icon to the button
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM); //position relative to image icon
        button.setIconTextGap(5); //can also be set to a negative number to bring the text closer to the icon

        //IMPORTANT
        // button.setEnabled(false); //to disable a button
        //so, what you could do is, but it in the action performed method, and after one click, it'd get disabled

        this.add(button);

        /*
        A REALLY REALLY HANDY SHORTCUT, CALLED LAMBDA EXPRESSIONS (watch video later)
        remove the implements action listener, also remove the actionperformed method, then:
        button.addActionListener(e -> System.out.println("poo"));
        AND IT DOES THE SAME THING
        */

        //a cool thing you can do is, add a certain things or labels in your frame after a button is pressed. so i'll create an eventlabel that only happens when my button is clicked.

        //declared globally so it's visible to the actionperformed method
        eventLabel = new JLabel();
        eventLabel.setText("you shat: 0 times");
        eventLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
        eventLabel.setForeground(Color.YELLOW);
        eventLabel.setBounds(140, 250, 180, 30);
        eventLabel.setVisible(false); //to keep it hidden initially, made true in the action performed method
        this.add(eventLabel);

        this.setVisible(true);
    }
    
    //we have to listen for the action performed and what to do after since we implemented action listener
    public void actionPerformed(ActionEvent e) {

        //button must also be declared as a global variable for this method to see it outside the constructor
        if(e.getSource()==button) { //this line means, if the action performed, is equal to the button, then sth happens

            System.out.println("poo");
            eventLabel.setVisible(true); //so it appears after you click it
            eventLabel.setText("you shat: " + count + " times");
            count++;
            // button.setEnabled(false); //so basically, when one click event occurs, the setenabled becomes false, meaning the button can't be pressed anymore.
        }
    }
    
}
