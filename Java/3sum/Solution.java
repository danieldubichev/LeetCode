class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort
        Arrays.sort(nums);
        //create returning output
        List<List<Integer>> result = new LinkedList();
        
        //nums.length-2 so we have a chance to look at the last two after
        for(int i = 0; i < nums.length-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length - 1;
                int sum = 0-nums[i];
                while(low < high){
                    if (nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        //dont want duplicate low values
                        while (low < high  && nums[low] == nums[low+1]){
                            low++;
                        }
                        //dont want duplicate high values
                        while (low < high  && nums[high] == nums[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum){
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return result;
    }
}