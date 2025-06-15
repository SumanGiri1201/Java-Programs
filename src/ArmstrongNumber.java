
//find Armstrong number

    public class ArmstrongNumber
    {
        public static void main(String args[]) {
            int n, arg,sum=0, r;
            n=153;
            arg=n;
            while(n>0)
            {
                r=n%10;
                sum=sum+r*r*r;
                n=n/10;
            }
            if(sum==arg)
            {
                System.out.println("It is an Armstrong number" +arg);
            }
            else{
                System.out.println("It is not an Armstrong number"+ arg);
            }

        }
        }

