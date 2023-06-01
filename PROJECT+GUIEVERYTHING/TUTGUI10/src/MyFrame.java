import javax.swing.*;

public class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("DARKRUNNER");

        panel = new MyPanel();

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
