import java.util.*;
import java.util.HashMap;


public class HockeyTeam {

    private static HockeyTeam instance;
    private HashMap<Integer, Player> teamList;

    private HockeyTeam() {
        teamList = new HashMap<Integer, Player>();
    }
    public void addPlayer(Player newPlayer){
        teamList.put(newPlayer.getName().hashCode(),newPlayer);
    }

    public List<Player> getPlayerList() {
        return new ArrayList<>(teamList.values());
    }



    public static HockeyTeam getInstance() {
        if (instance == null) {
            instance = new HockeyTeam();
        }
        return instance;
    }

}
