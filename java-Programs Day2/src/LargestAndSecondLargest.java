public class LargestAndSecondLargest {
    public static void main(String[] args) {
        int nums[] = {5,34,78,2,45,88,99};
        int maxOne=0;
        int maxTwo=0;
        for(int i=0; i<nums.length; i++) {
            if(maxOne < nums[i]) {
                maxTwo = maxOne;
                maxOne = nums[i];
            }
            else if(maxTwo < nums[i]) {
                maxTwo = nums[i];

            }
        }
        System.out.println("Lagest Number "+ maxOne);
        System.out.println("Sexond Lagest Number "+ maxTwo);
    }
}
