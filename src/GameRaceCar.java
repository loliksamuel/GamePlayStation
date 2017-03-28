import java.awt.*;

/**
 * Created by lolik on 2017-03-28.
 */
public class GameRaceCar extends Game_Abs {
    private String name = "Race cars";
    private Color screenColor = Color.CYAN;
    private int speed = 0;
    @Override
    public void restart()
    {
        speed=0;
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
        return "car Speed : " + speed++;
    }


    @Override
    public String executeDn() {
        speed--;
        if (speed < 1) {
            speed = 0;
            return "car is standing...Speed : " + speed + " km/h";
        }
        return "car Speed : " + speed + " km/h";
    }


    @Override
    public String executeLt() {
        return "turning left. vinker left is on.";
    }

    @Override
    public String executeRt() {
        return "turning Right. vinker right is on.";
    }


}
