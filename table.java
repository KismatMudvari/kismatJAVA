import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
       
        System.out.println("HERE`s the table of:"+ n);
        for (int i=1; i<=100; i ++){
          System.out.println(n*i);
        }
        
    }
}
