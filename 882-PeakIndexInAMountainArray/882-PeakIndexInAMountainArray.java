// Last updated: 28/08/2025, 15:45:25
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0; int right = arr.length - 1;

        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] < arr[mid+1]) left = mid + 1;
            else right = mid;
        } 

        return left;
    }
}