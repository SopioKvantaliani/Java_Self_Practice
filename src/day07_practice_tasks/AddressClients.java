package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {

        Address address = new Address();

        address.buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.state = "VA";
        address.zipCode = "22012";
        System.out.println(address);

        Address officeAddress = new Address();
        officeAddress.buildingNumber = 1292;
        officeAddress.street = "Circle Road";
        officeAddress.city = "McLean";
        officeAddress.state = "VA";
        officeAddress.zipCode = "22113344";

        System.out.println(officeAddress);


    }
}
