
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Navaira
 */
public class Node {

    String state;
    Node parent;
    String action;
    

    public Node(String state, Node parent, String action) {
        this.state = state;
        this.parent = parent;
        this.action = action;
    }

    

   
}
