import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Exit extends MenuIteratorComp implements iButton {
    private ChessMenuBar menuBar;

    public Exit(ChessMenuBar menuBar) {
        this.menuBar = menuBar;
        this.label = "Exit";
    }

    @Override
    public void onClick(ActionEvent event) {
        ChessPanel chessPanel = (ChessPanel)menuBar.getParent();

        JOptionPane.showMessageDialog(chessPanel, "Thanks for leaving, quitter! >:(" );
        Component possibleFrame = chessPanel;

        while (possibleFrame!=null && !(possibleFrame instanceof JFrame)) {
            possibleFrame = possibleFrame.getParent();
        }
        
        JFrame frame = (JFrame)possibleFrame;

        frame.setVisible( false );
        frame.dispose();
    }
}