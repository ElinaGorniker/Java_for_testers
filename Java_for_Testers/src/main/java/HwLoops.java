public class HwLoops {
    public static void main(String[] args) {
        for (int i=50; i>=0; i=i-5) {
            System.out.println(i);
        }
        String str = "Hello world!";
        String newStr = "";
        //int length = str.length();
        int index = 0;

        while (index < str.length()) {
            char x = str.charAt(index);
            if (x == 'o') {
                newStr = newStr + 0;
            } else {
                newStr = newStr + x;
            }
            index++;
        }
        System.out.println(newStr);

    }
}
