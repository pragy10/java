import java.util.*;

public class Anagrams{
    public static void main(String args[]){

        Scanner m = new Scanner(System.in);

        String txt1 = m.nextLine();
        String txt2 = m.nextLine(); 

        int n1 = txt1.length();
        int n2 = txt2.length();

        char[] arr1 = new char[n1];
        char[] arr2 = new char[n2];


        for(int i=0;i<n1;i++){
            arr1[i] = txt1.charAt(i);
        }  

        for(int i=0;i<n2;i++){
            arr2[i] = txt2.charAt(i);
        }  

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int flag = 1;
        for(int i=0;i<n1;i++){
            if(arr1[i]!=arr2[i]){
                flag = 0;
            }
        }

        if(flag==0){
            System.out.println("Not anagrams");
        }
        else{
            System.out.println("Anagrams");
        }

    }
}