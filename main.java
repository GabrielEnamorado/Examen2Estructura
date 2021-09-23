  public static void main(String[] args)
      {
          TreeNode p = new TreeNode(1);
          p.left = new TreeNode(2);
          p.right = new TreeNode(3);
          p.left.left = null;
          p.left.right = null;
          p.right.left = new TreeNode(4);
          p.right.right = new TreeNode(5);
 
         Tree1 t = new Tree1();
         System.out.println(t.maxDepth(p));
     }

1
2
3
4
5
6
7
8
9
10
11
12
13
