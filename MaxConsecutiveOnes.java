// Find the maximum consecutive ones in an array

// input : nums = [1, 1, 0, 1, 1, 1]
// output : 3
// The first and the last are consecutive one's. In which the last consecutive one's are maximum and hence output = 3

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maximum = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            
            if(count > maximum)
                maximum = count;
        }
        
        return maximum;
    }
    
}
