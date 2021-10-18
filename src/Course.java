public class Course {

   int[] obstacles;

    public Course(int jumping, int jogging, int squats, int pushUp){
        obstacles = new int[]{jumping, jogging, squats, pushUp};
    }
    public void isFinishedDistance(Team team) {
        for (Member member: team.getMembers()){
            for (int obstacle: obstacles){
                if (member.getPossibilites() >= obstacle){
                    member.setFinished(true);
                }
                else {
                    member.setFinished(false);
                    break;
                }
            }
        }
    }
}
