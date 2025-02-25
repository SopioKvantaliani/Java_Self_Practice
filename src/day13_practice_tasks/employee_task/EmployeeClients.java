package day13_practice_tasks.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Driver driver = new Driver("John", 20, "CYDEO", "123", "Driver", 90000);
        Developer developer = new Developer("Peter", 50, "Amazon", "123", "Developer", 200000, "Java");
        Teacher teacher = new Teacher("Kate", 30, "MH School", "123", "Teacher", 120000);
        Tester tester = new Tester("Sophie", 50, "CYDEO", "2345", "Tester", 150000);
        Employee employee = new Employee("Levan", 46, "TruckService",  "12345", "Truck Service Director", 200000 );




        System.out.println(driver);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(employee);

        driver.work();
        developer.work();
        teacher.work();
        tester.work();
        employee.work();
        driver.eat();
        developer.eat();
        teacher.sleep();

    }
}
