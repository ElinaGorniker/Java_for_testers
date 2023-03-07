public class MyArray {
    public static void main(String[] args) {
        String[] students = {"Harry", "Ron", "Hermione"};
        int[] numbers = {1, 2, 3};
        System.out.println(students[0]);
        System.out.println("There are " + students.length + " in the class");
        for (int i=0; i< students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
