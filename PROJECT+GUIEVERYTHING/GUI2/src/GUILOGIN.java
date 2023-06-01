import javax.swing.*;
import java.awt.event.*;

public class GUILOGIN implements ActionListener{

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel  userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel bottomText;
    //we make the scope of all these objects public so that the actionperformed method can access these objects and see them

    public static void main(String[] args) {
        
        frame = new JFrame("Login Window");
        
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //usually, we'd add setvisible right here, but we ALWAYS add it at the end so the frame pops up after everything is done processing.

        panel = new JPanel();

        frame.add(panel);

        panel.setLayout(null); //it's okay to do this, the alex lee login tutorial explains that it just sets things to different positions, you can keep it at null.

        //user label
        userLabel = new JLabel("Username"); //the username label part of the login window
        userLabel.setBounds(60, 20, 80, 25); //the padding (empty space) around the "user: " label part
        panel.add(userLabel);

        //user text field entry
        userText = new JTextField(20); //the length of the text field
        userText.setBounds(140, 20, 165, 25); //the padding (x and y), and the width and height of the rectangle where you put in the text
        panel.add(userText);

        //password label
        passLabel = new JLabel("Password");
        passLabel.setBounds(60, 60, 80, 25);
        panel.add(passLabel);

        //password text field entry
        passText = new JPasswordField(20); //it shows the text as circles, cause yk, pass has to be private
        passText.setBounds(140, 60, 165, 25);
        panel.add(passText);

        //button for login
        button = new JButton("Login");
        button.addActionListener(new GUILOGIN()); //this action listener must take in an actionlistener type object, so when we add the new GUILOGIN object, it must be of the actionlistener type, so we make it implement ActionListener at the top.
        button.setBounds(150, 105,  80, 25);
        panel.add(button);

        //label at the bottom
        bottomText = new JLabel("Enter your name and password to login.");
        bottomText.setBounds(70, 140, 320, 25);
        panel.add(bottomText);

        //now since we made it implement action listener, we must add an action performed method too.
        

        frame.setVisible(true); //controls when the window pops up
    }

    public void actionPerformed(ActionEvent e) {
        
        String user = userText.getText(); //these strings store the text you input when you login.
        //String password = passText.getText(); //the strikethrough just means this method is not used in new versions anymore, dw
        String password = passText.getSelectedText(); //just included this so the yellow thing goes away, use the above method instead, this doesn't work.

        System.out.println(user + ", " + password); //shows the input username and password in the console when you click login. (no reason, just emnei)

        //now let's check if these usernames and passwords match certain values to confirm a login

        if (user.toLowerCase().contains("rajin") && password.equalsIgnoreCase("12345")) {

            bottomText.setText("you're amazing, the best, absolutely sick!");
        }
        else if (user.toLowerCase().contains("saumik") && password.equalsIgnoreCase("12345")) {

            bottomText.setText("you're gay lol wtf");
        }
        else if (user.toLowerCase().contains("samiyeel") && password.equalsIgnoreCase("12345")) {

            bottomText.setText("noob ass gamer get rekt");
        }

    }
    
}
