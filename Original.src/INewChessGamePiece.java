import java.util.ArrayList;
import javax.swing.ImageIcon;

public interface INewChessGamePiece{

    public abstract ArrayList<String> calculatePossibleMoves(ChessGameBoard board );
    public ArrayList<String> calculateSouthMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateEastMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthEastMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateSouthWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateSouthEastMoves(ChessGameBoard board, int numMoves );

    public ImageIcon getImage();
    public int getColorOfPiece();
    public boolean isOnScreen( int row, int col );
    public boolean isPieceOnScreen();
    public boolean canMove( ChessGameBoard board, int row, int col );
    public boolean testMoveForKingSafety(ChessGameBoard board, int row, int col);
    public void updatePossibleMoves( ChessGameBoard board );
    public void setPieceLocation( int row, int col );
    public int getRow();
    public int getColumn();
    public void showLegalMoves( ChessGameBoard board );
    public boolean hasLegalMoves( ChessGameBoard board );
    public boolean isEnemy( ChessGameBoard board, int row, int col );
    public ArrayList<NewChessGamePiece> getCurrentAttackers( ChessGameBoard board );
    public String toString();
    
}