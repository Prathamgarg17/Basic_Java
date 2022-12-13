import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int previous = 0;
        while(true)
        {
            int current= sc.nextInt();
            if(current==0)
            {break;}
            current = current+ previous;
            System.out.println(current);
            previous= current;
        }

    }
}
