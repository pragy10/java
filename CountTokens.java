import java.util.StringTokenizer;
public class CountTokens{
	public static void main(String args[]){
		StringTokenizer st =  new StringTokenizer("Demonstarting methods from string tokenizer class. \nHello i'm learning java prgramming \nHow do you do?"," ");
		System.out.println("Total number of tokens: "+st.countTokens());
	}	
}
