package Jobsheet13;

import Jobsheet10.Node29;

public class BinaryTree28 {
    Node28 root;

    public BinaryTree28() {
        root = null;
    }

    Boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node28(data);
        } else {
            Node28 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node28(data);
                        break;
                    } else {
                        current= current.right;
                    }
                } else if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node28(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    break;
                }
            }
        }
    }

    Boolean find(int data) {
        Node28 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void transversePreOrder(Node28 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    void transversePostOrder(Node28 node) {
        if (node != null) {
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void transverseInOrder(Node28 node) {
        if (node != null) {
            transverseInOrder(node.left);
            System.out.print(" " + node.data);
            transverseInOrder(node.right);
        }
    }

    Node28 getSuccessor(Node28 del) {
        Node28 successor = del.right;
        Node28 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node28 parent = root;
        Node28 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node28 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                }
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.left = current.left;
                }
                successor.left = current.left;
            }
        }
    }
}

