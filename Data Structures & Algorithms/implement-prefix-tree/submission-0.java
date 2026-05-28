class TrieNode{
    TrieNode[] t= new TrieNode[26];
    boolean isEnd;

}


class PrefixTree {
    TrieNode root ;

    public PrefixTree() {
        root = new TrieNode();   
    }

    public void insert(String word) {
        TrieNode curr= root;
        for (int i=0;i<word.length();i++){
            int ind = word.charAt(i)-'a';
            if (curr.t[ind]==null){
                curr.t[ind]=new TrieNode();
            }
            curr=curr.t[ind];
        }
        curr.isEnd=true;

    }

    public boolean search(String word) {

        TrieNode curr = root;

        for (int i=0;i<word.length();i++){
            int ind= word.charAt(i)-'a';
            if (curr.t[ind]==null){return false;}
            curr=curr.t[ind];
        }
        return curr.isEnd;

    }

    public boolean startsWith(String prefix) {
        TrieNode curr =root;
        for (int i=0;i<prefix.length();i++){
            int ind = prefix.charAt(i)-'a';
            if (curr.t[ind]==null){return false;}
            curr=curr.t[ind];
        }
        return true;
    }
}
