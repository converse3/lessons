package course2.homeworks.homework1;

public class App {
    public static void main(String[] args) {
        Team team = new Team("Team", new String[] {"Oleg", "Alexander", "Gleb"});
        Course course = new Course(new String[]{"Стена", "Столб", "Куст"});
        course.requirement(team);
        team.showResults();
    }
}
