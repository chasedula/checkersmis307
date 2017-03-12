import components.CheckerBoardPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CheckerBoardPanel panel = new CheckerBoardPanel();

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        CheckerBoardPanel.initializeEndGame();
    }
}
