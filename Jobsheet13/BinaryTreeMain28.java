package Jobsheet13;

public class BinaryTreeMain28 {
    public static void main(String[] args) {
        BinaryTree28 bt = new BinaryTree28();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("Prerder tranversal : ");
        bt.transversePreOrder(bt.root);
        System.out.println("");
        System.out.println("inOrder transversal : ");
        bt.transverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder transversal : ");
        bt.transversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find node : " + bt.find(5));
        System.out.println("Delete node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.println("Preorder transversal");
        bt.transversePreOrder(bt.root);
        System.out.println("");
        
        
    }
}
    

