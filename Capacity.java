import java.util.Scanner;
class Capacity{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favourite langauge.");
		System.out.println(sb.capacity());
	}
}
