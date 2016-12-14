//***************************************************************
// Lab 5		
// Class: CS 111C		Date:	 5/16/16
//***************************************************************
class TreeNode<Tree> {
  Tree item;
  TreeNode<Tree> leftChild;
  TreeNode<Tree> rightChild;

  public TreeNode(Tree newItem) {
  // Initializes tree node with item and no children.
    item = newItem;
    leftChild  = null;
    rightChild = null;
  }  // end constructor

  public TreeNode(Tree newItem, TreeNode<Tree> left, TreeNode<Tree> right) {
  // Initializes tree node with item and
  // the left and right children references.
    item = newItem;
    leftChild  = left;
    rightChild = right;
  }  // end constructor

}  // end TreeNode
