import java.util.Queue;
import java.util.*;

class tNode {
    int data;
    tNode left;
    tNode right;

    public tNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class tree {
    public static void inOrder(tNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static void preOrder(tNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(tNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static int height(tNode root) {
        if (root == null)
            return 0;
        int leftRoot = height(root.left);
        int rightRoot = height(root.right);
        return 1 + Math.max(leftRoot, rightRoot);
    }

    public static int cntNodes(tNode root) {
        if (root == null)
            return 0;
        return 1 + cntNodes(root.left) + cntNodes(root.right);
    }

    public static void kthNodes(tNode root, int k, List<Integer> res) {
        if (root == null)
            return;
        if (k == 0) {
            res.add(root.data);
        } else {
            kthNodes(root.left, k - 1, res);
            kthNodes(root.right, k - 1, res);
        }
    }

    public static List<Integer> lvlTraversal(tNode root) {
        List<Integer> lvlOrder = new ArrayList<>();
        if (root == null)
            return lvlOrder;

        Queue<tNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            tNode temp = q.poll();
            lvlOrder.add(temp.data);
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        return lvlOrder;
    }

    public static boolean searchBST(int x, tNode root) {
        if (root.data == x)
            return true;
        if (root.data < x) {
            return searchBST(x, root.right);
        } else {
            return searchBST(x, root.left);
        }
    }

    public static tNode insertBST(tNode root, int x) {
        if (root == null) {
            return new tNode(x);
        }
        if (root.data >= x) {
            root.left = insertBST(root.left, x);
        } else {
            root.right = insertBST(root.right, x);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tNode root = new tNode(60);
        root.left = new tNode(20);
        root.right = new tNode(30);
        root.right.left = new tNode(40);

        System.out.println("Inorder:");
        inOrder(root);
        System.out.println("Preorder:");
        preOrder(root);
        System.out.println("Postorder:");
        postOrder(root);

        int ht = height(root);
        System.out.println("Height : " + ht);
        System.out.println("Number of nodes : " + cntNodes(root));

        List<Integer> res = new ArrayList<>();
        int k = sc.nextInt();
        kthNodes(root, k, res);
        System.out.println("Nodes at level" + k + " : " + res);

        System.out.println("Level Order Traversal: " + lvlTraversal(root));

        int x = sc.nextInt();
        System.out.println(insertBST(root, x));
        inOrder(root);
        sc.close();
    }
}
