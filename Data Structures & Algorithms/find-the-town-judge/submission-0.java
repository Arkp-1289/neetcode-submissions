class Solution {
    public int findJudge(int n, int[][] trust) {

        int judge =trust[0][1];
        for (int i=1;i<trust.length;i++){
            if (judge!=trust[i][1]){judge=-1;break;}
        }
        return judge;
        
    }
}