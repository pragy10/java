import java.util.StringTokenizer;
public class Delim_st{
	public static void main(String args[]){
		StringTokenizer st =  new StringTokenizer("my,name,is,khan");
		System.out.println("Next token is: "+st.nextToken(","));
	}
}
