import junit.framework.TestCase;
import java.io.*;
import java.util.ArrayList;
public class TestStrategy extends TestCase{
    private ChessPanel chessPanel;
    public void inicializar() {
        chessPanel = new ChessPanel();
    }

    public void testStrategySave(){
    	inicializar();
        ChessGamePiece testPieza1=chessPanel.getGameBoard().getCell(6, 0).getPieceOnSquare();
        testPieza1.move(chessPanel.getGameBoard(),4, 0);
        
        ChessGamePiece testPieza2=chessPanel.getGameBoard().getCell(1, 0).getPieceOnSquare();
        testPieza2.move(chessPanel.getGameBoard(),3, 0);
        
        ChessGamePiece testPieza3=chessPanel.getGameBoard().getCell(6, 1).getPieceOnSquare();
        testPieza3.move(chessPanel.getGameBoard(),4, 1);
        LogStrategy strategyA = new LogByTxt();
        chessPanel.getGameLog().setStrategy(strategyA);

        ChessGamePiece testPieza4=chessPanel.getGameBoard().getCell(1, 1).getPieceOnSquare();
        testPieza4.move(chessPanel.getGameBoard(),3, 1);
        String st = new String();
        String st2 = new String();
        File file = new File("ChessGameLog.txt");
        File file2 = new File("BinaryLog");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            while (reader.readLine() != null && reader2.readLine() != null) {
                reader.reset();
                st = reader.readLine();
                reader2.reset();
                st2 = reader2.readLine();
            }
            reader.close();
            reader2.close();
            assertEquals(st, st2);
        }catch(Exception e){

        }

        
    }


}