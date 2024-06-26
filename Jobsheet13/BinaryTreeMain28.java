package Jobsheet13;

public class BinaryTreeMain28 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node 5 : " + bt.find(5));

        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("Minimum Value in Tree: " + bt.findMinValue());
        System.out.println("Maximum Value in Tree: " + bt.findMaxValue());

        System.out.print("Leaf Nodes: ");
        bt.displayLeafNodes();
        System.out.println("");

        System.out.println("Number of Leaf Nodes: " + bt.countLeafNodes());
    }
}  

