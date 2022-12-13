import java.util.*;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        a= sc.nextInt();
        // while(marks>=90){
            // System.out.println("This is good");
            // }
            //while(marks >= 60 && marks <=89){
                // System.out.println("This is also Good ");
                // }
                // while()
                if(a==0){
                    System.out.println("Stop");
                }
                do{
                    int marks = sc.nextInt();
                    if(marks>=90 && marks<= 100){
                        System.out.println("A+");
                    }
                    else if(marks >= 60 && marks <=89){
                        System.out.println("B ");
                    }
                    else if(marks >= 0 &&  marks<=59 ){
                        System.out.println("C");
                    }
                    else {
                        System.out.println("Invalid");
                    }
           } while(a==1);
        }
    }   
