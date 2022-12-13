import java.util.*;
public class Sum {
    public static void sumOddno( int n ){
    int Sum=0;
        for(int i =0;i<n;i++){
        if(i%2!=0){
        Sum = Sum + i;
        System.out.println(Sum);
        }
    }
}
    
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sumOddno(n);

    }

}
