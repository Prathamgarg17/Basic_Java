
import java.util.Scanner;

public class EvenAndOdd{

	private Scanner input;
	private boolean isOdd;
	
	public EvenAndOdd() {
		input = new Scanner(System.in);
	}


	
	/*
	//Approach # 01
	public boolean isOdd(int i) {
		isOdd = false;
		
		i = input.nextInt();

		for(int value = 1; value < i; i++) {
			isOdd = !isOdd;  //t-f-t-f-t-f-t-f-t
		}
		
		//System.out.println(isOdd);
		return isOdd;

	}
	*/
	
	

	
	
	//Approach # 02
	public boolean isOdd(int i) {
		isOdd = false;
		
		i = input.nextInt();

		while(true) {
			i = i - 2;
			
			if(i == 2) {
				isOdd = false;
				break;
			}else if (i == 1) {
				isOdd= true;
				break;
			}
		}
		
		return isOdd;

	}
	public static void main(String[] args) {

		int i = 0;
		boolean result = false;
		
		EvenAndOdd obj = new EvenAndOdd();
		
		if(result == obj.isOdd(i)) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}
}