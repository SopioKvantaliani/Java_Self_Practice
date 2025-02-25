package day13_practice_tasks.employee_task;

public class Tester extends Employee {

    public Tester(String name, int age, String companyName, String employeeId, String jobTitle, double salary) {
        super(name, age, companyName, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" " +getName()+ " is testing");

    }
}
