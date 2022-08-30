import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 0;
        int count=0;
         int arr[]=new int[k];

        for (int i = 0; i < k; i++) {

            arr[i]= sc.nextInt();
            if(arr[i]>k){
                count++;
            }

        }
        System.out.println(count);
    }
}
