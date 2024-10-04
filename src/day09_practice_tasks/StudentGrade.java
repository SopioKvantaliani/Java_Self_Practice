package day09_practice_tasks;

public class StudentGrade {
    public static void main(String[] args) {
        String [] studentNames = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[studentNames.length];

        for (int i = 0; i < studentNames.length; i++) {
            int eachScore = scores [i];
            char grade = 'F';

            if (eachScore>=90){
                 grade = 'A';
            } else if (eachScore>=80) {
                grade = 'B';
            } else if (eachScore >=70) {
                grade = 'C';
            } else if (eachScore>=60) {
                grade = 'D';
            }

            grades[i] = grade;
            System.out.println(studentNames[i]+"'s score is "+eachScore+" and grade is "+ grades[i]);
        }





    }
}

/*
Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */