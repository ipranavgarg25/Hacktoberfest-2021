import java.util.ArrayList;

class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}
    
    public void add(String word)
    {
        if(add(root,word))
            count++;
    }
    
    public boolean add(TrieNode root, String word)
    {
        if(word.length()==0)
        {
            if(!root.isTerminating)
            {
                root.isTerminating=true;
                return true;
            }
            else
                return false;
        }
        int childIndex=word.charAt(0) - 'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
        {
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childCount++;
        }
        return add(child,word.substring(1));
        
    }


	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
        for(int i=0;i<vect.size();i++)
        {
            String string=vect.get(i);
            for(int j=0;j<string.length();j++)
            {
                add(string.substring(j));
            }
            if(search(pattern))
                return true;
        }
        return false;
        
        
	}

}
