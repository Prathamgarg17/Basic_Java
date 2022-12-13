import java.util.*;
public class Vote {
    public static void voteAge(int age){
        if(age>18){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        voteAge(age);     
    }
    
}
