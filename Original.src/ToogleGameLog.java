import java.awt.Component;
import java.awt.event.ActionEvent;

public class ToogleGameLog extends MenuComponent implements iButton {
    private ChessMenuBar menuBar;

    public ToogleGameLog(ChessMenuBar menuBar) {
        this.menuBar = menuBar;
        this.label = "Toggle game log";
    }

    @Override
    public void onClick(ActionEvent event) {
        ChessPanel chessPanel = (ChessPanel)menuBar.getParent();
    	chessPanel.getGameLog().setVisible(!chessPanel.getGameLog().isVisible());
        chessPanel.revalidate();
    }
}
