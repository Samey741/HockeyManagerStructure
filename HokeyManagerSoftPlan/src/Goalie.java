public class Goalie extends Player{
    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    private int winNum;



    public Goalie(String name, int age ) {
        super(name, age);
    }
}
