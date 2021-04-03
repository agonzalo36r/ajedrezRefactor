import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.io.File;

public class ChessGameEngineProxy implements IGameEngine{

    private IGameEngine iGameEngine;


    @Override
    public void nextTurn(){
        try {
            FileWriter myWriter = new FileWriter("D:\filename.txt");
            myWriter.write("TextProxy");
            myWriter.close();
        }catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
        

        iGameEngine.nextTurn();
    }

    public ChessGameEngineProxy(ChessGameBoard board){
        super();
        this.iGameEngine = new ChessGameEngine(board);
        
    }
}