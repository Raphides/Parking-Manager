package EstacionaDF;
import javax.swing.JOptionPane;

public class init {
    public static void main(String[] args) {
        SystemApp app;
        // General error treatment
        try {
            app = new SystemApp();
        } catch (Exception e) {
           /*  new Thread() {
                @Override
                public void run() {
                    JOptionPane.showMessageDialog(null, 
                    "<html><h3>O que fazer:</h3><br>" + e.getMessage() + "</html>"
                    , "ERROR", JOptionPane.ERROR_MESSAGE);
                };
            }.start(); */
            e.printStackTrace();
        }
