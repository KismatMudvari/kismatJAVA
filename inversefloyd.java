public class inversefloyd {
    public static void main(String[] args) {
        int n=5;
        int num=1;

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.err.print(num +"   ");
                num++;
            }
            System.out.println();
        }
    }
}
