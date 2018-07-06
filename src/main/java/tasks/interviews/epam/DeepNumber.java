package tasks.interviews.epam;

import lib.node.TreeNode;

class DeepNumber {
    int getMaxDeep(TreeNode<Void> root) {
        if (root == null) {
            return 0;
        }

        int left = 1 + getMaxDeep(root.getLeftChild());
        int right = 1 + getMaxDeep(root.getRightChild());

        return (left < right ? right : left);
    }
}
