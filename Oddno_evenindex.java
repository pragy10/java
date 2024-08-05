import java.util.Scanner;

public class Oddno_evenindex{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
            m.nextLine();
        }

        for(int i=0;i<n;i++){
            if(i%2==0 && arr[i]%2!=0){
                System.out.printf("%d ",arr[i]);
            }
        }  

    }
}