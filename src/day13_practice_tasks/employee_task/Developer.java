package day13_practice_tasks.employee_task;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int age, String companyName, String employeeId, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, companyName, employeeId, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work (){
        System.out.println(getJobTitle() +  " is coding in "+ programmingLanguage);
    }

}
