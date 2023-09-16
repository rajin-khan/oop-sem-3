import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

    //bounds of the image moving

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image star;
    Timer timer;
    int xVelocity = 1;//to adjust how much or how many pixels the image is moving on x-axis
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        star = new ImageIcon("star.png").getImage();
        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {

        super.paint(g); //paints background;

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(star, x, y, null); //painting the image
    }

    public void actionPerformed(ActionEvent e) {

        //setting bounds so it doesn't move out of the frame
        if (/*left border*/ x>=PANEL_WIDTH-star.getWidth(null) || x<=0 /*left border */ ) { //makes the image hit the border so that it doesn't go out)

            xVelocity = xVelocity * -1;
        }

        x = x + xVelocity;

        //for changing in the y-axis, change the x-s to y-s, and width, to height.
        repaint(); //calls paint again, draws the graphic at a new position
    }
    
}
