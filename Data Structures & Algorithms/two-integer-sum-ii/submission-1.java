class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n=numbers.length;
        int[] res = new int[2];
        for (int i=0;i<n;i++){
            if (mp.containsKey(target-numbers[i])){
                res[0]=mp.get(target-numbers[i]);
                res[1]=i+1;
                break;
            }
            mp.put(numbers[i],i+1); 

        }
        return res;
    }
}
