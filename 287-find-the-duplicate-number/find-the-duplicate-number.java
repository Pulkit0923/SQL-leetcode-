class Solution {
    public int findDuplicate(int[] nums) {
       while(true){
        int ele = nums[0];
        if(ele== nums[ele]){
            return ele;
        }
        
        else swap(0,ele,nums);
        }
    }
    
    public void swap(int i, int j,int[]nums){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
}
