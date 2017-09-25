import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Misky on 9/24/2017.
 */
public class Q617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;

        int val = (t1==null ? 0 : t1.val) + (t2==null ? 0 : t2.val);
        TreeNode merged = new TreeNode(val);

        merged.left = mergeTrees((t1==null ? null : t1.left),(t2==null ? null : t2.left));
        merged.right = mergeTrees((t1==null ? null : t1.right),(t2==null ? null : t2.right));

        return merged;
    }

    public void entry(){
        //form Tree 1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);
        //form Tree 2
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        TreeNode merged = mergeTrees(t1,t2);
        merged.traverse();

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
    public void traverse(){
        class PrintNode{
            String key;
            TreeNode node;
            PrintNode(String k, TreeNode t){
                key = k;
                node = t;
            }
        }
        Queue<PrintNode> queue = new LinkedList<PrintNode>();
        PrintNode root = new PrintNode("G",this);
        queue.offer(root);
        PrintNode tmp;
        while ((tmp = queue.poll()) != null){
            System.out.println(tmp.key + ":" + tmp.node.val);
            if (tmp.node.left != null) queue.offer(new PrintNode(tmp.key + "L", tmp.node.left));
            if (tmp.node.right != null) queue.offer(new PrintNode(tmp.key + "R", tmp.node.right));
        }
    }
}
