/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static List<Integer> l1;
    static List<Integer> l2;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        l1=new ArrayList<>();
        l2=new ArrayList<>();
        vis(p,l1);
        vis(q,l2);

        if(l1.equals(l2)) return true;
        return false;
    }

    public static void vis(TreeNode root, List<Integer> l) {
        if(root==null) {
            l.add(100000);
            return;
        }
        l.add(root.val);
        vis(root.left,l);
        vis(root.right,l);
    }
}