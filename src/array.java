import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] myarr=new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {

            myarr[i]= sc.nextInt();

        }

        for (int i = 0; i < myarr.length; i++) {
            myarr[i]=(int) Math.pow(myarr[i], 2);

        }

        for (int value :myarr) {
            System.out.println(value);
        }







    }
}
