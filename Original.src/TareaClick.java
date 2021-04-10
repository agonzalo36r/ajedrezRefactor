import java.awt.Container;
import java.awt.event.MouseEvent;

public class TareaClick implements Tarea{

	@Override
	public void ejecutar(MouseEvent e, ChessPanel chessPanel) {
         ((ChessPanel) chessPanel).getGameEngine().determineActionFromSquareClick(e);
	}
}
