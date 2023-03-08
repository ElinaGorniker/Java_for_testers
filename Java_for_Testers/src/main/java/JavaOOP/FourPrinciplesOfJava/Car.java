package JavaOOP.FourPrinciplesOfJava;

public class Car {
    String make;
    String model;
    Double miles;
    int price;
    int doors;

    public void drive(int way) {
        miles = miles + way;
        System.out.println(miles);
    }
    public Car (String make, String model) {
        this.make = make;
        this.model = model;
        }

    public void forSale (int newPrice) {
        price = newPrice;
        System.out.println("Car Info: " + make + " " + model + " " + miles + " "+ price + " " + doors);
            }
}
