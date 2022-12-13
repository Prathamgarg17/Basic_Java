import java.util.*;

public class Searcharr {
    public static void main(String[] args){
     Scanner sc =  new Scanner(System.in);
     System.out.print(" Enter no of row index: ");
     int row = sc.nextInt();
     System.out.print(" Enter no of column index: ");

     int col = sc.nextInt();
     int[][] arr = new int[row][col];
     System.out.println(" Enter a 2D array: ");
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("2D Array: ");
    for( int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.print(" Search no: ");
    int x=sc.nextInt();
        for( int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==x){
                System.out.print(" Indices: " + i + " " + j);
            }
         }
      }
    }
 }
