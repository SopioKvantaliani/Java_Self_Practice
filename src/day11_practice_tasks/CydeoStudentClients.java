package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Sopio", 39, 11239000, 2, "B37", "Group5");
        System.out.println(cydeoStudent1);
        cydeoStudent1.study();
        cydeoStudent1.attendClass();
        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolName();

        System.out.println("------------------------");

        CydeoStudent cydeoStudent2 = new CydeoStudent("Josh", 30, 12322345, 2, "B27", "Group2");
        System.out.println(cydeoStudent2);
        cydeoStudent2.study();
        cydeoStudent2.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();




    }
}
