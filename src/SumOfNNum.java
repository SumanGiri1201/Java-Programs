// Sum of first n numbers
public class SumOfNNum {
    public static void main(String[] args) {
        int sum = 0;
        int n=10;
        for (int i=1; i<=n; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of First N Numbers are:" +sum);
    }
}
