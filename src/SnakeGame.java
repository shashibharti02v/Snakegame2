import javax.swing.*;

public class SnakeGame extends JFrame {
    SnakeScore snakeScore;
    SnakeGame(){
        snakeScore = new SnakeScore();
        add(snakeScore);
        setResizable(false);
        pack();
        setBounds(100, 100, 500, 500);

        setVisible(true);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {

        SnakeGame snakegame = new SnakeGame();
    }
}