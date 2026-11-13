import java.util.Scanner;
public class IT26102578Lab08Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int[] D = new int[6];		
		int count = 0;
		int max;
		
		while (count < 6){
			System.out.print("Enter a Positive Number (" + (count + 1) + "/6):");
			int num = input.nextInt();
			
			if (num > 0){
				numbers[count] = num;
				count++;
				
			}else{
				System.out.println("Error, Please Enter Positive Numbers only ");
			}
		}
		
		max = numbers[0];
		
		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] > max){
				max = numbers[i];
			}
		}
		
		System.out.println("\nMaximum Number = " + max);
		
	}
	
}

		