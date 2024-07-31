import java.util.Scanner;
class Replace{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0,3,"Java");
		System.out.println(sb);
	}
}
