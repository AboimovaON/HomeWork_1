public class Main {
    public static void main(String[] args) {

       // Course c = new Course(110, 150, 160, 90);

        Member member1 = new Member("Olga", 150);
        Member member2 = new Member("Maksim", 160);
        Member member3 = new Member("Ivan", 200);
        Member member4 = new Member("Anna", 350);

        Team team = new Team("Lively", member1, member2, member3, member4);

        Course course = new Course(110, 160,170, 200);

        course.isFinishedDistance(team);

        team.getInfoAboutMembers();
        System.out.println();
        team.getInfoAboutMembersFinished();
        System.out.println();
    }

}
