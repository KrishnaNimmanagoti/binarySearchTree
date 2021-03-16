import com.bridgelabz.binarytreesearch.BinarySearchTree;
import com.bridgelabz.binarytreesearch.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    BinarySearchTree<Integer> tree;
    Node<Integer> root ;
    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree<>();
        root = new Node<>(8);
        tree.insert(root, 20);
        tree.insert(root, 31);
        tree.insert(root, 59);
        tree.insert(root, 12);

    }

    @Test
    public void insert() {
        tree.insert(root, 22);
        tree.insert(root, 33);
        tree.insert(root, 44);
        tree.insert(root, 55);

    }

    @Test
    public void inOrder() {
        tree.inOrder(root);
    }
    @Test
    public void preOrder() {
        tree.preOrder(root);
    }
    @Test
    public void postOrder() {
        tree.postOrder(root);
    }
}

