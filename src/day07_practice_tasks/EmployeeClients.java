package day07_practice_tasks;

import javax.xml.namespace.QName;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee(); //unique object1
        Employee employee2 = new Employee();//unique object1
        Employee employee3 = new Employee();//unique object1

        String a = "Mustafa"; //Object, String literal;
        String b = "Mustafa";


        employee3.name = "Mustafa";
        employee3.age = 38;
        employee3.gender = 'M';
        employee3.jobTitle = "SDET";
        employee3.salary = 150_000;
        employee3.work();

        employee1.name = "Sopio";
        employee1.age = 20;
        employee1.gender = 'f';
        employee1.jobTitle = "SDET";
        employee1.salary = 150_000;
        employee1.work();

        employee2.name = "Levan";
        employee2.age = 26;
        employee2.gender = 'm';
        employee2.salary = 140_000;
        employee2.jobTitle = "Financial Consultant";

        System.out.println(employee1.name +": "+employee1);
        System.out.println(employee2.name + ": "+employee2);

        employee2 = employee1;
        System.out.println(employee2);
        employee2.work();
    }
}
