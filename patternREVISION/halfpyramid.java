package patternREVISION;

public class halfpyramid {
    public static void main(String[] args) {
    
    int n=6;
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i-1;j++)
        {
            System.out.print(j+"");
        }
        System.out.println();
    }
}
}
