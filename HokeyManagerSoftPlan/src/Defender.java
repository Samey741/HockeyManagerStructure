public class Defender extends Player {

    public int getHitsNum() {
        return hitsNum;
    }

    public void setHitsNum(int hitsNum) {
        this.hitsNum = hitsNum;
    }

    private int hitsNum;

    public Defender(String name, int age ) {
        super(name, age);
    }
}
