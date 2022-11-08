import javax.swing.*;
import java.awt.*;

public class Tile {

    private int number;
    private final JButton button;

    public Tile(int Number) {
        number = Number;
        button = new JButton(String.valueOf(number)); //konverterar number to String
        initializeButton();

    }
    private void initializeButton(){ //initialiserar våra knappar
        button.setText(String.valueOf(number));
        if (number==16){
            button.setVisible(false); //gör osynlig sista tile
        }
        else {
            button.setFont(new Font(null, Font.BOLD, 20));
            button.setBackground(Color.cyan);
            button.setVisible(true); // resten ska vara synlig
        }
    }
    public void updateButton(int newNumber){
        number = newNumber;
        initializeButton(); //uppdaterar våra buttos på nytt
    }

    public int getNumber() {
        return number;
    }

    public JButton getButton() {
        return button;
    }
}