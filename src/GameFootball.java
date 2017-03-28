import java.awt.*;

/**
 * Created by lolik on 2017-03-28.
 */
public class GameFootball extends  Game_Abs   {
    private String name="Football";
    //protected String screenColor= "000000";
    int counter=0;


    private Color screenColor = Color.GRAY;

    @Override
    public void restart()
    {
        counter=0;
    }
    @Override
    public Color getColor() {
        return screenColor;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String executeUp() {
        counter++;
        if (counter>10)
        {
            counter=0;
            return "GOOOOAAAAAALLLL!";

        }
        return "football is kicked Forward "+counter+ " times";
    }


    @Override
    public String executeDn() {
        return "football is kicked Backward" ;
    }


    @Override
    public String executeLt() {
        return "football is kicked Left"  ;
    }

    @Override
    public String executeRt() {
        return "football is kicked Right";
    }


}
