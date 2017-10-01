/* SListNode.java */
package list;

/**
 *  SListNode is a class used internally by the SList class.  An SList object
 *  is a singly-linked list, and an SListNode is a node of a singly-linked
 *  list.  Each SListNode has two references:  one to an object, and one to
 *  the next node in the list.
 *
 */

public class SListNode {
  public Pixel item;
  public int num;
  public SListNode next;


  public SListNode() {
	  this.item = new Pixel();
	  this.num = 0;
	  this.next = null;
  }
  
  public SListNode(Pixel pix) {
	    this(pix, null);
	  }

  public SListNode(Pixel pix, SListNode next) {
    this.item = pix;
    this.next = next;
  }
  
  public SListNode(Pixel pix, int n) {
	  this.num = n;
	  this.item = pix;
	  this.next = null;
  }
  
  public boolean equals(SListNode node) {
	  return item.equals(node.item);
  }
}