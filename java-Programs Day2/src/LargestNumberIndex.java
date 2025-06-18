// index of the largest number in an array

public class LargestNumberIndex {
    public static void main(String[] args) {
        int a[]=new int[] {11,12,13,14,15,16};
        {
            int max=a[0];
            int index=a[0];
            for(int i=0;i<a.length;i++) {
                if (max < a[i]) {
                    max = a[i];
                    index = i;
                }
            }
            System.out.println("Index Position of max value in array is "+index);

                }
            }
        }

