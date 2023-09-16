import javax.swing.*;
import java.awt.*;

public class Flowww {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); //creating the frame
        frame.setTitle("Flow Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); //setting the border manager to be flow layout, and for the constructor, see comments in like 27.
        //the integer values in the constructor: the first one means the spacing between the elements (in this case, buttons) of the layout.
        //                                       the second one means the spacing around (the left, right, top) all the elements (in this case, buttons) of the layout.

        //JButton button1 = new JButton(); //usually how you'd set a button, but there's a shortcut too if you wanna just set the buttons and be done with it.
        
        //we'll use the shortcut (anonymous buttons) here since we're creating a lot of buttons:
        frame.add(new JButton("1"/*what the button displays*/));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        //adding new buttons to a panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250)); //you can set the height of the panel like this too.
        //you know the rest, no need to add.
        

        //now, since the FlowLayout has been set for the frame, what it does by default is set everything to the top and middle and keep adding stuff, and if it runs out of space, it moves to the next row.
        //but, we can change the kind of flowlayout that happens in the constructor of the FlowLayout() manager, like this, frame.setLayout(new FlowLayout(FlowLayout.LEADING/otherstuff))
        //FlowLayout.LEADING in the constructor means that it stays in the top left corner and follows the flow layout behaviour. you can figure out the rest on your own when you try.
        //by default, in the constructor, it is set to FlowLayout.CENTER.

        frame.setVisible(true);
    }
    
}
