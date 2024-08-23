import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        float n = sc.nextInt();
        float a = (n*90)/100;
        float b = (n*80)/100;

        if(n<500){
            System.out.println("No Discount");
        }
        else if((n>=500) && (n<1000)){
            System.out.println("The discount amount is "+a);
        }
        else if(n>=1000){
            System.out.println("The discount amoutnt is "+b);
        }
    }
}
