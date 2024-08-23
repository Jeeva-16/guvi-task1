import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value");
        int n = sc.nextInt();
        System.out.println("Enter the max value");
        int m = sc.nextInt();

        for(int i=n; i<=m; i++){
            System.out.println(i);
        }

    }
}
