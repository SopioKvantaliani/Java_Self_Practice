package day11_practice_tasks;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this(name);
        this.age = age;
    }

    public Employee(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }

    public Employee(String name, int age, char gender, String jobTitle) {
        this(name, age, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this(name, age, gender, jobTitle    );
        this.salary = salary;
    }

    public void setJobTitle (){
        System.out.println(name +" is working. His jobtitle is "+jobTitle);
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
3. Create a custom class named Employee with the following specifications:

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */
