import java.util.*;
import java.util.LinkedList; 

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


public class treeConcept {
    public static void PreOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        InOrderTraversal(root.left);
        InOrderTraversal(root.right);
        return;
    }
    public static void InOrderTraversal(Node root){
        if(root==null){
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);
        return;
    }
    public static void PostOrderTraversal(Node root){
        if(root==null){
            return;
        }
        InOrderTraversal(root.left);
        InOrderTraversal(root.right);
        System.out.print(root.data + " ");
        return;
    }
    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);    
        while(!q.isEmpty()){
            Node d = q.peek();
            q.remove();
            if(d==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                continue;
            }
            System.out.print(d.data+" ");
            if(d.left!=null){
                q.add(d.left);
            }
            if(d.right!=null){
                q.add(d.right);
            }
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left+right+1;

    }

    public static int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        return sumOfNode(root.left) + sumOfNode(root.right) + root.data;
    }
    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        if(left<= right){
            return right+1;
        }
        return left+1;
    }

    public static boolean isidentical(Node root, Node subroot){
        if(root==null && subroot==null){
            return true;
        }else if(root==null || subroot==null){
            return false;
        }else if(root.data==subroot.data){
            return isidentical(root.left, subroot.left) && isidentical(root.right, subroot.right);
        }else{
            return false;
        }
    }

    public static boolean findSubTree(Node root, Node subroot){
        if(subroot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root==subroot){
            if(isidentical(root, subroot)){
                return true;
            }
        }
        return findSubTree(root.left, subroot) || findSubTree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b;
        b.left = d;
        b.right = e;
        a.right = c;
        c.right = f;
        // PreOrderTraversal(a);
        // System.out.println();
        // InOrderTraversal(a);
        // System.out.println();
        // PostOrderTraversal(a);
        // System.out.println();
        // levelOrderTraversal(a);
        // System.out.println(countNodes(a));
        // System.out.println(sumOfNode(a));
        // System.out.println(heightOfTree(a));
        System.out.println(findSubTree(a, a.left));
    }
}
