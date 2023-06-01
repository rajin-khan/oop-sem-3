import javax.swing.*;
import java.awt.event.*;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame(); //make these global obv, for the actionlistenr
    JButton button = new JButton();

    LaunchPage() { //create new class for the frame as usual

        frame.setTitle("first window!"); //create a new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        button.setBounds(160, 140, 100, 50); //create new button
        button.setText("click");
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { //now here, what we do is:

        if (e.getSource()==button) {

            frame.dispose(); //we close the window as soon as the button is clicked, so that the user cannot keep pressing the button to open multiple windows
            //you could also set button.setEnabled(false), and that way it won't be clickable after it's used once, but it's better to just close the window as a whole.
            new GameWindow(); //call the new gamewindow constructor when the button's pressed, so it runs when we press the button
        }
    }
    
}
