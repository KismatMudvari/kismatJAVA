import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("what do you want to order:");
        System.out.println("Coffee");
        System.out.println("Red Bull");
        System.out.println("Beer");
        System.out.println("Hard drinks");
        
            int order = sc.nextInt();

            switch (order) {
                case 1:
                    System.out.println("Coffee");
                    break;
                case 2:
                    System.out.println("Red bull");
                    break; 
                case 3:
                    System.out.println("Beer");
                    break; 
                case 4:
                    System.out.println("Hard Drinks");
                    break;
            
                default:
                System.out.println("These are the only beberages available");
                    break;
            }
            sc.close();

    }
    
}
