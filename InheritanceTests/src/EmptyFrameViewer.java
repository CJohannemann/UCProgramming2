
import java.awt.PopupMenu;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjohannemann
 */
public class EmptyFrameViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("An empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(PaintNewJPanel());
        
        frame.setVisible(true);
    }

    private static JPanel PaintNewJPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Click ME!");
        JLabel label = new JLabel("Hello World");
        
        panel.add(button);
        panel.add(label);
        return panel;
    }
    
}
