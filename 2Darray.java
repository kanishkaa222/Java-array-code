import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
int row = sc.nextInt();
int coloumn = sc.nextInt();
int[][] numbers = new int[row][coloumn];
//input 
//rows
for(int i=0; i<row; i++){
	//coloums
	for(int j=0; j<coloumn; j++){
	numbers[i][j] = sc.nextInt();
	}
}
System.out.println("matrix");

	//output
	for(int i=0; i<row; i++){
	for(int j=0; j<coloumn; j++){
	System.out.print(numbers[i][j] +"  ");
	}
	System.out.println();
	}
	
	//search element
	int x = sc.nextInt();
	for(int i=0; i<row; i++){
	for(int j=0; j<coloumn; j++){
	
if(numbers[i][j] == x){
	System.out.println("x found at  (" + i + " , "+ j + ") ");
	
	}
	}	
}
			}
}