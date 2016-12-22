import java.util.*;
import java.lang.*;

public class MyTree<T> implements Tree {

    //Instance Variables
    public Node Root;

    //Constructor
    public  MyTree(Node root){

        this.Root = root;

    }

    //Prints out the nodes of tree in breadth-first order
    public void traverseBfs() {

    Queue<Node> queue = new LinkedList<Node>();
        queue.add(Root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.println(node.getName());

            List<Node> child = node.getChildren();
            for (Node no : child) {
                queue.add(no);

            }

        }
    }


    //Returns a double consisting of the average number of children per Node
    public Double getBranchingFactor() {
        double branch_count = 0;
        double int_node_count = 0;

        if(Root == null){
            return null;
        }
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(Root);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            List<Node> child = current.getChildren();

            for(Node no: child){
                queue.add(no);
                branch_count++;
            }

            if(child.size() >= 1){
                int_node_count++;
            }
        }
        return branch_count/int_node_count;
    }


    public Boolean isBinaryTree(){
        if(Root == null){
            return false;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(Root);
        boolean isBinaryTree = true;

        while(!queue.isEmpty()){
            Node node = queue.remove();

            List<Node> child = node.getChildren();

            if(child.size() <=2){
                isBinaryTree = true;

                for(Node no: child){
                    queue.add(no);
                }
            }
            else{
                isBinaryTree = false;
            }
        }
        return isBinaryTree;
    }

    @Override
    public void preorderDfsTraverseRecursive() {

        preorderDfsTraverseRecursive(Root,0);

    }

    public void preorderDfsTraverseRecursive(Node current, int level){

        List<Node> node1 = current.getChildren();

        for(int i = 0; i < level; i++){
            System.out.print("\t");
        }
        System.out.println(current.getName());

        if(current.getChildren().size() > 0){

            for(int i = 0; i < node1.size(); i++){
                preorderDfsTraverseRecursive(node1.get(i),level+1);
            }
        }

    }
}
