import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();





        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("input target");
        int target= sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==target) {System.out.println("found at "+ i + ","+ j +"");}

                else System.out.println("not found");



            }
            System.out.println();

        }



    }
}


