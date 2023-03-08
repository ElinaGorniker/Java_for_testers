package JavaOOP.FourPrinciplesOfJava;

public class Sedan extends Car{
    public Sedan(String make, String model,double miles, int price, int doors) {
        super(make, model);
        this.miles = miles;
        this.price = price;
        this.doors = doors;
    }
}
