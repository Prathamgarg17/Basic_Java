import java.util.*;
public class Radius {
    public static void circumfrence(double r){
        double Circumfrence = 2* (3.14) * r;
        System.out.println(Circumfrence);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumfrence(r);
    }
    
}
