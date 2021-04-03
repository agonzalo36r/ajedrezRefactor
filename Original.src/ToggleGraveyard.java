
import java.awt.Component;
import java.awt.event.ActionEvent;

public class ToggleGraveyard  extends MenuComponent implements iButton {
    private ChessMenuBar menuBar;
    private final Integer PLAYER_ONE = 1;
    private final Integer PLAYER_TWO = 2;

    public ToggleGraveyard(ChessMenuBar menuBar) {
        this.menuBar = menuBar;
        this.label = "Toggle graveyard";
    }

    @Override
    public void onClick(ActionEvent event) {
        ChessPanel chessPanel = (ChessPanel)menuBar.getParent();
    	chessPanel.getGraveyard(PLAYER_ONE).setVisible(!chessPanel.getGraveyard(PLAYER_ONE).isVisible());
        chessPanel.getGraveyard(PLAYER_TWO).setVisible(!chessPanel.getGraveyard(PLAYER_TWO).isVisible());
    }
}
