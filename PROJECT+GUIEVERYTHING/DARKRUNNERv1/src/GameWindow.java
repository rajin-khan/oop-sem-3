import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class GameWindow implements ActionListener{

    JFrame frame = new JFrame();
    
    JLabel bgLabel = new JLabel();
    JLabel drLabel = new JLabel();
    JLabel nameLabel = new JLabel();
    JLabel progressLabel = new JLabel();
    JLabel healthLabel = new JLabel();
    JLabel jetpackLabel = new JLabel();

    JButton button = new JButton();
    JButton button2 = new JButton();

    JLayeredPane layer = new JLayeredPane();

    String gamerName;
    int score = 0;

    GameWindow() {

        System.out.println("Username Window launched");
        //the option window for taking the user's name
        String name = JOptionPane.showInputDialog("What's your name?");
        //converts it to all uppercase so it looks good
        gamerName = name.toUpperCase();

        //animated background icon
        ImageIcon bg = new ImageIcon("animatedbg.gif");
        ImageIcon dr = new ImageIcon("dark_runner.png");
        ImageIcon jetpack = new ImageIcon("jetpack.png");
        ImageIcon jumpButton = new ImageIcon("upbutton.png");
        ImageIcon landButton = new ImageIcon("downbutton.png");
        ImageIcon heartsFull = new ImageIcon("health_full.png");

        //game window created
        frame.setSize(1200, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("DARKRUNNER");

        layer.setBounds(0, 0, 1200, 471);

        //label with the icon created
        bgLabel.setIcon(bg);
        bgLabel.setBounds(0, 0, 1200, 471);
        layer.add(bgLabel, Integer.valueOf(0)); //label added

        nameLabel.setBounds(25, 25, 400, 30);
        nameLabel.setText(gamerName);
        nameLabel.setFont(new Font("Konstruktor", Font.PLAIN, 27));
        nameLabel.setForeground(Color.WHITE);
        layer.add(nameLabel, Integer.valueOf(1));

        /*
        progressLabel.setBounds(800, 25, 400, 30);
        progressLabel.setText(String.valueOf(score));
        progressLabel.setFont(new Font("Konstruktor", Font.PLAIN, 27));
        progressLabel.setForeground(Color.WHITE);
        layer.add(progressLabel, Integer.valueOf(1));
        */
        
        drLabel.setIcon(dr);
        drLabel.setBounds(50, 278, 93, 103);
        layer.add(drLabel, Integer.valueOf(1));

        jetpackLabel.setIcon(jetpack);
        jetpackLabel.setBounds(40, 215, 42, 103);
        jetpackLabel.setVisible(false);
        layer.add(jetpackLabel, Integer.valueOf(1));
        

        healthLabel.setIcon(heartsFull);
        healthLabel.setBounds(1070, 410, 104, 32);
        layer.add(healthLabel, Integer.valueOf(1));

        button.setIcon(jumpButton);
        button.setBounds(240, 393, 68, 60);
        button.addActionListener(this);
        button.setFocusable(false);
        layer.add(button, Integer.valueOf(1));

        button2.setIcon(landButton);
        button2.setBounds(310, 393, 68, 60);
        button2.addActionListener(this);
        button.setFocusable(false);
        layer.add(button2, Integer.valueOf(1));

        frame.add(layer);

        //frame made visible
        frame.setVisible(true);

        System.out.println("\nCompiled successfully.");
        System.out.println("New Game Window launched.");

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {
            
            drLabel.setBounds(50, 208, 93, 103);
            jetpackLabel.setVisible(true);
            System.out.println("\n~JUMP FOR WAKANDA!~");

            //score++;
            //progressLabel.setText(String.valueOf(score));
        }
        else if (e.getSource()==button2) {
            
            drLabel.setBounds(50, 278, 93, 103);
            jetpackLabel.setVisible(false);
            System.out.println("\n~LAND FOR WAKANDA!~");

            //score++;
            //progressLabel.setText(String.valueOf(score));
        }

        /* collision part, use this to detect collision, so if it's up, and the coordinates match, collision
        if (jetpackLabel.isVisible()==true) {

            System.out.println("Up now");
        }
        else if (jetpackLabel.isVisible()==false) {

            System.out.println("down now");
        }
        */
    }
    
}
