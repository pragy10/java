import java.util.Scanner;
import java.util.StringTokenizer;
public class Array_basics{
	public static void main(String args[]){
		
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = m.nextInt();
		}
		
		System.out.println("Array:");
		for(int i=0;i<n;i++){
			System.out.printf("%d ",arr[i]);
		}
		
	}	
}
