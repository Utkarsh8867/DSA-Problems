public class SubTree {
    
    // Given the roots of two binary trees root and subroot,return true if 
    // there is a subtree of root with the same structure and node values of 
    // subroot and false otherwise
    static class Node {
        int data;
        Node left;
        Node right;

        // }
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node ,Node subRoot){
        if(node == null && subRoot ==null){
            return true;

        }
        else if(node == null || subRoot == null || node.data !=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }

        return true;
    }
    
    public static boolean isSubtree(Node root,Node subRoot ){
        if(root ==null ){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
       boolean leftans= isSubtree(root.left, subRoot);
       boolean rightAns =isSubtree(root.right, subRoot);
       return leftans || rightAns;
    }

    static class Info{
        Node node;
        int hd;

        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;

        }
        public static void topView(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer,Node> map =new HashMap<>();
        }
    }
    public static void main(String[] args) {
            //        1
            //      /   \
            //     2     3
            //    / \   / \
            //   4  5  6   7


        Node Root =new Node(1);
        Root.left =new Node(2);
        Root.right =new Node(3);
        Root.left.left=new Node(4);
        Root.left.right = new Node(5);
        Root.right.left =new Node(6);
        Root.right.right= new Node(7);

  
              //   2     
            //    / \   
            //   4  5  

        Node subroot =new Node(2);
        subroot.left =new Node(4);
        subroot.right =new Node(5);

        System.err.println(isIdentical(Root, subroot));
    }
}
