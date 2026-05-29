class TrieNode{
    TrieNode[] t= new TrieNode[26];
    boolean isEnd;
}

class Solution {

    Map<String,Integer> mp ;
    public void addWord(TrieNode curr,String word){
        for(int i=0;i<word.length();i++){
            int ind=word.charAt(i)-'a';
            if (curr.t[ind]==null){
                // System.out.println(word.charAt(i)+" "+ind);
                curr.t[ind]= new TrieNode();
            } 
            curr=curr.t[ind];
        }
        
        curr.isEnd=true;
    }

    public int check(TrieNode root,int index,String s){
        int m=s.length();
        if (index>=m){return 0;}
        int res=1+check(root,index+1,s);
        // System.out.println("index: "+ index);
        TrieNode curr = root;
        for(int j=index;j<m;j++){
            int ind=s.charAt(j)-'a';
           
            if (curr.t[ind]==null){
                // System.out.println("null: "+s.charAt(j)+" "+j);
                // if (count==Integer.MAX_VALUE){count=1;}
                // else{count++;}
                // curr=root;
                // continue;
                break;
            }
           
            curr=curr.t[ind];
            if (curr.isEnd){
                // System.out.println("end: "+s.charAt(j)+" "+j);
                res=Math.min(res,check(root,j+1,s));
            }
        }
        return res;
    }

    public int minExtraChar(String s, String[] dictionary) {
        mp= new HashMap<>();
        TrieNode root = new TrieNode();
        int n=dictionary.length;
        for (int i=0;i<n;i++){
            addWord(root,dictionary[i]);
            // mp.put(dictionary[i],1);
        }
        return check(root,0,s);
        
    }
}