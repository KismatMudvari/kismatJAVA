public class busy {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1;i<=n-i;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}