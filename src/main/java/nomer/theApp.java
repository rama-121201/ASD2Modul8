package nomer;
public class theApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        Node siNode;
        
        siNode = new Node('D');
        tree.insert(siNode);
        
        siNode = new Node('B');
        tree.insert(siNode);
        
        siNode = new Node('A');
        tree.insert(siNode);
        
        siNode = new Node('C');
        tree.insert(siNode);
        
        siNode = new Node('F');
        tree.insert(siNode);
        
        siNode = new Node('E');
        tree.insert(siNode);
        
        siNode = new Node('G');
        tree.insert(siNode);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
        
        /*
        a) D merupakan Predesor dari B dan F
        b) B dan F merupakan Succesor dari D
        c) B dan D merupakan Ancestor dari C atau A
        d) C dan B merupakan Descendent dari D
        e) B merupakan Parent dari C
        f) C merupakan Child dari B
        g) C dan A adalah Sibling
        h) Subtree B,A,C dan Subtree F,E,G
        */
    }
}