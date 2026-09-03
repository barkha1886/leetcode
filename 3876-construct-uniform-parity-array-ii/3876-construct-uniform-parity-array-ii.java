class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);

        boolean hasOdd = false;
        for(int num:nums1){
            if(num%2 != 0){
                hasOdd = true;
                break;
            }
        }
        if(nums1[0] % 2 == 0 && hasOdd){
            return false;
        }
        return true;
    }
}