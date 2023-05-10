public class Main {
    public static void main(String[] args) {
        HockeyManager currTeam = new HockeyManager();
        currTeam.AddNewDefender("Jano",26,12);
        currTeam.AddNewForward("Peter",20,4);
        currTeam.AddNewGoalie("Adam",21,5);
        currTeam.PrintNameAndAgeOfTheYoungestPlayer();
    }
}