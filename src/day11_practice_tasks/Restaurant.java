package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList <Server> servers;
    public ArrayList <Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>(); //Initialize servers
        chefs = new ArrayList<>();  //Initialize chefs
//        this.servers = new ArrayList<>(); //Initialization can be done in this way too.
//        this.chefs = new ArrayList<>();
    }

    //adding Server object to ArrayList of servers
    public void hireServer (Server server){
        servers.add(server);
    }

    public void hireServer(Server[] servers){
        //this.servers is ArrayList; parameter servers is Array added to ArrayList.
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef (Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef [] chefs){
        //this.servers is ArrayList; parameter servers is Array added to ArrayList.
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int id){
        servers.removeIf(p->p.employeeID==id);
    }

    public void terminateChef (int id){
        chefs.removeIf(p->p.employeeID==id);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
