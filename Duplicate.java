import java.util.*;

public class Duplicate{

    public static void main(String args[]){

        Scanner m = new Scanner(System.in);

        String txt = m.nextLine();

        char[] arr = new char[txt.length()];

        for(int i =0;i<txt.length();i++){
            arr[i] = txt.charAt(i);
        }

        int[] array = new int[256];
        for (int i=0;i<array.length;i++) {
            array[i] = 0;
        }

        for(int i=0;i<txt.length(); i++){
            for(int j=i+1;j<txt.length();j++){
                if(arr[i]==arr[j] && array[arr[i]]==0){
                    System.out.println(arr[i]);
                    array[arr[i]] = 1;
                    break;
                }
            }
        }
    }
}