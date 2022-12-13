import java.util.Scanner;

public class Searchno {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter no: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(" Find: ");
        int x= sc.nextInt();
        for(int i=0;i<n;i++){
          if(arr[i]==x){
            System.out.println("index: " + i);
          }
        }
    }
}
