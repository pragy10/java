import java.util.Scanner;
public class Calc{
	public static void main(String args[]){
	
		int ans;
        Scanner myObj = new Scanner(System.in);
		do {
			System.out.println("Enter 1st number: ");
			double num1 = myObj.nextDouble();

			System.out.println("Enter 2nd number: ");
			double num2 = myObj.nextDouble();

			System.out.println("Enter operator from +, -, *, /, %: ");
			char op = myObj.next().charAt(0);
		
			switch(op){
				case '+':
				System.out.println(num1+num2);
				break;
			
				case '-':
				System.out.println(num1-num2);
				break;
			
				case '*':
				System.out.println(num1*num2);
				break;
			
				case '/':
				System.out.println(num1/num2);
				break;
			
				case '%':
				System.out.println(num1%num2);
				break;
                
			}
			
			System.out.println("Do you want to use Calc? 1 for yes/0 for no");
			ans = myObj.nextInt();
		}
		
		while (ans==1);
	}
}
