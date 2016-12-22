import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--Part 1--");
        System.out.println();

        //Root Node
        Node csci = new MyNode("Computer Science");

        //Root Nodes Children
        Node areas_of_csci = new MyNode("Areas of Computer Science");
        Node csci_awards = new MyNode("Computer Science Awards");
        Node csci_unsolved = new MyNode("Unsolved Problems in Computer Science");

        //Children of areas_of_csci
        Node art_int = new MyNode("Artificial Intelligence");
        Node alg = new MyNode("Algorithms and Data Structures");

        //Children of csci_awards
        Node knuth = new MyNode("Knuth Prize Laureates");
        Node info = new MyNode("Information Science Awards");
        Node dij = new MyNode("Dijkstra Prize Laureates");

        //Children of csci_unsolved
        Node lin = new MyNode("Linear Programming");
        Node kserv = new MyNode("K-Server Problem");
        Node splay = new MyNode("Splay Tree");

        //Construct MyTree Object using Root Node
        MyTree MT = new MyTree(csci);

        //Construct Root Node Children
        csci.addChild(areas_of_csci);
        csci.addChild(csci_awards);
        csci.addChild(csci_unsolved);

        //Construct areas_of_csci children
        areas_of_csci.addChild(art_int);
        areas_of_csci.addChild(alg);

        //Construct csci_awards children
        csci_awards.addChild(knuth);
        csci_awards.addChild(info);
        csci_awards.addChild(dij);

        //Construct csci_unsolved children
        csci_unsolved.addChild(lin);
        csci_unsolved.addChild(kserv);
        csci_unsolved.addChild(splay);

        //Method Calls using constructed Tree
        MT.preorderDfsTraverseRecursive();
        System.out.println();

        MT.traverseBfs();
        System.out.println();

        System.out.println(MT.getBranchingFactor());
        System.out.println();

        System.out.println(MT.isBinaryTree());
        System.out.println();


        //Part 2
        System.out.println("--Part 2--");
        System.out.println();

        //Derek Family
        System.out.println("--Derek's Family--");

        Map<String, MyNode> n = new HashMap<String, MyNode>();
        Map<String, String> p = new HashMap<String, String>();

        MyNode mom = new MyNode("Eric, Pete, Steph, Derek");
        MyNode dad = new MyNode("Derek");
        MyNode derek = new MyNode("(No Children)");
        MyNode nancy = new MyNode("(No Children)");
        MyNode doris = new MyNode("(No Children)");
        MyNode toby = new MyNode("Eric, Pete, Steph");
        MyNode bill = new MyNode("Doug, April, Shannon, Dad");
        MyNode doug = new MyNode("(No Children)");
        MyNode april = new MyNode("(No Children)");
        MyNode shannon = new MyNode("(No Children)");
        MyNode diane = new MyNode("(No Children)");
        MyNode steph = new MyNode("(No Children)");
        MyNode eric = new MyNode("(No Children)");
        MyNode pete = new MyNode("(No Children)");

        n.put("Mom",mom);
        n.put("Dad",dad);
        n.put("Derek",derek);
        n.put("Nancy",nancy);
        n.put("Doris",doris);
        n.put("Toby",toby);
        n.put("Bill",bill);
        n.put("Doug",doug);
        n.put("April",april);
        n.put("Shannon",shannon);
        n.put("Diane",diane);
        n.put("Steph",steph);
        n.put("Eric",eric);
        n.put("Pete",pete);

        p.put("Derek","Mom and Dad");
        p.put("Mom","None");
        p.put("Dad","Bill");
        p.put("Nancy","None");
        p.put("Doris","None");
        p.put("Toby","None");
        p.put("Bill","None");
        p.put("Doug","Bill");
        p.put("April","Bill");
        p.put("Shannon","Bill");
        p.put("Diane","None");
        p.put("Steph","Mom");
        p.put("Eric","Mom");
        p.put("Pete","Mom");

        Graph g = new Graph(n,p);

        g.buildTree2(p);
        System.out.println();
        g.buildTree(n);


        System.out.println();

        //End Derek's Graph

        //Niraj's Family
        System.out.println("--Niraj's Family--");

        Map<String, MyNode> n1 = new HashMap<String, MyNode>();
        Map<String, String> p1 = new HashMap<String, String>();

        MyNode Dad = new MyNode("Niraj, Nabin");
        MyNode Mom = new MyNode("Niraj, Nabin");
        MyNode Jethi_phupu = new MyNode("(No Children)");
        MyNode Jhupa_phupu = new MyNode("(No Children)");
        MyNode Kanchi = new MyNode("(No Children)");
        MyNode Kumar = new MyNode("(No Children)");
        MyNode Jetha_bada = new MyNode("No Children");
        MyNode Maile_bada = new MyNode("No Children");
        MyNode Kamal = new MyNode("(No Children)");
        MyNode Tika_ram = new MyNode("(No Children)");
        MyNode Manju = new MyNode("(No Children)");
        MyNode Niraj = new MyNode("(No Children)");
        MyNode Nabin = new MyNode("(No Children)");


        n1.put("Dad",Dad);
        n1.put("Mom",Mom);
        n1.put("Jethi_phupu",Jethi_phupu);
        n1.put("Jhupa_phupu",Jhupa_phupu);
        n1.put("Kanchi",Kanchi);
        n1.put("Kumar",Kumar);
        n1.put("Jetha_bada",Jetha_bada);
        n1.put("Maile_bada",Maile_bada);
        n1.put("Kamal",Kamal);
        n1.put("Tika_mama",Tika_ram);
        n1.put("Manju",Manju);
        n1.put("Niraj",Niraj);
        n1.put("Nabin",Nabin);

        p1.put("Niraj","Mom and Dad");
        p1.put("Mom","None");
        p1.put("Dad","None");
        p1.put("Jethi_phupu","None");
        p1.put("Jhupa_phupu","None");
        p1.put("Kanchi","None");
        p1.put("Kumar","None");
        p1.put("Jetha_bada","None");
        p1.put("Maile_bada","None");
        p1.put("Kamal","None");
        p1.put("Tika_mama","None");
        p1.put("Manju","None");
        p1.put("Nabin","Mom and Dad");

        Graph g1 = new Graph(n1,p1);

        g1.buildTree2(p1);
        System.out.println();
        g1.buildTree(n1);

        //End Derek's Graph

    }
}
