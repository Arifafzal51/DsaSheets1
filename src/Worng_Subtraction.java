import java.util.Scanner;

public class Worng_Subtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int steps=sc.nextInt();

        int i=0;
        while(i!=steps){
            long once=num%10;
            if(once==0){
                num=num/10;
            }
            else{
                num=num-1;

            }
            i++;
        }
        System.out.println(num);
    }
}
