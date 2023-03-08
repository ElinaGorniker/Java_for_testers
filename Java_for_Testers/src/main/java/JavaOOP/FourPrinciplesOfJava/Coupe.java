package JavaOOP.FourPrinciplesOfJava;

public class Coupe extends Car {
    public Coupe(String make, String model,double miles, int price, int doors) {
        super(make, model);
        this.miles = miles;
        this.price = price;
        this.doors = doors;
    }
}
