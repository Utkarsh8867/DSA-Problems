public class Kth_LevelTree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    // }

    public static void Klevel(Node Root,int level,int k){
        if(Root == null){
            return;
        }
        if(level == k){
            System.out.println(Root.data+" ");
            return;
            
        }
        Klevel(Root.left, level+1, k);
        Klevel(Root.right, level+1, k);
    }
}
    public static void main(String[] args) {

        Node Root =new Node(1);
        Root.left =new Node(2);
        Root.right =new Node(3);
        Root.left.left=new Node(4);
        Root.left.right = new Node(5);
        Root.right.left =new Node(6);
        Root.right.right= new Node(7);
        int k =2;

        .Klevel(Root, 1, k);
    }
}
