import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
       /*  String fullName = firstName + " "+ lastName;
        System.out.println(fullName.length());
         
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }*/
        if(firstName.compareTo(lastName)==0){
            System.out.println("equal");

        }
        else{
            System.out.println(" not equal");
        }
    }
}
