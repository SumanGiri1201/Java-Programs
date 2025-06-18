import java.util.Scanner;

public class PatternPyramidNumber {
    public static void main(String[] args) {
        int i,j,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row value n");
        n = in.nextInt();
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(" " +j);
            }
            System.out.println();
        }

    }
}
