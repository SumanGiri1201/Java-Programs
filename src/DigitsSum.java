// Sum of Digits of a number
public class DigitsSum{
    public static void main(String[] args) {
        int num=251025; int sum=0; int rem=0;   int temp=0;
        temp=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum of digits is "+sum);
    }
}
