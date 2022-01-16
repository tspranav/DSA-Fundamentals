
public class Jan13LvlOrder{
class Node {
    constructor(val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
public static void main(String[] args){
 var root= null;

function printLevelOrder() {
    var h = height(root);
    var i;
    for (i = 1; i <= h; i++)
        printCurrentLevel(root, i);
}



    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

   console.log("Level order traversal of  binary tree is ");
   printLevelOrder();
}

}