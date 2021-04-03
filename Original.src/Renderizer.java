import javax.swing.ImageIcon;

public class Renderizer {
	public static ImageIcon createQueen(int color) {
		if ( color == NewChessGamePiece.WHITE ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/WhiteQueen.gif")
            );            
        }
        else if ( color == NewChessGamePiece.BLACK ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/BlackQueen.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/default-Unassigned.gif")
            ); 
        }
	}
	
	public static ImageIcon createKing(int color) {
		if ( color == NewChessGamePiece.WHITE ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/WhiteKing.gif")
            );            
        }
        else if ( color == NewChessGamePiece.BLACK ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/BlackKing.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/default-Unassigned.gif")
            ); 
        }
	}
	
	public static ImageIcon createPawn(int color) {
		if ( color == NewChessGamePiece.WHITE ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/WhitePawn.gif")
            );            
        }
        else if ( color == NewChessGamePiece.BLACK ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/BlackPawn.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/default-Unassigned.gif")
            ); 
        }
	}
	
	public static ImageIcon createRook(int color) {
		if ( color == NewChessGamePiece.WHITE ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/WhiteRook.gif")
            );            
        }
        else if ( color == NewChessGamePiece.BLACK ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/BlackRook.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/default-Unassigned.gif")
            ); 
        }
	}
	
	public static ImageIcon createKnight(int color) {
		if ( color == NewChessGamePiece.WHITE ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/WhiteKnight.gif")
            );            
        }
        else if ( color == NewChessGamePiece.BLACK ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/BlackKnight.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/default-Unassigned.gif")
            ); 
        }
	}
	
	public static ImageIcon createBishop(int color) {
		if ( color == NewChessGamePiece.WHITE ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/WhiteBishop.gif")
            );            
        }
        else if ( color == NewChessGamePiece.BLACK ){
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/BlackBishop.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                Renderizer.class.getResource("chessImages/default-Unassigned.gif")
            ); 
        }
	}
}
