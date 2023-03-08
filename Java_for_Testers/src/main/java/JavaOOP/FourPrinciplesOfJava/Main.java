package JavaOOP.FourPrinciplesOfJava;

public class Main {
    public static void main(String[] args) {
        Sedan car1 = new Sedan("Toyota", "Corolla", 43, 3000, 4);
        Coupe car2 = new Coupe("Chevrolet", "Comaro", 46, 6000, 2);

        car1.drive(56);
        car2.drive(86);
        car1.forSale(6000);
        car2.forSale(500);
    }
}
