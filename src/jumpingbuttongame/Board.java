package jumpingbuttongame;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener, MouseMotionListener
{
    Menu m;
    int delay;    
    Timer t = new Timer(delay, this);
    
    JButton jumpingButton = new JButton();
    
    int mouseX;
    int mouseY;

    public Board(Menu menu)
    {
    	super();
        m = menu;
       
    }
    public void runNormal()
    {
        
        //this is the game loop

    }
	 
    public void runFromMouse()
    {
        // get x and y coordinates from mouse and JButton
        int buttonX = jumpingButton.getX();
        int buttonY = jumpingButton.getY();
        int mouseX = jumpingButton.getMousePosition().x;
        int mouseY = jumpingButton.getMousePosition().y;

        int xDistance = Math.abs(buttonX - mouseX);
        int yDistance = Math.abs(buttonY - mouseY);

        if (xDistance < 30)
        {

        }
        
        if (yDistance < 30)
        {

        }

    }
	 
    public void initComponents()
    {
     	jumpingButton.setLocation(200, 200);
        jumpingButton.setBounds(new Rectangle(mouseX,mouseY,100,100));
        jumpingButton.addActionListener(this);
        this.add(jumpingButton);
    } 
    
    
    
    
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==m.startGame)
        {
            t.start();
        }
        if(event.getSource()==m.easy || event.getSource()==m.medium 
                || event.getSource()==m.hard)
        {
            delay = m.changeDifficulty();
        }
    }
    
    public void mouseMoved(MouseEvent evt)
    {
        Point ptMoved = evt.getPoint();
    }
    
    
   public void mouseDragged(MouseEvent evt)
    {
        Point ptDragged = evt.getPoint();
    }
    
    
}


