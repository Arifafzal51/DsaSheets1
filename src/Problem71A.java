
import java.util.Scanner;

public class Problem71A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the test cases

        for (int i = 0; i < t; i++) {
            String s = sc.next(); //the inputted string
            int l = s.length();
            if (l > 10) {
                //do some manipulation
                s = s.charAt(0) + "" + (l - 2) + s.charAt(l - 1);
                System.out.println(s);

            } else {

                System.out.println(s);
            }

        }
    }


}