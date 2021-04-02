import junit.framework.TestCase;

public class TestFacade extends TestCase{
	private PieceFacade facade;
	
	public void escenario() {
		facade = new PieceFacade();
	}
	
	public void testcreateKing() {
		escenario();
		assertEquals(facade.createKing(new ChessGameBoard(), 0, 0, 0), new King(new ChessGameBoard(), 0, 0, 0));
	}
	
	public void testcreateQueen() {
		escenario();
		assertEquals(facade.createQueen(new ChessGameBoard(), 0, 0, 0), new Queen(new ChessGameBoard(), 0, 0, 0));
	}
	
	public void testcreatePawn() {
		escenario();
		assertEquals(facade.createPawn(new ChessGameBoard(), 1, 0, 0), new Pawn(new ChessGameBoard(), 1, 0, 0));
	}
	
	public void testcreateRook() {
		escenario();
		assertEquals(facade.createRook(new ChessGameBoard(), 0, 0, 0), new Rook(new ChessGameBoard(), 0, 0, 0));
	}
	
	public void testcreateKnight() {
		escenario();
		assertEquals(facade.createKnight(new ChessGameBoard(), 0, 1, 0), new Knight(new ChessGameBoard(), 0, 1, 0));
	}
	
	public void testcreateBishop() {
		escenario();
		assertEquals(facade.createBishop(new ChessGameBoard(), 0, 0, 0), new Bishop(new ChessGameBoard(), 0, 0, 0));
	}
}
