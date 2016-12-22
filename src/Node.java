import java.util.*;
import java.lang.*;

public interface Node {

    public void addChild(Node n);

    public String getName();

    public List<Node> getChildren();
}
