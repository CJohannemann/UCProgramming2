package rockpaperscissors;
import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class RockPaperScissorsFrame extends JFrame{
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    final static boolean shouldFill = true;
    private static JTextArea resultsArea;
    private static JLabel playerWinsLbl, compWinsLbl, tiesLbl;
    private static JTextField playerWinsFld, compWinsFld, tiesFld;
    private static JButton rBtn, pBtn, sBtn, quitBtn;
    private static int personPicked = 0;
    private static int playerWins = 1;
    private static int compWins = 1;
    private static int ties = 1;
    private static int max = 3;
    private static int min = 1;
    
public static void addComponentsToPane(Container pane){
        playerWinsFld = new JTextField(playerWins);
        compWinsFld = new JTextField(compWins);
        tiesFld = new JTextField(ties);
        
        if(RIGHT_TO_LEFT){
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
        
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if(shouldFill){
            c.fill = GridBagConstraints.HORIZONTAL;
        }
//***************************************************************            
        String pBtnIcon = "pBtnIcon.png";
        ImageIcon paperIcon = new ImageIcon(pBtnIcon);
        pBtn = new JButton(paperIcon);
        if(pBtn.isSelected()){
            personPicked = 1;
        }
        if(shouldWeightX){
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(pBtn, c);
        pBtn.addActionListener((e) -> {
            personPicked = 1;
            Random random = new Random();
            int computerPicker = 0;
            do {                
            computerPicker = random.nextInt((max - min) + 1) + min;    
            } while (computerPicker == 0);
            if(computerPicker == 1){
                resultsArea.append("It's a tie! No one wins" + "\n");
                tiesFld.setText(null);
                tiesFld.setText(tiesFld.getText() + ties++);
                tiesFld.setHorizontalAlignment(JTextField.CENTER);
            }else if(computerPicker == 2){
                resultsArea.append("Scissors cuts paper. Computer wins!" + "\n");
                playerWinsFld.setText(null);
                playerWinsFld.setText(playerWinsFld.getText() + playerWins++);
                playerWinsFld.setHorizontalAlignment(JTextField.CENTER);
            }else{
                resultsArea.append("Paper beats rock. Player wins" + "\n");
                compWinsFld.setText(null);
                compWinsFld.setText(compWinsFld.getText() + compWins++);
                compWinsFld.setHorizontalAlignment(JTextField.CENTER);
            }
        });
//***************************************************************    
        String sBtnIcon = "sBtnIcon.png";
        ImageIcon scissorIcon = new ImageIcon(sBtnIcon);
        sBtn = new JButton(scissorIcon);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(sBtn, c);
        sBtn.addActionListener((e) -> {
            personPicked = 2;
            Random random = new Random();
            int computerPicker = 0;
            do {                
                computerPicker = random.nextInt((max - min) + 1) + min;    
            } while (computerPicker == 0);
            if(computerPicker == 2){
                resultsArea.append("It's a tie! No one wins" + "\n");
                tiesFld.setText(null);
                tiesFld.setText(tiesFld.getText() + ties++);
                tiesFld.setHorizontalAlignment(JTextField.CENTER);
            }else if(computerPicker == 1){
                resultsArea.append("Scissors cuts paper. Player wins!" + "\n");
                playerWinsFld.setText(null);
                playerWinsFld.setText(playerWinsFld.getText() + playerWins++);
                playerWinsFld.setHorizontalAlignment(JTextField.CENTER);
            }else{
                resultsArea.append("Rock beats scissors. Computer wins" + "\n");
                compWinsFld.setText(null);
                compWinsFld.setText(compWinsFld.getText() + compWins++);
                compWinsFld.setHorizontalAlignment(JTextField.CENTER);
            }
        });
//***************************************************************            
        String rBtnIcon = "rBtnIcon.png";
        ImageIcon rockIcon = new ImageIcon(rBtnIcon);
        rBtn = new JButton(rockIcon);
        if(rBtn.isSelected()){
            personPicked = 3;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(rBtn, c);
        rBtn.addActionListener((e) -> {
            personPicked = 2;
            Random random = new Random();
            int computerPicker = 0;
            do {                
            computerPicker = random.nextInt((max - min) + 1) + min;       
            } while (computerPicker == 0);
            if(computerPicker == 3){
                resultsArea.append("It's a tie! No one wins" + "\n");
                tiesFld.setText(null);
                tiesFld.setText(tiesFld.getText() + ties++);
                tiesFld.setHorizontalAlignment(JTextField.CENTER);
            }else if(computerPicker == 1){
                resultsArea.append("Paper beats rock. Computer wins!" + "\n");
                compWinsFld.setText(null);
                compWinsFld.setText(compWinsFld.getText() + compWins++);
                compWinsFld.setHorizontalAlignment(JTextField.CENTER);
            }else{
                resultsArea.append("Rock beats scissors. Player wins" + "\n");
                playerWinsFld.setText(null);
                playerWinsFld.setText(playerWinsFld.getText() + playerWins++);
                playerWinsFld.setHorizontalAlignment(JTextField.CENTER);
            }
        });
//***************************************************************    
        playerWinsLbl = new JLabel("Player Wins", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(playerWinsLbl, c);

        compWinsLbl = new JLabel("Computer Wins", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(compWinsLbl, c);

        tiesLbl = new JLabel("Ties", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(tiesLbl, c);
        
        playerWinsFld = new JTextField("",SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(playerWinsFld, c);
        
        compWinsFld = new JTextField("",SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(compWinsFld, c);
        
        tiesFld = new JTextField("",SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(tiesFld, c);
        
        resultsArea = new JTextArea(10, 45);
        JScrollPane scroll = new JScrollPane(resultsArea);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 15, 10, 15);
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(scroll, c);
        
        quitBtn = new JButton("Quit");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 40, 10, 40);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(quitBtn, c);
        quitBtn.addActionListener((e) -> {
            System.exit(0);
        });                       
    }
}
