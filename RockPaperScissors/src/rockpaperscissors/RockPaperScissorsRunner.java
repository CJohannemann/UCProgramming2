
package rockpaperscissors;

import javax.swing.JFrame;


public class RockPaperScissorsRunner {
    public static void main(String[] args){
        JFrame frame = new RockPaperScissorsFrame();
        RockPaperScissorsFrame.addComponentsToPane(frame.getContentPane());
        frame.setTitle("Paper Rock Scissors Game");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
