package BinaryTree;

public class DiameterOfTree2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int diam;
        int height;
        public Info(int diam , int height){
            this.diam = diam;
            this.height = height;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam) , leftInfo.height+ rightInfo.height+1);
        int heig = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diam,heig);
    }
    public static void main(String[] args) {
          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);

        System.out.println(diameter(root).diam);
    }
}
