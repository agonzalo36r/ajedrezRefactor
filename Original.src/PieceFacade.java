
public class PieceFacade {
	public void PieceFacade() {
		
	}
	
	public King createKing(ChessGameBoard chessGameBoard, int i, int j, int col) {
		return new King(chessGameBoard, i, j, col);
	}
	
	public Queen createQueen(ChessGameBoard chessGameBoard, int i, int j, int col) {
		return new Queen(chessGameBoard, i, j, col);
	}
	
	public Pawn createPawn(ChessGameBoard chessGameBoard, int i, int j, int col) {
		return new Pawn(chessGameBoard, i, j, col);
	}
	
	public Rook createRook(ChessGameBoard chessGameBoard, int i, int j, int col) {
		return new Rook(chessGameBoard, i, j, col);
	}
	
	public Knight createKnight(ChessGameBoard chessGameBoard, int i, int j, int col) {
		return new Knight(chessGameBoard, i, j, col);
	}
	
	public Bishop createBishop(ChessGameBoard chessGameBoard, int i, int j, int col) {
		return new Bishop(chessGameBoard, i, j, col);
	}
}
