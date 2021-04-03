import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class NewGameR extends MenuComponent implements iButton {
    private ChessMenuBar menuBar;

    public NewGameR(ChessMenuBar menuBar) {
        this.label = "New game/restart";
        this.menuBar = menuBar;
    }

    @Override
    public void onClick(ActionEvent event) {
        ((ChessPanel)menuBar.getParent()).getGameEngine().reset();
    }
}
