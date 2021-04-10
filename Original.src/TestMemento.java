import junit.framework.TestCase;

public class TestMemento extends TestCase{
    private ChessPanel chessPanel;
    public void inicializar() {
        chessPanel = new ChessPanel();
    }

    public void testGuardarMemento(){
    	inicializar();
        ChessGamePiece testPieza1=chessPanel.getGameBoard().getCell(6, 0).getPieceOnSquare();
        testPieza1.move(chessPanel.getGameBoard(),4, 0);
        
        ChessGamePiece testPieza2=chessPanel.getGameBoard().getCell(1, 0).getPieceOnSquare();
        testPieza2.move(chessPanel.getGameBoard(),3, 0);
        
        Memento m = ChessPanel.caretaker.getLastMemento();
        ChessGamePiece savedPiece = m.getSavedState()[4][0].getPieceOnSquare();
        assertEquals(testPieza1.toString(), savedPiece.toString());
    }

    public void testRevertirMemento(){
    	inicializar();
        ChessGamePiece testPieza1=chessPanel.getGameBoard().getCell(6, 0).getPieceOnSquare();
        testPieza1.move(chessPanel.getGameBoard(),4, 0);
        
        ChessGamePiece testPieza2=chessPanel.getGameBoard().getCell(1, 0).getPieceOnSquare();
        testPieza2.move(chessPanel.getGameBoard(),3, 0);
        
        ChessGamePiece testPieza3=chessPanel.getGameBoard().getCell(6, 1).getPieceOnSquare();
        testPieza3.move(chessPanel.getGameBoard(),4, 1);
        
        Memento m = ChessPanel.caretaker.getLastMemento();
        Memento m1 = ChessPanel.caretaker.getLastMemento();
        Memento m2 = ChessPanel.caretaker.getLastMemento();
        chessPanel.getGameBoard().restoreFromMemento(m2);

        ChessGamePiece savedPiece = m2.getSavedState()[6][0].getPieceOnSquare();
        assertEquals(testPieza1.toString(), savedPiece.toString());
    }

}