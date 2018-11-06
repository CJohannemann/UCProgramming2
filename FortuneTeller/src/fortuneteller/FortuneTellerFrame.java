package fortuneteller;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FortuneTellerFrame extends JFrame {

    private static final int FRAME_WIDTH = 355;
    private static final int FRAME_HEIGHT = 525;
    private static final int ROWS = 20;
    private static final int COLUMNS = 30;
    private JLabel label, labelImg;
    ArrayList<String> quotes; 
    int old = 0;
    JPanel contentPnl, controlPnl;
    JTextArea jta;
    JButton fortuneBtn, exitBtn;
    ImageIcon img;
    int curQuote = 0;

    FortuneTellerFrame() {
        quotes = ArrayClass.getQuotes();
        jta = new JTextArea(ROWS, COLUMNS);
        jta.setEditable(false);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Fortune Teller GUI");
        setLocationRelativeTo(null);
        setResizable(false);
        createButton();
        createTextField();
        exitButton();
        createPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createTextField() {
        label = new JLabel("Fortune Teller:");
        label.setFont(new Font("Courier New", Font.BOLD, 36));
        label.setForeground(Color.BLUE);
        img = new ImageIcon("fortunePicture.png");
        labelImg = new JLabel(img);
    }

    private void createButton() {
        fortuneBtn = new JButton("Read My Fortune!");
        fortuneBtn.setFont(new Font("Arial", Font.TRUETYPE_FONT, 14));
        fortuneBtn.setForeground(Color.GREEN);
        fortuneBtn.addActionListener((e) -> {
            StringBuilder txt = new StringBuilder();
            Random random = new Random();
            int randomNum = 0;
            do {                
                randomNum = random.ints(1,0, 11).findFirst().getAsInt();
            } while (old == randomNum);
            old = randomNum;
            jta.append(quotes.get(randomNum) + "\n");
        });
    }

    private void exitButton() {
        exitBtn = new JButton("Quit");
        exitBtn.setFont(new Font("Arial", Font.ITALIC, 14));
        exitBtn.setForeground(Color.red);
        exitBtn.addActionListener((e) -> {
            System.exit(0);
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(labelImg);
        panel.add(jta);
        JScrollPane scrollPane = new JScrollPane(jta);
        panel.add(scrollPane);
        panel.add(fortuneBtn);
        panel.add(exitBtn);
        add(panel);
    }
}
