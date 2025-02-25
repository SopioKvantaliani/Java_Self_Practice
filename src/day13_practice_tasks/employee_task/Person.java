package day13_practice_tasks.employee_task;

public abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void eat (){
        System.out.println(name + " is eating");
    }

    public void sleep (){
        System.out.println(name + " is sleeping");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }

    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
