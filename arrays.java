import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int size = sc.nextInt();

int numbers[] = new int[size];

for(int i=0; i<size; i++){
	numbers[i] = sc.nextInt();
}
 
  
 int x = sc.nextInt();
 
 for (int i =0; i<numbers.length; i++){
 	
 	if(numbers[i] == x){
 		System.out.println("x found at location =" + i );
 	}
 	
 	int max = Integer.MIN_VALUE;
 	int min = Integer.MAX_VALUE;
 	
 	for (int j = 0; j<numbers.length; j++){
 		if(numbers[j] < min)
 		{
 		min = numbers[j];
 		}
 		if(numbers[j] > max)
 		{ 
 		max = numbers[j];
 		}
 	}
 	System.out.println("Largest number is : " + max);
 	
 	System.out.println("Smallest number is : " + min);
 }
 
	}

}