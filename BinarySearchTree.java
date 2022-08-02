class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if (root.data>val){
            root.left =  insert(root.left, val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }else{
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static boolean search(Node root, int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(root.data>val){
            return search(root.left, val);
        }else{
            return search(root.right,val);
        }
    }
    public static void printRange(Node root, int x, int y){
        if(root==null){
            return;
        }
        printRange(root.left,x,y);
        if(root.data>=x && root.data<=y){
            System.out.print(root.data + " ");
        }
        printRange(root.right, x, y);
    }
    public static int rootToLeafPaths(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return rootToLeafPaths(root.left) + rootToLeafPaths(root.right);
    }
    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        int values[] = {8,5,10,3,6,11,14};
        Node root = null;
        for(int i = 0; i<values.length;i++){
            root = insert(root, values[i]);
        }
        // inOrderTraversal(root);
        // System.out.println();
        // System.out.println(search(root, 4));
        // printRange(root, 4, 7);
        // System.out.println();
        System.out.println(rootToLeafPaths(root));
    }
}
