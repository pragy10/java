import java.util.Scanner;
public class LCM{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = m.nextInt();
        System.out.println("Enter b: ");
        int b = m.nextInt();

        int max=0;
        if(a>b){
            max=a;
        }
        else if(b>a){
            max=b;
        }

        while(true){
            if((max%a==0)&&(max%b==0)){
                System.out.println("LCM = "+max);
                break;
            }
            max++;
        }
    }
}