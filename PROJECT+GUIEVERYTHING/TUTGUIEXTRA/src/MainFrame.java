import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{

    JPanel bluePanel, redPanel, greenPanel;
    JButton button;
    int count = 1;

    MainFrame() {

        this.setTitle("Colors!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 280                               );
        this.setResizable(false);
        this.setLayout(null);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 0, 250, 250);
        bluePanel.setVisible(false);
        this.add(bluePanel);

        redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setVisible(true);
        this.add(redPanel);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 0, 250, 250);
        greenPanel.setVisible(false);
        this.add(greenPanel);

        button = new JButton("click to change color");
        button.setBounds(250, 100, 200, 50);
        button.setFocusable(false);
        button.addActionListener(this);
        this.add(button);

        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==button && redPanel.isVisible()==true && bluePanel.isVisible()==false && greenPanel.isVisible()==false) {

            bluePanel.setVisible(true);
            redPanel.setVisible(false);
            greenPanel.setVisible(false);
            System.out.println("Color Changed.");
        }
        else if (e.getSource()==button && bluePanel.isVisible()==true && redPanel.isVisible()==false && greenPanel.isVisible()==false) {

            greenPanel.setVisible(true);
            redPanel.setVisible(false);
            bluePanel.setVisible(false);
            System.out.println("Color Changed.");
        }
        else if (e.getSource()==button && greenPanel.isVisible()==true && redPanel.isVisible()==false && bluePanel.isVisible()==false) {

            redPanel.setVisible(true);
            bluePanel.setVisible(false);
            greenPanel.setVisible(false);
            System.out.println("Color Changed.");
        }

        /*
        if (e.getSource()==button && (count%2)!=0 && (count%3)!=0) {

            bluePanel.setVisible(true);
            redPanel.setVisible(false);
            greenPanel.setVisible(false);
            System.out.println("Color Changed.");
            count++;
        }
        else if (e.getSource()==button && (count%2)==0 && (count%3)!=0) {

            redPanel.setVisible(true);
            bluePanel.setVisible(false);
            greenPanel.setVisible(false);
            System.out.println("Color Changed.");
            count++;
        }
        else if (e.getSource()==button && (count%3)==0) {

            greenPanel.setVisible(true);
            redPanel.setVisible(false);
            bluePanel.setVisible(false);
            System.out.println("Color Changed.");
            count++;
        }

        */
    }
}
