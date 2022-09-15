import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count=0;
         int[] arr=new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {

            arr[i]= sc.nextInt();
            if(arr[i]>k){
                count++;
            }

        }
        System.out.println(count);
    }
}
