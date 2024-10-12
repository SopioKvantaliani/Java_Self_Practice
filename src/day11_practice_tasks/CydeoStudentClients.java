package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Sopio", 39, 11239000, 2, "B37", "Group5");
        System.out.println(cydeoStudent1);
        cydeoStudent1.study();
        cydeoStudent1.attendClass();
        cydeoStudent1.printSchoolName();
        cydeoStudent1.printProgLanguage();

        CydeoStudent cydeoStudent2 = new CydeoStudent("Josh", 30, 12322345, 2, "B27", "Group2");
        cydeoStudent2.printProgLanguage();



    }
}
