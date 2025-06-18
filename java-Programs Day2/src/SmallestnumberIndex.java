public class SmallestnumberIndex {
    public static void main(String[] args) {
        int a[]=new int []{5,10,1,20,25};
        int min=a[0];
        int index=0;
        for(int i=1;i<a.length;i++) {
            if (min>a[i]) {
                min = a[i];
                index = i;
            }
        }
        System.out.println("Array of smallest number index is:"+index);
            }
        }

