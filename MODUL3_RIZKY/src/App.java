import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculation cal = new Calculation();
        boolean repeat = true;
        do{
            try {
                System.out.println("===  MENU CALCULATOR  ===\n1. Square\n2. Circle\n3. Trapezoid");
                System.out.print("Select Menu : ");
                int inputMenu = scan.nextInt();
                switch (inputMenu){
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = scan.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println();
                        System.out.println("The Calculation result : " + cal.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double radi = scan.nextDouble();
                        cal.setCircle(radi);
                        cal.run();
                        System.out.println("The Calculation result : " + cal.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of the trapezoid : ");
                        double base = scan.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double upper = scan.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double height = scan.nextDouble();
                        cal.setTrapezoid(base,upper,height);
                        cal.run();
                        System.out.println("The Calculation result : " + cal.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program END");
                    default:
                        System.out.println("Option not Available!!");
                        continue;
                }
                repeat = false;

            }catch (InputMismatchException e){
                System.out.println("Error : Input must be a number !! ");
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }while (repeat);
    }
}
