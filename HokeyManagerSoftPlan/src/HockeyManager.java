import java.util.*;

public class HockeyManager
{
    HockeyTeam team = HockeyTeam.getInstance();


    public void AddNewForward(String name, int age, int goals){
        Forward newForward = new Forward(name,age);
        newForward.setGoalsNum(goals);
        team.addPlayer(newForward);
    }

    public void AddNewDefender(String name, int age, int hits){
        Defender newDefender = new Defender(name,age);
        newDefender.setHitsNum(hits);
        team.addPlayer(newDefender);
    }

    public void AddNewGoalie(String name, int age, int wins){
        Goalie newGoalie = new Goalie(name,age);
        newGoalie.setWinNum(wins);
        team.addPlayer(newGoalie);
    }

    public void PrintNameAndAgeOfTheYoungestPlayer() {
        Player youngest = null;
        int youngestAge = Integer.MAX_VALUE;
        List<Player> playerList = team.getPlayerList();

        for (Player player : playerList) {
            if (player.getAge() < youngestAge) {
                youngest = player;
                youngestAge = player.getAge();
            }
        }

        if (youngest != null) {
            System.out.println("Najmladší hráč je: " + youngest.getName() + " s vekom: " + youngest.getAge());
        }
    }


}