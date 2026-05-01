class Solution {

public boolean check(int[] alp_1,int[] alp_2){
    for (int i=0;i<26;i++){
        if (alp_1[i]!=0 && alp_1[i]>alp_2[i]){return false;}
    }
    return true;

}

    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        int[] alp_1 = new int[26];
        for (int i=0;i<n;i++){
            alp_1[s1.charAt(i)-'a']++;
        }

        int l=0,r=0;
        int[] alp_2 = new int[26];
        while (r<m){
            int val = s2.charAt(r)-'a';
            alp_2[val]++;

            if (check(alp_1,alp_2)){
                System.out.println(s2.substring(l,r+1));
                if (r-l+1==n){return true;}
                while (l<=r && check(alp_1,alp_2)){
                    if (r-l+1==n){return true;}
                    int val2 = s2.charAt(l)-'a';
                    alp_2[val2]--;
                    l++;
                }

            } 
            r++;
        }
        return false;
        
    }
}
