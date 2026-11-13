import java.util.Scanner;
public class IT26102578Lab08Q4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int[] studentId = new int[8];
		int count = 0;
		
		for( int i = 1; i <= 8; i++){
			
			System.out.print("Enter the Student ID : ");
			int id = input.nextInt();
			
			if (id > 0){
				studentId[i] = id;
			}else{
				System.out.println("Error , Please enter positive numbers only ");
				i--;
			}
				
		}
		
		System.out.print("\nEnter a Student ID to Search : ");
		int searchID = input.nextInt();
		
		boolean found = false;
		
		for(int i = 0; i < studentId.length; i++){
			if (studentId[i] == searchID){
				found = true;
				break;
			}
		}
		
		if(found){
			System.out.println("Student is Available");
		}else{
			System.out.println("Student is Not Available");
		}
	}
	
}
		
		
		
		
			
		