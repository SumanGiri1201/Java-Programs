import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows\n");
        int rows = in.nextInt();
        System.out.println("Floyd's triangle generated\n");
        int count=1;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count);
                count++;

            }
            System.out.println();
        }

    }
}
