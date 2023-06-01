import javax.swing.*;
import java.awt.event.*;

public class GUIWOW implements ActionListener{

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel  userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel bottomText;

    public static void main(String[] args) {
        
        frame = new JFrame("Login Window");
        
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(60, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(140, 20, 165, 25);
        panel.add(userText);
        
        passLabel = new JLabel("Password");
        passLabel.setBounds(60, 60, 80, 25);
        panel.add(passLabel);
        
        passText = new JPasswordField(20);
        passText.setBounds(140, 60, 165, 25);
        panel.add(passText);
        
        button = new JButton("Login");
        button.addActionListener(new GUIWOW());
        button.setBounds(150, 105,  80, 25);
        panel.add(button);

        bottomText = new JLabel("Enter your name and password to login!");
        bottomText.setBounds(70, 140, 320, 25);
        panel.add(bottomText);


        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        String user = userText.getText();
        //String password = passText.getText();
        String password = passText.getSelectedText(); //just included this so the yellow thing goes away, use the above method instead, this doesn't work.

        System.out.println(user + ", " + password);

        

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