import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Petya,Vasya,Tonya;
        int count=0;
        int n=sc.nextInt();

        while (n-->=1){
            Petya= sc.nextInt();
            Vasya= sc.nextInt();
            Tonya=sc.nextInt();
           int sol= Petya+Vasya+Tonya ;
            if(sol>=2) {
                count++;
            }
        }
        System.out.println(count);

    }
}
