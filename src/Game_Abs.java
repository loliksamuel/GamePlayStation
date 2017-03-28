import java.awt.*;

/**
 * Created by lolik on 2017-03-28.
 */
public abstract class Game_Abs implements Game_I {

    protected Color screenColor= Color.WHITE;

    public Color getScreenColor() {
        return screenColor;
    }

    public void setScreenColor(Color screenColor) {
        this.screenColor = screenColor;
    }

}
