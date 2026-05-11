class Solution {
    public String reorganizeString(String s) {

        int[] freq= new int[26];
        int n=s.length();
        for (int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int max_freq=Integer.MIN_VALUE;
        for (int i=0;i<26;i++){
            if (max_freq<freq[i]){max_freq=freq[i];}
        }
        if (max_freq>(n+1)/2){return "";}

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for (int i=0;i<26;i++){
            if (freq[i]>0){
                pq.offer(new int[]{freq[i],i});
            }
        }
        int[] prev= null;
        StringBuilder res= new StringBuilder();
        while (!pq.isEmpty() || prev!=null){

            if (pq.isEmpty() && prev!=null){return "";}

            int[] curr= pq.poll();
            res.append((char)(curr[1]+'a'));
            curr[0]--;

            if (prev!=null){pq.offer(prev);prev=null;}
            if (curr[0]>0){
                prev=curr;
            }
        }
        return res.toString();


        
    }
}