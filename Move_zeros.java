import java.util.Scanner;

public class Move_zeros{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
            m.nextLine();
        }

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            }
        }

        while(j<n){
            arr[j++] = 0;
        }

        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }

    }
}