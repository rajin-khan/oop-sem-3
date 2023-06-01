import javax.swing.*;
import javax.swing.border.*; //imported for the border
import java.awt.*; //was imported for setting the background color

public class FrameAndLabels {

    public static void main(String[] args) {

        //this is how you create it in the main. if you don't want that, go to tutgui2, where a separate class is created for the main frame.
        
        //i. setting up the frame
        JFrame frame = new JFrame(); //creates a new JFrame, you can add title of the frame in the constructor

        frame.setTitle("holy fuck a bear"); //title of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if you don't set this, the close button will not close the window, it'll just hide it
        frame.setSize(500, 500); //dimensions of the opening window
        frame.setResizable(false); //prevents from being resized
        frame.getContentPane().setBackground(Color.darkGray); //sets the color of the background of the JFrame (this is how you can pick from a few default colors), alternatively, "frame.getContentPane().setBackground(new Color(255, 204, 51));" can put in RGB values or hex code (start with 0x) here for custom color
        
        frame.setLayout(null); //basically making sure the label doesn't take up all the space by not giving the layouyt manager any control, which means we have to manually input where the label is gonna be,
        //so we HAVE TO SET BOUNDS FOR THE LABEL, OR NOTHING WILL SHOW UP

        ImageIcon image = new ImageIcon("bear.png"); //new image icon type object for wherever you might want to use it (give the path if it's not in the folder where you have the java code)        
        frame.setIconImage(image.getImage()); //sets the icon of the frame to that image.

        //iii. adding borders
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2); //look at the different types of methods after you just type in create, there's tons of options

        //ii. adding labels
        JLabel label = new JLabel(); //you can set text in the constructor too, obv

        label.setBounds(125, 125, 250, 250); //can only set bounds if you have nullified the layout manager, else, you don't need this
        label.setText("wow goddamn"); //add text here (center and left by default)

        //formatting the text
        label.setForeground(Color.WHITE); //changing colors (pick from default colors)
        // label.setForeground(new Color(0, 0, 0)); //custom color with RGB values, or "new Color(0x...)" and then a hex value after 0x lets you enter hex values for color 
        label.setFont(new Font(/*name of the font*/"Menlo", /*style of the font*/Font.PLAIN, /*size of the font*/20)); //changing the font

        //adding image icons to label
        label.setIcon(image); //adds the image icon to your label (by default, java put the text at the center, and to the left of the image, but we can change that)
        //setting text according to image icons
        label.setHorizontalTextPosition(JLabel.CENTER); //we can set the text to be on the CENTER, LEFT, or RIGHT of the imageicon
        label.setVerticalTextPosition(JLabel.TOP); //we can set the text to be on the TOP, CENTER, or BOTTOM of the imageicon
        label.setIconTextGap(10); //gap between the text and the image icon, you can even set this to a negative number and bring text closer to the icon

        //changing the color of the label
        label.setBackground(Color.LIGHT_GRAY); //(same as adding default and custom colors), however, if you do this, the entire background changes to this color, because the label likes to take up as much space as possible. so it takes up the entire frame, even if you keep resizing it (unless you nullify the layout manager and set bounds)
        //you can constrict the size of the label by setbounds, and by nullifying the layour manager
        label.setOpaque(true); //makes the color of the label visible.

        label.setBorder(border); //sets the border around the label, use this as proof of how far the label goes (the label still exists, it's just transparent because you haven't set a color, so you can see the background color of the frame)

        //aligning text in a label (which kind of takes up as much space as possible unless you constrict it)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label (these "JLabel.CENTER" are just int values that have been assigned a special name, like a constant, so it's easier for you to use)
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label

        frame.add(label); //NEVER forget to add the label to the frame at the end

        //VERY VERY USEFUL FEATURE
        /*
        frame.pack(); basically accomodates your frame to fit everything you want, but only if you comment you the setbounds for the labels, and don't nullify the setlayout (i.e, use the default layout manager). you don't even need to set a size for the frame.
        //always add the pack method at the END.
        */

        frame.setVisible(true); //makes the frame visible

    }
    
}
