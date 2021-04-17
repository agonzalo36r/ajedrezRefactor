import javax.swing.JTextArea;

public interface LogStrategy{
    void processLog(String s, JTextArea textArea);
}