//https://leetcode.com/problems/first-bad-version/submissions/1655278907/


//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int low = 1;
//        int high = n;
//        while(low<high){
//            int mid = low+(high-low)/2;
//            if(isBadVersion(mid)){
//                high = mid;
//            }else {
//                low = mid+1;
//            }
//        }
//        return low;
//    }
//}
