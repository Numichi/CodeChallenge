package tasks.interviews.epam;

import lib.node.Node;

class DeepNumber {
    int getMaxDeep(Node root) {
        if(root == null) {
            return 0;
        }
        
        int left = getMaxDeep(root.getLeft());
        int right = getMaxDeep(root.getRight());
        
        return 1 + (left < right ? right : left);
    }
}
