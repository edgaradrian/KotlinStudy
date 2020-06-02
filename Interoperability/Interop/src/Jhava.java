import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Jhava {

    private int hitPoints = 51999004;
    private String greeting = "BLARGH";

    public static void main(String[] args) {
        System.out.println(Hero.makeProclamation());
    }//main

    @NotNull
    public String utterGreeting() {
        return greeting;
    }//utterGreeting

    @Nullable
    public String determineFriendshipLevel() {
        return null;
    }

    public int getHitPoints() {
        return hitPoints;
    }//getHitPoints

    public String getGreeting() {
        return greeting;
    }//getGreeting

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
