class Solution {
    public int majorityElement(int[] nums) {
        // Moore voting Algorithm
        int count=0,ele=-1;
        for (int i=0;i<nums.length;i++){
            if (count==0){ele=nums[i];count++;}
            else if (nums[i]==ele){count++;}
            else{count--;}
        }
        return ele;

        
    }
}