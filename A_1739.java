
import java.util.Scanner;

public class A_1739 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println((n/2+1)+" "+(m/2+1));
        }
    }
}
