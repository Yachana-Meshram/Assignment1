public class Vehicle {
    float price;
    String color;
    String model;

    Vehicle(float p, String c, String m) {
        price = p;
        color = c;
        model = m;
    }

   int display() {
        System.out.println(" Vehicle price: " + price);
        System.out.println("Vehicle Color is : " + color);
        System.out.println("Vehicle model:" + model);
        return "\n" ;
    }


    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(100000, "Black", "XLS");
        Vehicle v2 = new Vehicle(200000, "RED", "C3");
System.out.println("Vehicle 1");
System.out.println( v1.display());
System.out.println("Vehicle 2");
        System.out.println(v2.display());

    }
}