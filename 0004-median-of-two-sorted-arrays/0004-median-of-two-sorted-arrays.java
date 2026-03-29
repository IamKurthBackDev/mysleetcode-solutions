class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      int[] nums = new int[nums1.length + nums2.length];
      System.arraycopy(nums1, 0, nums, 0, nums1.length);
      System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
    
        Arrays.sort(nums);

        int lengt = nums.length; // length

    if (lengt % 2 == 0)
        return (nums[lengt / 2] + nums[lengt / 2 -1]) / 2.0;

    else 
        return nums[lengt / 2];
    
    }
}