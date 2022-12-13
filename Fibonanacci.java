import java.util.Scanner;

public class Fibonanacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int sum;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(b);
        }
    }
}
