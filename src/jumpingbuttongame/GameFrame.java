package jumpingbuttongame;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class GameFrame extends JFrame
{
    public GameFrame()
    {
        super();
      
        Menu m = new Menu();
        Board b = new Board(m);
        getContentPane().add(b);
        getContentPane().add(m);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (640, 480);
        setVisible(true);
    }
}
