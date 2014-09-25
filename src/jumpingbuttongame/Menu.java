package jumpingbuttongame;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends JPanel
{
   JButton easy; 
   JButton medium;
   JButton hard;
   JButton startGame;
   int score; 
   int difficulty;
    
    public Menu()
    {
        super();
        
   easy = new JButton();
   medium = new JButton();
   hard = new JButton();
   startGame = new JButton();
   score = 0;   
        
         
    }
    
    public void increaseScore(){
        score++;
    }
    
    public void changeDifficulty(){
        
    }
    
    
    
}
