import java.util.*;
import java.lang.*;

public class Graph {

    //Instance Variables
    Map<String, MyNode> parent_to_child;
    Map<String, String> child_to_parent;

    //Constructor
    public Graph(Map<String, MyNode> parent_to_child, Map<String, String> child_to_parent) {
        this.parent_to_child = parent_to_child;
        this.child_to_parent = child_to_parent;
    }

    //Constructor
    public Graph() {

    }

    //Loops through Hash Tables
    public void buildTree(Map<String, MyNode> nodes) {

        for (Map.Entry<String, MyNode> entry : nodes.entrySet()) {
            String key = entry.getKey();
            System.out.println(key + " has children " + entry.getValue().getName());
        }
    }

    public void buildTree2(Map<String, String> nodes) {

        for (Map.Entry<String, String> entry : nodes.entrySet()) {
            String key = entry.getKey();
            System.out.println(key + " is the child of " + entry.getValue());
        }
    }
}
