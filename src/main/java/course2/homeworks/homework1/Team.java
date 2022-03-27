package course2.homeworks.homework1;

public class Team {
    private String name;
    private String[] members;

    public Team(String name, String[] members) {
        this.name = name;
        this.members = members;
    }

    public void teamInfo() {
        for (int i = 0; i < members.length; i++) {
            System.out.println("Участник " + (i + 1) + " - " + members[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void showResults() {
        System.out.println("Результаты прохождения полосы - " + null);
    }
}
