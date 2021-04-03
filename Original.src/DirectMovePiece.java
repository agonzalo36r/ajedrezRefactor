import java.util.ArrayList;
// -------------------------------------------------------------------------
/**
 * Represents a Rook game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class DirectMovePiece
    extends NewChessGamePieceDecorator{
    // private ArrayList<String> possibleMoves;
    // ----------------------------------------------------------
    /**
     * Create a new Rook object.
     *
     * @param board
     *            the board to create the rook on
     * @param row
     *            the row to create the rook on
     * @param col
     *            the column to create the rook on
     * @param color
     *            either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    public DirectMovePiece( INewChessGamePiece iNewChessGamePiece ){
        super( iNewChessGamePiece );
    }
    /**
     * Calculates the possible moves for this Rook.
     * @param board the board to check on
     * @return ArrayList<String> the list of moves
     */
    @Override
    public ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northMoves = getINewChessGamePiece().calculateNorthMoves( board, 8 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 8 );
        ArrayList<String> westMoves = calculateWestMoves( board, 8 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 8 );
        ArrayList<String> allMoves = new ArrayList<String>();
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }
}
