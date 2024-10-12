package day11_practice_tasks;

public class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void makeOrder (){
        System.out.println(name+" is making order");
    }

    public void washDishes (){
        System.out.println(name+" is washing dishes");
    }


    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                "," + (isFullTime? "fullTime" : "PartTime")+
                '}';
    }
}
