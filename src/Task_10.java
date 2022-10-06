import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n , m , ent;
        System.out.print("Enter apartment number: ");
        n = scanner.nextInt();
        System.out.println("How many apartment on floor?: ");
        m = scanner.nextInt() * 9;
        if ( n%m == 0 )  {
            ent = n / m;
            System.out.printf("Apartment number %d located in the %d entrance",n,ent);
        }else { ent = n / m + 1;
        System.out.printf("Apartment number %d located in the %d entrance",n,ent);}


    }
}
