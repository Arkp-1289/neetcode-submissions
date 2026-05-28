class TrieNode{
    TrieNode[] t = new TrieNode[52];
    boolean isEnd;
}



class WordDictionary {
    
    TrieNode root;
    public WordDictionary() {
        root= new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++){
            int ind=-1;
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)){
                ind=ch-'A';
            } else{
                ind=26+(Character.toLowerCase(ch)-'a');
            }
            
            if (curr.t[ind]==null){
                curr.t[ind]= new TrieNode();
            }
            curr=curr.t[ind];
        }
        curr.isEnd=true;

    }
    public boolean check(int ind,String word,TrieNode curr){

        for (int i=ind;i<word.length();i++){
            int c_ind=-1;
            char ch= word.charAt(i);
            if (ch=='.'){
                TrieNode temp =curr;
                for (int j=0;j<52;j++){
                    if (temp.t[j]!=null && check(i+1,word,temp.t[j])){return true;}
                }
                return false;
                
            } else{
                if (Character.isUpperCase(ch)){
                    c_ind=ch-'A';
                } else{
                    c_ind=26+(Character.toLowerCase(ch)-'a');
                }
                if (curr.t[c_ind]==null){return false;}
                curr=curr.t[c_ind];
            }

        }
        return curr.isEnd;
    }

    public boolean search(String word) {
        TrieNode curr =root;
        for (int i=0;i<word.length();i++){
            int ind=-1;
            char ch= word.charAt(i);
            if (ch=='.'){
                TrieNode temp =curr;
                for (int j=0;j<52;j++){
                    if (temp.t[j]!=null && check(i+1,word,temp.t[j])){return true;}
                }
                return false;
                
            } else{
                if (Character.isUpperCase(ch)){
                    ind=ch-'A';
                } else{
                    ind=26+(Character.toLowerCase(ch)-'a');
                }
                if (curr.t[ind]==null){return false;}
                curr=curr.t[ind];
            }
        }
        return curr.isEnd;

    }
}
