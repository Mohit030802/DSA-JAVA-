/* https://leetcode.com/problems/concatenation-of-array/ */
class Solution {
    public int[] getConcatenation(int[] nums) {
    int n= nums.length;
    int[] arr=new int[2*n];
    for (int i=0;i< nums.length;i++){
        arr[i]=nums[i];
        arr[i+ nums.length]=nums[i];
    }
    return arr;
    }
}
