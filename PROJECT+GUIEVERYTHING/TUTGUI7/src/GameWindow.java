import javax.swing.*;

public class GameWindow {

    JFrame frame = new JFrame();

    GameWindow() {

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("second window!");
        frame.setLayout(null);

        JLabel label = new JLabel("yoooooo");
        label.setBounds(200, 100, 50, 80);
        frame.add(label);

        frame.setVisible(true);
    }
    
}
