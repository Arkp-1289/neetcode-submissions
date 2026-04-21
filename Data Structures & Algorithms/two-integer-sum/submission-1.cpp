using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>mp;
        for(int i=0;i<nums.size();i++){
               
                if (mp.find(target-nums[i])!=mp.end()){
                    // cout<<"res: "<<target-nums[i]<<" "<<mp[target-nums[i]]<<endl;
                    return {mp[target-nums[i]],i};
                }
                cout<<nums[i]<<" "<<i<<endl;
                 mp[nums[i]]=i;
            
        }
        
    }
};
