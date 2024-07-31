import java.util.StringTokenizer;
public class HasMoreTokens{
	public static void main(String args[]){
		StringTokenizer st =  new StringTokenizer("Demonstarting methods from string tokenizer class. \nHello i'm learning java prgramming \nHow do you do?"," ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}	
}
