package jumpingbuttongame;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{
    public GameFrame()
    {
        super();
        
        Board b = new Board();
        getContentPane().add(b,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (640, 480);
        setVisible(true);
    }
}
