import java.util.Scanner;
public class Pattern{
  public static void main(String[] args) {
    
    Scanner m = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = m.nextInt();

    for (int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if (i==0 || i==n-1|| j==0 || j==n-1){
          System.out.print("*"+" ");
        }
        else{
          System.out.print(" "+ " ");
        }
      }
      System.out.println();
    }
  }
}