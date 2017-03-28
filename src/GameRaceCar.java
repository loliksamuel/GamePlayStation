/**
 * Created by lolik on 2017-03-28.
 */
public class GameRaceCar implements Game_I {
    private String name="Race cars";
    private int speed=0;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void executeUp() {
        System.out.println("car Speed : "+speed++);
    }


    @Override
    public void executeDn() {
        speed--;
        if (speed<0) {
            speed = 0;
            System.out.println("car is standing...");
        }
        System.out.println("car Speed is"+speed);
    }


    @Override
    public void executeLt() {
        System.out.println("turning left. vinker left is on." );
    }

    @Override
    public void executeRt() {
        System.out.println("turning Right. vinker right is on.");
    }


}
