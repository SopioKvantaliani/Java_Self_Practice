package day11_practice_tasks;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;


    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder (){
        System.out.println(name +" is taking order.");
    }

    public void  cleanTable(){
        System.out.println(name+" is cleaning table.");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", " + (fullTime ? "Full-time ": "Part Time") +
                '}';
    }
}
