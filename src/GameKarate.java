/**
 * Created by lolik on 2017-03-28.
 */
public class GameKarate implements Game_I {
    private String name="karate";
    private int hitCounter=0;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void executeUp() {
        hitCounter++;
        if(hitCounter>10)
        {
            hitCounter=0;
            System.out.println("oponent is dead");
        }
        System.out.println("sending uppercut to oponent");
    }


    @Override
    public void executeDn() {
        hitCounter+=2;
        if(hitCounter>10)
        {
            hitCounter=0;
            System.out.println("oponent is dead");
        }

        System.out.println("sending lowercut elbow to oponent");
    }


    @Override
    public void executeLt() {

        hitCounter+=5;
        if(hitCounter>10)
        {
            hitCounter=0;
            System.out.println("oponent is dead");
        }
        System.out.println("sending left kick  to oponent" );
    }

    @Override
    public void executeRt() {
        hitCounter+=5;
        if(hitCounter>10)
        {
            hitCounter=0;
            System.out.println("oponent is dead");
        }
        System.out.println("sending right kick  to oponent  to oponent");
    }


}
