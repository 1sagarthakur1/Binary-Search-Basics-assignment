//https://leetcode.com/problems/find-peak-element/submissions/1655282135/

public class FindPeakElement {
    public static void main(String[] args) {

        int[] nums =  {1,2,3,1};
        FindPeakElement findPeakElement = new FindPeakElement();
        System.out.println(findPeakElement.findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] < nums[mid+1]){
                left=mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}