package day13_practice_tasks.employee_task;

public class Employee extends Person{
    private String employeeId, jobTitle, companyName;
    private double salary;

    public Employee(String name, int age, String companyName, String employeeId, String jobTitle, double salary) {
        super(name, age);
        this.companyName = companyName;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }



    public void work (){
        System.out.println(getJobTitle()+" " + getName());
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>0){
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        //calling parent class toString method and adding new part.
        return super.toString().replace("}", "")+
                ", companyName='" + companyName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
