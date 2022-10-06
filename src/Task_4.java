import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinate X and Y");
        System.out.print("X = ");
        double x = scanner.nextDouble();
        System.out.print("Y = ");
        double y = scanner.nextDouble();

        if (x > 0 && y >0){
            System.out.printf("Point XY(%.2f ; %.2f) is in I quadrant",x ,y);
        }else if (x < 0 && y >0){
            System.out.printf("Point XY(%.2f ; %.2f) is in II quadrant",x ,y);
        }else   if (x < 0 && y < 0){
            System.out.printf("Point XY(%.2f ; %.2f) is in III quadrant",x ,y);
        }else   if (x > 0 && y <0){
            System.out.printf("Point XY(%.2f ; %.2f) is in IV quadrant",x ,y);
        }else System.out.printf("Point XY(%.2f ; %.2f) is in Center of the Cartesian coordinate system",x ,y);



    }
}
