package AssignmentsWeek4;

public class Jan12BinaryTree {
	static class Node{
		int key;
		Node left, right;
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	static int getcount(Node root) {
		if(root == null)
			return 0;
		int leftCount = getcount(root.left);
		int rightCount = getcount(root.right);
		
		return 1+ leftCount+rightCount;
	}
	static int getheight(Node node) {
		if(node == null) {
			return -1;
		}
		int lheight = getheight(node.left);
		int rheight = getheight(node.right);
		
		 if (lheight >= rheight)
             return (lheight + 1);
          else
             return (rheight + 1);
	}
	public static void preorder(Node root) {
		if(root==null) return;
		System.out.print(root.key+",");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.key+",");
		inorder(root.right);
		
	}
    
	public static void postorder(Node root) {
		if(root==null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key+",");
		
	}
	static void printLN(Node root){
		if(root == null) return;

		if(root.left == null && root.right==null){
			System.out.println("LeafNode:"+ root.key);
		}
		printLN(root.left);
		printLN(root.right);
	}
	static int addBT(Node root) 
	{ 
	    if (root == null) 
	        return 0; 
	    return (root.key + addBT(root.left) + addBT(root.right)); 
	} 
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left =  new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		System.out.println(addBT(root));
		System.out.println(getheight(root));
		printLN(root);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		

	}

}
