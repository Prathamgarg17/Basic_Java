import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Stop");
        }
        while(n==1){
            int marks = sc.nextInt();
            if(marks>=90 && marks<= 100){
                System.out.println("A+");
            }
            else if(marks >= 80 && marks <=89){
                System.out.println("A ");
            }
            else if(marks >= 60 && marks <=79){
                System.out.println("B ");
            }
            else if(marks >= 0 &&  marks<=59 ){
                System.out.println("C");
            }
            else {
                System.out.println("Invalid");
            }
     }
  }
    
}
