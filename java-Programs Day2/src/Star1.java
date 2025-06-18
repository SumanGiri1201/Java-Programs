// Different Star patterns

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        int i,j,t;
        System.out.println("How many rows you want");
        Scanner in = new Scanner(System.in);
        t= in.nextInt();
        for(j=1;j<=t;j++){
            for(i=t-1;i>=j;i--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
