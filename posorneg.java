import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();

        if(x<0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("the number is positive");
        }

    }
}
