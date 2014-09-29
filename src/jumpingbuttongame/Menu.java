package jumpingbuttongame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Menu extends JPanel
{
   JRadioButton easy, medium, hard;
   JButton startGame;
   ButtonGroup bg;
   
   int score;
   int difficulty;
    
    public Menu()
    {
        super();
   	 
        easy = new JRadioButton("EASY");
        medium = new JRadioButton("MEDIUM");
        hard = new JRadioButton("HARD");
        startGame = new JButton("START");
        score = 0;   
        
        bg = new ButtonGroup();
        bg.add(easy);
        bg.add(medium);
        bg.add(hard);
        
   	add(easy);
        add(medium);
        add(hard);
        
        add(startGame);
    	 
    }
    
    public void increaseScore()
    {
        score++;
    }

    public int changeDifficulty()
    {
        if(hard.isSelected())
        {
            difficulty = 100;
        }

        else if(medium.isSelected())
        {
            difficulty = 250;
        }
        //defaults to easy if they do not select a level
        else 
        {
            difficulty = 500;
        }
        return difficulty;
    }
    
}


