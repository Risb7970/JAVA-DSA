package BinarySearchTree;

public class BST1 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root , int val){
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            root.left = insert(root.left , val);
        }else root.right = insert(root.right , val);

        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //method for searching node in a bst
    public static boolean search(Node root , int val){
        if(root==null){
            return false;
        }

        if(root.data==val){
            return true;
        }

        if(root.data>val){
            return search(root.left , val);
        }
        else{
            return search(root.right , val);
        }
    }

    //method for deleting the node in bst
    public static Node delete(Node root , int val){
        if(root.data<val){
            root.right = delete(root.right,val);
        }
        else if(root.data>val){
            root.left = delete(root.left , val);
        }else{
            //Case-1 leaf Node
            if(root.left==null && root.right ==null){
                return null;
            }
             //Case-2 single Child
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }

            //Case-3 Both Child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {4,6,7,1,2,66,0};
        Node root = null;

        for(int i=0; i<values.length; i++){
           root = insert(root , values[i]);
        }

        inorder(root);
        System.out.println();
//        if(search(root, 7)) System.out.println("Found");
//        else System.out.println("Not found");

        root = delete(root , 1);
        System.out.println();
        inorder(root);
    }
}
