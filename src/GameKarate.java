import java.awt.*;

/**
 * Created by lolik on 2017-03-28.
 */
public class GameKarate  extends  Game_Abs    {
    private String name="KARATE!";
    private int hitCounter=0;


    private Color screenColor = Color.YELLOW;
    @Override
    public void restart()
    {
        hitCounter=0;
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
        hitCounter++;
        if(hitCounter>9)
        {
            hitCounter=0;
            return "10'th upper cut to oponent. he is dead!";
        }
        return hitCounter+ "'th uppercut to oponent. ";
    }


    @Override
    public String executeDn() {
        hitCounter+=2;
        if(hitCounter>9) {
            hitCounter = 0;
            return "another lowercut elbow to oponent. he is dead!";
        }
        return "another lowercut elbow to oponent.";
    }


    @Override
    public String executeLt() {

        hitCounter+=5;
        if(hitCounter>9)
        {
            hitCounter=0;
            return "another left kick elbow to oponent. he is dead!";
        }
        return "another left kick elbow to oponent.";
    }

    @Override
    public String executeRt() {
        hitCounter+=5;
        if(hitCounter>10)
        {
            hitCounter=0;
            return "another right kick elbow to oponent. he is dead!";
        }
        return "another right kick elbow to oponent.";
    }


}
