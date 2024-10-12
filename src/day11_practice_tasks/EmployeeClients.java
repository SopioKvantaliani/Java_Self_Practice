package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Sopo", 30, 'F', "SDET", 160_000);
        System.out.println(employee1);
        employee1.setJobTitle();
    }
}
