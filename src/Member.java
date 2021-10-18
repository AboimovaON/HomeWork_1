public class Member {
    private String name;
    private int possibilites;
    private boolean isFinished;

    public Member(String name, int possibilites){
        this.name = name;
        this.possibilites = possibilites;
        isFinished = false;
    }

    public void getInfo(){
        System.out.println(name + " " + isFinished);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public int getPossibilites() {
        return possibilites;
    }
}
