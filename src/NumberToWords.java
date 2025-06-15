//convert Number into words
public class NumberToWords {
    public void pw(int n, String ch) {
        String one[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "Seventeen", "eighteen", "nineteen" };
        String ten[] = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seenty", "eighty", "ninety" };
        if (n > 19) {
            System.out.println(ten[n / 10] + " " + one[n % 10]);
        } else {
            System.out.println(n);
        }
        if(n>0)
        {
            System.out.println(ch);
        }
    }
        public static void main(String args[]){
        int n=28;
            System.out.println(n);
            if(n<=0)
            {
                System.out.println("Enter number greater than zero");
            }

    }
}

