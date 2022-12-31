package javaapplication12;
 
import static java.lang.Math.E;

public class javaapplication12 {
 
   private static class Node<E> {
 
       private E element; // reference to the element stored at this node
 
       private Node<E> next; // reference to the next node in the list
 
       public Node(E e, Node<E> n) {
 
           element = e;
 
           next = n;
 
       }
 
       public E getElement() {
           return element;
       }
 
       public Node<E> getNext() {
           return next;
       }
 
       public void setNext(Node<E> n) {
           next = n;
       }
 
   }
 
// instance variables of the SinglyLinkedList
   private Node<E> head = null; // head node of the list (null if empty)
 
   private Node<E> tail = null; // last node of the list (null if empty)
 
   private int size = 0; // number of nodes in the list
 
   public javaapplication12() {
  } // constructs an initially empty list
 
// access methods
   public int size() {
       return size;
   }
 
   public boolean isEmpty() {
       return size == 0;
   }
 
   public E first() { //returns (but does not remove) the first element
 
       if (isEmpty()) {
           return null;
       }
 
       return head.getElement();
 
   }
 
   public E last() { // returns (but does not remove) the last element
 
       if (isEmpty()) {
           return null;
       }
       return tail.getElement();
 
   }
 
// update methods
   public void addFirst(E e) { // adds element e to the front of the list
 
       head = new Node<>(e, head); // create and link a new node
 
       if (size == 0) {
           tail = head; // special case: new node becomes tail also
       }
       size++;
 
   }
 
   public void addLast(E e) { // adds element e to the end of the list
 
       Node<E> newest = new Node<>(e, null); //node will eventually be thetail
 
       if (isEmpty()) {
           head = newest; // special case: previously empty list
       } else {
           tail.setNext(newest); // new node after existing tail
       }
       tail = newest; // new node becomes the tail
 
       size++;
 
   }
 
   public E removeFirst() { // removes and returns the first element
 
       if (isEmpty()) {
           return null; // nothing to remove
       }
       E answer = head.getElement();
 
       head = head.getNext(); // will become null if list had only one node
 
       size--;
 
       if (size == 0) {
           tail = null; // special case as list is now empty
       }
       return answer;
 
   }
 
   public void display() {
 
       Node<E> cur = null;
 
       cur = head;
 
       System.out.println("The contents of the list are:");
 
       for (int i = 1; i <= size(); i++) {
 
           System.out.print(cur.element + " ");
 
           cur = cur.getNext();
 
       }
 
   }
 
   public static void main(String[] args) {
 
       SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
 
       list1.addFirst(4);
 
       list1.addFirst(8);
 
       list1.addLast(12);
       list1.addLast(6);
       list1.display();
       list1.removeFirst();
System.out.println();
       list1.display();
       System.out.println();
 
 
   }
 
}