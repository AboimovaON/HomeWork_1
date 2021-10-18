public class Main {
    public static void main(String[] args) {

        Member member1 = new Member("Olga", 250);
        Member member2 = new Member("Maksim", 360);
        Member member3 = new Member("Ivan", 100);
        Member member4 = new Member("Anna", 150);

        Team team = new Team("Lively", member1, member2, member3, member4);

        Course course = new Course(110, 160,170, 200);

        course.isFinishedDistance(team);

        team.getInfoAboutMembers();
        System.out.println();
        team.getInfoAboutMembersFinished();

    }

}
