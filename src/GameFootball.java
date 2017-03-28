/**
 * Created by lolik on 2017-03-28.
 */
public class GameFootball implements Game_I {
    private String name="Football";
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void executeUp() {
        System.out.println("football is kicked Forward");
    }


    @Override
    public void executeDn() {
        System.out.println("football is kicked Backward");
    }


    @Override
    public void executeLt() {
        System.out.println("football is kicked Left" );
    }

    @Override
    public void executeRt() {
        System.out.println("football is kicked Right");
    }


}
