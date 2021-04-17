import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.swing.JTextArea;

public class LogByTxt implements LogStrategy {

    @Override
    public void processLog(String s, JTextArea textArea) {
        System.out.println("Strategy TXT Inicia");
        String tempString;
        if ( textArea.getText().length() > 0 ){
            tempString = textArea.getText() + "\n" + new Date() + " - " + s;
            textArea.setText(tempString);
        }
        else
        {   
            tempString = new Date() + " - " + s;
            textArea.setText(tempString);
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter("ChessGameLog.txt", "UTF-8");
            writer.println(tempString);
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}