import java.util.Random;


public class ChessGameLogProxy implements IGameLog{
    private IGameLog iGameLog;

    public ChessGameLogProxy(){
        this.iGameLog = new ChessGameLog();
    }

    @Override
    public void addToLog(String s){
        Random rand = new Random();
        int upperbound = 25;
        int numMinutos = rand.nextInt(upperbound); 
        
        if(numMinutos<10){
            iGameLog.addToLog(s);
        }else{
            System.out.println("Tiempo agotado. Partida finalizada.");
        }
    }
}