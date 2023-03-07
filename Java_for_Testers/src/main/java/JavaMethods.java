public class JavaMethods {
    public static void main(String[] args) {
 helloName("Elly");
 getSum(2,3);
 printNameAndAge("Elly", 38);
 int square = squareOfNumber(2);
System.out.println(square);
    }
    private static void helloName(String name) {
        System.out.println(name);
    }
    private static void getSum (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    private static void printNameAndAge (String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }
    private static int squareOfNumber (int number) {
        int square = number*number;
        //ystem.out.println("Square of the number " + number + " is " + square);
        return square;
    }
}
