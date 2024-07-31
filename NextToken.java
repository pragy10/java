import java.util.StringTokenizer;
public class NextToken{
	public static void main(String args[]){
		StringTokenizer st =  new StringTokenizer("my name is k han"," ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
