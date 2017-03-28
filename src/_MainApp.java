import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lolik on 2017-03-28.
 */
public class _MainApp {
    private static _MainWindow main;
    public static void main(String[] args){
        main = new _MainWindow();

        main.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }


}
