 public static class TreeNode
      {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val)
          {
              data = val;
          }
     }
 
     public int maxDepth(TreeNode root)
     {
         if (root == null)
             return 0;
 
         int nleft = maxDepth(root.left);
         int nright = maxDepth(root.right);
 
         return nleft > nright ? nleft + 1 : nright + 1;
     }

