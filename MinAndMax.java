import java.util.Scanner;

public class MinAndMax {
        public int max(int [] array) {
           int max = 0;
           
           for(int i=0; i<array.length; i++ ) {
               if(array[i]>max) {
                   max = array[i];
                }
            }
            return max;
        }
            public int min(int [] array){
            int min =array[0];
              for(int i =0; i<array.length;i++ ){
              if(array[i]<min){
                min = array[i];
              }
           }
           return min;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
           int[] myArray = new int[n];
           for(int i=0;i<n;i++){
              myArray[i]= sc.nextInt();
           }
           MinAndMax m = new MinAndMax();
           System.out.println("Maximum value in the array is::"+m.max(myArray));
           System.out.println("Minimum value in the array is::"+m.min(myArray));
        }
    }
