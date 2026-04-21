class Solution {

    public boolean check_anagram(String s,String t){
        int[] alpha_ind1= new int[26];
        int[] alpha_ind2= new int[26];
        for (int i=0;i<s.length();i++){
            alpha_ind2[(int)s.charAt(i)-97]++;
        }
        for (int i=0;i<t.length();i++){
            alpha_ind1[(int)t.charAt(i)-97]++;
        }
        for (int i=0;i<26;i++){
            if (alpha_ind2[i]!=alpha_ind1[i]){return false;}
        
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<Integer> ind_reached= new ArrayList<>();
        int n=strs.length;
        List<List<String>> res = new ArrayList<List<String>>();
        for (int i=0;i<n;i++){
            if (ind_reached.contains(i)){continue;}
            else{
            List<String> temp= new ArrayList<>();
            temp.add(strs[i]);
            for (int j=i+1;j<n;j++){
                if(check_anagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    ind_reached.add(j);
                }
            }
            res.add(temp);
            }
        }
        return res;
    }
}
