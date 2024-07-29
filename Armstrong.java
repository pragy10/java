import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = m.nextInt();
        System.out.println("Enter end: ");
        int end = m.nextInt();

        for(int i=start; i<=end;i++){
            int n = i;
            int sum=0;
            while(n>0){
                int d = n%10;
                sum += d*d*d;
                n = n/10;
            }

            if(sum==i){
                System.out.println("Armstrong number = "+i);
            }
        }


    }
}