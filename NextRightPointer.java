public class NextRightPointer {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

    public Node() {}

    public Node(int _val) {
            val = _val;
        }

    public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    //Time complexity: O(N) number of nodes
    //Space Complexity: O(1)
    public Node connect(Node root) {

        traverse(root);
        return root;
    }

    private void traverse(Node root){
        if(root == null){
            return;
        }

        // System.out.println(root.val+" "+ prev.val);


        if(root.left !=null){
            root.left.next = root.right;
            if(root.next !=null){
                root.right.next = root.next.left;
            }
        }


        traverse(root.left);
        traverse(root.right);

    }
}
