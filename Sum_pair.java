import java.util.Scanner;

public class Sum_pair{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);

        int x = m.nextInt();

        int n = m.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
            m.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(x==arr[i]+arr[j]){
                    System.out.printf("(%d,%d)\n",arr[i],arr[j]);
                }
            }
        }
    }
}