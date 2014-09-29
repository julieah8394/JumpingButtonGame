package jumpingbuttongame;

import java.awt.Color;
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
    int delay = 500;   
    Timer t = new Timer(delay, this);
    
    JButton jumpingButton = new JButton();
    
    int mouseX = 500;
    int mouseY = 200;

    public Board(Menu menu)
    {
    	super();
        setLayout(null);
        m = menu;
        jumpingButton.setLocation(mouseX,mouseY);
        jumpingButton.setBounds(new Rectangle(mouseX,mouseY,50,50));
        jumpingButton.addActionListener(this);
        add(jumpingButton);
        setBackground(Color.red);
        m.setBackground(Color.white);
        add(m);
        m.startGame.addActionListener(this);
        
       
       
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
	 
    
    
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if(obj==m.startGame)
        {
            t.start();
        }
        if(obj==m.easy || obj==m.medium || obj==m.hard)
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


