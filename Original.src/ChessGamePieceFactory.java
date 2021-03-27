
public class ChessGamePieceFactory {
	public static ChessGamePiece CreatePiece(String pieceID, ChessGameBoard chessgameboard, int row, int column, int pieceColor) {
		switch(pieceID) {
			case "King":
				return new King(chessgameboard, row, column, pieceColor);
			case "Queen":
				return new Queen(chessgameboard, row, column, pieceColor);
			case "Bishop":
				return new Bishop(chessgameboard, row, column, pieceColor);
			case "Pawn":
				return new Pawn(chessgameboard, row, column, pieceColor);
			case "Knight":
				return new Knight(chessgameboard, row, column, pieceColor);
			case "Rook":
				return new Rook(chessgameboard, row, column, pieceColor);
			default:
				// TODO: agregar patron NULL
				return null;
		}
	}

	public static ChessGamePiece CreatePiece2(String pieceID, ChessGameBoard chessgameboard, int row, int column, int pieceColor) {
		switch(pieceID) {
			case "King":
				ChessGamePiece king = new King.KingBuilder().pieceRow(row).pieceColumn(column).pieceColor(pieceColor).chessGameBoard(chessgameboard).build();
				
				if ( chessgameboard.getCell( row, column ) != null ){
					chessgameboard.getCell(row, column).setPieceOnSquare(king);
			    }
				
				return king;
			case "Queen":
				ChessGamePiece queen = new Queen.QueenBuilder().pieceRow(row).pieceColumn(column).pieceColor(pieceColor).chessGameBoard(chessgameboard).build();
				
				if ( chessgameboard.getCell( row, column ) != null ){
					chessgameboard.getCell(row, column).setPieceOnSquare(queen);
			    }
				
				return queen;
			case "Bishop":
				ChessGamePiece bishop = new Bishop.BishopBuilder().pieceRow(row).pieceColumn(column).pieceColor(pieceColor).chessGameBoard(chessgameboard).build();
				
				if ( chessgameboard.getCell( row, column ) != null ){
					chessgameboard.getCell(row, column).setPieceOnSquare(bishop);
			    }
				
				return bishop;
			case "Pawn":
				ChessGamePiece pawn = new Pawn.PawnBuilder().pieceRow(row).pieceColumn(column).pieceColor(pieceColor).chessGameBoard(chessgameboard).build();
				
				if ( chessgameboard.getCell( row, column ) != null ){
					chessgameboard.getCell(row, column).setPieceOnSquare(pawn);
			    }
				
				return pawn;
			case "Knight":
				ChessGamePiece knight = new Knight.KnightBuilder().pieceRow(row).pieceColumn(column).pieceColor(pieceColor).chessGameBoard(chessgameboard).build();
				
				if ( chessgameboard.getCell( row, column ) != null ){
					chessgameboard.getCell(row, column).setPieceOnSquare(knight);
			    }
				
				return knight;
			case "Rook":
				ChessGamePiece rook = new Rook.RookBuilder().pieceRow(row).pieceColumn(column).pieceColor(pieceColor).chessGameBoard(chessgameboard).build();
				
				if ( chessgameboard.getCell( row, column ) != null ){
					chessgameboard.getCell(row, column).setPieceOnSquare(rook);
			    }
				
				return rook;
			default:
				// TODO: agregar patron NULL
				return null;
		}
	}
}