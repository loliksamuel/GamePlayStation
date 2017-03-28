import java.awt.*;

/**
 * Created by lolik on 2017-03-28.
 */
public interface Game_I {
    public void restart();
    public String getName();
    public Color getColor();
    public String executeUp();
    public String executeDn();
    public String executeLt();
    public String executeRt();
    //public void executeStop();
}
