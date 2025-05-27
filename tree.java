class tNode{
    int data;
    tNode left;
    tNode right;
    public tNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    tNode root;
}
class tree{
    public static void inOrder(tNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    public static void preOrder(tNode root){
        if(root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(tNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }
    public static void main(String[] args) {
        tNode root = new tNode(10);
        root.left = new tNode(20);
        root.right = new tNode(30);
        root.right.left = new tNode(40);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}
