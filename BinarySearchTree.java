//Insert the element BinarySearchTree

// Program Coding
public class BinarySearchTree {
	class Node {
		int key;
		Node left,right;

		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	Node root;

	BinarySearchTree() {
		root=null;
	}
	void insert(int key) {
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left,key);
		else if(key>root.key)
			root.right=insertRec(root.right,key);
		return root;
	}
	void printTree() {
		printTree(root);
	}
	void printTree(Node node)
{
		if(node!=null) {
printTree(node.left);
System.out.print(node.key +" ");
printTree(node.right);
		}
	}
	public static void main(String[]args) {
		BinarySearchTree tree=new BinarySearchTree();
			tree.insert(50);
			tree.insert(30);
			tree.insert(20);
			tree.insert(40);
			tree.insert(70);
			tree.insert(60);
			tree.insert(100);
System.out.println("BinarySearchTree:");
		tree.printTree();
	}
}	

// Output:
BinarySearchTree:
20 30 40 50 60 70 100
	

			