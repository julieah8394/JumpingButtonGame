package jumpingbuttongame;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener, MouseMotionListener
{
    public Board()
    {
        super();
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
}
