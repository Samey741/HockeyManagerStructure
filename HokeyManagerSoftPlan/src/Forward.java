public class Forward extends Player{

    public Forward(String name, int age ) {
        super(name, age);
    }


    public int getGoalsNum() {
        return goalsNum;
    }

    public void setGoalsNum(int goalsNum) {
        this.goalsNum = goalsNum;
    }

    private int goalsNum;

}
