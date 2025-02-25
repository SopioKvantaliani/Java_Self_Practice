package day13_practice_tasks.state_task;

public class StateClient {
    public static void main(String[] args) {
        Florida florida = new Florida("Florida", "Fl", "Democrats", "Mark", "Democrat",140_000);
        System.out.println(florida);
        System.out.println(florida.getAbbreviation());
        System.out.println(florida.getGovernor());

        System.out.println(florida.hashCode());
        System.out.println(florida.getPopulation());
        florida.setName(" ");
        System.out.println(florida);

        Texas texas = new Texas("Texas", "TX", "Democrats", "Marko", "Democrat", 150_000);
        System.out.println(texas.getPoliticalParty());
        texas.setName(" ");
        System.out.println(texas.getName());
    }
}
