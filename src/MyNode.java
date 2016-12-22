import java.util.*;
import java.lang.*;

public class MyNode implements Node{

    //Instance Variables
    public String name;
    public List<Node> children = new ArrayList<Node>();
    public Node parent;

    //Constructor
    public MyNode(){

    }

    public MyNode(String name){
        this.name = name;
    }

    //Adds a Node to List of Child Nodes
    public void addChild(Node n) {

        children.add(n);
    }

    //Returns a String of the Data of a Node
    public String getName() {
        return name;
    }

    //Returns a List of Children for a Parent Node
    public List<Node> getChildren() {
        return children;
    }
}
