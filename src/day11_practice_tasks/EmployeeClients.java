package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Sopo", 30, 'F', "SDET", 160_000);
        Employee employee2 = new Employee("Ann");
        Employee employee3 = new Employee("Ann", 32, 'F', "SDET");
        System.out.println(employee1);
        employee2.setJobTitle();
        employee1.setJobTitle();
    }
}
