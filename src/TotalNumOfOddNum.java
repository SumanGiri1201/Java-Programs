//Total number of odd numbers between 1 -100

public class TotalNumOfOddNum{
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=100;i++) {
            if (i% 2 != 0) {
                count++;
            }
        }
        System.out.println("Total Number of Odds : "+count);
    }
}
