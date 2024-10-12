package day11_practice_tasks;

public class RestaurantClient {
    public static void main(String[] args) {

        Server [] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabryne", 28, 10, false),
                new Server("Karim", 27, 20, true),
                new Server("Aysel", 25, 18, true),
                new Server("Kamal", 19, 20, false),
        };

        Chef [] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 25, 26, true),
                new Chef("Bojan", 35, 21, true),
        };

        Restaurant restaurant = new Restaurant("Mohdi", "Mclean", 5);
        System.out.println(restaurant);

        System.out.println("\n-----------------Hire Servers and Chefs----------------");
        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        System.out.println(restaurant);

        System.out.println("\n-----------------Print Servers and Chefs----------------");

        System.out.println(restaurant.servers);
        System.out.println(restaurant.chefs);

        System.out.println("\n-----------------Hire One more Server and Chef----------------");
        restaurant.hireServer(new Server("Mona", 30, 20, true));
        restaurant.hireChef(new Chef("Alex", 44, 50, true ));
        System.out.println(restaurant.servers);
        System.out.println(restaurant.chefs);
        System.out.println(restaurant);

        System.out.println("\n-----------------Terminate Chef and Server and Print updated list----------------");
        restaurant.terminateChef(23);
        restaurant.terminateServer(28);
        System.out.println(restaurant.servers);
        System.out.println(restaurant.chefs);
        System.out.println("\n-----------------Print updated Restaurant Object----------------");
        System.out.println(restaurant);
        System.out.println("\n-----------------Servers' Names and IDs----------------");
        for (Server server : servers) {
            System.out.println(server.employeeID +" - "+ server.name);
        }
        System.out.println("\n-----------------Chefs' Names and IDs----------------");

        for (Chef chef : chefs){
            System.out.println(chef.employeeID +" - "+ chef.name);

        }
    }
}
