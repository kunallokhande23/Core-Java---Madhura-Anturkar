package linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		Collections.addAll(l1, "one", "two", "three", "four", "five");
		System.out.println(l1);

		/*
		 * public E getFirst() throws NoSuchElementException if list is empty
		 * Returns the first element in this list, w/o removing it from the
		 * list,
		 */
		System.out.println("getFirst " + l1.getFirst());

		/*
		 * public E peekFirst() Retrieves, but does not remove, the head (first
		 * element) of this list. Returns null if empty list.
		 */
		System.out.println("peek first: " + l1.peekFirst());
		System.out.println("peek : " + l1.peek());

		/*
		 * public E removeFirst() Removes and returns the first element from
		 * this list.-- Throws NoSuchElementException same as remove
		 */
		System.out.println("remove first " + l1.removeFirst());
		System.out.println("remove first " + l1.removeFirst());

		/*
		 * public E pollFirst() Retrieves and removes the head (first element)
		 * of this list. Returns: the head of this list, or null if this list is
		 * empty Similar is poll. No exc thrown even if list is empty.
		 * 
		 * public E pollLast() Retrieves and removes the last element of this
		 * deque, or returns null if this deque is empty.
		 */
		System.out.println("current list " + l1);

		System.out.println("poll first " + l1.pollFirst());
		System.out.println("poll last " + l1.pollLast());
		System.out.println(l1);
		System.out.println("poll " + l1.poll());
		/*
		 * public void addFirst(E e) Inserts the element at the beginning of
		 * this list. void returning.
		 */
		l1.addFirst("six");
		l1.addFirst("seven");
		System.out.println("l1 after 2 addFirst " + l1);
		/*
		 * public boolean offer(E e) same as offerLast . Adds the specified
		 * element as the tail (last element) of this list. If u are using a
		 * fixed capacity Queue , then it can return false , if element can't be
		 * added at the end. Otherwise returns true.
		 */
		System.out.println("Offered " + l1.offer("1"));
		System.out.println("Offered " + l1.offerLast("2"));
		System.out.println("after 2 offers " + l1);

		// addLast equivalent to add(E o)
		l1.addLast("ten");
		l1.addLast("eleven");
		System.out.println("l1 after 2 addLast " + l1);
		/*
		 * public E removeLast() Removes and returns the last element from this
		 * list. Throws NoSuchElementException if list is empty
		 */
		System.out.println("removeLast " + l1.removeLast());
		System.out.println(l1);

	}

}
