
package inclassgui;

import javax.swing.*;

public class InterestFrame extends JFrame{
    
    
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 400;
    private static final double INITIAL_BALANCE = 1000;
    private static final double DEFAULT_RATE = 5;
    private static final int ROWS = 10;
    private static final int COLUMNS = 30;
    
    
    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JTextArea resultarea;
    private double balance;
    
    public InterestFrame(){
        
        balance = INITIAL_BALANCE;
        
        resultarea = new JTextArea(ROWS, COLUMNS);
        resultarea.setText(balance + "\n");
        resultarea.setEditable(false);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Interest");
        setLocationRelativeTo(null);
              
        createTextField();
        createButton();
        createPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    
    
    private void createTextField(){
        rateLabel = new JLabel("Interest Rate: ");
        final int FIELD_WIDTH = 10;
        rateField =  new JTextField(FIELD_WIDTH);
        rateField.setText("" + DEFAULT_RATE);
    }

    private void createButton() {
        button = new JButton("Add Interest");
        button.addActionListener((e) -> {
        double rate = Double.parseDouble(rateField.getText());
        double interest = balance * rate /100;
        balance += interest;
        resultarea.append("Balance : " + balance+ "\n");
        });
        
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(resultarea);
        JScrollPane scrollPane = new JScrollPane(resultarea);
        panel.add(scrollPane);
        add(panel);
    }
    
}
    
    
    
