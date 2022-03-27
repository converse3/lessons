package course2.homeworks.homework1;

public class Course{
    private String[] obstacles;

    public Course(String[] obstacles) {
        this.obstacles = obstacles;
    }

    public void requirement(Team team) {
        System.out.println("Команда " + team.getName() + " приступайте к прохождению полосы.");
    }
}
