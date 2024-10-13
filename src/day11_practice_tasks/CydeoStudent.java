package day11_practice_tasks;

public class CydeoStudent {

    public String name;
    public int age;
    public int id;
    public int grade;
    public String batchNumber;
    public String groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
    }


    public CydeoStudent(String name, int age, int id, int grade, String batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study (){
        System.out.println(name + " is studying.");
    }

    public void attendClass(){
        System.out.println(name +" is attending the class.");
    }

    //as the attribute is static, better to do the static method
    public static void printSchoolName (){
        System.out.println("School name is -  "+schoolName);
    }

    //as the attribute is static, better to do the static method
    public static void printProgLanguage(){
        System.out.println("Name of the programming language - " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}

/*
4. Create a custom class named CydeoStudent with the following specifications:

	Actions:
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.

 */