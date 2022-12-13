import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || j == m){
                    System.out.print(i+j-1+" "+" ");
                }
                else if(j==1){
                    System.out.print(3*n+(n-3)-(i-1)+" ");
                }
                else if(i==n){
                    System.out.print(2*n+(n-2)-(j-1)+" ");
                }else{
                   System.out.print(" "+" "+" ");
                }
          }
          System.out.println();
        }

    }

}
