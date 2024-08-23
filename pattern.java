import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>0; i--){

            for(int j=n; j>=i ; j--){

                System.out.print(j);








            }
            for(int m=i; m>0; m--){
                System.out.print(m);
            }

            System.out.println();
        }


    }
}
