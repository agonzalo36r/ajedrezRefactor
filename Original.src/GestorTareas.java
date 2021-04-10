import java.awt.Container;
import java.awt.event.MouseEvent;

public class GestorTareas {
	public void ejecutar (TareaClick tareaClick, MouseEvent e, ChessPanel chessPanel) {
		tareaClick.ejecutar(e, chessPanel);
    }
}
