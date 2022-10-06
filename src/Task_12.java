import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter six-digit number : ");
        int num = scanner.nextInt();
        int first , sec, third, four, fift, six;
        first = num/100000;
        sec = num/10000%10;
        third = num/1000%10;
        four = num/100%10;
        fift = num/10%10;
        six = num%10;
        if ( first+sec+third == four + fift + six){
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
