class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int ind=0;
        while (ind<strs[0].length()){
            int ok=1;
            char ch=strs[0].charAt(ind);
            for (int i=1;i<strs.length;i++){
                if (ind<strs[i].length()){
                    if (strs[i].charAt(ind)!=ch){ok=0;break;}
                } else{
                    ok=0;break;
                }
            }
            if (ok==1){res+=ch;}
            else{break;}
            ind++;
        }
        return res;
        
    }
}