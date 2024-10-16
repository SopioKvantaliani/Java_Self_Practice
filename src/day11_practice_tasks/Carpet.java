package day11_practice_tasks;

public class Carpet {

    public int width;
    public int length;
    public int unitPrice;
    public boolean isPersian;

    public Carpet(int width, int length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calculatePrice() {
        double totalPrice = (width * length) * unitPrice;
        return totalPrice + (isPersian ? 200 : 0);

    }

    public String toString() {
        return "Your "+ (isPersian ? "persian ":" ") +"carpet that is "+width +" x "+length+
                " and a unit price of $"+unitPrice+" costs a total of $"+calculatePrice();
    }
}

/*
2. Create a custom class named Carpet with the following specifications:

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including
   		the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple
    carpet objects, and test each function of the carpet object.

 */