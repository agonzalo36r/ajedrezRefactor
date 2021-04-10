public class Memento{
    private BoardSquare[][] chessCells;

    public Memento(BoardSquare chessCells[][]){
        this.chessCells = copy(chessCells);
        printPieces();
    }

    public BoardSquare[][] getSavedState(){
        return chessCells;
    }

    public void printPieces(){
        System.out.println("Información del Memento------------------");
        for ( int i = 0; i < 8; i++ ){
            for ( int j = 0; j < 8; j++ ){
                if ( chessCells[i][j].getPieceOnSquare() != null ){
                    System.out.println(chessCells[i][j].getPieceOnSquare().pieceRow + " - "+ 
                    chessCells[i][j].getPieceOnSquare().pieceColumn + " - " + chessCells[i][j].getPieceOnSquare().toString());
                }
            }
        }
        System.out.println("---------------------------");
    }

    public BoardSquare[][] copy(BoardSquare[][] gameBoard){
        BoardSquare[][] m = new BoardSquare[8][8];
        for ( int i = 0; i < 8; i++ ){
            for ( int j = 0; j < 8; j++ ){
                int row = gameBoard[i][j].getRow();
                int column = gameBoard[i][j].getColumn();
                ChessGamePiece piece = gameBoard[i][j].getPieceOnSquare();
                if(piece!=null){
                    piece.setPieceLocation(i, j);
                }
                m[i][j] = new BoardSquare(row, column, piece);
            }
        }
        return m;
    }
}