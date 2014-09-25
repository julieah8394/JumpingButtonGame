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
    
    Timer t = new Timer(10, this);
    int delay = 1;
    JButton jumpingButton = new JButton();
    int mouseX;
    int mouseY;
    
    
    
    public Board()
    {
        super();
        initComponents();
    }
    
     public void actionPerformed(ActionEvent event) {
         
     }
     public void mouseMoved(MouseEvent evt)
     {
    	 Point pt = evt.getPoint();
        
     }
     public void mouseDragged(MouseEvent evt)
     {
    	
     }
     
     
     public void runNormal(){
         
         //this is the game loop
         
     }
     
     public void runFromMouse(){
         // get x and y coordinates from mouse and JButton
    int buttonX = jumpingButton.getX();
    int buttonY = jumpingButton.getY();
    int mouseX = jumpingButton.getMousePosition().x;
    int mouseY = jumpingButton.getMousePosition().y;
    
   int xDistance = Math.abs(buttonX - mouseX);
   int yDistance = Math.abs(buttonY - mouseY);
    
   if (xDistance < 30){
       
   }
    if (yDistance < 30){
       
   }
    
     }
     
     public void initComponents(){
         this.add(jumpingButton);
         //jumpingButton.setLocation(mouseX, mouseY);
         jumpingButton.setLocation(200, 200);
         
     }
     
}
