import java.util.Date;
import javax.swing.JTextArea;
import java.io.FileOutputStream;
import java.io.IOException;

public class LogByBinary implements LogStrategy {
    
    @Override
    public void processLog(String s, JTextArea textArea) {
        System.out.println("Strategy Binario Inicia");
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
        try {
            byte data[] = tempString.getBytes();
            FileOutputStream out = new FileOutputStream("BinaryLog");
            out.write(data);
            out.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}