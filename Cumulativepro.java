import java.util.Scanner;

public class Cumulativepro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int previous =1;
        while(true){
            int current = sc.nextInt();
            if(current==1){
                break;
            }
            current= current*previous;
            System.out.println(current);
            previous= current;
        }
    }
    
}
