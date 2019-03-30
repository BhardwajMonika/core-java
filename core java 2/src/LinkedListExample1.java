import java.util.*;
public class LinkedListExample1 {

	public static void main(String[] args) {
		//linked list declaration
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//add(String Element) is used for adding elements
		linkedlist.add("item1");
		linkedlist.add("item2");
		linkedlist.add("item5");
		linkedlist.add("item4");
		linkedlist.add("item3");
		
		//display linked list content
		System.out.println("Linked List Content: "+linkedlist);
		linkedlist.offer("item100");
		System.out.println("Linked List content:"+linkedlist);
		
		//add first and last element
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList content after addition: "
				+linkedlist);
		
		//this is how to get and set values
		Object firstvar = linkedlist.get(0);
		System.out.println("First element: " +firstvar);
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method "
				+firstvar2);
		
		//remove first and last elelment
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedLast after deletion of first and"
				+ "last element:"+linkedlist);
		
		//add to a position and remove from a position
		linkedlist.add(0,"Newly added item");
		linkedlist.remove(2);
		System.out.println("Final COntent: "+linkedlist);

	}

}
