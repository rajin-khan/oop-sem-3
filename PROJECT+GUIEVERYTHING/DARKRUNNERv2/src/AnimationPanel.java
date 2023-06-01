import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 1200;
    final int PANEL_HEIGHT = 480;

    //RANDOM VALUE GENERATOR FOR OBSTACLES
    double a;

    //IMAGE OBJECT DECLARATIONS
    Image background;
    Image platform;
    Image runner;
    Image heartsFull;
    Image heartsTwoThirds;
    Image heartsOneThirds;
    Image airobstacle;
    Image groundobstacle;
    Image gameoverScreen;
    Image heartsDraw; //holder for current health

    //BACKGROUND ANIMATION CONSTANTS
    int backgroundX = 0;
    int backgroundY = 0;
    int backgroundVelocity = 2;

    //RUNNER ANIMATION CONSTANTS
    int runnerX = 60;
    int runnerY = 288;

    //AIR OBSTACLE CONSTANTS
    int airobstacleX = -100;
    int airobstacleVelocity = 6;

    //GROUND OBSTACLE CONSTANTS
    int groundobstacleX = -100;
    int groundobstacleVelocity = 6;

    Timer timer;
    int timerDelay = 2000;

    //ACTION OBJECTS FOR KEYBINDS
    Action upAction;
    Action downAction;

    //SCORE AND COLLISION COUNT
    int collisioncount  = 0;
    double score = 0;

    //SCORE FOR ICREASING DIFFICULTY
    int difficultyBarrier = 500;

    AnimationPanel() {

        //SETTING UP IMAGES
        background = new ImageIcon("background.png").getImage();
        platform = new ImageIcon("platform.png").getImage();
        runner = new ImageIcon("dark_runner.png").getImage();
        heartsFull = new ImageIcon("health_full.png").getImage();
        heartsTwoThirds = new ImageIcon("health_two.png").getImage();
        heartsOneThirds = new ImageIcon("health_one.png").getImage();

        heartsDraw = heartsFull; //the holder for health is initially set to the fullhearts image

        airobstacle = new ImageIcon("star.png").getImage();
        groundobstacle = new ImageIcon("barrier.png").getImage();

        gameoverScreen = new ImageIcon("gameoverscreen.png").getImage();

        //SETTING UP THE PANEL
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        //DECLARING THE ACTION OBJECTS
        upAction = new UpAction();
        downAction = new DownAction();

        //SETTING UP THE UP KEYBIND
        this.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        this.getActionMap().put("upAction", upAction);

        //SETTING UP THE DOWN KEYBIND
        this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        this.getActionMap().put("downAction", downAction);

        //TIMER SETUP
        timer = new Timer(timerDelay, this); //basically, this delay is how many milliseconds later the actionperfomed method is called again
        timer.start(); //starts and goes to actionperformed

    }

    //GRAPHICS ("PAINTING" THE IMAGES)
    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g; //typecasting the Graphics g object to a Graphics2D object since it has more functionality

        //GENERATING THE IMAGES IN THE PANEL, ORDER OF CODE LINE DECIDES WHAT IS PAINTED FIRST
        g2D.drawImage(background, backgroundX, backgroundY, null);
        g2D.drawImage(runner, runnerX, runnerY, null);
        g2D.drawImage(platform, 0, 385, null);
        g2D.drawImage(heartsDraw, 1070, 430, null);

        //BACKGROUND ANIMATION
        if (backgroundX<=-855) { //condition to check if the background has moved a certain distance to the left

            backgroundX = 0; //if so, x-coordinate is reset, giving the illusion that it is a continuous loop
        }

        backgroundX = backgroundX - backgroundVelocity; //the velocity at which the background moves (1)

        
        
        //OBSTACLES GENERATED AT THE FAR LEFT
        g2D.drawImage(airobstacle, airobstacleX, 225, null);
        g2D.drawImage(groundobstacle, groundobstacleX, 320, null);
        
        //GENERATION OF OBSTACLES
        if (a>0 && a<0.75) { //range for generation of air obstacle

            airobstacleX = 1300; //if the condition is met, the object is placed to the right of the frame so it "appears"
        }

        if (a>0.25 && a<1) { //range for generation of ground obstacle

            groundobstacleX = 1300;
        }

        airobstacleX = airobstacleX - airobstacleVelocity; //speed of air obstacle

        groundobstacleX = groundobstacleX - groundobstacleVelocity; //speed of ground obstacle

        //COLLISION
        if ((runnerY<=248)&&(airobstacleX==70)) {

            System.out.println("\nCOLLISION (with air obstacle)");
            System.out.println("HEALTH -1\n");
            collisioncount++;
        }
        if ((runnerY>=248)&&(groundobstacleX==70)) {

            System.out.println("\nCOLLISION (with ground obstacle)");
            System.out.println("HEALTH -1\n");
            collisioncount++;
        }
        else { //if it doesn't collide, then the score goes up

            score++;

            g2D.setPaint(Color.WHITE);
            g2D.setFont(new Font("Konstruktor", Font.PLAIN, 27));
            g2D.drawString("SCORE: " + (int)score/10, 1040, 50); //this /10 is done to slow down the rate of the score
            //System.out.println((int)score/10);
        }

        //HEALTH CHECK
        if (collisioncount==1) { //determines the subsequent health according to the number of collisions

            heartsDraw = heartsTwoThirds; //the health holder gets assigned the 2/3 hearts image
        }
        else if (collisioncount==2) {

            heartsDraw = heartsOneThirds; //the health holder gets assigned the 1/3 hearts image
        }
        else if (collisioncount==3) { //upon the last collision, we get game over

            g2D.drawImage(gameoverScreen, -18, 0, null);

            g2D.setPaint(Color.WHITE);
            g2D.setFont(new Font("Konstruktor", Font.PLAIN, 40));
            g2D.drawString("FINAL SCORE: " + (int)score/10, 440, 450);

            System.out.println("GAME OVER\n");
            return;
        }

        //DIFFICULTY INCREASED
        if (((int)score/10)==difficultyBarrier) {

            backgroundVelocity++;
            //airobstacleVelocity++;
            //groundobstacleVelocity++;

            timerDelay-=400;

            if (timerDelay<=1500) {

                timerDelay=1500;
            }

            difficultyBarrier+=500;
            System.out.println("\nDIFFICULTY +1");
        }

        try {

            Thread.sleep(5); //by putting the paint thread to sleep every 5ms, it repaints everything and carries out all the checks every 5ms
        } 
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        repaint(); //repainting is done here to allow the timer to handle the randomization of obstacles

    }

    //TIMER
    public void actionPerformed(ActionEvent e) {

        a = Math.random(); //every 5ms, a new random number is generated      
    }

    //DEFINITION OF UPACTION CLASS (THE UP KEYBIND)
    public class UpAction extends AbstractAction {

        //IF UP IS PRESSED, THIS ACTION IS PERFORMED
        public void actionPerformed(ActionEvent e) {

            runnerY = runnerY - 20; //the y-coordinate of runner decreases by 10 pixels (so it goes up)

            if (runnerY<=208) {

                runnerY = 208; //makes sure the runner cannot go above a certain distance
            }

        }
    }

    //DEFINITION OF DOWNACTION CLASS (THE DOWN KEYBIND)
    public class DownAction extends AbstractAction {

        //IF DOWN IS PRESSED, THIS ACTION IS PERFORMED
        public void actionPerformed(ActionEvent e) {

            runnerY = runnerY + 20; //the y-coordinate of runner increases by 10 pixels (so it goes down)

            if (runnerY>=288) {

                runnerY = 288; //makes sure the runner cannot go below a certain distance (the platform)
            }

        }
    }

}