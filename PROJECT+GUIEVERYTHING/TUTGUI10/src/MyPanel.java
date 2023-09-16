import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 1200;
    final int PANEL_HEIGHT = 480;

    int bgxVelocity = 1;

    int bgx = 0;
    int bgy = 0;

    int drx = 50;
    int dry = 298;

    int ob1x = -100; //x-coordinate for air obstacle
    int ob2x = -100; //x-coordinate for ground obstacle

    Image bg;
    Image dr;
    Image jetpack;
    Image platform;
    Image heartsFull;
    Image heartsTwoThirds;
    Image heartsOneThirds;
    Image airobstacle1;
    Image groundobstacle;

    Timer timer;

    Action upAction;
    Action downAction;

    double a;

    int collisioncount  = 0;
    double score = 0;

    boolean healthfull = true;
    boolean healthtwothirds = false;
    boolean healthonethirds = false;

    MyPanel() {

        bg = new ImageIcon("bg_big.png").getImage();
        dr = new ImageIcon("dark_runner.png").getImage();
        jetpack = new ImageIcon("jetpack.png").getImage();
        heartsFull = new ImageIcon("health_full.png").getImage();
        heartsTwoThirds = new ImageIcon("health_twothirds.png").getImage();
        heartsOneThirds = new ImageIcon("health_onethird.png").getImage();
        platform = new ImageIcon("platform.png").getImage();

        airobstacle1 = new ImageIcon("obstacle_air_alt.png").getImage();
        groundobstacle = new ImageIcon("obstacle_ground.png").getImage();

        this.setPreferredSize(new Dimension(1200, 480));

        upAction = new UpAction();
        downAction = new DownAction();

        this.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        this.getActionMap().put("upAction", upAction);

        this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        this.getActionMap().put("downAction", downAction);

        timer = new Timer(3000, this);
        timer.start();

    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(bg, bgx, bgy, null);
        g2D.drawImage(dr, drx, dry, null);
        g2D.drawImage(platform, 0, 395, null);

        if (healthfull==true && healthtwothirds==false && healthonethirds==false) {

            g2D.drawImage(heartsFull, 1070, 430, null);
        }
        if (healthfull==false && healthtwothirds==true && healthonethirds==false) {

            g2D.drawImage(heartsTwoThirds, 1070, 430, null);
        }
        if (healthfull==false && healthtwothirds==false && healthonethirds==true) {

            g2D.drawImage(heartsOneThirds, 1070, 430, null);
        }

        g2D.drawImage(airobstacle1, ob1x, 218, null); //drawing obstacles
        g2D.drawImage(groundobstacle, ob2x, 330, null);

        //new method of animating in the paint function
        if (bgx==-855) {

            bgx=0;
        }

        bgx = bgx - bgxVelocity;

        

        if (a>0 && a<0.75) { //range for generation of obstacles at random

            ob1x = 1300;
        }

        if (a>0.5 && a<1) { //range for generation of obstacles at random

            ob2x = 1300;
        }

        ob1x = ob1x - 4;
        ob2x = ob2x -6;

        if ((dry<=248)&&(ob1x==68)) {

            System.out.println("Collision with object 1");
            collisioncount++;
        }
        else {

            score++;
            System.out.println((int)score/10);
        }
        if ((dry>=248)&&(ob2x==70)) {

            System.out.println("Collision with object 2");
            collisioncount++;
        }

        if (collisioncount==1) {

            healthfull=false;
            healthtwothirds=true;
            healthonethirds=false;
        }
        else if (collisioncount==2) {

            healthfull=false;
            healthtwothirds=false;
            healthonethirds=true;
        }
        else if (collisioncount==3) {

            System.out.println("GAME OVER");
            return;

        }

        try {

            Thread.sleep(5); //by putting the paint thread to sleep every 5ms
        } 
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        repaint();
        
    }

    public void actionPerformed(ActionEvent e) {

        a = Math.random();
        
    }

    //up key

    public class UpAction extends AbstractAction {

        public void actionPerformed(ActionEvent e) {

            dry = dry - 30;

            if (dry<=208) {

                dry = 208;
            }

        }
    }

    //down key

    public class DownAction extends AbstractAction {

        public void actionPerformed(ActionEvent e) {

            dry = dry + 30;

            if (dry>=298) {

                dry = 298;
            }

        }
    }

}

