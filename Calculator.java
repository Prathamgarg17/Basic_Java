import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b= sc.nextInt();
        int operator = sc.nextInt();
        switch(operator){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b==0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5: if(b==0){
                 System.out.println("Invalid division");
            }else{
                System.out.println(a%b);
            }
            break;
            default: System.out.println(" Invalid opertor");
        }

    }
}
