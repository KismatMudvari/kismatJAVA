import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the value of a:");
            int a= sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();
            System.out.println("Enter the value of c:");
            int c = sc.nextInt();

            // let user choose their desired operation
             System.out.println("Choose your operation");
             System.out.println("1.Add(+)");
             System.out.println("2.subtrcation(-)");
             System.out.println("3.Multiply(*)");
             System.out.println("4.Divide(/)");
             System.out.println("5.Modulo(%)");
                int choice=sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The result of addition is:"+(a+b+c));
                        break;

                    case 2:
                        System.out.println("The result of subtrcation is :"+ (a-b-c));
                        break;

                    case 3:
                        System.out.println("The result of Multiply is:"+ (a*b*c));
                        break;

                    case 4:
                        if (b != 0 || c!=0) {
                            System.out.println("The result of division is: " + (a / b / c));
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;

                    case 5:
                        if (b != 0 || c!=0) {
                            System.out.println("The result of modulo is: " + (a % b% c));
                        } else {
                            System.out.println("Modulo by zero is not allowed.");
                        }
                        break;

                    default:
                    System.out.println("Please enter the number from from 1 to 5 only.");
                        break;
                }
            
            }
}
