//Print Armstrong Numbers from 1-1000
public class ArmsstrongNumbers {
    public static void main(String[] args) {
        int num,rem,limit=1000,sum=0;
        System.out.println("Armstrong Numbers from 1-1000");
        for(int i=1;i<=1000;i++) {
            num = i;
        while(num>0)
        {
            rem = num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==i)
        {
            System.out.print(i+ " ");
        }

        sum=0;
        }
    }
}
