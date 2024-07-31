import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
	public int roll_no;
	public String name;
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class Constructor_array{
	public static void main(String args[]){
	
		Student[] arr = new Student[5];
		
		arr[0] = new Student(1,"A");
		arr[1] = new Student(2,"B");
		arr[2] = new Student(3,"C");
		arr[3] = new Student(4,"D");
		arr[4] = new Student(5,"E");
		
		for(int i=0;i<5;i++){
			System.out.println("The name of student is "+arr[i].name+" and roll no is "+arr[i].roll_no);
		}
	}	
}

