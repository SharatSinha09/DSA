class tNode {
    tNode[] child;
    boolean isEndOfWord;

    public tNode() {
        child = new tNode[26];
        isEndOfWord = false;
    }
}

public class Trie {
    private tNode root;

    public Trie() {
        root = new tNode();
    }

    // Insert
    public void insert(String word) {
        tNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (temp.child[idx] == null) {
                temp.child[idx] = new tNode();
            }
            temp = temp.child[idx];
        }
        temp.isEndOfWord = true;
    }

    public boolean search(String word) {
        tNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (temp.child[idx] == null) {
                return false;
            }
        }
        return temp.isEndOfWord;
    }

    public boolean startWth(String prefix) {
        tNode temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (temp.child[idx] == null) {
                return false;
            }
        }
        return true;
    }
}
