import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class About extends MenuComponent implements iButton {
    private ChessMenuBar menuBar;

    public About(ChessMenuBar menuBar) {
        this.label = "About";
        this.menuBar = menuBar;
    }

    @Override
    public void onClick(ActionEvent event) {
    	JOptionPane.showMessageDialog(
            (ChessPanel)menuBar.getParent(),
            "YetAnotherChessGame v1.0 by:\nBen Katz\nMyles David\n"
                + "Danielle Bushrow\n\nFinal Project for CS2114 @ VT" );
    }
}
