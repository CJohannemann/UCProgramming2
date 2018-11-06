package ttt;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author cjohannemann
 */
public class TicTacToeFrame extends JFrame {

    final boolean shouldWeightX = true;
    final boolean RIGHT_TO_LEFT = false;
    final boolean shouldFill = true;
    private final TicTacToeTile[][] board;
    public JTextArea jtf;
    private int userTurn = 0;
    private JButton reset, quit;

    static boolean winner = false;
    private final TicTacToe ttt;

    TicTacToeFrame() {
        this.ttt = new TicTacToe();
        board = new TicTacToeTile[3][3];
        addComponentsToPane();
        setTitle("Tic Tac Toe Game");
        setLocationRelativeTo(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponentsToPane() {

        if (RIGHT_TO_LEFT) {
            setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        if (shouldWeightX) {
            c.weightx = 0.5;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int x = i;
                final int y = j;
                board[i][j] = new TicTacToeTile(i, j);
                c.insets = new Insets(10, 10, 10, 10);
                board[i][j].setPreferredSize(new Dimension(40, 40));
                c.gridx = i;
                c.gridy = j;
                add(board[i][j], c);
                board[i][j].addActionListener((e) -> {
                    ++userTurn;
                    ttt.set(x, y, getPlayer());
                    board[x][y].setEnabled(false);
                    board[x][y].setText(getPlayer());
                    moveCounter(getPlayer());
                });
            }
        }
        JPanel gameControls = gameButtons();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15, 40, 10, 40);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 4;
        add(gameControls, c);
    }

    private JPanel gameButtons() {
        reset = new JButton("Reset");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int x = i;
                final int y = j;
                reset.addActionListener((e) -> {
                    board[x][y].setEnabled(true);
                    board[x][y].setText("");
                    userTurn = 0;
                });
            }
        }
        quit = new JButton("Quit");
        quit.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this,
                        "Someone has quit :(!",
                        "**Tic Tac Toe Quitter**",
                        JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        });

        JPanel panel = new JPanel();
        panel.add(reset);
        panel.add(quit);
        return panel;

    }

    public void moveCounter(String player) {
        if (userTurn > 4) {
            boolean hasWon = ttt.CheckForWinner(player);
            if (hasWon) {
                //display some sort of message to the user
                JOptionPane.showMessageDialog(this,
                        "Player " + player + " has won!",
                        "**Tic Tac Toe Winner**",
                        JOptionPane.PLAIN_MESSAGE);
                //Ask to start a new game or something
            }
        }
        if (userTurn >8) {
            boolean hasTied = ttt.CheckForTie(player);
            if(hasTied){
            JOptionPane.showMessageDialog(this,
                    "No one won, it's a tie!",
                    "**Tic Tac Toe Winner**",
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    private String getPlayer() {
        return userTurn % 2 == 0 ? "O" : "X";
    }

}
