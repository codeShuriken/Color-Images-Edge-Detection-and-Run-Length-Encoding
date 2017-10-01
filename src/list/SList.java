/* SList.java */
package list;


/**
 *  The SList class is a singly-linked implementation of the linked list
 *  abstraction.  SLists are mutable data structures, which can grow at either
 *  end.
 *
 *  @author Gowtham Vuppala
 **/

public class SList {

  private SListNode head;
  private SListNode tail;
  private int size;

  /**
   *  SList() constructs an empty list.
   **/

  public SList() {
    size = 0;
    head = null;
    tail = null;
  }

  /**
   *  isEmpty() indicates whether the list is empty.
   *  @return true if the list is empty, false otherwise.
   **/

  public boolean isEmpty() {
    return size == 0;
  }

  /**
   *  length() returns the length of this list.
   *  @return the length of this list.
   **/

  public int length() {
    return size;
  }

  /**
   *  insertFront() inserts item "pix" at the beginning of this list.
   *  @param obj the item to be inserted.
   **/

  public void insertFront(Pixel pix) {
    head = new SListNode(pix, head);
    if (tail == null) {
    	tail = head;
    }
    size++;
  }

  /**
   *  insertEnd() inserts item "pix" at the end of this list.
   *  @param pixel the item to be inserted.
   *  @n  the n0. of times the item appears 
   **/

  public void insertEnd(Pixel pixel, int n) {
	 
    if (head == null) {
      head = new SListNode(pixel, n);
      tail = head;
    } else {
    	tail.next = new SListNode(pixel, n);
    	tail = tail.next;
    }
    size++;
  }
  
  /**
   *  nth() returns the item at the specified position.  If position < 1 or
   *  position > this.length(), null is returned.  Otherwise, the item at
   *  position "position" is returned.  The list does not change.
   *  @param position the desired position, from 1 to length(), in the list.
   *  @return the item at the given position in the list.
   **/

  public Object nth(int position) {
    SListNode currentNode;

    if ((position < 1) || (head == null)) {
      return null;
    } else {
      currentNode = head;
      while (position > 1) {
        currentNode = currentNode.next;
        if (currentNode == null) {
          return null;
        }
        position--;
      }
      return currentNode.item;
    }
  } 
  
  
  public SListNode getHead() {
	  return head;
  }
  
  public void setHead(SListNode node) {
	  this.head = node;
  }
  
  
  public void remove(int position){
	  if(position <= size){
		  SListNode node = head;
		  if(position == 1){
			  node = null;
		  }else if(position == 2){
			  node.next = node.next.next;
		  }else{
			  for(int i=1; i<= position-2; i++){
				  node = node.next;
			  }
			  node.next = node.next.next;
		  }
		  
	  }
  }
  
  public Object front(){
	  if(size == 0) return null;
	  return head;
  }


  /**
   *  toString() converts the list to a String.
   *  @return a String representation of the list.
   **/

  public String toString() {
	  SListNode node = head;
	  String result = "";
	  while (node != null) {
		  result += node.num + ": " + node.item + " | ";
		  node = node.next;
	  }
	  return result;
  }
 }