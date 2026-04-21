class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int>v_s(26);
        vector<int>v_t(26);
        for (char ch:s){
            v_s[int(ch)-97]+=1;
        }
        for (char ch:t){
            v_t[int(ch)-97]+=1;
        }
        for (int i=0;i<26;i++){
            if (v_s[i]!=v_t[i]){return false;}
        }
        return true;
        
    }
};
