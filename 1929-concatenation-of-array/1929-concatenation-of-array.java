class Solution {
    public int[] getConcatenation(int[] nums) {
        int newLength = nums.length * 2;
        int[] res = new int[newLength];
        
        for(int i = 0 ; i<nums.length; i++) {
            res[i] = nums[i];
        }
        
        int j = 0;
        for(int i= nums.length  ; i < newLength; i++) {
            res[i] = nums[j];
            j++;
        }
        return res;
    }
}