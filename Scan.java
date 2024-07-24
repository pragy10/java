import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.println("Enter username: ");
        userName = myObj.nextLine();
        System.out.println("Hello " + userName);
    }
}
