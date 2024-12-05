import java.util.Scanner;
public class tablenew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        //output
        System.out.println("The table of"+a );
        for(int i=1;i<=10;i++){
            System.out.println(a*i);
        }
    }
}
