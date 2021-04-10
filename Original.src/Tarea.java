import java.awt.Container;
import java.awt.event.MouseEvent;

public interface Tarea {
	public abstract void ejecutar(MouseEvent e, ChessPanel chessPanel);
}
